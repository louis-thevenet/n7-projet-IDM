package fr.n7.chaiseMinute.ide.contentassist.antlr.internal;

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
import fr.n7.chaiseMinute.services.FromTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFromTextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Int'", "'{'", "'}'", "','", "'data'", "'('", "')'", "':'", "'imported'", "'->'", "'computed'", "'Function'", "'previous'", "'next'", "'input'", "'operation'", "'Sum'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFromTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFromTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFromTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFromText.g"; }


    	private FromTextGrammarAccess grammarAccess;

    	public void setGrammarAccess(FromTextGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleChaiseMinute"
    // InternalFromText.g:53:1: entryRuleChaiseMinute : ruleChaiseMinute EOF ;
    public final void entryRuleChaiseMinute() throws RecognitionException {
        try {
            // InternalFromText.g:54:1: ( ruleChaiseMinute EOF )
            // InternalFromText.g:55:1: ruleChaiseMinute EOF
            {
             before(grammarAccess.getChaiseMinuteRule()); 
            pushFollow(FOLLOW_1);
            ruleChaiseMinute();

            state._fsp--;

             after(grammarAccess.getChaiseMinuteRule()); 
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
    // $ANTLR end "entryRuleChaiseMinute"


    // $ANTLR start "ruleChaiseMinute"
    // InternalFromText.g:62:1: ruleChaiseMinute : ( ( rule__ChaiseMinute__Group__0 ) ) ;
    public final void ruleChaiseMinute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:66:2: ( ( ( rule__ChaiseMinute__Group__0 ) ) )
            // InternalFromText.g:67:2: ( ( rule__ChaiseMinute__Group__0 ) )
            {
            // InternalFromText.g:67:2: ( ( rule__ChaiseMinute__Group__0 ) )
            // InternalFromText.g:68:3: ( rule__ChaiseMinute__Group__0 )
            {
             before(grammarAccess.getChaiseMinuteAccess().getGroup()); 
            // InternalFromText.g:69:3: ( rule__ChaiseMinute__Group__0 )
            // InternalFromText.g:69:4: rule__ChaiseMinute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChaiseMinute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChaiseMinuteAccess().getGroup()); 

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
    // $ANTLR end "ruleChaiseMinute"


    // $ANTLR start "entryRuleTable"
    // InternalFromText.g:78:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalFromText.g:79:1: ( ruleTable EOF )
            // InternalFromText.g:80:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalFromText.g:87:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:91:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalFromText.g:92:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalFromText.g:92:2: ( ( rule__Table__Group__0 ) )
            // InternalFromText.g:93:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalFromText.g:94:3: ( rule__Table__Group__0 )
            // InternalFromText.g:94:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleIndexColumn"
    // InternalFromText.g:103:1: entryRuleIndexColumn : ruleIndexColumn EOF ;
    public final void entryRuleIndexColumn() throws RecognitionException {
        try {
            // InternalFromText.g:104:1: ( ruleIndexColumn EOF )
            // InternalFromText.g:105:1: ruleIndexColumn EOF
            {
             before(grammarAccess.getIndexColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleIndexColumn();

            state._fsp--;

             after(grammarAccess.getIndexColumnRule()); 
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
    // $ANTLR end "entryRuleIndexColumn"


    // $ANTLR start "ruleIndexColumn"
    // InternalFromText.g:112:1: ruleIndexColumn : ( () ) ;
    public final void ruleIndexColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:116:2: ( ( () ) )
            // InternalFromText.g:117:2: ( () )
            {
            // InternalFromText.g:117:2: ( () )
            // InternalFromText.g:118:3: ()
            {
             before(grammarAccess.getIndexColumnAccess().getIndexColumnAction()); 
            // InternalFromText.g:119:3: ()
            // InternalFromText.g:119:4: 
            {
            }

             after(grammarAccess.getIndexColumnAccess().getIndexColumnAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndexColumn"


    // $ANTLR start "entryRuleColumn"
    // InternalFromText.g:128:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalFromText.g:129:1: ( ruleColumn EOF )
            // InternalFromText.g:130:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalFromText.g:137:1: ruleColumn : ( ( rule__Column__Alternatives ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:141:2: ( ( ( rule__Column__Alternatives ) ) )
            // InternalFromText.g:142:2: ( ( rule__Column__Alternatives ) )
            {
            // InternalFromText.g:142:2: ( ( rule__Column__Alternatives ) )
            // InternalFromText.g:143:3: ( rule__Column__Alternatives )
            {
             before(grammarAccess.getColumnAccess().getAlternatives()); 
            // InternalFromText.g:144:3: ( rule__Column__Alternatives )
            // InternalFromText.g:144:4: rule__Column__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Column__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getAlternatives()); 

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleColumnData"
    // InternalFromText.g:153:1: entryRuleColumnData : ruleColumnData EOF ;
    public final void entryRuleColumnData() throws RecognitionException {
        try {
            // InternalFromText.g:154:1: ( ruleColumnData EOF )
            // InternalFromText.g:155:1: ruleColumnData EOF
            {
             before(grammarAccess.getColumnDataRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnData();

            state._fsp--;

             after(grammarAccess.getColumnDataRule()); 
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
    // $ANTLR end "entryRuleColumnData"


    // $ANTLR start "ruleColumnData"
    // InternalFromText.g:162:1: ruleColumnData : ( ( rule__ColumnData__Group__0 ) ) ;
    public final void ruleColumnData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:166:2: ( ( ( rule__ColumnData__Group__0 ) ) )
            // InternalFromText.g:167:2: ( ( rule__ColumnData__Group__0 ) )
            {
            // InternalFromText.g:167:2: ( ( rule__ColumnData__Group__0 ) )
            // InternalFromText.g:168:3: ( rule__ColumnData__Group__0 )
            {
             before(grammarAccess.getColumnDataAccess().getGroup()); 
            // InternalFromText.g:169:3: ( rule__ColumnData__Group__0 )
            // InternalFromText.g:169:4: rule__ColumnData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDataAccess().getGroup()); 

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
    // $ANTLR end "ruleColumnData"


    // $ANTLR start "entryRuleImportedColumn"
    // InternalFromText.g:178:1: entryRuleImportedColumn : ruleImportedColumn EOF ;
    public final void entryRuleImportedColumn() throws RecognitionException {
        try {
            // InternalFromText.g:179:1: ( ruleImportedColumn EOF )
            // InternalFromText.g:180:1: ruleImportedColumn EOF
            {
             before(grammarAccess.getImportedColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleImportedColumn();

            state._fsp--;

             after(grammarAccess.getImportedColumnRule()); 
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
    // $ANTLR end "entryRuleImportedColumn"


    // $ANTLR start "ruleImportedColumn"
    // InternalFromText.g:187:1: ruleImportedColumn : ( ( rule__ImportedColumn__Group__0 ) ) ;
    public final void ruleImportedColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:191:2: ( ( ( rule__ImportedColumn__Group__0 ) ) )
            // InternalFromText.g:192:2: ( ( rule__ImportedColumn__Group__0 ) )
            {
            // InternalFromText.g:192:2: ( ( rule__ImportedColumn__Group__0 ) )
            // InternalFromText.g:193:3: ( rule__ImportedColumn__Group__0 )
            {
             before(grammarAccess.getImportedColumnAccess().getGroup()); 
            // InternalFromText.g:194:3: ( rule__ImportedColumn__Group__0 )
            // InternalFromText.g:194:4: rule__ImportedColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportedColumnAccess().getGroup()); 

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
    // $ANTLR end "ruleImportedColumn"


    // $ANTLR start "entryRuleComputedColumn"
    // InternalFromText.g:203:1: entryRuleComputedColumn : ruleComputedColumn EOF ;
    public final void entryRuleComputedColumn() throws RecognitionException {
        try {
            // InternalFromText.g:204:1: ( ruleComputedColumn EOF )
            // InternalFromText.g:205:1: ruleComputedColumn EOF
            {
             before(grammarAccess.getComputedColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleComputedColumn();

            state._fsp--;

             after(grammarAccess.getComputedColumnRule()); 
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
    // $ANTLR end "entryRuleComputedColumn"


    // $ANTLR start "ruleComputedColumn"
    // InternalFromText.g:212:1: ruleComputedColumn : ( ( rule__ComputedColumn__Group__0 ) ) ;
    public final void ruleComputedColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:216:2: ( ( ( rule__ComputedColumn__Group__0 ) ) )
            // InternalFromText.g:217:2: ( ( rule__ComputedColumn__Group__0 ) )
            {
            // InternalFromText.g:217:2: ( ( rule__ComputedColumn__Group__0 ) )
            // InternalFromText.g:218:3: ( rule__ComputedColumn__Group__0 )
            {
             before(grammarAccess.getComputedColumnAccess().getGroup()); 
            // InternalFromText.g:219:3: ( rule__ComputedColumn__Group__0 )
            // InternalFromText.g:219:4: rule__ComputedColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComputedColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComputedColumnAccess().getGroup()); 

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
    // $ANTLR end "ruleComputedColumn"


    // $ANTLR start "entryRuleColumnArgument"
    // InternalFromText.g:228:1: entryRuleColumnArgument : ruleColumnArgument EOF ;
    public final void entryRuleColumnArgument() throws RecognitionException {
        try {
            // InternalFromText.g:229:1: ( ruleColumnArgument EOF )
            // InternalFromText.g:230:1: ruleColumnArgument EOF
            {
             before(grammarAccess.getColumnArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnArgument();

            state._fsp--;

             after(grammarAccess.getColumnArgumentRule()); 
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
    // $ANTLR end "entryRuleColumnArgument"


    // $ANTLR start "ruleColumnArgument"
    // InternalFromText.g:237:1: ruleColumnArgument : ( ( rule__ColumnArgument__Group__0 ) ) ;
    public final void ruleColumnArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:241:2: ( ( ( rule__ColumnArgument__Group__0 ) ) )
            // InternalFromText.g:242:2: ( ( rule__ColumnArgument__Group__0 ) )
            {
            // InternalFromText.g:242:2: ( ( rule__ColumnArgument__Group__0 ) )
            // InternalFromText.g:243:3: ( rule__ColumnArgument__Group__0 )
            {
             before(grammarAccess.getColumnArgumentAccess().getGroup()); 
            // InternalFromText.g:244:3: ( rule__ColumnArgument__Group__0 )
            // InternalFromText.g:244:4: rule__ColumnArgument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnArgument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnArgumentAccess().getGroup()); 

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
    // $ANTLR end "ruleColumnArgument"


    // $ANTLR start "entryRuleArgument"
    // InternalFromText.g:253:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalFromText.g:254:1: ( ruleArgument EOF )
            // InternalFromText.g:255:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalFromText.g:262:1: ruleArgument : ( ruleColumnArgument ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:266:2: ( ( ruleColumnArgument ) )
            // InternalFromText.g:267:2: ( ruleColumnArgument )
            {
            // InternalFromText.g:267:2: ( ruleColumnArgument )
            // InternalFromText.g:268:3: ruleColumnArgument
            {
             before(grammarAccess.getArgumentAccess().getColumnArgumentParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleColumnArgument();

            state._fsp--;

             after(grammarAccess.getArgumentAccess().getColumnArgumentParserRuleCall()); 

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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleOperation"
    // InternalFromText.g:278:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalFromText.g:279:1: ( ruleOperation EOF )
            // InternalFromText.g:280:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalFromText.g:287:1: ruleOperation : ( ruleSum ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:291:2: ( ( ruleSum ) )
            // InternalFromText.g:292:2: ( ruleSum )
            {
            // InternalFromText.g:292:2: ( ruleSum )
            // InternalFromText.g:293:3: ruleSum
            {
             before(grammarAccess.getOperationAccess().getSumParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getSumParserRuleCall()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEString"
    // InternalFromText.g:303:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalFromText.g:304:1: ( ruleEString EOF )
            // InternalFromText.g:305:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFromText.g:312:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:316:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalFromText.g:317:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalFromText.g:317:2: ( ( rule__EString__Alternatives ) )
            // InternalFromText.g:318:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalFromText.g:319:3: ( rule__EString__Alternatives )
            // InternalFromText.g:319:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFunction"
    // InternalFromText.g:328:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalFromText.g:329:1: ( ruleFunction EOF )
            // InternalFromText.g:330:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalFromText.g:337:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:341:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalFromText.g:342:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalFromText.g:342:2: ( ( rule__Function__Group__0 ) )
            // InternalFromText.g:343:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalFromText.g:344:3: ( rule__Function__Group__0 )
            // InternalFromText.g:344:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleSum"
    // InternalFromText.g:353:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // InternalFromText.g:354:1: ( ruleSum EOF )
            // InternalFromText.g:355:1: ruleSum EOF
            {
             before(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getSumRule()); 
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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalFromText.g:362:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:366:2: ( ( ( rule__Sum__Group__0 ) ) )
            // InternalFromText.g:367:2: ( ( rule__Sum__Group__0 ) )
            {
            // InternalFromText.g:367:2: ( ( rule__Sum__Group__0 ) )
            // InternalFromText.g:368:3: ( rule__Sum__Group__0 )
            {
             before(grammarAccess.getSumAccess().getGroup()); 
            // InternalFromText.g:369:3: ( rule__Sum__Group__0 )
            // InternalFromText.g:369:4: rule__Sum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getGroup()); 

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
    // $ANTLR end "ruleSum"


    // $ANTLR start "ruleDataType"
    // InternalFromText.g:378:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:382:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalFromText.g:383:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalFromText.g:383:2: ( ( rule__DataType__Alternatives ) )
            // InternalFromText.g:384:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalFromText.g:385:3: ( rule__DataType__Alternatives )
            // InternalFromText.g:385:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__Column__Alternatives"
    // InternalFromText.g:393:1: rule__Column__Alternatives : ( ( ruleColumnData ) | ( ruleComputedColumn ) | ( ruleImportedColumn ) );
    public final void rule__Column__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:397:1: ( ( ruleColumnData ) | ( ruleComputedColumn ) | ( ruleImportedColumn ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 20:
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
                    // InternalFromText.g:398:2: ( ruleColumnData )
                    {
                    // InternalFromText.g:398:2: ( ruleColumnData )
                    // InternalFromText.g:399:3: ruleColumnData
                    {
                     before(grammarAccess.getColumnAccess().getColumnDataParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnData();

                    state._fsp--;

                     after(grammarAccess.getColumnAccess().getColumnDataParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFromText.g:404:2: ( ruleComputedColumn )
                    {
                    // InternalFromText.g:404:2: ( ruleComputedColumn )
                    // InternalFromText.g:405:3: ruleComputedColumn
                    {
                     before(grammarAccess.getColumnAccess().getComputedColumnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComputedColumn();

                    state._fsp--;

                     after(grammarAccess.getColumnAccess().getComputedColumnParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFromText.g:410:2: ( ruleImportedColumn )
                    {
                    // InternalFromText.g:410:2: ( ruleImportedColumn )
                    // InternalFromText.g:411:3: ruleImportedColumn
                    {
                     before(grammarAccess.getColumnAccess().getImportedColumnParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImportedColumn();

                    state._fsp--;

                     after(grammarAccess.getColumnAccess().getImportedColumnParserRuleCall_2()); 

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
    // $ANTLR end "rule__Column__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalFromText.g:420:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:424:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFromText.g:425:2: ( RULE_STRING )
                    {
                    // InternalFromText.g:425:2: ( RULE_STRING )
                    // InternalFromText.g:426:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFromText.g:431:2: ( RULE_ID )
                    {
                    // InternalFromText.g:431:2: ( RULE_ID )
                    // InternalFromText.g:432:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalFromText.g:441:1: rule__DataType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Int' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:445:1: ( ( ( 'String' ) ) | ( ( 'Int' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFromText.g:446:2: ( ( 'String' ) )
                    {
                    // InternalFromText.g:446:2: ( ( 'String' ) )
                    // InternalFromText.g:447:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalFromText.g:448:3: ( 'String' )
                    // InternalFromText.g:448:4: 'String'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFromText.g:452:2: ( ( 'Int' ) )
                    {
                    // InternalFromText.g:452:2: ( ( 'Int' ) )
                    // InternalFromText.g:453:3: ( 'Int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalFromText.g:454:3: ( 'Int' )
                    // InternalFromText.g:454:4: 'Int'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__ChaiseMinute__Group__0"
    // InternalFromText.g:462:1: rule__ChaiseMinute__Group__0 : rule__ChaiseMinute__Group__0__Impl rule__ChaiseMinute__Group__1 ;
    public final void rule__ChaiseMinute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:466:1: ( rule__ChaiseMinute__Group__0__Impl rule__ChaiseMinute__Group__1 )
            // InternalFromText.g:467:2: rule__ChaiseMinute__Group__0__Impl rule__ChaiseMinute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ChaiseMinute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChaiseMinute__Group__1();

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
    // $ANTLR end "rule__ChaiseMinute__Group__0"


    // $ANTLR start "rule__ChaiseMinute__Group__0__Impl"
    // InternalFromText.g:474:1: rule__ChaiseMinute__Group__0__Impl : ( '{' ) ;
    public final void rule__ChaiseMinute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:478:1: ( ( '{' ) )
            // InternalFromText.g:479:1: ( '{' )
            {
            // InternalFromText.g:479:1: ( '{' )
            // InternalFromText.g:480:2: '{'
            {
             before(grammarAccess.getChaiseMinuteAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getChaiseMinuteAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__ChaiseMinute__Group__0__Impl"


    // $ANTLR start "rule__ChaiseMinute__Group__1"
    // InternalFromText.g:489:1: rule__ChaiseMinute__Group__1 : rule__ChaiseMinute__Group__1__Impl rule__ChaiseMinute__Group__2 ;
    public final void rule__ChaiseMinute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:493:1: ( rule__ChaiseMinute__Group__1__Impl rule__ChaiseMinute__Group__2 )
            // InternalFromText.g:494:2: rule__ChaiseMinute__Group__1__Impl rule__ChaiseMinute__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ChaiseMinute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChaiseMinute__Group__2();

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
    // $ANTLR end "rule__ChaiseMinute__Group__1"


    // $ANTLR start "rule__ChaiseMinute__Group__1__Impl"
    // InternalFromText.g:501:1: rule__ChaiseMinute__Group__1__Impl : ( ( rule__ChaiseMinute__Group_1__0 )? ) ;
    public final void rule__ChaiseMinute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:505:1: ( ( ( rule__ChaiseMinute__Group_1__0 )? ) )
            // InternalFromText.g:506:1: ( ( rule__ChaiseMinute__Group_1__0 )? )
            {
            // InternalFromText.g:506:1: ( ( rule__ChaiseMinute__Group_1__0 )? )
            // InternalFromText.g:507:2: ( rule__ChaiseMinute__Group_1__0 )?
            {
             before(grammarAccess.getChaiseMinuteAccess().getGroup_1()); 
            // InternalFromText.g:508:2: ( rule__ChaiseMinute__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFromText.g:508:3: rule__ChaiseMinute__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChaiseMinute__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChaiseMinuteAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ChaiseMinute__Group__1__Impl"


    // $ANTLR start "rule__ChaiseMinute__Group__2"
    // InternalFromText.g:516:1: rule__ChaiseMinute__Group__2 : rule__ChaiseMinute__Group__2__Impl ;
    public final void rule__ChaiseMinute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:520:1: ( rule__ChaiseMinute__Group__2__Impl )
            // InternalFromText.g:521:2: rule__ChaiseMinute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChaiseMinute__Group__2__Impl();

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
    // $ANTLR end "rule__ChaiseMinute__Group__2"


    // $ANTLR start "rule__ChaiseMinute__Group__2__Impl"
    // InternalFromText.g:527:1: rule__ChaiseMinute__Group__2__Impl : ( '}' ) ;
    public final void rule__ChaiseMinute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:531:1: ( ( '}' ) )
            // InternalFromText.g:532:1: ( '}' )
            {
            // InternalFromText.g:532:1: ( '}' )
            // InternalFromText.g:533:2: '}'
            {
             before(grammarAccess.getChaiseMinuteAccess().getRightCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getChaiseMinuteAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ChaiseMinute__Group__2__Impl"


    // $ANTLR start "rule__ChaiseMinute__Group_1__0"
    // InternalFromText.g:543:1: rule__ChaiseMinute__Group_1__0 : rule__ChaiseMinute__Group_1__0__Impl rule__ChaiseMinute__Group_1__1 ;
    public final void rule__ChaiseMinute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:547:1: ( rule__ChaiseMinute__Group_1__0__Impl rule__ChaiseMinute__Group_1__1 )
            // InternalFromText.g:548:2: rule__ChaiseMinute__Group_1__0__Impl rule__ChaiseMinute__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__ChaiseMinute__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChaiseMinute__Group_1__1();

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
    // $ANTLR end "rule__ChaiseMinute__Group_1__0"


    // $ANTLR start "rule__ChaiseMinute__Group_1__0__Impl"
    // InternalFromText.g:555:1: rule__ChaiseMinute__Group_1__0__Impl : ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) ) ;
    public final void rule__ChaiseMinute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:559:1: ( ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) ) )
            // InternalFromText.g:560:1: ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) )
            {
            // InternalFromText.g:560:1: ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) )
            // InternalFromText.g:561:2: ( rule__ChaiseMinute__TablesAssignment_1_0 )
            {
             before(grammarAccess.getChaiseMinuteAccess().getTablesAssignment_1_0()); 
            // InternalFromText.g:562:2: ( rule__ChaiseMinute__TablesAssignment_1_0 )
            // InternalFromText.g:562:3: rule__ChaiseMinute__TablesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ChaiseMinute__TablesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getChaiseMinuteAccess().getTablesAssignment_1_0()); 

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
    // $ANTLR end "rule__ChaiseMinute__Group_1__0__Impl"


    // $ANTLR start "rule__ChaiseMinute__Group_1__1"
    // InternalFromText.g:570:1: rule__ChaiseMinute__Group_1__1 : rule__ChaiseMinute__Group_1__1__Impl ;
    public final void rule__ChaiseMinute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:574:1: ( rule__ChaiseMinute__Group_1__1__Impl )
            // InternalFromText.g:575:2: rule__ChaiseMinute__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChaiseMinute__Group_1__1__Impl();

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
    // $ANTLR end "rule__ChaiseMinute__Group_1__1"


    // $ANTLR start "rule__ChaiseMinute__Group_1__1__Impl"
    // InternalFromText.g:581:1: rule__ChaiseMinute__Group_1__1__Impl : ( ( rule__ChaiseMinute__TablesAssignment_1_1 )* ) ;
    public final void rule__ChaiseMinute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:585:1: ( ( ( rule__ChaiseMinute__TablesAssignment_1_1 )* ) )
            // InternalFromText.g:586:1: ( ( rule__ChaiseMinute__TablesAssignment_1_1 )* )
            {
            // InternalFromText.g:586:1: ( ( rule__ChaiseMinute__TablesAssignment_1_1 )* )
            // InternalFromText.g:587:2: ( rule__ChaiseMinute__TablesAssignment_1_1 )*
            {
             before(grammarAccess.getChaiseMinuteAccess().getTablesAssignment_1_1()); 
            // InternalFromText.g:588:2: ( rule__ChaiseMinute__TablesAssignment_1_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFromText.g:588:3: rule__ChaiseMinute__TablesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ChaiseMinute__TablesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getChaiseMinuteAccess().getTablesAssignment_1_1()); 

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
    // $ANTLR end "rule__ChaiseMinute__Group_1__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalFromText.g:597:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:601:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalFromText.g:602:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

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
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalFromText.g:609:1: rule__Table__Group__0__Impl : ( '{' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:613:1: ( ( '{' ) )
            // InternalFromText.g:614:1: ( '{' )
            {
            // InternalFromText.g:614:1: ( '{' )
            // InternalFromText.g:615:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalFromText.g:624:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:628:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalFromText.g:629:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

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
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalFromText.g:636:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:640:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalFromText.g:641:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalFromText.g:641:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalFromText.g:642:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalFromText.g:643:2: ( rule__Table__NameAssignment_1 )
            // InternalFromText.g:643:3: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalFromText.g:651:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:655:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalFromText.g:656:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_1);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

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
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalFromText.g:663:1: rule__Table__Group__2__Impl : ( ',' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:667:1: ( ( ',' ) )
            // InternalFromText.g:668:1: ( ',' )
            {
            // InternalFromText.g:668:1: ( ',' )
            // InternalFromText.g:669:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalFromText.g:678:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:682:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalFromText.g:683:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

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
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalFromText.g:690:1: rule__Table__Group__3__Impl : ( ( rule__Table__IndexColumnAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:694:1: ( ( ( rule__Table__IndexColumnAssignment_3 ) ) )
            // InternalFromText.g:695:1: ( ( rule__Table__IndexColumnAssignment_3 ) )
            {
            // InternalFromText.g:695:1: ( ( rule__Table__IndexColumnAssignment_3 ) )
            // InternalFromText.g:696:2: ( rule__Table__IndexColumnAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getIndexColumnAssignment_3()); 
            // InternalFromText.g:697:2: ( rule__Table__IndexColumnAssignment_3 )
            // InternalFromText.g:697:3: rule__Table__IndexColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Table__IndexColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getIndexColumnAssignment_3()); 

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
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalFromText.g:705:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:709:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalFromText.g:710:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

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
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalFromText.g:717:1: rule__Table__Group__4__Impl : ( ',' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:721:1: ( ( ',' ) )
            // InternalFromText.g:722:1: ( ',' )
            {
            // InternalFromText.g:722:1: ( ',' )
            // InternalFromText.g:723:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalFromText.g:732:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:736:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalFromText.g:737:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__6();

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
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalFromText.g:744:1: rule__Table__Group__5__Impl : ( ( rule__Table__Group_5__0 )? ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:748:1: ( ( ( rule__Table__Group_5__0 )? ) )
            // InternalFromText.g:749:1: ( ( rule__Table__Group_5__0 )? )
            {
            // InternalFromText.g:749:1: ( ( rule__Table__Group_5__0 )? )
            // InternalFromText.g:750:2: ( rule__Table__Group_5__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_5()); 
            // InternalFromText.g:751:2: ( rule__Table__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16||LA6_0==20||LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFromText.g:751:3: rule__Table__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__6"
    // InternalFromText.g:759:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:763:1: ( rule__Table__Group__6__Impl )
            // InternalFromText.g:764:2: rule__Table__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__6__Impl();

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
    // $ANTLR end "rule__Table__Group__6"


    // $ANTLR start "rule__Table__Group__6__Impl"
    // InternalFromText.g:770:1: rule__Table__Group__6__Impl : ( '}' ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:774:1: ( ( '}' ) )
            // InternalFromText.g:775:1: ( '}' )
            {
            // InternalFromText.g:775:1: ( '}' )
            // InternalFromText.g:776:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Table__Group__6__Impl"


    // $ANTLR start "rule__Table__Group_5__0"
    // InternalFromText.g:786:1: rule__Table__Group_5__0 : rule__Table__Group_5__0__Impl rule__Table__Group_5__1 ;
    public final void rule__Table__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:790:1: ( rule__Table__Group_5__0__Impl rule__Table__Group_5__1 )
            // InternalFromText.g:791:2: rule__Table__Group_5__0__Impl rule__Table__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_5__1();

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
    // $ANTLR end "rule__Table__Group_5__0"


    // $ANTLR start "rule__Table__Group_5__0__Impl"
    // InternalFromText.g:798:1: rule__Table__Group_5__0__Impl : ( ( rule__Table__ColumnsAssignment_5_0 ) ) ;
    public final void rule__Table__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:802:1: ( ( ( rule__Table__ColumnsAssignment_5_0 ) ) )
            // InternalFromText.g:803:1: ( ( rule__Table__ColumnsAssignment_5_0 ) )
            {
            // InternalFromText.g:803:1: ( ( rule__Table__ColumnsAssignment_5_0 ) )
            // InternalFromText.g:804:2: ( rule__Table__ColumnsAssignment_5_0 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_0()); 
            // InternalFromText.g:805:2: ( rule__Table__ColumnsAssignment_5_0 )
            // InternalFromText.g:805:3: rule__Table__ColumnsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_5_0()); 

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
    // $ANTLR end "rule__Table__Group_5__0__Impl"


    // $ANTLR start "rule__Table__Group_5__1"
    // InternalFromText.g:813:1: rule__Table__Group_5__1 : rule__Table__Group_5__1__Impl ;
    public final void rule__Table__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:817:1: ( rule__Table__Group_5__1__Impl )
            // InternalFromText.g:818:2: rule__Table__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_5__1__Impl();

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
    // $ANTLR end "rule__Table__Group_5__1"


    // $ANTLR start "rule__Table__Group_5__1__Impl"
    // InternalFromText.g:824:1: rule__Table__Group_5__1__Impl : ( ( rule__Table__Group_5_1__0 )* ) ;
    public final void rule__Table__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:828:1: ( ( ( rule__Table__Group_5_1__0 )* ) )
            // InternalFromText.g:829:1: ( ( rule__Table__Group_5_1__0 )* )
            {
            // InternalFromText.g:829:1: ( ( rule__Table__Group_5_1__0 )* )
            // InternalFromText.g:830:2: ( rule__Table__Group_5_1__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_5_1()); 
            // InternalFromText.g:831:2: ( rule__Table__Group_5_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFromText.g:831:3: rule__Table__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Table__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__Table__Group_5__1__Impl"


    // $ANTLR start "rule__Table__Group_5_1__0"
    // InternalFromText.g:840:1: rule__Table__Group_5_1__0 : rule__Table__Group_5_1__0__Impl rule__Table__Group_5_1__1 ;
    public final void rule__Table__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:844:1: ( rule__Table__Group_5_1__0__Impl rule__Table__Group_5_1__1 )
            // InternalFromText.g:845:2: rule__Table__Group_5_1__0__Impl rule__Table__Group_5_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_5_1__1();

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
    // $ANTLR end "rule__Table__Group_5_1__0"


    // $ANTLR start "rule__Table__Group_5_1__0__Impl"
    // InternalFromText.g:852:1: rule__Table__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:856:1: ( ( ',' ) )
            // InternalFromText.g:857:1: ( ',' )
            {
            // InternalFromText.g:857:1: ( ',' )
            // InternalFromText.g:858:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_5_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_5_1_0()); 

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
    // $ANTLR end "rule__Table__Group_5_1__0__Impl"


    // $ANTLR start "rule__Table__Group_5_1__1"
    // InternalFromText.g:867:1: rule__Table__Group_5_1__1 : rule__Table__Group_5_1__1__Impl ;
    public final void rule__Table__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:871:1: ( rule__Table__Group_5_1__1__Impl )
            // InternalFromText.g:872:2: rule__Table__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__Table__Group_5_1__1"


    // $ANTLR start "rule__Table__Group_5_1__1__Impl"
    // InternalFromText.g:878:1: rule__Table__Group_5_1__1__Impl : ( ( rule__Table__ColumnsAssignment_5_1_1 ) ) ;
    public final void rule__Table__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:882:1: ( ( ( rule__Table__ColumnsAssignment_5_1_1 ) ) )
            // InternalFromText.g:883:1: ( ( rule__Table__ColumnsAssignment_5_1_1 ) )
            {
            // InternalFromText.g:883:1: ( ( rule__Table__ColumnsAssignment_5_1_1 ) )
            // InternalFromText.g:884:2: ( rule__Table__ColumnsAssignment_5_1_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_1_1()); 
            // InternalFromText.g:885:2: ( rule__Table__ColumnsAssignment_5_1_1 )
            // InternalFromText.g:885:3: rule__Table__ColumnsAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_5_1_1()); 

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
    // $ANTLR end "rule__Table__Group_5_1__1__Impl"


    // $ANTLR start "rule__ColumnData__Group__0"
    // InternalFromText.g:894:1: rule__ColumnData__Group__0 : rule__ColumnData__Group__0__Impl rule__ColumnData__Group__1 ;
    public final void rule__ColumnData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:898:1: ( rule__ColumnData__Group__0__Impl rule__ColumnData__Group__1 )
            // InternalFromText.g:899:2: rule__ColumnData__Group__0__Impl rule__ColumnData__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ColumnData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnData__Group__1();

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
    // $ANTLR end "rule__ColumnData__Group__0"


    // $ANTLR start "rule__ColumnData__Group__0__Impl"
    // InternalFromText.g:906:1: rule__ColumnData__Group__0__Impl : ( 'data' ) ;
    public final void rule__ColumnData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:910:1: ( ( 'data' ) )
            // InternalFromText.g:911:1: ( 'data' )
            {
            // InternalFromText.g:911:1: ( 'data' )
            // InternalFromText.g:912:2: 'data'
            {
             before(grammarAccess.getColumnDataAccess().getDataKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getColumnDataAccess().getDataKeyword_0()); 

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
    // $ANTLR end "rule__ColumnData__Group__0__Impl"


    // $ANTLR start "rule__ColumnData__Group__1"
    // InternalFromText.g:921:1: rule__ColumnData__Group__1 : rule__ColumnData__Group__1__Impl rule__ColumnData__Group__2 ;
    public final void rule__ColumnData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:925:1: ( rule__ColumnData__Group__1__Impl rule__ColumnData__Group__2 )
            // InternalFromText.g:926:2: rule__ColumnData__Group__1__Impl rule__ColumnData__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ColumnData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnData__Group__2();

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
    // $ANTLR end "rule__ColumnData__Group__1"


    // $ANTLR start "rule__ColumnData__Group__1__Impl"
    // InternalFromText.g:933:1: rule__ColumnData__Group__1__Impl : ( '(' ) ;
    public final void rule__ColumnData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:937:1: ( ( '(' ) )
            // InternalFromText.g:938:1: ( '(' )
            {
            // InternalFromText.g:938:1: ( '(' )
            // InternalFromText.g:939:2: '('
            {
             before(grammarAccess.getColumnDataAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getColumnDataAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ColumnData__Group__1__Impl"


    // $ANTLR start "rule__ColumnData__Group__2"
    // InternalFromText.g:948:1: rule__ColumnData__Group__2 : rule__ColumnData__Group__2__Impl rule__ColumnData__Group__3 ;
    public final void rule__ColumnData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:952:1: ( rule__ColumnData__Group__2__Impl rule__ColumnData__Group__3 )
            // InternalFromText.g:953:2: rule__ColumnData__Group__2__Impl rule__ColumnData__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ColumnData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnData__Group__3();

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
    // $ANTLR end "rule__ColumnData__Group__2"


    // $ANTLR start "rule__ColumnData__Group__2__Impl"
    // InternalFromText.g:960:1: rule__ColumnData__Group__2__Impl : ( ( rule__ColumnData__TypeAssignment_2 ) ) ;
    public final void rule__ColumnData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:964:1: ( ( ( rule__ColumnData__TypeAssignment_2 ) ) )
            // InternalFromText.g:965:1: ( ( rule__ColumnData__TypeAssignment_2 ) )
            {
            // InternalFromText.g:965:1: ( ( rule__ColumnData__TypeAssignment_2 ) )
            // InternalFromText.g:966:2: ( rule__ColumnData__TypeAssignment_2 )
            {
             before(grammarAccess.getColumnDataAccess().getTypeAssignment_2()); 
            // InternalFromText.g:967:2: ( rule__ColumnData__TypeAssignment_2 )
            // InternalFromText.g:967:3: rule__ColumnData__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ColumnData__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnDataAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__ColumnData__Group__2__Impl"


    // $ANTLR start "rule__ColumnData__Group__3"
    // InternalFromText.g:975:1: rule__ColumnData__Group__3 : rule__ColumnData__Group__3__Impl rule__ColumnData__Group__4 ;
    public final void rule__ColumnData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:979:1: ( rule__ColumnData__Group__3__Impl rule__ColumnData__Group__4 )
            // InternalFromText.g:980:2: rule__ColumnData__Group__3__Impl rule__ColumnData__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ColumnData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnData__Group__4();

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
    // $ANTLR end "rule__ColumnData__Group__3"


    // $ANTLR start "rule__ColumnData__Group__3__Impl"
    // InternalFromText.g:987:1: rule__ColumnData__Group__3__Impl : ( ')' ) ;
    public final void rule__ColumnData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:991:1: ( ( ')' ) )
            // InternalFromText.g:992:1: ( ')' )
            {
            // InternalFromText.g:992:1: ( ')' )
            // InternalFromText.g:993:2: ')'
            {
             before(grammarAccess.getColumnDataAccess().getRightParenthesisKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getColumnDataAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ColumnData__Group__3__Impl"


    // $ANTLR start "rule__ColumnData__Group__4"
    // InternalFromText.g:1002:1: rule__ColumnData__Group__4 : rule__ColumnData__Group__4__Impl rule__ColumnData__Group__5 ;
    public final void rule__ColumnData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1006:1: ( rule__ColumnData__Group__4__Impl rule__ColumnData__Group__5 )
            // InternalFromText.g:1007:2: rule__ColumnData__Group__4__Impl rule__ColumnData__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ColumnData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnData__Group__5();

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
    // $ANTLR end "rule__ColumnData__Group__4"


    // $ANTLR start "rule__ColumnData__Group__4__Impl"
    // InternalFromText.g:1014:1: rule__ColumnData__Group__4__Impl : ( ':' ) ;
    public final void rule__ColumnData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1018:1: ( ( ':' ) )
            // InternalFromText.g:1019:1: ( ':' )
            {
            // InternalFromText.g:1019:1: ( ':' )
            // InternalFromText.g:1020:2: ':'
            {
             before(grammarAccess.getColumnDataAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getColumnDataAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__ColumnData__Group__4__Impl"


    // $ANTLR start "rule__ColumnData__Group__5"
    // InternalFromText.g:1029:1: rule__ColumnData__Group__5 : rule__ColumnData__Group__5__Impl ;
    public final void rule__ColumnData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1033:1: ( rule__ColumnData__Group__5__Impl )
            // InternalFromText.g:1034:2: rule__ColumnData__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnData__Group__5__Impl();

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
    // $ANTLR end "rule__ColumnData__Group__5"


    // $ANTLR start "rule__ColumnData__Group__5__Impl"
    // InternalFromText.g:1040:1: rule__ColumnData__Group__5__Impl : ( ( rule__ColumnData__IdAssignment_5 ) ) ;
    public final void rule__ColumnData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1044:1: ( ( ( rule__ColumnData__IdAssignment_5 ) ) )
            // InternalFromText.g:1045:1: ( ( rule__ColumnData__IdAssignment_5 ) )
            {
            // InternalFromText.g:1045:1: ( ( rule__ColumnData__IdAssignment_5 ) )
            // InternalFromText.g:1046:2: ( rule__ColumnData__IdAssignment_5 )
            {
             before(grammarAccess.getColumnDataAccess().getIdAssignment_5()); 
            // InternalFromText.g:1047:2: ( rule__ColumnData__IdAssignment_5 )
            // InternalFromText.g:1047:3: rule__ColumnData__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ColumnData__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getColumnDataAccess().getIdAssignment_5()); 

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
    // $ANTLR end "rule__ColumnData__Group__5__Impl"


    // $ANTLR start "rule__ImportedColumn__Group__0"
    // InternalFromText.g:1056:1: rule__ImportedColumn__Group__0 : rule__ImportedColumn__Group__0__Impl rule__ImportedColumn__Group__1 ;
    public final void rule__ImportedColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1060:1: ( rule__ImportedColumn__Group__0__Impl rule__ImportedColumn__Group__1 )
            // InternalFromText.g:1061:2: rule__ImportedColumn__Group__0__Impl rule__ImportedColumn__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ImportedColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedColumn__Group__1();

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
    // $ANTLR end "rule__ImportedColumn__Group__0"


    // $ANTLR start "rule__ImportedColumn__Group__0__Impl"
    // InternalFromText.g:1068:1: rule__ImportedColumn__Group__0__Impl : ( 'imported' ) ;
    public final void rule__ImportedColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1072:1: ( ( 'imported' ) )
            // InternalFromText.g:1073:1: ( 'imported' )
            {
            // InternalFromText.g:1073:1: ( 'imported' )
            // InternalFromText.g:1074:2: 'imported'
            {
             before(grammarAccess.getImportedColumnAccess().getImportedKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImportedColumnAccess().getImportedKeyword_0()); 

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
    // $ANTLR end "rule__ImportedColumn__Group__0__Impl"


    // $ANTLR start "rule__ImportedColumn__Group__1"
    // InternalFromText.g:1083:1: rule__ImportedColumn__Group__1 : rule__ImportedColumn__Group__1__Impl rule__ImportedColumn__Group__2 ;
    public final void rule__ImportedColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1087:1: ( rule__ImportedColumn__Group__1__Impl rule__ImportedColumn__Group__2 )
            // InternalFromText.g:1088:2: rule__ImportedColumn__Group__1__Impl rule__ImportedColumn__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ImportedColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedColumn__Group__2();

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
    // $ANTLR end "rule__ImportedColumn__Group__1"


    // $ANTLR start "rule__ImportedColumn__Group__1__Impl"
    // InternalFromText.g:1095:1: rule__ImportedColumn__Group__1__Impl : ( '(' ) ;
    public final void rule__ImportedColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1099:1: ( ( '(' ) )
            // InternalFromText.g:1100:1: ( '(' )
            {
            // InternalFromText.g:1100:1: ( '(' )
            // InternalFromText.g:1101:2: '('
            {
             before(grammarAccess.getImportedColumnAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportedColumnAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ImportedColumn__Group__1__Impl"


    // $ANTLR start "rule__ImportedColumn__Group__2"
    // InternalFromText.g:1110:1: rule__ImportedColumn__Group__2 : rule__ImportedColumn__Group__2__Impl rule__ImportedColumn__Group__3 ;
    public final void rule__ImportedColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1114:1: ( rule__ImportedColumn__Group__2__Impl rule__ImportedColumn__Group__3 )
            // InternalFromText.g:1115:2: rule__ImportedColumn__Group__2__Impl rule__ImportedColumn__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ImportedColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedColumn__Group__3();

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
    // $ANTLR end "rule__ImportedColumn__Group__2"


    // $ANTLR start "rule__ImportedColumn__Group__2__Impl"
    // InternalFromText.g:1122:1: rule__ImportedColumn__Group__2__Impl : ( ( rule__ImportedColumn__TypeAssignment_2 ) ) ;
    public final void rule__ImportedColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1126:1: ( ( ( rule__ImportedColumn__TypeAssignment_2 ) ) )
            // InternalFromText.g:1127:1: ( ( rule__ImportedColumn__TypeAssignment_2 ) )
            {
            // InternalFromText.g:1127:1: ( ( rule__ImportedColumn__TypeAssignment_2 ) )
            // InternalFromText.g:1128:2: ( rule__ImportedColumn__TypeAssignment_2 )
            {
             before(grammarAccess.getImportedColumnAccess().getTypeAssignment_2()); 
            // InternalFromText.g:1129:2: ( rule__ImportedColumn__TypeAssignment_2 )
            // InternalFromText.g:1129:3: rule__ImportedColumn__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImportedColumn__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImportedColumnAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__ImportedColumn__Group__2__Impl"


    // $ANTLR start "rule__ImportedColumn__Group__3"
    // InternalFromText.g:1137:1: rule__ImportedColumn__Group__3 : rule__ImportedColumn__Group__3__Impl rule__ImportedColumn__Group__4 ;
    public final void rule__ImportedColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1141:1: ( rule__ImportedColumn__Group__3__Impl rule__ImportedColumn__Group__4 )
            // InternalFromText.g:1142:2: rule__ImportedColumn__Group__3__Impl rule__ImportedColumn__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ImportedColumn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedColumn__Group__4();

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
    // $ANTLR end "rule__ImportedColumn__Group__3"


    // $ANTLR start "rule__ImportedColumn__Group__3__Impl"
    // InternalFromText.g:1149:1: rule__ImportedColumn__Group__3__Impl : ( ')' ) ;
    public final void rule__ImportedColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1153:1: ( ( ')' ) )
            // InternalFromText.g:1154:1: ( ')' )
            {
            // InternalFromText.g:1154:1: ( ')' )
            // InternalFromText.g:1155:2: ')'
            {
             before(grammarAccess.getImportedColumnAccess().getRightParenthesisKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getImportedColumnAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ImportedColumn__Group__3__Impl"


    // $ANTLR start "rule__ImportedColumn__Group__4"
    // InternalFromText.g:1164:1: rule__ImportedColumn__Group__4 : rule__ImportedColumn__Group__4__Impl rule__ImportedColumn__Group__5 ;
    public final void rule__ImportedColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1168:1: ( rule__ImportedColumn__Group__4__Impl rule__ImportedColumn__Group__5 )
            // InternalFromText.g:1169:2: rule__ImportedColumn__Group__4__Impl rule__ImportedColumn__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ImportedColumn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedColumn__Group__5();

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
    // $ANTLR end "rule__ImportedColumn__Group__4"


    // $ANTLR start "rule__ImportedColumn__Group__4__Impl"
    // InternalFromText.g:1176:1: rule__ImportedColumn__Group__4__Impl : ( ':' ) ;
    public final void rule__ImportedColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1180:1: ( ( ':' ) )
            // InternalFromText.g:1181:1: ( ':' )
            {
            // InternalFromText.g:1181:1: ( ':' )
            // InternalFromText.g:1182:2: ':'
            {
             before(grammarAccess.getImportedColumnAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImportedColumnAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__ImportedColumn__Group__4__Impl"


    // $ANTLR start "rule__ImportedColumn__Group__5"
    // InternalFromText.g:1191:1: rule__ImportedColumn__Group__5 : rule__ImportedColumn__Group__5__Impl rule__ImportedColumn__Group__6 ;
    public final void rule__ImportedColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1195:1: ( rule__ImportedColumn__Group__5__Impl rule__ImportedColumn__Group__6 )
            // InternalFromText.g:1196:2: rule__ImportedColumn__Group__5__Impl rule__ImportedColumn__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ImportedColumn__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedColumn__Group__6();

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
    // $ANTLR end "rule__ImportedColumn__Group__5"


    // $ANTLR start "rule__ImportedColumn__Group__5__Impl"
    // InternalFromText.g:1203:1: rule__ImportedColumn__Group__5__Impl : ( ( rule__ImportedColumn__PathAssignment_5 ) ) ;
    public final void rule__ImportedColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1207:1: ( ( ( rule__ImportedColumn__PathAssignment_5 ) ) )
            // InternalFromText.g:1208:1: ( ( rule__ImportedColumn__PathAssignment_5 ) )
            {
            // InternalFromText.g:1208:1: ( ( rule__ImportedColumn__PathAssignment_5 ) )
            // InternalFromText.g:1209:2: ( rule__ImportedColumn__PathAssignment_5 )
            {
             before(grammarAccess.getImportedColumnAccess().getPathAssignment_5()); 
            // InternalFromText.g:1210:2: ( rule__ImportedColumn__PathAssignment_5 )
            // InternalFromText.g:1210:3: rule__ImportedColumn__PathAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ImportedColumn__PathAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getImportedColumnAccess().getPathAssignment_5()); 

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
    // $ANTLR end "rule__ImportedColumn__Group__5__Impl"


    // $ANTLR start "rule__ImportedColumn__Group__6"
    // InternalFromText.g:1218:1: rule__ImportedColumn__Group__6 : rule__ImportedColumn__Group__6__Impl rule__ImportedColumn__Group__7 ;
    public final void rule__ImportedColumn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1222:1: ( rule__ImportedColumn__Group__6__Impl rule__ImportedColumn__Group__7 )
            // InternalFromText.g:1223:2: rule__ImportedColumn__Group__6__Impl rule__ImportedColumn__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ImportedColumn__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedColumn__Group__7();

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
    // $ANTLR end "rule__ImportedColumn__Group__6"


    // $ANTLR start "rule__ImportedColumn__Group__6__Impl"
    // InternalFromText.g:1230:1: rule__ImportedColumn__Group__6__Impl : ( '->' ) ;
    public final void rule__ImportedColumn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1234:1: ( ( '->' ) )
            // InternalFromText.g:1235:1: ( '->' )
            {
            // InternalFromText.g:1235:1: ( '->' )
            // InternalFromText.g:1236:2: '->'
            {
             before(grammarAccess.getImportedColumnAccess().getHyphenMinusGreaterThanSignKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getImportedColumnAccess().getHyphenMinusGreaterThanSignKeyword_6()); 

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
    // $ANTLR end "rule__ImportedColumn__Group__6__Impl"


    // $ANTLR start "rule__ImportedColumn__Group__7"
    // InternalFromText.g:1245:1: rule__ImportedColumn__Group__7 : rule__ImportedColumn__Group__7__Impl ;
    public final void rule__ImportedColumn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1249:1: ( rule__ImportedColumn__Group__7__Impl )
            // InternalFromText.g:1250:2: rule__ImportedColumn__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedColumn__Group__7__Impl();

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
    // $ANTLR end "rule__ImportedColumn__Group__7"


    // $ANTLR start "rule__ImportedColumn__Group__7__Impl"
    // InternalFromText.g:1256:1: rule__ImportedColumn__Group__7__Impl : ( ( rule__ImportedColumn__IdAssignment_7 ) ) ;
    public final void rule__ImportedColumn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1260:1: ( ( ( rule__ImportedColumn__IdAssignment_7 ) ) )
            // InternalFromText.g:1261:1: ( ( rule__ImportedColumn__IdAssignment_7 ) )
            {
            // InternalFromText.g:1261:1: ( ( rule__ImportedColumn__IdAssignment_7 ) )
            // InternalFromText.g:1262:2: ( rule__ImportedColumn__IdAssignment_7 )
            {
             before(grammarAccess.getImportedColumnAccess().getIdAssignment_7()); 
            // InternalFromText.g:1263:2: ( rule__ImportedColumn__IdAssignment_7 )
            // InternalFromText.g:1263:3: rule__ImportedColumn__IdAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ImportedColumn__IdAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getImportedColumnAccess().getIdAssignment_7()); 

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
    // $ANTLR end "rule__ImportedColumn__Group__7__Impl"


    // $ANTLR start "rule__ComputedColumn__Group__0"
    // InternalFromText.g:1272:1: rule__ComputedColumn__Group__0 : rule__ComputedColumn__Group__0__Impl rule__ComputedColumn__Group__1 ;
    public final void rule__ComputedColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1276:1: ( rule__ComputedColumn__Group__0__Impl rule__ComputedColumn__Group__1 )
            // InternalFromText.g:1277:2: rule__ComputedColumn__Group__0__Impl rule__ComputedColumn__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ComputedColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputedColumn__Group__1();

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
    // $ANTLR end "rule__ComputedColumn__Group__0"


    // $ANTLR start "rule__ComputedColumn__Group__0__Impl"
    // InternalFromText.g:1284:1: rule__ComputedColumn__Group__0__Impl : ( 'computed' ) ;
    public final void rule__ComputedColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1288:1: ( ( 'computed' ) )
            // InternalFromText.g:1289:1: ( 'computed' )
            {
            // InternalFromText.g:1289:1: ( 'computed' )
            // InternalFromText.g:1290:2: 'computed'
            {
             before(grammarAccess.getComputedColumnAccess().getComputedKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComputedColumnAccess().getComputedKeyword_0()); 

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
    // $ANTLR end "rule__ComputedColumn__Group__0__Impl"


    // $ANTLR start "rule__ComputedColumn__Group__1"
    // InternalFromText.g:1299:1: rule__ComputedColumn__Group__1 : rule__ComputedColumn__Group__1__Impl rule__ComputedColumn__Group__2 ;
    public final void rule__ComputedColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1303:1: ( rule__ComputedColumn__Group__1__Impl rule__ComputedColumn__Group__2 )
            // InternalFromText.g:1304:2: rule__ComputedColumn__Group__1__Impl rule__ComputedColumn__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ComputedColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputedColumn__Group__2();

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
    // $ANTLR end "rule__ComputedColumn__Group__1"


    // $ANTLR start "rule__ComputedColumn__Group__1__Impl"
    // InternalFromText.g:1311:1: rule__ComputedColumn__Group__1__Impl : ( '(' ) ;
    public final void rule__ComputedColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1315:1: ( ( '(' ) )
            // InternalFromText.g:1316:1: ( '(' )
            {
            // InternalFromText.g:1316:1: ( '(' )
            // InternalFromText.g:1317:2: '('
            {
             before(grammarAccess.getComputedColumnAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComputedColumnAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ComputedColumn__Group__1__Impl"


    // $ANTLR start "rule__ComputedColumn__Group__2"
    // InternalFromText.g:1326:1: rule__ComputedColumn__Group__2 : rule__ComputedColumn__Group__2__Impl rule__ComputedColumn__Group__3 ;
    public final void rule__ComputedColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1330:1: ( rule__ComputedColumn__Group__2__Impl rule__ComputedColumn__Group__3 )
            // InternalFromText.g:1331:2: rule__ComputedColumn__Group__2__Impl rule__ComputedColumn__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ComputedColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputedColumn__Group__3();

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
    // $ANTLR end "rule__ComputedColumn__Group__2"


    // $ANTLR start "rule__ComputedColumn__Group__2__Impl"
    // InternalFromText.g:1338:1: rule__ComputedColumn__Group__2__Impl : ( ( rule__ComputedColumn__TypeAssignment_2 ) ) ;
    public final void rule__ComputedColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1342:1: ( ( ( rule__ComputedColumn__TypeAssignment_2 ) ) )
            // InternalFromText.g:1343:1: ( ( rule__ComputedColumn__TypeAssignment_2 ) )
            {
            // InternalFromText.g:1343:1: ( ( rule__ComputedColumn__TypeAssignment_2 ) )
            // InternalFromText.g:1344:2: ( rule__ComputedColumn__TypeAssignment_2 )
            {
             before(grammarAccess.getComputedColumnAccess().getTypeAssignment_2()); 
            // InternalFromText.g:1345:2: ( rule__ComputedColumn__TypeAssignment_2 )
            // InternalFromText.g:1345:3: rule__ComputedColumn__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComputedColumn__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComputedColumnAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__ComputedColumn__Group__2__Impl"


    // $ANTLR start "rule__ComputedColumn__Group__3"
    // InternalFromText.g:1353:1: rule__ComputedColumn__Group__3 : rule__ComputedColumn__Group__3__Impl rule__ComputedColumn__Group__4 ;
    public final void rule__ComputedColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1357:1: ( rule__ComputedColumn__Group__3__Impl rule__ComputedColumn__Group__4 )
            // InternalFromText.g:1358:2: rule__ComputedColumn__Group__3__Impl rule__ComputedColumn__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ComputedColumn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputedColumn__Group__4();

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
    // $ANTLR end "rule__ComputedColumn__Group__3"


    // $ANTLR start "rule__ComputedColumn__Group__3__Impl"
    // InternalFromText.g:1365:1: rule__ComputedColumn__Group__3__Impl : ( ')' ) ;
    public final void rule__ComputedColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1369:1: ( ( ')' ) )
            // InternalFromText.g:1370:1: ( ')' )
            {
            // InternalFromText.g:1370:1: ( ')' )
            // InternalFromText.g:1371:2: ')'
            {
             before(grammarAccess.getComputedColumnAccess().getRightParenthesisKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComputedColumnAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ComputedColumn__Group__3__Impl"


    // $ANTLR start "rule__ComputedColumn__Group__4"
    // InternalFromText.g:1380:1: rule__ComputedColumn__Group__4 : rule__ComputedColumn__Group__4__Impl rule__ComputedColumn__Group__5 ;
    public final void rule__ComputedColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1384:1: ( rule__ComputedColumn__Group__4__Impl rule__ComputedColumn__Group__5 )
            // InternalFromText.g:1385:2: rule__ComputedColumn__Group__4__Impl rule__ComputedColumn__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ComputedColumn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputedColumn__Group__5();

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
    // $ANTLR end "rule__ComputedColumn__Group__4"


    // $ANTLR start "rule__ComputedColumn__Group__4__Impl"
    // InternalFromText.g:1392:1: rule__ComputedColumn__Group__4__Impl : ( ':' ) ;
    public final void rule__ComputedColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1396:1: ( ( ':' ) )
            // InternalFromText.g:1397:1: ( ':' )
            {
            // InternalFromText.g:1397:1: ( ':' )
            // InternalFromText.g:1398:2: ':'
            {
             before(grammarAccess.getComputedColumnAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComputedColumnAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__ComputedColumn__Group__4__Impl"


    // $ANTLR start "rule__ComputedColumn__Group__5"
    // InternalFromText.g:1407:1: rule__ComputedColumn__Group__5 : rule__ComputedColumn__Group__5__Impl rule__ComputedColumn__Group__6 ;
    public final void rule__ComputedColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1411:1: ( rule__ComputedColumn__Group__5__Impl rule__ComputedColumn__Group__6 )
            // InternalFromText.g:1412:2: rule__ComputedColumn__Group__5__Impl rule__ComputedColumn__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ComputedColumn__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputedColumn__Group__6();

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
    // $ANTLR end "rule__ComputedColumn__Group__5"


    // $ANTLR start "rule__ComputedColumn__Group__5__Impl"
    // InternalFromText.g:1419:1: rule__ComputedColumn__Group__5__Impl : ( ( rule__ComputedColumn__FunctionAssignment_5 ) ) ;
    public final void rule__ComputedColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1423:1: ( ( ( rule__ComputedColumn__FunctionAssignment_5 ) ) )
            // InternalFromText.g:1424:1: ( ( rule__ComputedColumn__FunctionAssignment_5 ) )
            {
            // InternalFromText.g:1424:1: ( ( rule__ComputedColumn__FunctionAssignment_5 ) )
            // InternalFromText.g:1425:2: ( rule__ComputedColumn__FunctionAssignment_5 )
            {
             before(grammarAccess.getComputedColumnAccess().getFunctionAssignment_5()); 
            // InternalFromText.g:1426:2: ( rule__ComputedColumn__FunctionAssignment_5 )
            // InternalFromText.g:1426:3: rule__ComputedColumn__FunctionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ComputedColumn__FunctionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComputedColumnAccess().getFunctionAssignment_5()); 

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
    // $ANTLR end "rule__ComputedColumn__Group__5__Impl"


    // $ANTLR start "rule__ComputedColumn__Group__6"
    // InternalFromText.g:1434:1: rule__ComputedColumn__Group__6 : rule__ComputedColumn__Group__6__Impl rule__ComputedColumn__Group__7 ;
    public final void rule__ComputedColumn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1438:1: ( rule__ComputedColumn__Group__6__Impl rule__ComputedColumn__Group__7 )
            // InternalFromText.g:1439:2: rule__ComputedColumn__Group__6__Impl rule__ComputedColumn__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ComputedColumn__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputedColumn__Group__7();

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
    // $ANTLR end "rule__ComputedColumn__Group__6"


    // $ANTLR start "rule__ComputedColumn__Group__6__Impl"
    // InternalFromText.g:1446:1: rule__ComputedColumn__Group__6__Impl : ( '->' ) ;
    public final void rule__ComputedColumn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1450:1: ( ( '->' ) )
            // InternalFromText.g:1451:1: ( '->' )
            {
            // InternalFromText.g:1451:1: ( '->' )
            // InternalFromText.g:1452:2: '->'
            {
             before(grammarAccess.getComputedColumnAccess().getHyphenMinusGreaterThanSignKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComputedColumnAccess().getHyphenMinusGreaterThanSignKeyword_6()); 

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
    // $ANTLR end "rule__ComputedColumn__Group__6__Impl"


    // $ANTLR start "rule__ComputedColumn__Group__7"
    // InternalFromText.g:1461:1: rule__ComputedColumn__Group__7 : rule__ComputedColumn__Group__7__Impl ;
    public final void rule__ComputedColumn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1465:1: ( rule__ComputedColumn__Group__7__Impl )
            // InternalFromText.g:1466:2: rule__ComputedColumn__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComputedColumn__Group__7__Impl();

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
    // $ANTLR end "rule__ComputedColumn__Group__7"


    // $ANTLR start "rule__ComputedColumn__Group__7__Impl"
    // InternalFromText.g:1472:1: rule__ComputedColumn__Group__7__Impl : ( ( rule__ComputedColumn__IdAssignment_7 ) ) ;
    public final void rule__ComputedColumn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1476:1: ( ( ( rule__ComputedColumn__IdAssignment_7 ) ) )
            // InternalFromText.g:1477:1: ( ( rule__ComputedColumn__IdAssignment_7 ) )
            {
            // InternalFromText.g:1477:1: ( ( rule__ComputedColumn__IdAssignment_7 ) )
            // InternalFromText.g:1478:2: ( rule__ComputedColumn__IdAssignment_7 )
            {
             before(grammarAccess.getComputedColumnAccess().getIdAssignment_7()); 
            // InternalFromText.g:1479:2: ( rule__ComputedColumn__IdAssignment_7 )
            // InternalFromText.g:1479:3: rule__ComputedColumn__IdAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ComputedColumn__IdAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getComputedColumnAccess().getIdAssignment_7()); 

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
    // $ANTLR end "rule__ComputedColumn__Group__7__Impl"


    // $ANTLR start "rule__ColumnArgument__Group__0"
    // InternalFromText.g:1488:1: rule__ColumnArgument__Group__0 : rule__ColumnArgument__Group__0__Impl rule__ColumnArgument__Group__1 ;
    public final void rule__ColumnArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1492:1: ( rule__ColumnArgument__Group__0__Impl rule__ColumnArgument__Group__1 )
            // InternalFromText.g:1493:2: rule__ColumnArgument__Group__0__Impl rule__ColumnArgument__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ColumnArgument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnArgument__Group__1();

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
    // $ANTLR end "rule__ColumnArgument__Group__0"


    // $ANTLR start "rule__ColumnArgument__Group__0__Impl"
    // InternalFromText.g:1500:1: rule__ColumnArgument__Group__0__Impl : ( () ) ;
    public final void rule__ColumnArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1504:1: ( ( () ) )
            // InternalFromText.g:1505:1: ( () )
            {
            // InternalFromText.g:1505:1: ( () )
            // InternalFromText.g:1506:2: ()
            {
             before(grammarAccess.getColumnArgumentAccess().getColumnArgumentAction_0()); 
            // InternalFromText.g:1507:2: ()
            // InternalFromText.g:1507:3: 
            {
            }

             after(grammarAccess.getColumnArgumentAccess().getColumnArgumentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnArgument__Group__0__Impl"


    // $ANTLR start "rule__ColumnArgument__Group__1"
    // InternalFromText.g:1515:1: rule__ColumnArgument__Group__1 : rule__ColumnArgument__Group__1__Impl ;
    public final void rule__ColumnArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1519:1: ( rule__ColumnArgument__Group__1__Impl )
            // InternalFromText.g:1520:2: rule__ColumnArgument__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnArgument__Group__1__Impl();

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
    // $ANTLR end "rule__ColumnArgument__Group__1"


    // $ANTLR start "rule__ColumnArgument__Group__1__Impl"
    // InternalFromText.g:1526:1: rule__ColumnArgument__Group__1__Impl : ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) ) ;
    public final void rule__ColumnArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1530:1: ( ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) ) )
            // InternalFromText.g:1531:1: ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) )
            {
            // InternalFromText.g:1531:1: ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) )
            // InternalFromText.g:1532:2: ( rule__ColumnArgument__ColumnPathAssignment_1 )
            {
             before(grammarAccess.getColumnArgumentAccess().getColumnPathAssignment_1()); 
            // InternalFromText.g:1533:2: ( rule__ColumnArgument__ColumnPathAssignment_1 )
            // InternalFromText.g:1533:3: rule__ColumnArgument__ColumnPathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnArgument__ColumnPathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnArgumentAccess().getColumnPathAssignment_1()); 

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
    // $ANTLR end "rule__ColumnArgument__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalFromText.g:1542:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1546:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalFromText.g:1547:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalFromText.g:1554:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1558:1: ( ( () ) )
            // InternalFromText.g:1559:1: ( () )
            {
            // InternalFromText.g:1559:1: ( () )
            // InternalFromText.g:1560:2: ()
            {
             before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            // InternalFromText.g:1561:2: ()
            // InternalFromText.g:1561:3: 
            {
            }

             after(grammarAccess.getFunctionAccess().getFunctionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalFromText.g:1569:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1573:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalFromText.g:1574:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalFromText.g:1581:1: rule__Function__Group__1__Impl : ( 'Function' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1585:1: ( ( 'Function' ) )
            // InternalFromText.g:1586:1: ( 'Function' )
            {
            // InternalFromText.g:1586:1: ( 'Function' )
            // InternalFromText.g:1587:2: 'Function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); 

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
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalFromText.g:1596:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1600:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalFromText.g:1601:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalFromText.g:1608:1: rule__Function__Group__2__Impl : ( '{' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1612:1: ( ( '{' ) )
            // InternalFromText.g:1613:1: ( '{' )
            {
            // InternalFromText.g:1613:1: ( '{' )
            // InternalFromText.g:1614:2: '{'
            {
             before(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalFromText.g:1623:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1627:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalFromText.g:1628:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

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
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalFromText.g:1635:1: rule__Function__Group__3__Impl : ( ( rule__Function__Group_3__0 )? ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1639:1: ( ( ( rule__Function__Group_3__0 )? ) )
            // InternalFromText.g:1640:1: ( ( rule__Function__Group_3__0 )? )
            {
            // InternalFromText.g:1640:1: ( ( rule__Function__Group_3__0 )? )
            // InternalFromText.g:1641:2: ( rule__Function__Group_3__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_3()); 
            // InternalFromText.g:1642:2: ( rule__Function__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFromText.g:1642:3: rule__Function__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalFromText.g:1650:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1654:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalFromText.g:1655:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__5();

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
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalFromText.g:1662:1: rule__Function__Group__4__Impl : ( ( rule__Function__Group_4__0 )? ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1666:1: ( ( ( rule__Function__Group_4__0 )? ) )
            // InternalFromText.g:1667:1: ( ( rule__Function__Group_4__0 )? )
            {
            // InternalFromText.g:1667:1: ( ( rule__Function__Group_4__0 )? )
            // InternalFromText.g:1668:2: ( rule__Function__Group_4__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_4()); 
            // InternalFromText.g:1669:2: ( rule__Function__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFromText.g:1669:3: rule__Function__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // InternalFromText.g:1677:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1681:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // InternalFromText.g:1682:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__6();

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
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // InternalFromText.g:1689:1: rule__Function__Group__5__Impl : ( ( rule__Function__Group_5__0 )? ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1693:1: ( ( ( rule__Function__Group_5__0 )? ) )
            // InternalFromText.g:1694:1: ( ( rule__Function__Group_5__0 )? )
            {
            // InternalFromText.g:1694:1: ( ( rule__Function__Group_5__0 )? )
            // InternalFromText.g:1695:2: ( rule__Function__Group_5__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_5()); 
            // InternalFromText.g:1696:2: ( rule__Function__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFromText.g:1696:3: rule__Function__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // InternalFromText.g:1704:1: rule__Function__Group__6 : rule__Function__Group__6__Impl rule__Function__Group__7 ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1708:1: ( rule__Function__Group__6__Impl rule__Function__Group__7 )
            // InternalFromText.g:1709:2: rule__Function__Group__6__Impl rule__Function__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Function__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__7();

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
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // InternalFromText.g:1716:1: rule__Function__Group__6__Impl : ( ( rule__Function__Group_6__0 )? ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1720:1: ( ( ( rule__Function__Group_6__0 )? ) )
            // InternalFromText.g:1721:1: ( ( rule__Function__Group_6__0 )? )
            {
            // InternalFromText.g:1721:1: ( ( rule__Function__Group_6__0 )? )
            // InternalFromText.g:1722:2: ( rule__Function__Group_6__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_6()); 
            // InternalFromText.g:1723:2: ( rule__Function__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFromText.g:1723:3: rule__Function__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__Function__Group__7"
    // InternalFromText.g:1731:1: rule__Function__Group__7 : rule__Function__Group__7__Impl ;
    public final void rule__Function__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1735:1: ( rule__Function__Group__7__Impl )
            // InternalFromText.g:1736:2: rule__Function__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__7__Impl();

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
    // $ANTLR end "rule__Function__Group__7"


    // $ANTLR start "rule__Function__Group__7__Impl"
    // InternalFromText.g:1742:1: rule__Function__Group__7__Impl : ( '}' ) ;
    public final void rule__Function__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1746:1: ( ( '}' ) )
            // InternalFromText.g:1747:1: ( '}' )
            {
            // InternalFromText.g:1747:1: ( '}' )
            // InternalFromText.g:1748:2: '}'
            {
             before(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Function__Group__7__Impl"


    // $ANTLR start "rule__Function__Group_3__0"
    // InternalFromText.g:1758:1: rule__Function__Group_3__0 : rule__Function__Group_3__0__Impl rule__Function__Group_3__1 ;
    public final void rule__Function__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1762:1: ( rule__Function__Group_3__0__Impl rule__Function__Group_3__1 )
            // InternalFromText.g:1763:2: rule__Function__Group_3__0__Impl rule__Function__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Function__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_3__1();

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
    // $ANTLR end "rule__Function__Group_3__0"


    // $ANTLR start "rule__Function__Group_3__0__Impl"
    // InternalFromText.g:1770:1: rule__Function__Group_3__0__Impl : ( 'previous' ) ;
    public final void rule__Function__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1774:1: ( ( 'previous' ) )
            // InternalFromText.g:1775:1: ( 'previous' )
            {
            // InternalFromText.g:1775:1: ( 'previous' )
            // InternalFromText.g:1776:2: 'previous'
            {
             before(grammarAccess.getFunctionAccess().getPreviousKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getPreviousKeyword_3_0()); 

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
    // $ANTLR end "rule__Function__Group_3__0__Impl"


    // $ANTLR start "rule__Function__Group_3__1"
    // InternalFromText.g:1785:1: rule__Function__Group_3__1 : rule__Function__Group_3__1__Impl ;
    public final void rule__Function__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1789:1: ( rule__Function__Group_3__1__Impl )
            // InternalFromText.g:1790:2: rule__Function__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_3__1__Impl();

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
    // $ANTLR end "rule__Function__Group_3__1"


    // $ANTLR start "rule__Function__Group_3__1__Impl"
    // InternalFromText.g:1796:1: rule__Function__Group_3__1__Impl : ( ( rule__Function__PreviousAssignment_3_1 ) ) ;
    public final void rule__Function__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1800:1: ( ( ( rule__Function__PreviousAssignment_3_1 ) ) )
            // InternalFromText.g:1801:1: ( ( rule__Function__PreviousAssignment_3_1 ) )
            {
            // InternalFromText.g:1801:1: ( ( rule__Function__PreviousAssignment_3_1 ) )
            // InternalFromText.g:1802:2: ( rule__Function__PreviousAssignment_3_1 )
            {
             before(grammarAccess.getFunctionAccess().getPreviousAssignment_3_1()); 
            // InternalFromText.g:1803:2: ( rule__Function__PreviousAssignment_3_1 )
            // InternalFromText.g:1803:3: rule__Function__PreviousAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__PreviousAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getPreviousAssignment_3_1()); 

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
    // $ANTLR end "rule__Function__Group_3__1__Impl"


    // $ANTLR start "rule__Function__Group_4__0"
    // InternalFromText.g:1812:1: rule__Function__Group_4__0 : rule__Function__Group_4__0__Impl rule__Function__Group_4__1 ;
    public final void rule__Function__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1816:1: ( rule__Function__Group_4__0__Impl rule__Function__Group_4__1 )
            // InternalFromText.g:1817:2: rule__Function__Group_4__0__Impl rule__Function__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Function__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_4__1();

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
    // $ANTLR end "rule__Function__Group_4__0"


    // $ANTLR start "rule__Function__Group_4__0__Impl"
    // InternalFromText.g:1824:1: rule__Function__Group_4__0__Impl : ( 'next' ) ;
    public final void rule__Function__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1828:1: ( ( 'next' ) )
            // InternalFromText.g:1829:1: ( 'next' )
            {
            // InternalFromText.g:1829:1: ( 'next' )
            // InternalFromText.g:1830:2: 'next'
            {
             before(grammarAccess.getFunctionAccess().getNextKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNextKeyword_4_0()); 

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
    // $ANTLR end "rule__Function__Group_4__0__Impl"


    // $ANTLR start "rule__Function__Group_4__1"
    // InternalFromText.g:1839:1: rule__Function__Group_4__1 : rule__Function__Group_4__1__Impl ;
    public final void rule__Function__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1843:1: ( rule__Function__Group_4__1__Impl )
            // InternalFromText.g:1844:2: rule__Function__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_4__1__Impl();

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
    // $ANTLR end "rule__Function__Group_4__1"


    // $ANTLR start "rule__Function__Group_4__1__Impl"
    // InternalFromText.g:1850:1: rule__Function__Group_4__1__Impl : ( ( rule__Function__NextAssignment_4_1 ) ) ;
    public final void rule__Function__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1854:1: ( ( ( rule__Function__NextAssignment_4_1 ) ) )
            // InternalFromText.g:1855:1: ( ( rule__Function__NextAssignment_4_1 ) )
            {
            // InternalFromText.g:1855:1: ( ( rule__Function__NextAssignment_4_1 ) )
            // InternalFromText.g:1856:2: ( rule__Function__NextAssignment_4_1 )
            {
             before(grammarAccess.getFunctionAccess().getNextAssignment_4_1()); 
            // InternalFromText.g:1857:2: ( rule__Function__NextAssignment_4_1 )
            // InternalFromText.g:1857:3: rule__Function__NextAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNextAssignment_4_1()); 

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
    // $ANTLR end "rule__Function__Group_4__1__Impl"


    // $ANTLR start "rule__Function__Group_5__0"
    // InternalFromText.g:1866:1: rule__Function__Group_5__0 : rule__Function__Group_5__0__Impl rule__Function__Group_5__1 ;
    public final void rule__Function__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1870:1: ( rule__Function__Group_5__0__Impl rule__Function__Group_5__1 )
            // InternalFromText.g:1871:2: rule__Function__Group_5__0__Impl rule__Function__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__Function__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_5__1();

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
    // $ANTLR end "rule__Function__Group_5__0"


    // $ANTLR start "rule__Function__Group_5__0__Impl"
    // InternalFromText.g:1878:1: rule__Function__Group_5__0__Impl : ( 'input' ) ;
    public final void rule__Function__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1882:1: ( ( 'input' ) )
            // InternalFromText.g:1883:1: ( 'input' )
            {
            // InternalFromText.g:1883:1: ( 'input' )
            // InternalFromText.g:1884:2: 'input'
            {
             before(grammarAccess.getFunctionAccess().getInputKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getInputKeyword_5_0()); 

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
    // $ANTLR end "rule__Function__Group_5__0__Impl"


    // $ANTLR start "rule__Function__Group_5__1"
    // InternalFromText.g:1893:1: rule__Function__Group_5__1 : rule__Function__Group_5__1__Impl rule__Function__Group_5__2 ;
    public final void rule__Function__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1897:1: ( rule__Function__Group_5__1__Impl rule__Function__Group_5__2 )
            // InternalFromText.g:1898:2: rule__Function__Group_5__1__Impl rule__Function__Group_5__2
            {
            pushFollow(FOLLOW_6);
            rule__Function__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_5__2();

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
    // $ANTLR end "rule__Function__Group_5__1"


    // $ANTLR start "rule__Function__Group_5__1__Impl"
    // InternalFromText.g:1905:1: rule__Function__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Function__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1909:1: ( ( '(' ) )
            // InternalFromText.g:1910:1: ( '(' )
            {
            // InternalFromText.g:1910:1: ( '(' )
            // InternalFromText.g:1911:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__Function__Group_5__1__Impl"


    // $ANTLR start "rule__Function__Group_5__2"
    // InternalFromText.g:1920:1: rule__Function__Group_5__2 : rule__Function__Group_5__2__Impl rule__Function__Group_5__3 ;
    public final void rule__Function__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1924:1: ( rule__Function__Group_5__2__Impl rule__Function__Group_5__3 )
            // InternalFromText.g:1925:2: rule__Function__Group_5__2__Impl rule__Function__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__Function__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_5__3();

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
    // $ANTLR end "rule__Function__Group_5__2"


    // $ANTLR start "rule__Function__Group_5__2__Impl"
    // InternalFromText.g:1932:1: rule__Function__Group_5__2__Impl : ( ( rule__Function__InputAssignment_5_2 ) ) ;
    public final void rule__Function__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1936:1: ( ( ( rule__Function__InputAssignment_5_2 ) ) )
            // InternalFromText.g:1937:1: ( ( rule__Function__InputAssignment_5_2 ) )
            {
            // InternalFromText.g:1937:1: ( ( rule__Function__InputAssignment_5_2 ) )
            // InternalFromText.g:1938:2: ( rule__Function__InputAssignment_5_2 )
            {
             before(grammarAccess.getFunctionAccess().getInputAssignment_5_2()); 
            // InternalFromText.g:1939:2: ( rule__Function__InputAssignment_5_2 )
            // InternalFromText.g:1939:3: rule__Function__InputAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Function__InputAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getInputAssignment_5_2()); 

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
    // $ANTLR end "rule__Function__Group_5__2__Impl"


    // $ANTLR start "rule__Function__Group_5__3"
    // InternalFromText.g:1947:1: rule__Function__Group_5__3 : rule__Function__Group_5__3__Impl rule__Function__Group_5__4 ;
    public final void rule__Function__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1951:1: ( rule__Function__Group_5__3__Impl rule__Function__Group_5__4 )
            // InternalFromText.g:1952:2: rule__Function__Group_5__3__Impl rule__Function__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__Function__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_5__4();

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
    // $ANTLR end "rule__Function__Group_5__3"


    // $ANTLR start "rule__Function__Group_5__3__Impl"
    // InternalFromText.g:1959:1: rule__Function__Group_5__3__Impl : ( ( rule__Function__Group_5_3__0 )* ) ;
    public final void rule__Function__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1963:1: ( ( ( rule__Function__Group_5_3__0 )* ) )
            // InternalFromText.g:1964:1: ( ( rule__Function__Group_5_3__0 )* )
            {
            // InternalFromText.g:1964:1: ( ( rule__Function__Group_5_3__0 )* )
            // InternalFromText.g:1965:2: ( rule__Function__Group_5_3__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_5_3()); 
            // InternalFromText.g:1966:2: ( rule__Function__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFromText.g:1966:3: rule__Function__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Function__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Function__Group_5__3__Impl"


    // $ANTLR start "rule__Function__Group_5__4"
    // InternalFromText.g:1974:1: rule__Function__Group_5__4 : rule__Function__Group_5__4__Impl ;
    public final void rule__Function__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1978:1: ( rule__Function__Group_5__4__Impl )
            // InternalFromText.g:1979:2: rule__Function__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_5__4__Impl();

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
    // $ANTLR end "rule__Function__Group_5__4"


    // $ANTLR start "rule__Function__Group_5__4__Impl"
    // InternalFromText.g:1985:1: rule__Function__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Function__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1989:1: ( ( ')' ) )
            // InternalFromText.g:1990:1: ( ')' )
            {
            // InternalFromText.g:1990:1: ( ')' )
            // InternalFromText.g:1991:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__Function__Group_5__4__Impl"


    // $ANTLR start "rule__Function__Group_5_3__0"
    // InternalFromText.g:2001:1: rule__Function__Group_5_3__0 : rule__Function__Group_5_3__0__Impl rule__Function__Group_5_3__1 ;
    public final void rule__Function__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2005:1: ( rule__Function__Group_5_3__0__Impl rule__Function__Group_5_3__1 )
            // InternalFromText.g:2006:2: rule__Function__Group_5_3__0__Impl rule__Function__Group_5_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Function__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_5_3__1();

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
    // $ANTLR end "rule__Function__Group_5_3__0"


    // $ANTLR start "rule__Function__Group_5_3__0__Impl"
    // InternalFromText.g:2013:1: rule__Function__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2017:1: ( ( ',' ) )
            // InternalFromText.g:2018:1: ( ',' )
            {
            // InternalFromText.g:2018:1: ( ',' )
            // InternalFromText.g:2019:2: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Function__Group_5_3__0__Impl"


    // $ANTLR start "rule__Function__Group_5_3__1"
    // InternalFromText.g:2028:1: rule__Function__Group_5_3__1 : rule__Function__Group_5_3__1__Impl ;
    public final void rule__Function__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2032:1: ( rule__Function__Group_5_3__1__Impl )
            // InternalFromText.g:2033:2: rule__Function__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Function__Group_5_3__1"


    // $ANTLR start "rule__Function__Group_5_3__1__Impl"
    // InternalFromText.g:2039:1: rule__Function__Group_5_3__1__Impl : ( ( rule__Function__InputAssignment_5_3_1 ) ) ;
    public final void rule__Function__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2043:1: ( ( ( rule__Function__InputAssignment_5_3_1 ) ) )
            // InternalFromText.g:2044:1: ( ( rule__Function__InputAssignment_5_3_1 ) )
            {
            // InternalFromText.g:2044:1: ( ( rule__Function__InputAssignment_5_3_1 ) )
            // InternalFromText.g:2045:2: ( rule__Function__InputAssignment_5_3_1 )
            {
             before(grammarAccess.getFunctionAccess().getInputAssignment_5_3_1()); 
            // InternalFromText.g:2046:2: ( rule__Function__InputAssignment_5_3_1 )
            // InternalFromText.g:2046:3: rule__Function__InputAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__InputAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getInputAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Function__Group_5_3__1__Impl"


    // $ANTLR start "rule__Function__Group_6__0"
    // InternalFromText.g:2055:1: rule__Function__Group_6__0 : rule__Function__Group_6__0__Impl rule__Function__Group_6__1 ;
    public final void rule__Function__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2059:1: ( rule__Function__Group_6__0__Impl rule__Function__Group_6__1 )
            // InternalFromText.g:2060:2: rule__Function__Group_6__0__Impl rule__Function__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__Function__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_6__1();

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
    // $ANTLR end "rule__Function__Group_6__0"


    // $ANTLR start "rule__Function__Group_6__0__Impl"
    // InternalFromText.g:2067:1: rule__Function__Group_6__0__Impl : ( 'operation' ) ;
    public final void rule__Function__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2071:1: ( ( 'operation' ) )
            // InternalFromText.g:2072:1: ( 'operation' )
            {
            // InternalFromText.g:2072:1: ( 'operation' )
            // InternalFromText.g:2073:2: 'operation'
            {
             before(grammarAccess.getFunctionAccess().getOperationKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getOperationKeyword_6_0()); 

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
    // $ANTLR end "rule__Function__Group_6__0__Impl"


    // $ANTLR start "rule__Function__Group_6__1"
    // InternalFromText.g:2082:1: rule__Function__Group_6__1 : rule__Function__Group_6__1__Impl ;
    public final void rule__Function__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2086:1: ( rule__Function__Group_6__1__Impl )
            // InternalFromText.g:2087:2: rule__Function__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_6__1__Impl();

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
    // $ANTLR end "rule__Function__Group_6__1"


    // $ANTLR start "rule__Function__Group_6__1__Impl"
    // InternalFromText.g:2093:1: rule__Function__Group_6__1__Impl : ( ( rule__Function__OperationAssignment_6_1 ) ) ;
    public final void rule__Function__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2097:1: ( ( ( rule__Function__OperationAssignment_6_1 ) ) )
            // InternalFromText.g:2098:1: ( ( rule__Function__OperationAssignment_6_1 ) )
            {
            // InternalFromText.g:2098:1: ( ( rule__Function__OperationAssignment_6_1 ) )
            // InternalFromText.g:2099:2: ( rule__Function__OperationAssignment_6_1 )
            {
             before(grammarAccess.getFunctionAccess().getOperationAssignment_6_1()); 
            // InternalFromText.g:2100:2: ( rule__Function__OperationAssignment_6_1 )
            // InternalFromText.g:2100:3: rule__Function__OperationAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__OperationAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getOperationAssignment_6_1()); 

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
    // $ANTLR end "rule__Function__Group_6__1__Impl"


    // $ANTLR start "rule__Sum__Group__0"
    // InternalFromText.g:2109:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2113:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // InternalFromText.g:2114:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Sum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group__1();

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
    // $ANTLR end "rule__Sum__Group__0"


    // $ANTLR start "rule__Sum__Group__0__Impl"
    // InternalFromText.g:2121:1: rule__Sum__Group__0__Impl : ( () ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2125:1: ( ( () ) )
            // InternalFromText.g:2126:1: ( () )
            {
            // InternalFromText.g:2126:1: ( () )
            // InternalFromText.g:2127:2: ()
            {
             before(grammarAccess.getSumAccess().getSumAction_0()); 
            // InternalFromText.g:2128:2: ()
            // InternalFromText.g:2128:3: 
            {
            }

             after(grammarAccess.getSumAccess().getSumAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0__Impl"


    // $ANTLR start "rule__Sum__Group__1"
    // InternalFromText.g:2136:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2140:1: ( rule__Sum__Group__1__Impl )
            // InternalFromText.g:2141:2: rule__Sum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__1__Impl();

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
    // $ANTLR end "rule__Sum__Group__1"


    // $ANTLR start "rule__Sum__Group__1__Impl"
    // InternalFromText.g:2147:1: rule__Sum__Group__1__Impl : ( 'Sum' ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2151:1: ( ( 'Sum' ) )
            // InternalFromText.g:2152:1: ( 'Sum' )
            {
            // InternalFromText.g:2152:1: ( 'Sum' )
            // InternalFromText.g:2153:2: 'Sum'
            {
             before(grammarAccess.getSumAccess().getSumKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getSumKeyword_1()); 

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
    // $ANTLR end "rule__Sum__Group__1__Impl"


    // $ANTLR start "rule__ChaiseMinute__TablesAssignment_1_0"
    // InternalFromText.g:2163:1: rule__ChaiseMinute__TablesAssignment_1_0 : ( ruleTable ) ;
    public final void rule__ChaiseMinute__TablesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2167:1: ( ( ruleTable ) )
            // InternalFromText.g:2168:2: ( ruleTable )
            {
            // InternalFromText.g:2168:2: ( ruleTable )
            // InternalFromText.g:2169:3: ruleTable
            {
             before(grammarAccess.getChaiseMinuteAccess().getTablesTableParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getChaiseMinuteAccess().getTablesTableParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ChaiseMinute__TablesAssignment_1_0"


    // $ANTLR start "rule__ChaiseMinute__TablesAssignment_1_1"
    // InternalFromText.g:2178:1: rule__ChaiseMinute__TablesAssignment_1_1 : ( ruleTable ) ;
    public final void rule__ChaiseMinute__TablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2182:1: ( ( ruleTable ) )
            // InternalFromText.g:2183:2: ( ruleTable )
            {
            // InternalFromText.g:2183:2: ( ruleTable )
            // InternalFromText.g:2184:3: ruleTable
            {
             before(grammarAccess.getChaiseMinuteAccess().getTablesTableParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getChaiseMinuteAccess().getTablesTableParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ChaiseMinute__TablesAssignment_1_1"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalFromText.g:2193:1: rule__Table__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2197:1: ( ( ruleEString ) )
            // InternalFromText.g:2198:2: ( ruleEString )
            {
            // InternalFromText.g:2198:2: ( ruleEString )
            // InternalFromText.g:2199:3: ruleEString
            {
             before(grammarAccess.getTableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__IndexColumnAssignment_3"
    // InternalFromText.g:2208:1: rule__Table__IndexColumnAssignment_3 : ( ruleIndexColumn ) ;
    public final void rule__Table__IndexColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2212:1: ( ( ruleIndexColumn ) )
            // InternalFromText.g:2213:2: ( ruleIndexColumn )
            {
            // InternalFromText.g:2213:2: ( ruleIndexColumn )
            // InternalFromText.g:2214:3: ruleIndexColumn
            {
             before(grammarAccess.getTableAccess().getIndexColumnIndexColumnParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIndexColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getIndexColumnIndexColumnParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Table__IndexColumnAssignment_3"


    // $ANTLR start "rule__Table__ColumnsAssignment_5_0"
    // InternalFromText.g:2223:1: rule__Table__ColumnsAssignment_5_0 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2227:1: ( ( ruleColumn ) )
            // InternalFromText.g:2228:2: ( ruleColumn )
            {
            // InternalFromText.g:2228:2: ( ruleColumn )
            // InternalFromText.g:2229:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Table__ColumnsAssignment_5_0"


    // $ANTLR start "rule__Table__ColumnsAssignment_5_1_1"
    // InternalFromText.g:2238:1: rule__Table__ColumnsAssignment_5_1_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2242:1: ( ( ruleColumn ) )
            // InternalFromText.g:2243:2: ( ruleColumn )
            {
            // InternalFromText.g:2243:2: ( ruleColumn )
            // InternalFromText.g:2244:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_1_1_0()); 

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
    // $ANTLR end "rule__Table__ColumnsAssignment_5_1_1"


    // $ANTLR start "rule__ColumnData__TypeAssignment_2"
    // InternalFromText.g:2253:1: rule__ColumnData__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__ColumnData__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2257:1: ( ( ruleDataType ) )
            // InternalFromText.g:2258:2: ( ruleDataType )
            {
            // InternalFromText.g:2258:2: ( ruleDataType )
            // InternalFromText.g:2259:3: ruleDataType
            {
             before(grammarAccess.getColumnDataAccess().getTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getColumnDataAccess().getTypeDataTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__ColumnData__TypeAssignment_2"


    // $ANTLR start "rule__ColumnData__IdAssignment_5"
    // InternalFromText.g:2268:1: rule__ColumnData__IdAssignment_5 : ( ruleEString ) ;
    public final void rule__ColumnData__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2272:1: ( ( ruleEString ) )
            // InternalFromText.g:2273:2: ( ruleEString )
            {
            // InternalFromText.g:2273:2: ( ruleEString )
            // InternalFromText.g:2274:3: ruleEString
            {
             before(grammarAccess.getColumnDataAccess().getIdEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnDataAccess().getIdEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ColumnData__IdAssignment_5"


    // $ANTLR start "rule__ImportedColumn__TypeAssignment_2"
    // InternalFromText.g:2283:1: rule__ImportedColumn__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__ImportedColumn__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2287:1: ( ( ruleDataType ) )
            // InternalFromText.g:2288:2: ( ruleDataType )
            {
            // InternalFromText.g:2288:2: ( ruleDataType )
            // InternalFromText.g:2289:3: ruleDataType
            {
             before(grammarAccess.getImportedColumnAccess().getTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getImportedColumnAccess().getTypeDataTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__ImportedColumn__TypeAssignment_2"


    // $ANTLR start "rule__ImportedColumn__PathAssignment_5"
    // InternalFromText.g:2298:1: rule__ImportedColumn__PathAssignment_5 : ( ruleEString ) ;
    public final void rule__ImportedColumn__PathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2302:1: ( ( ruleEString ) )
            // InternalFromText.g:2303:2: ( ruleEString )
            {
            // InternalFromText.g:2303:2: ( ruleEString )
            // InternalFromText.g:2304:3: ruleEString
            {
             before(grammarAccess.getImportedColumnAccess().getPathEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getImportedColumnAccess().getPathEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ImportedColumn__PathAssignment_5"


    // $ANTLR start "rule__ImportedColumn__IdAssignment_7"
    // InternalFromText.g:2313:1: rule__ImportedColumn__IdAssignment_7 : ( ruleEString ) ;
    public final void rule__ImportedColumn__IdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2317:1: ( ( ruleEString ) )
            // InternalFromText.g:2318:2: ( ruleEString )
            {
            // InternalFromText.g:2318:2: ( ruleEString )
            // InternalFromText.g:2319:3: ruleEString
            {
             before(grammarAccess.getImportedColumnAccess().getIdEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getImportedColumnAccess().getIdEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ImportedColumn__IdAssignment_7"


    // $ANTLR start "rule__ComputedColumn__TypeAssignment_2"
    // InternalFromText.g:2328:1: rule__ComputedColumn__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__ComputedColumn__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2332:1: ( ( ruleDataType ) )
            // InternalFromText.g:2333:2: ( ruleDataType )
            {
            // InternalFromText.g:2333:2: ( ruleDataType )
            // InternalFromText.g:2334:3: ruleDataType
            {
             before(grammarAccess.getComputedColumnAccess().getTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getComputedColumnAccess().getTypeDataTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComputedColumn__TypeAssignment_2"


    // $ANTLR start "rule__ComputedColumn__FunctionAssignment_5"
    // InternalFromText.g:2343:1: rule__ComputedColumn__FunctionAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ComputedColumn__FunctionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2347:1: ( ( ( ruleEString ) ) )
            // InternalFromText.g:2348:2: ( ( ruleEString ) )
            {
            // InternalFromText.g:2348:2: ( ( ruleEString ) )
            // InternalFromText.g:2349:3: ( ruleEString )
            {
             before(grammarAccess.getComputedColumnAccess().getFunctionAlgorithmCrossReference_5_0()); 
            // InternalFromText.g:2350:3: ( ruleEString )
            // InternalFromText.g:2351:4: ruleEString
            {
             before(grammarAccess.getComputedColumnAccess().getFunctionAlgorithmEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComputedColumnAccess().getFunctionAlgorithmEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getComputedColumnAccess().getFunctionAlgorithmCrossReference_5_0()); 

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
    // $ANTLR end "rule__ComputedColumn__FunctionAssignment_5"


    // $ANTLR start "rule__ComputedColumn__IdAssignment_7"
    // InternalFromText.g:2362:1: rule__ComputedColumn__IdAssignment_7 : ( ruleEString ) ;
    public final void rule__ComputedColumn__IdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2366:1: ( ( ruleEString ) )
            // InternalFromText.g:2367:2: ( ruleEString )
            {
            // InternalFromText.g:2367:2: ( ruleEString )
            // InternalFromText.g:2368:3: ruleEString
            {
             before(grammarAccess.getComputedColumnAccess().getIdEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComputedColumnAccess().getIdEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ComputedColumn__IdAssignment_7"


    // $ANTLR start "rule__ColumnArgument__ColumnPathAssignment_1"
    // InternalFromText.g:2377:1: rule__ColumnArgument__ColumnPathAssignment_1 : ( ruleEString ) ;
    public final void rule__ColumnArgument__ColumnPathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2381:1: ( ( ruleEString ) )
            // InternalFromText.g:2382:2: ( ruleEString )
            {
            // InternalFromText.g:2382:2: ( ruleEString )
            // InternalFromText.g:2383:3: ruleEString
            {
             before(grammarAccess.getColumnArgumentAccess().getColumnPathEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnArgumentAccess().getColumnPathEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ColumnArgument__ColumnPathAssignment_1"


    // $ANTLR start "rule__Function__PreviousAssignment_3_1"
    // InternalFromText.g:2392:1: rule__Function__PreviousAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Function__PreviousAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2396:1: ( ( ( ruleEString ) ) )
            // InternalFromText.g:2397:2: ( ( ruleEString ) )
            {
            // InternalFromText.g:2397:2: ( ( ruleEString ) )
            // InternalFromText.g:2398:3: ( ruleEString )
            {
             before(grammarAccess.getFunctionAccess().getPreviousFunctionCrossReference_3_1_0()); 
            // InternalFromText.g:2399:3: ( ruleEString )
            // InternalFromText.g:2400:4: ruleEString
            {
             before(grammarAccess.getFunctionAccess().getPreviousFunctionEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getPreviousFunctionEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getPreviousFunctionCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Function__PreviousAssignment_3_1"


    // $ANTLR start "rule__Function__NextAssignment_4_1"
    // InternalFromText.g:2411:1: rule__Function__NextAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Function__NextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2415:1: ( ( ( ruleEString ) ) )
            // InternalFromText.g:2416:2: ( ( ruleEString ) )
            {
            // InternalFromText.g:2416:2: ( ( ruleEString ) )
            // InternalFromText.g:2417:3: ( ruleEString )
            {
             before(grammarAccess.getFunctionAccess().getNextFunctionCrossReference_4_1_0()); 
            // InternalFromText.g:2418:3: ( ruleEString )
            // InternalFromText.g:2419:4: ruleEString
            {
             before(grammarAccess.getFunctionAccess().getNextFunctionEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getNextFunctionEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getNextFunctionCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Function__NextAssignment_4_1"


    // $ANTLR start "rule__Function__InputAssignment_5_2"
    // InternalFromText.g:2430:1: rule__Function__InputAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Function__InputAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2434:1: ( ( ( ruleEString ) ) )
            // InternalFromText.g:2435:2: ( ( ruleEString ) )
            {
            // InternalFromText.g:2435:2: ( ( ruleEString ) )
            // InternalFromText.g:2436:3: ( ruleEString )
            {
             before(grammarAccess.getFunctionAccess().getInputArgumentCrossReference_5_2_0()); 
            // InternalFromText.g:2437:3: ( ruleEString )
            // InternalFromText.g:2438:4: ruleEString
            {
             before(grammarAccess.getFunctionAccess().getInputArgumentEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getInputArgumentEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getInputArgumentCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Function__InputAssignment_5_2"


    // $ANTLR start "rule__Function__InputAssignment_5_3_1"
    // InternalFromText.g:2449:1: rule__Function__InputAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Function__InputAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2453:1: ( ( ( ruleEString ) ) )
            // InternalFromText.g:2454:2: ( ( ruleEString ) )
            {
            // InternalFromText.g:2454:2: ( ( ruleEString ) )
            // InternalFromText.g:2455:3: ( ruleEString )
            {
             before(grammarAccess.getFunctionAccess().getInputArgumentCrossReference_5_3_1_0()); 
            // InternalFromText.g:2456:3: ( ruleEString )
            // InternalFromText.g:2457:4: ruleEString
            {
             before(grammarAccess.getFunctionAccess().getInputArgumentEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getInputArgumentEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getInputArgumentCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__Function__InputAssignment_5_3_1"


    // $ANTLR start "rule__Function__OperationAssignment_6_1"
    // InternalFromText.g:2468:1: rule__Function__OperationAssignment_6_1 : ( ruleOperation ) ;
    public final void rule__Function__OperationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2472:1: ( ( ruleOperation ) )
            // InternalFromText.g:2473:2: ( ruleOperation )
            {
            // InternalFromText.g:2473:2: ( ruleOperation )
            // InternalFromText.g:2474:3: ruleOperation
            {
             before(grammarAccess.getFunctionAccess().getOperationOperationParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getOperationOperationParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Function__OperationAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000514000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000510000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000F004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});

}