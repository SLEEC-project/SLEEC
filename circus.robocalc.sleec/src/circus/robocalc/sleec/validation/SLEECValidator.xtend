/*
 * generated by Xtext 2.25.0
 */
package circus.robocalc.sleec.validation

import circus.robocalc.sleec.sLEEC.BoolComp
import circus.robocalc.sleec.sLEEC.Boolean
import circus.robocalc.sleec.sLEEC.MBoolExpr
import circus.robocalc.sleec.sLEEC.Not
import circus.robocalc.sleec.sLEEC.Numeric
import circus.robocalc.sleec.sLEEC.RelComp
import circus.robocalc.sleec.sLEEC.SLEECPackage
import circus.robocalc.sleec.sLEEC.Scale
import circus.robocalc.sleec.sLEEC.Value
import org.eclipse.xtext.validation.Check
import circus.robocalc.sleec.sLEEC.Event
import circus.robocalc.sleec.sLEEC.Measure
import circus.robocalc.sleec.sLEEC.Constant
import circus.robocalc.sleec.sLEEC.ScaleParam

/** 
 * This class contains custom validation rules. 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SLEECValidator extends AbstractSLEECValidator {
	@Check
	def checkRelCompType(RelComp e) {
		if(isScale(e.left) && isScale(e.right))
			return;
		if(!isNumeric(e.left) || !isNumeric(e.right))
			error("relational operand must have numeric type.", SLEECPackage.Literals.REL_COMP__OP, "relationalOperands")
	}
	
	@Check
	def checkBoolCompType(BoolComp e) {
		if(!isBoolean(e.left) || !isBoolean(e.right))
			error("boolean operand must have boolean type", SLEECPackage.Literals.BOOL_COMP__OP, "booleanOperands")
	}
	
	def private isNumeric(MBoolExpr e) {
		return e instanceof Value ||
			e.measure.type instanceof Numeric
	}
	
	def private isBoolean(MBoolExpr e) {
		return e instanceof Not ||
			e instanceof BoolComp ||
			e instanceof RelComp ||
			e.measure.type instanceof Boolean
	}
	
	def private isScale(MBoolExpr e) {
		return e instanceof ScaleParam ||
			e.measure.type instanceof Scale
	}
	
	@Check
	def chechEventName(Event e) {
		if(!Character.isUpperCase(e.name.charAt(0)))
			warning("Event identifier should begin with capital letter", SLEECPackage.Literals.DEFINITION__NAME, "invalidName")
	}
	
	@Check
	def checkMeasureName(Measure m) {
		if(!Character.isLowerCase(m.name.charAt(0)))
			warning("Measure identifier should begin with lower case letter", SLEECPackage.Literals.DEFINITION__NAME, "invalidName")
	}
	
	@Check
	def checkContantName(Constant c) {
		for(var i = 0; i < c.name.length; i++) {
			if(Character.isLowerCase(c.name.charAt(i))) {
				warning("Constant identifier should be in all capitals.", SLEECPackage.Literals.DEFINITION__NAME, "invalidName")
			}
		}
	}
}
