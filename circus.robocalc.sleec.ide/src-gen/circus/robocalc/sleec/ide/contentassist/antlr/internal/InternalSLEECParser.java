package circus.robocalc.sleec.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import circus.robocalc.sleec.services.SLEECGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSLEECParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'<>'", "'<='", "'>='", "'='", "'and'", "'or'", "'def_start'", "'def_end'", "'event'", "'measure'", "':'", "'constant'", "'boolean'", "'numeric'", "'scale'", "'('", "')'", "','", "'rule_start'", "'rule_end'", "'when'", "'then'", "'not'", "'within'", "'otherwise'", "'unless'", "'.'"
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

    	public void setGrammarAccess(SLEECGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSpecification"
    // InternalSLEEC.g:53:1: entryRuleSpecification : ruleSpecification EOF ;
    public final void entryRuleSpecification() throws RecognitionException {
        try {
            // InternalSLEEC.g:54:1: ( ruleSpecification EOF )
            // InternalSLEEC.g:55:1: ruleSpecification EOF
            {
             before(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalSLEEC.g:62:1: ruleSpecification : ( ( rule__Specification__Group__0 ) ) ;
    public final void ruleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:66:2: ( ( ( rule__Specification__Group__0 ) ) )
            // InternalSLEEC.g:67:2: ( ( rule__Specification__Group__0 ) )
            {
            // InternalSLEEC.g:67:2: ( ( rule__Specification__Group__0 ) )
            // InternalSLEEC.g:68:3: ( rule__Specification__Group__0 )
            {
             before(grammarAccess.getSpecificationAccess().getGroup()); 
            // InternalSLEEC.g:69:3: ( rule__Specification__Group__0 )
            // InternalSLEEC.g:69:4: rule__Specification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleDefblock"
    // InternalSLEEC.g:78:1: entryRuleDefblock : ruleDefblock EOF ;
    public final void entryRuleDefblock() throws RecognitionException {
        try {
            // InternalSLEEC.g:79:1: ( ruleDefblock EOF )
            // InternalSLEEC.g:80:1: ruleDefblock EOF
            {
             before(grammarAccess.getDefblockRule()); 
            pushFollow(FOLLOW_1);
            ruleDefblock();

            state._fsp--;

             after(grammarAccess.getDefblockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefblock"


    // $ANTLR start "ruleDefblock"
    // InternalSLEEC.g:87:1: ruleDefblock : ( ( rule__Defblock__Group__0 ) ) ;
    public final void ruleDefblock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:91:2: ( ( ( rule__Defblock__Group__0 ) ) )
            // InternalSLEEC.g:92:2: ( ( rule__Defblock__Group__0 ) )
            {
            // InternalSLEEC.g:92:2: ( ( rule__Defblock__Group__0 ) )
            // InternalSLEEC.g:93:3: ( rule__Defblock__Group__0 )
            {
             before(grammarAccess.getDefblockAccess().getGroup()); 
            // InternalSLEEC.g:94:3: ( rule__Defblock__Group__0 )
            // InternalSLEEC.g:94:4: rule__Defblock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Defblock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefblockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefblock"


    // $ANTLR start "entryRuleDefinition"
    // InternalSLEEC.g:103:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalSLEEC.g:104:1: ( ruleDefinition EOF )
            // InternalSLEEC.g:105:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalSLEEC.g:112:1: ruleDefinition : ( ( rule__Definition__Alternatives ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:116:2: ( ( ( rule__Definition__Alternatives ) ) )
            // InternalSLEEC.g:117:2: ( ( rule__Definition__Alternatives ) )
            {
            // InternalSLEEC.g:117:2: ( ( rule__Definition__Alternatives ) )
            // InternalSLEEC.g:118:3: ( rule__Definition__Alternatives )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives()); 
            // InternalSLEEC.g:119:3: ( rule__Definition__Alternatives )
            // InternalSLEEC.g:119:4: rule__Definition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleValue"
    // InternalSLEEC.g:128:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalSLEEC.g:129:1: ( ruleValue EOF )
            // InternalSLEEC.g:130:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalSLEEC.g:137:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:141:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalSLEEC.g:142:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalSLEEC.g:142:2: ( ( rule__Value__Alternatives ) )
            // InternalSLEEC.g:143:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalSLEEC.g:144:3: ( rule__Value__Alternatives )
            // InternalSLEEC.g:144:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleType"
    // InternalSLEEC.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSLEEC.g:154:1: ( ruleType EOF )
            // InternalSLEEC.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSLEEC.g:162:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:166:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSLEEC.g:167:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSLEEC.g:167:2: ( ( rule__Type__Alternatives ) )
            // InternalSLEEC.g:168:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSLEEC.g:169:3: ( rule__Type__Alternatives )
            // InternalSLEEC.g:169:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRuleBlock"
    // InternalSLEEC.g:178:1: entryRuleRuleBlock : ruleRuleBlock EOF ;
    public final void entryRuleRuleBlock() throws RecognitionException {
        try {
            // InternalSLEEC.g:179:1: ( ruleRuleBlock EOF )
            // InternalSLEEC.g:180:1: ruleRuleBlock EOF
            {
             before(grammarAccess.getRuleBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleBlock();

            state._fsp--;

             after(grammarAccess.getRuleBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleBlock"


    // $ANTLR start "ruleRuleBlock"
    // InternalSLEEC.g:187:1: ruleRuleBlock : ( ( rule__RuleBlock__Group__0 ) ) ;
    public final void ruleRuleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:191:2: ( ( ( rule__RuleBlock__Group__0 ) ) )
            // InternalSLEEC.g:192:2: ( ( rule__RuleBlock__Group__0 ) )
            {
            // InternalSLEEC.g:192:2: ( ( rule__RuleBlock__Group__0 ) )
            // InternalSLEEC.g:193:3: ( rule__RuleBlock__Group__0 )
            {
             before(grammarAccess.getRuleBlockAccess().getGroup()); 
            // InternalSLEEC.g:194:3: ( rule__RuleBlock__Group__0 )
            // InternalSLEEC.g:194:4: rule__RuleBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleBlock"


    // $ANTLR start "entryRuleRule"
    // InternalSLEEC.g:203:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalSLEEC.g:204:1: ( ruleRule EOF )
            // InternalSLEEC.g:205:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalSLEEC.g:212:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:216:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalSLEEC.g:217:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalSLEEC.g:217:2: ( ( rule__Rule__Group__0 ) )
            // InternalSLEEC.g:218:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalSLEEC.g:219:3: ( rule__Rule__Group__0 )
            // InternalSLEEC.g:219:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleTrigger"
    // InternalSLEEC.g:228:1: entryRuleTrigger : ruleTrigger EOF ;
    public final void entryRuleTrigger() throws RecognitionException {
        try {
            // InternalSLEEC.g:229:1: ( ruleTrigger EOF )
            // InternalSLEEC.g:230:1: ruleTrigger EOF
            {
             before(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getTriggerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalSLEEC.g:237:1: ruleTrigger : ( ( rule__Trigger__Group__0 ) ) ;
    public final void ruleTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:241:2: ( ( ( rule__Trigger__Group__0 ) ) )
            // InternalSLEEC.g:242:2: ( ( rule__Trigger__Group__0 ) )
            {
            // InternalSLEEC.g:242:2: ( ( rule__Trigger__Group__0 ) )
            // InternalSLEEC.g:243:3: ( rule__Trigger__Group__0 )
            {
             before(grammarAccess.getTriggerAccess().getGroup()); 
            // InternalSLEEC.g:244:3: ( rule__Trigger__Group__0 )
            // InternalSLEEC.g:244:4: rule__Trigger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleMBoolExpr"
    // InternalSLEEC.g:253:1: entryRuleMBoolExpr : ruleMBoolExpr EOF ;
    public final void entryRuleMBoolExpr() throws RecognitionException {
        try {
            // InternalSLEEC.g:254:1: ( ruleMBoolExpr EOF )
            // InternalSLEEC.g:255:1: ruleMBoolExpr EOF
            {
             before(grammarAccess.getMBoolExprRule()); 
            pushFollow(FOLLOW_1);
            ruleMBoolExpr();

            state._fsp--;

             after(grammarAccess.getMBoolExprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMBoolExpr"


    // $ANTLR start "ruleMBoolExpr"
    // InternalSLEEC.g:262:1: ruleMBoolExpr : ( ruleBoolComp ) ;
    public final void ruleMBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:266:2: ( ( ruleBoolComp ) )
            // InternalSLEEC.g:267:2: ( ruleBoolComp )
            {
            // InternalSLEEC.g:267:2: ( ruleBoolComp )
            // InternalSLEEC.g:268:3: ruleBoolComp
            {
             before(grammarAccess.getMBoolExprAccess().getBoolCompParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleBoolComp();

            state._fsp--;

             after(grammarAccess.getMBoolExprAccess().getBoolCompParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMBoolExpr"


    // $ANTLR start "entryRuleBoolComp"
    // InternalSLEEC.g:278:1: entryRuleBoolComp : ruleBoolComp EOF ;
    public final void entryRuleBoolComp() throws RecognitionException {
        try {
            // InternalSLEEC.g:279:1: ( ruleBoolComp EOF )
            // InternalSLEEC.g:280:1: ruleBoolComp EOF
            {
             before(grammarAccess.getBoolCompRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolComp();

            state._fsp--;

             after(grammarAccess.getBoolCompRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolComp"


    // $ANTLR start "ruleBoolComp"
    // InternalSLEEC.g:287:1: ruleBoolComp : ( ( rule__BoolComp__Group__0 ) ) ;
    public final void ruleBoolComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:291:2: ( ( ( rule__BoolComp__Group__0 ) ) )
            // InternalSLEEC.g:292:2: ( ( rule__BoolComp__Group__0 ) )
            {
            // InternalSLEEC.g:292:2: ( ( rule__BoolComp__Group__0 ) )
            // InternalSLEEC.g:293:3: ( rule__BoolComp__Group__0 )
            {
             before(grammarAccess.getBoolCompAccess().getGroup()); 
            // InternalSLEEC.g:294:3: ( rule__BoolComp__Group__0 )
            // InternalSLEEC.g:294:4: rule__BoolComp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoolComp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolCompAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolComp"


    // $ANTLR start "entryRuleNot"
    // InternalSLEEC.g:303:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalSLEEC.g:304:1: ( ruleNot EOF )
            // InternalSLEEC.g:305:1: ruleNot EOF
            {
             before(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getNotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalSLEEC.g:312:1: ruleNot : ( ( rule__Not__Alternatives ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:316:2: ( ( ( rule__Not__Alternatives ) ) )
            // InternalSLEEC.g:317:2: ( ( rule__Not__Alternatives ) )
            {
            // InternalSLEEC.g:317:2: ( ( rule__Not__Alternatives ) )
            // InternalSLEEC.g:318:3: ( rule__Not__Alternatives )
            {
             before(grammarAccess.getNotAccess().getAlternatives()); 
            // InternalSLEEC.g:319:3: ( rule__Not__Alternatives )
            // InternalSLEEC.g:319:4: rule__Not__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Not__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleRelComp"
    // InternalSLEEC.g:328:1: entryRuleRelComp : ruleRelComp EOF ;
    public final void entryRuleRelComp() throws RecognitionException {
        try {
            // InternalSLEEC.g:329:1: ( ruleRelComp EOF )
            // InternalSLEEC.g:330:1: ruleRelComp EOF
            {
             before(grammarAccess.getRelCompRule()); 
            pushFollow(FOLLOW_1);
            ruleRelComp();

            state._fsp--;

             after(grammarAccess.getRelCompRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelComp"


    // $ANTLR start "ruleRelComp"
    // InternalSLEEC.g:337:1: ruleRelComp : ( ( rule__RelComp__Group__0 ) ) ;
    public final void ruleRelComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:341:2: ( ( ( rule__RelComp__Group__0 ) ) )
            // InternalSLEEC.g:342:2: ( ( rule__RelComp__Group__0 ) )
            {
            // InternalSLEEC.g:342:2: ( ( rule__RelComp__Group__0 ) )
            // InternalSLEEC.g:343:3: ( rule__RelComp__Group__0 )
            {
             before(grammarAccess.getRelCompAccess().getGroup()); 
            // InternalSLEEC.g:344:3: ( rule__RelComp__Group__0 )
            // InternalSLEEC.g:344:4: rule__RelComp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelComp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelCompAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelComp"


    // $ANTLR start "entryRuleAtom"
    // InternalSLEEC.g:353:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalSLEEC.g:354:1: ( ruleAtom EOF )
            // InternalSLEEC.g:355:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalSLEEC.g:362:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:366:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalSLEEC.g:367:2: ( ( rule__Atom__Alternatives ) )
            {
            // InternalSLEEC.g:367:2: ( ( rule__Atom__Alternatives ) )
            // InternalSLEEC.g:368:3: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // InternalSLEEC.g:369:3: ( rule__Atom__Alternatives )
            // InternalSLEEC.g:369:4: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleResponse"
    // InternalSLEEC.g:378:1: entryRuleResponse : ruleResponse EOF ;
    public final void entryRuleResponse() throws RecognitionException {
        try {
            // InternalSLEEC.g:379:1: ( ruleResponse EOF )
            // InternalSLEEC.g:380:1: ruleResponse EOF
            {
             before(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getResponseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalSLEEC.g:387:1: ruleResponse : ( ( rule__Response__Alternatives ) ) ;
    public final void ruleResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:391:2: ( ( ( rule__Response__Alternatives ) ) )
            // InternalSLEEC.g:392:2: ( ( rule__Response__Alternatives ) )
            {
            // InternalSLEEC.g:392:2: ( ( rule__Response__Alternatives ) )
            // InternalSLEEC.g:393:3: ( rule__Response__Alternatives )
            {
             before(grammarAccess.getResponseAccess().getAlternatives()); 
            // InternalSLEEC.g:394:3: ( rule__Response__Alternatives )
            // InternalSLEEC.g:394:4: rule__Response__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Response__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleDefeater"
    // InternalSLEEC.g:403:1: entryRuleDefeater : ruleDefeater EOF ;
    public final void entryRuleDefeater() throws RecognitionException {
        try {
            // InternalSLEEC.g:404:1: ( ruleDefeater EOF )
            // InternalSLEEC.g:405:1: ruleDefeater EOF
            {
             before(grammarAccess.getDefeaterRule()); 
            pushFollow(FOLLOW_1);
            ruleDefeater();

            state._fsp--;

             after(grammarAccess.getDefeaterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefeater"


    // $ANTLR start "ruleDefeater"
    // InternalSLEEC.g:412:1: ruleDefeater : ( ( rule__Defeater__Group__0 ) ) ;
    public final void ruleDefeater() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:416:2: ( ( ( rule__Defeater__Group__0 ) ) )
            // InternalSLEEC.g:417:2: ( ( rule__Defeater__Group__0 ) )
            {
            // InternalSLEEC.g:417:2: ( ( rule__Defeater__Group__0 ) )
            // InternalSLEEC.g:418:3: ( rule__Defeater__Group__0 )
            {
             before(grammarAccess.getDefeaterAccess().getGroup()); 
            // InternalSLEEC.g:419:3: ( rule__Defeater__Group__0 )
            // InternalSLEEC.g:419:4: rule__Defeater__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Defeater__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefeaterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefeater"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSLEEC.g:428:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSLEEC.g:429:1: ( ruleQualifiedName EOF )
            // InternalSLEEC.g:430:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSLEEC.g:437:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:441:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSLEEC.g:442:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSLEEC.g:442:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSLEEC.g:443:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSLEEC.g:444:3: ( rule__QualifiedName__Group__0 )
            // InternalSLEEC.g:444:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEventID"
    // InternalSLEEC.g:453:1: entryRuleEventID : ruleEventID EOF ;
    public final void entryRuleEventID() throws RecognitionException {
        try {
            // InternalSLEEC.g:454:1: ( ruleEventID EOF )
            // InternalSLEEC.g:455:1: ruleEventID EOF
            {
             before(grammarAccess.getEventIDRule()); 
            pushFollow(FOLLOW_1);
            ruleEventID();

            state._fsp--;

             after(grammarAccess.getEventIDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventID"


    // $ANTLR start "ruleEventID"
    // InternalSLEEC.g:462:1: ruleEventID : ( RULE_ID ) ;
    public final void ruleEventID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:466:2: ( ( RULE_ID ) )
            // InternalSLEEC.g:467:2: ( RULE_ID )
            {
            // InternalSLEEC.g:467:2: ( RULE_ID )
            // InternalSLEEC.g:468:3: RULE_ID
            {
             before(grammarAccess.getEventIDAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventIDAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventID"


    // $ANTLR start "entryRuleMeasureID"
    // InternalSLEEC.g:478:1: entryRuleMeasureID : ruleMeasureID EOF ;
    public final void entryRuleMeasureID() throws RecognitionException {
        try {
            // InternalSLEEC.g:479:1: ( ruleMeasureID EOF )
            // InternalSLEEC.g:480:1: ruleMeasureID EOF
            {
             before(grammarAccess.getMeasureIDRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasureID();

            state._fsp--;

             after(grammarAccess.getMeasureIDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasureID"


    // $ANTLR start "ruleMeasureID"
    // InternalSLEEC.g:487:1: ruleMeasureID : ( RULE_ID ) ;
    public final void ruleMeasureID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:491:2: ( ( RULE_ID ) )
            // InternalSLEEC.g:492:2: ( RULE_ID )
            {
            // InternalSLEEC.g:492:2: ( RULE_ID )
            // InternalSLEEC.g:493:3: RULE_ID
            {
             before(grammarAccess.getMeasureIDAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMeasureIDAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasureID"


    // $ANTLR start "entryRuleConstID"
    // InternalSLEEC.g:503:1: entryRuleConstID : ruleConstID EOF ;
    public final void entryRuleConstID() throws RecognitionException {
        try {
            // InternalSLEEC.g:504:1: ( ruleConstID EOF )
            // InternalSLEEC.g:505:1: ruleConstID EOF
            {
             before(grammarAccess.getConstIDRule()); 
            pushFollow(FOLLOW_1);
            ruleConstID();

            state._fsp--;

             after(grammarAccess.getConstIDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstID"


    // $ANTLR start "ruleConstID"
    // InternalSLEEC.g:512:1: ruleConstID : ( RULE_ID ) ;
    public final void ruleConstID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:516:2: ( ( RULE_ID ) )
            // InternalSLEEC.g:517:2: ( RULE_ID )
            {
            // InternalSLEEC.g:517:2: ( RULE_ID )
            // InternalSLEEC.g:518:3: RULE_ID
            {
             before(grammarAccess.getConstIDAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstIDAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstID"


    // $ANTLR start "entryRuleScaleParam"
    // InternalSLEEC.g:528:1: entryRuleScaleParam : ruleScaleParam EOF ;
    public final void entryRuleScaleParam() throws RecognitionException {
        try {
            // InternalSLEEC.g:529:1: ( ruleScaleParam EOF )
            // InternalSLEEC.g:530:1: ruleScaleParam EOF
            {
             before(grammarAccess.getScaleParamRule()); 
            pushFollow(FOLLOW_1);
            ruleScaleParam();

            state._fsp--;

             after(grammarAccess.getScaleParamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScaleParam"


    // $ANTLR start "ruleScaleParam"
    // InternalSLEEC.g:537:1: ruleScaleParam : ( RULE_ID ) ;
    public final void ruleScaleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:541:2: ( ( RULE_ID ) )
            // InternalSLEEC.g:542:2: ( RULE_ID )
            {
            // InternalSLEEC.g:542:2: ( RULE_ID )
            // InternalSLEEC.g:543:3: RULE_ID
            {
             before(grammarAccess.getScaleParamAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScaleParamAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScaleParam"


    // $ANTLR start "ruleRelOp"
    // InternalSLEEC.g:553:1: ruleRelOp : ( ( rule__RelOp__Alternatives ) ) ;
    public final void ruleRelOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:557:1: ( ( ( rule__RelOp__Alternatives ) ) )
            // InternalSLEEC.g:558:2: ( ( rule__RelOp__Alternatives ) )
            {
            // InternalSLEEC.g:558:2: ( ( rule__RelOp__Alternatives ) )
            // InternalSLEEC.g:559:3: ( rule__RelOp__Alternatives )
            {
             before(grammarAccess.getRelOpAccess().getAlternatives()); 
            // InternalSLEEC.g:560:3: ( rule__RelOp__Alternatives )
            // InternalSLEEC.g:560:4: rule__RelOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelOp"


    // $ANTLR start "ruleBoolOp"
    // InternalSLEEC.g:569:1: ruleBoolOp : ( ( rule__BoolOp__Alternatives ) ) ;
    public final void ruleBoolOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:573:1: ( ( ( rule__BoolOp__Alternatives ) ) )
            // InternalSLEEC.g:574:2: ( ( rule__BoolOp__Alternatives ) )
            {
            // InternalSLEEC.g:574:2: ( ( rule__BoolOp__Alternatives ) )
            // InternalSLEEC.g:575:3: ( rule__BoolOp__Alternatives )
            {
             before(grammarAccess.getBoolOpAccess().getAlternatives()); 
            // InternalSLEEC.g:576:3: ( rule__BoolOp__Alternatives )
            // InternalSLEEC.g:576:4: rule__BoolOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolOp"


    // $ANTLR start "rule__Definition__Alternatives"
    // InternalSLEEC.g:584:1: rule__Definition__Alternatives : ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:588:1: ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSLEEC.g:589:2: ( ( rule__Definition__Group_0__0 ) )
                    {
                    // InternalSLEEC.g:589:2: ( ( rule__Definition__Group_0__0 ) )
                    // InternalSLEEC.g:590:3: ( rule__Definition__Group_0__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_0()); 
                    // InternalSLEEC.g:591:3: ( rule__Definition__Group_0__0 )
                    // InternalSLEEC.g:591:4: rule__Definition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:595:2: ( ( rule__Definition__Group_1__0 ) )
                    {
                    // InternalSLEEC.g:595:2: ( ( rule__Definition__Group_1__0 ) )
                    // InternalSLEEC.g:596:3: ( rule__Definition__Group_1__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_1()); 
                    // InternalSLEEC.g:597:3: ( rule__Definition__Group_1__0 )
                    // InternalSLEEC.g:597:4: rule__Definition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:601:2: ( ( rule__Definition__Group_2__0 ) )
                    {
                    // InternalSLEEC.g:601:2: ( ( rule__Definition__Group_2__0 ) )
                    // InternalSLEEC.g:602:3: ( rule__Definition__Group_2__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_2()); 
                    // InternalSLEEC.g:603:3: ( rule__Definition__Group_2__0 )
                    // InternalSLEEC.g:603:4: rule__Definition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalSLEEC.g:611:1: rule__Value__Alternatives : ( ( ( rule__Value__IntAssignment_0 ) ) | ( ( rule__Value__FloatAssignment_1 ) ) | ( ( rule__Value__ValueAssignment_2 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:615:1: ( ( ( rule__Value__IntAssignment_0 ) ) | ( ( rule__Value__FloatAssignment_1 ) ) | ( ( rule__Value__ValueAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt2=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
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
                    // InternalSLEEC.g:616:2: ( ( rule__Value__IntAssignment_0 ) )
                    {
                    // InternalSLEEC.g:616:2: ( ( rule__Value__IntAssignment_0 ) )
                    // InternalSLEEC.g:617:3: ( rule__Value__IntAssignment_0 )
                    {
                     before(grammarAccess.getValueAccess().getIntAssignment_0()); 
                    // InternalSLEEC.g:618:3: ( rule__Value__IntAssignment_0 )
                    // InternalSLEEC.g:618:4: rule__Value__IntAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__IntAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getIntAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:622:2: ( ( rule__Value__FloatAssignment_1 ) )
                    {
                    // InternalSLEEC.g:622:2: ( ( rule__Value__FloatAssignment_1 ) )
                    // InternalSLEEC.g:623:3: ( rule__Value__FloatAssignment_1 )
                    {
                     before(grammarAccess.getValueAccess().getFloatAssignment_1()); 
                    // InternalSLEEC.g:624:3: ( rule__Value__FloatAssignment_1 )
                    // InternalSLEEC.g:624:4: rule__Value__FloatAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__FloatAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getFloatAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:628:2: ( ( rule__Value__ValueAssignment_2 ) )
                    {
                    // InternalSLEEC.g:628:2: ( ( rule__Value__ValueAssignment_2 ) )
                    // InternalSLEEC.g:629:3: ( rule__Value__ValueAssignment_2 )
                    {
                     before(grammarAccess.getValueAccess().getValueAssignment_2()); 
                    // InternalSLEEC.g:630:3: ( rule__Value__ValueAssignment_2 )
                    // InternalSLEEC.g:630:4: rule__Value__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getValueAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSLEEC.g:638:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:642:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 28:
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
                    // InternalSLEEC.g:643:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalSLEEC.g:643:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalSLEEC.g:644:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalSLEEC.g:645:3: ( rule__Type__Group_0__0 )
                    // InternalSLEEC.g:645:4: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:649:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalSLEEC.g:649:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalSLEEC.g:650:3: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalSLEEC.g:651:3: ( rule__Type__Group_1__0 )
                    // InternalSLEEC.g:651:4: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:655:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalSLEEC.g:655:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalSLEEC.g:656:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalSLEEC.g:657:3: ( rule__Type__Group_2__0 )
                    // InternalSLEEC.g:657:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Not__Alternatives"
    // InternalSLEEC.g:665:1: rule__Not__Alternatives : ( ( ( rule__Not__Group_0__0 ) ) | ( ruleRelComp ) );
    public final void rule__Not__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:669:1: ( ( ( rule__Not__Group_0__0 ) ) | ( ruleRelComp ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_FLOAT)||LA4_0==29) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSLEEC.g:670:2: ( ( rule__Not__Group_0__0 ) )
                    {
                    // InternalSLEEC.g:670:2: ( ( rule__Not__Group_0__0 ) )
                    // InternalSLEEC.g:671:3: ( rule__Not__Group_0__0 )
                    {
                     before(grammarAccess.getNotAccess().getGroup_0()); 
                    // InternalSLEEC.g:672:3: ( rule__Not__Group_0__0 )
                    // InternalSLEEC.g:672:4: rule__Not__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Not__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:676:2: ( ruleRelComp )
                    {
                    // InternalSLEEC.g:676:2: ( ruleRelComp )
                    // InternalSLEEC.g:677:3: ruleRelComp
                    {
                     before(grammarAccess.getNotAccess().getRelCompParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelComp();

                    state._fsp--;

                     after(grammarAccess.getNotAccess().getRelCompParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Alternatives"


    // $ANTLR start "rule__Atom__Alternatives"
    // InternalSLEEC.g:686:1: rule__Atom__Alternatives : ( ( ( rule__Atom__NameAssignment_0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__ValueAssignment_2 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:690:1: ( ( ( rule__Atom__NameAssignment_0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__ValueAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
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
                    // InternalSLEEC.g:691:2: ( ( rule__Atom__NameAssignment_0 ) )
                    {
                    // InternalSLEEC.g:691:2: ( ( rule__Atom__NameAssignment_0 ) )
                    // InternalSLEEC.g:692:3: ( rule__Atom__NameAssignment_0 )
                    {
                     before(grammarAccess.getAtomAccess().getNameAssignment_0()); 
                    // InternalSLEEC.g:693:3: ( rule__Atom__NameAssignment_0 )
                    // InternalSLEEC.g:693:4: rule__Atom__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:697:2: ( ( rule__Atom__Group_1__0 ) )
                    {
                    // InternalSLEEC.g:697:2: ( ( rule__Atom__Group_1__0 ) )
                    // InternalSLEEC.g:698:3: ( rule__Atom__Group_1__0 )
                    {
                     before(grammarAccess.getAtomAccess().getGroup_1()); 
                    // InternalSLEEC.g:699:3: ( rule__Atom__Group_1__0 )
                    // InternalSLEEC.g:699:4: rule__Atom__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:703:2: ( ( rule__Atom__ValueAssignment_2 ) )
                    {
                    // InternalSLEEC.g:703:2: ( ( rule__Atom__ValueAssignment_2 ) )
                    // InternalSLEEC.g:704:3: ( rule__Atom__ValueAssignment_2 )
                    {
                     before(grammarAccess.getAtomAccess().getValueAssignment_2()); 
                    // InternalSLEEC.g:705:3: ( rule__Atom__ValueAssignment_2 )
                    // InternalSLEEC.g:705:4: rule__Atom__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getValueAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__Response__Alternatives"
    // InternalSLEEC.g:713:1: rule__Response__Alternatives : ( ( ( rule__Response__Group_0__0 ) ) | ( ( rule__Response__Group_1__0 ) ) );
    public final void rule__Response__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:717:1: ( ( ( rule__Response__Group_0__0 ) ) | ( ( rule__Response__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==36) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSLEEC.g:718:2: ( ( rule__Response__Group_0__0 ) )
                    {
                    // InternalSLEEC.g:718:2: ( ( rule__Response__Group_0__0 ) )
                    // InternalSLEEC.g:719:3: ( rule__Response__Group_0__0 )
                    {
                     before(grammarAccess.getResponseAccess().getGroup_0()); 
                    // InternalSLEEC.g:720:3: ( rule__Response__Group_0__0 )
                    // InternalSLEEC.g:720:4: rule__Response__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:724:2: ( ( rule__Response__Group_1__0 ) )
                    {
                    // InternalSLEEC.g:724:2: ( ( rule__Response__Group_1__0 ) )
                    // InternalSLEEC.g:725:3: ( rule__Response__Group_1__0 )
                    {
                     before(grammarAccess.getResponseAccess().getGroup_1()); 
                    // InternalSLEEC.g:726:3: ( rule__Response__Group_1__0 )
                    // InternalSLEEC.g:726:4: rule__Response__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Alternatives"


    // $ANTLR start "rule__RelOp__Alternatives"
    // InternalSLEEC.g:734:1: rule__RelOp__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '=' ) ) );
    public final void rule__RelOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:738:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '=' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
                }
                break;
            case 16:
                {
                alt7=5;
                }
                break;
            case 17:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSLEEC.g:739:2: ( ( '<' ) )
                    {
                    // InternalSLEEC.g:739:2: ( ( '<' ) )
                    // InternalSLEEC.g:740:3: ( '<' )
                    {
                     before(grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0()); 
                    // InternalSLEEC.g:741:3: ( '<' )
                    // InternalSLEEC.g:741:4: '<'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:745:2: ( ( '>' ) )
                    {
                    // InternalSLEEC.g:745:2: ( ( '>' ) )
                    // InternalSLEEC.g:746:3: ( '>' )
                    {
                     before(grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1()); 
                    // InternalSLEEC.g:747:3: ( '>' )
                    // InternalSLEEC.g:747:4: '>'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:751:2: ( ( '<>' ) )
                    {
                    // InternalSLEEC.g:751:2: ( ( '<>' ) )
                    // InternalSLEEC.g:752:3: ( '<>' )
                    {
                     before(grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2()); 
                    // InternalSLEEC.g:753:3: ( '<>' )
                    // InternalSLEEC.g:753:4: '<>'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSLEEC.g:757:2: ( ( '<=' ) )
                    {
                    // InternalSLEEC.g:757:2: ( ( '<=' ) )
                    // InternalSLEEC.g:758:3: ( '<=' )
                    {
                     before(grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3()); 
                    // InternalSLEEC.g:759:3: ( '<=' )
                    // InternalSLEEC.g:759:4: '<='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSLEEC.g:763:2: ( ( '>=' ) )
                    {
                    // InternalSLEEC.g:763:2: ( ( '>=' ) )
                    // InternalSLEEC.g:764:3: ( '>=' )
                    {
                     before(grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4()); 
                    // InternalSLEEC.g:765:3: ( '>=' )
                    // InternalSLEEC.g:765:4: '>='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSLEEC.g:769:2: ( ( '=' ) )
                    {
                    // InternalSLEEC.g:769:2: ( ( '=' ) )
                    // InternalSLEEC.g:770:3: ( '=' )
                    {
                     before(grammarAccess.getRelOpAccess().getEQUALEnumLiteralDeclaration_5()); 
                    // InternalSLEEC.g:771:3: ( '=' )
                    // InternalSLEEC.g:771:4: '='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelOpAccess().getEQUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelOp__Alternatives"


    // $ANTLR start "rule__BoolOp__Alternatives"
    // InternalSLEEC.g:779:1: rule__BoolOp__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__BoolOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:783:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSLEEC.g:784:2: ( ( 'and' ) )
                    {
                    // InternalSLEEC.g:784:2: ( ( 'and' ) )
                    // InternalSLEEC.g:785:3: ( 'and' )
                    {
                     before(grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalSLEEC.g:786:3: ( 'and' )
                    // InternalSLEEC.g:786:4: 'and'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:790:2: ( ( 'or' ) )
                    {
                    // InternalSLEEC.g:790:2: ( ( 'or' ) )
                    // InternalSLEEC.g:791:3: ( 'or' )
                    {
                     before(grammarAccess.getBoolOpAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalSLEEC.g:792:3: ( 'or' )
                    // InternalSLEEC.g:792:4: 'or'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOpAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOp__Alternatives"


    // $ANTLR start "rule__Specification__Group__0"
    // InternalSLEEC.g:800:1: rule__Specification__Group__0 : rule__Specification__Group__0__Impl rule__Specification__Group__1 ;
    public final void rule__Specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:804:1: ( rule__Specification__Group__0__Impl rule__Specification__Group__1 )
            // InternalSLEEC.g:805:2: rule__Specification__Group__0__Impl rule__Specification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Specification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__0"


    // $ANTLR start "rule__Specification__Group__0__Impl"
    // InternalSLEEC.g:812:1: rule__Specification__Group__0__Impl : ( ( rule__Specification__DefBlockAssignment_0 ) ) ;
    public final void rule__Specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:816:1: ( ( ( rule__Specification__DefBlockAssignment_0 ) ) )
            // InternalSLEEC.g:817:1: ( ( rule__Specification__DefBlockAssignment_0 ) )
            {
            // InternalSLEEC.g:817:1: ( ( rule__Specification__DefBlockAssignment_0 ) )
            // InternalSLEEC.g:818:2: ( rule__Specification__DefBlockAssignment_0 )
            {
             before(grammarAccess.getSpecificationAccess().getDefBlockAssignment_0()); 
            // InternalSLEEC.g:819:2: ( rule__Specification__DefBlockAssignment_0 )
            // InternalSLEEC.g:819:3: rule__Specification__DefBlockAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Specification__DefBlockAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getDefBlockAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__0__Impl"


    // $ANTLR start "rule__Specification__Group__1"
    // InternalSLEEC.g:827:1: rule__Specification__Group__1 : rule__Specification__Group__1__Impl ;
    public final void rule__Specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:831:1: ( rule__Specification__Group__1__Impl )
            // InternalSLEEC.g:832:2: rule__Specification__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__1"


    // $ANTLR start "rule__Specification__Group__1__Impl"
    // InternalSLEEC.g:838:1: rule__Specification__Group__1__Impl : ( ( rule__Specification__RuleBlockAssignment_1 ) ) ;
    public final void rule__Specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:842:1: ( ( ( rule__Specification__RuleBlockAssignment_1 ) ) )
            // InternalSLEEC.g:843:1: ( ( rule__Specification__RuleBlockAssignment_1 ) )
            {
            // InternalSLEEC.g:843:1: ( ( rule__Specification__RuleBlockAssignment_1 ) )
            // InternalSLEEC.g:844:2: ( rule__Specification__RuleBlockAssignment_1 )
            {
             before(grammarAccess.getSpecificationAccess().getRuleBlockAssignment_1()); 
            // InternalSLEEC.g:845:2: ( rule__Specification__RuleBlockAssignment_1 )
            // InternalSLEEC.g:845:3: rule__Specification__RuleBlockAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Specification__RuleBlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getRuleBlockAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__1__Impl"


    // $ANTLR start "rule__Defblock__Group__0"
    // InternalSLEEC.g:854:1: rule__Defblock__Group__0 : rule__Defblock__Group__0__Impl rule__Defblock__Group__1 ;
    public final void rule__Defblock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:858:1: ( rule__Defblock__Group__0__Impl rule__Defblock__Group__1 )
            // InternalSLEEC.g:859:2: rule__Defblock__Group__0__Impl rule__Defblock__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Defblock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defblock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defblock__Group__0"


    // $ANTLR start "rule__Defblock__Group__0__Impl"
    // InternalSLEEC.g:866:1: rule__Defblock__Group__0__Impl : ( 'def_start' ) ;
    public final void rule__Defblock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:870:1: ( ( 'def_start' ) )
            // InternalSLEEC.g:871:1: ( 'def_start' )
            {
            // InternalSLEEC.g:871:1: ( 'def_start' )
            // InternalSLEEC.g:872:2: 'def_start'
            {
             before(grammarAccess.getDefblockAccess().getDef_startKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDefblockAccess().getDef_startKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defblock__Group__0__Impl"


    // $ANTLR start "rule__Defblock__Group__1"
    // InternalSLEEC.g:881:1: rule__Defblock__Group__1 : rule__Defblock__Group__1__Impl rule__Defblock__Group__2 ;
    public final void rule__Defblock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:885:1: ( rule__Defblock__Group__1__Impl rule__Defblock__Group__2 )
            // InternalSLEEC.g:886:2: rule__Defblock__Group__1__Impl rule__Defblock__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Defblock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defblock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defblock__Group__1"


    // $ANTLR start "rule__Defblock__Group__1__Impl"
    // InternalSLEEC.g:893:1: rule__Defblock__Group__1__Impl : ( ( ( rule__Defblock__DefinitionsAssignment_1 ) ) ( ( rule__Defblock__DefinitionsAssignment_1 )* ) ) ;
    public final void rule__Defblock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:897:1: ( ( ( ( rule__Defblock__DefinitionsAssignment_1 ) ) ( ( rule__Defblock__DefinitionsAssignment_1 )* ) ) )
            // InternalSLEEC.g:898:1: ( ( ( rule__Defblock__DefinitionsAssignment_1 ) ) ( ( rule__Defblock__DefinitionsAssignment_1 )* ) )
            {
            // InternalSLEEC.g:898:1: ( ( ( rule__Defblock__DefinitionsAssignment_1 ) ) ( ( rule__Defblock__DefinitionsAssignment_1 )* ) )
            // InternalSLEEC.g:899:2: ( ( rule__Defblock__DefinitionsAssignment_1 ) ) ( ( rule__Defblock__DefinitionsAssignment_1 )* )
            {
            // InternalSLEEC.g:899:2: ( ( rule__Defblock__DefinitionsAssignment_1 ) )
            // InternalSLEEC.g:900:3: ( rule__Defblock__DefinitionsAssignment_1 )
            {
             before(grammarAccess.getDefblockAccess().getDefinitionsAssignment_1()); 
            // InternalSLEEC.g:901:3: ( rule__Defblock__DefinitionsAssignment_1 )
            // InternalSLEEC.g:901:4: rule__Defblock__DefinitionsAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__Defblock__DefinitionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefblockAccess().getDefinitionsAssignment_1()); 

            }

            // InternalSLEEC.g:904:2: ( ( rule__Defblock__DefinitionsAssignment_1 )* )
            // InternalSLEEC.g:905:3: ( rule__Defblock__DefinitionsAssignment_1 )*
            {
             before(grammarAccess.getDefblockAccess().getDefinitionsAssignment_1()); 
            // InternalSLEEC.g:906:3: ( rule__Defblock__DefinitionsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=22 && LA9_0<=23)||LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSLEEC.g:906:4: rule__Defblock__DefinitionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Defblock__DefinitionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDefblockAccess().getDefinitionsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defblock__Group__1__Impl"


    // $ANTLR start "rule__Defblock__Group__2"
    // InternalSLEEC.g:915:1: rule__Defblock__Group__2 : rule__Defblock__Group__2__Impl ;
    public final void rule__Defblock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:919:1: ( rule__Defblock__Group__2__Impl )
            // InternalSLEEC.g:920:2: rule__Defblock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Defblock__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defblock__Group__2"


    // $ANTLR start "rule__Defblock__Group__2__Impl"
    // InternalSLEEC.g:926:1: rule__Defblock__Group__2__Impl : ( 'def_end' ) ;
    public final void rule__Defblock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:930:1: ( ( 'def_end' ) )
            // InternalSLEEC.g:931:1: ( 'def_end' )
            {
            // InternalSLEEC.g:931:1: ( 'def_end' )
            // InternalSLEEC.g:932:2: 'def_end'
            {
             before(grammarAccess.getDefblockAccess().getDef_endKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDefblockAccess().getDef_endKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defblock__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group_0__0"
    // InternalSLEEC.g:942:1: rule__Definition__Group_0__0 : rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 ;
    public final void rule__Definition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:946:1: ( rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 )
            // InternalSLEEC.g:947:2: rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__0"


    // $ANTLR start "rule__Definition__Group_0__0__Impl"
    // InternalSLEEC.g:954:1: rule__Definition__Group_0__0__Impl : ( () ) ;
    public final void rule__Definition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:958:1: ( ( () ) )
            // InternalSLEEC.g:959:1: ( () )
            {
            // InternalSLEEC.g:959:1: ( () )
            // InternalSLEEC.g:960:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getEventAction_0_0()); 
            // InternalSLEEC.g:961:2: ()
            // InternalSLEEC.g:961:3: 
            {
            }

             after(grammarAccess.getDefinitionAccess().getEventAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__0__Impl"


    // $ANTLR start "rule__Definition__Group_0__1"
    // InternalSLEEC.g:969:1: rule__Definition__Group_0__1 : rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 ;
    public final void rule__Definition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:973:1: ( rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 )
            // InternalSLEEC.g:974:2: rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Definition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__1"


    // $ANTLR start "rule__Definition__Group_0__1__Impl"
    // InternalSLEEC.g:981:1: rule__Definition__Group_0__1__Impl : ( 'event' ) ;
    public final void rule__Definition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:985:1: ( ( 'event' ) )
            // InternalSLEEC.g:986:1: ( 'event' )
            {
            // InternalSLEEC.g:986:1: ( 'event' )
            // InternalSLEEC.g:987:2: 'event'
            {
             before(grammarAccess.getDefinitionAccess().getEventKeyword_0_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getEventKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__1__Impl"


    // $ANTLR start "rule__Definition__Group_0__2"
    // InternalSLEEC.g:996:1: rule__Definition__Group_0__2 : rule__Definition__Group_0__2__Impl ;
    public final void rule__Definition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1000:1: ( rule__Definition__Group_0__2__Impl )
            // InternalSLEEC.g:1001:2: rule__Definition__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__2"


    // $ANTLR start "rule__Definition__Group_0__2__Impl"
    // InternalSLEEC.g:1007:1: rule__Definition__Group_0__2__Impl : ( ( rule__Definition__NameAssignment_0_2 ) ) ;
    public final void rule__Definition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1011:1: ( ( ( rule__Definition__NameAssignment_0_2 ) ) )
            // InternalSLEEC.g:1012:1: ( ( rule__Definition__NameAssignment_0_2 ) )
            {
            // InternalSLEEC.g:1012:1: ( ( rule__Definition__NameAssignment_0_2 ) )
            // InternalSLEEC.g:1013:2: ( rule__Definition__NameAssignment_0_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_0_2()); 
            // InternalSLEEC.g:1014:2: ( rule__Definition__NameAssignment_0_2 )
            // InternalSLEEC.g:1014:3: rule__Definition__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__2__Impl"


    // $ANTLR start "rule__Definition__Group_1__0"
    // InternalSLEEC.g:1023:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1027:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // InternalSLEEC.g:1028:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__0"


    // $ANTLR start "rule__Definition__Group_1__0__Impl"
    // InternalSLEEC.g:1035:1: rule__Definition__Group_1__0__Impl : ( () ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1039:1: ( ( () ) )
            // InternalSLEEC.g:1040:1: ( () )
            {
            // InternalSLEEC.g:1040:1: ( () )
            // InternalSLEEC.g:1041:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getMeasureAction_1_0()); 
            // InternalSLEEC.g:1042:2: ()
            // InternalSLEEC.g:1042:3: 
            {
            }

             after(grammarAccess.getDefinitionAccess().getMeasureAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__0__Impl"


    // $ANTLR start "rule__Definition__Group_1__1"
    // InternalSLEEC.g:1050:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1054:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // InternalSLEEC.g:1055:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Definition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__1"


    // $ANTLR start "rule__Definition__Group_1__1__Impl"
    // InternalSLEEC.g:1062:1: rule__Definition__Group_1__1__Impl : ( 'measure' ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1066:1: ( ( 'measure' ) )
            // InternalSLEEC.g:1067:1: ( 'measure' )
            {
            // InternalSLEEC.g:1067:1: ( 'measure' )
            // InternalSLEEC.g:1068:2: 'measure'
            {
             before(grammarAccess.getDefinitionAccess().getMeasureKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getMeasureKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__1__Impl"


    // $ANTLR start "rule__Definition__Group_1__2"
    // InternalSLEEC.g:1077:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1081:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // InternalSLEEC.g:1082:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__Definition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__2"


    // $ANTLR start "rule__Definition__Group_1__2__Impl"
    // InternalSLEEC.g:1089:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__NameAssignment_1_2 ) ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1093:1: ( ( ( rule__Definition__NameAssignment_1_2 ) ) )
            // InternalSLEEC.g:1094:1: ( ( rule__Definition__NameAssignment_1_2 ) )
            {
            // InternalSLEEC.g:1094:1: ( ( rule__Definition__NameAssignment_1_2 ) )
            // InternalSLEEC.g:1095:2: ( rule__Definition__NameAssignment_1_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1_2()); 
            // InternalSLEEC.g:1096:2: ( rule__Definition__NameAssignment_1_2 )
            // InternalSLEEC.g:1096:3: rule__Definition__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__2__Impl"


    // $ANTLR start "rule__Definition__Group_1__3"
    // InternalSLEEC.g:1104:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1108:1: ( rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 )
            // InternalSLEEC.g:1109:2: rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4
            {
            pushFollow(FOLLOW_11);
            rule__Definition__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__3"


    // $ANTLR start "rule__Definition__Group_1__3__Impl"
    // InternalSLEEC.g:1116:1: rule__Definition__Group_1__3__Impl : ( ':' ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1120:1: ( ( ':' ) )
            // InternalSLEEC.g:1121:1: ( ':' )
            {
            // InternalSLEEC.g:1121:1: ( ':' )
            // InternalSLEEC.g:1122:2: ':'
            {
             before(grammarAccess.getDefinitionAccess().getColonKeyword_1_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getColonKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__3__Impl"


    // $ANTLR start "rule__Definition__Group_1__4"
    // InternalSLEEC.g:1131:1: rule__Definition__Group_1__4 : rule__Definition__Group_1__4__Impl ;
    public final void rule__Definition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1135:1: ( rule__Definition__Group_1__4__Impl )
            // InternalSLEEC.g:1136:2: rule__Definition__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__4"


    // $ANTLR start "rule__Definition__Group_1__4__Impl"
    // InternalSLEEC.g:1142:1: rule__Definition__Group_1__4__Impl : ( ( rule__Definition__TypeAssignment_1_4 ) ) ;
    public final void rule__Definition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1146:1: ( ( ( rule__Definition__TypeAssignment_1_4 ) ) )
            // InternalSLEEC.g:1147:1: ( ( rule__Definition__TypeAssignment_1_4 ) )
            {
            // InternalSLEEC.g:1147:1: ( ( rule__Definition__TypeAssignment_1_4 ) )
            // InternalSLEEC.g:1148:2: ( rule__Definition__TypeAssignment_1_4 )
            {
             before(grammarAccess.getDefinitionAccess().getTypeAssignment_1_4()); 
            // InternalSLEEC.g:1149:2: ( rule__Definition__TypeAssignment_1_4 )
            // InternalSLEEC.g:1149:3: rule__Definition__TypeAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Definition__TypeAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTypeAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__4__Impl"


    // $ANTLR start "rule__Definition__Group_2__0"
    // InternalSLEEC.g:1158:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1162:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // InternalSLEEC.g:1163:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Definition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__0"


    // $ANTLR start "rule__Definition__Group_2__0__Impl"
    // InternalSLEEC.g:1170:1: rule__Definition__Group_2__0__Impl : ( () ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1174:1: ( ( () ) )
            // InternalSLEEC.g:1175:1: ( () )
            {
            // InternalSLEEC.g:1175:1: ( () )
            // InternalSLEEC.g:1176:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getConstantAction_2_0()); 
            // InternalSLEEC.g:1177:2: ()
            // InternalSLEEC.g:1177:3: 
            {
            }

             after(grammarAccess.getDefinitionAccess().getConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_2__1"
    // InternalSLEEC.g:1185:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1189:1: ( rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 )
            // InternalSLEEC.g:1190:2: rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Definition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__1"


    // $ANTLR start "rule__Definition__Group_2__1__Impl"
    // InternalSLEEC.g:1197:1: rule__Definition__Group_2__1__Impl : ( 'constant' ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1201:1: ( ( 'constant' ) )
            // InternalSLEEC.g:1202:1: ( 'constant' )
            {
            // InternalSLEEC.g:1202:1: ( 'constant' )
            // InternalSLEEC.g:1203:2: 'constant'
            {
             before(grammarAccess.getDefinitionAccess().getConstantKeyword_2_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getConstantKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__1__Impl"


    // $ANTLR start "rule__Definition__Group_2__2"
    // InternalSLEEC.g:1212:1: rule__Definition__Group_2__2 : rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 ;
    public final void rule__Definition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1216:1: ( rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 )
            // InternalSLEEC.g:1217:2: rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3
            {
            pushFollow(FOLLOW_12);
            rule__Definition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__2"


    // $ANTLR start "rule__Definition__Group_2__2__Impl"
    // InternalSLEEC.g:1224:1: rule__Definition__Group_2__2__Impl : ( ( rule__Definition__NameAssignment_2_2 ) ) ;
    public final void rule__Definition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1228:1: ( ( ( rule__Definition__NameAssignment_2_2 ) ) )
            // InternalSLEEC.g:1229:1: ( ( rule__Definition__NameAssignment_2_2 ) )
            {
            // InternalSLEEC.g:1229:1: ( ( rule__Definition__NameAssignment_2_2 ) )
            // InternalSLEEC.g:1230:2: ( rule__Definition__NameAssignment_2_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_2_2()); 
            // InternalSLEEC.g:1231:2: ( rule__Definition__NameAssignment_2_2 )
            // InternalSLEEC.g:1231:3: rule__Definition__NameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__2__Impl"


    // $ANTLR start "rule__Definition__Group_2__3"
    // InternalSLEEC.g:1239:1: rule__Definition__Group_2__3 : rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4 ;
    public final void rule__Definition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1243:1: ( rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4 )
            // InternalSLEEC.g:1244:2: rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4
            {
            pushFollow(FOLLOW_13);
            rule__Definition__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__3"


    // $ANTLR start "rule__Definition__Group_2__3__Impl"
    // InternalSLEEC.g:1251:1: rule__Definition__Group_2__3__Impl : ( '=' ) ;
    public final void rule__Definition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1255:1: ( ( '=' ) )
            // InternalSLEEC.g:1256:1: ( '=' )
            {
            // InternalSLEEC.g:1256:1: ( '=' )
            // InternalSLEEC.g:1257:2: '='
            {
             before(grammarAccess.getDefinitionAccess().getEqualsSignKeyword_2_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getEqualsSignKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__3__Impl"


    // $ANTLR start "rule__Definition__Group_2__4"
    // InternalSLEEC.g:1266:1: rule__Definition__Group_2__4 : rule__Definition__Group_2__4__Impl ;
    public final void rule__Definition__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1270:1: ( rule__Definition__Group_2__4__Impl )
            // InternalSLEEC.g:1271:2: rule__Definition__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__4"


    // $ANTLR start "rule__Definition__Group_2__4__Impl"
    // InternalSLEEC.g:1277:1: rule__Definition__Group_2__4__Impl : ( ( rule__Definition__ValueAssignment_2_4 ) ) ;
    public final void rule__Definition__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1281:1: ( ( ( rule__Definition__ValueAssignment_2_4 ) ) )
            // InternalSLEEC.g:1282:1: ( ( rule__Definition__ValueAssignment_2_4 ) )
            {
            // InternalSLEEC.g:1282:1: ( ( rule__Definition__ValueAssignment_2_4 ) )
            // InternalSLEEC.g:1283:2: ( rule__Definition__ValueAssignment_2_4 )
            {
             before(grammarAccess.getDefinitionAccess().getValueAssignment_2_4()); 
            // InternalSLEEC.g:1284:2: ( rule__Definition__ValueAssignment_2_4 )
            // InternalSLEEC.g:1284:3: rule__Definition__ValueAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ValueAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getValueAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__4__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // InternalSLEEC.g:1293:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1297:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalSLEEC.g:1298:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // InternalSLEEC.g:1305:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1309:1: ( ( () ) )
            // InternalSLEEC.g:1310:1: ( () )
            {
            // InternalSLEEC.g:1310:1: ( () )
            // InternalSLEEC.g:1311:2: ()
            {
             before(grammarAccess.getTypeAccess().getBooleanAction_0_0()); 
            // InternalSLEEC.g:1312:2: ()
            // InternalSLEEC.g:1312:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getBooleanAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // InternalSLEEC.g:1320:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1324:1: ( rule__Type__Group_0__1__Impl )
            // InternalSLEEC.g:1325:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // InternalSLEEC.g:1331:1: rule__Type__Group_0__1__Impl : ( 'boolean' ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1335:1: ( ( 'boolean' ) )
            // InternalSLEEC.g:1336:1: ( 'boolean' )
            {
            // InternalSLEEC.g:1336:1: ( 'boolean' )
            // InternalSLEEC.g:1337:2: 'boolean'
            {
             before(grammarAccess.getTypeAccess().getBooleanKeyword_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getBooleanKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalSLEEC.g:1347:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1351:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalSLEEC.g:1352:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalSLEEC.g:1359:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1363:1: ( ( () ) )
            // InternalSLEEC.g:1364:1: ( () )
            {
            // InternalSLEEC.g:1364:1: ( () )
            // InternalSLEEC.g:1365:2: ()
            {
             before(grammarAccess.getTypeAccess().getNumericAction_1_0()); 
            // InternalSLEEC.g:1366:2: ()
            // InternalSLEEC.g:1366:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getNumericAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalSLEEC.g:1374:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1378:1: ( rule__Type__Group_1__1__Impl )
            // InternalSLEEC.g:1379:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalSLEEC.g:1385:1: rule__Type__Group_1__1__Impl : ( 'numeric' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1389:1: ( ( 'numeric' ) )
            // InternalSLEEC.g:1390:1: ( 'numeric' )
            {
            // InternalSLEEC.g:1390:1: ( 'numeric' )
            // InternalSLEEC.g:1391:2: 'numeric'
            {
             before(grammarAccess.getTypeAccess().getNumericKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNumericKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalSLEEC.g:1401:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1405:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalSLEEC.g:1406:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalSLEEC.g:1413:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1417:1: ( ( () ) )
            // InternalSLEEC.g:1418:1: ( () )
            {
            // InternalSLEEC.g:1418:1: ( () )
            // InternalSLEEC.g:1419:2: ()
            {
             before(grammarAccess.getTypeAccess().getScaleAction_2_0()); 
            // InternalSLEEC.g:1420:2: ()
            // InternalSLEEC.g:1420:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getScaleAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalSLEEC.g:1428:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1432:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalSLEEC.g:1433:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalSLEEC.g:1440:1: rule__Type__Group_2__1__Impl : ( 'scale' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1444:1: ( ( 'scale' ) )
            // InternalSLEEC.g:1445:1: ( 'scale' )
            {
            // InternalSLEEC.g:1445:1: ( 'scale' )
            // InternalSLEEC.g:1446:2: 'scale'
            {
             before(grammarAccess.getTypeAccess().getScaleKeyword_2_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getScaleKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_2__2"
    // InternalSLEEC.g:1455:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl rule__Type__Group_2__3 ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1459:1: ( rule__Type__Group_2__2__Impl rule__Type__Group_2__3 )
            // InternalSLEEC.g:1460:2: rule__Type__Group_2__2__Impl rule__Type__Group_2__3
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2"


    // $ANTLR start "rule__Type__Group_2__2__Impl"
    // InternalSLEEC.g:1467:1: rule__Type__Group_2__2__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1471:1: ( ( '(' ) )
            // InternalSLEEC.g:1472:1: ( '(' )
            {
            // InternalSLEEC.g:1472:1: ( '(' )
            // InternalSLEEC.g:1473:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2__Impl"


    // $ANTLR start "rule__Type__Group_2__3"
    // InternalSLEEC.g:1482:1: rule__Type__Group_2__3 : rule__Type__Group_2__3__Impl rule__Type__Group_2__4 ;
    public final void rule__Type__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1486:1: ( rule__Type__Group_2__3__Impl rule__Type__Group_2__4 )
            // InternalSLEEC.g:1487:2: rule__Type__Group_2__3__Impl rule__Type__Group_2__4
            {
            pushFollow(FOLLOW_17);
            rule__Type__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__3"


    // $ANTLR start "rule__Type__Group_2__3__Impl"
    // InternalSLEEC.g:1494:1: rule__Type__Group_2__3__Impl : ( ( rule__Type__ScaleParamsAssignment_2_3 ) ) ;
    public final void rule__Type__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1498:1: ( ( ( rule__Type__ScaleParamsAssignment_2_3 ) ) )
            // InternalSLEEC.g:1499:1: ( ( rule__Type__ScaleParamsAssignment_2_3 ) )
            {
            // InternalSLEEC.g:1499:1: ( ( rule__Type__ScaleParamsAssignment_2_3 ) )
            // InternalSLEEC.g:1500:2: ( rule__Type__ScaleParamsAssignment_2_3 )
            {
             before(grammarAccess.getTypeAccess().getScaleParamsAssignment_2_3()); 
            // InternalSLEEC.g:1501:2: ( rule__Type__ScaleParamsAssignment_2_3 )
            // InternalSLEEC.g:1501:3: rule__Type__ScaleParamsAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__ScaleParamsAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getScaleParamsAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__3__Impl"


    // $ANTLR start "rule__Type__Group_2__4"
    // InternalSLEEC.g:1509:1: rule__Type__Group_2__4 : rule__Type__Group_2__4__Impl rule__Type__Group_2__5 ;
    public final void rule__Type__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1513:1: ( rule__Type__Group_2__4__Impl rule__Type__Group_2__5 )
            // InternalSLEEC.g:1514:2: rule__Type__Group_2__4__Impl rule__Type__Group_2__5
            {
            pushFollow(FOLLOW_17);
            rule__Type__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__4"


    // $ANTLR start "rule__Type__Group_2__4__Impl"
    // InternalSLEEC.g:1521:1: rule__Type__Group_2__4__Impl : ( ( rule__Type__Group_2_4__0 )* ) ;
    public final void rule__Type__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1525:1: ( ( ( rule__Type__Group_2_4__0 )* ) )
            // InternalSLEEC.g:1526:1: ( ( rule__Type__Group_2_4__0 )* )
            {
            // InternalSLEEC.g:1526:1: ( ( rule__Type__Group_2_4__0 )* )
            // InternalSLEEC.g:1527:2: ( rule__Type__Group_2_4__0 )*
            {
             before(grammarAccess.getTypeAccess().getGroup_2_4()); 
            // InternalSLEEC.g:1528:2: ( rule__Type__Group_2_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSLEEC.g:1528:3: rule__Type__Group_2_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Type__Group_2_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getGroup_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__4__Impl"


    // $ANTLR start "rule__Type__Group_2__5"
    // InternalSLEEC.g:1536:1: rule__Type__Group_2__5 : rule__Type__Group_2__5__Impl ;
    public final void rule__Type__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1540:1: ( rule__Type__Group_2__5__Impl )
            // InternalSLEEC.g:1541:2: rule__Type__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__5"


    // $ANTLR start "rule__Type__Group_2__5__Impl"
    // InternalSLEEC.g:1547:1: rule__Type__Group_2__5__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1551:1: ( ( ')' ) )
            // InternalSLEEC.g:1552:1: ( ')' )
            {
            // InternalSLEEC.g:1552:1: ( ')' )
            // InternalSLEEC.g:1553:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__5__Impl"


    // $ANTLR start "rule__Type__Group_2_4__0"
    // InternalSLEEC.g:1563:1: rule__Type__Group_2_4__0 : rule__Type__Group_2_4__0__Impl rule__Type__Group_2_4__1 ;
    public final void rule__Type__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1567:1: ( rule__Type__Group_2_4__0__Impl rule__Type__Group_2_4__1 )
            // InternalSLEEC.g:1568:2: rule__Type__Group_2_4__0__Impl rule__Type__Group_2_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2_4__0"


    // $ANTLR start "rule__Type__Group_2_4__0__Impl"
    // InternalSLEEC.g:1575:1: rule__Type__Group_2_4__0__Impl : ( ',' ) ;
    public final void rule__Type__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1579:1: ( ( ',' ) )
            // InternalSLEEC.g:1580:1: ( ',' )
            {
            // InternalSLEEC.g:1580:1: ( ',' )
            // InternalSLEEC.g:1581:2: ','
            {
             before(grammarAccess.getTypeAccess().getCommaKeyword_2_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getCommaKeyword_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2_4__0__Impl"


    // $ANTLR start "rule__Type__Group_2_4__1"
    // InternalSLEEC.g:1590:1: rule__Type__Group_2_4__1 : rule__Type__Group_2_4__1__Impl ;
    public final void rule__Type__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1594:1: ( rule__Type__Group_2_4__1__Impl )
            // InternalSLEEC.g:1595:2: rule__Type__Group_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2_4__1"


    // $ANTLR start "rule__Type__Group_2_4__1__Impl"
    // InternalSLEEC.g:1601:1: rule__Type__Group_2_4__1__Impl : ( ( rule__Type__ScaleParamsAssignment_2_4_1 ) ) ;
    public final void rule__Type__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1605:1: ( ( ( rule__Type__ScaleParamsAssignment_2_4_1 ) ) )
            // InternalSLEEC.g:1606:1: ( ( rule__Type__ScaleParamsAssignment_2_4_1 ) )
            {
            // InternalSLEEC.g:1606:1: ( ( rule__Type__ScaleParamsAssignment_2_4_1 ) )
            // InternalSLEEC.g:1607:2: ( rule__Type__ScaleParamsAssignment_2_4_1 )
            {
             before(grammarAccess.getTypeAccess().getScaleParamsAssignment_2_4_1()); 
            // InternalSLEEC.g:1608:2: ( rule__Type__ScaleParamsAssignment_2_4_1 )
            // InternalSLEEC.g:1608:3: rule__Type__ScaleParamsAssignment_2_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__ScaleParamsAssignment_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getScaleParamsAssignment_2_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2_4__1__Impl"


    // $ANTLR start "rule__RuleBlock__Group__0"
    // InternalSLEEC.g:1617:1: rule__RuleBlock__Group__0 : rule__RuleBlock__Group__0__Impl rule__RuleBlock__Group__1 ;
    public final void rule__RuleBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1621:1: ( rule__RuleBlock__Group__0__Impl rule__RuleBlock__Group__1 )
            // InternalSLEEC.g:1622:2: rule__RuleBlock__Group__0__Impl rule__RuleBlock__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RuleBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group__0"


    // $ANTLR start "rule__RuleBlock__Group__0__Impl"
    // InternalSLEEC.g:1629:1: rule__RuleBlock__Group__0__Impl : ( 'rule_start' ) ;
    public final void rule__RuleBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1633:1: ( ( 'rule_start' ) )
            // InternalSLEEC.g:1634:1: ( 'rule_start' )
            {
            // InternalSLEEC.g:1634:1: ( 'rule_start' )
            // InternalSLEEC.g:1635:2: 'rule_start'
            {
             before(grammarAccess.getRuleBlockAccess().getRule_startKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRuleBlockAccess().getRule_startKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group__0__Impl"


    // $ANTLR start "rule__RuleBlock__Group__1"
    // InternalSLEEC.g:1644:1: rule__RuleBlock__Group__1 : rule__RuleBlock__Group__1__Impl rule__RuleBlock__Group__2 ;
    public final void rule__RuleBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1648:1: ( rule__RuleBlock__Group__1__Impl rule__RuleBlock__Group__2 )
            // InternalSLEEC.g:1649:2: rule__RuleBlock__Group__1__Impl rule__RuleBlock__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__RuleBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group__1"


    // $ANTLR start "rule__RuleBlock__Group__1__Impl"
    // InternalSLEEC.g:1656:1: rule__RuleBlock__Group__1__Impl : ( ( ( rule__RuleBlock__RulesAssignment_1 ) ) ( ( rule__RuleBlock__RulesAssignment_1 )* ) ) ;
    public final void rule__RuleBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1660:1: ( ( ( ( rule__RuleBlock__RulesAssignment_1 ) ) ( ( rule__RuleBlock__RulesAssignment_1 )* ) ) )
            // InternalSLEEC.g:1661:1: ( ( ( rule__RuleBlock__RulesAssignment_1 ) ) ( ( rule__RuleBlock__RulesAssignment_1 )* ) )
            {
            // InternalSLEEC.g:1661:1: ( ( ( rule__RuleBlock__RulesAssignment_1 ) ) ( ( rule__RuleBlock__RulesAssignment_1 )* ) )
            // InternalSLEEC.g:1662:2: ( ( rule__RuleBlock__RulesAssignment_1 ) ) ( ( rule__RuleBlock__RulesAssignment_1 )* )
            {
            // InternalSLEEC.g:1662:2: ( ( rule__RuleBlock__RulesAssignment_1 ) )
            // InternalSLEEC.g:1663:3: ( rule__RuleBlock__RulesAssignment_1 )
            {
             before(grammarAccess.getRuleBlockAccess().getRulesAssignment_1()); 
            // InternalSLEEC.g:1664:3: ( rule__RuleBlock__RulesAssignment_1 )
            // InternalSLEEC.g:1664:4: rule__RuleBlock__RulesAssignment_1
            {
            pushFollow(FOLLOW_20);
            rule__RuleBlock__RulesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleBlockAccess().getRulesAssignment_1()); 

            }

            // InternalSLEEC.g:1667:2: ( ( rule__RuleBlock__RulesAssignment_1 )* )
            // InternalSLEEC.g:1668:3: ( rule__RuleBlock__RulesAssignment_1 )*
            {
             before(grammarAccess.getRuleBlockAccess().getRulesAssignment_1()); 
            // InternalSLEEC.g:1669:3: ( rule__RuleBlock__RulesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSLEEC.g:1669:4: rule__RuleBlock__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RuleBlock__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRuleBlockAccess().getRulesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group__1__Impl"


    // $ANTLR start "rule__RuleBlock__Group__2"
    // InternalSLEEC.g:1678:1: rule__RuleBlock__Group__2 : rule__RuleBlock__Group__2__Impl ;
    public final void rule__RuleBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1682:1: ( rule__RuleBlock__Group__2__Impl )
            // InternalSLEEC.g:1683:2: rule__RuleBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group__2"


    // $ANTLR start "rule__RuleBlock__Group__2__Impl"
    // InternalSLEEC.g:1689:1: rule__RuleBlock__Group__2__Impl : ( 'rule_end' ) ;
    public final void rule__RuleBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1693:1: ( ( 'rule_end' ) )
            // InternalSLEEC.g:1694:1: ( 'rule_end' )
            {
            // InternalSLEEC.g:1694:1: ( 'rule_end' )
            // InternalSLEEC.g:1695:2: 'rule_end'
            {
             before(grammarAccess.getRuleBlockAccess().getRule_endKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleBlockAccess().getRule_endKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalSLEEC.g:1705:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1709:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalSLEEC.g:1710:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalSLEEC.g:1717:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__NameAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1721:1: ( ( ( rule__Rule__NameAssignment_0 ) ) )
            // InternalSLEEC.g:1722:1: ( ( rule__Rule__NameAssignment_0 ) )
            {
            // InternalSLEEC.g:1722:1: ( ( rule__Rule__NameAssignment_0 ) )
            // InternalSLEEC.g:1723:2: ( rule__Rule__NameAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_0()); 
            // InternalSLEEC.g:1724:2: ( rule__Rule__NameAssignment_0 )
            // InternalSLEEC.g:1724:3: rule__Rule__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalSLEEC.g:1732:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1736:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalSLEEC.g:1737:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalSLEEC.g:1744:1: rule__Rule__Group__1__Impl : ( 'when' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1748:1: ( ( 'when' ) )
            // InternalSLEEC.g:1749:1: ( 'when' )
            {
            // InternalSLEEC.g:1749:1: ( 'when' )
            // InternalSLEEC.g:1750:2: 'when'
            {
             before(grammarAccess.getRuleAccess().getWhenKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWhenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalSLEEC.g:1759:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1763:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalSLEEC.g:1764:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalSLEEC.g:1771:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__TriggerAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1775:1: ( ( ( rule__Rule__TriggerAssignment_2 ) ) )
            // InternalSLEEC.g:1776:1: ( ( rule__Rule__TriggerAssignment_2 ) )
            {
            // InternalSLEEC.g:1776:1: ( ( rule__Rule__TriggerAssignment_2 ) )
            // InternalSLEEC.g:1777:2: ( rule__Rule__TriggerAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getTriggerAssignment_2()); 
            // InternalSLEEC.g:1778:2: ( rule__Rule__TriggerAssignment_2 )
            // InternalSLEEC.g:1778:3: rule__Rule__TriggerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TriggerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTriggerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalSLEEC.g:1786:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1790:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalSLEEC.g:1791:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalSLEEC.g:1798:1: rule__Rule__Group__3__Impl : ( 'then' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1802:1: ( ( 'then' ) )
            // InternalSLEEC.g:1803:1: ( 'then' )
            {
            // InternalSLEEC.g:1803:1: ( 'then' )
            // InternalSLEEC.g:1804:2: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getThenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalSLEEC.g:1813:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1817:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalSLEEC.g:1818:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalSLEEC.g:1825:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__ResponseAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1829:1: ( ( ( rule__Rule__ResponseAssignment_4 ) ) )
            // InternalSLEEC.g:1830:1: ( ( rule__Rule__ResponseAssignment_4 ) )
            {
            // InternalSLEEC.g:1830:1: ( ( rule__Rule__ResponseAssignment_4 ) )
            // InternalSLEEC.g:1831:2: ( rule__Rule__ResponseAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getResponseAssignment_4()); 
            // InternalSLEEC.g:1832:2: ( rule__Rule__ResponseAssignment_4 )
            // InternalSLEEC.g:1832:3: rule__Rule__ResponseAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ResponseAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getResponseAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalSLEEC.g:1840:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1844:1: ( rule__Rule__Group__5__Impl )
            // InternalSLEEC.g:1845:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalSLEEC.g:1851:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__DefeatersAssignment_5 )* ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1855:1: ( ( ( rule__Rule__DefeatersAssignment_5 )* ) )
            // InternalSLEEC.g:1856:1: ( ( rule__Rule__DefeatersAssignment_5 )* )
            {
            // InternalSLEEC.g:1856:1: ( ( rule__Rule__DefeatersAssignment_5 )* )
            // InternalSLEEC.g:1857:2: ( rule__Rule__DefeatersAssignment_5 )*
            {
             before(grammarAccess.getRuleAccess().getDefeatersAssignment_5()); 
            // InternalSLEEC.g:1858:2: ( rule__Rule__DefeatersAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSLEEC.g:1858:3: rule__Rule__DefeatersAssignment_5
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Rule__DefeatersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getDefeatersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Trigger__Group__0"
    // InternalSLEEC.g:1867:1: rule__Trigger__Group__0 : rule__Trigger__Group__0__Impl rule__Trigger__Group__1 ;
    public final void rule__Trigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1871:1: ( rule__Trigger__Group__0__Impl rule__Trigger__Group__1 )
            // InternalSLEEC.g:1872:2: rule__Trigger__Group__0__Impl rule__Trigger__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Trigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__0"


    // $ANTLR start "rule__Trigger__Group__0__Impl"
    // InternalSLEEC.g:1879:1: rule__Trigger__Group__0__Impl : ( ( rule__Trigger__EventAssignment_0 ) ) ;
    public final void rule__Trigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1883:1: ( ( ( rule__Trigger__EventAssignment_0 ) ) )
            // InternalSLEEC.g:1884:1: ( ( rule__Trigger__EventAssignment_0 ) )
            {
            // InternalSLEEC.g:1884:1: ( ( rule__Trigger__EventAssignment_0 ) )
            // InternalSLEEC.g:1885:2: ( rule__Trigger__EventAssignment_0 )
            {
             before(grammarAccess.getTriggerAccess().getEventAssignment_0()); 
            // InternalSLEEC.g:1886:2: ( rule__Trigger__EventAssignment_0 )
            // InternalSLEEC.g:1886:3: rule__Trigger__EventAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__EventAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getEventAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__0__Impl"


    // $ANTLR start "rule__Trigger__Group__1"
    // InternalSLEEC.g:1894:1: rule__Trigger__Group__1 : rule__Trigger__Group__1__Impl ;
    public final void rule__Trigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1898:1: ( rule__Trigger__Group__1__Impl )
            // InternalSLEEC.g:1899:2: rule__Trigger__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__1"


    // $ANTLR start "rule__Trigger__Group__1__Impl"
    // InternalSLEEC.g:1905:1: rule__Trigger__Group__1__Impl : ( ( rule__Trigger__Group_1__0 )? ) ;
    public final void rule__Trigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1909:1: ( ( ( rule__Trigger__Group_1__0 )? ) )
            // InternalSLEEC.g:1910:1: ( ( rule__Trigger__Group_1__0 )? )
            {
            // InternalSLEEC.g:1910:1: ( ( rule__Trigger__Group_1__0 )? )
            // InternalSLEEC.g:1911:2: ( rule__Trigger__Group_1__0 )?
            {
             before(grammarAccess.getTriggerAccess().getGroup_1()); 
            // InternalSLEEC.g:1912:2: ( rule__Trigger__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSLEEC.g:1912:3: rule__Trigger__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trigger__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTriggerAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__1__Impl"


    // $ANTLR start "rule__Trigger__Group_1__0"
    // InternalSLEEC.g:1921:1: rule__Trigger__Group_1__0 : rule__Trigger__Group_1__0__Impl rule__Trigger__Group_1__1 ;
    public final void rule__Trigger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1925:1: ( rule__Trigger__Group_1__0__Impl rule__Trigger__Group_1__1 )
            // InternalSLEEC.g:1926:2: rule__Trigger__Group_1__0__Impl rule__Trigger__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Trigger__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_1__0"


    // $ANTLR start "rule__Trigger__Group_1__0__Impl"
    // InternalSLEEC.g:1933:1: rule__Trigger__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__Trigger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1937:1: ( ( 'and' ) )
            // InternalSLEEC.g:1938:1: ( 'and' )
            {
            // InternalSLEEC.g:1938:1: ( 'and' )
            // InternalSLEEC.g:1939:2: 'and'
            {
             before(grammarAccess.getTriggerAccess().getAndKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getAndKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_1__0__Impl"


    // $ANTLR start "rule__Trigger__Group_1__1"
    // InternalSLEEC.g:1948:1: rule__Trigger__Group_1__1 : rule__Trigger__Group_1__1__Impl ;
    public final void rule__Trigger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1952:1: ( rule__Trigger__Group_1__1__Impl )
            // InternalSLEEC.g:1953:2: rule__Trigger__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_1__1"


    // $ANTLR start "rule__Trigger__Group_1__1__Impl"
    // InternalSLEEC.g:1959:1: rule__Trigger__Group_1__1__Impl : ( ( rule__Trigger__ExprAssignment_1_1 ) ) ;
    public final void rule__Trigger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1963:1: ( ( ( rule__Trigger__ExprAssignment_1_1 ) ) )
            // InternalSLEEC.g:1964:1: ( ( rule__Trigger__ExprAssignment_1_1 ) )
            {
            // InternalSLEEC.g:1964:1: ( ( rule__Trigger__ExprAssignment_1_1 ) )
            // InternalSLEEC.g:1965:2: ( rule__Trigger__ExprAssignment_1_1 )
            {
             before(grammarAccess.getTriggerAccess().getExprAssignment_1_1()); 
            // InternalSLEEC.g:1966:2: ( rule__Trigger__ExprAssignment_1_1 )
            // InternalSLEEC.g:1966:3: rule__Trigger__ExprAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__ExprAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getExprAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_1__1__Impl"


    // $ANTLR start "rule__BoolComp__Group__0"
    // InternalSLEEC.g:1975:1: rule__BoolComp__Group__0 : rule__BoolComp__Group__0__Impl rule__BoolComp__Group__1 ;
    public final void rule__BoolComp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1979:1: ( rule__BoolComp__Group__0__Impl rule__BoolComp__Group__1 )
            // InternalSLEEC.g:1980:2: rule__BoolComp__Group__0__Impl rule__BoolComp__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__BoolComp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolComp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolComp__Group__0"


    // $ANTLR start "rule__BoolComp__Group__0__Impl"
    // InternalSLEEC.g:1987:1: rule__BoolComp__Group__0__Impl : ( ruleNot ) ;
    public final void rule__BoolComp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1991:1: ( ( ruleNot ) )
            // InternalSLEEC.g:1992:1: ( ruleNot )
            {
            // InternalSLEEC.g:1992:1: ( ruleNot )
            // InternalSLEEC.g:1993:2: ruleNot
            {
             before(grammarAccess.getBoolCompAccess().getNotParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getBoolCompAccess().getNotParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolComp__Group__0__Impl"


    // $ANTLR start "rule__BoolComp__Group__1"
    // InternalSLEEC.g:2002:1: rule__BoolComp__Group__1 : rule__BoolComp__Group__1__Impl ;
    public final void rule__BoolComp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2006:1: ( rule__BoolComp__Group__1__Impl )
            // InternalSLEEC.g:2007:2: rule__BoolComp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolComp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolComp__Group__1"


    // $ANTLR start "rule__BoolComp__Group__1__Impl"
    // InternalSLEEC.g:2013:1: rule__BoolComp__Group__1__Impl : ( ( rule__BoolComp__Group_1__0 )* ) ;
    public final void rule__BoolComp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2017:1: ( ( ( rule__BoolComp__Group_1__0 )* ) )
            // InternalSLEEC.g:2018:1: ( ( rule__BoolComp__Group_1__0 )* )
            {
            // InternalSLEEC.g:2018:1: ( ( rule__BoolComp__Group_1__0 )* )
            // InternalSLEEC.g:2019:2: ( rule__BoolComp__Group_1__0 )*
            {
             before(grammarAccess.getBoolCompAccess().getGroup_1()); 
            // InternalSLEEC.g:2020:2: ( rule__BoolComp__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=18 && LA14_0<=19)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSLEEC.g:2020:3: rule__BoolComp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__BoolComp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getBoolCompAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolComp__Group__1__Impl"


    // $ANTLR start "rule__BoolComp__Group_1__0"
    // InternalSLEEC.g:2029:1: rule__BoolComp__Group_1__0 : rule__BoolComp__Group_1__0__Impl rule__BoolComp__Group_1__1 ;
    public final void rule__BoolComp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2033:1: ( rule__BoolComp__Group_1__0__Impl rule__BoolComp__Group_1__1 )
            // InternalSLEEC.g:2034:2: rule__BoolComp__Group_1__0__Impl rule__BoolComp__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__BoolComp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolComp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolComp__Group_1__0"


    // $ANTLR start "rule__BoolComp__Group_1__0__Impl"
    // InternalSLEEC.g:2041:1: rule__BoolComp__Group_1__0__Impl : ( () ) ;
    public final void rule__BoolComp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2045:1: ( ( () ) )
            // InternalSLEEC.g:2046:1: ( () )
            {
            // InternalSLEEC.g:2046:1: ( () )
            // InternalSLEEC.g:2047:2: ()
            {
             before(grammarAccess.getBoolCompAccess().getBoolCompLeftAction_1_0()); 
            // InternalSLEEC.g:2048:2: ()
            // InternalSLEEC.g:2048:3: 
            {
            }

             after(grammarAccess.getBoolCompAccess().getBoolCompLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolComp__Group_1__0__Impl"


    // $ANTLR start "rule__BoolComp__Group_1__1"
    // InternalSLEEC.g:2056:1: rule__BoolComp__Group_1__1 : rule__BoolComp__Group_1__1__Impl rule__BoolComp__Group_1__2 ;
    public final void rule__BoolComp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2060:1: ( rule__BoolComp__Group_1__1__Impl rule__BoolComp__Group_1__2 )
            // InternalSLEEC.g:2061:2: rule__BoolComp__Group_1__1__Impl rule__BoolComp__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__BoolComp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolComp__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolComp__Group_1__1"


    // $ANTLR start "rule__BoolComp__Group_1__1__Impl"
    // InternalSLEEC.g:2068:1: rule__BoolComp__Group_1__1__Impl : ( ( rule__BoolComp__OpAssignment_1_1 ) ) ;
    public final void rule__BoolComp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2072:1: ( ( ( rule__BoolComp__OpAssignment_1_1 ) ) )
            // InternalSLEEC.g:2073:1: ( ( rule__BoolComp__OpAssignment_1_1 ) )
            {
            // InternalSLEEC.g:2073:1: ( ( rule__BoolComp__OpAssignment_1_1 ) )
            // InternalSLEEC.g:2074:2: ( rule__BoolComp__OpAssignment_1_1 )
            {
             before(grammarAccess.getBoolCompAccess().getOpAssignment_1_1()); 
            // InternalSLEEC.g:2075:2: ( rule__BoolComp__OpAssignment_1_1 )
            // InternalSLEEC.g:2075:3: rule__BoolComp__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BoolComp__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBoolCompAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolComp__Group_1__1__Impl"


    // $ANTLR start "rule__BoolComp__Group_1__2"
    // InternalSLEEC.g:2083:1: rule__BoolComp__Group_1__2 : rule__BoolComp__Group_1__2__Impl ;
    public final void rule__BoolComp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2087:1: ( rule__BoolComp__Group_1__2__Impl )
            // InternalSLEEC.g:2088:2: rule__BoolComp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolComp__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolComp__Group_1__2"


    // $ANTLR start "rule__BoolComp__Group_1__2__Impl"
    // InternalSLEEC.g:2094:1: rule__BoolComp__Group_1__2__Impl : ( ( rule__BoolComp__RightAssignment_1_2 ) ) ;
    public final void rule__BoolComp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2098:1: ( ( ( rule__BoolComp__RightAssignment_1_2 ) ) )
            // InternalSLEEC.g:2099:1: ( ( rule__BoolComp__RightAssignment_1_2 ) )
            {
            // InternalSLEEC.g:2099:1: ( ( rule__BoolComp__RightAssignment_1_2 ) )
            // InternalSLEEC.g:2100:2: ( rule__BoolComp__RightAssignment_1_2 )
            {
             before(grammarAccess.getBoolCompAccess().getRightAssignment_1_2()); 
            // InternalSLEEC.g:2101:2: ( rule__BoolComp__RightAssignment_1_2 )
            // InternalSLEEC.g:2101:3: rule__BoolComp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BoolComp__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBoolCompAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolComp__Group_1__2__Impl"


    // $ANTLR start "rule__Not__Group_0__0"
    // InternalSLEEC.g:2110:1: rule__Not__Group_0__0 : rule__Not__Group_0__0__Impl rule__Not__Group_0__1 ;
    public final void rule__Not__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2114:1: ( rule__Not__Group_0__0__Impl rule__Not__Group_0__1 )
            // InternalSLEEC.g:2115:2: rule__Not__Group_0__0__Impl rule__Not__Group_0__1
            {
            pushFollow(FOLLOW_30);
            rule__Not__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__0"


    // $ANTLR start "rule__Not__Group_0__0__Impl"
    // InternalSLEEC.g:2122:1: rule__Not__Group_0__0__Impl : ( () ) ;
    public final void rule__Not__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2126:1: ( ( () ) )
            // InternalSLEEC.g:2127:1: ( () )
            {
            // InternalSLEEC.g:2127:1: ( () )
            // InternalSLEEC.g:2128:2: ()
            {
             before(grammarAccess.getNotAccess().getNotAction_0_0()); 
            // InternalSLEEC.g:2129:2: ()
            // InternalSLEEC.g:2129:3: 
            {
            }

             after(grammarAccess.getNotAccess().getNotAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__0__Impl"


    // $ANTLR start "rule__Not__Group_0__1"
    // InternalSLEEC.g:2137:1: rule__Not__Group_0__1 : rule__Not__Group_0__1__Impl rule__Not__Group_0__2 ;
    public final void rule__Not__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2141:1: ( rule__Not__Group_0__1__Impl rule__Not__Group_0__2 )
            // InternalSLEEC.g:2142:2: rule__Not__Group_0__1__Impl rule__Not__Group_0__2
            {
            pushFollow(FOLLOW_27);
            rule__Not__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__1"


    // $ANTLR start "rule__Not__Group_0__1__Impl"
    // InternalSLEEC.g:2149:1: rule__Not__Group_0__1__Impl : ( 'not' ) ;
    public final void rule__Not__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2153:1: ( ( 'not' ) )
            // InternalSLEEC.g:2154:1: ( 'not' )
            {
            // InternalSLEEC.g:2154:1: ( 'not' )
            // InternalSLEEC.g:2155:2: 'not'
            {
             before(grammarAccess.getNotAccess().getNotKeyword_0_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getNotKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__1__Impl"


    // $ANTLR start "rule__Not__Group_0__2"
    // InternalSLEEC.g:2164:1: rule__Not__Group_0__2 : rule__Not__Group_0__2__Impl ;
    public final void rule__Not__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2168:1: ( rule__Not__Group_0__2__Impl )
            // InternalSLEEC.g:2169:2: rule__Not__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__2"


    // $ANTLR start "rule__Not__Group_0__2__Impl"
    // InternalSLEEC.g:2175:1: rule__Not__Group_0__2__Impl : ( ( rule__Not__LeftAssignment_0_2 ) ) ;
    public final void rule__Not__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2179:1: ( ( ( rule__Not__LeftAssignment_0_2 ) ) )
            // InternalSLEEC.g:2180:1: ( ( rule__Not__LeftAssignment_0_2 ) )
            {
            // InternalSLEEC.g:2180:1: ( ( rule__Not__LeftAssignment_0_2 ) )
            // InternalSLEEC.g:2181:2: ( rule__Not__LeftAssignment_0_2 )
            {
             before(grammarAccess.getNotAccess().getLeftAssignment_0_2()); 
            // InternalSLEEC.g:2182:2: ( rule__Not__LeftAssignment_0_2 )
            // InternalSLEEC.g:2182:3: rule__Not__LeftAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Not__LeftAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getLeftAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__2__Impl"


    // $ANTLR start "rule__RelComp__Group__0"
    // InternalSLEEC.g:2191:1: rule__RelComp__Group__0 : rule__RelComp__Group__0__Impl rule__RelComp__Group__1 ;
    public final void rule__RelComp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2195:1: ( rule__RelComp__Group__0__Impl rule__RelComp__Group__1 )
            // InternalSLEEC.g:2196:2: rule__RelComp__Group__0__Impl rule__RelComp__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__RelComp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelComp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelComp__Group__0"


    // $ANTLR start "rule__RelComp__Group__0__Impl"
    // InternalSLEEC.g:2203:1: rule__RelComp__Group__0__Impl : ( ruleAtom ) ;
    public final void rule__RelComp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2207:1: ( ( ruleAtom ) )
            // InternalSLEEC.g:2208:1: ( ruleAtom )
            {
            // InternalSLEEC.g:2208:1: ( ruleAtom )
            // InternalSLEEC.g:2209:2: ruleAtom
            {
             before(grammarAccess.getRelCompAccess().getAtomParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getRelCompAccess().getAtomParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelComp__Group__0__Impl"


    // $ANTLR start "rule__RelComp__Group__1"
    // InternalSLEEC.g:2218:1: rule__RelComp__Group__1 : rule__RelComp__Group__1__Impl ;
    public final void rule__RelComp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2222:1: ( rule__RelComp__Group__1__Impl )
            // InternalSLEEC.g:2223:2: rule__RelComp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelComp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelComp__Group__1"


    // $ANTLR start "rule__RelComp__Group__1__Impl"
    // InternalSLEEC.g:2229:1: rule__RelComp__Group__1__Impl : ( ( rule__RelComp__Group_1__0 )* ) ;
    public final void rule__RelComp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2233:1: ( ( ( rule__RelComp__Group_1__0 )* ) )
            // InternalSLEEC.g:2234:1: ( ( rule__RelComp__Group_1__0 )* )
            {
            // InternalSLEEC.g:2234:1: ( ( rule__RelComp__Group_1__0 )* )
            // InternalSLEEC.g:2235:2: ( rule__RelComp__Group_1__0 )*
            {
             before(grammarAccess.getRelCompAccess().getGroup_1()); 
            // InternalSLEEC.g:2236:2: ( rule__RelComp__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=12 && LA15_0<=17)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSLEEC.g:2236:3: rule__RelComp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__RelComp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRelCompAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelComp__Group__1__Impl"


    // $ANTLR start "rule__RelComp__Group_1__0"
    // InternalSLEEC.g:2245:1: rule__RelComp__Group_1__0 : rule__RelComp__Group_1__0__Impl rule__RelComp__Group_1__1 ;
    public final void rule__RelComp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2249:1: ( rule__RelComp__Group_1__0__Impl rule__RelComp__Group_1__1 )
            // InternalSLEEC.g:2250:2: rule__RelComp__Group_1__0__Impl rule__RelComp__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__RelComp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelComp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelComp__Group_1__0"


    // $ANTLR start "rule__RelComp__Group_1__0__Impl"
    // InternalSLEEC.g:2257:1: rule__RelComp__Group_1__0__Impl : ( () ) ;
    public final void rule__RelComp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2261:1: ( ( () ) )
            // InternalSLEEC.g:2262:1: ( () )
            {
            // InternalSLEEC.g:2262:1: ( () )
            // InternalSLEEC.g:2263:2: ()
            {
             before(grammarAccess.getRelCompAccess().getRelCompLeftAction_1_0()); 
            // InternalSLEEC.g:2264:2: ()
            // InternalSLEEC.g:2264:3: 
            {
            }

             after(grammarAccess.getRelCompAccess().getRelCompLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelComp__Group_1__0__Impl"


    // $ANTLR start "rule__RelComp__Group_1__1"
    // InternalSLEEC.g:2272:1: rule__RelComp__Group_1__1 : rule__RelComp__Group_1__1__Impl rule__RelComp__Group_1__2 ;
    public final void rule__RelComp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2276:1: ( rule__RelComp__Group_1__1__Impl rule__RelComp__Group_1__2 )
            // InternalSLEEC.g:2277:2: rule__RelComp__Group_1__1__Impl rule__RelComp__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__RelComp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelComp__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelComp__Group_1__1"


    // $ANTLR start "rule__RelComp__Group_1__1__Impl"
    // InternalSLEEC.g:2284:1: rule__RelComp__Group_1__1__Impl : ( ( rule__RelComp__OpAssignment_1_1 ) ) ;
    public final void rule__RelComp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2288:1: ( ( ( rule__RelComp__OpAssignment_1_1 ) ) )
            // InternalSLEEC.g:2289:1: ( ( rule__RelComp__OpAssignment_1_1 ) )
            {
            // InternalSLEEC.g:2289:1: ( ( rule__RelComp__OpAssignment_1_1 ) )
            // InternalSLEEC.g:2290:2: ( rule__RelComp__OpAssignment_1_1 )
            {
             before(grammarAccess.getRelCompAccess().getOpAssignment_1_1()); 
            // InternalSLEEC.g:2291:2: ( rule__RelComp__OpAssignment_1_1 )
            // InternalSLEEC.g:2291:3: rule__RelComp__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelComp__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelCompAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelComp__Group_1__1__Impl"


    // $ANTLR start "rule__RelComp__Group_1__2"
    // InternalSLEEC.g:2299:1: rule__RelComp__Group_1__2 : rule__RelComp__Group_1__2__Impl ;
    public final void rule__RelComp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2303:1: ( rule__RelComp__Group_1__2__Impl )
            // InternalSLEEC.g:2304:2: rule__RelComp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelComp__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelComp__Group_1__2"


    // $ANTLR start "rule__RelComp__Group_1__2__Impl"
    // InternalSLEEC.g:2310:1: rule__RelComp__Group_1__2__Impl : ( ( rule__RelComp__RightAssignment_1_2 ) ) ;
    public final void rule__RelComp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2314:1: ( ( ( rule__RelComp__RightAssignment_1_2 ) ) )
            // InternalSLEEC.g:2315:1: ( ( rule__RelComp__RightAssignment_1_2 ) )
            {
            // InternalSLEEC.g:2315:1: ( ( rule__RelComp__RightAssignment_1_2 ) )
            // InternalSLEEC.g:2316:2: ( rule__RelComp__RightAssignment_1_2 )
            {
             before(grammarAccess.getRelCompAccess().getRightAssignment_1_2()); 
            // InternalSLEEC.g:2317:2: ( rule__RelComp__RightAssignment_1_2 )
            // InternalSLEEC.g:2317:3: rule__RelComp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RelComp__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRelCompAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelComp__Group_1__2__Impl"


    // $ANTLR start "rule__Atom__Group_1__0"
    // InternalSLEEC.g:2326:1: rule__Atom__Group_1__0 : rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 ;
    public final void rule__Atom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2330:1: ( rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 )
            // InternalSLEEC.g:2331:2: rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Atom__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__0"


    // $ANTLR start "rule__Atom__Group_1__0__Impl"
    // InternalSLEEC.g:2338:1: rule__Atom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2342:1: ( ( '(' ) )
            // InternalSLEEC.g:2343:1: ( '(' )
            {
            // InternalSLEEC.g:2343:1: ( '(' )
            // InternalSLEEC.g:2344:2: '('
            {
             before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__0__Impl"


    // $ANTLR start "rule__Atom__Group_1__1"
    // InternalSLEEC.g:2353:1: rule__Atom__Group_1__1 : rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 ;
    public final void rule__Atom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2357:1: ( rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 )
            // InternalSLEEC.g:2358:2: rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2
            {
            pushFollow(FOLLOW_33);
            rule__Atom__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__1"


    // $ANTLR start "rule__Atom__Group_1__1__Impl"
    // InternalSLEEC.g:2365:1: rule__Atom__Group_1__1__Impl : ( ruleMBoolExpr ) ;
    public final void rule__Atom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2369:1: ( ( ruleMBoolExpr ) )
            // InternalSLEEC.g:2370:1: ( ruleMBoolExpr )
            {
            // InternalSLEEC.g:2370:1: ( ruleMBoolExpr )
            // InternalSLEEC.g:2371:2: ruleMBoolExpr
            {
             before(grammarAccess.getAtomAccess().getMBoolExprParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleMBoolExpr();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getMBoolExprParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__1__Impl"


    // $ANTLR start "rule__Atom__Group_1__2"
    // InternalSLEEC.g:2380:1: rule__Atom__Group_1__2 : rule__Atom__Group_1__2__Impl ;
    public final void rule__Atom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2384:1: ( rule__Atom__Group_1__2__Impl )
            // InternalSLEEC.g:2385:2: rule__Atom__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__2"


    // $ANTLR start "rule__Atom__Group_1__2__Impl"
    // InternalSLEEC.g:2391:1: rule__Atom__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2395:1: ( ( ')' ) )
            // InternalSLEEC.g:2396:1: ( ')' )
            {
            // InternalSLEEC.g:2396:1: ( ')' )
            // InternalSLEEC.g:2397:2: ')'
            {
             before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__2__Impl"


    // $ANTLR start "rule__Response__Group_0__0"
    // InternalSLEEC.g:2407:1: rule__Response__Group_0__0 : rule__Response__Group_0__0__Impl rule__Response__Group_0__1 ;
    public final void rule__Response__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2411:1: ( rule__Response__Group_0__0__Impl rule__Response__Group_0__1 )
            // InternalSLEEC.g:2412:2: rule__Response__Group_0__0__Impl rule__Response__Group_0__1
            {
            pushFollow(FOLLOW_34);
            rule__Response__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0__0"


    // $ANTLR start "rule__Response__Group_0__0__Impl"
    // InternalSLEEC.g:2419:1: rule__Response__Group_0__0__Impl : ( ( rule__Response__NameAssignment_0_0 ) ) ;
    public final void rule__Response__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2423:1: ( ( ( rule__Response__NameAssignment_0_0 ) ) )
            // InternalSLEEC.g:2424:1: ( ( rule__Response__NameAssignment_0_0 ) )
            {
            // InternalSLEEC.g:2424:1: ( ( rule__Response__NameAssignment_0_0 ) )
            // InternalSLEEC.g:2425:2: ( rule__Response__NameAssignment_0_0 )
            {
             before(grammarAccess.getResponseAccess().getNameAssignment_0_0()); 
            // InternalSLEEC.g:2426:2: ( rule__Response__NameAssignment_0_0 )
            // InternalSLEEC.g:2426:3: rule__Response__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Response__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0__0__Impl"


    // $ANTLR start "rule__Response__Group_0__1"
    // InternalSLEEC.g:2434:1: rule__Response__Group_0__1 : rule__Response__Group_0__1__Impl ;
    public final void rule__Response__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2438:1: ( rule__Response__Group_0__1__Impl )
            // InternalSLEEC.g:2439:2: rule__Response__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0__1"


    // $ANTLR start "rule__Response__Group_0__1__Impl"
    // InternalSLEEC.g:2445:1: rule__Response__Group_0__1__Impl : ( ( rule__Response__Group_0_1__0 )? ) ;
    public final void rule__Response__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2449:1: ( ( ( rule__Response__Group_0_1__0 )? ) )
            // InternalSLEEC.g:2450:1: ( ( rule__Response__Group_0_1__0 )? )
            {
            // InternalSLEEC.g:2450:1: ( ( rule__Response__Group_0_1__0 )? )
            // InternalSLEEC.g:2451:2: ( rule__Response__Group_0_1__0 )?
            {
             before(grammarAccess.getResponseAccess().getGroup_0_1()); 
            // InternalSLEEC.g:2452:2: ( rule__Response__Group_0_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSLEEC.g:2452:3: rule__Response__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0__1__Impl"


    // $ANTLR start "rule__Response__Group_0_1__0"
    // InternalSLEEC.g:2461:1: rule__Response__Group_0_1__0 : rule__Response__Group_0_1__0__Impl rule__Response__Group_0_1__1 ;
    public final void rule__Response__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2465:1: ( rule__Response__Group_0_1__0__Impl rule__Response__Group_0_1__1 )
            // InternalSLEEC.g:2466:2: rule__Response__Group_0_1__0__Impl rule__Response__Group_0_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Response__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0_1__0"


    // $ANTLR start "rule__Response__Group_0_1__0__Impl"
    // InternalSLEEC.g:2473:1: rule__Response__Group_0_1__0__Impl : ( 'within' ) ;
    public final void rule__Response__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2477:1: ( ( 'within' ) )
            // InternalSLEEC.g:2478:1: ( 'within' )
            {
            // InternalSLEEC.g:2478:1: ( 'within' )
            // InternalSLEEC.g:2479:2: 'within'
            {
             before(grammarAccess.getResponseAccess().getWithinKeyword_0_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getWithinKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0_1__0__Impl"


    // $ANTLR start "rule__Response__Group_0_1__1"
    // InternalSLEEC.g:2488:1: rule__Response__Group_0_1__1 : rule__Response__Group_0_1__1__Impl rule__Response__Group_0_1__2 ;
    public final void rule__Response__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2492:1: ( rule__Response__Group_0_1__1__Impl rule__Response__Group_0_1__2 )
            // InternalSLEEC.g:2493:2: rule__Response__Group_0_1__1__Impl rule__Response__Group_0_1__2
            {
            pushFollow(FOLLOW_35);
            rule__Response__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0_1__1"


    // $ANTLR start "rule__Response__Group_0_1__1__Impl"
    // InternalSLEEC.g:2500:1: rule__Response__Group_0_1__1__Impl : ( ( rule__Response__TimeAssignment_0_1_1 ) ) ;
    public final void rule__Response__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2504:1: ( ( ( rule__Response__TimeAssignment_0_1_1 ) ) )
            // InternalSLEEC.g:2505:1: ( ( rule__Response__TimeAssignment_0_1_1 ) )
            {
            // InternalSLEEC.g:2505:1: ( ( rule__Response__TimeAssignment_0_1_1 ) )
            // InternalSLEEC.g:2506:2: ( rule__Response__TimeAssignment_0_1_1 )
            {
             before(grammarAccess.getResponseAccess().getTimeAssignment_0_1_1()); 
            // InternalSLEEC.g:2507:2: ( rule__Response__TimeAssignment_0_1_1 )
            // InternalSLEEC.g:2507:3: rule__Response__TimeAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Response__TimeAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getTimeAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0_1__1__Impl"


    // $ANTLR start "rule__Response__Group_0_1__2"
    // InternalSLEEC.g:2515:1: rule__Response__Group_0_1__2 : rule__Response__Group_0_1__2__Impl ;
    public final void rule__Response__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2519:1: ( rule__Response__Group_0_1__2__Impl )
            // InternalSLEEC.g:2520:2: rule__Response__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0_1__2"


    // $ANTLR start "rule__Response__Group_0_1__2__Impl"
    // InternalSLEEC.g:2526:1: rule__Response__Group_0_1__2__Impl : ( ( rule__Response__Group_0_1_2__0 )? ) ;
    public final void rule__Response__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2530:1: ( ( ( rule__Response__Group_0_1_2__0 )? ) )
            // InternalSLEEC.g:2531:1: ( ( rule__Response__Group_0_1_2__0 )? )
            {
            // InternalSLEEC.g:2531:1: ( ( rule__Response__Group_0_1_2__0 )? )
            // InternalSLEEC.g:2532:2: ( rule__Response__Group_0_1_2__0 )?
            {
             before(grammarAccess.getResponseAccess().getGroup_0_1_2()); 
            // InternalSLEEC.g:2533:2: ( rule__Response__Group_0_1_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSLEEC.g:2533:3: rule__Response__Group_0_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__Group_0_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseAccess().getGroup_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0_1__2__Impl"


    // $ANTLR start "rule__Response__Group_0_1_2__0"
    // InternalSLEEC.g:2542:1: rule__Response__Group_0_1_2__0 : rule__Response__Group_0_1_2__0__Impl rule__Response__Group_0_1_2__1 ;
    public final void rule__Response__Group_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2546:1: ( rule__Response__Group_0_1_2__0__Impl rule__Response__Group_0_1_2__1 )
            // InternalSLEEC.g:2547:2: rule__Response__Group_0_1_2__0__Impl rule__Response__Group_0_1_2__1
            {
            pushFollow(FOLLOW_23);
            rule__Response__Group_0_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_0_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0_1_2__0"


    // $ANTLR start "rule__Response__Group_0_1_2__0__Impl"
    // InternalSLEEC.g:2554:1: rule__Response__Group_0_1_2__0__Impl : ( 'otherwise' ) ;
    public final void rule__Response__Group_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2558:1: ( ( 'otherwise' ) )
            // InternalSLEEC.g:2559:1: ( 'otherwise' )
            {
            // InternalSLEEC.g:2559:1: ( 'otherwise' )
            // InternalSLEEC.g:2560:2: 'otherwise'
            {
             before(grammarAccess.getResponseAccess().getOtherwiseKeyword_0_1_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getOtherwiseKeyword_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0_1_2__0__Impl"


    // $ANTLR start "rule__Response__Group_0_1_2__1"
    // InternalSLEEC.g:2569:1: rule__Response__Group_0_1_2__1 : rule__Response__Group_0_1_2__1__Impl ;
    public final void rule__Response__Group_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2573:1: ( rule__Response__Group_0_1_2__1__Impl )
            // InternalSLEEC.g:2574:2: rule__Response__Group_0_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group_0_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0_1_2__1"


    // $ANTLR start "rule__Response__Group_0_1_2__1__Impl"
    // InternalSLEEC.g:2580:1: rule__Response__Group_0_1_2__1__Impl : ( ( rule__Response__ResponseAssignment_0_1_2_1 ) ) ;
    public final void rule__Response__Group_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2584:1: ( ( ( rule__Response__ResponseAssignment_0_1_2_1 ) ) )
            // InternalSLEEC.g:2585:1: ( ( rule__Response__ResponseAssignment_0_1_2_1 ) )
            {
            // InternalSLEEC.g:2585:1: ( ( rule__Response__ResponseAssignment_0_1_2_1 ) )
            // InternalSLEEC.g:2586:2: ( rule__Response__ResponseAssignment_0_1_2_1 )
            {
             before(grammarAccess.getResponseAccess().getResponseAssignment_0_1_2_1()); 
            // InternalSLEEC.g:2587:2: ( rule__Response__ResponseAssignment_0_1_2_1 )
            // InternalSLEEC.g:2587:3: rule__Response__ResponseAssignment_0_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Response__ResponseAssignment_0_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getResponseAssignment_0_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_0_1_2__1__Impl"


    // $ANTLR start "rule__Response__Group_1__0"
    // InternalSLEEC.g:2596:1: rule__Response__Group_1__0 : rule__Response__Group_1__0__Impl rule__Response__Group_1__1 ;
    public final void rule__Response__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2600:1: ( rule__Response__Group_1__0__Impl rule__Response__Group_1__1 )
            // InternalSLEEC.g:2601:2: rule__Response__Group_1__0__Impl rule__Response__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Response__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_1__0"


    // $ANTLR start "rule__Response__Group_1__0__Impl"
    // InternalSLEEC.g:2608:1: rule__Response__Group_1__0__Impl : ( ( rule__Response__NotAssignment_1_0 ) ) ;
    public final void rule__Response__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2612:1: ( ( ( rule__Response__NotAssignment_1_0 ) ) )
            // InternalSLEEC.g:2613:1: ( ( rule__Response__NotAssignment_1_0 ) )
            {
            // InternalSLEEC.g:2613:1: ( ( rule__Response__NotAssignment_1_0 ) )
            // InternalSLEEC.g:2614:2: ( rule__Response__NotAssignment_1_0 )
            {
             before(grammarAccess.getResponseAccess().getNotAssignment_1_0()); 
            // InternalSLEEC.g:2615:2: ( rule__Response__NotAssignment_1_0 )
            // InternalSLEEC.g:2615:3: rule__Response__NotAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Response__NotAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getNotAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_1__0__Impl"


    // $ANTLR start "rule__Response__Group_1__1"
    // InternalSLEEC.g:2623:1: rule__Response__Group_1__1 : rule__Response__Group_1__1__Impl rule__Response__Group_1__2 ;
    public final void rule__Response__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2627:1: ( rule__Response__Group_1__1__Impl rule__Response__Group_1__2 )
            // InternalSLEEC.g:2628:2: rule__Response__Group_1__1__Impl rule__Response__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__Response__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_1__1"


    // $ANTLR start "rule__Response__Group_1__1__Impl"
    // InternalSLEEC.g:2635:1: rule__Response__Group_1__1__Impl : ( ( rule__Response__NameAssignment_1_1 ) ) ;
    public final void rule__Response__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2639:1: ( ( ( rule__Response__NameAssignment_1_1 ) ) )
            // InternalSLEEC.g:2640:1: ( ( rule__Response__NameAssignment_1_1 ) )
            {
            // InternalSLEEC.g:2640:1: ( ( rule__Response__NameAssignment_1_1 ) )
            // InternalSLEEC.g:2641:2: ( rule__Response__NameAssignment_1_1 )
            {
             before(grammarAccess.getResponseAccess().getNameAssignment_1_1()); 
            // InternalSLEEC.g:2642:2: ( rule__Response__NameAssignment_1_1 )
            // InternalSLEEC.g:2642:3: rule__Response__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Response__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_1__1__Impl"


    // $ANTLR start "rule__Response__Group_1__2"
    // InternalSLEEC.g:2650:1: rule__Response__Group_1__2 : rule__Response__Group_1__2__Impl rule__Response__Group_1__3 ;
    public final void rule__Response__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2654:1: ( rule__Response__Group_1__2__Impl rule__Response__Group_1__3 )
            // InternalSLEEC.g:2655:2: rule__Response__Group_1__2__Impl rule__Response__Group_1__3
            {
            pushFollow(FOLLOW_13);
            rule__Response__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_1__2"


    // $ANTLR start "rule__Response__Group_1__2__Impl"
    // InternalSLEEC.g:2662:1: rule__Response__Group_1__2__Impl : ( 'within' ) ;
    public final void rule__Response__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2666:1: ( ( 'within' ) )
            // InternalSLEEC.g:2667:1: ( 'within' )
            {
            // InternalSLEEC.g:2667:1: ( 'within' )
            // InternalSLEEC.g:2668:2: 'within'
            {
             before(grammarAccess.getResponseAccess().getWithinKeyword_1_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getWithinKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_1__2__Impl"


    // $ANTLR start "rule__Response__Group_1__3"
    // InternalSLEEC.g:2677:1: rule__Response__Group_1__3 : rule__Response__Group_1__3__Impl ;
    public final void rule__Response__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2681:1: ( rule__Response__Group_1__3__Impl )
            // InternalSLEEC.g:2682:2: rule__Response__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_1__3"


    // $ANTLR start "rule__Response__Group_1__3__Impl"
    // InternalSLEEC.g:2688:1: rule__Response__Group_1__3__Impl : ( ( rule__Response__TimeAssignment_1_3 ) ) ;
    public final void rule__Response__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2692:1: ( ( ( rule__Response__TimeAssignment_1_3 ) ) )
            // InternalSLEEC.g:2693:1: ( ( rule__Response__TimeAssignment_1_3 ) )
            {
            // InternalSLEEC.g:2693:1: ( ( rule__Response__TimeAssignment_1_3 ) )
            // InternalSLEEC.g:2694:2: ( rule__Response__TimeAssignment_1_3 )
            {
             before(grammarAccess.getResponseAccess().getTimeAssignment_1_3()); 
            // InternalSLEEC.g:2695:2: ( rule__Response__TimeAssignment_1_3 )
            // InternalSLEEC.g:2695:3: rule__Response__TimeAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Response__TimeAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getTimeAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_1__3__Impl"


    // $ANTLR start "rule__Defeater__Group__0"
    // InternalSLEEC.g:2704:1: rule__Defeater__Group__0 : rule__Defeater__Group__0__Impl rule__Defeater__Group__1 ;
    public final void rule__Defeater__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2708:1: ( rule__Defeater__Group__0__Impl rule__Defeater__Group__1 )
            // InternalSLEEC.g:2709:2: rule__Defeater__Group__0__Impl rule__Defeater__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Defeater__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defeater__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defeater__Group__0"


    // $ANTLR start "rule__Defeater__Group__0__Impl"
    // InternalSLEEC.g:2716:1: rule__Defeater__Group__0__Impl : ( 'unless' ) ;
    public final void rule__Defeater__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2720:1: ( ( 'unless' ) )
            // InternalSLEEC.g:2721:1: ( 'unless' )
            {
            // InternalSLEEC.g:2721:1: ( 'unless' )
            // InternalSLEEC.g:2722:2: 'unless'
            {
             before(grammarAccess.getDefeaterAccess().getUnlessKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDefeaterAccess().getUnlessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defeater__Group__0__Impl"


    // $ANTLR start "rule__Defeater__Group__1"
    // InternalSLEEC.g:2731:1: rule__Defeater__Group__1 : rule__Defeater__Group__1__Impl rule__Defeater__Group__2 ;
    public final void rule__Defeater__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2735:1: ( rule__Defeater__Group__1__Impl rule__Defeater__Group__2 )
            // InternalSLEEC.g:2736:2: rule__Defeater__Group__1__Impl rule__Defeater__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Defeater__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defeater__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defeater__Group__1"


    // $ANTLR start "rule__Defeater__Group__1__Impl"
    // InternalSLEEC.g:2743:1: rule__Defeater__Group__1__Impl : ( ( rule__Defeater__ExprAssignment_1 ) ) ;
    public final void rule__Defeater__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2747:1: ( ( ( rule__Defeater__ExprAssignment_1 ) ) )
            // InternalSLEEC.g:2748:1: ( ( rule__Defeater__ExprAssignment_1 ) )
            {
            // InternalSLEEC.g:2748:1: ( ( rule__Defeater__ExprAssignment_1 ) )
            // InternalSLEEC.g:2749:2: ( rule__Defeater__ExprAssignment_1 )
            {
             before(grammarAccess.getDefeaterAccess().getExprAssignment_1()); 
            // InternalSLEEC.g:2750:2: ( rule__Defeater__ExprAssignment_1 )
            // InternalSLEEC.g:2750:3: rule__Defeater__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Defeater__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefeaterAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defeater__Group__1__Impl"


    // $ANTLR start "rule__Defeater__Group__2"
    // InternalSLEEC.g:2758:1: rule__Defeater__Group__2 : rule__Defeater__Group__2__Impl ;
    public final void rule__Defeater__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2762:1: ( rule__Defeater__Group__2__Impl )
            // InternalSLEEC.g:2763:2: rule__Defeater__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Defeater__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defeater__Group__2"


    // $ANTLR start "rule__Defeater__Group__2__Impl"
    // InternalSLEEC.g:2769:1: rule__Defeater__Group__2__Impl : ( ( rule__Defeater__Group_2__0 )? ) ;
    public final void rule__Defeater__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2773:1: ( ( ( rule__Defeater__Group_2__0 )? ) )
            // InternalSLEEC.g:2774:1: ( ( rule__Defeater__Group_2__0 )? )
            {
            // InternalSLEEC.g:2774:1: ( ( rule__Defeater__Group_2__0 )? )
            // InternalSLEEC.g:2775:2: ( rule__Defeater__Group_2__0 )?
            {
             before(grammarAccess.getDefeaterAccess().getGroup_2()); 
            // InternalSLEEC.g:2776:2: ( rule__Defeater__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSLEEC.g:2776:3: rule__Defeater__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Defeater__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefeaterAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defeater__Group__2__Impl"


    // $ANTLR start "rule__Defeater__Group_2__0"
    // InternalSLEEC.g:2785:1: rule__Defeater__Group_2__0 : rule__Defeater__Group_2__0__Impl rule__Defeater__Group_2__1 ;
    public final void rule__Defeater__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2789:1: ( rule__Defeater__Group_2__0__Impl rule__Defeater__Group_2__1 )
            // InternalSLEEC.g:2790:2: rule__Defeater__Group_2__0__Impl rule__Defeater__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__Defeater__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defeater__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defeater__Group_2__0"


    // $ANTLR start "rule__Defeater__Group_2__0__Impl"
    // InternalSLEEC.g:2797:1: rule__Defeater__Group_2__0__Impl : ( 'then' ) ;
    public final void rule__Defeater__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2801:1: ( ( 'then' ) )
            // InternalSLEEC.g:2802:1: ( 'then' )
            {
            // InternalSLEEC.g:2802:1: ( 'then' )
            // InternalSLEEC.g:2803:2: 'then'
            {
             before(grammarAccess.getDefeaterAccess().getThenKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDefeaterAccess().getThenKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defeater__Group_2__0__Impl"


    // $ANTLR start "rule__Defeater__Group_2__1"
    // InternalSLEEC.g:2812:1: rule__Defeater__Group_2__1 : rule__Defeater__Group_2__1__Impl ;
    public final void rule__Defeater__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2816:1: ( rule__Defeater__Group_2__1__Impl )
            // InternalSLEEC.g:2817:2: rule__Defeater__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Defeater__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defeater__Group_2__1"


    // $ANTLR start "rule__Defeater__Group_2__1__Impl"
    // InternalSLEEC.g:2823:1: rule__Defeater__Group_2__1__Impl : ( ( rule__Defeater__ResponseAssignment_2_1 ) ) ;
    public final void rule__Defeater__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2827:1: ( ( ( rule__Defeater__ResponseAssignment_2_1 ) ) )
            // InternalSLEEC.g:2828:1: ( ( rule__Defeater__ResponseAssignment_2_1 ) )
            {
            // InternalSLEEC.g:2828:1: ( ( rule__Defeater__ResponseAssignment_2_1 ) )
            // InternalSLEEC.g:2829:2: ( rule__Defeater__ResponseAssignment_2_1 )
            {
             before(grammarAccess.getDefeaterAccess().getResponseAssignment_2_1()); 
            // InternalSLEEC.g:2830:2: ( rule__Defeater__ResponseAssignment_2_1 )
            // InternalSLEEC.g:2830:3: rule__Defeater__ResponseAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Defeater__ResponseAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDefeaterAccess().getResponseAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defeater__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSLEEC.g:2839:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2843:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSLEEC.g:2844:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalSLEEC.g:2851:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2855:1: ( ( RULE_ID ) )
            // InternalSLEEC.g:2856:1: ( RULE_ID )
            {
            // InternalSLEEC.g:2856:1: ( RULE_ID )
            // InternalSLEEC.g:2857:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalSLEEC.g:2866:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2870:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSLEEC.g:2871:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalSLEEC.g:2877:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2881:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSLEEC.g:2882:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSLEEC.g:2882:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSLEEC.g:2883:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalSLEEC.g:2884:2: ( rule__QualifiedName__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSLEEC.g:2884:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalSLEEC.g:2893:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2897:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSLEEC.g:2898:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalSLEEC.g:2905:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2909:1: ( ( '.' ) )
            // InternalSLEEC.g:2910:1: ( '.' )
            {
            // InternalSLEEC.g:2910:1: ( '.' )
            // InternalSLEEC.g:2911:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalSLEEC.g:2920:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2924:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSLEEC.g:2925:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalSLEEC.g:2931:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2935:1: ( ( RULE_ID ) )
            // InternalSLEEC.g:2936:1: ( RULE_ID )
            {
            // InternalSLEEC.g:2936:1: ( RULE_ID )
            // InternalSLEEC.g:2937:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Specification__DefBlockAssignment_0"
    // InternalSLEEC.g:2947:1: rule__Specification__DefBlockAssignment_0 : ( ruleDefblock ) ;
    public final void rule__Specification__DefBlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2951:1: ( ( ruleDefblock ) )
            // InternalSLEEC.g:2952:2: ( ruleDefblock )
            {
            // InternalSLEEC.g:2952:2: ( ruleDefblock )
            // InternalSLEEC.g:2953:3: ruleDefblock
            {
             before(grammarAccess.getSpecificationAccess().getDefBlockDefblockParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefblock();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getDefBlockDefblockParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__DefBlockAssignment_0"


    // $ANTLR start "rule__Specification__RuleBlockAssignment_1"
    // InternalSLEEC.g:2962:1: rule__Specification__RuleBlockAssignment_1 : ( ruleRuleBlock ) ;
    public final void rule__Specification__RuleBlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2966:1: ( ( ruleRuleBlock ) )
            // InternalSLEEC.g:2967:2: ( ruleRuleBlock )
            {
            // InternalSLEEC.g:2967:2: ( ruleRuleBlock )
            // InternalSLEEC.g:2968:3: ruleRuleBlock
            {
             before(grammarAccess.getSpecificationAccess().getRuleBlockRuleBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleBlock();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getRuleBlockRuleBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__RuleBlockAssignment_1"


    // $ANTLR start "rule__Defblock__DefinitionsAssignment_1"
    // InternalSLEEC.g:2977:1: rule__Defblock__DefinitionsAssignment_1 : ( ruleDefinition ) ;
    public final void rule__Defblock__DefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2981:1: ( ( ruleDefinition ) )
            // InternalSLEEC.g:2982:2: ( ruleDefinition )
            {
            // InternalSLEEC.g:2982:2: ( ruleDefinition )
            // InternalSLEEC.g:2983:3: ruleDefinition
            {
             before(grammarAccess.getDefblockAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefblockAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defblock__DefinitionsAssignment_1"


    // $ANTLR start "rule__Definition__NameAssignment_0_2"
    // InternalSLEEC.g:2992:1: rule__Definition__NameAssignment_0_2 : ( ruleEventID ) ;
    public final void rule__Definition__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2996:1: ( ( ruleEventID ) )
            // InternalSLEEC.g:2997:2: ( ruleEventID )
            {
            // InternalSLEEC.g:2997:2: ( ruleEventID )
            // InternalSLEEC.g:2998:3: ruleEventID
            {
             before(grammarAccess.getDefinitionAccess().getNameEventIDParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEventID();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getNameEventIDParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_0_2"


    // $ANTLR start "rule__Definition__NameAssignment_1_2"
    // InternalSLEEC.g:3007:1: rule__Definition__NameAssignment_1_2 : ( ruleMeasureID ) ;
    public final void rule__Definition__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3011:1: ( ( ruleMeasureID ) )
            // InternalSLEEC.g:3012:2: ( ruleMeasureID )
            {
            // InternalSLEEC.g:3012:2: ( ruleMeasureID )
            // InternalSLEEC.g:3013:3: ruleMeasureID
            {
             before(grammarAccess.getDefinitionAccess().getNameMeasureIDParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMeasureID();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getNameMeasureIDParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_1_2"


    // $ANTLR start "rule__Definition__TypeAssignment_1_4"
    // InternalSLEEC.g:3022:1: rule__Definition__TypeAssignment_1_4 : ( ruleType ) ;
    public final void rule__Definition__TypeAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3026:1: ( ( ruleType ) )
            // InternalSLEEC.g:3027:2: ( ruleType )
            {
            // InternalSLEEC.g:3027:2: ( ruleType )
            // InternalSLEEC.g:3028:3: ruleType
            {
             before(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__TypeAssignment_1_4"


    // $ANTLR start "rule__Definition__NameAssignment_2_2"
    // InternalSLEEC.g:3037:1: rule__Definition__NameAssignment_2_2 : ( ruleConstID ) ;
    public final void rule__Definition__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3041:1: ( ( ruleConstID ) )
            // InternalSLEEC.g:3042:2: ( ruleConstID )
            {
            // InternalSLEEC.g:3042:2: ( ruleConstID )
            // InternalSLEEC.g:3043:3: ruleConstID
            {
             before(grammarAccess.getDefinitionAccess().getNameConstIDParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstID();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getNameConstIDParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_2_2"


    // $ANTLR start "rule__Definition__ValueAssignment_2_4"
    // InternalSLEEC.g:3052:1: rule__Definition__ValueAssignment_2_4 : ( ruleValue ) ;
    public final void rule__Definition__ValueAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3056:1: ( ( ruleValue ) )
            // InternalSLEEC.g:3057:2: ( ruleValue )
            {
            // InternalSLEEC.g:3057:2: ( ruleValue )
            // InternalSLEEC.g:3058:3: ruleValue
            {
             before(grammarAccess.getDefinitionAccess().getValueValueParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getValueValueParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ValueAssignment_2_4"


    // $ANTLR start "rule__Value__IntAssignment_0"
    // InternalSLEEC.g:3067:1: rule__Value__IntAssignment_0 : ( RULE_INT ) ;
    public final void rule__Value__IntAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3071:1: ( ( RULE_INT ) )
            // InternalSLEEC.g:3072:2: ( RULE_INT )
            {
            // InternalSLEEC.g:3072:2: ( RULE_INT )
            // InternalSLEEC.g:3073:3: RULE_INT
            {
             before(grammarAccess.getValueAccess().getIntINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getIntINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__IntAssignment_0"


    // $ANTLR start "rule__Value__FloatAssignment_1"
    // InternalSLEEC.g:3082:1: rule__Value__FloatAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__Value__FloatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3086:1: ( ( RULE_FLOAT ) )
            // InternalSLEEC.g:3087:2: ( RULE_FLOAT )
            {
            // InternalSLEEC.g:3087:2: ( RULE_FLOAT )
            // InternalSLEEC.g:3088:3: RULE_FLOAT
            {
             before(grammarAccess.getValueAccess().getFloatFLOATTerminalRuleCall_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getFloatFLOATTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__FloatAssignment_1"


    // $ANTLR start "rule__Value__ValueAssignment_2"
    // InternalSLEEC.g:3097:1: rule__Value__ValueAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Value__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3101:1: ( ( ( RULE_ID ) ) )
            // InternalSLEEC.g:3102:2: ( ( RULE_ID ) )
            {
            // InternalSLEEC.g:3102:2: ( ( RULE_ID ) )
            // InternalSLEEC.g:3103:3: ( RULE_ID )
            {
             before(grammarAccess.getValueAccess().getValueConstantCrossReference_2_0()); 
            // InternalSLEEC.g:3104:3: ( RULE_ID )
            // InternalSLEEC.g:3105:4: RULE_ID
            {
             before(grammarAccess.getValueAccess().getValueConstantIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValueConstantIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getValueAccess().getValueConstantCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueAssignment_2"


    // $ANTLR start "rule__Type__ScaleParamsAssignment_2_3"
    // InternalSLEEC.g:3116:1: rule__Type__ScaleParamsAssignment_2_3 : ( ruleScaleParam ) ;
    public final void rule__Type__ScaleParamsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3120:1: ( ( ruleScaleParam ) )
            // InternalSLEEC.g:3121:2: ( ruleScaleParam )
            {
            // InternalSLEEC.g:3121:2: ( ruleScaleParam )
            // InternalSLEEC.g:3122:3: ruleScaleParam
            {
             before(grammarAccess.getTypeAccess().getScaleParamsScaleParamParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleScaleParam();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getScaleParamsScaleParamParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ScaleParamsAssignment_2_3"


    // $ANTLR start "rule__Type__ScaleParamsAssignment_2_4_1"
    // InternalSLEEC.g:3131:1: rule__Type__ScaleParamsAssignment_2_4_1 : ( ruleScaleParam ) ;
    public final void rule__Type__ScaleParamsAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3135:1: ( ( ruleScaleParam ) )
            // InternalSLEEC.g:3136:2: ( ruleScaleParam )
            {
            // InternalSLEEC.g:3136:2: ( ruleScaleParam )
            // InternalSLEEC.g:3137:3: ruleScaleParam
            {
             before(grammarAccess.getTypeAccess().getScaleParamsScaleParamParserRuleCall_2_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScaleParam();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getScaleParamsScaleParamParserRuleCall_2_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ScaleParamsAssignment_2_4_1"


    // $ANTLR start "rule__RuleBlock__RulesAssignment_1"
    // InternalSLEEC.g:3146:1: rule__RuleBlock__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__RuleBlock__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3150:1: ( ( ruleRule ) )
            // InternalSLEEC.g:3151:2: ( ruleRule )
            {
            // InternalSLEEC.g:3151:2: ( ruleRule )
            // InternalSLEEC.g:3152:3: ruleRule
            {
             before(grammarAccess.getRuleBlockAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleBlockAccess().getRulesRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__RulesAssignment_1"


    // $ANTLR start "rule__Rule__NameAssignment_0"
    // InternalSLEEC.g:3161:1: rule__Rule__NameAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__Rule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3165:1: ( ( ruleQualifiedName ) )
            // InternalSLEEC.g:3166:2: ( ruleQualifiedName )
            {
            // InternalSLEEC.g:3166:2: ( ruleQualifiedName )
            // InternalSLEEC.g:3167:3: ruleQualifiedName
            {
             before(grammarAccess.getRuleAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getNameQualifiedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_0"


    // $ANTLR start "rule__Rule__TriggerAssignment_2"
    // InternalSLEEC.g:3176:1: rule__Rule__TriggerAssignment_2 : ( ruleTrigger ) ;
    public final void rule__Rule__TriggerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3180:1: ( ( ruleTrigger ) )
            // InternalSLEEC.g:3181:2: ( ruleTrigger )
            {
            // InternalSLEEC.g:3181:2: ( ruleTrigger )
            // InternalSLEEC.g:3182:3: ruleTrigger
            {
             before(grammarAccess.getRuleAccess().getTriggerTriggerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getTriggerTriggerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__TriggerAssignment_2"


    // $ANTLR start "rule__Rule__ResponseAssignment_4"
    // InternalSLEEC.g:3191:1: rule__Rule__ResponseAssignment_4 : ( ruleResponse ) ;
    public final void rule__Rule__ResponseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3195:1: ( ( ruleResponse ) )
            // InternalSLEEC.g:3196:2: ( ruleResponse )
            {
            // InternalSLEEC.g:3196:2: ( ruleResponse )
            // InternalSLEEC.g:3197:3: ruleResponse
            {
             before(grammarAccess.getRuleAccess().getResponseResponseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getResponseResponseParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ResponseAssignment_4"


    // $ANTLR start "rule__Rule__DefeatersAssignment_5"
    // InternalSLEEC.g:3206:1: rule__Rule__DefeatersAssignment_5 : ( ruleDefeater ) ;
    public final void rule__Rule__DefeatersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3210:1: ( ( ruleDefeater ) )
            // InternalSLEEC.g:3211:2: ( ruleDefeater )
            {
            // InternalSLEEC.g:3211:2: ( ruleDefeater )
            // InternalSLEEC.g:3212:3: ruleDefeater
            {
             before(grammarAccess.getRuleAccess().getDefeatersDefeaterParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDefeater();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDefeatersDefeaterParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__DefeatersAssignment_5"


    // $ANTLR start "rule__Trigger__EventAssignment_0"
    // InternalSLEEC.g:3221:1: rule__Trigger__EventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Trigger__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3225:1: ( ( ( RULE_ID ) ) )
            // InternalSLEEC.g:3226:2: ( ( RULE_ID ) )
            {
            // InternalSLEEC.g:3226:2: ( ( RULE_ID ) )
            // InternalSLEEC.g:3227:3: ( RULE_ID )
            {
             before(grammarAccess.getTriggerAccess().getEventEventCrossReference_0_0()); 
            // InternalSLEEC.g:3228:3: ( RULE_ID )
            // InternalSLEEC.g:3229:4: RULE_ID
            {
             before(grammarAccess.getTriggerAccess().getEventEventIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getEventEventIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTriggerAccess().getEventEventCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__EventAssignment_0"


    // $ANTLR start "rule__Trigger__ExprAssignment_1_1"
    // InternalSLEEC.g:3240:1: rule__Trigger__ExprAssignment_1_1 : ( ruleMBoolExpr ) ;
    public final void rule__Trigger__ExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3244:1: ( ( ruleMBoolExpr ) )
            // InternalSLEEC.g:3245:2: ( ruleMBoolExpr )
            {
            // InternalSLEEC.g:3245:2: ( ruleMBoolExpr )
            // InternalSLEEC.g:3246:3: ruleMBoolExpr
            {
             before(grammarAccess.getTriggerAccess().getExprMBoolExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMBoolExpr();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getExprMBoolExprParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__ExprAssignment_1_1"


    // $ANTLR start "rule__BoolComp__OpAssignment_1_1"
    // InternalSLEEC.g:3255:1: rule__BoolComp__OpAssignment_1_1 : ( ruleBoolOp ) ;
    public final void rule__BoolComp__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3259:1: ( ( ruleBoolOp ) )
            // InternalSLEEC.g:3260:2: ( ruleBoolOp )
            {
            // InternalSLEEC.g:3260:2: ( ruleBoolOp )
            // InternalSLEEC.g:3261:3: ruleBoolOp
            {
             before(grammarAccess.getBoolCompAccess().getOpBoolOpEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolOp();

            state._fsp--;

             after(grammarAccess.getBoolCompAccess().getOpBoolOpEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolComp__OpAssignment_1_1"


    // $ANTLR start "rule__BoolComp__RightAssignment_1_2"
    // InternalSLEEC.g:3270:1: rule__BoolComp__RightAssignment_1_2 : ( ruleNot ) ;
    public final void rule__BoolComp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3274:1: ( ( ruleNot ) )
            // InternalSLEEC.g:3275:2: ( ruleNot )
            {
            // InternalSLEEC.g:3275:2: ( ruleNot )
            // InternalSLEEC.g:3276:3: ruleNot
            {
             before(grammarAccess.getBoolCompAccess().getRightNotParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getBoolCompAccess().getRightNotParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolComp__RightAssignment_1_2"


    // $ANTLR start "rule__Not__LeftAssignment_0_2"
    // InternalSLEEC.g:3285:1: rule__Not__LeftAssignment_0_2 : ( ruleRelComp ) ;
    public final void rule__Not__LeftAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3289:1: ( ( ruleRelComp ) )
            // InternalSLEEC.g:3290:2: ( ruleRelComp )
            {
            // InternalSLEEC.g:3290:2: ( ruleRelComp )
            // InternalSLEEC.g:3291:3: ruleRelComp
            {
             before(grammarAccess.getNotAccess().getLeftRelCompParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelComp();

            state._fsp--;

             after(grammarAccess.getNotAccess().getLeftRelCompParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__LeftAssignment_0_2"


    // $ANTLR start "rule__RelComp__OpAssignment_1_1"
    // InternalSLEEC.g:3300:1: rule__RelComp__OpAssignment_1_1 : ( ruleRelOp ) ;
    public final void rule__RelComp__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3304:1: ( ( ruleRelOp ) )
            // InternalSLEEC.g:3305:2: ( ruleRelOp )
            {
            // InternalSLEEC.g:3305:2: ( ruleRelOp )
            // InternalSLEEC.g:3306:3: ruleRelOp
            {
             before(grammarAccess.getRelCompAccess().getOpRelOpEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelOp();

            state._fsp--;

             after(grammarAccess.getRelCompAccess().getOpRelOpEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelComp__OpAssignment_1_1"


    // $ANTLR start "rule__RelComp__RightAssignment_1_2"
    // InternalSLEEC.g:3315:1: rule__RelComp__RightAssignment_1_2 : ( ruleAtom ) ;
    public final void rule__RelComp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3319:1: ( ( ruleAtom ) )
            // InternalSLEEC.g:3320:2: ( ruleAtom )
            {
            // InternalSLEEC.g:3320:2: ( ruleAtom )
            // InternalSLEEC.g:3321:3: ruleAtom
            {
             before(grammarAccess.getRelCompAccess().getRightAtomParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getRelCompAccess().getRightAtomParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelComp__RightAssignment_1_2"


    // $ANTLR start "rule__Atom__NameAssignment_0"
    // InternalSLEEC.g:3330:1: rule__Atom__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Atom__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3334:1: ( ( RULE_ID ) )
            // InternalSLEEC.g:3335:2: ( RULE_ID )
            {
            // InternalSLEEC.g:3335:2: ( RULE_ID )
            // InternalSLEEC.g:3336:3: RULE_ID
            {
             before(grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__NameAssignment_0"


    // $ANTLR start "rule__Atom__ValueAssignment_2"
    // InternalSLEEC.g:3345:1: rule__Atom__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Atom__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3349:1: ( ( ruleValue ) )
            // InternalSLEEC.g:3350:2: ( ruleValue )
            {
            // InternalSLEEC.g:3350:2: ( ruleValue )
            // InternalSLEEC.g:3351:3: ruleValue
            {
             before(grammarAccess.getAtomAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__ValueAssignment_2"


    // $ANTLR start "rule__Response__NameAssignment_0_0"
    // InternalSLEEC.g:3360:1: rule__Response__NameAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Response__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3364:1: ( ( ( RULE_ID ) ) )
            // InternalSLEEC.g:3365:2: ( ( RULE_ID ) )
            {
            // InternalSLEEC.g:3365:2: ( ( RULE_ID ) )
            // InternalSLEEC.g:3366:3: ( RULE_ID )
            {
             before(grammarAccess.getResponseAccess().getNameEventCrossReference_0_0_0()); 
            // InternalSLEEC.g:3367:3: ( RULE_ID )
            // InternalSLEEC.g:3368:4: RULE_ID
            {
             before(grammarAccess.getResponseAccess().getNameEventIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getNameEventIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getResponseAccess().getNameEventCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__NameAssignment_0_0"


    // $ANTLR start "rule__Response__TimeAssignment_0_1_1"
    // InternalSLEEC.g:3379:1: rule__Response__TimeAssignment_0_1_1 : ( ruleValue ) ;
    public final void rule__Response__TimeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3383:1: ( ( ruleValue ) )
            // InternalSLEEC.g:3384:2: ( ruleValue )
            {
            // InternalSLEEC.g:3384:2: ( ruleValue )
            // InternalSLEEC.g:3385:3: ruleValue
            {
             before(grammarAccess.getResponseAccess().getTimeValueParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getTimeValueParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__TimeAssignment_0_1_1"


    // $ANTLR start "rule__Response__ResponseAssignment_0_1_2_1"
    // InternalSLEEC.g:3394:1: rule__Response__ResponseAssignment_0_1_2_1 : ( ruleResponse ) ;
    public final void rule__Response__ResponseAssignment_0_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3398:1: ( ( ruleResponse ) )
            // InternalSLEEC.g:3399:2: ( ruleResponse )
            {
            // InternalSLEEC.g:3399:2: ( ruleResponse )
            // InternalSLEEC.g:3400:3: ruleResponse
            {
             before(grammarAccess.getResponseAccess().getResponseResponseParserRuleCall_0_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getResponseResponseParserRuleCall_0_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__ResponseAssignment_0_1_2_1"


    // $ANTLR start "rule__Response__NotAssignment_1_0"
    // InternalSLEEC.g:3409:1: rule__Response__NotAssignment_1_0 : ( ( 'not' ) ) ;
    public final void rule__Response__NotAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3413:1: ( ( ( 'not' ) ) )
            // InternalSLEEC.g:3414:2: ( ( 'not' ) )
            {
            // InternalSLEEC.g:3414:2: ( ( 'not' ) )
            // InternalSLEEC.g:3415:3: ( 'not' )
            {
             before(grammarAccess.getResponseAccess().getNotNotKeyword_1_0_0()); 
            // InternalSLEEC.g:3416:3: ( 'not' )
            // InternalSLEEC.g:3417:4: 'not'
            {
             before(grammarAccess.getResponseAccess().getNotNotKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getNotNotKeyword_1_0_0()); 

            }

             after(grammarAccess.getResponseAccess().getNotNotKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__NotAssignment_1_0"


    // $ANTLR start "rule__Response__NameAssignment_1_1"
    // InternalSLEEC.g:3428:1: rule__Response__NameAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Response__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3432:1: ( ( ( RULE_ID ) ) )
            // InternalSLEEC.g:3433:2: ( ( RULE_ID ) )
            {
            // InternalSLEEC.g:3433:2: ( ( RULE_ID ) )
            // InternalSLEEC.g:3434:3: ( RULE_ID )
            {
             before(grammarAccess.getResponseAccess().getNameEventCrossReference_1_1_0()); 
            // InternalSLEEC.g:3435:3: ( RULE_ID )
            // InternalSLEEC.g:3436:4: RULE_ID
            {
             before(grammarAccess.getResponseAccess().getNameEventIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getNameEventIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getResponseAccess().getNameEventCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__NameAssignment_1_1"


    // $ANTLR start "rule__Response__TimeAssignment_1_3"
    // InternalSLEEC.g:3447:1: rule__Response__TimeAssignment_1_3 : ( ruleValue ) ;
    public final void rule__Response__TimeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3451:1: ( ( ruleValue ) )
            // InternalSLEEC.g:3452:2: ( ruleValue )
            {
            // InternalSLEEC.g:3452:2: ( ruleValue )
            // InternalSLEEC.g:3453:3: ruleValue
            {
             before(grammarAccess.getResponseAccess().getTimeValueParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getTimeValueParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__TimeAssignment_1_3"


    // $ANTLR start "rule__Defeater__ExprAssignment_1"
    // InternalSLEEC.g:3462:1: rule__Defeater__ExprAssignment_1 : ( ruleMBoolExpr ) ;
    public final void rule__Defeater__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3466:1: ( ( ruleMBoolExpr ) )
            // InternalSLEEC.g:3467:2: ( ruleMBoolExpr )
            {
            // InternalSLEEC.g:3467:2: ( ruleMBoolExpr )
            // InternalSLEEC.g:3468:3: ruleMBoolExpr
            {
             before(grammarAccess.getDefeaterAccess().getExprMBoolExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMBoolExpr();

            state._fsp--;

             after(grammarAccess.getDefeaterAccess().getExprMBoolExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defeater__ExprAssignment_1"


    // $ANTLR start "rule__Defeater__ResponseAssignment_2_1"
    // InternalSLEEC.g:3477:1: rule__Defeater__ResponseAssignment_2_1 : ( ruleResponse ) ;
    public final void rule__Defeater__ResponseAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3481:1: ( ( ruleResponse ) )
            // InternalSLEEC.g:3482:2: ( ruleResponse )
            {
            // InternalSLEEC.g:3482:2: ( ruleResponse )
            // InternalSLEEC.g:3483:3: ruleResponse
            {
             before(grammarAccess.getDefeaterAccess().getResponseResponseParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getDefeaterAccess().getResponseResponseParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defeater__ResponseAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002C00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002C00002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001020000070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000003F002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000002L});

}