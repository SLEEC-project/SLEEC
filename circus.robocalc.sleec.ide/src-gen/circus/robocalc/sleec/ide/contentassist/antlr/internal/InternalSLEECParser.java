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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'<>'", "'<='", "'>='", "'='", "'and'", "'or'", "'seconds'", "'minutes'", "'hours'", "'days'", "'weeks'", "'months'", "'years'", "'def_start'", "'def_end'", "'event'", "'measure'", "':'", "'constant'", "'boolean'", "'numeric'", "'scale'", "'('", "')'", "','", "'rule_start'", "'rule_end'", "'when'", "'then'", "'not'", "'within'", "'otherwise'", "'unless'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
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
    // InternalSLEEC.g:137:1: ruleValue : ( RULE_INT ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:141:2: ( ( RULE_INT ) )
            // InternalSLEEC.g:142:2: ( RULE_INT )
            {
            // InternalSLEEC.g:142:2: ( RULE_INT )
            // InternalSLEEC.g:143:3: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall()); 

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


    // $ANTLR start "entryRuleLiteral"
    // InternalSLEEC.g:178:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalSLEEC.g:179:1: ( ruleLiteral EOF )
            // InternalSLEEC.g:180:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalSLEEC.g:187:1: ruleLiteral : ( RULE_ID ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:191:2: ( ( RULE_ID ) )
            // InternalSLEEC.g:192:2: ( RULE_ID )
            {
            // InternalSLEEC.g:192:2: ( RULE_ID )
            // InternalSLEEC.g:193:3: RULE_ID
            {
             before(grammarAccess.getLiteralAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleRuleBlock"
    // InternalSLEEC.g:203:1: entryRuleRuleBlock : ruleRuleBlock EOF ;
    public final void entryRuleRuleBlock() throws RecognitionException {
        try {
            // InternalSLEEC.g:204:1: ( ruleRuleBlock EOF )
            // InternalSLEEC.g:205:1: ruleRuleBlock EOF
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
    // InternalSLEEC.g:212:1: ruleRuleBlock : ( ( rule__RuleBlock__Group__0 ) ) ;
    public final void ruleRuleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:216:2: ( ( ( rule__RuleBlock__Group__0 ) ) )
            // InternalSLEEC.g:217:2: ( ( rule__RuleBlock__Group__0 ) )
            {
            // InternalSLEEC.g:217:2: ( ( rule__RuleBlock__Group__0 ) )
            // InternalSLEEC.g:218:3: ( rule__RuleBlock__Group__0 )
            {
             before(grammarAccess.getRuleBlockAccess().getGroup()); 
            // InternalSLEEC.g:219:3: ( rule__RuleBlock__Group__0 )
            // InternalSLEEC.g:219:4: rule__RuleBlock__Group__0
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
    // InternalSLEEC.g:228:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalSLEEC.g:229:1: ( ruleRule EOF )
            // InternalSLEEC.g:230:1: ruleRule EOF
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
    // InternalSLEEC.g:237:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:241:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalSLEEC.g:242:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalSLEEC.g:242:2: ( ( rule__Rule__Group__0 ) )
            // InternalSLEEC.g:243:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalSLEEC.g:244:3: ( rule__Rule__Group__0 )
            // InternalSLEEC.g:244:4: rule__Rule__Group__0
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
    // InternalSLEEC.g:253:1: entryRuleTrigger : ruleTrigger EOF ;
    public final void entryRuleTrigger() throws RecognitionException {
        try {
            // InternalSLEEC.g:254:1: ( ruleTrigger EOF )
            // InternalSLEEC.g:255:1: ruleTrigger EOF
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
    // InternalSLEEC.g:262:1: ruleTrigger : ( ( rule__Trigger__Group__0 ) ) ;
    public final void ruleTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:266:2: ( ( ( rule__Trigger__Group__0 ) ) )
            // InternalSLEEC.g:267:2: ( ( rule__Trigger__Group__0 ) )
            {
            // InternalSLEEC.g:267:2: ( ( rule__Trigger__Group__0 ) )
            // InternalSLEEC.g:268:3: ( rule__Trigger__Group__0 )
            {
             before(grammarAccess.getTriggerAccess().getGroup()); 
            // InternalSLEEC.g:269:3: ( rule__Trigger__Group__0 )
            // InternalSLEEC.g:269:4: rule__Trigger__Group__0
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
    // InternalSLEEC.g:278:1: entryRuleMBoolExpr : ruleMBoolExpr EOF ;
    public final void entryRuleMBoolExpr() throws RecognitionException {
        try {
            // InternalSLEEC.g:279:1: ( ruleMBoolExpr EOF )
            // InternalSLEEC.g:280:1: ruleMBoolExpr EOF
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
    // InternalSLEEC.g:287:1: ruleMBoolExpr : ( ruleBoolComp ) ;
    public final void ruleMBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:291:2: ( ( ruleBoolComp ) )
            // InternalSLEEC.g:292:2: ( ruleBoolComp )
            {
            // InternalSLEEC.g:292:2: ( ruleBoolComp )
            // InternalSLEEC.g:293:3: ruleBoolComp
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
    // InternalSLEEC.g:303:1: entryRuleBoolComp : ruleBoolComp EOF ;
    public final void entryRuleBoolComp() throws RecognitionException {
        try {
            // InternalSLEEC.g:304:1: ( ruleBoolComp EOF )
            // InternalSLEEC.g:305:1: ruleBoolComp EOF
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
    // InternalSLEEC.g:312:1: ruleBoolComp : ( ( rule__BoolComp__Group__0 ) ) ;
    public final void ruleBoolComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:316:2: ( ( ( rule__BoolComp__Group__0 ) ) )
            // InternalSLEEC.g:317:2: ( ( rule__BoolComp__Group__0 ) )
            {
            // InternalSLEEC.g:317:2: ( ( rule__BoolComp__Group__0 ) )
            // InternalSLEEC.g:318:3: ( rule__BoolComp__Group__0 )
            {
             before(grammarAccess.getBoolCompAccess().getGroup()); 
            // InternalSLEEC.g:319:3: ( rule__BoolComp__Group__0 )
            // InternalSLEEC.g:319:4: rule__BoolComp__Group__0
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
    // InternalSLEEC.g:328:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalSLEEC.g:329:1: ( ruleNot EOF )
            // InternalSLEEC.g:330:1: ruleNot EOF
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
    // InternalSLEEC.g:337:1: ruleNot : ( ( rule__Not__Alternatives ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:341:2: ( ( ( rule__Not__Alternatives ) ) )
            // InternalSLEEC.g:342:2: ( ( rule__Not__Alternatives ) )
            {
            // InternalSLEEC.g:342:2: ( ( rule__Not__Alternatives ) )
            // InternalSLEEC.g:343:3: ( rule__Not__Alternatives )
            {
             before(grammarAccess.getNotAccess().getAlternatives()); 
            // InternalSLEEC.g:344:3: ( rule__Not__Alternatives )
            // InternalSLEEC.g:344:4: rule__Not__Alternatives
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
    // InternalSLEEC.g:353:1: entryRuleRelComp : ruleRelComp EOF ;
    public final void entryRuleRelComp() throws RecognitionException {
        try {
            // InternalSLEEC.g:354:1: ( ruleRelComp EOF )
            // InternalSLEEC.g:355:1: ruleRelComp EOF
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
    // InternalSLEEC.g:362:1: ruleRelComp : ( ( rule__RelComp__Group__0 ) ) ;
    public final void ruleRelComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:366:2: ( ( ( rule__RelComp__Group__0 ) ) )
            // InternalSLEEC.g:367:2: ( ( rule__RelComp__Group__0 ) )
            {
            // InternalSLEEC.g:367:2: ( ( rule__RelComp__Group__0 ) )
            // InternalSLEEC.g:368:3: ( rule__RelComp__Group__0 )
            {
             before(grammarAccess.getRelCompAccess().getGroup()); 
            // InternalSLEEC.g:369:3: ( rule__RelComp__Group__0 )
            // InternalSLEEC.g:369:4: rule__RelComp__Group__0
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
    // InternalSLEEC.g:378:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalSLEEC.g:379:1: ( ruleAtom EOF )
            // InternalSLEEC.g:380:1: ruleAtom EOF
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
    // InternalSLEEC.g:387:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:391:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalSLEEC.g:392:2: ( ( rule__Atom__Alternatives ) )
            {
            // InternalSLEEC.g:392:2: ( ( rule__Atom__Alternatives ) )
            // InternalSLEEC.g:393:3: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // InternalSLEEC.g:394:3: ( rule__Atom__Alternatives )
            // InternalSLEEC.g:394:4: rule__Atom__Alternatives
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
    // InternalSLEEC.g:403:1: entryRuleResponse : ruleResponse EOF ;
    public final void entryRuleResponse() throws RecognitionException {
        try {
            // InternalSLEEC.g:404:1: ( ruleResponse EOF )
            // InternalSLEEC.g:405:1: ruleResponse EOF
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
    // InternalSLEEC.g:412:1: ruleResponse : ( ( rule__Response__Group__0 ) ) ;
    public final void ruleResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:416:2: ( ( ( rule__Response__Group__0 ) ) )
            // InternalSLEEC.g:417:2: ( ( rule__Response__Group__0 ) )
            {
            // InternalSLEEC.g:417:2: ( ( rule__Response__Group__0 ) )
            // InternalSLEEC.g:418:3: ( rule__Response__Group__0 )
            {
             before(grammarAccess.getResponseAccess().getGroup()); 
            // InternalSLEEC.g:419:3: ( rule__Response__Group__0 )
            // InternalSLEEC.g:419:4: rule__Response__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getGroup()); 

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


    // $ANTLR start "entryRuleTime"
    // InternalSLEEC.g:428:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalSLEEC.g:429:1: ( ruleTime EOF )
            // InternalSLEEC.g:430:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalSLEEC.g:437:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:441:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalSLEEC.g:442:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalSLEEC.g:442:2: ( ( rule__Time__Group__0 ) )
            // InternalSLEEC.g:443:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalSLEEC.g:444:3: ( rule__Time__Group__0 )
            // InternalSLEEC.g:444:4: rule__Time__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getGroup()); 

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleDefeater"
    // InternalSLEEC.g:453:1: entryRuleDefeater : ruleDefeater EOF ;
    public final void entryRuleDefeater() throws RecognitionException {
        try {
            // InternalSLEEC.g:454:1: ( ruleDefeater EOF )
            // InternalSLEEC.g:455:1: ruleDefeater EOF
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
    // InternalSLEEC.g:462:1: ruleDefeater : ( ( rule__Defeater__Group__0 ) ) ;
    public final void ruleDefeater() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:466:2: ( ( ( rule__Defeater__Group__0 ) ) )
            // InternalSLEEC.g:467:2: ( ( rule__Defeater__Group__0 ) )
            {
            // InternalSLEEC.g:467:2: ( ( rule__Defeater__Group__0 ) )
            // InternalSLEEC.g:468:3: ( rule__Defeater__Group__0 )
            {
             before(grammarAccess.getDefeaterAccess().getGroup()); 
            // InternalSLEEC.g:469:3: ( rule__Defeater__Group__0 )
            // InternalSLEEC.g:469:4: rule__Defeater__Group__0
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


    // $ANTLR start "ruleRelOp"
    // InternalSLEEC.g:478:1: ruleRelOp : ( ( rule__RelOp__Alternatives ) ) ;
    public final void ruleRelOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:482:1: ( ( ( rule__RelOp__Alternatives ) ) )
            // InternalSLEEC.g:483:2: ( ( rule__RelOp__Alternatives ) )
            {
            // InternalSLEEC.g:483:2: ( ( rule__RelOp__Alternatives ) )
            // InternalSLEEC.g:484:3: ( rule__RelOp__Alternatives )
            {
             before(grammarAccess.getRelOpAccess().getAlternatives()); 
            // InternalSLEEC.g:485:3: ( rule__RelOp__Alternatives )
            // InternalSLEEC.g:485:4: rule__RelOp__Alternatives
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
    // InternalSLEEC.g:494:1: ruleBoolOp : ( ( rule__BoolOp__Alternatives ) ) ;
    public final void ruleBoolOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:498:1: ( ( ( rule__BoolOp__Alternatives ) ) )
            // InternalSLEEC.g:499:2: ( ( rule__BoolOp__Alternatives ) )
            {
            // InternalSLEEC.g:499:2: ( ( rule__BoolOp__Alternatives ) )
            // InternalSLEEC.g:500:3: ( rule__BoolOp__Alternatives )
            {
             before(grammarAccess.getBoolOpAccess().getAlternatives()); 
            // InternalSLEEC.g:501:3: ( rule__BoolOp__Alternatives )
            // InternalSLEEC.g:501:4: rule__BoolOp__Alternatives
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


    // $ANTLR start "ruleTimeUnit"
    // InternalSLEEC.g:510:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:514:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalSLEEC.g:515:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalSLEEC.g:515:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalSLEEC.g:516:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalSLEEC.g:517:3: ( rule__TimeUnit__Alternatives )
            // InternalSLEEC.g:517:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "rule__Definition__Alternatives"
    // InternalSLEEC.g:525:1: rule__Definition__Alternatives : ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:529:1: ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 31:
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
                    // InternalSLEEC.g:530:2: ( ( rule__Definition__Group_0__0 ) )
                    {
                    // InternalSLEEC.g:530:2: ( ( rule__Definition__Group_0__0 ) )
                    // InternalSLEEC.g:531:3: ( rule__Definition__Group_0__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_0()); 
                    // InternalSLEEC.g:532:3: ( rule__Definition__Group_0__0 )
                    // InternalSLEEC.g:532:4: rule__Definition__Group_0__0
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
                    // InternalSLEEC.g:536:2: ( ( rule__Definition__Group_1__0 ) )
                    {
                    // InternalSLEEC.g:536:2: ( ( rule__Definition__Group_1__0 ) )
                    // InternalSLEEC.g:537:3: ( rule__Definition__Group_1__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_1()); 
                    // InternalSLEEC.g:538:3: ( rule__Definition__Group_1__0 )
                    // InternalSLEEC.g:538:4: rule__Definition__Group_1__0
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
                    // InternalSLEEC.g:542:2: ( ( rule__Definition__Group_2__0 ) )
                    {
                    // InternalSLEEC.g:542:2: ( ( rule__Definition__Group_2__0 ) )
                    // InternalSLEEC.g:543:3: ( rule__Definition__Group_2__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_2()); 
                    // InternalSLEEC.g:544:3: ( rule__Definition__Group_2__0 )
                    // InternalSLEEC.g:544:4: rule__Definition__Group_2__0
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSLEEC.g:552:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:556:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 34:
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
                    // InternalSLEEC.g:557:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalSLEEC.g:557:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalSLEEC.g:558:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalSLEEC.g:559:3: ( rule__Type__Group_0__0 )
                    // InternalSLEEC.g:559:4: rule__Type__Group_0__0
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
                    // InternalSLEEC.g:563:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalSLEEC.g:563:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalSLEEC.g:564:3: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalSLEEC.g:565:3: ( rule__Type__Group_1__0 )
                    // InternalSLEEC.g:565:4: rule__Type__Group_1__0
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
                    // InternalSLEEC.g:569:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalSLEEC.g:569:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalSLEEC.g:570:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalSLEEC.g:571:3: ( rule__Type__Group_2__0 )
                    // InternalSLEEC.g:571:4: rule__Type__Group_2__0
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
    // InternalSLEEC.g:579:1: rule__Not__Alternatives : ( ( ( rule__Not__Group_0__0 ) ) | ( ruleRelComp ) );
    public final void rule__Not__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:583:1: ( ( ( rule__Not__Group_0__0 ) ) | ( ruleRelComp ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==42) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||LA3_0==35) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSLEEC.g:584:2: ( ( rule__Not__Group_0__0 ) )
                    {
                    // InternalSLEEC.g:584:2: ( ( rule__Not__Group_0__0 ) )
                    // InternalSLEEC.g:585:3: ( rule__Not__Group_0__0 )
                    {
                     before(grammarAccess.getNotAccess().getGroup_0()); 
                    // InternalSLEEC.g:586:3: ( rule__Not__Group_0__0 )
                    // InternalSLEEC.g:586:4: rule__Not__Group_0__0
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
                    // InternalSLEEC.g:590:2: ( ruleRelComp )
                    {
                    // InternalSLEEC.g:590:2: ( ruleRelComp )
                    // InternalSLEEC.g:591:3: ruleRelComp
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
    // InternalSLEEC.g:600:1: rule__Atom__Alternatives : ( ( ( rule__Atom__MeasureAssignment_0 ) ) | ( ( rule__Atom__Group_1__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:604:1: ( ( ( rule__Atom__MeasureAssignment_0 ) ) | ( ( rule__Atom__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSLEEC.g:605:2: ( ( rule__Atom__MeasureAssignment_0 ) )
                    {
                    // InternalSLEEC.g:605:2: ( ( rule__Atom__MeasureAssignment_0 ) )
                    // InternalSLEEC.g:606:3: ( rule__Atom__MeasureAssignment_0 )
                    {
                     before(grammarAccess.getAtomAccess().getMeasureAssignment_0()); 
                    // InternalSLEEC.g:607:3: ( rule__Atom__MeasureAssignment_0 )
                    // InternalSLEEC.g:607:4: rule__Atom__MeasureAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__MeasureAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getMeasureAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:611:2: ( ( rule__Atom__Group_1__0 ) )
                    {
                    // InternalSLEEC.g:611:2: ( ( rule__Atom__Group_1__0 ) )
                    // InternalSLEEC.g:612:3: ( rule__Atom__Group_1__0 )
                    {
                     before(grammarAccess.getAtomAccess().getGroup_1()); 
                    // InternalSLEEC.g:613:3: ( rule__Atom__Group_1__0 )
                    // InternalSLEEC.g:613:4: rule__Atom__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getGroup_1()); 

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


    // $ANTLR start "rule__RelOp__Alternatives"
    // InternalSLEEC.g:621:1: rule__RelOp__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '=' ) ) );
    public final void rule__RelOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:625:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '=' ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSLEEC.g:626:2: ( ( '<' ) )
                    {
                    // InternalSLEEC.g:626:2: ( ( '<' ) )
                    // InternalSLEEC.g:627:3: ( '<' )
                    {
                     before(grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0()); 
                    // InternalSLEEC.g:628:3: ( '<' )
                    // InternalSLEEC.g:628:4: '<'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:632:2: ( ( '>' ) )
                    {
                    // InternalSLEEC.g:632:2: ( ( '>' ) )
                    // InternalSLEEC.g:633:3: ( '>' )
                    {
                     before(grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1()); 
                    // InternalSLEEC.g:634:3: ( '>' )
                    // InternalSLEEC.g:634:4: '>'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:638:2: ( ( '<>' ) )
                    {
                    // InternalSLEEC.g:638:2: ( ( '<>' ) )
                    // InternalSLEEC.g:639:3: ( '<>' )
                    {
                     before(grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2()); 
                    // InternalSLEEC.g:640:3: ( '<>' )
                    // InternalSLEEC.g:640:4: '<>'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSLEEC.g:644:2: ( ( '<=' ) )
                    {
                    // InternalSLEEC.g:644:2: ( ( '<=' ) )
                    // InternalSLEEC.g:645:3: ( '<=' )
                    {
                     before(grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3()); 
                    // InternalSLEEC.g:646:3: ( '<=' )
                    // InternalSLEEC.g:646:4: '<='
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSLEEC.g:650:2: ( ( '>=' ) )
                    {
                    // InternalSLEEC.g:650:2: ( ( '>=' ) )
                    // InternalSLEEC.g:651:3: ( '>=' )
                    {
                     before(grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4()); 
                    // InternalSLEEC.g:652:3: ( '>=' )
                    // InternalSLEEC.g:652:4: '>='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSLEEC.g:656:2: ( ( '=' ) )
                    {
                    // InternalSLEEC.g:656:2: ( ( '=' ) )
                    // InternalSLEEC.g:657:3: ( '=' )
                    {
                     before(grammarAccess.getRelOpAccess().getEQUALEnumLiteralDeclaration_5()); 
                    // InternalSLEEC.g:658:3: ( '=' )
                    // InternalSLEEC.g:658:4: '='
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalSLEEC.g:666:1: rule__BoolOp__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__BoolOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:670:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSLEEC.g:671:2: ( ( 'and' ) )
                    {
                    // InternalSLEEC.g:671:2: ( ( 'and' ) )
                    // InternalSLEEC.g:672:3: ( 'and' )
                    {
                     before(grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalSLEEC.g:673:3: ( 'and' )
                    // InternalSLEEC.g:673:4: 'and'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:677:2: ( ( 'or' ) )
                    {
                    // InternalSLEEC.g:677:2: ( ( 'or' ) )
                    // InternalSLEEC.g:678:3: ( 'or' )
                    {
                     before(grammarAccess.getBoolOpAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalSLEEC.g:679:3: ( 'or' )
                    // InternalSLEEC.g:679:4: 'or'
                    {
                    match(input,18,FOLLOW_2); 

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


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalSLEEC.g:687:1: rule__TimeUnit__Alternatives : ( ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'months' ) ) | ( ( 'years' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:691:1: ( ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'months' ) ) | ( ( 'years' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            case 24:
                {
                alt7=6;
                }
                break;
            case 25:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSLEEC.g:692:2: ( ( 'seconds' ) )
                    {
                    // InternalSLEEC.g:692:2: ( ( 'seconds' ) )
                    // InternalSLEEC.g:693:3: ( 'seconds' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0()); 
                    // InternalSLEEC.g:694:3: ( 'seconds' )
                    // InternalSLEEC.g:694:4: 'seconds'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:698:2: ( ( 'minutes' ) )
                    {
                    // InternalSLEEC.g:698:2: ( ( 'minutes' ) )
                    // InternalSLEEC.g:699:3: ( 'minutes' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMINUTESEnumLiteralDeclaration_1()); 
                    // InternalSLEEC.g:700:3: ( 'minutes' )
                    // InternalSLEEC.g:700:4: 'minutes'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMINUTESEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:704:2: ( ( 'hours' ) )
                    {
                    // InternalSLEEC.g:704:2: ( ( 'hours' ) )
                    // InternalSLEEC.g:705:3: ( 'hours' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getHOURSEnumLiteralDeclaration_2()); 
                    // InternalSLEEC.g:706:3: ( 'hours' )
                    // InternalSLEEC.g:706:4: 'hours'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getHOURSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSLEEC.g:710:2: ( ( 'days' ) )
                    {
                    // InternalSLEEC.g:710:2: ( ( 'days' ) )
                    // InternalSLEEC.g:711:3: ( 'days' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getDAYSEnumLiteralDeclaration_3()); 
                    // InternalSLEEC.g:712:3: ( 'days' )
                    // InternalSLEEC.g:712:4: 'days'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getDAYSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSLEEC.g:716:2: ( ( 'weeks' ) )
                    {
                    // InternalSLEEC.g:716:2: ( ( 'weeks' ) )
                    // InternalSLEEC.g:717:3: ( 'weeks' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getWEEKSEnumLiteralDeclaration_4()); 
                    // InternalSLEEC.g:718:3: ( 'weeks' )
                    // InternalSLEEC.g:718:4: 'weeks'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getWEEKSEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSLEEC.g:722:2: ( ( 'months' ) )
                    {
                    // InternalSLEEC.g:722:2: ( ( 'months' ) )
                    // InternalSLEEC.g:723:3: ( 'months' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMONTHSEnumLiteralDeclaration_5()); 
                    // InternalSLEEC.g:724:3: ( 'months' )
                    // InternalSLEEC.g:724:4: 'months'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMONTHSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSLEEC.g:728:2: ( ( 'years' ) )
                    {
                    // InternalSLEEC.g:728:2: ( ( 'years' ) )
                    // InternalSLEEC.g:729:3: ( 'years' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getYEARSEnumLiteralDeclaration_6()); 
                    // InternalSLEEC.g:730:3: ( 'years' )
                    // InternalSLEEC.g:730:4: 'years'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getYEARSEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__Specification__Group__0"
    // InternalSLEEC.g:738:1: rule__Specification__Group__0 : rule__Specification__Group__0__Impl rule__Specification__Group__1 ;
    public final void rule__Specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:742:1: ( rule__Specification__Group__0__Impl rule__Specification__Group__1 )
            // InternalSLEEC.g:743:2: rule__Specification__Group__0__Impl rule__Specification__Group__1
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
    // InternalSLEEC.g:750:1: rule__Specification__Group__0__Impl : ( ( rule__Specification__DefBlockAssignment_0 ) ) ;
    public final void rule__Specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:754:1: ( ( ( rule__Specification__DefBlockAssignment_0 ) ) )
            // InternalSLEEC.g:755:1: ( ( rule__Specification__DefBlockAssignment_0 ) )
            {
            // InternalSLEEC.g:755:1: ( ( rule__Specification__DefBlockAssignment_0 ) )
            // InternalSLEEC.g:756:2: ( rule__Specification__DefBlockAssignment_0 )
            {
             before(grammarAccess.getSpecificationAccess().getDefBlockAssignment_0()); 
            // InternalSLEEC.g:757:2: ( rule__Specification__DefBlockAssignment_0 )
            // InternalSLEEC.g:757:3: rule__Specification__DefBlockAssignment_0
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
    // InternalSLEEC.g:765:1: rule__Specification__Group__1 : rule__Specification__Group__1__Impl ;
    public final void rule__Specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:769:1: ( rule__Specification__Group__1__Impl )
            // InternalSLEEC.g:770:2: rule__Specification__Group__1__Impl
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
    // InternalSLEEC.g:776:1: rule__Specification__Group__1__Impl : ( ( rule__Specification__RuleBlockAssignment_1 ) ) ;
    public final void rule__Specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:780:1: ( ( ( rule__Specification__RuleBlockAssignment_1 ) ) )
            // InternalSLEEC.g:781:1: ( ( rule__Specification__RuleBlockAssignment_1 ) )
            {
            // InternalSLEEC.g:781:1: ( ( rule__Specification__RuleBlockAssignment_1 ) )
            // InternalSLEEC.g:782:2: ( rule__Specification__RuleBlockAssignment_1 )
            {
             before(grammarAccess.getSpecificationAccess().getRuleBlockAssignment_1()); 
            // InternalSLEEC.g:783:2: ( rule__Specification__RuleBlockAssignment_1 )
            // InternalSLEEC.g:783:3: rule__Specification__RuleBlockAssignment_1
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
    // InternalSLEEC.g:792:1: rule__Defblock__Group__0 : rule__Defblock__Group__0__Impl rule__Defblock__Group__1 ;
    public final void rule__Defblock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:796:1: ( rule__Defblock__Group__0__Impl rule__Defblock__Group__1 )
            // InternalSLEEC.g:797:2: rule__Defblock__Group__0__Impl rule__Defblock__Group__1
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
    // InternalSLEEC.g:804:1: rule__Defblock__Group__0__Impl : ( 'def_start' ) ;
    public final void rule__Defblock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:808:1: ( ( 'def_start' ) )
            // InternalSLEEC.g:809:1: ( 'def_start' )
            {
            // InternalSLEEC.g:809:1: ( 'def_start' )
            // InternalSLEEC.g:810:2: 'def_start'
            {
             before(grammarAccess.getDefblockAccess().getDef_startKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSLEEC.g:819:1: rule__Defblock__Group__1 : rule__Defblock__Group__1__Impl rule__Defblock__Group__2 ;
    public final void rule__Defblock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:823:1: ( rule__Defblock__Group__1__Impl rule__Defblock__Group__2 )
            // InternalSLEEC.g:824:2: rule__Defblock__Group__1__Impl rule__Defblock__Group__2
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
    // InternalSLEEC.g:831:1: rule__Defblock__Group__1__Impl : ( ( ( rule__Defblock__DefinitionsAssignment_1 ) ) ( ( rule__Defblock__DefinitionsAssignment_1 )* ) ) ;
    public final void rule__Defblock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:835:1: ( ( ( ( rule__Defblock__DefinitionsAssignment_1 ) ) ( ( rule__Defblock__DefinitionsAssignment_1 )* ) ) )
            // InternalSLEEC.g:836:1: ( ( ( rule__Defblock__DefinitionsAssignment_1 ) ) ( ( rule__Defblock__DefinitionsAssignment_1 )* ) )
            {
            // InternalSLEEC.g:836:1: ( ( ( rule__Defblock__DefinitionsAssignment_1 ) ) ( ( rule__Defblock__DefinitionsAssignment_1 )* ) )
            // InternalSLEEC.g:837:2: ( ( rule__Defblock__DefinitionsAssignment_1 ) ) ( ( rule__Defblock__DefinitionsAssignment_1 )* )
            {
            // InternalSLEEC.g:837:2: ( ( rule__Defblock__DefinitionsAssignment_1 ) )
            // InternalSLEEC.g:838:3: ( rule__Defblock__DefinitionsAssignment_1 )
            {
             before(grammarAccess.getDefblockAccess().getDefinitionsAssignment_1()); 
            // InternalSLEEC.g:839:3: ( rule__Defblock__DefinitionsAssignment_1 )
            // InternalSLEEC.g:839:4: rule__Defblock__DefinitionsAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__Defblock__DefinitionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefblockAccess().getDefinitionsAssignment_1()); 

            }

            // InternalSLEEC.g:842:2: ( ( rule__Defblock__DefinitionsAssignment_1 )* )
            // InternalSLEEC.g:843:3: ( rule__Defblock__DefinitionsAssignment_1 )*
            {
             before(grammarAccess.getDefblockAccess().getDefinitionsAssignment_1()); 
            // InternalSLEEC.g:844:3: ( rule__Defblock__DefinitionsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=28 && LA8_0<=29)||LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSLEEC.g:844:4: rule__Defblock__DefinitionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Defblock__DefinitionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSLEEC.g:853:1: rule__Defblock__Group__2 : rule__Defblock__Group__2__Impl ;
    public final void rule__Defblock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:857:1: ( rule__Defblock__Group__2__Impl )
            // InternalSLEEC.g:858:2: rule__Defblock__Group__2__Impl
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
    // InternalSLEEC.g:864:1: rule__Defblock__Group__2__Impl : ( 'def_end' ) ;
    public final void rule__Defblock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:868:1: ( ( 'def_end' ) )
            // InternalSLEEC.g:869:1: ( 'def_end' )
            {
            // InternalSLEEC.g:869:1: ( 'def_end' )
            // InternalSLEEC.g:870:2: 'def_end'
            {
             before(grammarAccess.getDefblockAccess().getDef_endKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSLEEC.g:880:1: rule__Definition__Group_0__0 : rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 ;
    public final void rule__Definition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:884:1: ( rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 )
            // InternalSLEEC.g:885:2: rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1
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
    // InternalSLEEC.g:892:1: rule__Definition__Group_0__0__Impl : ( () ) ;
    public final void rule__Definition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:896:1: ( ( () ) )
            // InternalSLEEC.g:897:1: ( () )
            {
            // InternalSLEEC.g:897:1: ( () )
            // InternalSLEEC.g:898:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getEventAction_0_0()); 
            // InternalSLEEC.g:899:2: ()
            // InternalSLEEC.g:899:3: 
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
    // InternalSLEEC.g:907:1: rule__Definition__Group_0__1 : rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 ;
    public final void rule__Definition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:911:1: ( rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 )
            // InternalSLEEC.g:912:2: rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2
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
    // InternalSLEEC.g:919:1: rule__Definition__Group_0__1__Impl : ( 'event' ) ;
    public final void rule__Definition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:923:1: ( ( 'event' ) )
            // InternalSLEEC.g:924:1: ( 'event' )
            {
            // InternalSLEEC.g:924:1: ( 'event' )
            // InternalSLEEC.g:925:2: 'event'
            {
             before(grammarAccess.getDefinitionAccess().getEventKeyword_0_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSLEEC.g:934:1: rule__Definition__Group_0__2 : rule__Definition__Group_0__2__Impl ;
    public final void rule__Definition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:938:1: ( rule__Definition__Group_0__2__Impl )
            // InternalSLEEC.g:939:2: rule__Definition__Group_0__2__Impl
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
    // InternalSLEEC.g:945:1: rule__Definition__Group_0__2__Impl : ( ( rule__Definition__NameAssignment_0_2 ) ) ;
    public final void rule__Definition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:949:1: ( ( ( rule__Definition__NameAssignment_0_2 ) ) )
            // InternalSLEEC.g:950:1: ( ( rule__Definition__NameAssignment_0_2 ) )
            {
            // InternalSLEEC.g:950:1: ( ( rule__Definition__NameAssignment_0_2 ) )
            // InternalSLEEC.g:951:2: ( rule__Definition__NameAssignment_0_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_0_2()); 
            // InternalSLEEC.g:952:2: ( rule__Definition__NameAssignment_0_2 )
            // InternalSLEEC.g:952:3: rule__Definition__NameAssignment_0_2
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
    // InternalSLEEC.g:961:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:965:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // InternalSLEEC.g:966:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
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
    // InternalSLEEC.g:973:1: rule__Definition__Group_1__0__Impl : ( () ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:977:1: ( ( () ) )
            // InternalSLEEC.g:978:1: ( () )
            {
            // InternalSLEEC.g:978:1: ( () )
            // InternalSLEEC.g:979:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getMeasureAction_1_0()); 
            // InternalSLEEC.g:980:2: ()
            // InternalSLEEC.g:980:3: 
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
    // InternalSLEEC.g:988:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:992:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // InternalSLEEC.g:993:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
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
    // InternalSLEEC.g:1000:1: rule__Definition__Group_1__1__Impl : ( 'measure' ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1004:1: ( ( 'measure' ) )
            // InternalSLEEC.g:1005:1: ( 'measure' )
            {
            // InternalSLEEC.g:1005:1: ( 'measure' )
            // InternalSLEEC.g:1006:2: 'measure'
            {
             before(grammarAccess.getDefinitionAccess().getMeasureKeyword_1_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSLEEC.g:1015:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1019:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // InternalSLEEC.g:1020:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
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
    // InternalSLEEC.g:1027:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__NameAssignment_1_2 ) ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1031:1: ( ( ( rule__Definition__NameAssignment_1_2 ) ) )
            // InternalSLEEC.g:1032:1: ( ( rule__Definition__NameAssignment_1_2 ) )
            {
            // InternalSLEEC.g:1032:1: ( ( rule__Definition__NameAssignment_1_2 ) )
            // InternalSLEEC.g:1033:2: ( rule__Definition__NameAssignment_1_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1_2()); 
            // InternalSLEEC.g:1034:2: ( rule__Definition__NameAssignment_1_2 )
            // InternalSLEEC.g:1034:3: rule__Definition__NameAssignment_1_2
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
    // InternalSLEEC.g:1042:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1046:1: ( rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 )
            // InternalSLEEC.g:1047:2: rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4
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
    // InternalSLEEC.g:1054:1: rule__Definition__Group_1__3__Impl : ( ':' ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1058:1: ( ( ':' ) )
            // InternalSLEEC.g:1059:1: ( ':' )
            {
            // InternalSLEEC.g:1059:1: ( ':' )
            // InternalSLEEC.g:1060:2: ':'
            {
             before(grammarAccess.getDefinitionAccess().getColonKeyword_1_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSLEEC.g:1069:1: rule__Definition__Group_1__4 : rule__Definition__Group_1__4__Impl ;
    public final void rule__Definition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1073:1: ( rule__Definition__Group_1__4__Impl )
            // InternalSLEEC.g:1074:2: rule__Definition__Group_1__4__Impl
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
    // InternalSLEEC.g:1080:1: rule__Definition__Group_1__4__Impl : ( ( rule__Definition__TypeAssignment_1_4 ) ) ;
    public final void rule__Definition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1084:1: ( ( ( rule__Definition__TypeAssignment_1_4 ) ) )
            // InternalSLEEC.g:1085:1: ( ( rule__Definition__TypeAssignment_1_4 ) )
            {
            // InternalSLEEC.g:1085:1: ( ( rule__Definition__TypeAssignment_1_4 ) )
            // InternalSLEEC.g:1086:2: ( rule__Definition__TypeAssignment_1_4 )
            {
             before(grammarAccess.getDefinitionAccess().getTypeAssignment_1_4()); 
            // InternalSLEEC.g:1087:2: ( rule__Definition__TypeAssignment_1_4 )
            // InternalSLEEC.g:1087:3: rule__Definition__TypeAssignment_1_4
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
    // InternalSLEEC.g:1096:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1100:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // InternalSLEEC.g:1101:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
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
    // InternalSLEEC.g:1108:1: rule__Definition__Group_2__0__Impl : ( () ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1112:1: ( ( () ) )
            // InternalSLEEC.g:1113:1: ( () )
            {
            // InternalSLEEC.g:1113:1: ( () )
            // InternalSLEEC.g:1114:2: ()
            {
             before(grammarAccess.getDefinitionAccess().getConstAction_2_0()); 
            // InternalSLEEC.g:1115:2: ()
            // InternalSLEEC.g:1115:3: 
            {
            }

             after(grammarAccess.getDefinitionAccess().getConstAction_2_0()); 

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
    // InternalSLEEC.g:1123:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1127:1: ( rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 )
            // InternalSLEEC.g:1128:2: rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2
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
    // InternalSLEEC.g:1135:1: rule__Definition__Group_2__1__Impl : ( 'constant' ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1139:1: ( ( 'constant' ) )
            // InternalSLEEC.g:1140:1: ( 'constant' )
            {
            // InternalSLEEC.g:1140:1: ( 'constant' )
            // InternalSLEEC.g:1141:2: 'constant'
            {
             before(grammarAccess.getDefinitionAccess().getConstantKeyword_2_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSLEEC.g:1150:1: rule__Definition__Group_2__2 : rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 ;
    public final void rule__Definition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1154:1: ( rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 )
            // InternalSLEEC.g:1155:2: rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3
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
    // InternalSLEEC.g:1162:1: rule__Definition__Group_2__2__Impl : ( ( rule__Definition__NameAssignment_2_2 ) ) ;
    public final void rule__Definition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1166:1: ( ( ( rule__Definition__NameAssignment_2_2 ) ) )
            // InternalSLEEC.g:1167:1: ( ( rule__Definition__NameAssignment_2_2 ) )
            {
            // InternalSLEEC.g:1167:1: ( ( rule__Definition__NameAssignment_2_2 ) )
            // InternalSLEEC.g:1168:2: ( rule__Definition__NameAssignment_2_2 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_2_2()); 
            // InternalSLEEC.g:1169:2: ( rule__Definition__NameAssignment_2_2 )
            // InternalSLEEC.g:1169:3: rule__Definition__NameAssignment_2_2
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
    // InternalSLEEC.g:1177:1: rule__Definition__Group_2__3 : rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4 ;
    public final void rule__Definition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1181:1: ( rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4 )
            // InternalSLEEC.g:1182:2: rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4
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
    // InternalSLEEC.g:1189:1: rule__Definition__Group_2__3__Impl : ( '=' ) ;
    public final void rule__Definition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1193:1: ( ( '=' ) )
            // InternalSLEEC.g:1194:1: ( '=' )
            {
            // InternalSLEEC.g:1194:1: ( '=' )
            // InternalSLEEC.g:1195:2: '='
            {
             before(grammarAccess.getDefinitionAccess().getEqualsSignKeyword_2_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSLEEC.g:1204:1: rule__Definition__Group_2__4 : rule__Definition__Group_2__4__Impl ;
    public final void rule__Definition__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1208:1: ( rule__Definition__Group_2__4__Impl )
            // InternalSLEEC.g:1209:2: rule__Definition__Group_2__4__Impl
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
    // InternalSLEEC.g:1215:1: rule__Definition__Group_2__4__Impl : ( ( rule__Definition__ValueAssignment_2_4 ) ) ;
    public final void rule__Definition__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1219:1: ( ( ( rule__Definition__ValueAssignment_2_4 ) ) )
            // InternalSLEEC.g:1220:1: ( ( rule__Definition__ValueAssignment_2_4 ) )
            {
            // InternalSLEEC.g:1220:1: ( ( rule__Definition__ValueAssignment_2_4 ) )
            // InternalSLEEC.g:1221:2: ( rule__Definition__ValueAssignment_2_4 )
            {
             before(grammarAccess.getDefinitionAccess().getValueAssignment_2_4()); 
            // InternalSLEEC.g:1222:2: ( rule__Definition__ValueAssignment_2_4 )
            // InternalSLEEC.g:1222:3: rule__Definition__ValueAssignment_2_4
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
    // InternalSLEEC.g:1231:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1235:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalSLEEC.g:1236:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
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
    // InternalSLEEC.g:1243:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1247:1: ( ( () ) )
            // InternalSLEEC.g:1248:1: ( () )
            {
            // InternalSLEEC.g:1248:1: ( () )
            // InternalSLEEC.g:1249:2: ()
            {
             before(grammarAccess.getTypeAccess().getBooleanAction_0_0()); 
            // InternalSLEEC.g:1250:2: ()
            // InternalSLEEC.g:1250:3: 
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
    // InternalSLEEC.g:1258:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1262:1: ( rule__Type__Group_0__1__Impl )
            // InternalSLEEC.g:1263:2: rule__Type__Group_0__1__Impl
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
    // InternalSLEEC.g:1269:1: rule__Type__Group_0__1__Impl : ( 'boolean' ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1273:1: ( ( 'boolean' ) )
            // InternalSLEEC.g:1274:1: ( 'boolean' )
            {
            // InternalSLEEC.g:1274:1: ( 'boolean' )
            // InternalSLEEC.g:1275:2: 'boolean'
            {
             before(grammarAccess.getTypeAccess().getBooleanKeyword_0_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSLEEC.g:1285:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1289:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalSLEEC.g:1290:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
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
    // InternalSLEEC.g:1297:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1301:1: ( ( () ) )
            // InternalSLEEC.g:1302:1: ( () )
            {
            // InternalSLEEC.g:1302:1: ( () )
            // InternalSLEEC.g:1303:2: ()
            {
             before(grammarAccess.getTypeAccess().getNumericAction_1_0()); 
            // InternalSLEEC.g:1304:2: ()
            // InternalSLEEC.g:1304:3: 
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
    // InternalSLEEC.g:1312:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1316:1: ( rule__Type__Group_1__1__Impl )
            // InternalSLEEC.g:1317:2: rule__Type__Group_1__1__Impl
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
    // InternalSLEEC.g:1323:1: rule__Type__Group_1__1__Impl : ( 'numeric' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1327:1: ( ( 'numeric' ) )
            // InternalSLEEC.g:1328:1: ( 'numeric' )
            {
            // InternalSLEEC.g:1328:1: ( 'numeric' )
            // InternalSLEEC.g:1329:2: 'numeric'
            {
             before(grammarAccess.getTypeAccess().getNumericKeyword_1_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSLEEC.g:1339:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1343:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalSLEEC.g:1344:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
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
    // InternalSLEEC.g:1351:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1355:1: ( ( () ) )
            // InternalSLEEC.g:1356:1: ( () )
            {
            // InternalSLEEC.g:1356:1: ( () )
            // InternalSLEEC.g:1357:2: ()
            {
             before(grammarAccess.getTypeAccess().getScaleAction_2_0()); 
            // InternalSLEEC.g:1358:2: ()
            // InternalSLEEC.g:1358:3: 
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
    // InternalSLEEC.g:1366:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1370:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalSLEEC.g:1371:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
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
    // InternalSLEEC.g:1378:1: rule__Type__Group_2__1__Impl : ( 'scale' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1382:1: ( ( 'scale' ) )
            // InternalSLEEC.g:1383:1: ( 'scale' )
            {
            // InternalSLEEC.g:1383:1: ( 'scale' )
            // InternalSLEEC.g:1384:2: 'scale'
            {
             before(grammarAccess.getTypeAccess().getScaleKeyword_2_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSLEEC.g:1393:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl rule__Type__Group_2__3 ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1397:1: ( rule__Type__Group_2__2__Impl rule__Type__Group_2__3 )
            // InternalSLEEC.g:1398:2: rule__Type__Group_2__2__Impl rule__Type__Group_2__3
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
    // InternalSLEEC.g:1405:1: rule__Type__Group_2__2__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1409:1: ( ( '(' ) )
            // InternalSLEEC.g:1410:1: ( '(' )
            {
            // InternalSLEEC.g:1410:1: ( '(' )
            // InternalSLEEC.g:1411:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSLEEC.g:1420:1: rule__Type__Group_2__3 : rule__Type__Group_2__3__Impl rule__Type__Group_2__4 ;
    public final void rule__Type__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1424:1: ( rule__Type__Group_2__3__Impl rule__Type__Group_2__4 )
            // InternalSLEEC.g:1425:2: rule__Type__Group_2__3__Impl rule__Type__Group_2__4
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
    // InternalSLEEC.g:1432:1: rule__Type__Group_2__3__Impl : ( ( rule__Type__ScaleParamsAssignment_2_3 ) ) ;
    public final void rule__Type__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1436:1: ( ( ( rule__Type__ScaleParamsAssignment_2_3 ) ) )
            // InternalSLEEC.g:1437:1: ( ( rule__Type__ScaleParamsAssignment_2_3 ) )
            {
            // InternalSLEEC.g:1437:1: ( ( rule__Type__ScaleParamsAssignment_2_3 ) )
            // InternalSLEEC.g:1438:2: ( rule__Type__ScaleParamsAssignment_2_3 )
            {
             before(grammarAccess.getTypeAccess().getScaleParamsAssignment_2_3()); 
            // InternalSLEEC.g:1439:2: ( rule__Type__ScaleParamsAssignment_2_3 )
            // InternalSLEEC.g:1439:3: rule__Type__ScaleParamsAssignment_2_3
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
    // InternalSLEEC.g:1447:1: rule__Type__Group_2__4 : rule__Type__Group_2__4__Impl rule__Type__Group_2__5 ;
    public final void rule__Type__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1451:1: ( rule__Type__Group_2__4__Impl rule__Type__Group_2__5 )
            // InternalSLEEC.g:1452:2: rule__Type__Group_2__4__Impl rule__Type__Group_2__5
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
    // InternalSLEEC.g:1459:1: rule__Type__Group_2__4__Impl : ( ( rule__Type__Group_2_4__0 )* ) ;
    public final void rule__Type__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1463:1: ( ( ( rule__Type__Group_2_4__0 )* ) )
            // InternalSLEEC.g:1464:1: ( ( rule__Type__Group_2_4__0 )* )
            {
            // InternalSLEEC.g:1464:1: ( ( rule__Type__Group_2_4__0 )* )
            // InternalSLEEC.g:1465:2: ( rule__Type__Group_2_4__0 )*
            {
             before(grammarAccess.getTypeAccess().getGroup_2_4()); 
            // InternalSLEEC.g:1466:2: ( rule__Type__Group_2_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==37) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSLEEC.g:1466:3: rule__Type__Group_2_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Type__Group_2_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSLEEC.g:1474:1: rule__Type__Group_2__5 : rule__Type__Group_2__5__Impl ;
    public final void rule__Type__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1478:1: ( rule__Type__Group_2__5__Impl )
            // InternalSLEEC.g:1479:2: rule__Type__Group_2__5__Impl
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
    // InternalSLEEC.g:1485:1: rule__Type__Group_2__5__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1489:1: ( ( ')' ) )
            // InternalSLEEC.g:1490:1: ( ')' )
            {
            // InternalSLEEC.g:1490:1: ( ')' )
            // InternalSLEEC.g:1491:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSLEEC.g:1501:1: rule__Type__Group_2_4__0 : rule__Type__Group_2_4__0__Impl rule__Type__Group_2_4__1 ;
    public final void rule__Type__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1505:1: ( rule__Type__Group_2_4__0__Impl rule__Type__Group_2_4__1 )
            // InternalSLEEC.g:1506:2: rule__Type__Group_2_4__0__Impl rule__Type__Group_2_4__1
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
    // InternalSLEEC.g:1513:1: rule__Type__Group_2_4__0__Impl : ( ',' ) ;
    public final void rule__Type__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1517:1: ( ( ',' ) )
            // InternalSLEEC.g:1518:1: ( ',' )
            {
            // InternalSLEEC.g:1518:1: ( ',' )
            // InternalSLEEC.g:1519:2: ','
            {
             before(grammarAccess.getTypeAccess().getCommaKeyword_2_4_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSLEEC.g:1528:1: rule__Type__Group_2_4__1 : rule__Type__Group_2_4__1__Impl ;
    public final void rule__Type__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1532:1: ( rule__Type__Group_2_4__1__Impl )
            // InternalSLEEC.g:1533:2: rule__Type__Group_2_4__1__Impl
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
    // InternalSLEEC.g:1539:1: rule__Type__Group_2_4__1__Impl : ( ( rule__Type__ScaleParamsAssignment_2_4_1 ) ) ;
    public final void rule__Type__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1543:1: ( ( ( rule__Type__ScaleParamsAssignment_2_4_1 ) ) )
            // InternalSLEEC.g:1544:1: ( ( rule__Type__ScaleParamsAssignment_2_4_1 ) )
            {
            // InternalSLEEC.g:1544:1: ( ( rule__Type__ScaleParamsAssignment_2_4_1 ) )
            // InternalSLEEC.g:1545:2: ( rule__Type__ScaleParamsAssignment_2_4_1 )
            {
             before(grammarAccess.getTypeAccess().getScaleParamsAssignment_2_4_1()); 
            // InternalSLEEC.g:1546:2: ( rule__Type__ScaleParamsAssignment_2_4_1 )
            // InternalSLEEC.g:1546:3: rule__Type__ScaleParamsAssignment_2_4_1
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
    // InternalSLEEC.g:1555:1: rule__RuleBlock__Group__0 : rule__RuleBlock__Group__0__Impl rule__RuleBlock__Group__1 ;
    public final void rule__RuleBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1559:1: ( rule__RuleBlock__Group__0__Impl rule__RuleBlock__Group__1 )
            // InternalSLEEC.g:1560:2: rule__RuleBlock__Group__0__Impl rule__RuleBlock__Group__1
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
    // InternalSLEEC.g:1567:1: rule__RuleBlock__Group__0__Impl : ( 'rule_start' ) ;
    public final void rule__RuleBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1571:1: ( ( 'rule_start' ) )
            // InternalSLEEC.g:1572:1: ( 'rule_start' )
            {
            // InternalSLEEC.g:1572:1: ( 'rule_start' )
            // InternalSLEEC.g:1573:2: 'rule_start'
            {
             before(grammarAccess.getRuleBlockAccess().getRule_startKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSLEEC.g:1582:1: rule__RuleBlock__Group__1 : rule__RuleBlock__Group__1__Impl rule__RuleBlock__Group__2 ;
    public final void rule__RuleBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1586:1: ( rule__RuleBlock__Group__1__Impl rule__RuleBlock__Group__2 )
            // InternalSLEEC.g:1587:2: rule__RuleBlock__Group__1__Impl rule__RuleBlock__Group__2
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
    // InternalSLEEC.g:1594:1: rule__RuleBlock__Group__1__Impl : ( ( ( rule__RuleBlock__RulesAssignment_1 ) ) ( ( rule__RuleBlock__RulesAssignment_1 )* ) ) ;
    public final void rule__RuleBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1598:1: ( ( ( ( rule__RuleBlock__RulesAssignment_1 ) ) ( ( rule__RuleBlock__RulesAssignment_1 )* ) ) )
            // InternalSLEEC.g:1599:1: ( ( ( rule__RuleBlock__RulesAssignment_1 ) ) ( ( rule__RuleBlock__RulesAssignment_1 )* ) )
            {
            // InternalSLEEC.g:1599:1: ( ( ( rule__RuleBlock__RulesAssignment_1 ) ) ( ( rule__RuleBlock__RulesAssignment_1 )* ) )
            // InternalSLEEC.g:1600:2: ( ( rule__RuleBlock__RulesAssignment_1 ) ) ( ( rule__RuleBlock__RulesAssignment_1 )* )
            {
            // InternalSLEEC.g:1600:2: ( ( rule__RuleBlock__RulesAssignment_1 ) )
            // InternalSLEEC.g:1601:3: ( rule__RuleBlock__RulesAssignment_1 )
            {
             before(grammarAccess.getRuleBlockAccess().getRulesAssignment_1()); 
            // InternalSLEEC.g:1602:3: ( rule__RuleBlock__RulesAssignment_1 )
            // InternalSLEEC.g:1602:4: rule__RuleBlock__RulesAssignment_1
            {
            pushFollow(FOLLOW_20);
            rule__RuleBlock__RulesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleBlockAccess().getRulesAssignment_1()); 

            }

            // InternalSLEEC.g:1605:2: ( ( rule__RuleBlock__RulesAssignment_1 )* )
            // InternalSLEEC.g:1606:3: ( rule__RuleBlock__RulesAssignment_1 )*
            {
             before(grammarAccess.getRuleBlockAccess().getRulesAssignment_1()); 
            // InternalSLEEC.g:1607:3: ( rule__RuleBlock__RulesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSLEEC.g:1607:4: rule__RuleBlock__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RuleBlock__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSLEEC.g:1616:1: rule__RuleBlock__Group__2 : rule__RuleBlock__Group__2__Impl ;
    public final void rule__RuleBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1620:1: ( rule__RuleBlock__Group__2__Impl )
            // InternalSLEEC.g:1621:2: rule__RuleBlock__Group__2__Impl
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
    // InternalSLEEC.g:1627:1: rule__RuleBlock__Group__2__Impl : ( 'rule_end' ) ;
    public final void rule__RuleBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1631:1: ( ( 'rule_end' ) )
            // InternalSLEEC.g:1632:1: ( 'rule_end' )
            {
            // InternalSLEEC.g:1632:1: ( 'rule_end' )
            // InternalSLEEC.g:1633:2: 'rule_end'
            {
             before(grammarAccess.getRuleBlockAccess().getRule_endKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSLEEC.g:1643:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1647:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalSLEEC.g:1648:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalSLEEC.g:1655:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__NameAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1659:1: ( ( ( rule__Rule__NameAssignment_0 ) ) )
            // InternalSLEEC.g:1660:1: ( ( rule__Rule__NameAssignment_0 ) )
            {
            // InternalSLEEC.g:1660:1: ( ( rule__Rule__NameAssignment_0 ) )
            // InternalSLEEC.g:1661:2: ( rule__Rule__NameAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_0()); 
            // InternalSLEEC.g:1662:2: ( rule__Rule__NameAssignment_0 )
            // InternalSLEEC.g:1662:3: rule__Rule__NameAssignment_0
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
    // InternalSLEEC.g:1670:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1674:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalSLEEC.g:1675:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalSLEEC.g:1682:1: rule__Rule__Group__1__Impl : ( 'when' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1686:1: ( ( 'when' ) )
            // InternalSLEEC.g:1687:1: ( 'when' )
            {
            // InternalSLEEC.g:1687:1: ( 'when' )
            // InternalSLEEC.g:1688:2: 'when'
            {
             before(grammarAccess.getRuleAccess().getWhenKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSLEEC.g:1697:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1701:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalSLEEC.g:1702:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalSLEEC.g:1709:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__TriggerAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1713:1: ( ( ( rule__Rule__TriggerAssignment_2 ) ) )
            // InternalSLEEC.g:1714:1: ( ( rule__Rule__TriggerAssignment_2 ) )
            {
            // InternalSLEEC.g:1714:1: ( ( rule__Rule__TriggerAssignment_2 ) )
            // InternalSLEEC.g:1715:2: ( rule__Rule__TriggerAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getTriggerAssignment_2()); 
            // InternalSLEEC.g:1716:2: ( rule__Rule__TriggerAssignment_2 )
            // InternalSLEEC.g:1716:3: rule__Rule__TriggerAssignment_2
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
    // InternalSLEEC.g:1724:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1728:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalSLEEC.g:1729:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalSLEEC.g:1736:1: rule__Rule__Group__3__Impl : ( 'then' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1740:1: ( ( 'then' ) )
            // InternalSLEEC.g:1741:1: ( 'then' )
            {
            // InternalSLEEC.g:1741:1: ( 'then' )
            // InternalSLEEC.g:1742:2: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSLEEC.g:1751:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1755:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalSLEEC.g:1756:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
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
    // InternalSLEEC.g:1763:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__ResponseAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1767:1: ( ( ( rule__Rule__ResponseAssignment_4 ) ) )
            // InternalSLEEC.g:1768:1: ( ( rule__Rule__ResponseAssignment_4 ) )
            {
            // InternalSLEEC.g:1768:1: ( ( rule__Rule__ResponseAssignment_4 ) )
            // InternalSLEEC.g:1769:2: ( rule__Rule__ResponseAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getResponseAssignment_4()); 
            // InternalSLEEC.g:1770:2: ( rule__Rule__ResponseAssignment_4 )
            // InternalSLEEC.g:1770:3: rule__Rule__ResponseAssignment_4
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
    // InternalSLEEC.g:1778:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1782:1: ( rule__Rule__Group__5__Impl )
            // InternalSLEEC.g:1783:2: rule__Rule__Group__5__Impl
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
    // InternalSLEEC.g:1789:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__DefeatersAssignment_5 )* ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1793:1: ( ( ( rule__Rule__DefeatersAssignment_5 )* ) )
            // InternalSLEEC.g:1794:1: ( ( rule__Rule__DefeatersAssignment_5 )* )
            {
            // InternalSLEEC.g:1794:1: ( ( rule__Rule__DefeatersAssignment_5 )* )
            // InternalSLEEC.g:1795:2: ( rule__Rule__DefeatersAssignment_5 )*
            {
             before(grammarAccess.getRuleAccess().getDefeatersAssignment_5()); 
            // InternalSLEEC.g:1796:2: ( rule__Rule__DefeatersAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==45) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSLEEC.g:1796:3: rule__Rule__DefeatersAssignment_5
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Rule__DefeatersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSLEEC.g:1805:1: rule__Trigger__Group__0 : rule__Trigger__Group__0__Impl rule__Trigger__Group__1 ;
    public final void rule__Trigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1809:1: ( rule__Trigger__Group__0__Impl rule__Trigger__Group__1 )
            // InternalSLEEC.g:1810:2: rule__Trigger__Group__0__Impl rule__Trigger__Group__1
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
    // InternalSLEEC.g:1817:1: rule__Trigger__Group__0__Impl : ( ( rule__Trigger__EventAssignment_0 ) ) ;
    public final void rule__Trigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1821:1: ( ( ( rule__Trigger__EventAssignment_0 ) ) )
            // InternalSLEEC.g:1822:1: ( ( rule__Trigger__EventAssignment_0 ) )
            {
            // InternalSLEEC.g:1822:1: ( ( rule__Trigger__EventAssignment_0 ) )
            // InternalSLEEC.g:1823:2: ( rule__Trigger__EventAssignment_0 )
            {
             before(grammarAccess.getTriggerAccess().getEventAssignment_0()); 
            // InternalSLEEC.g:1824:2: ( rule__Trigger__EventAssignment_0 )
            // InternalSLEEC.g:1824:3: rule__Trigger__EventAssignment_0
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
    // InternalSLEEC.g:1832:1: rule__Trigger__Group__1 : rule__Trigger__Group__1__Impl ;
    public final void rule__Trigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1836:1: ( rule__Trigger__Group__1__Impl )
            // InternalSLEEC.g:1837:2: rule__Trigger__Group__1__Impl
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
    // InternalSLEEC.g:1843:1: rule__Trigger__Group__1__Impl : ( ( rule__Trigger__Group_1__0 )? ) ;
    public final void rule__Trigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1847:1: ( ( ( rule__Trigger__Group_1__0 )? ) )
            // InternalSLEEC.g:1848:1: ( ( rule__Trigger__Group_1__0 )? )
            {
            // InternalSLEEC.g:1848:1: ( ( rule__Trigger__Group_1__0 )? )
            // InternalSLEEC.g:1849:2: ( rule__Trigger__Group_1__0 )?
            {
             before(grammarAccess.getTriggerAccess().getGroup_1()); 
            // InternalSLEEC.g:1850:2: ( rule__Trigger__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSLEEC.g:1850:3: rule__Trigger__Group_1__0
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
    // InternalSLEEC.g:1859:1: rule__Trigger__Group_1__0 : rule__Trigger__Group_1__0__Impl rule__Trigger__Group_1__1 ;
    public final void rule__Trigger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1863:1: ( rule__Trigger__Group_1__0__Impl rule__Trigger__Group_1__1 )
            // InternalSLEEC.g:1864:2: rule__Trigger__Group_1__0__Impl rule__Trigger__Group_1__1
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
    // InternalSLEEC.g:1871:1: rule__Trigger__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__Trigger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1875:1: ( ( 'and' ) )
            // InternalSLEEC.g:1876:1: ( 'and' )
            {
            // InternalSLEEC.g:1876:1: ( 'and' )
            // InternalSLEEC.g:1877:2: 'and'
            {
             before(grammarAccess.getTriggerAccess().getAndKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSLEEC.g:1886:1: rule__Trigger__Group_1__1 : rule__Trigger__Group_1__1__Impl ;
    public final void rule__Trigger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1890:1: ( rule__Trigger__Group_1__1__Impl )
            // InternalSLEEC.g:1891:2: rule__Trigger__Group_1__1__Impl
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
    // InternalSLEEC.g:1897:1: rule__Trigger__Group_1__1__Impl : ( ( rule__Trigger__ExprAssignment_1_1 ) ) ;
    public final void rule__Trigger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1901:1: ( ( ( rule__Trigger__ExprAssignment_1_1 ) ) )
            // InternalSLEEC.g:1902:1: ( ( rule__Trigger__ExprAssignment_1_1 ) )
            {
            // InternalSLEEC.g:1902:1: ( ( rule__Trigger__ExprAssignment_1_1 ) )
            // InternalSLEEC.g:1903:2: ( rule__Trigger__ExprAssignment_1_1 )
            {
             before(grammarAccess.getTriggerAccess().getExprAssignment_1_1()); 
            // InternalSLEEC.g:1904:2: ( rule__Trigger__ExprAssignment_1_1 )
            // InternalSLEEC.g:1904:3: rule__Trigger__ExprAssignment_1_1
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
    // InternalSLEEC.g:1913:1: rule__BoolComp__Group__0 : rule__BoolComp__Group__0__Impl rule__BoolComp__Group__1 ;
    public final void rule__BoolComp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1917:1: ( rule__BoolComp__Group__0__Impl rule__BoolComp__Group__1 )
            // InternalSLEEC.g:1918:2: rule__BoolComp__Group__0__Impl rule__BoolComp__Group__1
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
    // InternalSLEEC.g:1925:1: rule__BoolComp__Group__0__Impl : ( ruleNot ) ;
    public final void rule__BoolComp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1929:1: ( ( ruleNot ) )
            // InternalSLEEC.g:1930:1: ( ruleNot )
            {
            // InternalSLEEC.g:1930:1: ( ruleNot )
            // InternalSLEEC.g:1931:2: ruleNot
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
    // InternalSLEEC.g:1940:1: rule__BoolComp__Group__1 : rule__BoolComp__Group__1__Impl ;
    public final void rule__BoolComp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1944:1: ( rule__BoolComp__Group__1__Impl )
            // InternalSLEEC.g:1945:2: rule__BoolComp__Group__1__Impl
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
    // InternalSLEEC.g:1951:1: rule__BoolComp__Group__1__Impl : ( ( rule__BoolComp__Group_1__0 )* ) ;
    public final void rule__BoolComp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1955:1: ( ( ( rule__BoolComp__Group_1__0 )* ) )
            // InternalSLEEC.g:1956:1: ( ( rule__BoolComp__Group_1__0 )* )
            {
            // InternalSLEEC.g:1956:1: ( ( rule__BoolComp__Group_1__0 )* )
            // InternalSLEEC.g:1957:2: ( rule__BoolComp__Group_1__0 )*
            {
             before(grammarAccess.getBoolCompAccess().getGroup_1()); 
            // InternalSLEEC.g:1958:2: ( rule__BoolComp__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=17 && LA13_0<=18)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSLEEC.g:1958:3: rule__BoolComp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__BoolComp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSLEEC.g:1967:1: rule__BoolComp__Group_1__0 : rule__BoolComp__Group_1__0__Impl rule__BoolComp__Group_1__1 ;
    public final void rule__BoolComp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1971:1: ( rule__BoolComp__Group_1__0__Impl rule__BoolComp__Group_1__1 )
            // InternalSLEEC.g:1972:2: rule__BoolComp__Group_1__0__Impl rule__BoolComp__Group_1__1
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
    // InternalSLEEC.g:1979:1: rule__BoolComp__Group_1__0__Impl : ( () ) ;
    public final void rule__BoolComp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1983:1: ( ( () ) )
            // InternalSLEEC.g:1984:1: ( () )
            {
            // InternalSLEEC.g:1984:1: ( () )
            // InternalSLEEC.g:1985:2: ()
            {
             before(grammarAccess.getBoolCompAccess().getBoolCompLeftAction_1_0()); 
            // InternalSLEEC.g:1986:2: ()
            // InternalSLEEC.g:1986:3: 
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
    // InternalSLEEC.g:1994:1: rule__BoolComp__Group_1__1 : rule__BoolComp__Group_1__1__Impl rule__BoolComp__Group_1__2 ;
    public final void rule__BoolComp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:1998:1: ( rule__BoolComp__Group_1__1__Impl rule__BoolComp__Group_1__2 )
            // InternalSLEEC.g:1999:2: rule__BoolComp__Group_1__1__Impl rule__BoolComp__Group_1__2
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
    // InternalSLEEC.g:2006:1: rule__BoolComp__Group_1__1__Impl : ( ( rule__BoolComp__OpAssignment_1_1 ) ) ;
    public final void rule__BoolComp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2010:1: ( ( ( rule__BoolComp__OpAssignment_1_1 ) ) )
            // InternalSLEEC.g:2011:1: ( ( rule__BoolComp__OpAssignment_1_1 ) )
            {
            // InternalSLEEC.g:2011:1: ( ( rule__BoolComp__OpAssignment_1_1 ) )
            // InternalSLEEC.g:2012:2: ( rule__BoolComp__OpAssignment_1_1 )
            {
             before(grammarAccess.getBoolCompAccess().getOpAssignment_1_1()); 
            // InternalSLEEC.g:2013:2: ( rule__BoolComp__OpAssignment_1_1 )
            // InternalSLEEC.g:2013:3: rule__BoolComp__OpAssignment_1_1
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
    // InternalSLEEC.g:2021:1: rule__BoolComp__Group_1__2 : rule__BoolComp__Group_1__2__Impl ;
    public final void rule__BoolComp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2025:1: ( rule__BoolComp__Group_1__2__Impl )
            // InternalSLEEC.g:2026:2: rule__BoolComp__Group_1__2__Impl
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
    // InternalSLEEC.g:2032:1: rule__BoolComp__Group_1__2__Impl : ( ( rule__BoolComp__RightAssignment_1_2 ) ) ;
    public final void rule__BoolComp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2036:1: ( ( ( rule__BoolComp__RightAssignment_1_2 ) ) )
            // InternalSLEEC.g:2037:1: ( ( rule__BoolComp__RightAssignment_1_2 ) )
            {
            // InternalSLEEC.g:2037:1: ( ( rule__BoolComp__RightAssignment_1_2 ) )
            // InternalSLEEC.g:2038:2: ( rule__BoolComp__RightAssignment_1_2 )
            {
             before(grammarAccess.getBoolCompAccess().getRightAssignment_1_2()); 
            // InternalSLEEC.g:2039:2: ( rule__BoolComp__RightAssignment_1_2 )
            // InternalSLEEC.g:2039:3: rule__BoolComp__RightAssignment_1_2
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
    // InternalSLEEC.g:2048:1: rule__Not__Group_0__0 : rule__Not__Group_0__0__Impl rule__Not__Group_0__1 ;
    public final void rule__Not__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2052:1: ( rule__Not__Group_0__0__Impl rule__Not__Group_0__1 )
            // InternalSLEEC.g:2053:2: rule__Not__Group_0__0__Impl rule__Not__Group_0__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSLEEC.g:2060:1: rule__Not__Group_0__0__Impl : ( () ) ;
    public final void rule__Not__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2064:1: ( ( () ) )
            // InternalSLEEC.g:2065:1: ( () )
            {
            // InternalSLEEC.g:2065:1: ( () )
            // InternalSLEEC.g:2066:2: ()
            {
             before(grammarAccess.getNotAccess().getNotAction_0_0()); 
            // InternalSLEEC.g:2067:2: ()
            // InternalSLEEC.g:2067:3: 
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
    // InternalSLEEC.g:2075:1: rule__Not__Group_0__1 : rule__Not__Group_0__1__Impl rule__Not__Group_0__2 ;
    public final void rule__Not__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2079:1: ( rule__Not__Group_0__1__Impl rule__Not__Group_0__2 )
            // InternalSLEEC.g:2080:2: rule__Not__Group_0__1__Impl rule__Not__Group_0__2
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
    // InternalSLEEC.g:2087:1: rule__Not__Group_0__1__Impl : ( 'not' ) ;
    public final void rule__Not__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2091:1: ( ( 'not' ) )
            // InternalSLEEC.g:2092:1: ( 'not' )
            {
            // InternalSLEEC.g:2092:1: ( 'not' )
            // InternalSLEEC.g:2093:2: 'not'
            {
             before(grammarAccess.getNotAccess().getNotKeyword_0_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSLEEC.g:2102:1: rule__Not__Group_0__2 : rule__Not__Group_0__2__Impl ;
    public final void rule__Not__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2106:1: ( rule__Not__Group_0__2__Impl )
            // InternalSLEEC.g:2107:2: rule__Not__Group_0__2__Impl
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
    // InternalSLEEC.g:2113:1: rule__Not__Group_0__2__Impl : ( ( rule__Not__LeftAssignment_0_2 ) ) ;
    public final void rule__Not__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2117:1: ( ( ( rule__Not__LeftAssignment_0_2 ) ) )
            // InternalSLEEC.g:2118:1: ( ( rule__Not__LeftAssignment_0_2 ) )
            {
            // InternalSLEEC.g:2118:1: ( ( rule__Not__LeftAssignment_0_2 ) )
            // InternalSLEEC.g:2119:2: ( rule__Not__LeftAssignment_0_2 )
            {
             before(grammarAccess.getNotAccess().getLeftAssignment_0_2()); 
            // InternalSLEEC.g:2120:2: ( rule__Not__LeftAssignment_0_2 )
            // InternalSLEEC.g:2120:3: rule__Not__LeftAssignment_0_2
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
    // InternalSLEEC.g:2129:1: rule__RelComp__Group__0 : rule__RelComp__Group__0__Impl rule__RelComp__Group__1 ;
    public final void rule__RelComp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2133:1: ( rule__RelComp__Group__0__Impl rule__RelComp__Group__1 )
            // InternalSLEEC.g:2134:2: rule__RelComp__Group__0__Impl rule__RelComp__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSLEEC.g:2141:1: rule__RelComp__Group__0__Impl : ( ruleAtom ) ;
    public final void rule__RelComp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2145:1: ( ( ruleAtom ) )
            // InternalSLEEC.g:2146:1: ( ruleAtom )
            {
            // InternalSLEEC.g:2146:1: ( ruleAtom )
            // InternalSLEEC.g:2147:2: ruleAtom
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
    // InternalSLEEC.g:2156:1: rule__RelComp__Group__1 : rule__RelComp__Group__1__Impl ;
    public final void rule__RelComp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2160:1: ( rule__RelComp__Group__1__Impl )
            // InternalSLEEC.g:2161:2: rule__RelComp__Group__1__Impl
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
    // InternalSLEEC.g:2167:1: rule__RelComp__Group__1__Impl : ( ( rule__RelComp__Group_1__0 )* ) ;
    public final void rule__RelComp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2171:1: ( ( ( rule__RelComp__Group_1__0 )* ) )
            // InternalSLEEC.g:2172:1: ( ( rule__RelComp__Group_1__0 )* )
            {
            // InternalSLEEC.g:2172:1: ( ( rule__RelComp__Group_1__0 )* )
            // InternalSLEEC.g:2173:2: ( rule__RelComp__Group_1__0 )*
            {
             before(grammarAccess.getRelCompAccess().getGroup_1()); 
            // InternalSLEEC.g:2174:2: ( rule__RelComp__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=11 && LA14_0<=16)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSLEEC.g:2174:3: rule__RelComp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__RelComp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSLEEC.g:2183:1: rule__RelComp__Group_1__0 : rule__RelComp__Group_1__0__Impl rule__RelComp__Group_1__1 ;
    public final void rule__RelComp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2187:1: ( rule__RelComp__Group_1__0__Impl rule__RelComp__Group_1__1 )
            // InternalSLEEC.g:2188:2: rule__RelComp__Group_1__0__Impl rule__RelComp__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSLEEC.g:2195:1: rule__RelComp__Group_1__0__Impl : ( () ) ;
    public final void rule__RelComp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2199:1: ( ( () ) )
            // InternalSLEEC.g:2200:1: ( () )
            {
            // InternalSLEEC.g:2200:1: ( () )
            // InternalSLEEC.g:2201:2: ()
            {
             before(grammarAccess.getRelCompAccess().getRelCompLeftAction_1_0()); 
            // InternalSLEEC.g:2202:2: ()
            // InternalSLEEC.g:2202:3: 
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
    // InternalSLEEC.g:2210:1: rule__RelComp__Group_1__1 : rule__RelComp__Group_1__1__Impl rule__RelComp__Group_1__2 ;
    public final void rule__RelComp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2214:1: ( rule__RelComp__Group_1__1__Impl rule__RelComp__Group_1__2 )
            // InternalSLEEC.g:2215:2: rule__RelComp__Group_1__1__Impl rule__RelComp__Group_1__2
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
    // InternalSLEEC.g:2222:1: rule__RelComp__Group_1__1__Impl : ( ( rule__RelComp__OpAssignment_1_1 ) ) ;
    public final void rule__RelComp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2226:1: ( ( ( rule__RelComp__OpAssignment_1_1 ) ) )
            // InternalSLEEC.g:2227:1: ( ( rule__RelComp__OpAssignment_1_1 ) )
            {
            // InternalSLEEC.g:2227:1: ( ( rule__RelComp__OpAssignment_1_1 ) )
            // InternalSLEEC.g:2228:2: ( rule__RelComp__OpAssignment_1_1 )
            {
             before(grammarAccess.getRelCompAccess().getOpAssignment_1_1()); 
            // InternalSLEEC.g:2229:2: ( rule__RelComp__OpAssignment_1_1 )
            // InternalSLEEC.g:2229:3: rule__RelComp__OpAssignment_1_1
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
    // InternalSLEEC.g:2237:1: rule__RelComp__Group_1__2 : rule__RelComp__Group_1__2__Impl ;
    public final void rule__RelComp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2241:1: ( rule__RelComp__Group_1__2__Impl )
            // InternalSLEEC.g:2242:2: rule__RelComp__Group_1__2__Impl
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
    // InternalSLEEC.g:2248:1: rule__RelComp__Group_1__2__Impl : ( ( rule__RelComp__RightAssignment_1_2 ) ) ;
    public final void rule__RelComp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2252:1: ( ( ( rule__RelComp__RightAssignment_1_2 ) ) )
            // InternalSLEEC.g:2253:1: ( ( rule__RelComp__RightAssignment_1_2 ) )
            {
            // InternalSLEEC.g:2253:1: ( ( rule__RelComp__RightAssignment_1_2 ) )
            // InternalSLEEC.g:2254:2: ( rule__RelComp__RightAssignment_1_2 )
            {
             before(grammarAccess.getRelCompAccess().getRightAssignment_1_2()); 
            // InternalSLEEC.g:2255:2: ( rule__RelComp__RightAssignment_1_2 )
            // InternalSLEEC.g:2255:3: rule__RelComp__RightAssignment_1_2
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
    // InternalSLEEC.g:2264:1: rule__Atom__Group_1__0 : rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 ;
    public final void rule__Atom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2268:1: ( rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 )
            // InternalSLEEC.g:2269:2: rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1
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
    // InternalSLEEC.g:2276:1: rule__Atom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2280:1: ( ( '(' ) )
            // InternalSLEEC.g:2281:1: ( '(' )
            {
            // InternalSLEEC.g:2281:1: ( '(' )
            // InternalSLEEC.g:2282:2: '('
            {
             before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSLEEC.g:2291:1: rule__Atom__Group_1__1 : rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 ;
    public final void rule__Atom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2295:1: ( rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 )
            // InternalSLEEC.g:2296:2: rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSLEEC.g:2303:1: rule__Atom__Group_1__1__Impl : ( ruleMBoolExpr ) ;
    public final void rule__Atom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2307:1: ( ( ruleMBoolExpr ) )
            // InternalSLEEC.g:2308:1: ( ruleMBoolExpr )
            {
            // InternalSLEEC.g:2308:1: ( ruleMBoolExpr )
            // InternalSLEEC.g:2309:2: ruleMBoolExpr
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
    // InternalSLEEC.g:2318:1: rule__Atom__Group_1__2 : rule__Atom__Group_1__2__Impl ;
    public final void rule__Atom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2322:1: ( rule__Atom__Group_1__2__Impl )
            // InternalSLEEC.g:2323:2: rule__Atom__Group_1__2__Impl
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
    // InternalSLEEC.g:2329:1: rule__Atom__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2333:1: ( ( ')' ) )
            // InternalSLEEC.g:2334:1: ( ')' )
            {
            // InternalSLEEC.g:2334:1: ( ')' )
            // InternalSLEEC.g:2335:2: ')'
            {
             before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2()); 
            match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__Response__Group__0"
    // InternalSLEEC.g:2345:1: rule__Response__Group__0 : rule__Response__Group__0__Impl rule__Response__Group__1 ;
    public final void rule__Response__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2349:1: ( rule__Response__Group__0__Impl rule__Response__Group__1 )
            // InternalSLEEC.g:2350:2: rule__Response__Group__0__Impl rule__Response__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Response__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__1();

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
    // $ANTLR end "rule__Response__Group__0"


    // $ANTLR start "rule__Response__Group__0__Impl"
    // InternalSLEEC.g:2357:1: rule__Response__Group__0__Impl : ( ( rule__Response__NotAssignment_0 ) ) ;
    public final void rule__Response__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2361:1: ( ( ( rule__Response__NotAssignment_0 ) ) )
            // InternalSLEEC.g:2362:1: ( ( rule__Response__NotAssignment_0 ) )
            {
            // InternalSLEEC.g:2362:1: ( ( rule__Response__NotAssignment_0 ) )
            // InternalSLEEC.g:2363:2: ( rule__Response__NotAssignment_0 )
            {
             before(grammarAccess.getResponseAccess().getNotAssignment_0()); 
            // InternalSLEEC.g:2364:2: ( rule__Response__NotAssignment_0 )
            // InternalSLEEC.g:2364:3: rule__Response__NotAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Response__NotAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getNotAssignment_0()); 

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
    // $ANTLR end "rule__Response__Group__0__Impl"


    // $ANTLR start "rule__Response__Group__1"
    // InternalSLEEC.g:2372:1: rule__Response__Group__1 : rule__Response__Group__1__Impl rule__Response__Group__2 ;
    public final void rule__Response__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2376:1: ( rule__Response__Group__1__Impl rule__Response__Group__2 )
            // InternalSLEEC.g:2377:2: rule__Response__Group__1__Impl rule__Response__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Response__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__2();

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
    // $ANTLR end "rule__Response__Group__1"


    // $ANTLR start "rule__Response__Group__1__Impl"
    // InternalSLEEC.g:2384:1: rule__Response__Group__1__Impl : ( ( rule__Response__EventAssignment_1 ) ) ;
    public final void rule__Response__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2388:1: ( ( ( rule__Response__EventAssignment_1 ) ) )
            // InternalSLEEC.g:2389:1: ( ( rule__Response__EventAssignment_1 ) )
            {
            // InternalSLEEC.g:2389:1: ( ( rule__Response__EventAssignment_1 ) )
            // InternalSLEEC.g:2390:2: ( rule__Response__EventAssignment_1 )
            {
             before(grammarAccess.getResponseAccess().getEventAssignment_1()); 
            // InternalSLEEC.g:2391:2: ( rule__Response__EventAssignment_1 )
            // InternalSLEEC.g:2391:3: rule__Response__EventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Response__EventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getEventAssignment_1()); 

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
    // $ANTLR end "rule__Response__Group__1__Impl"


    // $ANTLR start "rule__Response__Group__2"
    // InternalSLEEC.g:2399:1: rule__Response__Group__2 : rule__Response__Group__2__Impl ;
    public final void rule__Response__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2403:1: ( rule__Response__Group__2__Impl )
            // InternalSLEEC.g:2404:2: rule__Response__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__2__Impl();

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
    // $ANTLR end "rule__Response__Group__2"


    // $ANTLR start "rule__Response__Group__2__Impl"
    // InternalSLEEC.g:2410:1: rule__Response__Group__2__Impl : ( ( rule__Response__Group_2__0 )? ) ;
    public final void rule__Response__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2414:1: ( ( ( rule__Response__Group_2__0 )? ) )
            // InternalSLEEC.g:2415:1: ( ( rule__Response__Group_2__0 )? )
            {
            // InternalSLEEC.g:2415:1: ( ( rule__Response__Group_2__0 )? )
            // InternalSLEEC.g:2416:2: ( rule__Response__Group_2__0 )?
            {
             before(grammarAccess.getResponseAccess().getGroup_2()); 
            // InternalSLEEC.g:2417:2: ( rule__Response__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSLEEC.g:2417:3: rule__Response__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Response__Group__2__Impl"


    // $ANTLR start "rule__Response__Group_2__0"
    // InternalSLEEC.g:2426:1: rule__Response__Group_2__0 : rule__Response__Group_2__0__Impl rule__Response__Group_2__1 ;
    public final void rule__Response__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2430:1: ( rule__Response__Group_2__0__Impl rule__Response__Group_2__1 )
            // InternalSLEEC.g:2431:2: rule__Response__Group_2__0__Impl rule__Response__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Response__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_2__1();

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
    // $ANTLR end "rule__Response__Group_2__0"


    // $ANTLR start "rule__Response__Group_2__0__Impl"
    // InternalSLEEC.g:2438:1: rule__Response__Group_2__0__Impl : ( 'within' ) ;
    public final void rule__Response__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2442:1: ( ( 'within' ) )
            // InternalSLEEC.g:2443:1: ( 'within' )
            {
            // InternalSLEEC.g:2443:1: ( 'within' )
            // InternalSLEEC.g:2444:2: 'within'
            {
             before(grammarAccess.getResponseAccess().getWithinKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getWithinKeyword_2_0()); 

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
    // $ANTLR end "rule__Response__Group_2__0__Impl"


    // $ANTLR start "rule__Response__Group_2__1"
    // InternalSLEEC.g:2453:1: rule__Response__Group_2__1 : rule__Response__Group_2__1__Impl rule__Response__Group_2__2 ;
    public final void rule__Response__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2457:1: ( rule__Response__Group_2__1__Impl rule__Response__Group_2__2 )
            // InternalSLEEC.g:2458:2: rule__Response__Group_2__1__Impl rule__Response__Group_2__2
            {
            pushFollow(FOLLOW_34);
            rule__Response__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_2__2();

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
    // $ANTLR end "rule__Response__Group_2__1"


    // $ANTLR start "rule__Response__Group_2__1__Impl"
    // InternalSLEEC.g:2465:1: rule__Response__Group_2__1__Impl : ( ( rule__Response__TimeAssignment_2_1 ) ) ;
    public final void rule__Response__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2469:1: ( ( ( rule__Response__TimeAssignment_2_1 ) ) )
            // InternalSLEEC.g:2470:1: ( ( rule__Response__TimeAssignment_2_1 ) )
            {
            // InternalSLEEC.g:2470:1: ( ( rule__Response__TimeAssignment_2_1 ) )
            // InternalSLEEC.g:2471:2: ( rule__Response__TimeAssignment_2_1 )
            {
             before(grammarAccess.getResponseAccess().getTimeAssignment_2_1()); 
            // InternalSLEEC.g:2472:2: ( rule__Response__TimeAssignment_2_1 )
            // InternalSLEEC.g:2472:3: rule__Response__TimeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Response__TimeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getTimeAssignment_2_1()); 

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
    // $ANTLR end "rule__Response__Group_2__1__Impl"


    // $ANTLR start "rule__Response__Group_2__2"
    // InternalSLEEC.g:2480:1: rule__Response__Group_2__2 : rule__Response__Group_2__2__Impl ;
    public final void rule__Response__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2484:1: ( rule__Response__Group_2__2__Impl )
            // InternalSLEEC.g:2485:2: rule__Response__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group_2__2__Impl();

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
    // $ANTLR end "rule__Response__Group_2__2"


    // $ANTLR start "rule__Response__Group_2__2__Impl"
    // InternalSLEEC.g:2491:1: rule__Response__Group_2__2__Impl : ( ( rule__Response__Group_2_2__0 )? ) ;
    public final void rule__Response__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2495:1: ( ( ( rule__Response__Group_2_2__0 )? ) )
            // InternalSLEEC.g:2496:1: ( ( rule__Response__Group_2_2__0 )? )
            {
            // InternalSLEEC.g:2496:1: ( ( rule__Response__Group_2_2__0 )? )
            // InternalSLEEC.g:2497:2: ( rule__Response__Group_2_2__0 )?
            {
             before(grammarAccess.getResponseAccess().getGroup_2_2()); 
            // InternalSLEEC.g:2498:2: ( rule__Response__Group_2_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSLEEC.g:2498:3: rule__Response__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Response__Group_2__2__Impl"


    // $ANTLR start "rule__Response__Group_2_2__0"
    // InternalSLEEC.g:2507:1: rule__Response__Group_2_2__0 : rule__Response__Group_2_2__0__Impl rule__Response__Group_2_2__1 ;
    public final void rule__Response__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2511:1: ( rule__Response__Group_2_2__0__Impl rule__Response__Group_2_2__1 )
            // InternalSLEEC.g:2512:2: rule__Response__Group_2_2__0__Impl rule__Response__Group_2_2__1
            {
            pushFollow(FOLLOW_23);
            rule__Response__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_2_2__1();

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
    // $ANTLR end "rule__Response__Group_2_2__0"


    // $ANTLR start "rule__Response__Group_2_2__0__Impl"
    // InternalSLEEC.g:2519:1: rule__Response__Group_2_2__0__Impl : ( 'otherwise' ) ;
    public final void rule__Response__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2523:1: ( ( 'otherwise' ) )
            // InternalSLEEC.g:2524:1: ( 'otherwise' )
            {
            // InternalSLEEC.g:2524:1: ( 'otherwise' )
            // InternalSLEEC.g:2525:2: 'otherwise'
            {
             before(grammarAccess.getResponseAccess().getOtherwiseKeyword_2_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getOtherwiseKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Response__Group_2_2__0__Impl"


    // $ANTLR start "rule__Response__Group_2_2__1"
    // InternalSLEEC.g:2534:1: rule__Response__Group_2_2__1 : rule__Response__Group_2_2__1__Impl ;
    public final void rule__Response__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2538:1: ( rule__Response__Group_2_2__1__Impl )
            // InternalSLEEC.g:2539:2: rule__Response__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Response__Group_2_2__1"


    // $ANTLR start "rule__Response__Group_2_2__1__Impl"
    // InternalSLEEC.g:2545:1: rule__Response__Group_2_2__1__Impl : ( ( rule__Response__ResponseAssignment_2_2_1 ) ) ;
    public final void rule__Response__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2549:1: ( ( ( rule__Response__ResponseAssignment_2_2_1 ) ) )
            // InternalSLEEC.g:2550:1: ( ( rule__Response__ResponseAssignment_2_2_1 ) )
            {
            // InternalSLEEC.g:2550:1: ( ( rule__Response__ResponseAssignment_2_2_1 ) )
            // InternalSLEEC.g:2551:2: ( rule__Response__ResponseAssignment_2_2_1 )
            {
             before(grammarAccess.getResponseAccess().getResponseAssignment_2_2_1()); 
            // InternalSLEEC.g:2552:2: ( rule__Response__ResponseAssignment_2_2_1 )
            // InternalSLEEC.g:2552:3: rule__Response__ResponseAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Response__ResponseAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getResponseAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Response__Group_2_2__1__Impl"


    // $ANTLR start "rule__Time__Group__0"
    // InternalSLEEC.g:2561:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2565:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalSLEEC.g:2566:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Time__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__1();

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
    // $ANTLR end "rule__Time__Group__0"


    // $ANTLR start "rule__Time__Group__0__Impl"
    // InternalSLEEC.g:2573:1: rule__Time__Group__0__Impl : ( ( rule__Time__ValueAssignment_0 ) ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2577:1: ( ( ( rule__Time__ValueAssignment_0 ) ) )
            // InternalSLEEC.g:2578:1: ( ( rule__Time__ValueAssignment_0 ) )
            {
            // InternalSLEEC.g:2578:1: ( ( rule__Time__ValueAssignment_0 ) )
            // InternalSLEEC.g:2579:2: ( rule__Time__ValueAssignment_0 )
            {
             before(grammarAccess.getTimeAccess().getValueAssignment_0()); 
            // InternalSLEEC.g:2580:2: ( rule__Time__ValueAssignment_0 )
            // InternalSLEEC.g:2580:3: rule__Time__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Time__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__Time__Group__0__Impl"


    // $ANTLR start "rule__Time__Group__1"
    // InternalSLEEC.g:2588:1: rule__Time__Group__1 : rule__Time__Group__1__Impl ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2592:1: ( rule__Time__Group__1__Impl )
            // InternalSLEEC.g:2593:2: rule__Time__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__1__Impl();

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
    // $ANTLR end "rule__Time__Group__1"


    // $ANTLR start "rule__Time__Group__1__Impl"
    // InternalSLEEC.g:2599:1: rule__Time__Group__1__Impl : ( ( rule__Time__UnitAssignment_1 ) ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2603:1: ( ( ( rule__Time__UnitAssignment_1 ) ) )
            // InternalSLEEC.g:2604:1: ( ( rule__Time__UnitAssignment_1 ) )
            {
            // InternalSLEEC.g:2604:1: ( ( rule__Time__UnitAssignment_1 ) )
            // InternalSLEEC.g:2605:2: ( rule__Time__UnitAssignment_1 )
            {
             before(grammarAccess.getTimeAccess().getUnitAssignment_1()); 
            // InternalSLEEC.g:2606:2: ( rule__Time__UnitAssignment_1 )
            // InternalSLEEC.g:2606:3: rule__Time__UnitAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Time__UnitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getUnitAssignment_1()); 

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
    // $ANTLR end "rule__Time__Group__1__Impl"


    // $ANTLR start "rule__Defeater__Group__0"
    // InternalSLEEC.g:2615:1: rule__Defeater__Group__0 : rule__Defeater__Group__0__Impl rule__Defeater__Group__1 ;
    public final void rule__Defeater__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2619:1: ( rule__Defeater__Group__0__Impl rule__Defeater__Group__1 )
            // InternalSLEEC.g:2620:2: rule__Defeater__Group__0__Impl rule__Defeater__Group__1
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
    // InternalSLEEC.g:2627:1: rule__Defeater__Group__0__Impl : ( 'unless' ) ;
    public final void rule__Defeater__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2631:1: ( ( 'unless' ) )
            // InternalSLEEC.g:2632:1: ( 'unless' )
            {
            // InternalSLEEC.g:2632:1: ( 'unless' )
            // InternalSLEEC.g:2633:2: 'unless'
            {
             before(grammarAccess.getDefeaterAccess().getUnlessKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSLEEC.g:2642:1: rule__Defeater__Group__1 : rule__Defeater__Group__1__Impl rule__Defeater__Group__2 ;
    public final void rule__Defeater__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2646:1: ( rule__Defeater__Group__1__Impl rule__Defeater__Group__2 )
            // InternalSLEEC.g:2647:2: rule__Defeater__Group__1__Impl rule__Defeater__Group__2
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
    // InternalSLEEC.g:2654:1: rule__Defeater__Group__1__Impl : ( ( rule__Defeater__ExprAssignment_1 ) ) ;
    public final void rule__Defeater__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2658:1: ( ( ( rule__Defeater__ExprAssignment_1 ) ) )
            // InternalSLEEC.g:2659:1: ( ( rule__Defeater__ExprAssignment_1 ) )
            {
            // InternalSLEEC.g:2659:1: ( ( rule__Defeater__ExprAssignment_1 ) )
            // InternalSLEEC.g:2660:2: ( rule__Defeater__ExprAssignment_1 )
            {
             before(grammarAccess.getDefeaterAccess().getExprAssignment_1()); 
            // InternalSLEEC.g:2661:2: ( rule__Defeater__ExprAssignment_1 )
            // InternalSLEEC.g:2661:3: rule__Defeater__ExprAssignment_1
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
    // InternalSLEEC.g:2669:1: rule__Defeater__Group__2 : rule__Defeater__Group__2__Impl ;
    public final void rule__Defeater__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2673:1: ( rule__Defeater__Group__2__Impl )
            // InternalSLEEC.g:2674:2: rule__Defeater__Group__2__Impl
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
    // InternalSLEEC.g:2680:1: rule__Defeater__Group__2__Impl : ( ( rule__Defeater__Group_2__0 )? ) ;
    public final void rule__Defeater__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2684:1: ( ( ( rule__Defeater__Group_2__0 )? ) )
            // InternalSLEEC.g:2685:1: ( ( rule__Defeater__Group_2__0 )? )
            {
            // InternalSLEEC.g:2685:1: ( ( rule__Defeater__Group_2__0 )? )
            // InternalSLEEC.g:2686:2: ( rule__Defeater__Group_2__0 )?
            {
             before(grammarAccess.getDefeaterAccess().getGroup_2()); 
            // InternalSLEEC.g:2687:2: ( rule__Defeater__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSLEEC.g:2687:3: rule__Defeater__Group_2__0
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
    // InternalSLEEC.g:2696:1: rule__Defeater__Group_2__0 : rule__Defeater__Group_2__0__Impl rule__Defeater__Group_2__1 ;
    public final void rule__Defeater__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2700:1: ( rule__Defeater__Group_2__0__Impl rule__Defeater__Group_2__1 )
            // InternalSLEEC.g:2701:2: rule__Defeater__Group_2__0__Impl rule__Defeater__Group_2__1
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
    // InternalSLEEC.g:2708:1: rule__Defeater__Group_2__0__Impl : ( 'then' ) ;
    public final void rule__Defeater__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2712:1: ( ( 'then' ) )
            // InternalSLEEC.g:2713:1: ( 'then' )
            {
            // InternalSLEEC.g:2713:1: ( 'then' )
            // InternalSLEEC.g:2714:2: 'then'
            {
             before(grammarAccess.getDefeaterAccess().getThenKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSLEEC.g:2723:1: rule__Defeater__Group_2__1 : rule__Defeater__Group_2__1__Impl ;
    public final void rule__Defeater__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2727:1: ( rule__Defeater__Group_2__1__Impl )
            // InternalSLEEC.g:2728:2: rule__Defeater__Group_2__1__Impl
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
    // InternalSLEEC.g:2734:1: rule__Defeater__Group_2__1__Impl : ( ( rule__Defeater__ResponseAssignment_2_1 ) ) ;
    public final void rule__Defeater__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2738:1: ( ( ( rule__Defeater__ResponseAssignment_2_1 ) ) )
            // InternalSLEEC.g:2739:1: ( ( rule__Defeater__ResponseAssignment_2_1 ) )
            {
            // InternalSLEEC.g:2739:1: ( ( rule__Defeater__ResponseAssignment_2_1 ) )
            // InternalSLEEC.g:2740:2: ( rule__Defeater__ResponseAssignment_2_1 )
            {
             before(grammarAccess.getDefeaterAccess().getResponseAssignment_2_1()); 
            // InternalSLEEC.g:2741:2: ( rule__Defeater__ResponseAssignment_2_1 )
            // InternalSLEEC.g:2741:3: rule__Defeater__ResponseAssignment_2_1
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


    // $ANTLR start "rule__Specification__DefBlockAssignment_0"
    // InternalSLEEC.g:2750:1: rule__Specification__DefBlockAssignment_0 : ( ruleDefblock ) ;
    public final void rule__Specification__DefBlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2754:1: ( ( ruleDefblock ) )
            // InternalSLEEC.g:2755:2: ( ruleDefblock )
            {
            // InternalSLEEC.g:2755:2: ( ruleDefblock )
            // InternalSLEEC.g:2756:3: ruleDefblock
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
    // InternalSLEEC.g:2765:1: rule__Specification__RuleBlockAssignment_1 : ( ruleRuleBlock ) ;
    public final void rule__Specification__RuleBlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2769:1: ( ( ruleRuleBlock ) )
            // InternalSLEEC.g:2770:2: ( ruleRuleBlock )
            {
            // InternalSLEEC.g:2770:2: ( ruleRuleBlock )
            // InternalSLEEC.g:2771:3: ruleRuleBlock
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
    // InternalSLEEC.g:2780:1: rule__Defblock__DefinitionsAssignment_1 : ( ruleDefinition ) ;
    public final void rule__Defblock__DefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2784:1: ( ( ruleDefinition ) )
            // InternalSLEEC.g:2785:2: ( ruleDefinition )
            {
            // InternalSLEEC.g:2785:2: ( ruleDefinition )
            // InternalSLEEC.g:2786:3: ruleDefinition
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
    // InternalSLEEC.g:2795:1: rule__Definition__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2799:1: ( ( RULE_ID ) )
            // InternalSLEEC.g:2800:2: ( RULE_ID )
            {
            // InternalSLEEC.g:2800:2: ( RULE_ID )
            // InternalSLEEC.g:2801:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); 

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
    // InternalSLEEC.g:2810:1: rule__Definition__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2814:1: ( ( RULE_ID ) )
            // InternalSLEEC.g:2815:2: ( RULE_ID )
            {
            // InternalSLEEC.g:2815:2: ( RULE_ID )
            // InternalSLEEC.g:2816:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_2_0()); 

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
    // InternalSLEEC.g:2825:1: rule__Definition__TypeAssignment_1_4 : ( ruleType ) ;
    public final void rule__Definition__TypeAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2829:1: ( ( ruleType ) )
            // InternalSLEEC.g:2830:2: ( ruleType )
            {
            // InternalSLEEC.g:2830:2: ( ruleType )
            // InternalSLEEC.g:2831:3: ruleType
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
    // InternalSLEEC.g:2840:1: rule__Definition__NameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2844:1: ( ( RULE_ID ) )
            // InternalSLEEC.g:2845:2: ( RULE_ID )
            {
            // InternalSLEEC.g:2845:2: ( RULE_ID )
            // InternalSLEEC.g:2846:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_2_2_0()); 

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
    // InternalSLEEC.g:2855:1: rule__Definition__ValueAssignment_2_4 : ( ruleValue ) ;
    public final void rule__Definition__ValueAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2859:1: ( ( ruleValue ) )
            // InternalSLEEC.g:2860:2: ( ruleValue )
            {
            // InternalSLEEC.g:2860:2: ( ruleValue )
            // InternalSLEEC.g:2861:3: ruleValue
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


    // $ANTLR start "rule__Type__ScaleParamsAssignment_2_3"
    // InternalSLEEC.g:2870:1: rule__Type__ScaleParamsAssignment_2_3 : ( ruleLiteral ) ;
    public final void rule__Type__ScaleParamsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2874:1: ( ( ruleLiteral ) )
            // InternalSLEEC.g:2875:2: ( ruleLiteral )
            {
            // InternalSLEEC.g:2875:2: ( ruleLiteral )
            // InternalSLEEC.g:2876:3: ruleLiteral
            {
             before(grammarAccess.getTypeAccess().getScaleParamsLiteralParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getScaleParamsLiteralParserRuleCall_2_3_0()); 

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
    // InternalSLEEC.g:2885:1: rule__Type__ScaleParamsAssignment_2_4_1 : ( ruleLiteral ) ;
    public final void rule__Type__ScaleParamsAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2889:1: ( ( ruleLiteral ) )
            // InternalSLEEC.g:2890:2: ( ruleLiteral )
            {
            // InternalSLEEC.g:2890:2: ( ruleLiteral )
            // InternalSLEEC.g:2891:3: ruleLiteral
            {
             before(grammarAccess.getTypeAccess().getScaleParamsLiteralParserRuleCall_2_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getScaleParamsLiteralParserRuleCall_2_4_1_0()); 

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
    // InternalSLEEC.g:2900:1: rule__RuleBlock__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__RuleBlock__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2904:1: ( ( ruleRule ) )
            // InternalSLEEC.g:2905:2: ( ruleRule )
            {
            // InternalSLEEC.g:2905:2: ( ruleRule )
            // InternalSLEEC.g:2906:3: ruleRule
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
    // InternalSLEEC.g:2915:1: rule__Rule__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2919:1: ( ( RULE_ID ) )
            // InternalSLEEC.g:2920:2: ( RULE_ID )
            {
            // InternalSLEEC.g:2920:2: ( RULE_ID )
            // InternalSLEEC.g:2921:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // InternalSLEEC.g:2930:1: rule__Rule__TriggerAssignment_2 : ( ruleTrigger ) ;
    public final void rule__Rule__TriggerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2934:1: ( ( ruleTrigger ) )
            // InternalSLEEC.g:2935:2: ( ruleTrigger )
            {
            // InternalSLEEC.g:2935:2: ( ruleTrigger )
            // InternalSLEEC.g:2936:3: ruleTrigger
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
    // InternalSLEEC.g:2945:1: rule__Rule__ResponseAssignment_4 : ( ruleResponse ) ;
    public final void rule__Rule__ResponseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2949:1: ( ( ruleResponse ) )
            // InternalSLEEC.g:2950:2: ( ruleResponse )
            {
            // InternalSLEEC.g:2950:2: ( ruleResponse )
            // InternalSLEEC.g:2951:3: ruleResponse
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
    // InternalSLEEC.g:2960:1: rule__Rule__DefeatersAssignment_5 : ( ruleDefeater ) ;
    public final void rule__Rule__DefeatersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2964:1: ( ( ruleDefeater ) )
            // InternalSLEEC.g:2965:2: ( ruleDefeater )
            {
            // InternalSLEEC.g:2965:2: ( ruleDefeater )
            // InternalSLEEC.g:2966:3: ruleDefeater
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
    // InternalSLEEC.g:2975:1: rule__Trigger__EventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Trigger__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2979:1: ( ( ( RULE_ID ) ) )
            // InternalSLEEC.g:2980:2: ( ( RULE_ID ) )
            {
            // InternalSLEEC.g:2980:2: ( ( RULE_ID ) )
            // InternalSLEEC.g:2981:3: ( RULE_ID )
            {
             before(grammarAccess.getTriggerAccess().getEventEventCrossReference_0_0()); 
            // InternalSLEEC.g:2982:3: ( RULE_ID )
            // InternalSLEEC.g:2983:4: RULE_ID
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
    // InternalSLEEC.g:2994:1: rule__Trigger__ExprAssignment_1_1 : ( ruleMBoolExpr ) ;
    public final void rule__Trigger__ExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:2998:1: ( ( ruleMBoolExpr ) )
            // InternalSLEEC.g:2999:2: ( ruleMBoolExpr )
            {
            // InternalSLEEC.g:2999:2: ( ruleMBoolExpr )
            // InternalSLEEC.g:3000:3: ruleMBoolExpr
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
    // InternalSLEEC.g:3009:1: rule__BoolComp__OpAssignment_1_1 : ( ruleBoolOp ) ;
    public final void rule__BoolComp__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3013:1: ( ( ruleBoolOp ) )
            // InternalSLEEC.g:3014:2: ( ruleBoolOp )
            {
            // InternalSLEEC.g:3014:2: ( ruleBoolOp )
            // InternalSLEEC.g:3015:3: ruleBoolOp
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
    // InternalSLEEC.g:3024:1: rule__BoolComp__RightAssignment_1_2 : ( ruleNot ) ;
    public final void rule__BoolComp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3028:1: ( ( ruleNot ) )
            // InternalSLEEC.g:3029:2: ( ruleNot )
            {
            // InternalSLEEC.g:3029:2: ( ruleNot )
            // InternalSLEEC.g:3030:3: ruleNot
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
    // InternalSLEEC.g:3039:1: rule__Not__LeftAssignment_0_2 : ( ruleRelComp ) ;
    public final void rule__Not__LeftAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3043:1: ( ( ruleRelComp ) )
            // InternalSLEEC.g:3044:2: ( ruleRelComp )
            {
            // InternalSLEEC.g:3044:2: ( ruleRelComp )
            // InternalSLEEC.g:3045:3: ruleRelComp
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
    // InternalSLEEC.g:3054:1: rule__RelComp__OpAssignment_1_1 : ( ruleRelOp ) ;
    public final void rule__RelComp__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3058:1: ( ( ruleRelOp ) )
            // InternalSLEEC.g:3059:2: ( ruleRelOp )
            {
            // InternalSLEEC.g:3059:2: ( ruleRelOp )
            // InternalSLEEC.g:3060:3: ruleRelOp
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
    // InternalSLEEC.g:3069:1: rule__RelComp__RightAssignment_1_2 : ( ruleAtom ) ;
    public final void rule__RelComp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3073:1: ( ( ruleAtom ) )
            // InternalSLEEC.g:3074:2: ( ruleAtom )
            {
            // InternalSLEEC.g:3074:2: ( ruleAtom )
            // InternalSLEEC.g:3075:3: ruleAtom
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


    // $ANTLR start "rule__Atom__MeasureAssignment_0"
    // InternalSLEEC.g:3084:1: rule__Atom__MeasureAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Atom__MeasureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3088:1: ( ( ( RULE_ID ) ) )
            // InternalSLEEC.g:3089:2: ( ( RULE_ID ) )
            {
            // InternalSLEEC.g:3089:2: ( ( RULE_ID ) )
            // InternalSLEEC.g:3090:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomAccess().getMeasureMeasureCrossReference_0_0()); 
            // InternalSLEEC.g:3091:3: ( RULE_ID )
            // InternalSLEEC.g:3092:4: RULE_ID
            {
             before(grammarAccess.getAtomAccess().getMeasureMeasureIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getMeasureMeasureIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAtomAccess().getMeasureMeasureCrossReference_0_0()); 

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
    // $ANTLR end "rule__Atom__MeasureAssignment_0"


    // $ANTLR start "rule__Response__NotAssignment_0"
    // InternalSLEEC.g:3103:1: rule__Response__NotAssignment_0 : ( ( 'not' ) ) ;
    public final void rule__Response__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3107:1: ( ( ( 'not' ) ) )
            // InternalSLEEC.g:3108:2: ( ( 'not' ) )
            {
            // InternalSLEEC.g:3108:2: ( ( 'not' ) )
            // InternalSLEEC.g:3109:3: ( 'not' )
            {
             before(grammarAccess.getResponseAccess().getNotNotKeyword_0_0()); 
            // InternalSLEEC.g:3110:3: ( 'not' )
            // InternalSLEEC.g:3111:4: 'not'
            {
             before(grammarAccess.getResponseAccess().getNotNotKeyword_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getNotNotKeyword_0_0()); 

            }

             after(grammarAccess.getResponseAccess().getNotNotKeyword_0_0()); 

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
    // $ANTLR end "rule__Response__NotAssignment_0"


    // $ANTLR start "rule__Response__EventAssignment_1"
    // InternalSLEEC.g:3122:1: rule__Response__EventAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Response__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3126:1: ( ( ( RULE_ID ) ) )
            // InternalSLEEC.g:3127:2: ( ( RULE_ID ) )
            {
            // InternalSLEEC.g:3127:2: ( ( RULE_ID ) )
            // InternalSLEEC.g:3128:3: ( RULE_ID )
            {
             before(grammarAccess.getResponseAccess().getEventEventCrossReference_1_0()); 
            // InternalSLEEC.g:3129:3: ( RULE_ID )
            // InternalSLEEC.g:3130:4: RULE_ID
            {
             before(grammarAccess.getResponseAccess().getEventEventIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getEventEventIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getResponseAccess().getEventEventCrossReference_1_0()); 

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
    // $ANTLR end "rule__Response__EventAssignment_1"


    // $ANTLR start "rule__Response__TimeAssignment_2_1"
    // InternalSLEEC.g:3141:1: rule__Response__TimeAssignment_2_1 : ( ruleTime ) ;
    public final void rule__Response__TimeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3145:1: ( ( ruleTime ) )
            // InternalSLEEC.g:3146:2: ( ruleTime )
            {
            // InternalSLEEC.g:3146:2: ( ruleTime )
            // InternalSLEEC.g:3147:3: ruleTime
            {
             before(grammarAccess.getResponseAccess().getTimeTimeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getTimeTimeParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Response__TimeAssignment_2_1"


    // $ANTLR start "rule__Response__ResponseAssignment_2_2_1"
    // InternalSLEEC.g:3156:1: rule__Response__ResponseAssignment_2_2_1 : ( ruleResponse ) ;
    public final void rule__Response__ResponseAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3160:1: ( ( ruleResponse ) )
            // InternalSLEEC.g:3161:2: ( ruleResponse )
            {
            // InternalSLEEC.g:3161:2: ( ruleResponse )
            // InternalSLEEC.g:3162:3: ruleResponse
            {
             before(grammarAccess.getResponseAccess().getResponseResponseParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getResponseResponseParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__Response__ResponseAssignment_2_2_1"


    // $ANTLR start "rule__Time__ValueAssignment_0"
    // InternalSLEEC.g:3171:1: rule__Time__ValueAssignment_0 : ( ruleValue ) ;
    public final void rule__Time__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3175:1: ( ( ruleValue ) )
            // InternalSLEEC.g:3176:2: ( ruleValue )
            {
            // InternalSLEEC.g:3176:2: ( ruleValue )
            // InternalSLEEC.g:3177:3: ruleValue
            {
             before(grammarAccess.getTimeAccess().getValueValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getTimeAccess().getValueValueParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Time__ValueAssignment_0"


    // $ANTLR start "rule__Time__UnitAssignment_1"
    // InternalSLEEC.g:3186:1: rule__Time__UnitAssignment_1 : ( ruleTimeUnit ) ;
    public final void rule__Time__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3190:1: ( ( ruleTimeUnit ) )
            // InternalSLEEC.g:3191:2: ( ruleTimeUnit )
            {
            // InternalSLEEC.g:3191:2: ( ruleTimeUnit )
            // InternalSLEEC.g:3192:3: ruleTimeUnit
            {
             before(grammarAccess.getTimeAccess().getUnitTimeUnitEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getTimeAccess().getUnitTimeUnitEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Time__UnitAssignment_1"


    // $ANTLR start "rule__Defeater__ExprAssignment_1"
    // InternalSLEEC.g:3201:1: rule__Defeater__ExprAssignment_1 : ( ruleMBoolExpr ) ;
    public final void rule__Defeater__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3205:1: ( ( ruleMBoolExpr ) )
            // InternalSLEEC.g:3206:2: ( ruleMBoolExpr )
            {
            // InternalSLEEC.g:3206:2: ( ruleMBoolExpr )
            // InternalSLEEC.g:3207:3: ruleMBoolExpr
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
    // InternalSLEEC.g:3216:1: rule__Defeater__ResponseAssignment_2_1 : ( ruleResponse ) ;
    public final void rule__Defeater__ResponseAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSLEEC.g:3220:1: ( ( ruleResponse ) )
            // InternalSLEEC.g:3221:2: ( ruleResponse )
            {
            // InternalSLEEC.g:3221:2: ( ruleResponse )
            // InternalSLEEC.g:3222:3: ruleResponse
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000B0000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000B0000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040800000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000003F80000L});

}