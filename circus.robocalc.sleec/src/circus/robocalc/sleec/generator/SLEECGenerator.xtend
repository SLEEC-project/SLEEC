/*
 * generated by Xtext 2.25.0
 */
package circus.robocalc.sleec.generator

import circus.robocalc.sleec.sLEEC.Atom
import circus.robocalc.sleec.sLEEC.BoolComp
import circus.robocalc.sleec.sLEEC.BoolValue
import circus.robocalc.sleec.sLEEC.Boolean
import circus.robocalc.sleec.sLEEC.Constant
import circus.robocalc.sleec.sLEEC.Defeater
import circus.robocalc.sleec.sLEEC.Definition
import circus.robocalc.sleec.sLEEC.Event
import circus.robocalc.sleec.sLEEC.MBoolExpr
import circus.robocalc.sleec.sLEEC.Measure
import circus.robocalc.sleec.sLEEC.Not
import circus.robocalc.sleec.sLEEC.Numeric
import circus.robocalc.sleec.sLEEC.RelComp
import circus.robocalc.sleec.sLEEC.Response
import circus.robocalc.sleec.sLEEC.Rule
import circus.robocalc.sleec.sLEEC.Scale
import circus.robocalc.sleec.sLEEC.TimeUnit
import circus.robocalc.sleec.sLEEC.Trigger
import circus.robocalc.sleec.sLEEC.Type
import circus.robocalc.sleec.sLEEC.Value
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SLEECGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile(
			resource.getURI().trimFileExtension().lastSegment() + '.csp', '''
			include "ticktock.csp"
			
			Timed(et) {
				
			«resource.allContents
				.filter(Definition)
				.toIterable
				.map[D]
				.join('')»
			
			«resource.allContents
				.filter(Rule)
				.toIterable
				.map[ rule | show(rule) + '\n' + R(rule) ]
				.join('')»
			}
		''')
	}
	
	// -----------------------------------------------------------
	
	private def D(Definition d) {
		switch d {
			// [[event eID]]D
			Event : '''
				channel «d.name»
			'''
			// [[measure mID : T]]D
			Measure : '''
				channel «d.name» : «T(d.type, d.name)»
			'''
			// constant cID = v]]D
			Constant : '''
				«d.name» = «norm(d.value)»
			'''
		}
	}
	
	private def T(Type t, String mID) {
		switch t {
			Boolean : 'Bool'
			Numeric : 'Int'
			Scale : '''
				ST«mID»
				
				datatype ST«mID» = «t.scaleParams.join(" | ")»
				
				STle«mID»(v1«mID», v2«mID») =
					if v1«mID» == «t.scaleParams.head» then true
					«(1 ..< t.scaleParams.size - 1).map[
						'''else (if v1«mID» == «t.scaleParams.get(it)» then not member(v2«mID»,{«t.scaleParams.take(it).join(', ')»})'''
					].join('\n')»
					else v2«mID» == «t.scaleParams.last»«')'.repeat(t.scaleParams.size-2)»
			'''
		}
	}
	
	// -----------------------------------------------------------

	private def R(Rule r) {
		val rID = r.name
		val trig = r.trigger
		val resp = r.response
		val dfts = r.defeaters
		
		// [[rID when trig then resp dfts]]R
		'''
		«rID» = Trigger«rID»; Monitoring«rID»; «rID»
		
		Trigger«rID» = «TG(trig, 'SKIP', 'Trigger'+rID)»
		
		Monitoring«rID» = «RDS(resp, dfts, trig, alpha(resp) + dfts.flatMap[ alpha(it) ], 'Monitoring'+rID)»
		
		'''
	}

	// -----------------------------------------------------------
	
	private def TG(Trigger trig, String sp, String fp) {
		val eID = trig.event.name
		val mBE = trig.expr
		
		// [[eID,sp,fp]]TG
		if(mBE === null) '''
			«eID» -> «sp»
		'''
		
		// [[eID and mBE,sp,fp]]TG
		else '''
			let
				MTrigger = «ME(alpha(mBE), mBE, sp, fp)»
			within «eID» -> MTrigger
		'''
	}
	
	private def CharSequence ME(List<String> mIDs, MBoolExpr mBE, String sp, String fp) {
		// this removes the first element from mIDs
		 val mID = mIDs.head
		
		// [[<>,mBE,sp,fp]]ME
		if(mID === null) '''
			if «norm(mBE)» then «sp» else «fp»
		'''
			
		// [[<mID>^mIDs,mBE[vmID/mID],sp,fp]]ME
		else '''
			StartBy(«mID»?v«mID» ->
				«ME(mIDs.subList(1, mIDs.size), replace(mBE, 'v'+mID, mID), sp, fp)»
			,0)
		'''
	}
	
	// -----------------------------------------------------------
	
	private def RDS(Response resp, Iterable<Defeater> dfts, Trigger t, Iterable<String> ARDS, String mp) {
		// [[resp,trig,ARDS,mp]]RDS
		if(dfts.isEmpty)
			RP(resp)
		
		// [[resp dfts,trig,ARDS,mp]]RDS
		else '''
			let
				«LRDS(resp, dfts, t, ARDS, mp, 1)»
			within «CDS(dfts.flatMap[alpha], dfts, dfts.size+1)»
		'''
	}
		
	// -----------------------------------------------------------
	
	private def CharSequence RP(Response r) {
		val eID = r.event.name
		val v = r.value
		val tU = r.unit
		val resp = r.response
		// time units are not in the grammar, so they are not in th translation rules 
		
		// [[not eID within v tU]]
		if(r.not) 
			'''WAIT(«norm(v, tU)»)'''
		
		// [[eID]]RP
		else if(v === null)
			'''«eID» -> SKIP'''
		
		// [[eID within v tU]]RP
		else if(resp === null)
			'''StartBy(«eID» -> SKIP,«norm(v, tU)»)'''
		
		// [[eID within v tU otherwise resp]]RP
		else
			'''TimedInterrupt(«eID» -> SKIP,«norm(v, tU)»,«RP(resp)»)'''
	}
	
	// -----------------------------------------------------------
	
	private def LRDS(Response resp, Trigger trig, Iterable<String> AR, String mp, Integer n) {
		// [[<resp>,trig,AR,mp,n]]
		// assuming RP is used instead of R as the argument is a response
		if(resp !== null) '''
			Monitoring«n» = «RP(resp)»
		'''
		
		// [[<SKIP>,trig,AR,mp,n]]
		else '''
			Monitoring«n» = «TG(trig, mp, '''Monitoring«n»''')»
			«AR.map[ '''	[] «it»?x -> Monitoring«n»''' ].join('\n')»
		'''
	}
	
	// [[<resp>^resps,trig,AR,mp,n]]LRDS
	private def CharSequence LRDS(Response resp, Iterable<Defeater> dfts, Trigger trig, Iterable<String> AR, String mp, Integer n) '''
		«LRDS(resp, trig, AR, mp, n)»
		«if(!dfts.isEmpty)
			LRDS(dfts.head.response, dfts.tail, trig, AR, mp, n+1)»
	'''

	// -----------------------------------------------------------	
	
	private def CharSequence CDS(Iterable<String> mIDs, Iterable<Defeater> dfts, Integer n) {
		// [[<>,dfts,n]]CDS
		if(mIDs.isEmpty)
			return EDS(dfts, 'Monitoring1', n)
		
		// [[<mID>^mIDs,dfts,n]]CDS
		val mID = mIDs.head
		'''
		StartBy(«mID»?v«mID» ->
			«CDS(mIDs.tail, dfts.map[ replace(it, 'v'+mID, mID) ], n)»
		,0)
		'''
	}
	
	// [[unless mBE,fp,n]]EDS
	// [[unless mBE then resp,fp,n]]EDS
	private def EDS(Defeater dft, CharSequence fp, Integer n) {
		val mBE = dft.expr
		'''
		if «norm(mBE)» then Monitoring«n»
		else («fp»)'''
	}
	
	// [[dfts dft,fp,n]]EDS
	private def CharSequence EDS(Iterable<Defeater> dfts, CharSequence fp, Integer n) {
		if(dfts.isEmpty)
			fp
		else
			EDS(dfts.head, EDS(dfts.tail, fp, n-1), n)
	}
	
	// -----------------------------------------------------------
	
	// helper functions used in the translation rules:
	
	// Returns a list of all the MeasureIds in AST
	private def <T extends EObject> List<String> alpha(T AST) {
		// eAllContents does not include the root of the tree
		// so this will return an empty list if AST is an instance of Atom, which is an error
		// so first check that AST is an instance of atom
		if(AST instanceof Atom)
			// create a 1 element list with the atom's measureID
			Collections.singleton((AST as Atom).measureID).toList
		else
			AST.eAllContents
				.filter(Atom)
				.map[measureID]
				.toList
	}
	
	// return an MBoolExpr as a string using CSP operators
	// NOTE this may also convert time if time units are added to the grammar
	private def CharSequence norm(MBoolExpr mBE) {
		'(' + switch(mBE) {
			BoolComp : norm(mBE as BoolComp)
			Not : norm(mBE as Not)
			RelComp : norm(mBE as RelComp)
			Atom : norm(mBE as Atom)
			Value : norm(mBE as Value)
			BoolValue : norm(mBE as BoolValue)
		} + ')'
	}
	
	private def norm(BoolComp b) {
		norm(b.left) + switch(b.op) {
			case AND : ' and '
			case OR : ' or '
		} + norm(b.right)
	}
	
	private def norm(Not n) {	
		// no need to check that n.expr is null
		'not ' + norm(n.expr)
	}
	
	private def norm(RelComp r) {
		norm(r.left) + switch(r.op) {
			case LESS_THAN : ' < '
			case GREATER_THAN : ' > '
			case NOT_EQUAL : ' != '
			case LESS_EQUAL : ' <= '
			case GREATER_EQUAL : ' >= '
			case EQUAL : ' == '
		} + norm(r.right)
	}
	
	private def norm(Atom a) {
		a.measureID
	}
	
	private def CharSequence norm(Value v) {
		if(v.constant === null)
			v.value.toString
		else
			norm(v.constant.value)
	}
	
	private def norm(BoolValue b) {
		b.value.toString
	}
	
	// Convert value to seconds.
	// NOTE the standard unit may need to be changed from seconds depending on the implementation.
	private def norm(Value v, TimeUnit tU)
		'''(«norm(v)» * «norm(tU)»)'''
		
	private def Integer norm(TimeUnit tU) {
		switch(tU) {
			case SECONDS : 1
			case MINUTES : 60
			case HOURS : 60 * norm(TimeUnit.MINUTES)
			case DAYS : 24 * norm(TimeUnit.HOURS)
		}
	}
	
	// replace each MeasureID in the AST with 'vmID'
	private def <T extends EObject> replace(T AST, String vmID, String mID) {
		val res = AST
		if(res instanceof Atom)
			res.measureID = vmID
		else
			res.eAllContents
				.filter(Atom)
				.filter[ it.measureID == mID ]
				.forEach[ it.measureID = vmID ]
		return res
	}
	
	// -----------------------------------------------------------
	
	// functions used for AST printing TODO this could be done during serialisation
	
	private def CharSequence show(Rule r) '''
		-- «r.name» when «show(r.trigger)» then «show(r.response)»«r.defeaters.map[show].join('')»
	'''

	private def show(Trigger t) {
		t.event.name + if (t.expr === null)
			''
		else
			' and ' + norm(t.expr)
	}

	private def CharSequence show(Response r) {
		if (r.not)
			'not ' + r.event.name + ' within ' + norm(r.value) + ' ' + show(r.unit)
		else
			r.event.name + if (r.value === null)
				''
			else 
				'within ' + norm(r.value) + ' ' + show(r.unit) + if(r.response === null)
					''
				else
					'\n-- otherwise ' + show(r.response)
	}
	
	private def show(TimeUnit t) {
		switch(t) {
			case SECONDS: 'seconds'
			case MINUTES: 'minutes'
			case HOURS: 'hours'
			case DAYS: 'days'
		}
	}
	
	private def show(Defeater d) {
		'\n-- unless ' + norm(d.expr) + if(d.response === null)
			''
		else
			' then ' + show(d.response)
	}
}
