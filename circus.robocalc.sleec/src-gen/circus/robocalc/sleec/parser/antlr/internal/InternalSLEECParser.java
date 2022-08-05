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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_FLOAT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def_start'", "'def_end'", "'event'", "'measure'", "':'", "'constant'", "'='", "'boolean'", "'numeric'", "'scale'", "'('", "','", "')'", "'rule_start'", "'rule_end'", "'when'", "'then'", "'and'", "'not'", "'within'", "'otherwise'", "'unless'", "'<'", "'>'", "'<>'", "'<='", "'>='", "'or'", "'seconds'", "'minutes'", "'hours'", "'days'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_FLOAT=5;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefblockAccess().getDef_startKeyword_0());
            		
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

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalSLEEC.g:175:1: ruleDefinition returns [EObject current=null] : ( ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEventID ) ) ) | ( () otherlv_4= 'measure' ( (lv_name_5_0= ruleMeasureID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) ) | ( () otherlv_9= 'constant' ( (lv_name_10_0= ruleConstID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_type_7_0 = null;

        AntlrDatatypeRuleToken lv_name_10_0 = null;

        EObject lv_value_12_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:181:2: ( ( ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEventID ) ) ) | ( () otherlv_4= 'measure' ( (lv_name_5_0= ruleMeasureID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) ) | ( () otherlv_9= 'constant' ( (lv_name_10_0= ruleConstID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) ) ) ) )
            // InternalSLEEC.g:182:2: ( ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEventID ) ) ) | ( () otherlv_4= 'measure' ( (lv_name_5_0= ruleMeasureID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) ) | ( () otherlv_9= 'constant' ( (lv_name_10_0= ruleConstID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) ) ) )
            {
            // InternalSLEEC.g:182:2: ( ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEventID ) ) ) | ( () otherlv_4= 'measure' ( (lv_name_5_0= ruleMeasureID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) ) | ( () otherlv_9= 'constant' ( (lv_name_10_0= ruleConstID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) ) ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSLEEC.g:183:3: ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEventID ) ) )
                    {
                    // InternalSLEEC.g:183:3: ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEventID ) ) )
                    // InternalSLEEC.g:184:4: () otherlv_1= 'event' ( (lv_name_2_0= ruleEventID ) )
                    {
                    // InternalSLEEC.g:184:4: ()
                    // InternalSLEEC.g:185:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getEventAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getEventKeyword_0_1());
                    			
                    // InternalSLEEC.g:195:4: ( (lv_name_2_0= ruleEventID ) )
                    // InternalSLEEC.g:196:5: (lv_name_2_0= ruleEventID )
                    {
                    // InternalSLEEC.g:196:5: (lv_name_2_0= ruleEventID )
                    // InternalSLEEC.g:197:6: lv_name_2_0= ruleEventID
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getNameEventIDParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_name_2_0=ruleEventID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"circus.robocalc.sleec.SLEEC.EventID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:216:3: ( () otherlv_4= 'measure' ( (lv_name_5_0= ruleMeasureID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) )
                    {
                    // InternalSLEEC.g:216:3: ( () otherlv_4= 'measure' ( (lv_name_5_0= ruleMeasureID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) )
                    // InternalSLEEC.g:217:4: () otherlv_4= 'measure' ( (lv_name_5_0= ruleMeasureID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) )
                    {
                    // InternalSLEEC.g:217:4: ()
                    // InternalSLEEC.g:218:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getMeasureAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getMeasureKeyword_1_1());
                    			
                    // InternalSLEEC.g:228:4: ( (lv_name_5_0= ruleMeasureID ) )
                    // InternalSLEEC.g:229:5: (lv_name_5_0= ruleMeasureID )
                    {
                    // InternalSLEEC.g:229:5: (lv_name_5_0= ruleMeasureID )
                    // InternalSLEEC.g:230:6: lv_name_5_0= ruleMeasureID
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getNameMeasureIDParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_name_5_0=ruleMeasureID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"circus.robocalc.sleec.SLEEC.MeasureID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getColonKeyword_1_3());
                    			
                    // InternalSLEEC.g:251:4: ( (lv_type_7_0= ruleType ) )
                    // InternalSLEEC.g:252:5: (lv_type_7_0= ruleType )
                    {
                    // InternalSLEEC.g:252:5: (lv_type_7_0= ruleType )
                    // InternalSLEEC.g:253:6: lv_type_7_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_7_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"circus.robocalc.sleec.SLEEC.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:272:3: ( () otherlv_9= 'constant' ( (lv_name_10_0= ruleConstID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) ) )
                    {
                    // InternalSLEEC.g:272:3: ( () otherlv_9= 'constant' ( (lv_name_10_0= ruleConstID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) ) )
                    // InternalSLEEC.g:273:4: () otherlv_9= 'constant' ( (lv_name_10_0= ruleConstID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) )
                    {
                    // InternalSLEEC.g:273:4: ()
                    // InternalSLEEC.g:274:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getConstantAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getDefinitionAccess().getConstantKeyword_2_1());
                    			
                    // InternalSLEEC.g:284:4: ( (lv_name_10_0= ruleConstID ) )
                    // InternalSLEEC.g:285:5: (lv_name_10_0= ruleConstID )
                    {
                    // InternalSLEEC.g:285:5: (lv_name_10_0= ruleConstID )
                    // InternalSLEEC.g:286:6: lv_name_10_0= ruleConstID
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getNameConstIDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_name_10_0=ruleConstID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_10_0,
                    							"circus.robocalc.sleec.SLEEC.ConstID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getDefinitionAccess().getEqualsSignKeyword_2_3());
                    			
                    // InternalSLEEC.g:307:4: ( (lv_value_12_0= ruleValue ) )
                    // InternalSLEEC.g:308:5: (lv_value_12_0= ruleValue )
                    {
                    // InternalSLEEC.g:308:5: (lv_value_12_0= ruleValue )
                    // InternalSLEEC.g:309:6: lv_value_12_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getValueValueParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_12_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_12_0,
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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleValue"
    // InternalSLEEC.g:331:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalSLEEC.g:331:46: (iv_ruleValue= ruleValue EOF )
            // InternalSLEEC.g:332:2: iv_ruleValue= ruleValue EOF
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
    // InternalSLEEC.g:338:1: ruleValue returns [EObject current=null] : ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_float_1_0= RULE_FLOAT ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_int_0_0=null;
        Token lv_float_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSLEEC.g:344:2: ( ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_float_1_0= RULE_FLOAT ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSLEEC.g:345:2: ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_float_1_0= RULE_FLOAT ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSLEEC.g:345:2: ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_float_1_0= RULE_FLOAT ) ) | ( (otherlv_2= RULE_ID ) ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSLEEC.g:346:3: ( (lv_int_0_0= RULE_INT ) )
                    {
                    // InternalSLEEC.g:346:3: ( (lv_int_0_0= RULE_INT ) )
                    // InternalSLEEC.g:347:4: (lv_int_0_0= RULE_INT )
                    {
                    // InternalSLEEC.g:347:4: (lv_int_0_0= RULE_INT )
                    // InternalSLEEC.g:348:5: lv_int_0_0= RULE_INT
                    {
                    lv_int_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_int_0_0, grammarAccess.getValueAccess().getIntINTTerminalRuleCall_0_0());
                    				

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
                    break;
                case 2 :
                    // InternalSLEEC.g:365:3: ( (lv_float_1_0= RULE_FLOAT ) )
                    {
                    // InternalSLEEC.g:365:3: ( (lv_float_1_0= RULE_FLOAT ) )
                    // InternalSLEEC.g:366:4: (lv_float_1_0= RULE_FLOAT )
                    {
                    // InternalSLEEC.g:366:4: (lv_float_1_0= RULE_FLOAT )
                    // InternalSLEEC.g:367:5: lv_float_1_0= RULE_FLOAT
                    {
                    lv_float_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    					newLeafNode(lv_float_1_0, grammarAccess.getValueAccess().getFloatFLOATTerminalRuleCall_1_0());
                    				

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
                    break;
                case 3 :
                    // InternalSLEEC.g:384:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalSLEEC.g:384:3: ( (otherlv_2= RULE_ID ) )
                    // InternalSLEEC.g:385:4: (otherlv_2= RULE_ID )
                    {
                    // InternalSLEEC.g:385:4: (otherlv_2= RULE_ID )
                    // InternalSLEEC.g:386:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getValueAccess().getConstantConstantCrossReference_2_0());
                    				

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
    // InternalSLEEC.g:401:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSLEEC.g:401:45: (iv_ruleType= ruleType EOF )
            // InternalSLEEC.g:402:2: iv_ruleType= ruleType EOF
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
    // InternalSLEEC.g:408:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')' ) ) ;
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
            // InternalSLEEC.g:414:2: ( ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')' ) ) )
            // InternalSLEEC.g:415:2: ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')' ) )
            {
            // InternalSLEEC.g:415:2: ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')' ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSLEEC.g:416:3: ( () otherlv_1= 'boolean' )
                    {
                    // InternalSLEEC.g:416:3: ( () otherlv_1= 'boolean' )
                    // InternalSLEEC.g:417:4: () otherlv_1= 'boolean'
                    {
                    // InternalSLEEC.g:417:4: ()
                    // InternalSLEEC.g:418:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getBooleanAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getBooleanKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:430:3: ( () otherlv_3= 'numeric' )
                    {
                    // InternalSLEEC.g:430:3: ( () otherlv_3= 'numeric' )
                    // InternalSLEEC.g:431:4: () otherlv_3= 'numeric'
                    {
                    // InternalSLEEC.g:431:4: ()
                    // InternalSLEEC.g:432:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getNumericAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getNumericKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:444:3: ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')' )
                    {
                    // InternalSLEEC.g:444:3: ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')' )
                    // InternalSLEEC.g:445:4: () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleScaleParam ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )* otherlv_10= ')'
                    {
                    // InternalSLEEC.g:445:4: ()
                    // InternalSLEEC.g:446:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getScaleAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getScaleKeyword_2_1());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalSLEEC.g:460:4: ( (lv_scaleParams_7_0= ruleScaleParam ) )
                    // InternalSLEEC.g:461:5: (lv_scaleParams_7_0= ruleScaleParam )
                    {
                    // InternalSLEEC.g:461:5: (lv_scaleParams_7_0= ruleScaleParam )
                    // InternalSLEEC.g:462:6: lv_scaleParams_7_0= ruleScaleParam
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getScaleParamsScaleParamParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_scaleParams_7_0=ruleScaleParam();

                    state._fsp--;


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

                    // InternalSLEEC.g:479:4: (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==23) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSLEEC.g:480:5: otherlv_8= ',' ( (lv_scaleParams_9_0= ruleScaleParam ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_6); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getCommaKeyword_2_4_0());
                    	    				
                    	    // InternalSLEEC.g:484:5: ( (lv_scaleParams_9_0= ruleScaleParam ) )
                    	    // InternalSLEEC.g:485:6: (lv_scaleParams_9_0= ruleScaleParam )
                    	    {
                    	    // InternalSLEEC.g:485:6: (lv_scaleParams_9_0= ruleScaleParam )
                    	    // InternalSLEEC.g:486:7: lv_scaleParams_9_0= ruleScaleParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getTypeAccess().getScaleParamsScaleParamParserRuleCall_2_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_scaleParams_9_0=ruleScaleParam();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRuleBlock"
    // InternalSLEEC.g:513:1: entryRuleRuleBlock returns [EObject current=null] : iv_ruleRuleBlock= ruleRuleBlock EOF ;
    public final EObject entryRuleRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBlock = null;


        try {
            // InternalSLEEC.g:513:50: (iv_ruleRuleBlock= ruleRuleBlock EOF )
            // InternalSLEEC.g:514:2: iv_ruleRuleBlock= ruleRuleBlock EOF
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
    // InternalSLEEC.g:520:1: ruleRuleBlock returns [EObject current=null] : (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' ) ;
    public final EObject ruleRuleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:526:2: ( (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' ) )
            // InternalSLEEC.g:527:2: (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' )
            {
            // InternalSLEEC.g:527:2: (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' )
            // InternalSLEEC.g:528:3: otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleBlockAccess().getRule_startKeyword_0());
            		
            // InternalSLEEC.g:532:3: ( (lv_rules_1_0= ruleRule ) )+
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
            	    // InternalSLEEC.g:533:4: (lv_rules_1_0= ruleRule )
            	    {
            	    // InternalSLEEC.g:533:4: (lv_rules_1_0= ruleRule )
            	    // InternalSLEEC.g:534:5: lv_rules_1_0= ruleRule
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

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

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
    // InternalSLEEC.g:559:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalSLEEC.g:559:45: (iv_ruleRule= ruleRule EOF )
            // InternalSLEEC.g:560:2: iv_ruleRule= ruleRule EOF
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
    // InternalSLEEC.g:566:1: ruleRule returns [EObject current=null] : ( ( (lv_name_0_0= ruleRuleID ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* ) ;
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
            // InternalSLEEC.g:572:2: ( ( ( (lv_name_0_0= ruleRuleID ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* ) )
            // InternalSLEEC.g:573:2: ( ( (lv_name_0_0= ruleRuleID ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* )
            {
            // InternalSLEEC.g:573:2: ( ( (lv_name_0_0= ruleRuleID ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* )
            // InternalSLEEC.g:574:3: ( (lv_name_0_0= ruleRuleID ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )*
            {
            // InternalSLEEC.g:574:3: ( (lv_name_0_0= ruleRuleID ) )
            // InternalSLEEC.g:575:4: (lv_name_0_0= ruleRuleID )
            {
            // InternalSLEEC.g:575:4: (lv_name_0_0= ruleRuleID )
            // InternalSLEEC.g:576:5: lv_name_0_0= ruleRuleID
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getNameRuleIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleRuleID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"circus.robocalc.sleec.SLEEC.RuleID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getWhenKeyword_1());
            		
            // InternalSLEEC.g:597:3: ( (lv_trigger_2_0= ruleTrigger ) )
            // InternalSLEEC.g:598:4: (lv_trigger_2_0= ruleTrigger )
            {
            // InternalSLEEC.g:598:4: (lv_trigger_2_0= ruleTrigger )
            // InternalSLEEC.g:599:5: lv_trigger_2_0= ruleTrigger
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

            otherlv_3=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getThenKeyword_3());
            		
            // InternalSLEEC.g:620:3: ( (lv_response_4_0= ruleResponse ) )
            // InternalSLEEC.g:621:4: (lv_response_4_0= ruleResponse )
            {
            // InternalSLEEC.g:621:4: (lv_response_4_0= ruleResponse )
            // InternalSLEEC.g:622:5: lv_response_4_0= ruleResponse
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

            // InternalSLEEC.g:639:3: ( (lv_defeaters_5_0= ruleDefeater ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSLEEC.g:640:4: (lv_defeaters_5_0= ruleDefeater )
            	    {
            	    // InternalSLEEC.g:640:4: (lv_defeaters_5_0= ruleDefeater )
            	    // InternalSLEEC.g:641:5: lv_defeaters_5_0= ruleDefeater
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
    // InternalSLEEC.g:662:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalSLEEC.g:662:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalSLEEC.g:663:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalSLEEC.g:669:1: ruleTrigger returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:675:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? ) )
            // InternalSLEEC.g:676:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? )
            {
            // InternalSLEEC.g:676:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? )
            // InternalSLEEC.g:677:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )?
            {
            // InternalSLEEC.g:677:3: ( (otherlv_0= RULE_ID ) )
            // InternalSLEEC.g:678:4: (otherlv_0= RULE_ID )
            {
            // InternalSLEEC.g:678:4: (otherlv_0= RULE_ID )
            // InternalSLEEC.g:679:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            // InternalSLEEC.g:690:3: (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSLEEC.g:691:4: otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) )
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getAndKeyword_1_0());
                    			
                    // InternalSLEEC.g:695:4: ( (lv_expr_2_0= ruleMBoolExpr ) )
                    // InternalSLEEC.g:696:5: (lv_expr_2_0= ruleMBoolExpr )
                    {
                    // InternalSLEEC.g:696:5: (lv_expr_2_0= ruleMBoolExpr )
                    // InternalSLEEC.g:697:6: lv_expr_2_0= ruleMBoolExpr
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
    // InternalSLEEC.g:719:1: entryRuleMBoolExpr returns [EObject current=null] : iv_ruleMBoolExpr= ruleMBoolExpr EOF ;
    public final EObject entryRuleMBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMBoolExpr = null;


        try {
            // InternalSLEEC.g:719:50: (iv_ruleMBoolExpr= ruleMBoolExpr EOF )
            // InternalSLEEC.g:720:2: iv_ruleMBoolExpr= ruleMBoolExpr EOF
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
    // InternalSLEEC.g:726:1: ruleMBoolExpr returns [EObject current=null] : this_BoolComp_0= ruleBoolComp ;
    public final EObject ruleMBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject this_BoolComp_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:732:2: (this_BoolComp_0= ruleBoolComp )
            // InternalSLEEC.g:733:2: this_BoolComp_0= ruleBoolComp
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
    // InternalSLEEC.g:744:1: entryRuleBoolComp returns [EObject current=null] : iv_ruleBoolComp= ruleBoolComp EOF ;
    public final EObject entryRuleBoolComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolComp = null;


        try {
            // InternalSLEEC.g:744:49: (iv_ruleBoolComp= ruleBoolComp EOF )
            // InternalSLEEC.g:745:2: iv_ruleBoolComp= ruleBoolComp EOF
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
    // InternalSLEEC.g:751:1: ruleBoolComp returns [EObject current=null] : (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* ) ;
    public final EObject ruleBoolComp() throws RecognitionException {
        EObject current = null;

        EObject this_Not_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:757:2: ( (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* ) )
            // InternalSLEEC.g:758:2: (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* )
            {
            // InternalSLEEC.g:758:2: (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* )
            // InternalSLEEC.g:759:3: this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )*
            {

            			newCompositeNode(grammarAccess.getBoolCompAccess().getNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Not_0=ruleNot();

            state._fsp--;


            			current = this_Not_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSLEEC.g:767:3: ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29||LA9_0==39) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSLEEC.g:768:4: () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) )
            	    {
            	    // InternalSLEEC.g:768:4: ()
            	    // InternalSLEEC.g:769:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBoolCompAccess().getBoolCompLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSLEEC.g:775:4: ( (lv_op_2_0= ruleBoolOp ) )
            	    // InternalSLEEC.g:776:5: (lv_op_2_0= ruleBoolOp )
            	    {
            	    // InternalSLEEC.g:776:5: (lv_op_2_0= ruleBoolOp )
            	    // InternalSLEEC.g:777:6: lv_op_2_0= ruleBoolOp
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

            	    // InternalSLEEC.g:794:4: ( (lv_right_3_0= ruleNot ) )
            	    // InternalSLEEC.g:795:5: (lv_right_3_0= ruleNot )
            	    {
            	    // InternalSLEEC.g:795:5: (lv_right_3_0= ruleNot )
            	    // InternalSLEEC.g:796:6: lv_right_3_0= ruleNot
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
    // InternalSLEEC.g:818:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalSLEEC.g:818:44: (iv_ruleNot= ruleNot EOF )
            // InternalSLEEC.g:819:2: iv_ruleNot= ruleNot EOF
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
    // InternalSLEEC.g:825:1: ruleNot returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_expr_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;

        EObject this_RelComp_3 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:831:2: ( ( ( () otherlv_1= 'not' ( (lv_expr_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp ) )
            // InternalSLEEC.g:832:2: ( ( () otherlv_1= 'not' ( (lv_expr_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp )
            {
            // InternalSLEEC.g:832:2: ( ( () otherlv_1= 'not' ( (lv_expr_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_ID)||LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSLEEC.g:833:3: ( () otherlv_1= 'not' ( (lv_expr_2_0= ruleRelComp ) ) )
                    {
                    // InternalSLEEC.g:833:3: ( () otherlv_1= 'not' ( (lv_expr_2_0= ruleRelComp ) ) )
                    // InternalSLEEC.g:834:4: () otherlv_1= 'not' ( (lv_expr_2_0= ruleRelComp ) )
                    {
                    // InternalSLEEC.g:834:4: ()
                    // InternalSLEEC.g:835:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotAccess().getNotAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getNotKeyword_0_1());
                    			
                    // InternalSLEEC.g:845:4: ( (lv_expr_2_0= ruleRelComp ) )
                    // InternalSLEEC.g:846:5: (lv_expr_2_0= ruleRelComp )
                    {
                    // InternalSLEEC.g:846:5: (lv_expr_2_0= ruleRelComp )
                    // InternalSLEEC.g:847:6: lv_expr_2_0= ruleRelComp
                    {

                    						newCompositeNode(grammarAccess.getNotAccess().getExprRelCompParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=ruleRelComp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_2_0,
                    							"circus.robocalc.sleec.SLEEC.RelComp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:866:3: this_RelComp_3= ruleRelComp
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
    // InternalSLEEC.g:878:1: entryRuleRelComp returns [EObject current=null] : iv_ruleRelComp= ruleRelComp EOF ;
    public final EObject entryRuleRelComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelComp = null;


        try {
            // InternalSLEEC.g:878:48: (iv_ruleRelComp= ruleRelComp EOF )
            // InternalSLEEC.g:879:2: iv_ruleRelComp= ruleRelComp EOF
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
    // InternalSLEEC.g:885:1: ruleRelComp returns [EObject current=null] : (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleRelComp() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:891:2: ( (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) )
            // InternalSLEEC.g:892:2: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            {
            // InternalSLEEC.g:892:2: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            // InternalSLEEC.g:893:3: this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelCompAccess().getAtomParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Atom_0=ruleAtom();

            state._fsp--;


            			current = this_Atom_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSLEEC.g:901:3: ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18||(LA11_0>=34 && LA11_0<=38)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSLEEC.g:902:4: () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) )
            	    {
            	    // InternalSLEEC.g:902:4: ()
            	    // InternalSLEEC.g:903:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelCompAccess().getRelCompLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSLEEC.g:909:4: ( (lv_op_2_0= ruleRelOp ) )
            	    // InternalSLEEC.g:910:5: (lv_op_2_0= ruleRelOp )
            	    {
            	    // InternalSLEEC.g:910:5: (lv_op_2_0= ruleRelOp )
            	    // InternalSLEEC.g:911:6: lv_op_2_0= ruleRelOp
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

            	    // InternalSLEEC.g:928:4: ( (lv_right_3_0= ruleAtom ) )
            	    // InternalSLEEC.g:929:5: (lv_right_3_0= ruleAtom )
            	    {
            	    // InternalSLEEC.g:929:5: (lv_right_3_0= ruleAtom )
            	    // InternalSLEEC.g:930:6: lv_right_3_0= ruleAtom
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
    // InternalSLEEC.g:952:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalSLEEC.g:952:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalSLEEC.g:953:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalSLEEC.g:959:1: ruleAtom returns [EObject current=null] : ( ( () ( ( (lv_measureID_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleValue ) ) ) ) | (otherlv_3= '(' this_MBoolExpr_4= ruleMBoolExpr otherlv_5= ')' ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_measureID_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject this_MBoolExpr_4 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:965:2: ( ( ( () ( ( (lv_measureID_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleValue ) ) ) ) | (otherlv_3= '(' this_MBoolExpr_4= ruleMBoolExpr otherlv_5= ')' ) ) )
            // InternalSLEEC.g:966:2: ( ( () ( ( (lv_measureID_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleValue ) ) ) ) | (otherlv_3= '(' this_MBoolExpr_4= ruleMBoolExpr otherlv_5= ')' ) )
            {
            // InternalSLEEC.g:966:2: ( ( () ( ( (lv_measureID_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleValue ) ) ) ) | (otherlv_3= '(' this_MBoolExpr_4= ruleMBoolExpr otherlv_5= ')' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_ID)) ) {
                alt13=1;
            }
            else if ( (LA13_0==22) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSLEEC.g:967:3: ( () ( ( (lv_measureID_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleValue ) ) ) )
                    {
                    // InternalSLEEC.g:967:3: ( () ( ( (lv_measureID_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleValue ) ) ) )
                    // InternalSLEEC.g:968:4: () ( ( (lv_measureID_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleValue ) ) )
                    {
                    // InternalSLEEC.g:968:4: ()
                    // InternalSLEEC.g:969:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomAccess().getAtomAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSLEEC.g:975:4: ( ( (lv_measureID_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleValue ) ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    else if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_FLOAT)) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalSLEEC.g:976:5: ( (lv_measureID_1_0= RULE_ID ) )
                            {
                            // InternalSLEEC.g:976:5: ( (lv_measureID_1_0= RULE_ID ) )
                            // InternalSLEEC.g:977:6: (lv_measureID_1_0= RULE_ID )
                            {
                            // InternalSLEEC.g:977:6: (lv_measureID_1_0= RULE_ID )
                            // InternalSLEEC.g:978:7: lv_measureID_1_0= RULE_ID
                            {
                            lv_measureID_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_measureID_1_0, grammarAccess.getAtomAccess().getMeasureIDIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"measureID",
                            								lv_measureID_1_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSLEEC.g:995:5: ( (lv_value_2_0= ruleValue ) )
                            {
                            // InternalSLEEC.g:995:5: ( (lv_value_2_0= ruleValue ) )
                            // InternalSLEEC.g:996:6: (lv_value_2_0= ruleValue )
                            {
                            // InternalSLEEC.g:996:6: (lv_value_2_0= ruleValue )
                            // InternalSLEEC.g:997:7: lv_value_2_0= ruleValue
                            {

                            							newCompositeNode(grammarAccess.getAtomAccess().getValueValueParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_value_2_0=ruleValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAtomRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_2_0,
                            								"circus.robocalc.sleec.SLEEC.Value");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1017:3: (otherlv_3= '(' this_MBoolExpr_4= ruleMBoolExpr otherlv_5= ')' )
                    {
                    // InternalSLEEC.g:1017:3: (otherlv_3= '(' this_MBoolExpr_4= ruleMBoolExpr otherlv_5= ')' )
                    // InternalSLEEC.g:1018:4: otherlv_3= '(' this_MBoolExpr_4= ruleMBoolExpr otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomAccess().getMBoolExprParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_22);
                    this_MBoolExpr_4=ruleMBoolExpr();

                    state._fsp--;


                    				current = this_MBoolExpr_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // InternalSLEEC.g:1039:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalSLEEC.g:1039:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalSLEEC.g:1040:2: iv_ruleResponse= ruleResponse EOF
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
    // InternalSLEEC.g:1046:1: ruleResponse returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_value_2_0= ruleValue ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )? ) | ( ( (lv_not_6_0= 'not' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'within' ( (lv_value_9_0= ruleValue ) ) ( (lv_unit_10_0= ruleTimeUnit ) ) ) ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_not_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_value_2_0 = null;

        Enumerator lv_unit_3_0 = null;

        EObject lv_response_5_0 = null;

        EObject lv_value_9_0 = null;

        Enumerator lv_unit_10_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:1052:2: ( ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_value_2_0= ruleValue ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )? ) | ( ( (lv_not_6_0= 'not' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'within' ( (lv_value_9_0= ruleValue ) ) ( (lv_unit_10_0= ruleTimeUnit ) ) ) ) )
            // InternalSLEEC.g:1053:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_value_2_0= ruleValue ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )? ) | ( ( (lv_not_6_0= 'not' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'within' ( (lv_value_9_0= ruleValue ) ) ( (lv_unit_10_0= ruleTimeUnit ) ) ) )
            {
            // InternalSLEEC.g:1053:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_value_2_0= ruleValue ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )? ) | ( ( (lv_not_6_0= 'not' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'within' ( (lv_value_9_0= ruleValue ) ) ( (lv_unit_10_0= ruleTimeUnit ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSLEEC.g:1054:3: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_value_2_0= ruleValue ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )? )
                    {
                    // InternalSLEEC.g:1054:3: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_value_2_0= ruleValue ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )? )
                    // InternalSLEEC.g:1055:4: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'within' ( (lv_value_2_0= ruleValue ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )?
                    {
                    // InternalSLEEC.g:1055:4: ( (otherlv_0= RULE_ID ) )
                    // InternalSLEEC.g:1056:5: (otherlv_0= RULE_ID )
                    {
                    // InternalSLEEC.g:1056:5: (otherlv_0= RULE_ID )
                    // InternalSLEEC.g:1057:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_0, grammarAccess.getResponseAccess().getEventEventCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalSLEEC.g:1068:4: (otherlv_1= 'within' ( (lv_value_2_0= ruleValue ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==31) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSLEEC.g:1069:5: otherlv_1= 'within' ( (lv_value_2_0= ruleValue ) ) ( (lv_unit_3_0= ruleTimeUnit ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )?
                            {
                            otherlv_1=(Token)match(input,31,FOLLOW_10); 

                            					newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getWithinKeyword_0_1_0());
                            				
                            // InternalSLEEC.g:1073:5: ( (lv_value_2_0= ruleValue ) )
                            // InternalSLEEC.g:1074:6: (lv_value_2_0= ruleValue )
                            {
                            // InternalSLEEC.g:1074:6: (lv_value_2_0= ruleValue )
                            // InternalSLEEC.g:1075:7: lv_value_2_0= ruleValue
                            {

                            							newCompositeNode(grammarAccess.getResponseAccess().getValueValueParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_24);
                            lv_value_2_0=ruleValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getResponseRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_2_0,
                            								"circus.robocalc.sleec.SLEEC.Value");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalSLEEC.g:1092:5: ( (lv_unit_3_0= ruleTimeUnit ) )
                            // InternalSLEEC.g:1093:6: (lv_unit_3_0= ruleTimeUnit )
                            {
                            // InternalSLEEC.g:1093:6: (lv_unit_3_0= ruleTimeUnit )
                            // InternalSLEEC.g:1094:7: lv_unit_3_0= ruleTimeUnit
                            {

                            							newCompositeNode(grammarAccess.getResponseAccess().getUnitTimeUnitEnumRuleCall_0_1_2_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_unit_3_0=ruleTimeUnit();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getResponseRule());
                            							}
                            							set(
                            								current,
                            								"unit",
                            								lv_unit_3_0,
                            								"circus.robocalc.sleec.SLEEC.TimeUnit");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalSLEEC.g:1111:5: (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==32) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // InternalSLEEC.g:1112:6: otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) )
                                    {
                                    otherlv_4=(Token)match(input,32,FOLLOW_16); 

                                    						newLeafNode(otherlv_4, grammarAccess.getResponseAccess().getOtherwiseKeyword_0_1_3_0());
                                    					
                                    // InternalSLEEC.g:1116:6: ( (lv_response_5_0= ruleResponse ) )
                                    // InternalSLEEC.g:1117:7: (lv_response_5_0= ruleResponse )
                                    {
                                    // InternalSLEEC.g:1117:7: (lv_response_5_0= ruleResponse )
                                    // InternalSLEEC.g:1118:8: lv_response_5_0= ruleResponse
                                    {

                                    								newCompositeNode(grammarAccess.getResponseAccess().getResponseResponseParserRuleCall_0_1_3_1_0());
                                    							
                                    pushFollow(FOLLOW_2);
                                    lv_response_5_0=ruleResponse();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getResponseRule());
                                    								}
                                    								set(
                                    									current,
                                    									"response",
                                    									lv_response_5_0,
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
                    // InternalSLEEC.g:1139:3: ( ( (lv_not_6_0= 'not' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'within' ( (lv_value_9_0= ruleValue ) ) ( (lv_unit_10_0= ruleTimeUnit ) ) )
                    {
                    // InternalSLEEC.g:1139:3: ( ( (lv_not_6_0= 'not' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'within' ( (lv_value_9_0= ruleValue ) ) ( (lv_unit_10_0= ruleTimeUnit ) ) )
                    // InternalSLEEC.g:1140:4: ( (lv_not_6_0= 'not' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'within' ( (lv_value_9_0= ruleValue ) ) ( (lv_unit_10_0= ruleTimeUnit ) )
                    {
                    // InternalSLEEC.g:1140:4: ( (lv_not_6_0= 'not' ) )
                    // InternalSLEEC.g:1141:5: (lv_not_6_0= 'not' )
                    {
                    // InternalSLEEC.g:1141:5: (lv_not_6_0= 'not' )
                    // InternalSLEEC.g:1142:6: lv_not_6_0= 'not'
                    {
                    lv_not_6_0=(Token)match(input,30,FOLLOW_6); 

                    						newLeafNode(lv_not_6_0, grammarAccess.getResponseAccess().getNotNotKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseRule());
                    						}
                    						setWithLastConsumed(current, "not", lv_not_6_0 != null, "not");
                    					

                    }


                    }

                    // InternalSLEEC.g:1154:4: ( (otherlv_7= RULE_ID ) )
                    // InternalSLEEC.g:1155:5: (otherlv_7= RULE_ID )
                    {
                    // InternalSLEEC.g:1155:5: (otherlv_7= RULE_ID )
                    // InternalSLEEC.g:1156:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_7, grammarAccess.getResponseAccess().getEventEventCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getResponseAccess().getWithinKeyword_1_2());
                    			
                    // InternalSLEEC.g:1171:4: ( (lv_value_9_0= ruleValue ) )
                    // InternalSLEEC.g:1172:5: (lv_value_9_0= ruleValue )
                    {
                    // InternalSLEEC.g:1172:5: (lv_value_9_0= ruleValue )
                    // InternalSLEEC.g:1173:6: lv_value_9_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getResponseAccess().getValueValueParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_value_9_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResponseRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"circus.robocalc.sleec.SLEEC.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSLEEC.g:1190:4: ( (lv_unit_10_0= ruleTimeUnit ) )
                    // InternalSLEEC.g:1191:5: (lv_unit_10_0= ruleTimeUnit )
                    {
                    // InternalSLEEC.g:1191:5: (lv_unit_10_0= ruleTimeUnit )
                    // InternalSLEEC.g:1192:6: lv_unit_10_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getResponseAccess().getUnitTimeUnitEnumRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unit_10_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResponseRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_10_0,
                    							"circus.robocalc.sleec.SLEEC.TimeUnit");
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
    // InternalSLEEC.g:1214:1: entryRuleDefeater returns [EObject current=null] : iv_ruleDefeater= ruleDefeater EOF ;
    public final EObject entryRuleDefeater() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefeater = null;


        try {
            // InternalSLEEC.g:1214:49: (iv_ruleDefeater= ruleDefeater EOF )
            // InternalSLEEC.g:1215:2: iv_ruleDefeater= ruleDefeater EOF
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
    // InternalSLEEC.g:1221:1: ruleDefeater returns [EObject current=null] : (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? ) ;
    public final EObject ruleDefeater() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;

        EObject lv_response_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:1227:2: ( (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? ) )
            // InternalSLEEC.g:1228:2: (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? )
            {
            // InternalSLEEC.g:1228:2: (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? )
            // InternalSLEEC.g:1229:3: otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDefeaterAccess().getUnlessKeyword_0());
            		
            // InternalSLEEC.g:1233:3: ( (lv_expr_1_0= ruleMBoolExpr ) )
            // InternalSLEEC.g:1234:4: (lv_expr_1_0= ruleMBoolExpr )
            {
            // InternalSLEEC.g:1234:4: (lv_expr_1_0= ruleMBoolExpr )
            // InternalSLEEC.g:1235:5: lv_expr_1_0= ruleMBoolExpr
            {

            					newCompositeNode(grammarAccess.getDefeaterAccess().getExprMBoolExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalSLEEC.g:1252:3: (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSLEEC.g:1253:4: otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefeaterAccess().getThenKeyword_2_0());
                    			
                    // InternalSLEEC.g:1257:4: ( (lv_response_3_0= ruleResponse ) )
                    // InternalSLEEC.g:1258:5: (lv_response_3_0= ruleResponse )
                    {
                    // InternalSLEEC.g:1258:5: (lv_response_3_0= ruleResponse )
                    // InternalSLEEC.g:1259:6: lv_response_3_0= ruleResponse
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


    // $ANTLR start "entryRuleEventID"
    // InternalSLEEC.g:1281:1: entryRuleEventID returns [String current=null] : iv_ruleEventID= ruleEventID EOF ;
    public final String entryRuleEventID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEventID = null;


        try {
            // InternalSLEEC.g:1281:47: (iv_ruleEventID= ruleEventID EOF )
            // InternalSLEEC.g:1282:2: iv_ruleEventID= ruleEventID EOF
            {
             newCompositeNode(grammarAccess.getEventIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventID=ruleEventID();

            state._fsp--;

             current =iv_ruleEventID.getText(); 
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
    // $ANTLR end "entryRuleEventID"


    // $ANTLR start "ruleEventID"
    // InternalSLEEC.g:1288:1: ruleEventID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleEventID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1294:2: (this_ID_0= RULE_ID )
            // InternalSLEEC.g:1295:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getEventIDAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEventID"


    // $ANTLR start "entryRuleMeasureID"
    // InternalSLEEC.g:1305:1: entryRuleMeasureID returns [String current=null] : iv_ruleMeasureID= ruleMeasureID EOF ;
    public final String entryRuleMeasureID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMeasureID = null;


        try {
            // InternalSLEEC.g:1305:49: (iv_ruleMeasureID= ruleMeasureID EOF )
            // InternalSLEEC.g:1306:2: iv_ruleMeasureID= ruleMeasureID EOF
            {
             newCompositeNode(grammarAccess.getMeasureIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureID=ruleMeasureID();

            state._fsp--;

             current =iv_ruleMeasureID.getText(); 
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
    // $ANTLR end "entryRuleMeasureID"


    // $ANTLR start "ruleMeasureID"
    // InternalSLEEC.g:1312:1: ruleMeasureID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleMeasureID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1318:2: (this_ID_0= RULE_ID )
            // InternalSLEEC.g:1319:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getMeasureIDAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleMeasureID"


    // $ANTLR start "entryRuleConstID"
    // InternalSLEEC.g:1329:1: entryRuleConstID returns [String current=null] : iv_ruleConstID= ruleConstID EOF ;
    public final String entryRuleConstID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstID = null;


        try {
            // InternalSLEEC.g:1329:47: (iv_ruleConstID= ruleConstID EOF )
            // InternalSLEEC.g:1330:2: iv_ruleConstID= ruleConstID EOF
            {
             newCompositeNode(grammarAccess.getConstIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstID=ruleConstID();

            state._fsp--;

             current =iv_ruleConstID.getText(); 
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
    // $ANTLR end "entryRuleConstID"


    // $ANTLR start "ruleConstID"
    // InternalSLEEC.g:1336:1: ruleConstID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleConstID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1342:2: (this_ID_0= RULE_ID )
            // InternalSLEEC.g:1343:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getConstIDAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleConstID"


    // $ANTLR start "entryRuleScaleParam"
    // InternalSLEEC.g:1353:1: entryRuleScaleParam returns [String current=null] : iv_ruleScaleParam= ruleScaleParam EOF ;
    public final String entryRuleScaleParam() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScaleParam = null;


        try {
            // InternalSLEEC.g:1353:50: (iv_ruleScaleParam= ruleScaleParam EOF )
            // InternalSLEEC.g:1354:2: iv_ruleScaleParam= ruleScaleParam EOF
            {
             newCompositeNode(grammarAccess.getScaleParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScaleParam=ruleScaleParam();

            state._fsp--;

             current =iv_ruleScaleParam.getText(); 
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
    // $ANTLR end "entryRuleScaleParam"


    // $ANTLR start "ruleScaleParam"
    // InternalSLEEC.g:1360:1: ruleScaleParam returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleScaleParam() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1366:2: (this_ID_0= RULE_ID )
            // InternalSLEEC.g:1367:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getScaleParamAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleScaleParam"


    // $ANTLR start "entryRuleRuleID"
    // InternalSLEEC.g:1377:1: entryRuleRuleID returns [String current=null] : iv_ruleRuleID= ruleRuleID EOF ;
    public final String entryRuleRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleID = null;


        try {
            // InternalSLEEC.g:1377:46: (iv_ruleRuleID= ruleRuleID EOF )
            // InternalSLEEC.g:1378:2: iv_ruleRuleID= ruleRuleID EOF
            {
             newCompositeNode(grammarAccess.getRuleIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleID=ruleRuleID();

            state._fsp--;

             current =iv_ruleRuleID.getText(); 
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
    // $ANTLR end "entryRuleRuleID"


    // $ANTLR start "ruleRuleID"
    // InternalSLEEC.g:1384:1: ruleRuleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleRuleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1390:2: (this_ID_0= RULE_ID )
            // InternalSLEEC.g:1391:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getRuleIDAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleRuleID"


    // $ANTLR start "ruleRelOp"
    // InternalSLEEC.g:1401:1: ruleRelOp returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) ) ;
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
            // InternalSLEEC.g:1407:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) ) )
            // InternalSLEEC.g:1408:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) )
            {
            // InternalSLEEC.g:1408:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) )
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
            case 18:
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
                    // InternalSLEEC.g:1409:3: (enumLiteral_0= '<' )
                    {
                    // InternalSLEEC.g:1409:3: (enumLiteral_0= '<' )
                    // InternalSLEEC.g:1410:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1417:3: (enumLiteral_1= '>' )
                    {
                    // InternalSLEEC.g:1417:3: (enumLiteral_1= '>' )
                    // InternalSLEEC.g:1418:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:1425:3: (enumLiteral_2= '<>' )
                    {
                    // InternalSLEEC.g:1425:3: (enumLiteral_2= '<>' )
                    // InternalSLEEC.g:1426:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSLEEC.g:1433:3: (enumLiteral_3= '<=' )
                    {
                    // InternalSLEEC.g:1433:3: (enumLiteral_3= '<=' )
                    // InternalSLEEC.g:1434:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSLEEC.g:1441:3: (enumLiteral_4= '>=' )
                    {
                    // InternalSLEEC.g:1441:3: (enumLiteral_4= '>=' )
                    // InternalSLEEC.g:1442:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSLEEC.g:1449:3: (enumLiteral_5= '=' )
                    {
                    // InternalSLEEC.g:1449:3: (enumLiteral_5= '=' )
                    // InternalSLEEC.g:1450:4: enumLiteral_5= '='
                    {
                    enumLiteral_5=(Token)match(input,18,FOLLOW_2); 

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
    // InternalSLEEC.g:1460:1: ruleBoolOp returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleBoolOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1466:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalSLEEC.g:1467:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalSLEEC.g:1467:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
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
                    // InternalSLEEC.g:1468:3: (enumLiteral_0= 'and' )
                    {
                    // InternalSLEEC.g:1468:3: (enumLiteral_0= 'and' )
                    // InternalSLEEC.g:1469:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1476:3: (enumLiteral_1= 'or' )
                    {
                    // InternalSLEEC.g:1476:3: (enumLiteral_1= 'or' )
                    // InternalSLEEC.g:1477:4: enumLiteral_1= 'or'
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


    // $ANTLR start "ruleTimeUnit"
    // InternalSLEEC.g:1487:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1493:2: ( ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) ) )
            // InternalSLEEC.g:1494:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) )
            {
            // InternalSLEEC.g:1494:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt20=1;
                }
                break;
            case 41:
                {
                alt20=2;
                }
                break;
            case 42:
                {
                alt20=3;
                }
                break;
            case 43:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalSLEEC.g:1495:3: (enumLiteral_0= 'seconds' )
                    {
                    // InternalSLEEC.g:1495:3: (enumLiteral_0= 'seconds' )
                    // InternalSLEEC.g:1496:4: enumLiteral_0= 'seconds'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1503:3: (enumLiteral_1= 'minutes' )
                    {
                    // InternalSLEEC.g:1503:3: (enumLiteral_1= 'minutes' )
                    // InternalSLEEC.g:1504:4: enumLiteral_1= 'minutes'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINUTESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMINUTESEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:1511:3: (enumLiteral_2= 'hours' )
                    {
                    // InternalSLEEC.g:1511:3: (enumLiteral_2= 'hours' )
                    // InternalSLEEC.g:1512:4: enumLiteral_2= 'hours'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOURSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getHOURSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSLEEC.g:1519:3: (enumLiteral_3= 'days' )
                    {
                    // InternalSLEEC.g:1519:3: (enumLiteral_3= 'days' )
                    // InternalSLEEC.g:1520:4: enumLiteral_3= 'days'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getDAYSEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTimeUnit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000002E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040400070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000007C00040002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000002L});

}