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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Int'", "'{'", "'}'", "','", "'index'", "'('", "')'", "':'", "'data'", "'imported'", "'->'", "'computed'", "'>'"
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
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalFromText.g:112:1: ruleIndexColumn : ( ( rule__IndexColumn__Group__0 ) ) ;
    public final void ruleIndexColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:116:2: ( ( ( rule__IndexColumn__Group__0 ) ) )
            // InternalFromText.g:117:2: ( ( rule__IndexColumn__Group__0 ) )
            {
            // InternalFromText.g:117:2: ( ( rule__IndexColumn__Group__0 ) )
            // InternalFromText.g:118:3: ( rule__IndexColumn__Group__0 )
            {
             before(grammarAccess.getIndexColumnAccess().getGroup()); 
            // InternalFromText.g:119:3: ( rule__IndexColumn__Group__0 )
            // InternalFromText.g:119:4: rule__IndexColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndexColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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


    // $ANTLR start "entryRuleFunction"
    // InternalFromText.g:278:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalFromText.g:279:1: ( ruleFunction EOF )
            // InternalFromText.g:280:1: ruleFunction EOF
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
    // InternalFromText.g:287:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:291:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalFromText.g:292:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalFromText.g:292:2: ( ( rule__Function__Group__0 ) )
            // InternalFromText.g:293:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalFromText.g:294:3: ( rule__Function__Group__0 )
            // InternalFromText.g:294:4: rule__Function__Group__0
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


    // $ANTLR start "entryRuleAlgorithm"
    // InternalFromText.g:303:1: entryRuleAlgorithm : ruleAlgorithm EOF ;
    public final void entryRuleAlgorithm() throws RecognitionException {
        try {
            // InternalFromText.g:304:1: ( ruleAlgorithm EOF )
            // InternalFromText.g:305:1: ruleAlgorithm EOF
            {
             before(grammarAccess.getAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgorithm();

            state._fsp--;

             after(grammarAccess.getAlgorithmRule()); 
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
    // $ANTLR end "entryRuleAlgorithm"


    // $ANTLR start "ruleAlgorithm"
    // InternalFromText.g:312:1: ruleAlgorithm : ( ( rule__Algorithm__Group__0 ) ) ;
    public final void ruleAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:316:2: ( ( ( rule__Algorithm__Group__0 ) ) )
            // InternalFromText.g:317:2: ( ( rule__Algorithm__Group__0 ) )
            {
            // InternalFromText.g:317:2: ( ( rule__Algorithm__Group__0 ) )
            // InternalFromText.g:318:3: ( rule__Algorithm__Group__0 )
            {
             before(grammarAccess.getAlgorithmAccess().getGroup()); 
            // InternalFromText.g:319:3: ( rule__Algorithm__Group__0 )
            // InternalFromText.g:319:4: rule__Algorithm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "entryRuleEString"
    // InternalFromText.g:328:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalFromText.g:329:1: ( ruleEString EOF )
            // InternalFromText.g:330:1: ruleEString EOF
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
    // InternalFromText.g:337:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:341:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalFromText.g:342:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalFromText.g:342:2: ( ( rule__EString__Alternatives ) )
            // InternalFromText.g:343:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalFromText.g:344:3: ( rule__EString__Alternatives )
            // InternalFromText.g:344:4: rule__EString__Alternatives
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


    // $ANTLR start "ruleDataType"
    // InternalFromText.g:353:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:357:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalFromText.g:358:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalFromText.g:358:2: ( ( rule__DataType__Alternatives ) )
            // InternalFromText.g:359:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalFromText.g:360:3: ( rule__DataType__Alternatives )
            // InternalFromText.g:360:4: rule__DataType__Alternatives
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
    // InternalFromText.g:368:1: rule__Column__Alternatives : ( ( ruleColumnData ) | ( ruleComputedColumn ) | ( ruleImportedColumn ) );
    public final void rule__Column__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:372:1: ( ( ruleColumnData ) | ( ruleComputedColumn ) | ( ruleImportedColumn ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 21:
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
                    // InternalFromText.g:373:2: ( ruleColumnData )
                    {
                    // InternalFromText.g:373:2: ( ruleColumnData )
                    // InternalFromText.g:374:3: ruleColumnData
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
                    // InternalFromText.g:379:2: ( ruleComputedColumn )
                    {
                    // InternalFromText.g:379:2: ( ruleComputedColumn )
                    // InternalFromText.g:380:3: ruleComputedColumn
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
                    // InternalFromText.g:385:2: ( ruleImportedColumn )
                    {
                    // InternalFromText.g:385:2: ( ruleImportedColumn )
                    // InternalFromText.g:386:3: ruleImportedColumn
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
    // InternalFromText.g:395:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:399:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalFromText.g:400:2: ( RULE_STRING )
                    {
                    // InternalFromText.g:400:2: ( RULE_STRING )
                    // InternalFromText.g:401:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFromText.g:406:2: ( RULE_ID )
                    {
                    // InternalFromText.g:406:2: ( RULE_ID )
                    // InternalFromText.g:407:3: RULE_ID
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
    // InternalFromText.g:416:1: rule__DataType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Int' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:420:1: ( ( ( 'String' ) ) | ( ( 'Int' ) ) )
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
                    // InternalFromText.g:421:2: ( ( 'String' ) )
                    {
                    // InternalFromText.g:421:2: ( ( 'String' ) )
                    // InternalFromText.g:422:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalFromText.g:423:3: ( 'String' )
                    // InternalFromText.g:423:4: 'String'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFromText.g:427:2: ( ( 'Int' ) )
                    {
                    // InternalFromText.g:427:2: ( ( 'Int' ) )
                    // InternalFromText.g:428:3: ( 'Int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalFromText.g:429:3: ( 'Int' )
                    // InternalFromText.g:429:4: 'Int'
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
    // InternalFromText.g:437:1: rule__ChaiseMinute__Group__0 : rule__ChaiseMinute__Group__0__Impl rule__ChaiseMinute__Group__1 ;
    public final void rule__ChaiseMinute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:441:1: ( rule__ChaiseMinute__Group__0__Impl rule__ChaiseMinute__Group__1 )
            // InternalFromText.g:442:2: rule__ChaiseMinute__Group__0__Impl rule__ChaiseMinute__Group__1
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
    // InternalFromText.g:449:1: rule__ChaiseMinute__Group__0__Impl : ( '{' ) ;
    public final void rule__ChaiseMinute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:453:1: ( ( '{' ) )
            // InternalFromText.g:454:1: ( '{' )
            {
            // InternalFromText.g:454:1: ( '{' )
            // InternalFromText.g:455:2: '{'
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
    // InternalFromText.g:464:1: rule__ChaiseMinute__Group__1 : rule__ChaiseMinute__Group__1__Impl rule__ChaiseMinute__Group__2 ;
    public final void rule__ChaiseMinute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:468:1: ( rule__ChaiseMinute__Group__1__Impl rule__ChaiseMinute__Group__2 )
            // InternalFromText.g:469:2: rule__ChaiseMinute__Group__1__Impl rule__ChaiseMinute__Group__2
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
    // InternalFromText.g:476:1: rule__ChaiseMinute__Group__1__Impl : ( ( rule__ChaiseMinute__Group_1__0 )? ) ;
    public final void rule__ChaiseMinute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:480:1: ( ( ( rule__ChaiseMinute__Group_1__0 )? ) )
            // InternalFromText.g:481:1: ( ( rule__ChaiseMinute__Group_1__0 )? )
            {
            // InternalFromText.g:481:1: ( ( rule__ChaiseMinute__Group_1__0 )? )
            // InternalFromText.g:482:2: ( rule__ChaiseMinute__Group_1__0 )?
            {
             before(grammarAccess.getChaiseMinuteAccess().getGroup_1()); 
            // InternalFromText.g:483:2: ( rule__ChaiseMinute__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFromText.g:483:3: rule__ChaiseMinute__Group_1__0
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
    // InternalFromText.g:491:1: rule__ChaiseMinute__Group__2 : rule__ChaiseMinute__Group__2__Impl ;
    public final void rule__ChaiseMinute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:495:1: ( rule__ChaiseMinute__Group__2__Impl )
            // InternalFromText.g:496:2: rule__ChaiseMinute__Group__2__Impl
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
    // InternalFromText.g:502:1: rule__ChaiseMinute__Group__2__Impl : ( '}' ) ;
    public final void rule__ChaiseMinute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:506:1: ( ( '}' ) )
            // InternalFromText.g:507:1: ( '}' )
            {
            // InternalFromText.g:507:1: ( '}' )
            // InternalFromText.g:508:2: '}'
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
    // InternalFromText.g:518:1: rule__ChaiseMinute__Group_1__0 : rule__ChaiseMinute__Group_1__0__Impl rule__ChaiseMinute__Group_1__1 ;
    public final void rule__ChaiseMinute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:522:1: ( rule__ChaiseMinute__Group_1__0__Impl rule__ChaiseMinute__Group_1__1 )
            // InternalFromText.g:523:2: rule__ChaiseMinute__Group_1__0__Impl rule__ChaiseMinute__Group_1__1
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
    // InternalFromText.g:530:1: rule__ChaiseMinute__Group_1__0__Impl : ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) ) ;
    public final void rule__ChaiseMinute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:534:1: ( ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) ) )
            // InternalFromText.g:535:1: ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) )
            {
            // InternalFromText.g:535:1: ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) )
            // InternalFromText.g:536:2: ( rule__ChaiseMinute__TablesAssignment_1_0 )
            {
             before(grammarAccess.getChaiseMinuteAccess().getTablesAssignment_1_0()); 
            // InternalFromText.g:537:2: ( rule__ChaiseMinute__TablesAssignment_1_0 )
            // InternalFromText.g:537:3: rule__ChaiseMinute__TablesAssignment_1_0
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
    // InternalFromText.g:545:1: rule__ChaiseMinute__Group_1__1 : rule__ChaiseMinute__Group_1__1__Impl ;
    public final void rule__ChaiseMinute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:549:1: ( rule__ChaiseMinute__Group_1__1__Impl )
            // InternalFromText.g:550:2: rule__ChaiseMinute__Group_1__1__Impl
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
    // InternalFromText.g:556:1: rule__ChaiseMinute__Group_1__1__Impl : ( ( rule__ChaiseMinute__Group_1_1__0 )* ) ;
    public final void rule__ChaiseMinute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:560:1: ( ( ( rule__ChaiseMinute__Group_1_1__0 )* ) )
            // InternalFromText.g:561:1: ( ( rule__ChaiseMinute__Group_1_1__0 )* )
            {
            // InternalFromText.g:561:1: ( ( rule__ChaiseMinute__Group_1_1__0 )* )
            // InternalFromText.g:562:2: ( rule__ChaiseMinute__Group_1_1__0 )*
            {
             before(grammarAccess.getChaiseMinuteAccess().getGroup_1_1()); 
            // InternalFromText.g:563:2: ( rule__ChaiseMinute__Group_1_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13||LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFromText.g:563:3: rule__ChaiseMinute__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ChaiseMinute__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getChaiseMinuteAccess().getGroup_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ChaiseMinute__Group_1_1__0"
    // InternalFromText.g:572:1: rule__ChaiseMinute__Group_1_1__0 : rule__ChaiseMinute__Group_1_1__0__Impl rule__ChaiseMinute__Group_1_1__1 ;
    public final void rule__ChaiseMinute__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:576:1: ( rule__ChaiseMinute__Group_1_1__0__Impl rule__ChaiseMinute__Group_1_1__1 )
            // InternalFromText.g:577:2: rule__ChaiseMinute__Group_1_1__0__Impl rule__ChaiseMinute__Group_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__ChaiseMinute__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChaiseMinute__Group_1_1__1();

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
    // $ANTLR end "rule__ChaiseMinute__Group_1_1__0"


    // $ANTLR start "rule__ChaiseMinute__Group_1_1__0__Impl"
    // InternalFromText.g:584:1: rule__ChaiseMinute__Group_1_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__ChaiseMinute__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:588:1: ( ( ( ',' )? ) )
            // InternalFromText.g:589:1: ( ( ',' )? )
            {
            // InternalFromText.g:589:1: ( ( ',' )? )
            // InternalFromText.g:590:2: ( ',' )?
            {
             before(grammarAccess.getChaiseMinuteAccess().getCommaKeyword_1_1_0()); 
            // InternalFromText.g:591:2: ( ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFromText.g:591:3: ','
                    {
                    match(input,15,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getChaiseMinuteAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaiseMinute__Group_1_1__0__Impl"


    // $ANTLR start "rule__ChaiseMinute__Group_1_1__1"
    // InternalFromText.g:599:1: rule__ChaiseMinute__Group_1_1__1 : rule__ChaiseMinute__Group_1_1__1__Impl ;
    public final void rule__ChaiseMinute__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:603:1: ( rule__ChaiseMinute__Group_1_1__1__Impl )
            // InternalFromText.g:604:2: rule__ChaiseMinute__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChaiseMinute__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ChaiseMinute__Group_1_1__1"


    // $ANTLR start "rule__ChaiseMinute__Group_1_1__1__Impl"
    // InternalFromText.g:610:1: rule__ChaiseMinute__Group_1_1__1__Impl : ( ( rule__ChaiseMinute__TablesAssignment_1_1_1 ) ) ;
    public final void rule__ChaiseMinute__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:614:1: ( ( ( rule__ChaiseMinute__TablesAssignment_1_1_1 ) ) )
            // InternalFromText.g:615:1: ( ( rule__ChaiseMinute__TablesAssignment_1_1_1 ) )
            {
            // InternalFromText.g:615:1: ( ( rule__ChaiseMinute__TablesAssignment_1_1_1 ) )
            // InternalFromText.g:616:2: ( rule__ChaiseMinute__TablesAssignment_1_1_1 )
            {
             before(grammarAccess.getChaiseMinuteAccess().getTablesAssignment_1_1_1()); 
            // InternalFromText.g:617:2: ( rule__ChaiseMinute__TablesAssignment_1_1_1 )
            // InternalFromText.g:617:3: rule__ChaiseMinute__TablesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ChaiseMinute__TablesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getChaiseMinuteAccess().getTablesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaiseMinute__Group_1_1__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalFromText.g:626:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:630:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalFromText.g:631:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalFromText.g:638:1: rule__Table__Group__0__Impl : ( '{' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:642:1: ( ( '{' ) )
            // InternalFromText.g:643:1: ( '{' )
            {
            // InternalFromText.g:643:1: ( '{' )
            // InternalFromText.g:644:2: '{'
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
    // InternalFromText.g:653:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:657:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalFromText.g:658:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalFromText.g:665:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:669:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalFromText.g:670:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalFromText.g:670:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalFromText.g:671:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalFromText.g:672:2: ( rule__Table__NameAssignment_1 )
            // InternalFromText.g:672:3: rule__Table__NameAssignment_1
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
    // InternalFromText.g:680:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:684:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalFromText.g:685:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalFromText.g:692:1: rule__Table__Group__2__Impl : ( ',' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:696:1: ( ( ',' ) )
            // InternalFromText.g:697:1: ( ',' )
            {
            // InternalFromText.g:697:1: ( ',' )
            // InternalFromText.g:698:2: ','
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
    // InternalFromText.g:707:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:711:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalFromText.g:712:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalFromText.g:719:1: rule__Table__Group__3__Impl : ( ( rule__Table__IndexColumnAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:723:1: ( ( ( rule__Table__IndexColumnAssignment_3 ) ) )
            // InternalFromText.g:724:1: ( ( rule__Table__IndexColumnAssignment_3 ) )
            {
            // InternalFromText.g:724:1: ( ( rule__Table__IndexColumnAssignment_3 ) )
            // InternalFromText.g:725:2: ( rule__Table__IndexColumnAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getIndexColumnAssignment_3()); 
            // InternalFromText.g:726:2: ( rule__Table__IndexColumnAssignment_3 )
            // InternalFromText.g:726:3: rule__Table__IndexColumnAssignment_3
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
    // InternalFromText.g:734:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:738:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalFromText.g:739:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalFromText.g:746:1: rule__Table__Group__4__Impl : ( ',' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:750:1: ( ( ',' ) )
            // InternalFromText.g:751:1: ( ',' )
            {
            // InternalFromText.g:751:1: ( ',' )
            // InternalFromText.g:752:2: ','
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
    // InternalFromText.g:761:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:765:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalFromText.g:766:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalFromText.g:773:1: rule__Table__Group__5__Impl : ( ( rule__Table__Group_5__0 )? ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:777:1: ( ( ( rule__Table__Group_5__0 )? ) )
            // InternalFromText.g:778:1: ( ( rule__Table__Group_5__0 )? )
            {
            // InternalFromText.g:778:1: ( ( rule__Table__Group_5__0 )? )
            // InternalFromText.g:779:2: ( rule__Table__Group_5__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_5()); 
            // InternalFromText.g:780:2: ( rule__Table__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=20 && LA7_0<=21)||LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFromText.g:780:3: rule__Table__Group_5__0
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
    // InternalFromText.g:788:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:792:1: ( rule__Table__Group__6__Impl )
            // InternalFromText.g:793:2: rule__Table__Group__6__Impl
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
    // InternalFromText.g:799:1: rule__Table__Group__6__Impl : ( '}' ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:803:1: ( ( '}' ) )
            // InternalFromText.g:804:1: ( '}' )
            {
            // InternalFromText.g:804:1: ( '}' )
            // InternalFromText.g:805:2: '}'
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
    // InternalFromText.g:815:1: rule__Table__Group_5__0 : rule__Table__Group_5__0__Impl rule__Table__Group_5__1 ;
    public final void rule__Table__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:819:1: ( rule__Table__Group_5__0__Impl rule__Table__Group_5__1 )
            // InternalFromText.g:820:2: rule__Table__Group_5__0__Impl rule__Table__Group_5__1
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
    // InternalFromText.g:827:1: rule__Table__Group_5__0__Impl : ( ( rule__Table__ColumnsAssignment_5_0 ) ) ;
    public final void rule__Table__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:831:1: ( ( ( rule__Table__ColumnsAssignment_5_0 ) ) )
            // InternalFromText.g:832:1: ( ( rule__Table__ColumnsAssignment_5_0 ) )
            {
            // InternalFromText.g:832:1: ( ( rule__Table__ColumnsAssignment_5_0 ) )
            // InternalFromText.g:833:2: ( rule__Table__ColumnsAssignment_5_0 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_0()); 
            // InternalFromText.g:834:2: ( rule__Table__ColumnsAssignment_5_0 )
            // InternalFromText.g:834:3: rule__Table__ColumnsAssignment_5_0
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
    // InternalFromText.g:842:1: rule__Table__Group_5__1 : rule__Table__Group_5__1__Impl ;
    public final void rule__Table__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:846:1: ( rule__Table__Group_5__1__Impl )
            // InternalFromText.g:847:2: rule__Table__Group_5__1__Impl
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
    // InternalFromText.g:853:1: rule__Table__Group_5__1__Impl : ( ( rule__Table__Group_5_1__0 )* ) ;
    public final void rule__Table__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:857:1: ( ( ( rule__Table__Group_5_1__0 )* ) )
            // InternalFromText.g:858:1: ( ( rule__Table__Group_5_1__0 )* )
            {
            // InternalFromText.g:858:1: ( ( rule__Table__Group_5_1__0 )* )
            // InternalFromText.g:859:2: ( rule__Table__Group_5_1__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_5_1()); 
            // InternalFromText.g:860:2: ( rule__Table__Group_5_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFromText.g:860:3: rule__Table__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Table__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalFromText.g:869:1: rule__Table__Group_5_1__0 : rule__Table__Group_5_1__0__Impl rule__Table__Group_5_1__1 ;
    public final void rule__Table__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:873:1: ( rule__Table__Group_5_1__0__Impl rule__Table__Group_5_1__1 )
            // InternalFromText.g:874:2: rule__Table__Group_5_1__0__Impl rule__Table__Group_5_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalFromText.g:881:1: rule__Table__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:885:1: ( ( ',' ) )
            // InternalFromText.g:886:1: ( ',' )
            {
            // InternalFromText.g:886:1: ( ',' )
            // InternalFromText.g:887:2: ','
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
    // InternalFromText.g:896:1: rule__Table__Group_5_1__1 : rule__Table__Group_5_1__1__Impl ;
    public final void rule__Table__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:900:1: ( rule__Table__Group_5_1__1__Impl )
            // InternalFromText.g:901:2: rule__Table__Group_5_1__1__Impl
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
    // InternalFromText.g:907:1: rule__Table__Group_5_1__1__Impl : ( ( rule__Table__ColumnsAssignment_5_1_1 ) ) ;
    public final void rule__Table__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:911:1: ( ( ( rule__Table__ColumnsAssignment_5_1_1 ) ) )
            // InternalFromText.g:912:1: ( ( rule__Table__ColumnsAssignment_5_1_1 ) )
            {
            // InternalFromText.g:912:1: ( ( rule__Table__ColumnsAssignment_5_1_1 ) )
            // InternalFromText.g:913:2: ( rule__Table__ColumnsAssignment_5_1_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_1_1()); 
            // InternalFromText.g:914:2: ( rule__Table__ColumnsAssignment_5_1_1 )
            // InternalFromText.g:914:3: rule__Table__ColumnsAssignment_5_1_1
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


    // $ANTLR start "rule__IndexColumn__Group__0"
    // InternalFromText.g:923:1: rule__IndexColumn__Group__0 : rule__IndexColumn__Group__0__Impl rule__IndexColumn__Group__1 ;
    public final void rule__IndexColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:927:1: ( rule__IndexColumn__Group__0__Impl rule__IndexColumn__Group__1 )
            // InternalFromText.g:928:2: rule__IndexColumn__Group__0__Impl rule__IndexColumn__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__IndexColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexColumn__Group__1();

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
    // $ANTLR end "rule__IndexColumn__Group__0"


    // $ANTLR start "rule__IndexColumn__Group__0__Impl"
    // InternalFromText.g:935:1: rule__IndexColumn__Group__0__Impl : ( () ) ;
    public final void rule__IndexColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:939:1: ( ( () ) )
            // InternalFromText.g:940:1: ( () )
            {
            // InternalFromText.g:940:1: ( () )
            // InternalFromText.g:941:2: ()
            {
             before(grammarAccess.getIndexColumnAccess().getIndexColumnAction_0()); 
            // InternalFromText.g:942:2: ()
            // InternalFromText.g:942:3: 
            {
            }

             after(grammarAccess.getIndexColumnAccess().getIndexColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexColumn__Group__0__Impl"


    // $ANTLR start "rule__IndexColumn__Group__1"
    // InternalFromText.g:950:1: rule__IndexColumn__Group__1 : rule__IndexColumn__Group__1__Impl rule__IndexColumn__Group__2 ;
    public final void rule__IndexColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:954:1: ( rule__IndexColumn__Group__1__Impl rule__IndexColumn__Group__2 )
            // InternalFromText.g:955:2: rule__IndexColumn__Group__1__Impl rule__IndexColumn__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__IndexColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexColumn__Group__2();

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
    // $ANTLR end "rule__IndexColumn__Group__1"


    // $ANTLR start "rule__IndexColumn__Group__1__Impl"
    // InternalFromText.g:962:1: rule__IndexColumn__Group__1__Impl : ( 'index' ) ;
    public final void rule__IndexColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:966:1: ( ( 'index' ) )
            // InternalFromText.g:967:1: ( 'index' )
            {
            // InternalFromText.g:967:1: ( 'index' )
            // InternalFromText.g:968:2: 'index'
            {
             before(grammarAccess.getIndexColumnAccess().getIndexKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIndexColumnAccess().getIndexKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexColumn__Group__1__Impl"


    // $ANTLR start "rule__IndexColumn__Group__2"
    // InternalFromText.g:977:1: rule__IndexColumn__Group__2 : rule__IndexColumn__Group__2__Impl rule__IndexColumn__Group__3 ;
    public final void rule__IndexColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:981:1: ( rule__IndexColumn__Group__2__Impl rule__IndexColumn__Group__3 )
            // InternalFromText.g:982:2: rule__IndexColumn__Group__2__Impl rule__IndexColumn__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__IndexColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexColumn__Group__3();

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
    // $ANTLR end "rule__IndexColumn__Group__2"


    // $ANTLR start "rule__IndexColumn__Group__2__Impl"
    // InternalFromText.g:989:1: rule__IndexColumn__Group__2__Impl : ( '(' ) ;
    public final void rule__IndexColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:993:1: ( ( '(' ) )
            // InternalFromText.g:994:1: ( '(' )
            {
            // InternalFromText.g:994:1: ( '(' )
            // InternalFromText.g:995:2: '('
            {
             before(grammarAccess.getIndexColumnAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIndexColumnAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexColumn__Group__2__Impl"


    // $ANTLR start "rule__IndexColumn__Group__3"
    // InternalFromText.g:1004:1: rule__IndexColumn__Group__3 : rule__IndexColumn__Group__3__Impl rule__IndexColumn__Group__4 ;
    public final void rule__IndexColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1008:1: ( rule__IndexColumn__Group__3__Impl rule__IndexColumn__Group__4 )
            // InternalFromText.g:1009:2: rule__IndexColumn__Group__3__Impl rule__IndexColumn__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__IndexColumn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexColumn__Group__4();

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
    // $ANTLR end "rule__IndexColumn__Group__3"


    // $ANTLR start "rule__IndexColumn__Group__3__Impl"
    // InternalFromText.g:1016:1: rule__IndexColumn__Group__3__Impl : ( ( rule__IndexColumn__TypeAssignment_3 ) ) ;
    public final void rule__IndexColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1020:1: ( ( ( rule__IndexColumn__TypeAssignment_3 ) ) )
            // InternalFromText.g:1021:1: ( ( rule__IndexColumn__TypeAssignment_3 ) )
            {
            // InternalFromText.g:1021:1: ( ( rule__IndexColumn__TypeAssignment_3 ) )
            // InternalFromText.g:1022:2: ( rule__IndexColumn__TypeAssignment_3 )
            {
             before(grammarAccess.getIndexColumnAccess().getTypeAssignment_3()); 
            // InternalFromText.g:1023:2: ( rule__IndexColumn__TypeAssignment_3 )
            // InternalFromText.g:1023:3: rule__IndexColumn__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IndexColumn__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIndexColumnAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexColumn__Group__3__Impl"


    // $ANTLR start "rule__IndexColumn__Group__4"
    // InternalFromText.g:1031:1: rule__IndexColumn__Group__4 : rule__IndexColumn__Group__4__Impl rule__IndexColumn__Group__5 ;
    public final void rule__IndexColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1035:1: ( rule__IndexColumn__Group__4__Impl rule__IndexColumn__Group__5 )
            // InternalFromText.g:1036:2: rule__IndexColumn__Group__4__Impl rule__IndexColumn__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__IndexColumn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexColumn__Group__5();

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
    // $ANTLR end "rule__IndexColumn__Group__4"


    // $ANTLR start "rule__IndexColumn__Group__4__Impl"
    // InternalFromText.g:1043:1: rule__IndexColumn__Group__4__Impl : ( ')' ) ;
    public final void rule__IndexColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1047:1: ( ( ')' ) )
            // InternalFromText.g:1048:1: ( ')' )
            {
            // InternalFromText.g:1048:1: ( ')' )
            // InternalFromText.g:1049:2: ')'
            {
             before(grammarAccess.getIndexColumnAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIndexColumnAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexColumn__Group__4__Impl"


    // $ANTLR start "rule__IndexColumn__Group__5"
    // InternalFromText.g:1058:1: rule__IndexColumn__Group__5 : rule__IndexColumn__Group__5__Impl rule__IndexColumn__Group__6 ;
    public final void rule__IndexColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1062:1: ( rule__IndexColumn__Group__5__Impl rule__IndexColumn__Group__6 )
            // InternalFromText.g:1063:2: rule__IndexColumn__Group__5__Impl rule__IndexColumn__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__IndexColumn__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexColumn__Group__6();

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
    // $ANTLR end "rule__IndexColumn__Group__5"


    // $ANTLR start "rule__IndexColumn__Group__5__Impl"
    // InternalFromText.g:1070:1: rule__IndexColumn__Group__5__Impl : ( ':' ) ;
    public final void rule__IndexColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1074:1: ( ( ':' ) )
            // InternalFromText.g:1075:1: ( ':' )
            {
            // InternalFromText.g:1075:1: ( ':' )
            // InternalFromText.g:1076:2: ':'
            {
             before(grammarAccess.getIndexColumnAccess().getColonKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIndexColumnAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexColumn__Group__5__Impl"


    // $ANTLR start "rule__IndexColumn__Group__6"
    // InternalFromText.g:1085:1: rule__IndexColumn__Group__6 : rule__IndexColumn__Group__6__Impl ;
    public final void rule__IndexColumn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1089:1: ( rule__IndexColumn__Group__6__Impl )
            // InternalFromText.g:1090:2: rule__IndexColumn__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexColumn__Group__6__Impl();

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
    // $ANTLR end "rule__IndexColumn__Group__6"


    // $ANTLR start "rule__IndexColumn__Group__6__Impl"
    // InternalFromText.g:1096:1: rule__IndexColumn__Group__6__Impl : ( ( rule__IndexColumn__IdAssignment_6 ) ) ;
    public final void rule__IndexColumn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1100:1: ( ( ( rule__IndexColumn__IdAssignment_6 ) ) )
            // InternalFromText.g:1101:1: ( ( rule__IndexColumn__IdAssignment_6 ) )
            {
            // InternalFromText.g:1101:1: ( ( rule__IndexColumn__IdAssignment_6 ) )
            // InternalFromText.g:1102:2: ( rule__IndexColumn__IdAssignment_6 )
            {
             before(grammarAccess.getIndexColumnAccess().getIdAssignment_6()); 
            // InternalFromText.g:1103:2: ( rule__IndexColumn__IdAssignment_6 )
            // InternalFromText.g:1103:3: rule__IndexColumn__IdAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__IndexColumn__IdAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIndexColumnAccess().getIdAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexColumn__Group__6__Impl"


    // $ANTLR start "rule__ColumnData__Group__0"
    // InternalFromText.g:1112:1: rule__ColumnData__Group__0 : rule__ColumnData__Group__0__Impl rule__ColumnData__Group__1 ;
    public final void rule__ColumnData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1116:1: ( rule__ColumnData__Group__0__Impl rule__ColumnData__Group__1 )
            // InternalFromText.g:1117:2: rule__ColumnData__Group__0__Impl rule__ColumnData__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalFromText.g:1124:1: rule__ColumnData__Group__0__Impl : ( 'data' ) ;
    public final void rule__ColumnData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1128:1: ( ( 'data' ) )
            // InternalFromText.g:1129:1: ( 'data' )
            {
            // InternalFromText.g:1129:1: ( 'data' )
            // InternalFromText.g:1130:2: 'data'
            {
             before(grammarAccess.getColumnDataAccess().getDataKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalFromText.g:1139:1: rule__ColumnData__Group__1 : rule__ColumnData__Group__1__Impl rule__ColumnData__Group__2 ;
    public final void rule__ColumnData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1143:1: ( rule__ColumnData__Group__1__Impl rule__ColumnData__Group__2 )
            // InternalFromText.g:1144:2: rule__ColumnData__Group__1__Impl rule__ColumnData__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalFromText.g:1151:1: rule__ColumnData__Group__1__Impl : ( '(' ) ;
    public final void rule__ColumnData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1155:1: ( ( '(' ) )
            // InternalFromText.g:1156:1: ( '(' )
            {
            // InternalFromText.g:1156:1: ( '(' )
            // InternalFromText.g:1157:2: '('
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
    // InternalFromText.g:1166:1: rule__ColumnData__Group__2 : rule__ColumnData__Group__2__Impl rule__ColumnData__Group__3 ;
    public final void rule__ColumnData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1170:1: ( rule__ColumnData__Group__2__Impl rule__ColumnData__Group__3 )
            // InternalFromText.g:1171:2: rule__ColumnData__Group__2__Impl rule__ColumnData__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalFromText.g:1178:1: rule__ColumnData__Group__2__Impl : ( ( rule__ColumnData__TypeAssignment_2 ) ) ;
    public final void rule__ColumnData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1182:1: ( ( ( rule__ColumnData__TypeAssignment_2 ) ) )
            // InternalFromText.g:1183:1: ( ( rule__ColumnData__TypeAssignment_2 ) )
            {
            // InternalFromText.g:1183:1: ( ( rule__ColumnData__TypeAssignment_2 ) )
            // InternalFromText.g:1184:2: ( rule__ColumnData__TypeAssignment_2 )
            {
             before(grammarAccess.getColumnDataAccess().getTypeAssignment_2()); 
            // InternalFromText.g:1185:2: ( rule__ColumnData__TypeAssignment_2 )
            // InternalFromText.g:1185:3: rule__ColumnData__TypeAssignment_2
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
    // InternalFromText.g:1193:1: rule__ColumnData__Group__3 : rule__ColumnData__Group__3__Impl rule__ColumnData__Group__4 ;
    public final void rule__ColumnData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1197:1: ( rule__ColumnData__Group__3__Impl rule__ColumnData__Group__4 )
            // InternalFromText.g:1198:2: rule__ColumnData__Group__3__Impl rule__ColumnData__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalFromText.g:1205:1: rule__ColumnData__Group__3__Impl : ( ')' ) ;
    public final void rule__ColumnData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1209:1: ( ( ')' ) )
            // InternalFromText.g:1210:1: ( ')' )
            {
            // InternalFromText.g:1210:1: ( ')' )
            // InternalFromText.g:1211:2: ')'
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
    // InternalFromText.g:1220:1: rule__ColumnData__Group__4 : rule__ColumnData__Group__4__Impl rule__ColumnData__Group__5 ;
    public final void rule__ColumnData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1224:1: ( rule__ColumnData__Group__4__Impl rule__ColumnData__Group__5 )
            // InternalFromText.g:1225:2: rule__ColumnData__Group__4__Impl rule__ColumnData__Group__5
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
    // InternalFromText.g:1232:1: rule__ColumnData__Group__4__Impl : ( ':' ) ;
    public final void rule__ColumnData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1236:1: ( ( ':' ) )
            // InternalFromText.g:1237:1: ( ':' )
            {
            // InternalFromText.g:1237:1: ( ':' )
            // InternalFromText.g:1238:2: ':'
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
    // InternalFromText.g:1247:1: rule__ColumnData__Group__5 : rule__ColumnData__Group__5__Impl ;
    public final void rule__ColumnData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1251:1: ( rule__ColumnData__Group__5__Impl )
            // InternalFromText.g:1252:2: rule__ColumnData__Group__5__Impl
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
    // InternalFromText.g:1258:1: rule__ColumnData__Group__5__Impl : ( ( rule__ColumnData__IdAssignment_5 ) ) ;
    public final void rule__ColumnData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1262:1: ( ( ( rule__ColumnData__IdAssignment_5 ) ) )
            // InternalFromText.g:1263:1: ( ( rule__ColumnData__IdAssignment_5 ) )
            {
            // InternalFromText.g:1263:1: ( ( rule__ColumnData__IdAssignment_5 ) )
            // InternalFromText.g:1264:2: ( rule__ColumnData__IdAssignment_5 )
            {
             before(grammarAccess.getColumnDataAccess().getIdAssignment_5()); 
            // InternalFromText.g:1265:2: ( rule__ColumnData__IdAssignment_5 )
            // InternalFromText.g:1265:3: rule__ColumnData__IdAssignment_5
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
    // InternalFromText.g:1274:1: rule__ImportedColumn__Group__0 : rule__ImportedColumn__Group__0__Impl rule__ImportedColumn__Group__1 ;
    public final void rule__ImportedColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1278:1: ( rule__ImportedColumn__Group__0__Impl rule__ImportedColumn__Group__1 )
            // InternalFromText.g:1279:2: rule__ImportedColumn__Group__0__Impl rule__ImportedColumn__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalFromText.g:1286:1: rule__ImportedColumn__Group__0__Impl : ( 'imported' ) ;
    public final void rule__ImportedColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1290:1: ( ( 'imported' ) )
            // InternalFromText.g:1291:1: ( 'imported' )
            {
            // InternalFromText.g:1291:1: ( 'imported' )
            // InternalFromText.g:1292:2: 'imported'
            {
             before(grammarAccess.getImportedColumnAccess().getImportedKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalFromText.g:1301:1: rule__ImportedColumn__Group__1 : rule__ImportedColumn__Group__1__Impl rule__ImportedColumn__Group__2 ;
    public final void rule__ImportedColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1305:1: ( rule__ImportedColumn__Group__1__Impl rule__ImportedColumn__Group__2 )
            // InternalFromText.g:1306:2: rule__ImportedColumn__Group__1__Impl rule__ImportedColumn__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalFromText.g:1313:1: rule__ImportedColumn__Group__1__Impl : ( '(' ) ;
    public final void rule__ImportedColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1317:1: ( ( '(' ) )
            // InternalFromText.g:1318:1: ( '(' )
            {
            // InternalFromText.g:1318:1: ( '(' )
            // InternalFromText.g:1319:2: '('
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
    // InternalFromText.g:1328:1: rule__ImportedColumn__Group__2 : rule__ImportedColumn__Group__2__Impl rule__ImportedColumn__Group__3 ;
    public final void rule__ImportedColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1332:1: ( rule__ImportedColumn__Group__2__Impl rule__ImportedColumn__Group__3 )
            // InternalFromText.g:1333:2: rule__ImportedColumn__Group__2__Impl rule__ImportedColumn__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalFromText.g:1340:1: rule__ImportedColumn__Group__2__Impl : ( ( rule__ImportedColumn__TypeAssignment_2 ) ) ;
    public final void rule__ImportedColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1344:1: ( ( ( rule__ImportedColumn__TypeAssignment_2 ) ) )
            // InternalFromText.g:1345:1: ( ( rule__ImportedColumn__TypeAssignment_2 ) )
            {
            // InternalFromText.g:1345:1: ( ( rule__ImportedColumn__TypeAssignment_2 ) )
            // InternalFromText.g:1346:2: ( rule__ImportedColumn__TypeAssignment_2 )
            {
             before(grammarAccess.getImportedColumnAccess().getTypeAssignment_2()); 
            // InternalFromText.g:1347:2: ( rule__ImportedColumn__TypeAssignment_2 )
            // InternalFromText.g:1347:3: rule__ImportedColumn__TypeAssignment_2
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
    // InternalFromText.g:1355:1: rule__ImportedColumn__Group__3 : rule__ImportedColumn__Group__3__Impl rule__ImportedColumn__Group__4 ;
    public final void rule__ImportedColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1359:1: ( rule__ImportedColumn__Group__3__Impl rule__ImportedColumn__Group__4 )
            // InternalFromText.g:1360:2: rule__ImportedColumn__Group__3__Impl rule__ImportedColumn__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalFromText.g:1367:1: rule__ImportedColumn__Group__3__Impl : ( ')' ) ;
    public final void rule__ImportedColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1371:1: ( ( ')' ) )
            // InternalFromText.g:1372:1: ( ')' )
            {
            // InternalFromText.g:1372:1: ( ')' )
            // InternalFromText.g:1373:2: ')'
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
    // InternalFromText.g:1382:1: rule__ImportedColumn__Group__4 : rule__ImportedColumn__Group__4__Impl rule__ImportedColumn__Group__5 ;
    public final void rule__ImportedColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1386:1: ( rule__ImportedColumn__Group__4__Impl rule__ImportedColumn__Group__5 )
            // InternalFromText.g:1387:2: rule__ImportedColumn__Group__4__Impl rule__ImportedColumn__Group__5
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
    // InternalFromText.g:1394:1: rule__ImportedColumn__Group__4__Impl : ( ':' ) ;
    public final void rule__ImportedColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1398:1: ( ( ':' ) )
            // InternalFromText.g:1399:1: ( ':' )
            {
            // InternalFromText.g:1399:1: ( ':' )
            // InternalFromText.g:1400:2: ':'
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
    // InternalFromText.g:1409:1: rule__ImportedColumn__Group__5 : rule__ImportedColumn__Group__5__Impl rule__ImportedColumn__Group__6 ;
    public final void rule__ImportedColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1413:1: ( rule__ImportedColumn__Group__5__Impl rule__ImportedColumn__Group__6 )
            // InternalFromText.g:1414:2: rule__ImportedColumn__Group__5__Impl rule__ImportedColumn__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalFromText.g:1421:1: rule__ImportedColumn__Group__5__Impl : ( ( rule__ImportedColumn__PathAssignment_5 ) ) ;
    public final void rule__ImportedColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1425:1: ( ( ( rule__ImportedColumn__PathAssignment_5 ) ) )
            // InternalFromText.g:1426:1: ( ( rule__ImportedColumn__PathAssignment_5 ) )
            {
            // InternalFromText.g:1426:1: ( ( rule__ImportedColumn__PathAssignment_5 ) )
            // InternalFromText.g:1427:2: ( rule__ImportedColumn__PathAssignment_5 )
            {
             before(grammarAccess.getImportedColumnAccess().getPathAssignment_5()); 
            // InternalFromText.g:1428:2: ( rule__ImportedColumn__PathAssignment_5 )
            // InternalFromText.g:1428:3: rule__ImportedColumn__PathAssignment_5
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
    // InternalFromText.g:1436:1: rule__ImportedColumn__Group__6 : rule__ImportedColumn__Group__6__Impl rule__ImportedColumn__Group__7 ;
    public final void rule__ImportedColumn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1440:1: ( rule__ImportedColumn__Group__6__Impl rule__ImportedColumn__Group__7 )
            // InternalFromText.g:1441:2: rule__ImportedColumn__Group__6__Impl rule__ImportedColumn__Group__7
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
    // InternalFromText.g:1448:1: rule__ImportedColumn__Group__6__Impl : ( '->' ) ;
    public final void rule__ImportedColumn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1452:1: ( ( '->' ) )
            // InternalFromText.g:1453:1: ( '->' )
            {
            // InternalFromText.g:1453:1: ( '->' )
            // InternalFromText.g:1454:2: '->'
            {
             before(grammarAccess.getImportedColumnAccess().getHyphenMinusGreaterThanSignKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalFromText.g:1463:1: rule__ImportedColumn__Group__7 : rule__ImportedColumn__Group__7__Impl ;
    public final void rule__ImportedColumn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1467:1: ( rule__ImportedColumn__Group__7__Impl )
            // InternalFromText.g:1468:2: rule__ImportedColumn__Group__7__Impl
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
    // InternalFromText.g:1474:1: rule__ImportedColumn__Group__7__Impl : ( ( rule__ImportedColumn__IdAssignment_7 ) ) ;
    public final void rule__ImportedColumn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1478:1: ( ( ( rule__ImportedColumn__IdAssignment_7 ) ) )
            // InternalFromText.g:1479:1: ( ( rule__ImportedColumn__IdAssignment_7 ) )
            {
            // InternalFromText.g:1479:1: ( ( rule__ImportedColumn__IdAssignment_7 ) )
            // InternalFromText.g:1480:2: ( rule__ImportedColumn__IdAssignment_7 )
            {
             before(grammarAccess.getImportedColumnAccess().getIdAssignment_7()); 
            // InternalFromText.g:1481:2: ( rule__ImportedColumn__IdAssignment_7 )
            // InternalFromText.g:1481:3: rule__ImportedColumn__IdAssignment_7
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
    // InternalFromText.g:1490:1: rule__ComputedColumn__Group__0 : rule__ComputedColumn__Group__0__Impl rule__ComputedColumn__Group__1 ;
    public final void rule__ComputedColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1494:1: ( rule__ComputedColumn__Group__0__Impl rule__ComputedColumn__Group__1 )
            // InternalFromText.g:1495:2: rule__ComputedColumn__Group__0__Impl rule__ComputedColumn__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalFromText.g:1502:1: rule__ComputedColumn__Group__0__Impl : ( 'computed' ) ;
    public final void rule__ComputedColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1506:1: ( ( 'computed' ) )
            // InternalFromText.g:1507:1: ( 'computed' )
            {
            // InternalFromText.g:1507:1: ( 'computed' )
            // InternalFromText.g:1508:2: 'computed'
            {
             before(grammarAccess.getComputedColumnAccess().getComputedKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalFromText.g:1517:1: rule__ComputedColumn__Group__1 : rule__ComputedColumn__Group__1__Impl rule__ComputedColumn__Group__2 ;
    public final void rule__ComputedColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1521:1: ( rule__ComputedColumn__Group__1__Impl rule__ComputedColumn__Group__2 )
            // InternalFromText.g:1522:2: rule__ComputedColumn__Group__1__Impl rule__ComputedColumn__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalFromText.g:1529:1: rule__ComputedColumn__Group__1__Impl : ( '(' ) ;
    public final void rule__ComputedColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1533:1: ( ( '(' ) )
            // InternalFromText.g:1534:1: ( '(' )
            {
            // InternalFromText.g:1534:1: ( '(' )
            // InternalFromText.g:1535:2: '('
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
    // InternalFromText.g:1544:1: rule__ComputedColumn__Group__2 : rule__ComputedColumn__Group__2__Impl rule__ComputedColumn__Group__3 ;
    public final void rule__ComputedColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1548:1: ( rule__ComputedColumn__Group__2__Impl rule__ComputedColumn__Group__3 )
            // InternalFromText.g:1549:2: rule__ComputedColumn__Group__2__Impl rule__ComputedColumn__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalFromText.g:1556:1: rule__ComputedColumn__Group__2__Impl : ( ( rule__ComputedColumn__TypeAssignment_2 ) ) ;
    public final void rule__ComputedColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1560:1: ( ( ( rule__ComputedColumn__TypeAssignment_2 ) ) )
            // InternalFromText.g:1561:1: ( ( rule__ComputedColumn__TypeAssignment_2 ) )
            {
            // InternalFromText.g:1561:1: ( ( rule__ComputedColumn__TypeAssignment_2 ) )
            // InternalFromText.g:1562:2: ( rule__ComputedColumn__TypeAssignment_2 )
            {
             before(grammarAccess.getComputedColumnAccess().getTypeAssignment_2()); 
            // InternalFromText.g:1563:2: ( rule__ComputedColumn__TypeAssignment_2 )
            // InternalFromText.g:1563:3: rule__ComputedColumn__TypeAssignment_2
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
    // InternalFromText.g:1571:1: rule__ComputedColumn__Group__3 : rule__ComputedColumn__Group__3__Impl rule__ComputedColumn__Group__4 ;
    public final void rule__ComputedColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1575:1: ( rule__ComputedColumn__Group__3__Impl rule__ComputedColumn__Group__4 )
            // InternalFromText.g:1576:2: rule__ComputedColumn__Group__3__Impl rule__ComputedColumn__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalFromText.g:1583:1: rule__ComputedColumn__Group__3__Impl : ( ')' ) ;
    public final void rule__ComputedColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1587:1: ( ( ')' ) )
            // InternalFromText.g:1588:1: ( ')' )
            {
            // InternalFromText.g:1588:1: ( ')' )
            // InternalFromText.g:1589:2: ')'
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
    // InternalFromText.g:1598:1: rule__ComputedColumn__Group__4 : rule__ComputedColumn__Group__4__Impl rule__ComputedColumn__Group__5 ;
    public final void rule__ComputedColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1602:1: ( rule__ComputedColumn__Group__4__Impl rule__ComputedColumn__Group__5 )
            // InternalFromText.g:1603:2: rule__ComputedColumn__Group__4__Impl rule__ComputedColumn__Group__5
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
    // InternalFromText.g:1610:1: rule__ComputedColumn__Group__4__Impl : ( ':' ) ;
    public final void rule__ComputedColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1614:1: ( ( ':' ) )
            // InternalFromText.g:1615:1: ( ':' )
            {
            // InternalFromText.g:1615:1: ( ':' )
            // InternalFromText.g:1616:2: ':'
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
    // InternalFromText.g:1625:1: rule__ComputedColumn__Group__5 : rule__ComputedColumn__Group__5__Impl rule__ComputedColumn__Group__6 ;
    public final void rule__ComputedColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1629:1: ( rule__ComputedColumn__Group__5__Impl rule__ComputedColumn__Group__6 )
            // InternalFromText.g:1630:2: rule__ComputedColumn__Group__5__Impl rule__ComputedColumn__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalFromText.g:1637:1: rule__ComputedColumn__Group__5__Impl : ( ( rule__ComputedColumn__AlgorithmAssignment_5 ) ) ;
    public final void rule__ComputedColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1641:1: ( ( ( rule__ComputedColumn__AlgorithmAssignment_5 ) ) )
            // InternalFromText.g:1642:1: ( ( rule__ComputedColumn__AlgorithmAssignment_5 ) )
            {
            // InternalFromText.g:1642:1: ( ( rule__ComputedColumn__AlgorithmAssignment_5 ) )
            // InternalFromText.g:1643:2: ( rule__ComputedColumn__AlgorithmAssignment_5 )
            {
             before(grammarAccess.getComputedColumnAccess().getAlgorithmAssignment_5()); 
            // InternalFromText.g:1644:2: ( rule__ComputedColumn__AlgorithmAssignment_5 )
            // InternalFromText.g:1644:3: rule__ComputedColumn__AlgorithmAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ComputedColumn__AlgorithmAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComputedColumnAccess().getAlgorithmAssignment_5()); 

            }


            }

        }
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
    // InternalFromText.g:1652:1: rule__ComputedColumn__Group__6 : rule__ComputedColumn__Group__6__Impl rule__ComputedColumn__Group__7 ;
    public final void rule__ComputedColumn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1656:1: ( rule__ComputedColumn__Group__6__Impl rule__ComputedColumn__Group__7 )
            // InternalFromText.g:1657:2: rule__ComputedColumn__Group__6__Impl rule__ComputedColumn__Group__7
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
    // InternalFromText.g:1664:1: rule__ComputedColumn__Group__6__Impl : ( '->' ) ;
    public final void rule__ComputedColumn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1668:1: ( ( '->' ) )
            // InternalFromText.g:1669:1: ( '->' )
            {
            // InternalFromText.g:1669:1: ( '->' )
            // InternalFromText.g:1670:2: '->'
            {
             before(grammarAccess.getComputedColumnAccess().getHyphenMinusGreaterThanSignKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalFromText.g:1679:1: rule__ComputedColumn__Group__7 : rule__ComputedColumn__Group__7__Impl ;
    public final void rule__ComputedColumn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1683:1: ( rule__ComputedColumn__Group__7__Impl )
            // InternalFromText.g:1684:2: rule__ComputedColumn__Group__7__Impl
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
    // InternalFromText.g:1690:1: rule__ComputedColumn__Group__7__Impl : ( ( rule__ComputedColumn__IdAssignment_7 ) ) ;
    public final void rule__ComputedColumn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1694:1: ( ( ( rule__ComputedColumn__IdAssignment_7 ) ) )
            // InternalFromText.g:1695:1: ( ( rule__ComputedColumn__IdAssignment_7 ) )
            {
            // InternalFromText.g:1695:1: ( ( rule__ComputedColumn__IdAssignment_7 ) )
            // InternalFromText.g:1696:2: ( rule__ComputedColumn__IdAssignment_7 )
            {
             before(grammarAccess.getComputedColumnAccess().getIdAssignment_7()); 
            // InternalFromText.g:1697:2: ( rule__ComputedColumn__IdAssignment_7 )
            // InternalFromText.g:1697:3: rule__ComputedColumn__IdAssignment_7
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
    // InternalFromText.g:1706:1: rule__ColumnArgument__Group__0 : rule__ColumnArgument__Group__0__Impl rule__ColumnArgument__Group__1 ;
    public final void rule__ColumnArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1710:1: ( rule__ColumnArgument__Group__0__Impl rule__ColumnArgument__Group__1 )
            // InternalFromText.g:1711:2: rule__ColumnArgument__Group__0__Impl rule__ColumnArgument__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFromText.g:1718:1: rule__ColumnArgument__Group__0__Impl : ( () ) ;
    public final void rule__ColumnArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1722:1: ( ( () ) )
            // InternalFromText.g:1723:1: ( () )
            {
            // InternalFromText.g:1723:1: ( () )
            // InternalFromText.g:1724:2: ()
            {
             before(grammarAccess.getColumnArgumentAccess().getColumnArgumentAction_0()); 
            // InternalFromText.g:1725:2: ()
            // InternalFromText.g:1725:3: 
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
    // InternalFromText.g:1733:1: rule__ColumnArgument__Group__1 : rule__ColumnArgument__Group__1__Impl ;
    public final void rule__ColumnArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1737:1: ( rule__ColumnArgument__Group__1__Impl )
            // InternalFromText.g:1738:2: rule__ColumnArgument__Group__1__Impl
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
    // InternalFromText.g:1744:1: rule__ColumnArgument__Group__1__Impl : ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) ) ;
    public final void rule__ColumnArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1748:1: ( ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) ) )
            // InternalFromText.g:1749:1: ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) )
            {
            // InternalFromText.g:1749:1: ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) )
            // InternalFromText.g:1750:2: ( rule__ColumnArgument__ColumnPathAssignment_1 )
            {
             before(grammarAccess.getColumnArgumentAccess().getColumnPathAssignment_1()); 
            // InternalFromText.g:1751:2: ( rule__ColumnArgument__ColumnPathAssignment_1 )
            // InternalFromText.g:1751:3: rule__ColumnArgument__ColumnPathAssignment_1
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
    // InternalFromText.g:1760:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1764:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalFromText.g:1765:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalFromText.g:1772:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1776:1: ( ( () ) )
            // InternalFromText.g:1777:1: ( () )
            {
            // InternalFromText.g:1777:1: ( () )
            // InternalFromText.g:1778:2: ()
            {
             before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            // InternalFromText.g:1779:2: ()
            // InternalFromText.g:1779:3: 
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
    // InternalFromText.g:1787:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1791:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalFromText.g:1792:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalFromText.g:1799:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1803:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalFromText.g:1804:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalFromText.g:1804:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalFromText.g:1805:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalFromText.g:1806:2: ( rule__Function__NameAssignment_1 )
            // InternalFromText.g:1806:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalFromText.g:1814:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1818:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalFromText.g:1819:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalFromText.g:1826:1: rule__Function__Group__2__Impl : ( '(' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1830:1: ( ( '(' ) )
            // InternalFromText.g:1831:1: ( '(' )
            {
            // InternalFromText.g:1831:1: ( '(' )
            // InternalFromText.g:1832:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // InternalFromText.g:1841:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1845:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalFromText.g:1846:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalFromText.g:1853:1: rule__Function__Group__3__Impl : ( ( rule__Function__Group_3__0 )? ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1857:1: ( ( ( rule__Function__Group_3__0 )? ) )
            // InternalFromText.g:1858:1: ( ( rule__Function__Group_3__0 )? )
            {
            // InternalFromText.g:1858:1: ( ( rule__Function__Group_3__0 )? )
            // InternalFromText.g:1859:2: ( rule__Function__Group_3__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_3()); 
            // InternalFromText.g:1860:2: ( rule__Function__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFromText.g:1860:3: rule__Function__Group_3__0
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
    // InternalFromText.g:1868:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1872:1: ( rule__Function__Group__4__Impl )
            // InternalFromText.g:1873:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__4__Impl();

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
    // InternalFromText.g:1879:1: rule__Function__Group__4__Impl : ( ')' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1883:1: ( ( ')' ) )
            // InternalFromText.g:1884:1: ( ')' )
            {
            // InternalFromText.g:1884:1: ( ')' )
            // InternalFromText.g:1885:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Function__Group_3__0"
    // InternalFromText.g:1895:1: rule__Function__Group_3__0 : rule__Function__Group_3__0__Impl rule__Function__Group_3__1 ;
    public final void rule__Function__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1899:1: ( rule__Function__Group_3__0__Impl rule__Function__Group_3__1 )
            // InternalFromText.g:1900:2: rule__Function__Group_3__0__Impl rule__Function__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalFromText.g:1907:1: rule__Function__Group_3__0__Impl : ( ( rule__Function__InputsAssignment_3_0 ) ) ;
    public final void rule__Function__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1911:1: ( ( ( rule__Function__InputsAssignment_3_0 ) ) )
            // InternalFromText.g:1912:1: ( ( rule__Function__InputsAssignment_3_0 ) )
            {
            // InternalFromText.g:1912:1: ( ( rule__Function__InputsAssignment_3_0 ) )
            // InternalFromText.g:1913:2: ( rule__Function__InputsAssignment_3_0 )
            {
             before(grammarAccess.getFunctionAccess().getInputsAssignment_3_0()); 
            // InternalFromText.g:1914:2: ( rule__Function__InputsAssignment_3_0 )
            // InternalFromText.g:1914:3: rule__Function__InputsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Function__InputsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getInputsAssignment_3_0()); 

            }


            }

        }
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
    // InternalFromText.g:1922:1: rule__Function__Group_3__1 : rule__Function__Group_3__1__Impl ;
    public final void rule__Function__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1926:1: ( rule__Function__Group_3__1__Impl )
            // InternalFromText.g:1927:2: rule__Function__Group_3__1__Impl
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
    // InternalFromText.g:1933:1: rule__Function__Group_3__1__Impl : ( ( rule__Function__Group_3_1__0 )* ) ;
    public final void rule__Function__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1937:1: ( ( ( rule__Function__Group_3_1__0 )* ) )
            // InternalFromText.g:1938:1: ( ( rule__Function__Group_3_1__0 )* )
            {
            // InternalFromText.g:1938:1: ( ( rule__Function__Group_3_1__0 )* )
            // InternalFromText.g:1939:2: ( rule__Function__Group_3_1__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_3_1()); 
            // InternalFromText.g:1940:2: ( rule__Function__Group_3_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFromText.g:1940:3: rule__Function__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Function__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Function__Group_3_1__0"
    // InternalFromText.g:1949:1: rule__Function__Group_3_1__0 : rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1 ;
    public final void rule__Function__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1953:1: ( rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1 )
            // InternalFromText.g:1954:2: rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Function__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_3_1__1();

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
    // $ANTLR end "rule__Function__Group_3_1__0"


    // $ANTLR start "rule__Function__Group_3_1__0__Impl"
    // InternalFromText.g:1961:1: rule__Function__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1965:1: ( ( ',' ) )
            // InternalFromText.g:1966:1: ( ',' )
            {
            // InternalFromText.g:1966:1: ( ',' )
            // InternalFromText.g:1967:2: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1__0__Impl"


    // $ANTLR start "rule__Function__Group_3_1__1"
    // InternalFromText.g:1976:1: rule__Function__Group_3_1__1 : rule__Function__Group_3_1__1__Impl ;
    public final void rule__Function__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1980:1: ( rule__Function__Group_3_1__1__Impl )
            // InternalFromText.g:1981:2: rule__Function__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Function__Group_3_1__1"


    // $ANTLR start "rule__Function__Group_3_1__1__Impl"
    // InternalFromText.g:1987:1: rule__Function__Group_3_1__1__Impl : ( ( rule__Function__InputsAssignment_3_1_1 ) ) ;
    public final void rule__Function__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1991:1: ( ( ( rule__Function__InputsAssignment_3_1_1 ) ) )
            // InternalFromText.g:1992:1: ( ( rule__Function__InputsAssignment_3_1_1 ) )
            {
            // InternalFromText.g:1992:1: ( ( rule__Function__InputsAssignment_3_1_1 ) )
            // InternalFromText.g:1993:2: ( rule__Function__InputsAssignment_3_1_1 )
            {
             before(grammarAccess.getFunctionAccess().getInputsAssignment_3_1_1()); 
            // InternalFromText.g:1994:2: ( rule__Function__InputsAssignment_3_1_1 )
            // InternalFromText.g:1994:3: rule__Function__InputsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__InputsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getInputsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1__1__Impl"


    // $ANTLR start "rule__Algorithm__Group__0"
    // InternalFromText.g:2003:1: rule__Algorithm__Group__0 : rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 ;
    public final void rule__Algorithm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2007:1: ( rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 )
            // InternalFromText.g:2008:2: rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Algorithm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__1();

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
    // $ANTLR end "rule__Algorithm__Group__0"


    // $ANTLR start "rule__Algorithm__Group__0__Impl"
    // InternalFromText.g:2015:1: rule__Algorithm__Group__0__Impl : ( () ) ;
    public final void rule__Algorithm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2019:1: ( ( () ) )
            // InternalFromText.g:2020:1: ( () )
            {
            // InternalFromText.g:2020:1: ( () )
            // InternalFromText.g:2021:2: ()
            {
             before(grammarAccess.getAlgorithmAccess().getAlgorithmAction_0()); 
            // InternalFromText.g:2022:2: ()
            // InternalFromText.g:2022:3: 
            {
            }

             after(grammarAccess.getAlgorithmAccess().getAlgorithmAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__0__Impl"


    // $ANTLR start "rule__Algorithm__Group__1"
    // InternalFromText.g:2030:1: rule__Algorithm__Group__1 : rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2 ;
    public final void rule__Algorithm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2034:1: ( rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2 )
            // InternalFromText.g:2035:2: rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Algorithm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__2();

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
    // $ANTLR end "rule__Algorithm__Group__1"


    // $ANTLR start "rule__Algorithm__Group__1__Impl"
    // InternalFromText.g:2042:1: rule__Algorithm__Group__1__Impl : ( ( rule__Algorithm__FunctionsAssignment_1 ) ) ;
    public final void rule__Algorithm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2046:1: ( ( ( rule__Algorithm__FunctionsAssignment_1 ) ) )
            // InternalFromText.g:2047:1: ( ( rule__Algorithm__FunctionsAssignment_1 ) )
            {
            // InternalFromText.g:2047:1: ( ( rule__Algorithm__FunctionsAssignment_1 ) )
            // InternalFromText.g:2048:2: ( rule__Algorithm__FunctionsAssignment_1 )
            {
             before(grammarAccess.getAlgorithmAccess().getFunctionsAssignment_1()); 
            // InternalFromText.g:2049:2: ( rule__Algorithm__FunctionsAssignment_1 )
            // InternalFromText.g:2049:3: rule__Algorithm__FunctionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__FunctionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getFunctionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__1__Impl"


    // $ANTLR start "rule__Algorithm__Group__2"
    // InternalFromText.g:2057:1: rule__Algorithm__Group__2 : rule__Algorithm__Group__2__Impl ;
    public final void rule__Algorithm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2061:1: ( rule__Algorithm__Group__2__Impl )
            // InternalFromText.g:2062:2: rule__Algorithm__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__2__Impl();

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
    // $ANTLR end "rule__Algorithm__Group__2"


    // $ANTLR start "rule__Algorithm__Group__2__Impl"
    // InternalFromText.g:2068:1: rule__Algorithm__Group__2__Impl : ( ( rule__Algorithm__Group_2__0 )? ) ;
    public final void rule__Algorithm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2072:1: ( ( ( rule__Algorithm__Group_2__0 )? ) )
            // InternalFromText.g:2073:1: ( ( rule__Algorithm__Group_2__0 )? )
            {
            // InternalFromText.g:2073:1: ( ( rule__Algorithm__Group_2__0 )? )
            // InternalFromText.g:2074:2: ( rule__Algorithm__Group_2__0 )?
            {
             before(grammarAccess.getAlgorithmAccess().getGroup_2()); 
            // InternalFromText.g:2075:2: ( rule__Algorithm__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFromText.g:2075:3: rule__Algorithm__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Algorithm__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlgorithmAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__2__Impl"


    // $ANTLR start "rule__Algorithm__Group_2__0"
    // InternalFromText.g:2084:1: rule__Algorithm__Group_2__0 : rule__Algorithm__Group_2__0__Impl rule__Algorithm__Group_2__1 ;
    public final void rule__Algorithm__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2088:1: ( rule__Algorithm__Group_2__0__Impl rule__Algorithm__Group_2__1 )
            // InternalFromText.g:2089:2: rule__Algorithm__Group_2__0__Impl rule__Algorithm__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Algorithm__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_2__1();

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
    // $ANTLR end "rule__Algorithm__Group_2__0"


    // $ANTLR start "rule__Algorithm__Group_2__0__Impl"
    // InternalFromText.g:2096:1: rule__Algorithm__Group_2__0__Impl : ( '>' ) ;
    public final void rule__Algorithm__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2100:1: ( ( '>' ) )
            // InternalFromText.g:2101:1: ( '>' )
            {
            // InternalFromText.g:2101:1: ( '>' )
            // InternalFromText.g:2102:2: '>'
            {
             before(grammarAccess.getAlgorithmAccess().getGreaterThanSignKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getGreaterThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_2__0__Impl"


    // $ANTLR start "rule__Algorithm__Group_2__1"
    // InternalFromText.g:2111:1: rule__Algorithm__Group_2__1 : rule__Algorithm__Group_2__1__Impl ;
    public final void rule__Algorithm__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2115:1: ( rule__Algorithm__Group_2__1__Impl )
            // InternalFromText.g:2116:2: rule__Algorithm__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_2__1__Impl();

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
    // $ANTLR end "rule__Algorithm__Group_2__1"


    // $ANTLR start "rule__Algorithm__Group_2__1__Impl"
    // InternalFromText.g:2122:1: rule__Algorithm__Group_2__1__Impl : ( ( rule__Algorithm__FunctionsAssignment_2_1 ) ) ;
    public final void rule__Algorithm__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2126:1: ( ( ( rule__Algorithm__FunctionsAssignment_2_1 ) ) )
            // InternalFromText.g:2127:1: ( ( rule__Algorithm__FunctionsAssignment_2_1 ) )
            {
            // InternalFromText.g:2127:1: ( ( rule__Algorithm__FunctionsAssignment_2_1 ) )
            // InternalFromText.g:2128:2: ( rule__Algorithm__FunctionsAssignment_2_1 )
            {
             before(grammarAccess.getAlgorithmAccess().getFunctionsAssignment_2_1()); 
            // InternalFromText.g:2129:2: ( rule__Algorithm__FunctionsAssignment_2_1 )
            // InternalFromText.g:2129:3: rule__Algorithm__FunctionsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__FunctionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getFunctionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_2__1__Impl"


    // $ANTLR start "rule__ChaiseMinute__TablesAssignment_1_0"
    // InternalFromText.g:2138:1: rule__ChaiseMinute__TablesAssignment_1_0 : ( ruleTable ) ;
    public final void rule__ChaiseMinute__TablesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2142:1: ( ( ruleTable ) )
            // InternalFromText.g:2143:2: ( ruleTable )
            {
            // InternalFromText.g:2143:2: ( ruleTable )
            // InternalFromText.g:2144:3: ruleTable
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


    // $ANTLR start "rule__ChaiseMinute__TablesAssignment_1_1_1"
    // InternalFromText.g:2153:1: rule__ChaiseMinute__TablesAssignment_1_1_1 : ( ruleTable ) ;
    public final void rule__ChaiseMinute__TablesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2157:1: ( ( ruleTable ) )
            // InternalFromText.g:2158:2: ( ruleTable )
            {
            // InternalFromText.g:2158:2: ( ruleTable )
            // InternalFromText.g:2159:3: ruleTable
            {
             before(grammarAccess.getChaiseMinuteAccess().getTablesTableParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getChaiseMinuteAccess().getTablesTableParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaiseMinute__TablesAssignment_1_1_1"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalFromText.g:2168:1: rule__Table__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2172:1: ( ( ruleEString ) )
            // InternalFromText.g:2173:2: ( ruleEString )
            {
            // InternalFromText.g:2173:2: ( ruleEString )
            // InternalFromText.g:2174:3: ruleEString
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
    // InternalFromText.g:2183:1: rule__Table__IndexColumnAssignment_3 : ( ruleIndexColumn ) ;
    public final void rule__Table__IndexColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2187:1: ( ( ruleIndexColumn ) )
            // InternalFromText.g:2188:2: ( ruleIndexColumn )
            {
            // InternalFromText.g:2188:2: ( ruleIndexColumn )
            // InternalFromText.g:2189:3: ruleIndexColumn
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
    // InternalFromText.g:2198:1: rule__Table__ColumnsAssignment_5_0 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2202:1: ( ( ruleColumn ) )
            // InternalFromText.g:2203:2: ( ruleColumn )
            {
            // InternalFromText.g:2203:2: ( ruleColumn )
            // InternalFromText.g:2204:3: ruleColumn
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
    // InternalFromText.g:2213:1: rule__Table__ColumnsAssignment_5_1_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2217:1: ( ( ruleColumn ) )
            // InternalFromText.g:2218:2: ( ruleColumn )
            {
            // InternalFromText.g:2218:2: ( ruleColumn )
            // InternalFromText.g:2219:3: ruleColumn
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


    // $ANTLR start "rule__IndexColumn__TypeAssignment_3"
    // InternalFromText.g:2228:1: rule__IndexColumn__TypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__IndexColumn__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2232:1: ( ( ruleDataType ) )
            // InternalFromText.g:2233:2: ( ruleDataType )
            {
            // InternalFromText.g:2233:2: ( ruleDataType )
            // InternalFromText.g:2234:3: ruleDataType
            {
             before(grammarAccess.getIndexColumnAccess().getTypeDataTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getIndexColumnAccess().getTypeDataTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexColumn__TypeAssignment_3"


    // $ANTLR start "rule__IndexColumn__IdAssignment_6"
    // InternalFromText.g:2243:1: rule__IndexColumn__IdAssignment_6 : ( ruleEString ) ;
    public final void rule__IndexColumn__IdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2247:1: ( ( ruleEString ) )
            // InternalFromText.g:2248:2: ( ruleEString )
            {
            // InternalFromText.g:2248:2: ( ruleEString )
            // InternalFromText.g:2249:3: ruleEString
            {
             before(grammarAccess.getIndexColumnAccess().getIdEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIndexColumnAccess().getIdEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexColumn__IdAssignment_6"


    // $ANTLR start "rule__ColumnData__TypeAssignment_2"
    // InternalFromText.g:2258:1: rule__ColumnData__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__ColumnData__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2262:1: ( ( ruleDataType ) )
            // InternalFromText.g:2263:2: ( ruleDataType )
            {
            // InternalFromText.g:2263:2: ( ruleDataType )
            // InternalFromText.g:2264:3: ruleDataType
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
    // InternalFromText.g:2273:1: rule__ColumnData__IdAssignment_5 : ( ruleEString ) ;
    public final void rule__ColumnData__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2277:1: ( ( ruleEString ) )
            // InternalFromText.g:2278:2: ( ruleEString )
            {
            // InternalFromText.g:2278:2: ( ruleEString )
            // InternalFromText.g:2279:3: ruleEString
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
    // InternalFromText.g:2288:1: rule__ImportedColumn__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__ImportedColumn__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2292:1: ( ( ruleDataType ) )
            // InternalFromText.g:2293:2: ( ruleDataType )
            {
            // InternalFromText.g:2293:2: ( ruleDataType )
            // InternalFromText.g:2294:3: ruleDataType
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
    // InternalFromText.g:2303:1: rule__ImportedColumn__PathAssignment_5 : ( ruleEString ) ;
    public final void rule__ImportedColumn__PathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2307:1: ( ( ruleEString ) )
            // InternalFromText.g:2308:2: ( ruleEString )
            {
            // InternalFromText.g:2308:2: ( ruleEString )
            // InternalFromText.g:2309:3: ruleEString
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
    // InternalFromText.g:2318:1: rule__ImportedColumn__IdAssignment_7 : ( ruleEString ) ;
    public final void rule__ImportedColumn__IdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2322:1: ( ( ruleEString ) )
            // InternalFromText.g:2323:2: ( ruleEString )
            {
            // InternalFromText.g:2323:2: ( ruleEString )
            // InternalFromText.g:2324:3: ruleEString
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
    // InternalFromText.g:2333:1: rule__ComputedColumn__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__ComputedColumn__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2337:1: ( ( ruleDataType ) )
            // InternalFromText.g:2338:2: ( ruleDataType )
            {
            // InternalFromText.g:2338:2: ( ruleDataType )
            // InternalFromText.g:2339:3: ruleDataType
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


    // $ANTLR start "rule__ComputedColumn__AlgorithmAssignment_5"
    // InternalFromText.g:2348:1: rule__ComputedColumn__AlgorithmAssignment_5 : ( ruleAlgorithm ) ;
    public final void rule__ComputedColumn__AlgorithmAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2352:1: ( ( ruleAlgorithm ) )
            // InternalFromText.g:2353:2: ( ruleAlgorithm )
            {
            // InternalFromText.g:2353:2: ( ruleAlgorithm )
            // InternalFromText.g:2354:3: ruleAlgorithm
            {
             before(grammarAccess.getComputedColumnAccess().getAlgorithmAlgorithmParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgorithm();

            state._fsp--;

             after(grammarAccess.getComputedColumnAccess().getAlgorithmAlgorithmParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputedColumn__AlgorithmAssignment_5"


    // $ANTLR start "rule__ComputedColumn__IdAssignment_7"
    // InternalFromText.g:2363:1: rule__ComputedColumn__IdAssignment_7 : ( ruleEString ) ;
    public final void rule__ComputedColumn__IdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2367:1: ( ( ruleEString ) )
            // InternalFromText.g:2368:2: ( ruleEString )
            {
            // InternalFromText.g:2368:2: ( ruleEString )
            // InternalFromText.g:2369:3: ruleEString
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
    // InternalFromText.g:2378:1: rule__ColumnArgument__ColumnPathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ColumnArgument__ColumnPathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2382:1: ( ( RULE_STRING ) )
            // InternalFromText.g:2383:2: ( RULE_STRING )
            {
            // InternalFromText.g:2383:2: ( RULE_STRING )
            // InternalFromText.g:2384:3: RULE_STRING
            {
             before(grammarAccess.getColumnArgumentAccess().getColumnPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColumnArgumentAccess().getColumnPathSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalFromText.g:2393:1: rule__Function__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2397:1: ( ( ruleEString ) )
            // InternalFromText.g:2398:2: ( ruleEString )
            {
            // InternalFromText.g:2398:2: ( ruleEString )
            // InternalFromText.g:2399:3: ruleEString
            {
             before(grammarAccess.getFunctionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__InputsAssignment_3_0"
    // InternalFromText.g:2408:1: rule__Function__InputsAssignment_3_0 : ( ruleArgument ) ;
    public final void rule__Function__InputsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2412:1: ( ( ruleArgument ) )
            // InternalFromText.g:2413:2: ( ruleArgument )
            {
            // InternalFromText.g:2413:2: ( ruleArgument )
            // InternalFromText.g:2414:3: ruleArgument
            {
             before(grammarAccess.getFunctionAccess().getInputsArgumentParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getInputsArgumentParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__InputsAssignment_3_0"


    // $ANTLR start "rule__Function__InputsAssignment_3_1_1"
    // InternalFromText.g:2423:1: rule__Function__InputsAssignment_3_1_1 : ( ruleArgument ) ;
    public final void rule__Function__InputsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2427:1: ( ( ruleArgument ) )
            // InternalFromText.g:2428:2: ( ruleArgument )
            {
            // InternalFromText.g:2428:2: ( ruleArgument )
            // InternalFromText.g:2429:3: ruleArgument
            {
             before(grammarAccess.getFunctionAccess().getInputsArgumentParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getInputsArgumentParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__InputsAssignment_3_1_1"


    // $ANTLR start "rule__Algorithm__FunctionsAssignment_1"
    // InternalFromText.g:2438:1: rule__Algorithm__FunctionsAssignment_1 : ( ruleFunction ) ;
    public final void rule__Algorithm__FunctionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2442:1: ( ( ruleFunction ) )
            // InternalFromText.g:2443:2: ( ruleFunction )
            {
            // InternalFromText.g:2443:2: ( ruleFunction )
            // InternalFromText.g:2444:3: ruleFunction
            {
             before(grammarAccess.getAlgorithmAccess().getFunctionsFunctionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getAlgorithmAccess().getFunctionsFunctionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__FunctionsAssignment_1"


    // $ANTLR start "rule__Algorithm__FunctionsAssignment_2_1"
    // InternalFromText.g:2453:1: rule__Algorithm__FunctionsAssignment_2_1 : ( ruleFunction ) ;
    public final void rule__Algorithm__FunctionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2457:1: ( ( ruleFunction ) )
            // InternalFromText.g:2458:2: ( ruleFunction )
            {
            // InternalFromText.g:2458:2: ( ruleFunction )
            // InternalFromText.g:2459:3: ruleFunction
            {
             before(grammarAccess.getAlgorithmAccess().getFunctionsFunctionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getAlgorithmAccess().getFunctionsFunctionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__FunctionsAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000B04000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000B00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});

}