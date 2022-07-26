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

@SuppressWarnings("all")
public class InternalSLEECParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def_start'", "'def_end'", "'event'", "'measure'", "':'", "'constant'", "'='", "'boolean'", "'numeric'", "'scale'", "'('", "','", "')'", "'rule_start'", "'rule_end'", "'when'", "'then'", "'and'", "'not'", "'within'", "'otherwise'", "'unless'", "'.'", "'<'", "'>'", "'<>'", "'<='", "'>='", "'or'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FOLLOW_2); 

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

            					newCompositeNode(grammarAccess.getSpecificationAccess().getDefBlockDefblockParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_defBlock_0_0=ruleDefblock();

            state._fsp--;


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

            // InternalSLEEC.g:99:3: ( (lv_ruleBlock_1_0= ruleRuleBlock ) )
            // InternalSLEEC.g:100:4: (lv_ruleBlock_1_0= ruleRuleBlock )
            {
            // InternalSLEEC.g:100:4: (lv_ruleBlock_1_0= ruleRuleBlock )
            // InternalSLEEC.g:101:5: lv_ruleBlock_1_0= ruleRuleBlock
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getRuleBlockRuleBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ruleBlock_1_0=ruleRuleBlock();

            state._fsp--;


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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getDefblockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefblock=ruleDefblock();

            state._fsp--;

             current =iv_ruleDefblock; 
            match(input,EOF,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefblockAccess().getDef_startKeyword_0());
            		
            // InternalSLEEC.g:141:3: ( (lv_definitions_1_0= ruleDefinition ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSLEEC.g:142:4: (lv_definitions_1_0= ruleDefinition )
            	    {
            	    // InternalSLEEC.g:142:4: (lv_definitions_1_0= ruleDefinition )
            	    // InternalSLEEC.g:143:5: lv_definitions_1_0= ruleDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getDefblockAccess().getDefinitionsDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_definitions_1_0=ruleDefinition();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDefblockAccess().getDef_endKeyword_2());
            		

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

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
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSLEEC.g:183:3: this_Event_0= ruleEvent
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Event_0=ruleEvent();

                    state._fsp--;


                    			current = this_Event_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:192:3: this_Measure_1= ruleMeasure
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getMeasureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Measure_1=ruleMeasure();

                    state._fsp--;


                    			current = this_Measure_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:201:3: this_Constant_2= ruleConstant
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getConstantParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constant_2=ruleConstant();

                    state._fsp--;


                    			current = this_Constant_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalSLEEC.g:232:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSLEEC.g:233:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSLEEC.g:233:4: (lv_name_1_0= RULE_ID )
            // InternalSLEEC.g:234:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
            				

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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasure=ruleMeasure();

            state._fsp--;

             current =iv_ruleMeasure; 
            match(input,EOF,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMeasureAccess().getMeasureKeyword_0());
            		
            // InternalSLEEC.g:273:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSLEEC.g:274:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSLEEC.g:274:4: (lv_name_1_0= RULE_ID )
            // InternalSLEEC.g:275:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMeasureAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMeasureAccess().getColonKeyword_2());
            		
            // InternalSLEEC.g:295:3: ( (lv_type_3_0= ruleType ) )
            // InternalSLEEC.g:296:4: (lv_type_3_0= ruleType )
            {
            // InternalSLEEC.g:296:4: (lv_type_3_0= ruleType )
            // InternalSLEEC.g:297:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMeasureAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:325:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalSLEEC.g:331:2: ( (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalSLEEC.g:332:2: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalSLEEC.g:332:2: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalSLEEC.g:333:3: otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstantKeyword_0());
            		
            // InternalSLEEC.g:337:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSLEEC.g:338:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSLEEC.g:338:4: (lv_name_1_0= RULE_ID )
            // InternalSLEEC.g:339:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getEqualsSignKeyword_2());
            		
            // InternalSLEEC.g:359:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalSLEEC.g:360:4: (lv_value_3_0= RULE_INT )
            {
            // InternalSLEEC.g:360:4: (lv_value_3_0= RULE_INT )
            // InternalSLEEC.g:361:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalSLEEC.g:381:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalSLEEC.g:381:46: (iv_ruleValue= ruleValue EOF )
            // InternalSLEEC.g:382:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:388:1: ruleValue returns [EObject current=null] : ( ( () this_INT_1= RULE_INT ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token this_INT_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSLEEC.g:394:2: ( ( ( () this_INT_1= RULE_INT ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSLEEC.g:395:2: ( ( () this_INT_1= RULE_INT ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSLEEC.g:395:2: ( ( () this_INT_1= RULE_INT ) | ( (otherlv_2= RULE_ID ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSLEEC.g:396:3: ( () this_INT_1= RULE_INT )
                    {
                    // InternalSLEEC.g:396:3: ( () this_INT_1= RULE_INT )
                    // InternalSLEEC.g:397:4: () this_INT_1= RULE_INT
                    {
                    // InternalSLEEC.g:397:4: ()
                    // InternalSLEEC.g:398:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValueAccess().getValueAction_0_0(),
                    						current);
                    				

                    }

                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_1, grammarAccess.getValueAccess().getINTTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:410:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalSLEEC.g:410:3: ( (otherlv_2= RULE_ID ) )
                    // InternalSLEEC.g:411:4: (otherlv_2= RULE_ID )
                    {
                    // InternalSLEEC.g:411:4: (otherlv_2= RULE_ID )
                    // InternalSLEEC.g:412:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getValueAccess().getValueConstantCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalSLEEC.g:427:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSLEEC.g:427:45: (iv_ruleType= ruleType EOF )
            // InternalSLEEC.g:428:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:434:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_scaleParams_7_0 = null;

        AntlrDatatypeRuleToken lv_scaleParams_9_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:440:2: ( ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')' ) ) )
            // InternalSLEEC.g:441:2: ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')' ) )
            {
            // InternalSLEEC.g:441:2: ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSLEEC.g:442:3: ( () otherlv_1= 'boolean' )
                    {
                    // InternalSLEEC.g:442:3: ( () otherlv_1= 'boolean' )
                    // InternalSLEEC.g:443:4: () otherlv_1= 'boolean'
                    {
                    // InternalSLEEC.g:443:4: ()
                    // InternalSLEEC.g:444:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getBooleanAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getBooleanKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:456:3: ( () otherlv_3= 'numeric' )
                    {
                    // InternalSLEEC.g:456:3: ( () otherlv_3= 'numeric' )
                    // InternalSLEEC.g:457:4: () otherlv_3= 'numeric'
                    {
                    // InternalSLEEC.g:457:4: ()
                    // InternalSLEEC.g:458:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getNumericAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getNumericKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:470:3: ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')' )
                    {
                    // InternalSLEEC.g:470:3: ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')' )
                    // InternalSLEEC.g:471:4: () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')'
                    {
                    // InternalSLEEC.g:471:4: ()
                    // InternalSLEEC.g:472:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getScaleAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getScaleKeyword_2_1());
                    			
                    otherlv_6=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalSLEEC.g:486:4: ( (lv_scaleParams_7_0= ruleLiteral ) )
                    // InternalSLEEC.g:487:5: (lv_scaleParams_7_0= ruleLiteral )
                    {
                    // InternalSLEEC.g:487:5: (lv_scaleParams_7_0= ruleLiteral )
                    // InternalSLEEC.g:488:6: lv_scaleParams_7_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getScaleParamsLiteralParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_scaleParams_7_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						add(
                    							current,
                    							"scaleParams",
                    							lv_scaleParams_7_0,
                    							"circus.robocalc.sleec.SLEEC.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSLEEC.g:505:4: (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==22) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSLEEC.g:506:5: otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FOLLOW_6); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getCommaKeyword_2_4_0());
                    	    				
                    	    // InternalSLEEC.g:510:5: ( (lv_scaleParams_9_0= ruleLiteral ) )
                    	    // InternalSLEEC.g:511:6: (lv_scaleParams_9_0= ruleLiteral )
                    	    {
                    	    // InternalSLEEC.g:511:6: (lv_scaleParams_9_0= ruleLiteral )
                    	    // InternalSLEEC.g:512:7: lv_scaleParams_9_0= ruleLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getTypeAccess().getScaleParamsLiteralParserRuleCall_2_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_scaleParams_9_0=ruleLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"scaleParams",
                    	    								lv_scaleParams_9_0,
                    	    								"circus.robocalc.sleec.SLEEC.Literal");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleLiteral"
    // InternalSLEEC.g:539:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalSLEEC.g:539:47: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalSLEEC.g:540:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalSLEEC.g:546:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalSLEEC.g:552:2: (this_ID_0= RULE_ID )
            // InternalSLEEC.g:553:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getLiteralAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleRuleBlock"
    // InternalSLEEC.g:563:1: entryRuleRuleBlock returns [EObject current=null] : iv_ruleRuleBlock= ruleRuleBlock EOF ;
    public final EObject entryRuleRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBlock = null;


        try {
            // InternalSLEEC.g:563:50: (iv_ruleRuleBlock= ruleRuleBlock EOF )
            // InternalSLEEC.g:564:2: iv_ruleRuleBlock= ruleRuleBlock EOF
            {
             newCompositeNode(grammarAccess.getRuleBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleBlock=ruleRuleBlock();

            state._fsp--;

             current =iv_ruleRuleBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:570:1: ruleRuleBlock returns [EObject current=null] : (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' ) ;
    public final EObject ruleRuleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:576:2: ( (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' ) )
            // InternalSLEEC.g:577:2: (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' )
            {
            // InternalSLEEC.g:577:2: (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' )
            // InternalSLEEC.g:578:3: otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleBlockAccess().getRule_startKeyword_0());
            		
            // InternalSLEEC.g:582:3: ( (lv_rules_1_0= ruleRule ) )+
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
            	    // InternalSLEEC.g:583:4: (lv_rules_1_0= ruleRule )
            	    {
            	    // InternalSLEEC.g:583:4: (lv_rules_1_0= ruleRule )
            	    // InternalSLEEC.g:584:5: lv_rules_1_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getRuleBlockAccess().getRulesRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_rules_1_0=ruleRule();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleBlockAccess().getRule_endKeyword_2());
            		

            }


            }


            	leaveRule();

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
    // InternalSLEEC.g:609:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalSLEEC.g:609:45: (iv_ruleRule= ruleRule EOF )
            // InternalSLEEC.g:610:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:616:1: ruleRule returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* ) ;
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
            // InternalSLEEC.g:622:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* ) )
            // InternalSLEEC.g:623:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* )
            {
            // InternalSLEEC.g:623:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* )
            // InternalSLEEC.g:624:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )*
            {
            // InternalSLEEC.g:624:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalSLEEC.g:625:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalSLEEC.g:625:4: (lv_name_0_0= ruleQualifiedName )
            // InternalSLEEC.g:626:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


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

            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getWhenKeyword_1());
            		
            // InternalSLEEC.g:647:3: ( (lv_trigger_2_0= ruleTrigger ) )
            // InternalSLEEC.g:648:4: (lv_trigger_2_0= ruleTrigger )
            {
            // InternalSLEEC.g:648:4: (lv_trigger_2_0= ruleTrigger )
            // InternalSLEEC.g:649:5: lv_trigger_2_0= ruleTrigger
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getTriggerTriggerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_trigger_2_0=ruleTrigger();

            state._fsp--;


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

            otherlv_3=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getThenKeyword_3());
            		
            // InternalSLEEC.g:670:3: ( (lv_response_4_0= ruleResponse ) )
            // InternalSLEEC.g:671:4: (lv_response_4_0= ruleResponse )
            {
            // InternalSLEEC.g:671:4: (lv_response_4_0= ruleResponse )
            // InternalSLEEC.g:672:5: lv_response_4_0= ruleResponse
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getResponseResponseParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_response_4_0=ruleResponse();

            state._fsp--;


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

            // InternalSLEEC.g:689:3: ( (lv_defeaters_5_0= ruleDefeater ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSLEEC.g:690:4: (lv_defeaters_5_0= ruleDefeater )
            	    {
            	    // InternalSLEEC.g:690:4: (lv_defeaters_5_0= ruleDefeater )
            	    // InternalSLEEC.g:691:5: lv_defeaters_5_0= ruleDefeater
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getDefeatersDefeaterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_defeaters_5_0=ruleDefeater();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalSLEEC.g:712:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalSLEEC.g:712:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalSLEEC.g:713:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:719:1: ruleTrigger returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:725:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? ) )
            // InternalSLEEC.g:726:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? )
            {
            // InternalSLEEC.g:726:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? )
            // InternalSLEEC.g:727:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )?
            {
            // InternalSLEEC.g:727:3: ( (otherlv_0= RULE_ID ) )
            // InternalSLEEC.g:728:4: (otherlv_0= RULE_ID )
            {
            // InternalSLEEC.g:728:4: (otherlv_0= RULE_ID )
            // InternalSLEEC.g:729:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            // InternalSLEEC.g:740:3: (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSLEEC.g:741:4: otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getAndKeyword_1_0());
                    			
                    // InternalSLEEC.g:745:4: ( (lv_expr_2_0= ruleMBoolExpr ) )
                    // InternalSLEEC.g:746:5: (lv_expr_2_0= ruleMBoolExpr )
                    {
                    // InternalSLEEC.g:746:5: (lv_expr_2_0= ruleMBoolExpr )
                    // InternalSLEEC.g:747:6: lv_expr_2_0= ruleMBoolExpr
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getExprMBoolExprParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=ruleMBoolExpr();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalSLEEC.g:769:1: entryRuleMBoolExpr returns [EObject current=null] : iv_ruleMBoolExpr= ruleMBoolExpr EOF ;
    public final EObject entryRuleMBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMBoolExpr = null;


        try {
            // InternalSLEEC.g:769:50: (iv_ruleMBoolExpr= ruleMBoolExpr EOF )
            // InternalSLEEC.g:770:2: iv_ruleMBoolExpr= ruleMBoolExpr EOF
            {
             newCompositeNode(grammarAccess.getMBoolExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMBoolExpr=ruleMBoolExpr();

            state._fsp--;

             current =iv_ruleMBoolExpr; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:776:1: ruleMBoolExpr returns [EObject current=null] : this_BoolComp_0= ruleBoolComp ;
    public final EObject ruleMBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject this_BoolComp_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:782:2: (this_BoolComp_0= ruleBoolComp )
            // InternalSLEEC.g:783:2: this_BoolComp_0= ruleBoolComp
            {

            		newCompositeNode(grammarAccess.getMBoolExprAccess().getBoolCompParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BoolComp_0=ruleBoolComp();

            state._fsp--;


            		current = this_BoolComp_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

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
    // InternalSLEEC.g:794:1: entryRuleBoolComp returns [EObject current=null] : iv_ruleBoolComp= ruleBoolComp EOF ;
    public final EObject entryRuleBoolComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolComp = null;


        try {
            // InternalSLEEC.g:794:49: (iv_ruleBoolComp= ruleBoolComp EOF )
            // InternalSLEEC.g:795:2: iv_ruleBoolComp= ruleBoolComp EOF
            {
             newCompositeNode(grammarAccess.getBoolCompRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolComp=ruleBoolComp();

            state._fsp--;

             current =iv_ruleBoolComp; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:801:1: ruleBoolComp returns [EObject current=null] : (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* ) ;
    public final EObject ruleBoolComp() throws RecognitionException {
        EObject current = null;

        EObject this_Not_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:807:2: ( (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* ) )
            // InternalSLEEC.g:808:2: (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* )
            {
            // InternalSLEEC.g:808:2: (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* )
            // InternalSLEEC.g:809:3: this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )*
            {

            			newCompositeNode(grammarAccess.getBoolCompAccess().getNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Not_0=ruleNot();

            state._fsp--;


            			current = this_Not_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSLEEC.g:817:3: ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28||LA9_0==39) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSLEEC.g:818:4: () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) )
            	    {
            	    // InternalSLEEC.g:818:4: ()
            	    // InternalSLEEC.g:819:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBoolCompAccess().getBoolCompLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSLEEC.g:825:4: ( (lv_op_2_0= ruleBoolOp ) )
            	    // InternalSLEEC.g:826:5: (lv_op_2_0= ruleBoolOp )
            	    {
            	    // InternalSLEEC.g:826:5: (lv_op_2_0= ruleBoolOp )
            	    // InternalSLEEC.g:827:6: lv_op_2_0= ruleBoolOp
            	    {

            	    						newCompositeNode(grammarAccess.getBoolCompAccess().getOpBoolOpEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_op_2_0=ruleBoolOp();

            	    state._fsp--;


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

            	    // InternalSLEEC.g:844:4: ( (lv_right_3_0= ruleNot ) )
            	    // InternalSLEEC.g:845:5: (lv_right_3_0= ruleNot )
            	    {
            	    // InternalSLEEC.g:845:5: (lv_right_3_0= ruleNot )
            	    // InternalSLEEC.g:846:6: lv_right_3_0= ruleNot
            	    {

            	    						newCompositeNode(grammarAccess.getBoolCompAccess().getRightNotParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleNot();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalSLEEC.g:868:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalSLEEC.g:868:44: (iv_ruleNot= ruleNot EOF )
            // InternalSLEEC.g:869:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:875:1: ruleNot returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_2_0 = null;

        EObject this_RelComp_3 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:881:2: ( ( ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp ) )
            // InternalSLEEC.g:882:2: ( ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp )
            {
            // InternalSLEEC.g:882:2: ( ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSLEEC.g:883:3: ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) )
                    {
                    // InternalSLEEC.g:883:3: ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) )
                    // InternalSLEEC.g:884:4: () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) )
                    {
                    // InternalSLEEC.g:884:4: ()
                    // InternalSLEEC.g:885:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotAccess().getNotAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getNotKeyword_0_1());
                    			
                    // InternalSLEEC.g:895:4: ( (lv_left_2_0= ruleRelComp ) )
                    // InternalSLEEC.g:896:5: (lv_left_2_0= ruleRelComp )
                    {
                    // InternalSLEEC.g:896:5: (lv_left_2_0= ruleRelComp )
                    // InternalSLEEC.g:897:6: lv_left_2_0= ruleRelComp
                    {

                    						newCompositeNode(grammarAccess.getNotAccess().getLeftRelCompParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_left_2_0=ruleRelComp();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalSLEEC.g:916:3: this_RelComp_3= ruleRelComp
                    {

                    			newCompositeNode(grammarAccess.getNotAccess().getRelCompParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelComp_3=ruleRelComp();

                    state._fsp--;


                    			current = this_RelComp_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalSLEEC.g:928:1: entryRuleRelComp returns [EObject current=null] : iv_ruleRelComp= ruleRelComp EOF ;
    public final EObject entryRuleRelComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelComp = null;


        try {
            // InternalSLEEC.g:928:48: (iv_ruleRelComp= ruleRelComp EOF )
            // InternalSLEEC.g:929:2: iv_ruleRelComp= ruleRelComp EOF
            {
             newCompositeNode(grammarAccess.getRelCompRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelComp=ruleRelComp();

            state._fsp--;

             current =iv_ruleRelComp; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:935:1: ruleRelComp returns [EObject current=null] : (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleRelComp() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:941:2: ( (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) )
            // InternalSLEEC.g:942:2: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            {
            // InternalSLEEC.g:942:2: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            // InternalSLEEC.g:943:3: this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelCompAccess().getAtomParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Atom_0=ruleAtom();

            state._fsp--;


            			current = this_Atom_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSLEEC.g:951:3: ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17||(LA11_0>=34 && LA11_0<=38)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSLEEC.g:952:4: () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) )
            	    {
            	    // InternalSLEEC.g:952:4: ()
            	    // InternalSLEEC.g:953:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelCompAccess().getRelCompLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSLEEC.g:959:4: ( (lv_op_2_0= ruleRelOp ) )
            	    // InternalSLEEC.g:960:5: (lv_op_2_0= ruleRelOp )
            	    {
            	    // InternalSLEEC.g:960:5: (lv_op_2_0= ruleRelOp )
            	    // InternalSLEEC.g:961:6: lv_op_2_0= ruleRelOp
            	    {

            	    						newCompositeNode(grammarAccess.getRelCompAccess().getOpRelOpEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_op_2_0=ruleRelOp();

            	    state._fsp--;


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

            	    // InternalSLEEC.g:978:4: ( (lv_right_3_0= ruleAtom ) )
            	    // InternalSLEEC.g:979:5: (lv_right_3_0= ruleAtom )
            	    {
            	    // InternalSLEEC.g:979:5: (lv_right_3_0= ruleAtom )
            	    // InternalSLEEC.g:980:6: lv_right_3_0= ruleAtom
            	    {

            	    						newCompositeNode(grammarAccess.getRelCompAccess().getRightAtomParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleAtom();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalSLEEC.g:1002:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalSLEEC.g:1002:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalSLEEC.g:1003:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:1009:1: ruleAtom returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' ) | ( (lv_value_4_0= ruleValue ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_MBoolExpr_2 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:1015:2: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' ) | ( (lv_value_4_0= ruleValue ) ) ) )
            // InternalSLEEC.g:1016:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' ) | ( (lv_value_4_0= ruleValue ) ) )
            {
            // InternalSLEEC.g:1016:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' ) | ( (lv_value_4_0= ruleValue ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case 21:
                {
                alt12=2;
                }
                break;
            case RULE_INT:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSLEEC.g:1017:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalSLEEC.g:1017:3: ( (otherlv_0= RULE_ID ) )
                    // InternalSLEEC.g:1018:4: (otherlv_0= RULE_ID )
                    {
                    // InternalSLEEC.g:1018:4: (otherlv_0= RULE_ID )
                    // InternalSLEEC.g:1019:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getAtomAccess().getMeasureMeasureCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1031:3: (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' )
                    {
                    // InternalSLEEC.g:1031:3: (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' )
                    // InternalSLEEC.g:1032:4: otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomAccess().getMBoolExprParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_22);
                    this_MBoolExpr_2=ruleMBoolExpr();

                    state._fsp--;


                    				current = this_MBoolExpr_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:1050:3: ( (lv_value_4_0= ruleValue ) )
                    {
                    // InternalSLEEC.g:1050:3: ( (lv_value_4_0= ruleValue ) )
                    // InternalSLEEC.g:1051:4: (lv_value_4_0= ruleValue )
                    {
                    // InternalSLEEC.g:1051:4: (lv_value_4_0= ruleValue )
                    // InternalSLEEC.g:1052:5: lv_value_4_0= ruleValue
                    {

                    					newCompositeNode(grammarAccess.getAtomAccess().getValueValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleValue();

                    state._fsp--;


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
                    break;

            }


            }


            	leaveRule();

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
    // InternalSLEEC.g:1073:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalSLEEC.g:1073:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalSLEEC.g:1074:2: iv_ruleResponse= ruleResponse EOF
            {
             newCompositeNode(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponse=ruleResponse();

            state._fsp--;

             current =iv_ruleResponse; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:1080:1: ruleResponse returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )? ) | ( ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) ) ) ) ;
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
            // InternalSLEEC.g:1086:2: ( ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )? ) | ( ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) ) ) ) )
            // InternalSLEEC.g:1087:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )? ) | ( ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) ) ) )
            {
            // InternalSLEEC.g:1087:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )? ) | ( ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSLEEC.g:1088:3: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )? )
                    {
                    // InternalSLEEC.g:1088:3: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )? )
                    // InternalSLEEC.g:1089:4: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )?
                    {
                    // InternalSLEEC.g:1089:4: ( (otherlv_0= RULE_ID ) )
                    // InternalSLEEC.g:1090:5: (otherlv_0= RULE_ID )
                    {
                    // InternalSLEEC.g:1090:5: (otherlv_0= RULE_ID )
                    // InternalSLEEC.g:1091:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_0, grammarAccess.getResponseAccess().getNameEventCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalSLEEC.g:1102:4: (otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )? )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==30) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalSLEEC.g:1103:5: otherlv_1= 'within' ( (lv_time_2_0= ruleValue ) ) (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )?
                            {
                            otherlv_1=(Token)match(input,30,FOLLOW_19); 

                            					newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getWithinKeyword_0_1_0());
                            				
                            // InternalSLEEC.g:1107:5: ( (lv_time_2_0= ruleValue ) )
                            // InternalSLEEC.g:1108:6: (lv_time_2_0= ruleValue )
                            {
                            // InternalSLEEC.g:1108:6: (lv_time_2_0= ruleValue )
                            // InternalSLEEC.g:1109:7: lv_time_2_0= ruleValue
                            {

                            							newCompositeNode(grammarAccess.getResponseAccess().getTimeValueParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_24);
                            lv_time_2_0=ruleValue();

                            state._fsp--;


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

                            // InternalSLEEC.g:1126:5: (otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) ) )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==31) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalSLEEC.g:1127:6: otherlv_3= 'otherwise' ( (lv_response_4_0= ruleResponse ) )
                                    {
                                    otherlv_3=(Token)match(input,31,FOLLOW_16); 

                                    						newLeafNode(otherlv_3, grammarAccess.getResponseAccess().getOtherwiseKeyword_0_1_2_0());
                                    					
                                    // InternalSLEEC.g:1131:6: ( (lv_response_4_0= ruleResponse ) )
                                    // InternalSLEEC.g:1132:7: (lv_response_4_0= ruleResponse )
                                    {
                                    // InternalSLEEC.g:1132:7: (lv_response_4_0= ruleResponse )
                                    // InternalSLEEC.g:1133:8: lv_response_4_0= ruleResponse
                                    {

                                    								newCompositeNode(grammarAccess.getResponseAccess().getResponseResponseParserRuleCall_0_1_2_1_0());
                                    							
                                    pushFollow(FOLLOW_2);
                                    lv_response_4_0=ruleResponse();

                                    state._fsp--;


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
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1154:3: ( ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) ) )
                    {
                    // InternalSLEEC.g:1154:3: ( ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) ) )
                    // InternalSLEEC.g:1155:4: ( (lv_not_5_0= 'not' ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'within' ( (lv_time_8_0= ruleValue ) )
                    {
                    // InternalSLEEC.g:1155:4: ( (lv_not_5_0= 'not' ) )
                    // InternalSLEEC.g:1156:5: (lv_not_5_0= 'not' )
                    {
                    // InternalSLEEC.g:1156:5: (lv_not_5_0= 'not' )
                    // InternalSLEEC.g:1157:6: lv_not_5_0= 'not'
                    {
                    lv_not_5_0=(Token)match(input,29,FOLLOW_6); 

                    						newLeafNode(lv_not_5_0, grammarAccess.getResponseAccess().getNotNotKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseRule());
                    						}
                    						setWithLastConsumed(current, "not", lv_not_5_0 != null, "not");
                    					

                    }


                    }

                    // InternalSLEEC.g:1169:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSLEEC.g:1170:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSLEEC.g:1170:5: (otherlv_6= RULE_ID )
                    // InternalSLEEC.g:1171:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(otherlv_6, grammarAccess.getResponseAccess().getNameEventCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getResponseAccess().getWithinKeyword_1_2());
                    			
                    // InternalSLEEC.g:1186:4: ( (lv_time_8_0= ruleValue ) )
                    // InternalSLEEC.g:1187:5: (lv_time_8_0= ruleValue )
                    {
                    // InternalSLEEC.g:1187:5: (lv_time_8_0= ruleValue )
                    // InternalSLEEC.g:1188:6: lv_time_8_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getResponseAccess().getTimeValueParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_time_8_0=ruleValue();

                    state._fsp--;


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
                    break;

            }


            }


            	leaveRule();

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
    // InternalSLEEC.g:1210:1: entryRuleDefeater returns [EObject current=null] : iv_ruleDefeater= ruleDefeater EOF ;
    public final EObject entryRuleDefeater() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefeater = null;


        try {
            // InternalSLEEC.g:1210:49: (iv_ruleDefeater= ruleDefeater EOF )
            // InternalSLEEC.g:1211:2: iv_ruleDefeater= ruleDefeater EOF
            {
             newCompositeNode(grammarAccess.getDefeaterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefeater=ruleDefeater();

            state._fsp--;

             current =iv_ruleDefeater; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:1217:1: ruleDefeater returns [EObject current=null] : (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? ) ;
    public final EObject ruleDefeater() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;

        EObject lv_response_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:1223:2: ( (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? ) )
            // InternalSLEEC.g:1224:2: (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? )
            {
            // InternalSLEEC.g:1224:2: (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? )
            // InternalSLEEC.g:1225:3: otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDefeaterAccess().getUnlessKeyword_0());
            		
            // InternalSLEEC.g:1229:3: ( (lv_expr_1_0= ruleMBoolExpr ) )
            // InternalSLEEC.g:1230:4: (lv_expr_1_0= ruleMBoolExpr )
            {
            // InternalSLEEC.g:1230:4: (lv_expr_1_0= ruleMBoolExpr )
            // InternalSLEEC.g:1231:5: lv_expr_1_0= ruleMBoolExpr
            {

            					newCompositeNode(grammarAccess.getDefeaterAccess().getExprMBoolExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_expr_1_0=ruleMBoolExpr();

            state._fsp--;


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

            // InternalSLEEC.g:1248:3: (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSLEEC.g:1249:4: otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefeaterAccess().getThenKeyword_2_0());
                    			
                    // InternalSLEEC.g:1253:4: ( (lv_response_3_0= ruleResponse ) )
                    // InternalSLEEC.g:1254:5: (lv_response_3_0= ruleResponse )
                    {
                    // InternalSLEEC.g:1254:5: (lv_response_3_0= ruleResponse )
                    // InternalSLEEC.g:1255:6: lv_response_3_0= ruleResponse
                    {

                    						newCompositeNode(grammarAccess.getDefeaterAccess().getResponseResponseParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_response_3_0=ruleResponse();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalSLEEC.g:1277:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSLEEC.g:1277:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSLEEC.g:1278:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSLEEC.g:1284:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1290:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSLEEC.g:1291:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSLEEC.g:1291:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSLEEC.g:1292:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSLEEC.g:1299:3: (kw= '.' this_ID_2= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSLEEC.g:1300:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalSLEEC.g:1317:1: ruleRelOp returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) ) ;
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
            // InternalSLEEC.g:1323:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) ) )
            // InternalSLEEC.g:1324:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) )
            {
            // InternalSLEEC.g:1324:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt18=1;
                }
                break;
            case 35:
                {
                alt18=2;
                }
                break;
            case 36:
                {
                alt18=3;
                }
                break;
            case 37:
                {
                alt18=4;
                }
                break;
            case 38:
                {
                alt18=5;
                }
                break;
            case 17:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalSLEEC.g:1325:3: (enumLiteral_0= '<' )
                    {
                    // InternalSLEEC.g:1325:3: (enumLiteral_0= '<' )
                    // InternalSLEEC.g:1326:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1333:3: (enumLiteral_1= '>' )
                    {
                    // InternalSLEEC.g:1333:3: (enumLiteral_1= '>' )
                    // InternalSLEEC.g:1334:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:1341:3: (enumLiteral_2= '<>' )
                    {
                    // InternalSLEEC.g:1341:3: (enumLiteral_2= '<>' )
                    // InternalSLEEC.g:1342:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSLEEC.g:1349:3: (enumLiteral_3= '<=' )
                    {
                    // InternalSLEEC.g:1349:3: (enumLiteral_3= '<=' )
                    // InternalSLEEC.g:1350:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSLEEC.g:1357:3: (enumLiteral_4= '>=' )
                    {
                    // InternalSLEEC.g:1357:3: (enumLiteral_4= '>=' )
                    // InternalSLEEC.g:1358:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSLEEC.g:1365:3: (enumLiteral_5= '=' )
                    {
                    // InternalSLEEC.g:1365:3: (enumLiteral_5= '=' )
                    // InternalSLEEC.g:1366:4: enumLiteral_5= '='
                    {
                    enumLiteral_5=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRelOpAccess().getEQUALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalSLEEC.g:1376:1: ruleBoolOp returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleBoolOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1382:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalSLEEC.g:1383:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalSLEEC.g:1383:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            else if ( (LA19_0==39) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSLEEC.g:1384:3: (enumLiteral_0= 'and' )
                    {
                    // InternalSLEEC.g:1384:3: (enumLiteral_0= 'and' )
                    // InternalSLEEC.g:1385:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1392:3: (enumLiteral_1= 'or' )
                    {
                    // InternalSLEEC.g:1392:3: (enumLiteral_1= 'or' )
                    // InternalSLEEC.g:1393:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getBoolOpAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBoolOpAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000017000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020200030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000007C00020002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000002L});

}