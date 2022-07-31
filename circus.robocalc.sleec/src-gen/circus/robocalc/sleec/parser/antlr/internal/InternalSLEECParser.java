package circus.robocalc.sleec.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import circus.robocalc.sleec.services.SLEECGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSLEECParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def_start'", "'def_end'", "'event'", "'measure'", "':'", "'constant'", "'='", "'boolean'", "'numeric'", "'scale'", "'('", "','", "')'", "'rule_start'", "'rule_end'", "'when'", "'then'", "'and'", "'not'", "'within'", "'otherwise'", "'unless'", "'.'", "'<'", "'>'", "'<>'", "'<='", "'>='", "'or'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_FLOAT=6;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSLEECParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSLEECParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSLEECParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSLEEC.g"; }



     	private SLEECGrammarAccess grammarAccess;

        public InternalSLEECParser(TokenStream input, SLEECGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Specification";
       	}

       	@Override
       	protected SLEECGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSpecification"
    // InternalSLEEC.g:65:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalSLEEC.g:65:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalSLEEC.g:66:2: iv_ruleSpecification= ruleSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalSLEEC.g:72:1: ruleSpecification returns [EObject current=null] : ( ( (lv_defBlock_0_0= ruleDefblock ) ) ( (lv_ruleBlock_1_0= ruleRuleBlock ) ) ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_defBlock_0_0 = null;

        EObject lv_ruleBlock_1_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:78:2: ( ( ( (lv_defBlock_0_0= ruleDefblock ) ) ( (lv_ruleBlock_1_0= ruleRuleBlock ) ) ) )
            // InternalSLEEC.g:79:2: ( ( (lv_defBlock_0_0= ruleDefblock ) ) ( (lv_ruleBlock_1_0= ruleRuleBlock ) ) )
            {
            // InternalSLEEC.g:79:2: ( ( (lv_defBlock_0_0= ruleDefblock ) ) ( (lv_ruleBlock_1_0= ruleRuleBlock ) ) )
            // InternalSLEEC.g:80:3: ( (lv_defBlock_0_0= ruleDefblock ) ) ( (lv_ruleBlock_1_0= ruleRuleBlock ) )
            {
            // InternalSLEEC.g:80:3: ( (lv_defBlock_0_0= ruleDefblock ) )
            // InternalSLEEC.g:81:4: (lv_defBlock_0_0= ruleDefblock )
            {
            // InternalSLEEC.g:81:4: (lv_defBlock_0_0= ruleDefblock )
            // InternalSLEEC.g:82:5: lv_defBlock_0_0= ruleDefblock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecificationAccess().getDefBlockDefblockParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_defBlock_0_0=ruleDefblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSpecificationRule());
              					}
              					set(
              						current,
              						"defBlock",
              						lv_defBlock_0_0,
              						"circus.robocalc.sleec.SLEEC.Defblock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSLEEC.g:99:3: ( (lv_ruleBlock_1_0= ruleRuleBlock ) )
            // InternalSLEEC.g:100:4: (lv_ruleBlock_1_0= ruleRuleBlock )
            {
            // InternalSLEEC.g:100:4: (lv_ruleBlock_1_0= ruleRuleBlock )
            // InternalSLEEC.g:101:5: lv_ruleBlock_1_0= ruleRuleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecificationAccess().getRuleBlockRuleBlockParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ruleBlock_1_0=ruleRuleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSpecificationRule());
              					}
              					set(
              						current,
              						"ruleBlock",
              						lv_ruleBlock_1_0,
              						"circus.robocalc.sleec.SLEEC.RuleBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleDefblock"
    // InternalSLEEC.g:122:1: entryRuleDefblock returns [EObject current=null] : iv_ruleDefblock= ruleDefblock EOF ;
    public final EObject entryRuleDefblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefblock = null;


        try {
            // InternalSLEEC.g:122:49: (iv_ruleDefblock= ruleDefblock EOF )
            // InternalSLEEC.g:123:2: iv_ruleDefblock= ruleDefblock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefblockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefblock=ruleDefblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefblock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefblock"


    // $ANTLR start "ruleDefblock"
    // InternalSLEEC.g:129:1: ruleDefblock returns [EObject current=null] : (otherlv_0= 'def_start' ( (lv_definitions_1_0= ruleDefinition ) )+ otherlv_2= 'def_end' ) ;
    public final EObject ruleDefblock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_definitions_1_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:135:2: ( (otherlv_0= 'def_start' ( (lv_definitions_1_0= ruleDefinition ) )+ otherlv_2= 'def_end' ) )
            // InternalSLEEC.g:136:2: (otherlv_0= 'def_start' ( (lv_definitions_1_0= ruleDefinition ) )+ otherlv_2= 'def_end' )
            {
            // InternalSLEEC.g:136:2: (otherlv_0= 'def_start' ( (lv_definitions_1_0= ruleDefinition ) )+ otherlv_2= 'def_end' )
            // InternalSLEEC.g:137:3: otherlv_0= 'def_start' ( (lv_definitions_1_0= ruleDefinition ) )+ otherlv_2= 'def_end'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefblockAccess().getDef_startKeyword_0());
              		
            }
            // InternalSLEEC.g:141:3: ( (lv_definitions_1_0= ruleDefinition ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSLEEC.g:142:4: (lv_definitions_1_0= ruleDefinition )
            	    {
            	    // InternalSLEEC.g:142:4: (lv_definitions_1_0= ruleDefinition )
            	    // InternalSLEEC.g:143:5: lv_definitions_1_0= ruleDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDefblockAccess().getDefinitionsDefinitionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_definitions_1_0=ruleDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDefblockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"definitions",
            	      						lv_definitions_1_0,
            	      						"circus.robocalc.sleec.SLEEC.Definition");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDefblockAccess().getDef_endKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefblock"


    // $ANTLR start "entryRuleDefinition"
    // InternalSLEEC.g:168:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalSLEEC.g:168:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalSLEEC.g:169:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalSLEEC.g:175:1: ruleDefinition returns [EObject current=null] : (this_Event_0= ruleEvent | this_Measure_1= ruleMeasure | this_Constant_2= ruleConstant ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Event_0 = null;

        EObject this_Measure_1 = null;

        EObject this_Constant_2 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:181:2: ( (this_Event_0= ruleEvent | this_Measure_1= ruleMeasure | this_Constant_2= ruleConstant ) )
            // InternalSLEEC.g:182:2: (this_Event_0= ruleEvent | this_Measure_1= ruleMeasure | this_Constant_2= ruleConstant )
            {
            // InternalSLEEC.g:182:2: (this_Event_0= ruleEvent | this_Measure_1= ruleMeasure | this_Constant_2= ruleConstant )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSLEEC.g:183:3: this_Event_0= ruleEvent
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getEventParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Event_0=ruleEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Event_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:192:3: this_Measure_1= ruleMeasure
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getMeasureParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Measure_1=ruleMeasure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Measure_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:201:3: this_Constant_2= ruleConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getConstantParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Constant_2=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Constant_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleEvent"
    // InternalSLEEC.g:213:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalSLEEC.g:213:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalSLEEC.g:214:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalSLEEC.g:220:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSLEEC.g:226:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSLEEC.g:227:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSLEEC.g:227:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSLEEC.g:228:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
              		
            }
            // InternalSLEEC.g:232:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSLEEC.g:233:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSLEEC.g:233:4: (lv_name_1_0= RULE_ID )
            // InternalSLEEC.g:234:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEventRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleMeasure"
    // InternalSLEEC.g:254:1: entryRuleMeasure returns [EObject current=null] : iv_ruleMeasure= ruleMeasure EOF ;
    public final EObject entryRuleMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasure = null;


        try {
            // InternalSLEEC.g:254:48: (iv_ruleMeasure= ruleMeasure EOF )
            // InternalSLEEC.g:255:2: iv_ruleMeasure= ruleMeasure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMeasureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMeasure=ruleMeasure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMeasure; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // InternalSLEEC.g:261:1: ruleMeasure returns [EObject current=null] : (otherlv_0= 'measure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:267:2: ( (otherlv_0= 'measure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalSLEEC.g:268:2: (otherlv_0= 'measure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalSLEEC.g:268:2: (otherlv_0= 'measure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalSLEEC.g:269:3: otherlv_0= 'measure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMeasureAccess().getMeasureKeyword_0());
              		
            }
            // InternalSLEEC.g:273:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSLEEC.g:274:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSLEEC.g:274:4: (lv_name_1_0= RULE_ID )
            // InternalSLEEC.g:275:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMeasureAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMeasureRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMeasureAccess().getColonKeyword_2());
              		
            }
            // InternalSLEEC.g:295:3: ( (lv_type_3_0= ruleType ) )
            // InternalSLEEC.g:296:4: (lv_type_3_0= ruleType )
            {
            // InternalSLEEC.g:296:4: (lv_type_3_0= ruleType )
            // InternalSLEEC.g:297:5: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMeasureAccess().getTypeTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMeasureRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"circus.robocalc.sleec.SLEEC.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRuleConstant"
    // InternalSLEEC.g:318:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalSLEEC.g:318:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalSLEEC.g:319:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalSLEEC.g:325:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:331:2: ( (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) )
            // InternalSLEEC.g:332:2: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            {
            // InternalSLEEC.g:332:2: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            // InternalSLEEC.g:333:3: otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstantKeyword_0());
              		
            }
            // InternalSLEEC.g:337:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSLEEC.g:338:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSLEEC.g:338:4: (lv_name_1_0= RULE_ID )
            // InternalSLEEC.g:339:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstantRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalSLEEC.g:359:3: ( (lv_value_3_0= ruleValue ) )
            // InternalSLEEC.g:360:4: (lv_value_3_0= ruleValue )
            {
            // InternalSLEEC.g:360:4: (lv_value_3_0= ruleValue )
            // InternalSLEEC.g:361:5: lv_value_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstantAccess().getValueValueParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstantRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"circus.robocalc.sleec.SLEEC.Value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleValue"
    // InternalSLEEC.g:382:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalSLEEC.g:382:46: (iv_ruleValue= ruleValue EOF )
            // InternalSLEEC.g:383:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalSLEEC.g:389:1: ruleValue returns [EObject current=null] : ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_float_1_0= RULE_FLOAT ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_int_0_0=null;
        Token lv_float_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSLEEC.g:395:2: ( ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_float_1_0= RULE_FLOAT ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSLEEC.g:396:2: ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_float_1_0= RULE_FLOAT ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSLEEC.g:396:2: ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_float_1_0= RULE_FLOAT ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSLEEC.g:397:3: ( (lv_int_0_0= RULE_INT ) )
                    {
                    // InternalSLEEC.g:397:3: ( (lv_int_0_0= RULE_INT ) )
                    // InternalSLEEC.g:398:4: (lv_int_0_0= RULE_INT )
                    {
                    // InternalSLEEC.g:398:4: (lv_int_0_0= RULE_INT )
                    // InternalSLEEC.g:399:5: lv_int_0_0= RULE_INT
                    {
                    lv_int_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_int_0_0, grammarAccess.getValueAccess().getIntINTTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getValueRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"int",
                      						lv_int_0_0,
                      						"org.eclipse.xtext.common.Terminals.INT");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:416:3: ( (lv_float_1_0= RULE_FLOAT ) )
                    {
                    // InternalSLEEC.g:416:3: ( (lv_float_1_0= RULE_FLOAT ) )
                    // InternalSLEEC.g:417:4: (lv_float_1_0= RULE_FLOAT )
                    {
                    // InternalSLEEC.g:417:4: (lv_float_1_0= RULE_FLOAT )
                    // InternalSLEEC.g:418:5: lv_float_1_0= RULE_FLOAT
                    {
                    lv_float_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_float_1_0, grammarAccess.getValueAccess().getFloatFLOATTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getValueRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"float",
                      						lv_float_1_0,
                      						"circus.robocalc.sleec.SLEEC.FLOAT");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:435:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalSLEEC.g:435:3: ( (otherlv_2= RULE_ID ) )
                    // InternalSLEEC.g:436:4: (otherlv_2= RULE_ID )
                    {
                    // InternalSLEEC.g:436:4: (otherlv_2= RULE_ID )
                    // InternalSLEEC.g:437:5: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getValueRule());
                      					}
                      				
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getValueAccess().getValueConstantCrossReference_2_0());
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleType"
    // InternalSLEEC.g:452:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSLEEC.g:452:45: (iv_ruleType= ruleType EOF )
            // InternalSLEEC.g:453:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSLEEC.g:459:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_scaleParams_7_0 = null;

        EObject lv_scaleParams_9_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:465:2: ( ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')' ) ) )
            // InternalSLEEC.g:466:2: ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')' ) )
            {
            // InternalSLEEC.g:466:2: ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSLEEC.g:467:3: ( () otherlv_1= 'boolean' )
                    {
                    // InternalSLEEC.g:467:3: ( () otherlv_1= 'boolean' )
                    // InternalSLEEC.g:468:4: () otherlv_1= 'boolean'
                    {
                    // InternalSLEEC.g:468:4: ()
                    // InternalSLEEC.g:469:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getBooleanAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getBooleanKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:481:3: ( () otherlv_3= 'numeric' )
                    {
                    // InternalSLEEC.g:481:3: ( () otherlv_3= 'numeric' )
                    // InternalSLEEC.g:482:4: () otherlv_3= 'numeric'
                    {
                    // InternalSLEEC.g:482:4: ()
                    // InternalSLEEC.g:483:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getNumericAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getNumericKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:495:3: ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')' )
                    {
                    // InternalSLEEC.g:495:3: ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')' )
                    // InternalSLEEC.g:496:4: () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')'
                    {
                    // InternalSLEEC.g:496:4: ()
                    // InternalSLEEC.g:497:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getScaleAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getScaleKeyword_2_1());
                      			
                    }
                    otherlv_6=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2());
                      			
                    }
                    // InternalSLEEC.g:511:4: ( (lv_scaleParams_7_0= ruleScaleParam ) )
                    // InternalSLEEC.g:512:5: (lv_scaleParams_7_0= ruleScaleParam )
                    {
                    // InternalSLEEC.g:512:5: (lv_scaleParams_7_0= ruleScaleParam )
                    // InternalSLEEC.g:513:6: lv_scaleParams_7_0= ruleScaleParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeAccess().getScaleParamsScaleParamParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_scaleParams_7_0=ruleScaleParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeRule());
                      						}
                      						add(
                      							current,
                      							"scaleParams",
                      							lv_scaleParams_7_0,
                      							"circus.robocalc.sleec.SLEEC.ScaleParam");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSLEEC.g:530:4: (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==23) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSLEEC.g:531:5: otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getCommaKeyword_2_4_0());
                    	      				
                    	    }
                    	    // InternalSLEEC.g:535:5: ( (lv_scaleParams_9_0= ruleScaleParam ) )
                    	    // InternalSLEEC.g:536:6: (lv_scaleParams_9_0= ruleScaleParam )
                    	    {
                    	    // InternalSLEEC.g:536:6: (lv_scaleParams_9_0= ruleScaleParam )
                    	    // InternalSLEEC.g:537:7: lv_scaleParams_9_0= ruleScaleParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTypeAccess().getScaleParamsScaleParamParserRuleCall_2_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_scaleParams_9_0=ruleScaleParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTypeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"scaleParams",
                    	      								lv_scaleParams_9_0,
                    	      								"circus.robocalc.sleec.SLEEC.ScaleParam");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleScaleParam"
    // InternalSLEEC.g:564:1: entryRuleScaleParam returns [EObject current=null] : iv_ruleScaleParam= ruleScaleParam EOF ;
    public final EObject entryRuleScaleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleParam = null;


        try {
            // InternalSLEEC.g:564:51: (iv_ruleScaleParam= ruleScaleParam EOF )
            // InternalSLEEC.g:565:2: iv_ruleScaleParam= ruleScaleParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScaleParamRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScaleParam=ruleScaleParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScaleParam; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScaleParam"


    // $ANTLR start "ruleScaleParam"
    // InternalSLEEC.g:571:1: ruleScaleParam returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleScaleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSLEEC.g:577:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSLEEC.g:578:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSLEEC.g:578:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSLEEC.g:579:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSLEEC.g:579:3: (lv_name_0_0= RULE_ID )
            // InternalSLEEC.g:580:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getScaleParamAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getScaleParamRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScaleParam"


    // $ANTLR start "entryRuleRuleBlock"
    // InternalSLEEC.g:599:1: entryRuleRuleBlock returns [EObject current=null] : iv_ruleRuleBlock= ruleRuleBlock EOF ;
    public final EObject entryRuleRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBlock = null;


        try {
            // InternalSLEEC.g:599:50: (iv_ruleRuleBlock= ruleRuleBlock EOF )
            // InternalSLEEC.g:600:2: iv_ruleRuleBlock= ruleRuleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleBlock=ruleRuleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleBlock"


    // $ANTLR start "ruleRuleBlock"
    // InternalSLEEC.g:606:1: ruleRuleBlock returns [EObject current=null] : (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' ) ;
    public final EObject ruleRuleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:612:2: ( (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' ) )
            // InternalSLEEC.g:613:2: (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' )
            {
            // InternalSLEEC.g:613:2: (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' )
            // InternalSLEEC.g:614:3: otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRuleBlockAccess().getRule_startKeyword_0());
              		
            }
            // InternalSLEEC.g:618:3: ( (lv_rules_1_0= ruleRule ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSLEEC.g:619:4: (lv_rules_1_0= ruleRule )
            	    {
            	    // InternalSLEEC.g:619:4: (lv_rules_1_0= ruleRule )
            	    // InternalSLEEC.g:620:5: lv_rules_1_0= ruleRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRuleBlockAccess().getRulesRuleParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_rules_1_0=ruleRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRuleBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rules",
            	      						lv_rules_1_0,
            	      						"circus.robocalc.sleec.SLEEC.Rule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_2=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRuleBlockAccess().getRule_endKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleBlock"


    // $ANTLR start "entryRuleRule"
    // InternalSLEEC.g:645:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalSLEEC.g:645:45: (iv_ruleRule= ruleRule EOF )
            // InternalSLEEC.g:646:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalSLEEC.g:652:1: ruleRule returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_trigger_2_0 = null;

        EObject lv_response_4_0 = null;

        EObject lv_defeaters_5_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:658:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* ) )
            // InternalSLEEC.g:659:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* )
            {
            // InternalSLEEC.g:659:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* )
            // InternalSLEEC.g:660:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )*
            {
            // InternalSLEEC.g:660:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalSLEEC.g:661:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalSLEEC.g:661:4: (lv_name_0_0= ruleQualifiedName )
            // InternalSLEEC.g:662:5: lv_name_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRuleAccess().getNameQualifiedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRuleRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"circus.robocalc.sleec.SLEEC.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getWhenKeyword_1());
              		
            }
            // InternalSLEEC.g:683:3: ( (lv_trigger_2_0= ruleTrigger ) )
            // InternalSLEEC.g:684:4: (lv_trigger_2_0= ruleTrigger )
            {
            // InternalSLEEC.g:684:4: (lv_trigger_2_0= ruleTrigger )
            // InternalSLEEC.g:685:5: lv_trigger_2_0= ruleTrigger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRuleAccess().getTriggerTriggerParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_trigger_2_0=ruleTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRuleRule());
              					}
              					set(
              						current,
              						"trigger",
              						lv_trigger_2_0,
              						"circus.robocalc.sleec.SLEEC.Trigger");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getThenKeyword_3());
              		
            }
            // InternalSLEEC.g:706:3: ( (lv_response_4_0= ruleResponse ) )
            // InternalSLEEC.g:707:4: (lv_response_4_0= ruleResponse )
            {
            // InternalSLEEC.g:707:4: (lv_response_4_0= ruleResponse )
            // InternalSLEEC.g:708:5: lv_response_4_0= ruleResponse
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRuleAccess().getResponseResponseParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_response_4_0=ruleResponse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRuleRule());
              					}
              					set(
              						current,
              						"response",
              						lv_response_4_0,
              						"circus.robocalc.sleec.SLEEC.Response");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSLEEC.g:725:3: ( (lv_defeaters_5_0= ruleDefeater ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSLEEC.g:726:4: (lv_defeaters_5_0= ruleDefeater )
            	    {
            	    // InternalSLEEC.g:726:4: (lv_defeaters_5_0= ruleDefeater )
            	    // InternalSLEEC.g:727:5: lv_defeaters_5_0= ruleDefeater
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRuleAccess().getDefeatersDefeaterParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_defeaters_5_0=ruleDefeater();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"defeaters",
            	      						lv_defeaters_5_0,
            	      						"circus.robocalc.sleec.SLEEC.Defeater");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleTrigger"
    // InternalSLEEC.g:748:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalSLEEC.g:748:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalSLEEC.g:749:2: iv_ruleTrigger= ruleTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalSLEEC.g:755:1: ruleTrigger returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:761:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? ) )
            // InternalSLEEC.g:762:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? )
            {
            // InternalSLEEC.g:762:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? )
            // InternalSLEEC.g:763:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )?
            {
            // InternalSLEEC.g:763:3: ( (otherlv_0= RULE_ID ) )
            // InternalSLEEC.g:764:4: (otherlv_0= RULE_ID )
            {
            // InternalSLEEC.g:764:4: (otherlv_0= RULE_ID )
            // InternalSLEEC.g:765:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTriggerRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getEventEventCrossReference_0_0());
              				
            }

            }


            }

            // InternalSLEEC.g:776:3: (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSLEEC.g:777:4: otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) )
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getAndKeyword_1_0());
                      			
                    }
                    // InternalSLEEC.g:781:4: ( (lv_expr_2_0= ruleMBoolExpr ) )
                    // InternalSLEEC.g:782:5: (lv_expr_2_0= ruleMBoolExpr )
                    {
                    // InternalSLEEC.g:782:5: (lv_expr_2_0= ruleMBoolExpr )
                    // InternalSLEEC.g:783:6: lv_expr_2_0= ruleMBoolExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTriggerAccess().getExprMBoolExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=ruleMBoolExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTriggerRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_2_0,
                      							"circus.robocalc.sleec.SLEEC.MBoolExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleMBoolExpr"
    // InternalSLEEC.g:805:1: entryRuleMBoolExpr returns [EObject current=null] : iv_ruleMBoolExpr= ruleMBoolExpr EOF ;
    public final EObject entryRuleMBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMBoolExpr = null;


        try {
            // InternalSLEEC.g:805:50: (iv_ruleMBoolExpr= ruleMBoolExpr EOF )
            // InternalSLEEC.g:806:2: iv_ruleMBoolExpr= ruleMBoolExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMBoolExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMBoolExpr=ruleMBoolExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMBoolExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMBoolExpr"


    // $ANTLR start "ruleMBoolExpr"
    // InternalSLEEC.g:812:1: ruleMBoolExpr returns [EObject current=null] : this_BoolComp_0= ruleBoolComp ;
    public final EObject ruleMBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject this_BoolComp_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:818:2: (this_BoolComp_0= ruleBoolComp )
            // InternalSLEEC.g:819:2: this_BoolComp_0= ruleBoolComp
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getMBoolExprAccess().getBoolCompParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_BoolComp_0=ruleBoolComp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_BoolComp_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMBoolExpr"


    // $ANTLR start "entryRuleBoolComp"
    // InternalSLEEC.g:830:1: entryRuleBoolComp returns [EObject current=null] : iv_ruleBoolComp= ruleBoolComp EOF ;
    public final EObject entryRuleBoolComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolComp = null;


        try {
            // InternalSLEEC.g:830:49: (iv_ruleBoolComp= ruleBoolComp EOF )
            // InternalSLEEC.g:831:2: iv_ruleBoolComp= ruleBoolComp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolCompRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolComp=ruleBoolComp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolComp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolComp"


    // $ANTLR start "ruleBoolComp"
    // InternalSLEEC.g:837:1: ruleBoolComp returns [EObject current=null] : (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* ) ;
    public final EObject ruleBoolComp() throws RecognitionException {
        EObject current = null;

        EObject this_Not_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:843:2: ( (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* ) )
            // InternalSLEEC.g:844:2: (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* )
            {
            // InternalSLEEC.g:844:2: (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* )
            // InternalSLEEC.g:845:3: this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBoolCompAccess().getNotParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_Not_0=ruleNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Not_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSLEEC.g:853:3: ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29||LA9_0==40) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSLEEC.g:854:4: () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) )
            	    {
            	    // InternalSLEEC.g:854:4: ()
            	    // InternalSLEEC.g:855:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBoolCompAccess().getBoolCompLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSLEEC.g:861:4: ( (lv_op_2_0= ruleBoolOp ) )
            	    // InternalSLEEC.g:862:5: (lv_op_2_0= ruleBoolOp )
            	    {
            	    // InternalSLEEC.g:862:5: (lv_op_2_0= ruleBoolOp )
            	    // InternalSLEEC.g:863:6: lv_op_2_0= ruleBoolOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBoolCompAccess().getOpBoolOpEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_op_2_0=ruleBoolOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBoolCompRule());
            	      						}
            	      						set(
            	      							current,
            	      							"op",
            	      							lv_op_2_0,
            	      							"circus.robocalc.sleec.SLEEC.BoolOp");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalSLEEC.g:880:4: ( (lv_right_3_0= ruleNot ) )
            	    // InternalSLEEC.g:881:5: (lv_right_3_0= ruleNot )
            	    {
            	    // InternalSLEEC.g:881:5: (lv_right_3_0= ruleNot )
            	    // InternalSLEEC.g:882:6: lv_right_3_0= ruleNot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBoolCompAccess().getRightNotParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleNot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBoolCompRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"circus.robocalc.sleec.SLEEC.Not");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolComp"


    // $ANTLR start "entryRuleNot"
    // InternalSLEEC.g:904:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalSLEEC.g:904:44: (iv_ruleNot= ruleNot EOF )
            // InternalSLEEC.g:905:2: iv_ruleNot= ruleNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalSLEEC.g:911:1: ruleNot returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_2_0 = null;

        EObject this_RelComp_3 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:917:2: ( ( ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp ) )
            // InternalSLEEC.g:918:2: ( ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp )
            {
            // InternalSLEEC.g:918:2: ( ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_FLOAT)||LA10_0==22) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSLEEC.g:919:3: ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) )
                    {
                    // InternalSLEEC.g:919:3: ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) )
                    // InternalSLEEC.g:920:4: () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) )
                    {
                    // InternalSLEEC.g:920:4: ()
                    // InternalSLEEC.g:921:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNotAccess().getNotAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getNotKeyword_0_1());
                      			
                    }
                    // InternalSLEEC.g:931:4: ( (lv_left_2_0= ruleRelComp ) )
                    // InternalSLEEC.g:932:5: (lv_left_2_0= ruleRelComp )
                    {
                    // InternalSLEEC.g:932:5: (lv_left_2_0= ruleRelComp )
                    // InternalSLEEC.g:933:6: lv_left_2_0= ruleRelComp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNotAccess().getLeftRelCompParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_left_2_0=ruleRelComp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNotRule());
                      						}
                      						set(
                      							current,
                      							"left",
                      							lv_left_2_0,
                      							"circus.robocalc.sleec.SLEEC.RelComp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:952:3: this_RelComp_3= ruleRelComp
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNotAccess().getRelCompParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelComp_3=ruleRelComp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelComp_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleRelComp"
    // InternalSLEEC.g:964:1: entryRuleRelComp returns [EObject current=null] : iv_ruleRelComp= ruleRelComp EOF ;
    public final EObject entryRuleRelComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelComp = null;


        try {
            // InternalSLEEC.g:964:48: (iv_ruleRelComp= ruleRelComp EOF )
            // InternalSLEEC.g:965:2: iv_ruleRelComp= ruleRelComp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelCompRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelComp=ruleRelComp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelComp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelComp"


    // $ANTLR start "ruleRelComp"
    // InternalSLEEC.g:971:1: ruleRelComp returns [EObject current=null] : (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleRelComp() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:977:2: ( (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) )
            // InternalSLEEC.g:978:2: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            {
            // InternalSLEEC.g:978:2: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            // InternalSLEEC.g:979:3: this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelCompAccess().getAtomParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_Atom_0=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Atom_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSLEEC.g:987:3: ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18||(LA11_0>=35 && LA11_0<=39)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSLEEC.g:988:4: () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) )
            	    {
            	    // InternalSLEEC.g:988:4: ()
            	    // InternalSLEEC.g:989:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getRelCompAccess().getRelCompLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSLEEC.g:995:4: ( (lv_op_2_0= ruleRelOp ) )
            	    // InternalSLEEC.g:996:5: (lv_op_2_0= ruleRelOp )
            	    {
            	    // InternalSLEEC.g:996:5: (lv_op_2_0= ruleRelOp )
            	    // InternalSLEEC.g:997:6: lv_op_2_0= ruleRelOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRelCompAccess().getOpRelOpEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_op_2_0=ruleRelOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRelCompRule());
            	      						}
            	      						set(
            	      							current,
            	      							"op",
            	      							lv_op_2_0,
            	      							"circus.robocalc.sleec.SLEEC.RelOp");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalSLEEC.g:1014:4: ( (lv_right_3_0= ruleAtom ) )
            	    // InternalSLEEC.g:1015:5: (lv_right_3_0= ruleAtom )
            	    {
            	    // InternalSLEEC.g:1015:5: (lv_right_3_0= ruleAtom )
            	    // InternalSLEEC.g:1016:6: lv_right_3_0= ruleAtom
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRelCompAccess().getRightAtomParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleAtom();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRelCompRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"circus.robocalc.sleec.SLEEC.Atom");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelComp"


    // $ANTLR start "entryRuleAtom"
    // InternalSLEEC.g:1038:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalSLEEC.g:1038:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalSLEEC.g:1039:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalSLEEC.g:1045:1: ruleAtom returns [EObject current=null] : ( ( ( RULE_ID )=> (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' ) | ( ( RULE_INT | RULE_FLOAT | RULE_ID )=> (lv_value_4_0= ruleValue ) ) | ( ( RULE_ID )=> (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_MBoolExpr_2 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:1051:2: ( ( ( ( RULE_ID )=> (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' ) | ( ( RULE_INT | RULE_FLOAT | RULE_ID )=> (lv_value_4_0= ruleValue ) ) | ( ( RULE_ID )=> (otherlv_5= RULE_ID ) ) ) )
            // InternalSLEEC.g:1052:2: ( ( ( RULE_ID )=> (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' ) | ( ( RULE_INT | RULE_FLOAT | RULE_ID )=> (lv_value_4_0= ruleValue ) ) | ( ( RULE_ID )=> (otherlv_5= RULE_ID ) ) )
            {
            // InternalSLEEC.g:1052:2: ( ( ( RULE_ID )=> (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' ) | ( ( RULE_INT | RULE_FLOAT | RULE_ID )=> (lv_value_4_0= ruleValue ) ) | ( ( RULE_ID )=> (otherlv_5= RULE_ID ) ) )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred1_InternalSLEEC()) ) {
                    alt12=1;
                }
                else if ( (synpred2_InternalSLEEC()) ) {
                    alt12=3;
                }
                else if ( (synpred3_InternalSLEEC()) ) {
                    alt12=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else if ( (LA12_0==RULE_INT) && (synpred2_InternalSLEEC())) {
                alt12=3;
            }
            else if ( (LA12_0==RULE_FLOAT) && (synpred2_InternalSLEEC())) {
                alt12=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSLEEC.g:1053:3: ( ( RULE_ID )=> (otherlv_0= RULE_ID ) )
                    {
                    // InternalSLEEC.g:1053:3: ( ( RULE_ID )=> (otherlv_0= RULE_ID ) )
                    // InternalSLEEC.g:1054:4: ( RULE_ID )=> (otherlv_0= RULE_ID )
                    {
                    // InternalSLEEC.g:1055:4: (otherlv_0= RULE_ID )
                    // InternalSLEEC.g:1056:5: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAtomRule());
                      					}
                      				
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getAtomAccess().getMeasureMeasureCrossReference_0_0());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1068:3: (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' )
                    {
                    // InternalSLEEC.g:1068:3: (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' )
                    // InternalSLEEC.g:1069:4: otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomAccess().getMBoolExprParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_22);
                    this_MBoolExpr_2=ruleMBoolExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MBoolExpr_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:1087:3: ( ( RULE_INT | RULE_FLOAT | RULE_ID )=> (lv_value_4_0= ruleValue ) )
                    {
                    // InternalSLEEC.g:1087:3: ( ( RULE_INT | RULE_FLOAT | RULE_ID )=> (lv_value_4_0= ruleValue ) )
                    // InternalSLEEC.g:1088:4: ( RULE_INT | RULE_FLOAT | RULE_ID )=> (lv_value_4_0= ruleValue )
                    {
                    // InternalSLEEC.g:1089:4: (lv_value_4_0= ruleValue )
                    // InternalSLEEC.g:1090:5: lv_value_4_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAtomAccess().getValueValueParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAtomRule());
                      					}
                      					set(
                      						current,
                      						"value",
                      						lv_value_4_0,
                      						"circus.robocalc.sleec.SLEEC.Value");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSLEEC.g:1108:3: ( ( RULE_ID )=> (otherlv_5= RULE_ID ) )
                    {
                    // InternalSLEEC.g:1108:3: ( ( RULE_ID )=> (otherlv_5= RULE_ID ) )
                    // InternalSLEEC.g:1109:4: ( RULE_ID )=> (otherlv_5= RULE_ID )
                    {
                    // InternalSLEEC.g:1110:4: (otherlv_5= RULE_ID )
                    // InternalSLEEC.g:1111:5: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAtomRule());
                      					}
                      				
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getAtomAccess().getScaleParamScaleParamCrossReference_3_0());
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleResponse"
    // InternalSLEEC.g:1126:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalSLEEC.g:1126:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalSLEEC.g:1127:2: iv_ruleResponse= ruleResponse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResponseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleResponse=ruleResponse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResponse; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalSLEEC.g:1133:1: ruleResponse returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )? ) | ( ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) ) ) ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_not_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_time_2_0 = null;

        EObject lv_response_4_0 = null;

        EObject lv_time_8_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:1139:2: ( ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )? ) | ( ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) ) ) ) )
            // InternalSLEEC.g:1140:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )? ) | ( ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) ) ) )
            {
            // InternalSLEEC.g:1140:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )? ) | ( ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==30) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSLEEC.g:1141:3: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )? )
                    {
                    // InternalSLEEC.g:1141:3: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )? )
                    // InternalSLEEC.g:1142:4: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )?
                    {
                    // InternalSLEEC.g:1142:4: ( (otherlv_0= RULE_ID ) )
                    // InternalSLEEC.g:1143:5: (otherlv_0= RULE_ID )
                    {
                    // InternalSLEEC.g:1143:5: (otherlv_0= RULE_ID )
                    // InternalSLEEC.g:1144:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getResponseRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getResponseAccess().getNameEventCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    // InternalSLEEC.g:1155:4: (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==31) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalSLEEC.g:1156:5: otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )?
                            {
                            otherlv_1=(Token)match(input,31,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getWithinKeyword_0_1_0());
                              				
                            }
                            // InternalSLEEC.g:1160:5: ( (lv_time_2_0= ruleValue ) )
                            // InternalSLEEC.g:1161:6: (lv_time_2_0= ruleValue )
                            {
                            // InternalSLEEC.g:1161:6: (lv_time_2_0= ruleValue )
                            // InternalSLEEC.g:1162:7: lv_time_2_0= ruleValue
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getResponseAccess().getTimeValueParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_24);
                            lv_time_2_0=ruleValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getResponseRule());
                              							}
                              							set(
                              								current,
                              								"time",
                              								lv_time_2_0,
                              								"circus.robocalc.sleec.SLEEC.Value");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalSLEEC.g:1179:5: (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==32) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalSLEEC.g:1180:6: otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) )
                                    {
                                    otherlv_3=(Token)match(input,32,FOLLOW_16); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_3, grammarAccess.getResponseAccess().getOtherwiseKeyword_0_1_2_0());
                                      					
                                    }
                                    // InternalSLEEC.g:1184:6: ( (lv_response_4_0= ruleResponse ) )
                                    // InternalSLEEC.g:1185:7: (lv_response_4_0= ruleResponse )
                                    {
                                    // InternalSLEEC.g:1185:7: (lv_response_4_0= ruleResponse )
                                    // InternalSLEEC.g:1186:8: lv_response_4_0= ruleResponse
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getResponseAccess().getResponseResponseParserRuleCall_0_1_2_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_response_4_0=ruleResponse();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getResponseRule());
                                      								}
                                      								set(
                                      									current,
                                      									"response",
                                      									lv_response_4_0,
                                      									"circus.robocalc.sleec.SLEEC.Response");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1207:3: ( ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) ) )
                    {
                    // InternalSLEEC.g:1207:3: ( ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) ) )
                    // InternalSLEEC.g:1208:4: ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) )
                    {
                    // InternalSLEEC.g:1208:4: ( (lv_not_5_0= 'not' ) )
                    // InternalSLEEC.g:1209:5: (lv_not_5_0= 'not' )
                    {
                    // InternalSLEEC.g:1209:5: (lv_not_5_0= 'not' )
                    // InternalSLEEC.g:1210:6: lv_not_5_0= 'not'
                    {
                    lv_not_5_0=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_not_5_0, grammarAccess.getResponseAccess().getNotNotKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getResponseRule());
                      						}
                      						setWithLastConsumed(current, "not", lv_not_5_0 != null, "not");
                      					
                    }

                    }


                    }

                    // InternalSLEEC.g:1222:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSLEEC.g:1223:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSLEEC.g:1223:5: (otherlv_6= RULE_ID )
                    // InternalSLEEC.g:1224:6: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getResponseRule());
                      						}
                      					
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getResponseAccess().getNameEventCrossReference_1_1_0());
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,31,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getResponseAccess().getWithinKeyword_1_2());
                      			
                    }
                    // InternalSLEEC.g:1239:4: ( (lv_time_8_0= ruleValue ) )
                    // InternalSLEEC.g:1240:5: (lv_time_8_0= ruleValue )
                    {
                    // InternalSLEEC.g:1240:5: (lv_time_8_0= ruleValue )
                    // InternalSLEEC.g:1241:6: lv_time_8_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getResponseAccess().getTimeValueParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_time_8_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getResponseRule());
                      						}
                      						set(
                      							current,
                      							"time",
                      							lv_time_8_0,
                      							"circus.robocalc.sleec.SLEEC.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleDefeater"
    // InternalSLEEC.g:1263:1: entryRuleDefeater returns [EObject current=null] : iv_ruleDefeater= ruleDefeater EOF ;
    public final EObject entryRuleDefeater() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefeater = null;


        try {
            // InternalSLEEC.g:1263:49: (iv_ruleDefeater= ruleDefeater EOF )
            // InternalSLEEC.g:1264:2: iv_ruleDefeater= ruleDefeater EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefeaterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefeater=ruleDefeater();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefeater; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefeater"


    // $ANTLR start "ruleDefeater"
    // InternalSLEEC.g:1270:1: ruleDefeater returns [EObject current=null] : (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? ) ;
    public final EObject ruleDefeater() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;

        EObject lv_response_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:1276:2: ( (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? ) )
            // InternalSLEEC.g:1277:2: (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? )
            {
            // InternalSLEEC.g:1277:2: (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? )
            // InternalSLEEC.g:1278:3: otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefeaterAccess().getUnlessKeyword_0());
              		
            }
            // InternalSLEEC.g:1282:3: ( (lv_expr_1_0= ruleMBoolExpr ) )
            // InternalSLEEC.g:1283:4: (lv_expr_1_0= ruleMBoolExpr )
            {
            // InternalSLEEC.g:1283:4: (lv_expr_1_0= ruleMBoolExpr )
            // InternalSLEEC.g:1284:5: lv_expr_1_0= ruleMBoolExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefeaterAccess().getExprMBoolExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_expr_1_0=ruleMBoolExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefeaterRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"circus.robocalc.sleec.SLEEC.MBoolExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSLEEC.g:1301:3: (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSLEEC.g:1302:4: otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDefeaterAccess().getThenKeyword_2_0());
                      			
                    }
                    // InternalSLEEC.g:1306:4: ( (lv_response_3_0= ruleResponse ) )
                    // InternalSLEEC.g:1307:5: (lv_response_3_0= ruleResponse )
                    {
                    // InternalSLEEC.g:1307:5: (lv_response_3_0= ruleResponse )
                    // InternalSLEEC.g:1308:6: lv_response_3_0= ruleResponse
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefeaterAccess().getResponseResponseParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_response_3_0=ruleResponse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefeaterRule());
                      						}
                      						set(
                      							current,
                      							"response",
                      							lv_response_3_0,
                      							"circus.robocalc.sleec.SLEEC.Response");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefeater"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSLEEC.g:1330:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSLEEC.g:1330:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSLEEC.g:1331:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSLEEC.g:1337:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1343:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSLEEC.g:1344:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSLEEC.g:1344:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSLEEC.g:1345:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalSLEEC.g:1352:3: (kw= '.' this_ID_2= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSLEEC.g:1353:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleRelOp"
    // InternalSLEEC.g:1370:1: ruleRelOp returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) ) ;
    public final Enumerator ruleRelOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1376:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) ) )
            // InternalSLEEC.g:1377:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) )
            {
            // InternalSLEEC.g:1377:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt18=1;
                }
                break;
            case 36:
                {
                alt18=2;
                }
                break;
            case 37:
                {
                alt18=3;
                }
                break;
            case 38:
                {
                alt18=4;
                }
                break;
            case 39:
                {
                alt18=5;
                }
                break;
            case 18:
                {
                alt18=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalSLEEC.g:1378:3: (enumLiteral_0= '<' )
                    {
                    // InternalSLEEC.g:1378:3: (enumLiteral_0= '<' )
                    // InternalSLEEC.g:1379:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1386:3: (enumLiteral_1= '>' )
                    {
                    // InternalSLEEC.g:1386:3: (enumLiteral_1= '>' )
                    // InternalSLEEC.g:1387:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:1394:3: (enumLiteral_2= '<>' )
                    {
                    // InternalSLEEC.g:1394:3: (enumLiteral_2= '<>' )
                    // InternalSLEEC.g:1395:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSLEEC.g:1402:3: (enumLiteral_3= '<=' )
                    {
                    // InternalSLEEC.g:1402:3: (enumLiteral_3= '<=' )
                    // InternalSLEEC.g:1403:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSLEEC.g:1410:3: (enumLiteral_4= '>=' )
                    {
                    // InternalSLEEC.g:1410:3: (enumLiteral_4= '>=' )
                    // InternalSLEEC.g:1411:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSLEEC.g:1418:3: (enumLiteral_5= '=' )
                    {
                    // InternalSLEEC.g:1418:3: (enumLiteral_5= '=' )
                    // InternalSLEEC.g:1419:4: enumLiteral_5= '='
                    {
                    enumLiteral_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelOpAccess().getEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getRelOpAccess().getEQUALEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelOp"


    // $ANTLR start "ruleBoolOp"
    // InternalSLEEC.g:1429:1: ruleBoolOp returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleBoolOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1435:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalSLEEC.g:1436:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalSLEEC.g:1436:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            else if ( (LA19_0==40) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSLEEC.g:1437:3: (enumLiteral_0= 'and' )
                    {
                    // InternalSLEEC.g:1437:3: (enumLiteral_0= 'and' )
                    // InternalSLEEC.g:1438:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1445:3: (enumLiteral_1= 'or' )
                    {
                    // InternalSLEEC.g:1445:3: (enumLiteral_1= 'or' )
                    // InternalSLEEC.g:1446:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBoolOpAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBoolOpAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolOp"

    // $ANTLR start synpred1_InternalSLEEC
    public final void synpred1_InternalSLEEC_fragment() throws RecognitionException {   
        // InternalSLEEC.g:1054:4: ( RULE_ID )
        // InternalSLEEC.g:1054:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSLEEC

    // $ANTLR start synpred2_InternalSLEEC
    public final void synpred2_InternalSLEEC_fragment() throws RecognitionException {   
        // InternalSLEEC.g:1088:4: ( RULE_INT | RULE_FLOAT | RULE_ID )
        // InternalSLEEC.g:
        {
        if ( (input.LA(1)>=RULE_ID && input.LA(1)<=RULE_FLOAT) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred2_InternalSLEEC

    // $ANTLR start synpred3_InternalSLEEC
    public final void synpred3_InternalSLEEC_fragment() throws RecognitionException {   
        // InternalSLEEC.g:1109:4: ( RULE_ID )
        // InternalSLEEC.g:1109:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSLEEC

    // Delegated rules

    public final boolean synpred2_InternalSLEEC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSLEEC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSLEEC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSLEEC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSLEEC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSLEEC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000002E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040400070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000F800040002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000002L});

}