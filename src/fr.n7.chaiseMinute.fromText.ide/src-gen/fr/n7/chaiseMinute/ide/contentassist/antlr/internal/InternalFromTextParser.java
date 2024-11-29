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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Int'", "'{'", "'}'", "','", "'data'", "'('", "')'", "':'", "'imported'", "'->'", "'computed'", "'>'", "'Sum'", "'Feur'"
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


    // $ANTLR start "entryRuleAlgorithm"
    // InternalFromText.g:278:1: entryRuleAlgorithm : ruleAlgorithm EOF ;
    public final void entryRuleAlgorithm() throws RecognitionException {
        try {
            // InternalFromText.g:279:1: ( ruleAlgorithm EOF )
            // InternalFromText.g:280:1: ruleAlgorithm EOF
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
    // InternalFromText.g:287:1: ruleAlgorithm : ( ( rule__Algorithm__Group__0 ) ) ;
    public final void ruleAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:291:2: ( ( ( rule__Algorithm__Group__0 ) ) )
            // InternalFromText.g:292:2: ( ( rule__Algorithm__Group__0 ) )
            {
            // InternalFromText.g:292:2: ( ( rule__Algorithm__Group__0 ) )
            // InternalFromText.g:293:3: ( rule__Algorithm__Group__0 )
            {
             before(grammarAccess.getAlgorithmAccess().getGroup()); 
            // InternalFromText.g:294:3: ( rule__Algorithm__Group__0 )
            // InternalFromText.g:294:4: rule__Algorithm__Group__0
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


    // $ANTLR start "entryRuleOperation"
    // InternalFromText.g:303:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalFromText.g:304:1: ( ruleOperation EOF )
            // InternalFromText.g:305:1: ruleOperation EOF
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
    // InternalFromText.g:312:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:316:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalFromText.g:317:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalFromText.g:317:2: ( ( rule__Operation__Alternatives ) )
            // InternalFromText.g:318:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalFromText.g:319:3: ( rule__Operation__Alternatives )
            // InternalFromText.g:319:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSum"
    // InternalFromText.g:328:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // InternalFromText.g:329:1: ( ruleSum EOF )
            // InternalFromText.g:330:1: ruleSum EOF
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
    // InternalFromText.g:337:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:341:2: ( ( ( rule__Sum__Group__0 ) ) )
            // InternalFromText.g:342:2: ( ( rule__Sum__Group__0 ) )
            {
            // InternalFromText.g:342:2: ( ( rule__Sum__Group__0 ) )
            // InternalFromText.g:343:3: ( rule__Sum__Group__0 )
            {
             before(grammarAccess.getSumAccess().getGroup()); 
            // InternalFromText.g:344:3: ( rule__Sum__Group__0 )
            // InternalFromText.g:344:4: rule__Sum__Group__0
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


    // $ANTLR start "entryRuleFeur"
    // InternalFromText.g:353:1: entryRuleFeur : ruleFeur EOF ;
    public final void entryRuleFeur() throws RecognitionException {
        try {
            // InternalFromText.g:354:1: ( ruleFeur EOF )
            // InternalFromText.g:355:1: ruleFeur EOF
            {
             before(grammarAccess.getFeurRule()); 
            pushFollow(FOLLOW_1);
            ruleFeur();

            state._fsp--;

             after(grammarAccess.getFeurRule()); 
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
    // $ANTLR end "entryRuleFeur"


    // $ANTLR start "ruleFeur"
    // InternalFromText.g:362:1: ruleFeur : ( ( rule__Feur__Group__0 ) ) ;
    public final void ruleFeur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:366:2: ( ( ( rule__Feur__Group__0 ) ) )
            // InternalFromText.g:367:2: ( ( rule__Feur__Group__0 ) )
            {
            // InternalFromText.g:367:2: ( ( rule__Feur__Group__0 ) )
            // InternalFromText.g:368:3: ( rule__Feur__Group__0 )
            {
             before(grammarAccess.getFeurAccess().getGroup()); 
            // InternalFromText.g:369:3: ( rule__Feur__Group__0 )
            // InternalFromText.g:369:4: rule__Feur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeurAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeur"


    // $ANTLR start "entryRuleFunction"
    // InternalFromText.g:378:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalFromText.g:379:1: ( ruleFunction EOF )
            // InternalFromText.g:380:1: ruleFunction EOF
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
    // InternalFromText.g:387:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:391:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalFromText.g:392:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalFromText.g:392:2: ( ( rule__Function__Group__0 ) )
            // InternalFromText.g:393:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalFromText.g:394:3: ( rule__Function__Group__0 )
            // InternalFromText.g:394:4: rule__Function__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalFromText.g:403:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalFromText.g:404:1: ( ruleEString EOF )
            // InternalFromText.g:405:1: ruleEString EOF
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
    // InternalFromText.g:412:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:416:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalFromText.g:417:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalFromText.g:417:2: ( ( rule__EString__Alternatives ) )
            // InternalFromText.g:418:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalFromText.g:419:3: ( rule__EString__Alternatives )
            // InternalFromText.g:419:4: rule__EString__Alternatives
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
    // InternalFromText.g:428:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:432:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalFromText.g:433:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalFromText.g:433:2: ( ( rule__DataType__Alternatives ) )
            // InternalFromText.g:434:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalFromText.g:435:3: ( rule__DataType__Alternatives )
            // InternalFromText.g:435:4: rule__DataType__Alternatives
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
    // InternalFromText.g:443:1: rule__Column__Alternatives : ( ( ruleColumnData ) | ( ruleComputedColumn ) | ( ruleImportedColumn ) );
    public final void rule__Column__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:447:1: ( ( ruleColumnData ) | ( ruleComputedColumn ) | ( ruleImportedColumn ) )
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
                    // InternalFromText.g:448:2: ( ruleColumnData )
                    {
                    // InternalFromText.g:448:2: ( ruleColumnData )
                    // InternalFromText.g:449:3: ruleColumnData
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
                    // InternalFromText.g:454:2: ( ruleComputedColumn )
                    {
                    // InternalFromText.g:454:2: ( ruleComputedColumn )
                    // InternalFromText.g:455:3: ruleComputedColumn
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
                    // InternalFromText.g:460:2: ( ruleImportedColumn )
                    {
                    // InternalFromText.g:460:2: ( ruleImportedColumn )
                    // InternalFromText.g:461:3: ruleImportedColumn
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


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalFromText.g:470:1: rule__Operation__Alternatives : ( ( ruleSum ) | ( ruleFeur ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:474:1: ( ( ruleSum ) | ( ruleFeur ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFromText.g:475:2: ( ruleSum )
                    {
                    // InternalFromText.g:475:2: ( ruleSum )
                    // InternalFromText.g:476:3: ruleSum
                    {
                     before(grammarAccess.getOperationAccess().getSumParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSum();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getSumParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFromText.g:481:2: ( ruleFeur )
                    {
                    // InternalFromText.g:481:2: ( ruleFeur )
                    // InternalFromText.g:482:3: ruleFeur
                    {
                     before(grammarAccess.getOperationAccess().getFeurParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFeur();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getFeurParserRuleCall_1()); 

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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalFromText.g:491:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:495:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
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
                    // InternalFromText.g:496:2: ( RULE_STRING )
                    {
                    // InternalFromText.g:496:2: ( RULE_STRING )
                    // InternalFromText.g:497:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFromText.g:502:2: ( RULE_ID )
                    {
                    // InternalFromText.g:502:2: ( RULE_ID )
                    // InternalFromText.g:503:3: RULE_ID
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
    // InternalFromText.g:512:1: rule__DataType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Int' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:516:1: ( ( ( 'String' ) ) | ( ( 'Int' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFromText.g:517:2: ( ( 'String' ) )
                    {
                    // InternalFromText.g:517:2: ( ( 'String' ) )
                    // InternalFromText.g:518:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalFromText.g:519:3: ( 'String' )
                    // InternalFromText.g:519:4: 'String'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFromText.g:523:2: ( ( 'Int' ) )
                    {
                    // InternalFromText.g:523:2: ( ( 'Int' ) )
                    // InternalFromText.g:524:3: ( 'Int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalFromText.g:525:3: ( 'Int' )
                    // InternalFromText.g:525:4: 'Int'
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
    // InternalFromText.g:533:1: rule__ChaiseMinute__Group__0 : rule__ChaiseMinute__Group__0__Impl rule__ChaiseMinute__Group__1 ;
    public final void rule__ChaiseMinute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:537:1: ( rule__ChaiseMinute__Group__0__Impl rule__ChaiseMinute__Group__1 )
            // InternalFromText.g:538:2: rule__ChaiseMinute__Group__0__Impl rule__ChaiseMinute__Group__1
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
    // InternalFromText.g:545:1: rule__ChaiseMinute__Group__0__Impl : ( '{' ) ;
    public final void rule__ChaiseMinute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:549:1: ( ( '{' ) )
            // InternalFromText.g:550:1: ( '{' )
            {
            // InternalFromText.g:550:1: ( '{' )
            // InternalFromText.g:551:2: '{'
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
    // InternalFromText.g:560:1: rule__ChaiseMinute__Group__1 : rule__ChaiseMinute__Group__1__Impl rule__ChaiseMinute__Group__2 ;
    public final void rule__ChaiseMinute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:564:1: ( rule__ChaiseMinute__Group__1__Impl rule__ChaiseMinute__Group__2 )
            // InternalFromText.g:565:2: rule__ChaiseMinute__Group__1__Impl rule__ChaiseMinute__Group__2
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
    // InternalFromText.g:572:1: rule__ChaiseMinute__Group__1__Impl : ( ( rule__ChaiseMinute__Group_1__0 )? ) ;
    public final void rule__ChaiseMinute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:576:1: ( ( ( rule__ChaiseMinute__Group_1__0 )? ) )
            // InternalFromText.g:577:1: ( ( rule__ChaiseMinute__Group_1__0 )? )
            {
            // InternalFromText.g:577:1: ( ( rule__ChaiseMinute__Group_1__0 )? )
            // InternalFromText.g:578:2: ( rule__ChaiseMinute__Group_1__0 )?
            {
             before(grammarAccess.getChaiseMinuteAccess().getGroup_1()); 
            // InternalFromText.g:579:2: ( rule__ChaiseMinute__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFromText.g:579:3: rule__ChaiseMinute__Group_1__0
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
    // InternalFromText.g:587:1: rule__ChaiseMinute__Group__2 : rule__ChaiseMinute__Group__2__Impl ;
    public final void rule__ChaiseMinute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:591:1: ( rule__ChaiseMinute__Group__2__Impl )
            // InternalFromText.g:592:2: rule__ChaiseMinute__Group__2__Impl
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
    // InternalFromText.g:598:1: rule__ChaiseMinute__Group__2__Impl : ( '}' ) ;
    public final void rule__ChaiseMinute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:602:1: ( ( '}' ) )
            // InternalFromText.g:603:1: ( '}' )
            {
            // InternalFromText.g:603:1: ( '}' )
            // InternalFromText.g:604:2: '}'
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
    // InternalFromText.g:614:1: rule__ChaiseMinute__Group_1__0 : rule__ChaiseMinute__Group_1__0__Impl rule__ChaiseMinute__Group_1__1 ;
    public final void rule__ChaiseMinute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:618:1: ( rule__ChaiseMinute__Group_1__0__Impl rule__ChaiseMinute__Group_1__1 )
            // InternalFromText.g:619:2: rule__ChaiseMinute__Group_1__0__Impl rule__ChaiseMinute__Group_1__1
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
    // InternalFromText.g:626:1: rule__ChaiseMinute__Group_1__0__Impl : ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) ) ;
    public final void rule__ChaiseMinute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:630:1: ( ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) ) )
            // InternalFromText.g:631:1: ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) )
            {
            // InternalFromText.g:631:1: ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) )
            // InternalFromText.g:632:2: ( rule__ChaiseMinute__TablesAssignment_1_0 )
            {
             before(grammarAccess.getChaiseMinuteAccess().getTablesAssignment_1_0()); 
            // InternalFromText.g:633:2: ( rule__ChaiseMinute__TablesAssignment_1_0 )
            // InternalFromText.g:633:3: rule__ChaiseMinute__TablesAssignment_1_0
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
    // InternalFromText.g:641:1: rule__ChaiseMinute__Group_1__1 : rule__ChaiseMinute__Group_1__1__Impl ;
    public final void rule__ChaiseMinute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:645:1: ( rule__ChaiseMinute__Group_1__1__Impl )
            // InternalFromText.g:646:2: rule__ChaiseMinute__Group_1__1__Impl
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
    // InternalFromText.g:652:1: rule__ChaiseMinute__Group_1__1__Impl : ( ( rule__ChaiseMinute__Group_1_1__0 )* ) ;
    public final void rule__ChaiseMinute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:656:1: ( ( ( rule__ChaiseMinute__Group_1_1__0 )* ) )
            // InternalFromText.g:657:1: ( ( rule__ChaiseMinute__Group_1_1__0 )* )
            {
            // InternalFromText.g:657:1: ( ( rule__ChaiseMinute__Group_1_1__0 )* )
            // InternalFromText.g:658:2: ( rule__ChaiseMinute__Group_1_1__0 )*
            {
             before(grammarAccess.getChaiseMinuteAccess().getGroup_1_1()); 
            // InternalFromText.g:659:2: ( rule__ChaiseMinute__Group_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13||LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFromText.g:659:3: rule__ChaiseMinute__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ChaiseMinute__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalFromText.g:668:1: rule__ChaiseMinute__Group_1_1__0 : rule__ChaiseMinute__Group_1_1__0__Impl rule__ChaiseMinute__Group_1_1__1 ;
    public final void rule__ChaiseMinute__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:672:1: ( rule__ChaiseMinute__Group_1_1__0__Impl rule__ChaiseMinute__Group_1_1__1 )
            // InternalFromText.g:673:2: rule__ChaiseMinute__Group_1_1__0__Impl rule__ChaiseMinute__Group_1_1__1
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
    // InternalFromText.g:680:1: rule__ChaiseMinute__Group_1_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__ChaiseMinute__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:684:1: ( ( ( ',' )? ) )
            // InternalFromText.g:685:1: ( ( ',' )? )
            {
            // InternalFromText.g:685:1: ( ( ',' )? )
            // InternalFromText.g:686:2: ( ',' )?
            {
             before(grammarAccess.getChaiseMinuteAccess().getCommaKeyword_1_1_0()); 
            // InternalFromText.g:687:2: ( ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFromText.g:687:3: ','
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
    // InternalFromText.g:695:1: rule__ChaiseMinute__Group_1_1__1 : rule__ChaiseMinute__Group_1_1__1__Impl ;
    public final void rule__ChaiseMinute__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:699:1: ( rule__ChaiseMinute__Group_1_1__1__Impl )
            // InternalFromText.g:700:2: rule__ChaiseMinute__Group_1_1__1__Impl
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
    // InternalFromText.g:706:1: rule__ChaiseMinute__Group_1_1__1__Impl : ( ( rule__ChaiseMinute__TablesAssignment_1_1_1 ) ) ;
    public final void rule__ChaiseMinute__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:710:1: ( ( ( rule__ChaiseMinute__TablesAssignment_1_1_1 ) ) )
            // InternalFromText.g:711:1: ( ( rule__ChaiseMinute__TablesAssignment_1_1_1 ) )
            {
            // InternalFromText.g:711:1: ( ( rule__ChaiseMinute__TablesAssignment_1_1_1 ) )
            // InternalFromText.g:712:2: ( rule__ChaiseMinute__TablesAssignment_1_1_1 )
            {
             before(grammarAccess.getChaiseMinuteAccess().getTablesAssignment_1_1_1()); 
            // InternalFromText.g:713:2: ( rule__ChaiseMinute__TablesAssignment_1_1_1 )
            // InternalFromText.g:713:3: rule__ChaiseMinute__TablesAssignment_1_1_1
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
    // InternalFromText.g:722:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:726:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalFromText.g:727:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalFromText.g:734:1: rule__Table__Group__0__Impl : ( '{' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:738:1: ( ( '{' ) )
            // InternalFromText.g:739:1: ( '{' )
            {
            // InternalFromText.g:739:1: ( '{' )
            // InternalFromText.g:740:2: '{'
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
    // InternalFromText.g:749:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:753:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalFromText.g:754:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalFromText.g:761:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:765:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalFromText.g:766:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalFromText.g:766:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalFromText.g:767:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalFromText.g:768:2: ( rule__Table__NameAssignment_1 )
            // InternalFromText.g:768:3: rule__Table__NameAssignment_1
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
    // InternalFromText.g:776:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:780:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalFromText.g:781:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalFromText.g:788:1: rule__Table__Group__2__Impl : ( ',' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:792:1: ( ( ',' ) )
            // InternalFromText.g:793:1: ( ',' )
            {
            // InternalFromText.g:793:1: ( ',' )
            // InternalFromText.g:794:2: ','
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
    // InternalFromText.g:803:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:807:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalFromText.g:808:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalFromText.g:815:1: rule__Table__Group__3__Impl : ( ( rule__Table__IndexColumnAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:819:1: ( ( ( rule__Table__IndexColumnAssignment_3 ) ) )
            // InternalFromText.g:820:1: ( ( rule__Table__IndexColumnAssignment_3 ) )
            {
            // InternalFromText.g:820:1: ( ( rule__Table__IndexColumnAssignment_3 ) )
            // InternalFromText.g:821:2: ( rule__Table__IndexColumnAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getIndexColumnAssignment_3()); 
            // InternalFromText.g:822:2: ( rule__Table__IndexColumnAssignment_3 )
            // InternalFromText.g:822:3: rule__Table__IndexColumnAssignment_3
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
    // InternalFromText.g:830:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:834:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalFromText.g:835:2: rule__Table__Group__4__Impl rule__Table__Group__5
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
    // InternalFromText.g:842:1: rule__Table__Group__4__Impl : ( ',' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:846:1: ( ( ',' ) )
            // InternalFromText.g:847:1: ( ',' )
            {
            // InternalFromText.g:847:1: ( ',' )
            // InternalFromText.g:848:2: ','
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
    // InternalFromText.g:857:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:861:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalFromText.g:862:2: rule__Table__Group__5__Impl rule__Table__Group__6
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
    // InternalFromText.g:869:1: rule__Table__Group__5__Impl : ( ( rule__Table__Group_5__0 )? ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:873:1: ( ( ( rule__Table__Group_5__0 )? ) )
            // InternalFromText.g:874:1: ( ( rule__Table__Group_5__0 )? )
            {
            // InternalFromText.g:874:1: ( ( rule__Table__Group_5__0 )? )
            // InternalFromText.g:875:2: ( rule__Table__Group_5__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_5()); 
            // InternalFromText.g:876:2: ( rule__Table__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16||LA8_0==20||LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFromText.g:876:3: rule__Table__Group_5__0
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
    // InternalFromText.g:884:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:888:1: ( rule__Table__Group__6__Impl )
            // InternalFromText.g:889:2: rule__Table__Group__6__Impl
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
    // InternalFromText.g:895:1: rule__Table__Group__6__Impl : ( '}' ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:899:1: ( ( '}' ) )
            // InternalFromText.g:900:1: ( '}' )
            {
            // InternalFromText.g:900:1: ( '}' )
            // InternalFromText.g:901:2: '}'
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
    // InternalFromText.g:911:1: rule__Table__Group_5__0 : rule__Table__Group_5__0__Impl rule__Table__Group_5__1 ;
    public final void rule__Table__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:915:1: ( rule__Table__Group_5__0__Impl rule__Table__Group_5__1 )
            // InternalFromText.g:916:2: rule__Table__Group_5__0__Impl rule__Table__Group_5__1
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
    // InternalFromText.g:923:1: rule__Table__Group_5__0__Impl : ( ( rule__Table__ColumnsAssignment_5_0 ) ) ;
    public final void rule__Table__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:927:1: ( ( ( rule__Table__ColumnsAssignment_5_0 ) ) )
            // InternalFromText.g:928:1: ( ( rule__Table__ColumnsAssignment_5_0 ) )
            {
            // InternalFromText.g:928:1: ( ( rule__Table__ColumnsAssignment_5_0 ) )
            // InternalFromText.g:929:2: ( rule__Table__ColumnsAssignment_5_0 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_0()); 
            // InternalFromText.g:930:2: ( rule__Table__ColumnsAssignment_5_0 )
            // InternalFromText.g:930:3: rule__Table__ColumnsAssignment_5_0
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
    // InternalFromText.g:938:1: rule__Table__Group_5__1 : rule__Table__Group_5__1__Impl ;
    public final void rule__Table__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:942:1: ( rule__Table__Group_5__1__Impl )
            // InternalFromText.g:943:2: rule__Table__Group_5__1__Impl
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
    // InternalFromText.g:949:1: rule__Table__Group_5__1__Impl : ( ( rule__Table__Group_5_1__0 )* ) ;
    public final void rule__Table__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:953:1: ( ( ( rule__Table__Group_5_1__0 )* ) )
            // InternalFromText.g:954:1: ( ( rule__Table__Group_5_1__0 )* )
            {
            // InternalFromText.g:954:1: ( ( rule__Table__Group_5_1__0 )* )
            // InternalFromText.g:955:2: ( rule__Table__Group_5_1__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_5_1()); 
            // InternalFromText.g:956:2: ( rule__Table__Group_5_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFromText.g:956:3: rule__Table__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Table__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalFromText.g:965:1: rule__Table__Group_5_1__0 : rule__Table__Group_5_1__0__Impl rule__Table__Group_5_1__1 ;
    public final void rule__Table__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:969:1: ( rule__Table__Group_5_1__0__Impl rule__Table__Group_5_1__1 )
            // InternalFromText.g:970:2: rule__Table__Group_5_1__0__Impl rule__Table__Group_5_1__1
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
    // InternalFromText.g:977:1: rule__Table__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:981:1: ( ( ',' ) )
            // InternalFromText.g:982:1: ( ',' )
            {
            // InternalFromText.g:982:1: ( ',' )
            // InternalFromText.g:983:2: ','
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
    // InternalFromText.g:992:1: rule__Table__Group_5_1__1 : rule__Table__Group_5_1__1__Impl ;
    public final void rule__Table__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:996:1: ( rule__Table__Group_5_1__1__Impl )
            // InternalFromText.g:997:2: rule__Table__Group_5_1__1__Impl
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
    // InternalFromText.g:1003:1: rule__Table__Group_5_1__1__Impl : ( ( rule__Table__ColumnsAssignment_5_1_1 ) ) ;
    public final void rule__Table__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1007:1: ( ( ( rule__Table__ColumnsAssignment_5_1_1 ) ) )
            // InternalFromText.g:1008:1: ( ( rule__Table__ColumnsAssignment_5_1_1 ) )
            {
            // InternalFromText.g:1008:1: ( ( rule__Table__ColumnsAssignment_5_1_1 ) )
            // InternalFromText.g:1009:2: ( rule__Table__ColumnsAssignment_5_1_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_1_1()); 
            // InternalFromText.g:1010:2: ( rule__Table__ColumnsAssignment_5_1_1 )
            // InternalFromText.g:1010:3: rule__Table__ColumnsAssignment_5_1_1
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
    // InternalFromText.g:1019:1: rule__ColumnData__Group__0 : rule__ColumnData__Group__0__Impl rule__ColumnData__Group__1 ;
    public final void rule__ColumnData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1023:1: ( rule__ColumnData__Group__0__Impl rule__ColumnData__Group__1 )
            // InternalFromText.g:1024:2: rule__ColumnData__Group__0__Impl rule__ColumnData__Group__1
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
    // InternalFromText.g:1031:1: rule__ColumnData__Group__0__Impl : ( 'data' ) ;
    public final void rule__ColumnData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1035:1: ( ( 'data' ) )
            // InternalFromText.g:1036:1: ( 'data' )
            {
            // InternalFromText.g:1036:1: ( 'data' )
            // InternalFromText.g:1037:2: 'data'
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
    // InternalFromText.g:1046:1: rule__ColumnData__Group__1 : rule__ColumnData__Group__1__Impl rule__ColumnData__Group__2 ;
    public final void rule__ColumnData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1050:1: ( rule__ColumnData__Group__1__Impl rule__ColumnData__Group__2 )
            // InternalFromText.g:1051:2: rule__ColumnData__Group__1__Impl rule__ColumnData__Group__2
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
    // InternalFromText.g:1058:1: rule__ColumnData__Group__1__Impl : ( '(' ) ;
    public final void rule__ColumnData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1062:1: ( ( '(' ) )
            // InternalFromText.g:1063:1: ( '(' )
            {
            // InternalFromText.g:1063:1: ( '(' )
            // InternalFromText.g:1064:2: '('
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
    // InternalFromText.g:1073:1: rule__ColumnData__Group__2 : rule__ColumnData__Group__2__Impl rule__ColumnData__Group__3 ;
    public final void rule__ColumnData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1077:1: ( rule__ColumnData__Group__2__Impl rule__ColumnData__Group__3 )
            // InternalFromText.g:1078:2: rule__ColumnData__Group__2__Impl rule__ColumnData__Group__3
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
    // InternalFromText.g:1085:1: rule__ColumnData__Group__2__Impl : ( ( rule__ColumnData__TypeAssignment_2 ) ) ;
    public final void rule__ColumnData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1089:1: ( ( ( rule__ColumnData__TypeAssignment_2 ) ) )
            // InternalFromText.g:1090:1: ( ( rule__ColumnData__TypeAssignment_2 ) )
            {
            // InternalFromText.g:1090:1: ( ( rule__ColumnData__TypeAssignment_2 ) )
            // InternalFromText.g:1091:2: ( rule__ColumnData__TypeAssignment_2 )
            {
             before(grammarAccess.getColumnDataAccess().getTypeAssignment_2()); 
            // InternalFromText.g:1092:2: ( rule__ColumnData__TypeAssignment_2 )
            // InternalFromText.g:1092:3: rule__ColumnData__TypeAssignment_2
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
    // InternalFromText.g:1100:1: rule__ColumnData__Group__3 : rule__ColumnData__Group__3__Impl rule__ColumnData__Group__4 ;
    public final void rule__ColumnData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1104:1: ( rule__ColumnData__Group__3__Impl rule__ColumnData__Group__4 )
            // InternalFromText.g:1105:2: rule__ColumnData__Group__3__Impl rule__ColumnData__Group__4
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
    // InternalFromText.g:1112:1: rule__ColumnData__Group__3__Impl : ( ')' ) ;
    public final void rule__ColumnData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1116:1: ( ( ')' ) )
            // InternalFromText.g:1117:1: ( ')' )
            {
            // InternalFromText.g:1117:1: ( ')' )
            // InternalFromText.g:1118:2: ')'
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
    // InternalFromText.g:1127:1: rule__ColumnData__Group__4 : rule__ColumnData__Group__4__Impl rule__ColumnData__Group__5 ;
    public final void rule__ColumnData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1131:1: ( rule__ColumnData__Group__4__Impl rule__ColumnData__Group__5 )
            // InternalFromText.g:1132:2: rule__ColumnData__Group__4__Impl rule__ColumnData__Group__5
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
    // InternalFromText.g:1139:1: rule__ColumnData__Group__4__Impl : ( ':' ) ;
    public final void rule__ColumnData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1143:1: ( ( ':' ) )
            // InternalFromText.g:1144:1: ( ':' )
            {
            // InternalFromText.g:1144:1: ( ':' )
            // InternalFromText.g:1145:2: ':'
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
    // InternalFromText.g:1154:1: rule__ColumnData__Group__5 : rule__ColumnData__Group__5__Impl ;
    public final void rule__ColumnData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1158:1: ( rule__ColumnData__Group__5__Impl )
            // InternalFromText.g:1159:2: rule__ColumnData__Group__5__Impl
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
    // InternalFromText.g:1165:1: rule__ColumnData__Group__5__Impl : ( ( rule__ColumnData__IdAssignment_5 ) ) ;
    public final void rule__ColumnData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1169:1: ( ( ( rule__ColumnData__IdAssignment_5 ) ) )
            // InternalFromText.g:1170:1: ( ( rule__ColumnData__IdAssignment_5 ) )
            {
            // InternalFromText.g:1170:1: ( ( rule__ColumnData__IdAssignment_5 ) )
            // InternalFromText.g:1171:2: ( rule__ColumnData__IdAssignment_5 )
            {
             before(grammarAccess.getColumnDataAccess().getIdAssignment_5()); 
            // InternalFromText.g:1172:2: ( rule__ColumnData__IdAssignment_5 )
            // InternalFromText.g:1172:3: rule__ColumnData__IdAssignment_5
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
    // InternalFromText.g:1181:1: rule__ImportedColumn__Group__0 : rule__ImportedColumn__Group__0__Impl rule__ImportedColumn__Group__1 ;
    public final void rule__ImportedColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1185:1: ( rule__ImportedColumn__Group__0__Impl rule__ImportedColumn__Group__1 )
            // InternalFromText.g:1186:2: rule__ImportedColumn__Group__0__Impl rule__ImportedColumn__Group__1
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
    // InternalFromText.g:1193:1: rule__ImportedColumn__Group__0__Impl : ( 'imported' ) ;
    public final void rule__ImportedColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1197:1: ( ( 'imported' ) )
            // InternalFromText.g:1198:1: ( 'imported' )
            {
            // InternalFromText.g:1198:1: ( 'imported' )
            // InternalFromText.g:1199:2: 'imported'
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
    // InternalFromText.g:1208:1: rule__ImportedColumn__Group__1 : rule__ImportedColumn__Group__1__Impl rule__ImportedColumn__Group__2 ;
    public final void rule__ImportedColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1212:1: ( rule__ImportedColumn__Group__1__Impl rule__ImportedColumn__Group__2 )
            // InternalFromText.g:1213:2: rule__ImportedColumn__Group__1__Impl rule__ImportedColumn__Group__2
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
    // InternalFromText.g:1220:1: rule__ImportedColumn__Group__1__Impl : ( '(' ) ;
    public final void rule__ImportedColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1224:1: ( ( '(' ) )
            // InternalFromText.g:1225:1: ( '(' )
            {
            // InternalFromText.g:1225:1: ( '(' )
            // InternalFromText.g:1226:2: '('
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
    // InternalFromText.g:1235:1: rule__ImportedColumn__Group__2 : rule__ImportedColumn__Group__2__Impl rule__ImportedColumn__Group__3 ;
    public final void rule__ImportedColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1239:1: ( rule__ImportedColumn__Group__2__Impl rule__ImportedColumn__Group__3 )
            // InternalFromText.g:1240:2: rule__ImportedColumn__Group__2__Impl rule__ImportedColumn__Group__3
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
    // InternalFromText.g:1247:1: rule__ImportedColumn__Group__2__Impl : ( ( rule__ImportedColumn__TypeAssignment_2 ) ) ;
    public final void rule__ImportedColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1251:1: ( ( ( rule__ImportedColumn__TypeAssignment_2 ) ) )
            // InternalFromText.g:1252:1: ( ( rule__ImportedColumn__TypeAssignment_2 ) )
            {
            // InternalFromText.g:1252:1: ( ( rule__ImportedColumn__TypeAssignment_2 ) )
            // InternalFromText.g:1253:2: ( rule__ImportedColumn__TypeAssignment_2 )
            {
             before(grammarAccess.getImportedColumnAccess().getTypeAssignment_2()); 
            // InternalFromText.g:1254:2: ( rule__ImportedColumn__TypeAssignment_2 )
            // InternalFromText.g:1254:3: rule__ImportedColumn__TypeAssignment_2
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
    // InternalFromText.g:1262:1: rule__ImportedColumn__Group__3 : rule__ImportedColumn__Group__3__Impl rule__ImportedColumn__Group__4 ;
    public final void rule__ImportedColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1266:1: ( rule__ImportedColumn__Group__3__Impl rule__ImportedColumn__Group__4 )
            // InternalFromText.g:1267:2: rule__ImportedColumn__Group__3__Impl rule__ImportedColumn__Group__4
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
    // InternalFromText.g:1274:1: rule__ImportedColumn__Group__3__Impl : ( ')' ) ;
    public final void rule__ImportedColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1278:1: ( ( ')' ) )
            // InternalFromText.g:1279:1: ( ')' )
            {
            // InternalFromText.g:1279:1: ( ')' )
            // InternalFromText.g:1280:2: ')'
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
    // InternalFromText.g:1289:1: rule__ImportedColumn__Group__4 : rule__ImportedColumn__Group__4__Impl rule__ImportedColumn__Group__5 ;
    public final void rule__ImportedColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1293:1: ( rule__ImportedColumn__Group__4__Impl rule__ImportedColumn__Group__5 )
            // InternalFromText.g:1294:2: rule__ImportedColumn__Group__4__Impl rule__ImportedColumn__Group__5
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
    // InternalFromText.g:1301:1: rule__ImportedColumn__Group__4__Impl : ( ':' ) ;
    public final void rule__ImportedColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1305:1: ( ( ':' ) )
            // InternalFromText.g:1306:1: ( ':' )
            {
            // InternalFromText.g:1306:1: ( ':' )
            // InternalFromText.g:1307:2: ':'
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
    // InternalFromText.g:1316:1: rule__ImportedColumn__Group__5 : rule__ImportedColumn__Group__5__Impl rule__ImportedColumn__Group__6 ;
    public final void rule__ImportedColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1320:1: ( rule__ImportedColumn__Group__5__Impl rule__ImportedColumn__Group__6 )
            // InternalFromText.g:1321:2: rule__ImportedColumn__Group__5__Impl rule__ImportedColumn__Group__6
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
    // InternalFromText.g:1328:1: rule__ImportedColumn__Group__5__Impl : ( ( rule__ImportedColumn__PathAssignment_5 ) ) ;
    public final void rule__ImportedColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1332:1: ( ( ( rule__ImportedColumn__PathAssignment_5 ) ) )
            // InternalFromText.g:1333:1: ( ( rule__ImportedColumn__PathAssignment_5 ) )
            {
            // InternalFromText.g:1333:1: ( ( rule__ImportedColumn__PathAssignment_5 ) )
            // InternalFromText.g:1334:2: ( rule__ImportedColumn__PathAssignment_5 )
            {
             before(grammarAccess.getImportedColumnAccess().getPathAssignment_5()); 
            // InternalFromText.g:1335:2: ( rule__ImportedColumn__PathAssignment_5 )
            // InternalFromText.g:1335:3: rule__ImportedColumn__PathAssignment_5
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
    // InternalFromText.g:1343:1: rule__ImportedColumn__Group__6 : rule__ImportedColumn__Group__6__Impl rule__ImportedColumn__Group__7 ;
    public final void rule__ImportedColumn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1347:1: ( rule__ImportedColumn__Group__6__Impl rule__ImportedColumn__Group__7 )
            // InternalFromText.g:1348:2: rule__ImportedColumn__Group__6__Impl rule__ImportedColumn__Group__7
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
    // InternalFromText.g:1355:1: rule__ImportedColumn__Group__6__Impl : ( '->' ) ;
    public final void rule__ImportedColumn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1359:1: ( ( '->' ) )
            // InternalFromText.g:1360:1: ( '->' )
            {
            // InternalFromText.g:1360:1: ( '->' )
            // InternalFromText.g:1361:2: '->'
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
    // InternalFromText.g:1370:1: rule__ImportedColumn__Group__7 : rule__ImportedColumn__Group__7__Impl ;
    public final void rule__ImportedColumn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1374:1: ( rule__ImportedColumn__Group__7__Impl )
            // InternalFromText.g:1375:2: rule__ImportedColumn__Group__7__Impl
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
    // InternalFromText.g:1381:1: rule__ImportedColumn__Group__7__Impl : ( ( rule__ImportedColumn__IdAssignment_7 ) ) ;
    public final void rule__ImportedColumn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1385:1: ( ( ( rule__ImportedColumn__IdAssignment_7 ) ) )
            // InternalFromText.g:1386:1: ( ( rule__ImportedColumn__IdAssignment_7 ) )
            {
            // InternalFromText.g:1386:1: ( ( rule__ImportedColumn__IdAssignment_7 ) )
            // InternalFromText.g:1387:2: ( rule__ImportedColumn__IdAssignment_7 )
            {
             before(grammarAccess.getImportedColumnAccess().getIdAssignment_7()); 
            // InternalFromText.g:1388:2: ( rule__ImportedColumn__IdAssignment_7 )
            // InternalFromText.g:1388:3: rule__ImportedColumn__IdAssignment_7
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
    // InternalFromText.g:1397:1: rule__ComputedColumn__Group__0 : rule__ComputedColumn__Group__0__Impl rule__ComputedColumn__Group__1 ;
    public final void rule__ComputedColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1401:1: ( rule__ComputedColumn__Group__0__Impl rule__ComputedColumn__Group__1 )
            // InternalFromText.g:1402:2: rule__ComputedColumn__Group__0__Impl rule__ComputedColumn__Group__1
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
    // InternalFromText.g:1409:1: rule__ComputedColumn__Group__0__Impl : ( 'computed' ) ;
    public final void rule__ComputedColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1413:1: ( ( 'computed' ) )
            // InternalFromText.g:1414:1: ( 'computed' )
            {
            // InternalFromText.g:1414:1: ( 'computed' )
            // InternalFromText.g:1415:2: 'computed'
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
    // InternalFromText.g:1424:1: rule__ComputedColumn__Group__1 : rule__ComputedColumn__Group__1__Impl rule__ComputedColumn__Group__2 ;
    public final void rule__ComputedColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1428:1: ( rule__ComputedColumn__Group__1__Impl rule__ComputedColumn__Group__2 )
            // InternalFromText.g:1429:2: rule__ComputedColumn__Group__1__Impl rule__ComputedColumn__Group__2
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
    // InternalFromText.g:1436:1: rule__ComputedColumn__Group__1__Impl : ( '(' ) ;
    public final void rule__ComputedColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1440:1: ( ( '(' ) )
            // InternalFromText.g:1441:1: ( '(' )
            {
            // InternalFromText.g:1441:1: ( '(' )
            // InternalFromText.g:1442:2: '('
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
    // InternalFromText.g:1451:1: rule__ComputedColumn__Group__2 : rule__ComputedColumn__Group__2__Impl rule__ComputedColumn__Group__3 ;
    public final void rule__ComputedColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1455:1: ( rule__ComputedColumn__Group__2__Impl rule__ComputedColumn__Group__3 )
            // InternalFromText.g:1456:2: rule__ComputedColumn__Group__2__Impl rule__ComputedColumn__Group__3
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
    // InternalFromText.g:1463:1: rule__ComputedColumn__Group__2__Impl : ( ( rule__ComputedColumn__TypeAssignment_2 ) ) ;
    public final void rule__ComputedColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1467:1: ( ( ( rule__ComputedColumn__TypeAssignment_2 ) ) )
            // InternalFromText.g:1468:1: ( ( rule__ComputedColumn__TypeAssignment_2 ) )
            {
            // InternalFromText.g:1468:1: ( ( rule__ComputedColumn__TypeAssignment_2 ) )
            // InternalFromText.g:1469:2: ( rule__ComputedColumn__TypeAssignment_2 )
            {
             before(grammarAccess.getComputedColumnAccess().getTypeAssignment_2()); 
            // InternalFromText.g:1470:2: ( rule__ComputedColumn__TypeAssignment_2 )
            // InternalFromText.g:1470:3: rule__ComputedColumn__TypeAssignment_2
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
    // InternalFromText.g:1478:1: rule__ComputedColumn__Group__3 : rule__ComputedColumn__Group__3__Impl rule__ComputedColumn__Group__4 ;
    public final void rule__ComputedColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1482:1: ( rule__ComputedColumn__Group__3__Impl rule__ComputedColumn__Group__4 )
            // InternalFromText.g:1483:2: rule__ComputedColumn__Group__3__Impl rule__ComputedColumn__Group__4
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
    // InternalFromText.g:1490:1: rule__ComputedColumn__Group__3__Impl : ( ')' ) ;
    public final void rule__ComputedColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1494:1: ( ( ')' ) )
            // InternalFromText.g:1495:1: ( ')' )
            {
            // InternalFromText.g:1495:1: ( ')' )
            // InternalFromText.g:1496:2: ')'
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
    // InternalFromText.g:1505:1: rule__ComputedColumn__Group__4 : rule__ComputedColumn__Group__4__Impl rule__ComputedColumn__Group__5 ;
    public final void rule__ComputedColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1509:1: ( rule__ComputedColumn__Group__4__Impl rule__ComputedColumn__Group__5 )
            // InternalFromText.g:1510:2: rule__ComputedColumn__Group__4__Impl rule__ComputedColumn__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalFromText.g:1517:1: rule__ComputedColumn__Group__4__Impl : ( ':' ) ;
    public final void rule__ComputedColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1521:1: ( ( ':' ) )
            // InternalFromText.g:1522:1: ( ':' )
            {
            // InternalFromText.g:1522:1: ( ':' )
            // InternalFromText.g:1523:2: ':'
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
    // InternalFromText.g:1532:1: rule__ComputedColumn__Group__5 : rule__ComputedColumn__Group__5__Impl rule__ComputedColumn__Group__6 ;
    public final void rule__ComputedColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1536:1: ( rule__ComputedColumn__Group__5__Impl rule__ComputedColumn__Group__6 )
            // InternalFromText.g:1537:2: rule__ComputedColumn__Group__5__Impl rule__ComputedColumn__Group__6
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
    // InternalFromText.g:1544:1: rule__ComputedColumn__Group__5__Impl : ( ( rule__ComputedColumn__AlgorithmAssignment_5 ) ) ;
    public final void rule__ComputedColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1548:1: ( ( ( rule__ComputedColumn__AlgorithmAssignment_5 ) ) )
            // InternalFromText.g:1549:1: ( ( rule__ComputedColumn__AlgorithmAssignment_5 ) )
            {
            // InternalFromText.g:1549:1: ( ( rule__ComputedColumn__AlgorithmAssignment_5 ) )
            // InternalFromText.g:1550:2: ( rule__ComputedColumn__AlgorithmAssignment_5 )
            {
             before(grammarAccess.getComputedColumnAccess().getAlgorithmAssignment_5()); 
            // InternalFromText.g:1551:2: ( rule__ComputedColumn__AlgorithmAssignment_5 )
            // InternalFromText.g:1551:3: rule__ComputedColumn__AlgorithmAssignment_5
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
    // InternalFromText.g:1559:1: rule__ComputedColumn__Group__6 : rule__ComputedColumn__Group__6__Impl rule__ComputedColumn__Group__7 ;
    public final void rule__ComputedColumn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1563:1: ( rule__ComputedColumn__Group__6__Impl rule__ComputedColumn__Group__7 )
            // InternalFromText.g:1564:2: rule__ComputedColumn__Group__6__Impl rule__ComputedColumn__Group__7
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
    // InternalFromText.g:1571:1: rule__ComputedColumn__Group__6__Impl : ( '->' ) ;
    public final void rule__ComputedColumn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1575:1: ( ( '->' ) )
            // InternalFromText.g:1576:1: ( '->' )
            {
            // InternalFromText.g:1576:1: ( '->' )
            // InternalFromText.g:1577:2: '->'
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
    // InternalFromText.g:1586:1: rule__ComputedColumn__Group__7 : rule__ComputedColumn__Group__7__Impl ;
    public final void rule__ComputedColumn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1590:1: ( rule__ComputedColumn__Group__7__Impl )
            // InternalFromText.g:1591:2: rule__ComputedColumn__Group__7__Impl
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
    // InternalFromText.g:1597:1: rule__ComputedColumn__Group__7__Impl : ( ( rule__ComputedColumn__IdAssignment_7 ) ) ;
    public final void rule__ComputedColumn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1601:1: ( ( ( rule__ComputedColumn__IdAssignment_7 ) ) )
            // InternalFromText.g:1602:1: ( ( rule__ComputedColumn__IdAssignment_7 ) )
            {
            // InternalFromText.g:1602:1: ( ( rule__ComputedColumn__IdAssignment_7 ) )
            // InternalFromText.g:1603:2: ( rule__ComputedColumn__IdAssignment_7 )
            {
             before(grammarAccess.getComputedColumnAccess().getIdAssignment_7()); 
            // InternalFromText.g:1604:2: ( rule__ComputedColumn__IdAssignment_7 )
            // InternalFromText.g:1604:3: rule__ComputedColumn__IdAssignment_7
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
    // InternalFromText.g:1613:1: rule__ColumnArgument__Group__0 : rule__ColumnArgument__Group__0__Impl rule__ColumnArgument__Group__1 ;
    public final void rule__ColumnArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1617:1: ( rule__ColumnArgument__Group__0__Impl rule__ColumnArgument__Group__1 )
            // InternalFromText.g:1618:2: rule__ColumnArgument__Group__0__Impl rule__ColumnArgument__Group__1
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
    // InternalFromText.g:1625:1: rule__ColumnArgument__Group__0__Impl : ( () ) ;
    public final void rule__ColumnArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1629:1: ( ( () ) )
            // InternalFromText.g:1630:1: ( () )
            {
            // InternalFromText.g:1630:1: ( () )
            // InternalFromText.g:1631:2: ()
            {
             before(grammarAccess.getColumnArgumentAccess().getColumnArgumentAction_0()); 
            // InternalFromText.g:1632:2: ()
            // InternalFromText.g:1632:3: 
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
    // InternalFromText.g:1640:1: rule__ColumnArgument__Group__1 : rule__ColumnArgument__Group__1__Impl ;
    public final void rule__ColumnArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1644:1: ( rule__ColumnArgument__Group__1__Impl )
            // InternalFromText.g:1645:2: rule__ColumnArgument__Group__1__Impl
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
    // InternalFromText.g:1651:1: rule__ColumnArgument__Group__1__Impl : ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) ) ;
    public final void rule__ColumnArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1655:1: ( ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) ) )
            // InternalFromText.g:1656:1: ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) )
            {
            // InternalFromText.g:1656:1: ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) )
            // InternalFromText.g:1657:2: ( rule__ColumnArgument__ColumnPathAssignment_1 )
            {
             before(grammarAccess.getColumnArgumentAccess().getColumnPathAssignment_1()); 
            // InternalFromText.g:1658:2: ( rule__ColumnArgument__ColumnPathAssignment_1 )
            // InternalFromText.g:1658:3: rule__ColumnArgument__ColumnPathAssignment_1
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


    // $ANTLR start "rule__Algorithm__Group__0"
    // InternalFromText.g:1667:1: rule__Algorithm__Group__0 : rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 ;
    public final void rule__Algorithm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1671:1: ( rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 )
            // InternalFromText.g:1672:2: rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFromText.g:1679:1: rule__Algorithm__Group__0__Impl : ( () ) ;
    public final void rule__Algorithm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1683:1: ( ( () ) )
            // InternalFromText.g:1684:1: ( () )
            {
            // InternalFromText.g:1684:1: ( () )
            // InternalFromText.g:1685:2: ()
            {
             before(grammarAccess.getAlgorithmAccess().getAlgorithmAction_0()); 
            // InternalFromText.g:1686:2: ()
            // InternalFromText.g:1686:3: 
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
    // InternalFromText.g:1694:1: rule__Algorithm__Group__1 : rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2 ;
    public final void rule__Algorithm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1698:1: ( rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2 )
            // InternalFromText.g:1699:2: rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalFromText.g:1706:1: rule__Algorithm__Group__1__Impl : ( ( rule__Algorithm__FunctionsAssignment_1 ) ) ;
    public final void rule__Algorithm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1710:1: ( ( ( rule__Algorithm__FunctionsAssignment_1 ) ) )
            // InternalFromText.g:1711:1: ( ( rule__Algorithm__FunctionsAssignment_1 ) )
            {
            // InternalFromText.g:1711:1: ( ( rule__Algorithm__FunctionsAssignment_1 ) )
            // InternalFromText.g:1712:2: ( rule__Algorithm__FunctionsAssignment_1 )
            {
             before(grammarAccess.getAlgorithmAccess().getFunctionsAssignment_1()); 
            // InternalFromText.g:1713:2: ( rule__Algorithm__FunctionsAssignment_1 )
            // InternalFromText.g:1713:3: rule__Algorithm__FunctionsAssignment_1
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
    // InternalFromText.g:1721:1: rule__Algorithm__Group__2 : rule__Algorithm__Group__2__Impl rule__Algorithm__Group__3 ;
    public final void rule__Algorithm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1725:1: ( rule__Algorithm__Group__2__Impl rule__Algorithm__Group__3 )
            // InternalFromText.g:1726:2: rule__Algorithm__Group__2__Impl rule__Algorithm__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Algorithm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__3();

            state._fsp--;


            }

        }
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
    // InternalFromText.g:1733:1: rule__Algorithm__Group__2__Impl : ( '(' ) ;
    public final void rule__Algorithm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1737:1: ( ( '(' ) )
            // InternalFromText.g:1738:1: ( '(' )
            {
            // InternalFromText.g:1738:1: ( '(' )
            // InternalFromText.g:1739:2: '('
            {
             before(grammarAccess.getAlgorithmAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Algorithm__Group__3"
    // InternalFromText.g:1748:1: rule__Algorithm__Group__3 : rule__Algorithm__Group__3__Impl rule__Algorithm__Group__4 ;
    public final void rule__Algorithm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1752:1: ( rule__Algorithm__Group__3__Impl rule__Algorithm__Group__4 )
            // InternalFromText.g:1753:2: rule__Algorithm__Group__3__Impl rule__Algorithm__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Algorithm__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__3"


    // $ANTLR start "rule__Algorithm__Group__3__Impl"
    // InternalFromText.g:1760:1: rule__Algorithm__Group__3__Impl : ( ( rule__Algorithm__Group_3__0 )? ) ;
    public final void rule__Algorithm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1764:1: ( ( ( rule__Algorithm__Group_3__0 )? ) )
            // InternalFromText.g:1765:1: ( ( rule__Algorithm__Group_3__0 )? )
            {
            // InternalFromText.g:1765:1: ( ( rule__Algorithm__Group_3__0 )? )
            // InternalFromText.g:1766:2: ( rule__Algorithm__Group_3__0 )?
            {
             before(grammarAccess.getAlgorithmAccess().getGroup_3()); 
            // InternalFromText.g:1767:2: ( rule__Algorithm__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFromText.g:1767:3: rule__Algorithm__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Algorithm__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlgorithmAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__3__Impl"


    // $ANTLR start "rule__Algorithm__Group__4"
    // InternalFromText.g:1775:1: rule__Algorithm__Group__4 : rule__Algorithm__Group__4__Impl rule__Algorithm__Group__5 ;
    public final void rule__Algorithm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1779:1: ( rule__Algorithm__Group__4__Impl rule__Algorithm__Group__5 )
            // InternalFromText.g:1780:2: rule__Algorithm__Group__4__Impl rule__Algorithm__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Algorithm__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__4"


    // $ANTLR start "rule__Algorithm__Group__4__Impl"
    // InternalFromText.g:1787:1: rule__Algorithm__Group__4__Impl : ( ')' ) ;
    public final void rule__Algorithm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1791:1: ( ( ')' ) )
            // InternalFromText.g:1792:1: ( ')' )
            {
            // InternalFromText.g:1792:1: ( ')' )
            // InternalFromText.g:1793:2: ')'
            {
             before(grammarAccess.getAlgorithmAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__4__Impl"


    // $ANTLR start "rule__Algorithm__Group__5"
    // InternalFromText.g:1802:1: rule__Algorithm__Group__5 : rule__Algorithm__Group__5__Impl ;
    public final void rule__Algorithm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1806:1: ( rule__Algorithm__Group__5__Impl )
            // InternalFromText.g:1807:2: rule__Algorithm__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__5"


    // $ANTLR start "rule__Algorithm__Group__5__Impl"
    // InternalFromText.g:1813:1: rule__Algorithm__Group__5__Impl : ( ( rule__Algorithm__Group_5__0 )? ) ;
    public final void rule__Algorithm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1817:1: ( ( ( rule__Algorithm__Group_5__0 )? ) )
            // InternalFromText.g:1818:1: ( ( rule__Algorithm__Group_5__0 )? )
            {
            // InternalFromText.g:1818:1: ( ( rule__Algorithm__Group_5__0 )? )
            // InternalFromText.g:1819:2: ( rule__Algorithm__Group_5__0 )?
            {
             before(grammarAccess.getAlgorithmAccess().getGroup_5()); 
            // InternalFromText.g:1820:2: ( rule__Algorithm__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFromText.g:1820:3: rule__Algorithm__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Algorithm__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlgorithmAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__5__Impl"


    // $ANTLR start "rule__Algorithm__Group_3__0"
    // InternalFromText.g:1829:1: rule__Algorithm__Group_3__0 : rule__Algorithm__Group_3__0__Impl rule__Algorithm__Group_3__1 ;
    public final void rule__Algorithm__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1833:1: ( rule__Algorithm__Group_3__0__Impl rule__Algorithm__Group_3__1 )
            // InternalFromText.g:1834:2: rule__Algorithm__Group_3__0__Impl rule__Algorithm__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Algorithm__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_3__0"


    // $ANTLR start "rule__Algorithm__Group_3__0__Impl"
    // InternalFromText.g:1841:1: rule__Algorithm__Group_3__0__Impl : ( ( rule__Algorithm__InputsAssignment_3_0 ) ) ;
    public final void rule__Algorithm__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1845:1: ( ( ( rule__Algorithm__InputsAssignment_3_0 ) ) )
            // InternalFromText.g:1846:1: ( ( rule__Algorithm__InputsAssignment_3_0 ) )
            {
            // InternalFromText.g:1846:1: ( ( rule__Algorithm__InputsAssignment_3_0 ) )
            // InternalFromText.g:1847:2: ( rule__Algorithm__InputsAssignment_3_0 )
            {
             before(grammarAccess.getAlgorithmAccess().getInputsAssignment_3_0()); 
            // InternalFromText.g:1848:2: ( rule__Algorithm__InputsAssignment_3_0 )
            // InternalFromText.g:1848:3: rule__Algorithm__InputsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__InputsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getInputsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_3__0__Impl"


    // $ANTLR start "rule__Algorithm__Group_3__1"
    // InternalFromText.g:1856:1: rule__Algorithm__Group_3__1 : rule__Algorithm__Group_3__1__Impl ;
    public final void rule__Algorithm__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1860:1: ( rule__Algorithm__Group_3__1__Impl )
            // InternalFromText.g:1861:2: rule__Algorithm__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_3__1"


    // $ANTLR start "rule__Algorithm__Group_3__1__Impl"
    // InternalFromText.g:1867:1: rule__Algorithm__Group_3__1__Impl : ( ( rule__Algorithm__Group_3_1__0 )* ) ;
    public final void rule__Algorithm__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1871:1: ( ( ( rule__Algorithm__Group_3_1__0 )* ) )
            // InternalFromText.g:1872:1: ( ( rule__Algorithm__Group_3_1__0 )* )
            {
            // InternalFromText.g:1872:1: ( ( rule__Algorithm__Group_3_1__0 )* )
            // InternalFromText.g:1873:2: ( rule__Algorithm__Group_3_1__0 )*
            {
             before(grammarAccess.getAlgorithmAccess().getGroup_3_1()); 
            // InternalFromText.g:1874:2: ( rule__Algorithm__Group_3_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFromText.g:1874:3: rule__Algorithm__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Algorithm__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAlgorithmAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_3__1__Impl"


    // $ANTLR start "rule__Algorithm__Group_3_1__0"
    // InternalFromText.g:1883:1: rule__Algorithm__Group_3_1__0 : rule__Algorithm__Group_3_1__0__Impl rule__Algorithm__Group_3_1__1 ;
    public final void rule__Algorithm__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1887:1: ( rule__Algorithm__Group_3_1__0__Impl rule__Algorithm__Group_3_1__1 )
            // InternalFromText.g:1888:2: rule__Algorithm__Group_3_1__0__Impl rule__Algorithm__Group_3_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Algorithm__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_3_1__0"


    // $ANTLR start "rule__Algorithm__Group_3_1__0__Impl"
    // InternalFromText.g:1895:1: rule__Algorithm__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Algorithm__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1899:1: ( ( ',' ) )
            // InternalFromText.g:1900:1: ( ',' )
            {
            // InternalFromText.g:1900:1: ( ',' )
            // InternalFromText.g:1901:2: ','
            {
             before(grammarAccess.getAlgorithmAccess().getCommaKeyword_3_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_3_1__0__Impl"


    // $ANTLR start "rule__Algorithm__Group_3_1__1"
    // InternalFromText.g:1910:1: rule__Algorithm__Group_3_1__1 : rule__Algorithm__Group_3_1__1__Impl ;
    public final void rule__Algorithm__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1914:1: ( rule__Algorithm__Group_3_1__1__Impl )
            // InternalFromText.g:1915:2: rule__Algorithm__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_3_1__1"


    // $ANTLR start "rule__Algorithm__Group_3_1__1__Impl"
    // InternalFromText.g:1921:1: rule__Algorithm__Group_3_1__1__Impl : ( ( rule__Algorithm__InputsAssignment_3_1_1 ) ) ;
    public final void rule__Algorithm__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1925:1: ( ( ( rule__Algorithm__InputsAssignment_3_1_1 ) ) )
            // InternalFromText.g:1926:1: ( ( rule__Algorithm__InputsAssignment_3_1_1 ) )
            {
            // InternalFromText.g:1926:1: ( ( rule__Algorithm__InputsAssignment_3_1_1 ) )
            // InternalFromText.g:1927:2: ( rule__Algorithm__InputsAssignment_3_1_1 )
            {
             before(grammarAccess.getAlgorithmAccess().getInputsAssignment_3_1_1()); 
            // InternalFromText.g:1928:2: ( rule__Algorithm__InputsAssignment_3_1_1 )
            // InternalFromText.g:1928:3: rule__Algorithm__InputsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__InputsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getInputsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_3_1__1__Impl"


    // $ANTLR start "rule__Algorithm__Group_5__0"
    // InternalFromText.g:1937:1: rule__Algorithm__Group_5__0 : rule__Algorithm__Group_5__0__Impl rule__Algorithm__Group_5__1 ;
    public final void rule__Algorithm__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1941:1: ( rule__Algorithm__Group_5__0__Impl rule__Algorithm__Group_5__1 )
            // InternalFromText.g:1942:2: rule__Algorithm__Group_5__0__Impl rule__Algorithm__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Algorithm__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5__0"


    // $ANTLR start "rule__Algorithm__Group_5__0__Impl"
    // InternalFromText.g:1949:1: rule__Algorithm__Group_5__0__Impl : ( '>' ) ;
    public final void rule__Algorithm__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1953:1: ( ( '>' ) )
            // InternalFromText.g:1954:1: ( '>' )
            {
            // InternalFromText.g:1954:1: ( '>' )
            // InternalFromText.g:1955:2: '>'
            {
             before(grammarAccess.getAlgorithmAccess().getGreaterThanSignKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getGreaterThanSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5__0__Impl"


    // $ANTLR start "rule__Algorithm__Group_5__1"
    // InternalFromText.g:1964:1: rule__Algorithm__Group_5__1 : rule__Algorithm__Group_5__1__Impl rule__Algorithm__Group_5__2 ;
    public final void rule__Algorithm__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1968:1: ( rule__Algorithm__Group_5__1__Impl rule__Algorithm__Group_5__2 )
            // InternalFromText.g:1969:2: rule__Algorithm__Group_5__1__Impl rule__Algorithm__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Algorithm__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5__1"


    // $ANTLR start "rule__Algorithm__Group_5__1__Impl"
    // InternalFromText.g:1976:1: rule__Algorithm__Group_5__1__Impl : ( ( rule__Algorithm__FunctionsAssignment_5_1 ) ) ;
    public final void rule__Algorithm__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1980:1: ( ( ( rule__Algorithm__FunctionsAssignment_5_1 ) ) )
            // InternalFromText.g:1981:1: ( ( rule__Algorithm__FunctionsAssignment_5_1 ) )
            {
            // InternalFromText.g:1981:1: ( ( rule__Algorithm__FunctionsAssignment_5_1 ) )
            // InternalFromText.g:1982:2: ( rule__Algorithm__FunctionsAssignment_5_1 )
            {
             before(grammarAccess.getAlgorithmAccess().getFunctionsAssignment_5_1()); 
            // InternalFromText.g:1983:2: ( rule__Algorithm__FunctionsAssignment_5_1 )
            // InternalFromText.g:1983:3: rule__Algorithm__FunctionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__FunctionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getFunctionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5__1__Impl"


    // $ANTLR start "rule__Algorithm__Group_5__2"
    // InternalFromText.g:1991:1: rule__Algorithm__Group_5__2 : rule__Algorithm__Group_5__2__Impl rule__Algorithm__Group_5__3 ;
    public final void rule__Algorithm__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1995:1: ( rule__Algorithm__Group_5__2__Impl rule__Algorithm__Group_5__3 )
            // InternalFromText.g:1996:2: rule__Algorithm__Group_5__2__Impl rule__Algorithm__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__Algorithm__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5__2"


    // $ANTLR start "rule__Algorithm__Group_5__2__Impl"
    // InternalFromText.g:2003:1: rule__Algorithm__Group_5__2__Impl : ( '(' ) ;
    public final void rule__Algorithm__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2007:1: ( ( '(' ) )
            // InternalFromText.g:2008:1: ( '(' )
            {
            // InternalFromText.g:2008:1: ( '(' )
            // InternalFromText.g:2009:2: '('
            {
             before(grammarAccess.getAlgorithmAccess().getLeftParenthesisKeyword_5_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getLeftParenthesisKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5__2__Impl"


    // $ANTLR start "rule__Algorithm__Group_5__3"
    // InternalFromText.g:2018:1: rule__Algorithm__Group_5__3 : rule__Algorithm__Group_5__3__Impl rule__Algorithm__Group_5__4 ;
    public final void rule__Algorithm__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2022:1: ( rule__Algorithm__Group_5__3__Impl rule__Algorithm__Group_5__4 )
            // InternalFromText.g:2023:2: rule__Algorithm__Group_5__3__Impl rule__Algorithm__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__Algorithm__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5__3"


    // $ANTLR start "rule__Algorithm__Group_5__3__Impl"
    // InternalFromText.g:2030:1: rule__Algorithm__Group_5__3__Impl : ( ( rule__Algorithm__Group_5_3__0 )? ) ;
    public final void rule__Algorithm__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2034:1: ( ( ( rule__Algorithm__Group_5_3__0 )? ) )
            // InternalFromText.g:2035:1: ( ( rule__Algorithm__Group_5_3__0 )? )
            {
            // InternalFromText.g:2035:1: ( ( rule__Algorithm__Group_5_3__0 )? )
            // InternalFromText.g:2036:2: ( rule__Algorithm__Group_5_3__0 )?
            {
             before(grammarAccess.getAlgorithmAccess().getGroup_5_3()); 
            // InternalFromText.g:2037:2: ( rule__Algorithm__Group_5_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFromText.g:2037:3: rule__Algorithm__Group_5_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Algorithm__Group_5_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlgorithmAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5__3__Impl"


    // $ANTLR start "rule__Algorithm__Group_5__4"
    // InternalFromText.g:2045:1: rule__Algorithm__Group_5__4 : rule__Algorithm__Group_5__4__Impl ;
    public final void rule__Algorithm__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2049:1: ( rule__Algorithm__Group_5__4__Impl )
            // InternalFromText.g:2050:2: rule__Algorithm__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5__4"


    // $ANTLR start "rule__Algorithm__Group_5__4__Impl"
    // InternalFromText.g:2056:1: rule__Algorithm__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Algorithm__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2060:1: ( ( ')' ) )
            // InternalFromText.g:2061:1: ( ')' )
            {
            // InternalFromText.g:2061:1: ( ')' )
            // InternalFromText.g:2062:2: ')'
            {
             before(grammarAccess.getAlgorithmAccess().getRightParenthesisKeyword_5_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5__4__Impl"


    // $ANTLR start "rule__Algorithm__Group_5_3__0"
    // InternalFromText.g:2072:1: rule__Algorithm__Group_5_3__0 : rule__Algorithm__Group_5_3__0__Impl rule__Algorithm__Group_5_3__1 ;
    public final void rule__Algorithm__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2076:1: ( rule__Algorithm__Group_5_3__0__Impl rule__Algorithm__Group_5_3__1 )
            // InternalFromText.g:2077:2: rule__Algorithm__Group_5_3__0__Impl rule__Algorithm__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Algorithm__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5_3__0"


    // $ANTLR start "rule__Algorithm__Group_5_3__0__Impl"
    // InternalFromText.g:2084:1: rule__Algorithm__Group_5_3__0__Impl : ( ( rule__Algorithm__InputsAssignment_5_3_0 ) ) ;
    public final void rule__Algorithm__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2088:1: ( ( ( rule__Algorithm__InputsAssignment_5_3_0 ) ) )
            // InternalFromText.g:2089:1: ( ( rule__Algorithm__InputsAssignment_5_3_0 ) )
            {
            // InternalFromText.g:2089:1: ( ( rule__Algorithm__InputsAssignment_5_3_0 ) )
            // InternalFromText.g:2090:2: ( rule__Algorithm__InputsAssignment_5_3_0 )
            {
             before(grammarAccess.getAlgorithmAccess().getInputsAssignment_5_3_0()); 
            // InternalFromText.g:2091:2: ( rule__Algorithm__InputsAssignment_5_3_0 )
            // InternalFromText.g:2091:3: rule__Algorithm__InputsAssignment_5_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__InputsAssignment_5_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getInputsAssignment_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5_3__0__Impl"


    // $ANTLR start "rule__Algorithm__Group_5_3__1"
    // InternalFromText.g:2099:1: rule__Algorithm__Group_5_3__1 : rule__Algorithm__Group_5_3__1__Impl ;
    public final void rule__Algorithm__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2103:1: ( rule__Algorithm__Group_5_3__1__Impl )
            // InternalFromText.g:2104:2: rule__Algorithm__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5_3__1"


    // $ANTLR start "rule__Algorithm__Group_5_3__1__Impl"
    // InternalFromText.g:2110:1: rule__Algorithm__Group_5_3__1__Impl : ( ( rule__Algorithm__Group_5_3_1__0 )* ) ;
    public final void rule__Algorithm__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2114:1: ( ( ( rule__Algorithm__Group_5_3_1__0 )* ) )
            // InternalFromText.g:2115:1: ( ( rule__Algorithm__Group_5_3_1__0 )* )
            {
            // InternalFromText.g:2115:1: ( ( rule__Algorithm__Group_5_3_1__0 )* )
            // InternalFromText.g:2116:2: ( rule__Algorithm__Group_5_3_1__0 )*
            {
             before(grammarAccess.getAlgorithmAccess().getGroup_5_3_1()); 
            // InternalFromText.g:2117:2: ( rule__Algorithm__Group_5_3_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFromText.g:2117:3: rule__Algorithm__Group_5_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Algorithm__Group_5_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAlgorithmAccess().getGroup_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5_3__1__Impl"


    // $ANTLR start "rule__Algorithm__Group_5_3_1__0"
    // InternalFromText.g:2126:1: rule__Algorithm__Group_5_3_1__0 : rule__Algorithm__Group_5_3_1__0__Impl rule__Algorithm__Group_5_3_1__1 ;
    public final void rule__Algorithm__Group_5_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2130:1: ( rule__Algorithm__Group_5_3_1__0__Impl rule__Algorithm__Group_5_3_1__1 )
            // InternalFromText.g:2131:2: rule__Algorithm__Group_5_3_1__0__Impl rule__Algorithm__Group_5_3_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Algorithm__Group_5_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_5_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5_3_1__0"


    // $ANTLR start "rule__Algorithm__Group_5_3_1__0__Impl"
    // InternalFromText.g:2138:1: rule__Algorithm__Group_5_3_1__0__Impl : ( ',' ) ;
    public final void rule__Algorithm__Group_5_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2142:1: ( ( ',' ) )
            // InternalFromText.g:2143:1: ( ',' )
            {
            // InternalFromText.g:2143:1: ( ',' )
            // InternalFromText.g:2144:2: ','
            {
             before(grammarAccess.getAlgorithmAccess().getCommaKeyword_5_3_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getCommaKeyword_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5_3_1__0__Impl"


    // $ANTLR start "rule__Algorithm__Group_5_3_1__1"
    // InternalFromText.g:2153:1: rule__Algorithm__Group_5_3_1__1 : rule__Algorithm__Group_5_3_1__1__Impl ;
    public final void rule__Algorithm__Group_5_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2157:1: ( rule__Algorithm__Group_5_3_1__1__Impl )
            // InternalFromText.g:2158:2: rule__Algorithm__Group_5_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_5_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5_3_1__1"


    // $ANTLR start "rule__Algorithm__Group_5_3_1__1__Impl"
    // InternalFromText.g:2164:1: rule__Algorithm__Group_5_3_1__1__Impl : ( ( rule__Algorithm__InputsAssignment_5_3_1_1 ) ) ;
    public final void rule__Algorithm__Group_5_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2168:1: ( ( ( rule__Algorithm__InputsAssignment_5_3_1_1 ) ) )
            // InternalFromText.g:2169:1: ( ( rule__Algorithm__InputsAssignment_5_3_1_1 ) )
            {
            // InternalFromText.g:2169:1: ( ( rule__Algorithm__InputsAssignment_5_3_1_1 ) )
            // InternalFromText.g:2170:2: ( rule__Algorithm__InputsAssignment_5_3_1_1 )
            {
             before(grammarAccess.getAlgorithmAccess().getInputsAssignment_5_3_1_1()); 
            // InternalFromText.g:2171:2: ( rule__Algorithm__InputsAssignment_5_3_1_1 )
            // InternalFromText.g:2171:3: rule__Algorithm__InputsAssignment_5_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__InputsAssignment_5_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getInputsAssignment_5_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_5_3_1__1__Impl"


    // $ANTLR start "rule__Sum__Group__0"
    // InternalFromText.g:2180:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2184:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // InternalFromText.g:2185:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFromText.g:2192:1: rule__Sum__Group__0__Impl : ( () ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2196:1: ( ( () ) )
            // InternalFromText.g:2197:1: ( () )
            {
            // InternalFromText.g:2197:1: ( () )
            // InternalFromText.g:2198:2: ()
            {
             before(grammarAccess.getSumAccess().getSumAction_0()); 
            // InternalFromText.g:2199:2: ()
            // InternalFromText.g:2199:3: 
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
    // InternalFromText.g:2207:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2211:1: ( rule__Sum__Group__1__Impl )
            // InternalFromText.g:2212:2: rule__Sum__Group__1__Impl
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
    // InternalFromText.g:2218:1: rule__Sum__Group__1__Impl : ( 'Sum' ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2222:1: ( ( 'Sum' ) )
            // InternalFromText.g:2223:1: ( 'Sum' )
            {
            // InternalFromText.g:2223:1: ( 'Sum' )
            // InternalFromText.g:2224:2: 'Sum'
            {
             before(grammarAccess.getSumAccess().getSumKeyword_1()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__Feur__Group__0"
    // InternalFromText.g:2234:1: rule__Feur__Group__0 : rule__Feur__Group__0__Impl rule__Feur__Group__1 ;
    public final void rule__Feur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2238:1: ( rule__Feur__Group__0__Impl rule__Feur__Group__1 )
            // InternalFromText.g:2239:2: rule__Feur__Group__0__Impl rule__Feur__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Feur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feur__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feur__Group__0"


    // $ANTLR start "rule__Feur__Group__0__Impl"
    // InternalFromText.g:2246:1: rule__Feur__Group__0__Impl : ( () ) ;
    public final void rule__Feur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2250:1: ( ( () ) )
            // InternalFromText.g:2251:1: ( () )
            {
            // InternalFromText.g:2251:1: ( () )
            // InternalFromText.g:2252:2: ()
            {
             before(grammarAccess.getFeurAccess().getFeurAction_0()); 
            // InternalFromText.g:2253:2: ()
            // InternalFromText.g:2253:3: 
            {
            }

             after(grammarAccess.getFeurAccess().getFeurAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feur__Group__0__Impl"


    // $ANTLR start "rule__Feur__Group__1"
    // InternalFromText.g:2261:1: rule__Feur__Group__1 : rule__Feur__Group__1__Impl ;
    public final void rule__Feur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2265:1: ( rule__Feur__Group__1__Impl )
            // InternalFromText.g:2266:2: rule__Feur__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feur__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feur__Group__1"


    // $ANTLR start "rule__Feur__Group__1__Impl"
    // InternalFromText.g:2272:1: rule__Feur__Group__1__Impl : ( 'Feur' ) ;
    public final void rule__Feur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2276:1: ( ( 'Feur' ) )
            // InternalFromText.g:2277:1: ( 'Feur' )
            {
            // InternalFromText.g:2277:1: ( 'Feur' )
            // InternalFromText.g:2278:2: 'Feur'
            {
             before(grammarAccess.getFeurAccess().getFeurKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFeurAccess().getFeurKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feur__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalFromText.g:2288:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2292:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalFromText.g:2293:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalFromText.g:2300:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2304:1: ( ( () ) )
            // InternalFromText.g:2305:1: ( () )
            {
            // InternalFromText.g:2305:1: ( () )
            // InternalFromText.g:2306:2: ()
            {
             before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            // InternalFromText.g:2307:2: ()
            // InternalFromText.g:2307:3: 
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
    // InternalFromText.g:2315:1: rule__Function__Group__1 : rule__Function__Group__1__Impl ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2319:1: ( rule__Function__Group__1__Impl )
            // InternalFromText.g:2320:2: rule__Function__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalFromText.g:2326:1: rule__Function__Group__1__Impl : ( ( rule__Function__OperationAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2330:1: ( ( ( rule__Function__OperationAssignment_1 ) ) )
            // InternalFromText.g:2331:1: ( ( rule__Function__OperationAssignment_1 ) )
            {
            // InternalFromText.g:2331:1: ( ( rule__Function__OperationAssignment_1 ) )
            // InternalFromText.g:2332:2: ( rule__Function__OperationAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getOperationAssignment_1()); 
            // InternalFromText.g:2333:2: ( rule__Function__OperationAssignment_1 )
            // InternalFromText.g:2333:3: rule__Function__OperationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__OperationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getOperationAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ChaiseMinute__TablesAssignment_1_0"
    // InternalFromText.g:2342:1: rule__ChaiseMinute__TablesAssignment_1_0 : ( ruleTable ) ;
    public final void rule__ChaiseMinute__TablesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2346:1: ( ( ruleTable ) )
            // InternalFromText.g:2347:2: ( ruleTable )
            {
            // InternalFromText.g:2347:2: ( ruleTable )
            // InternalFromText.g:2348:3: ruleTable
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
    // InternalFromText.g:2357:1: rule__ChaiseMinute__TablesAssignment_1_1_1 : ( ruleTable ) ;
    public final void rule__ChaiseMinute__TablesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2361:1: ( ( ruleTable ) )
            // InternalFromText.g:2362:2: ( ruleTable )
            {
            // InternalFromText.g:2362:2: ( ruleTable )
            // InternalFromText.g:2363:3: ruleTable
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
    // InternalFromText.g:2372:1: rule__Table__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2376:1: ( ( ruleEString ) )
            // InternalFromText.g:2377:2: ( ruleEString )
            {
            // InternalFromText.g:2377:2: ( ruleEString )
            // InternalFromText.g:2378:3: ruleEString
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
    // InternalFromText.g:2387:1: rule__Table__IndexColumnAssignment_3 : ( ruleIndexColumn ) ;
    public final void rule__Table__IndexColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2391:1: ( ( ruleIndexColumn ) )
            // InternalFromText.g:2392:2: ( ruleIndexColumn )
            {
            // InternalFromText.g:2392:2: ( ruleIndexColumn )
            // InternalFromText.g:2393:3: ruleIndexColumn
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
    // InternalFromText.g:2402:1: rule__Table__ColumnsAssignment_5_0 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2406:1: ( ( ruleColumn ) )
            // InternalFromText.g:2407:2: ( ruleColumn )
            {
            // InternalFromText.g:2407:2: ( ruleColumn )
            // InternalFromText.g:2408:3: ruleColumn
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
    // InternalFromText.g:2417:1: rule__Table__ColumnsAssignment_5_1_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2421:1: ( ( ruleColumn ) )
            // InternalFromText.g:2422:2: ( ruleColumn )
            {
            // InternalFromText.g:2422:2: ( ruleColumn )
            // InternalFromText.g:2423:3: ruleColumn
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
    // InternalFromText.g:2432:1: rule__ColumnData__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__ColumnData__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2436:1: ( ( ruleDataType ) )
            // InternalFromText.g:2437:2: ( ruleDataType )
            {
            // InternalFromText.g:2437:2: ( ruleDataType )
            // InternalFromText.g:2438:3: ruleDataType
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
    // InternalFromText.g:2447:1: rule__ColumnData__IdAssignment_5 : ( ruleEString ) ;
    public final void rule__ColumnData__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2451:1: ( ( ruleEString ) )
            // InternalFromText.g:2452:2: ( ruleEString )
            {
            // InternalFromText.g:2452:2: ( ruleEString )
            // InternalFromText.g:2453:3: ruleEString
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
    // InternalFromText.g:2462:1: rule__ImportedColumn__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__ImportedColumn__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2466:1: ( ( ruleDataType ) )
            // InternalFromText.g:2467:2: ( ruleDataType )
            {
            // InternalFromText.g:2467:2: ( ruleDataType )
            // InternalFromText.g:2468:3: ruleDataType
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
    // InternalFromText.g:2477:1: rule__ImportedColumn__PathAssignment_5 : ( ruleEString ) ;
    public final void rule__ImportedColumn__PathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2481:1: ( ( ruleEString ) )
            // InternalFromText.g:2482:2: ( ruleEString )
            {
            // InternalFromText.g:2482:2: ( ruleEString )
            // InternalFromText.g:2483:3: ruleEString
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
    // InternalFromText.g:2492:1: rule__ImportedColumn__IdAssignment_7 : ( ruleEString ) ;
    public final void rule__ImportedColumn__IdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2496:1: ( ( ruleEString ) )
            // InternalFromText.g:2497:2: ( ruleEString )
            {
            // InternalFromText.g:2497:2: ( ruleEString )
            // InternalFromText.g:2498:3: ruleEString
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
    // InternalFromText.g:2507:1: rule__ComputedColumn__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__ComputedColumn__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2511:1: ( ( ruleDataType ) )
            // InternalFromText.g:2512:2: ( ruleDataType )
            {
            // InternalFromText.g:2512:2: ( ruleDataType )
            // InternalFromText.g:2513:3: ruleDataType
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
    // InternalFromText.g:2522:1: rule__ComputedColumn__AlgorithmAssignment_5 : ( ruleAlgorithm ) ;
    public final void rule__ComputedColumn__AlgorithmAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2526:1: ( ( ruleAlgorithm ) )
            // InternalFromText.g:2527:2: ( ruleAlgorithm )
            {
            // InternalFromText.g:2527:2: ( ruleAlgorithm )
            // InternalFromText.g:2528:3: ruleAlgorithm
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
    // InternalFromText.g:2537:1: rule__ComputedColumn__IdAssignment_7 : ( ruleEString ) ;
    public final void rule__ComputedColumn__IdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2541:1: ( ( ruleEString ) )
            // InternalFromText.g:2542:2: ( ruleEString )
            {
            // InternalFromText.g:2542:2: ( ruleEString )
            // InternalFromText.g:2543:3: ruleEString
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
    // InternalFromText.g:2552:1: rule__ColumnArgument__ColumnPathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ColumnArgument__ColumnPathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2556:1: ( ( RULE_STRING ) )
            // InternalFromText.g:2557:2: ( RULE_STRING )
            {
            // InternalFromText.g:2557:2: ( RULE_STRING )
            // InternalFromText.g:2558:3: RULE_STRING
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


    // $ANTLR start "rule__Algorithm__FunctionsAssignment_1"
    // InternalFromText.g:2567:1: rule__Algorithm__FunctionsAssignment_1 : ( ruleFunction ) ;
    public final void rule__Algorithm__FunctionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2571:1: ( ( ruleFunction ) )
            // InternalFromText.g:2572:2: ( ruleFunction )
            {
            // InternalFromText.g:2572:2: ( ruleFunction )
            // InternalFromText.g:2573:3: ruleFunction
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


    // $ANTLR start "rule__Algorithm__InputsAssignment_3_0"
    // InternalFromText.g:2582:1: rule__Algorithm__InputsAssignment_3_0 : ( ruleArgument ) ;
    public final void rule__Algorithm__InputsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2586:1: ( ( ruleArgument ) )
            // InternalFromText.g:2587:2: ( ruleArgument )
            {
            // InternalFromText.g:2587:2: ( ruleArgument )
            // InternalFromText.g:2588:3: ruleArgument
            {
             before(grammarAccess.getAlgorithmAccess().getInputsArgumentParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getAlgorithmAccess().getInputsArgumentParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__InputsAssignment_3_0"


    // $ANTLR start "rule__Algorithm__InputsAssignment_3_1_1"
    // InternalFromText.g:2597:1: rule__Algorithm__InputsAssignment_3_1_1 : ( ruleArgument ) ;
    public final void rule__Algorithm__InputsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2601:1: ( ( ruleArgument ) )
            // InternalFromText.g:2602:2: ( ruleArgument )
            {
            // InternalFromText.g:2602:2: ( ruleArgument )
            // InternalFromText.g:2603:3: ruleArgument
            {
             before(grammarAccess.getAlgorithmAccess().getInputsArgumentParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getAlgorithmAccess().getInputsArgumentParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__InputsAssignment_3_1_1"


    // $ANTLR start "rule__Algorithm__FunctionsAssignment_5_1"
    // InternalFromText.g:2612:1: rule__Algorithm__FunctionsAssignment_5_1 : ( ruleFunction ) ;
    public final void rule__Algorithm__FunctionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2616:1: ( ( ruleFunction ) )
            // InternalFromText.g:2617:2: ( ruleFunction )
            {
            // InternalFromText.g:2617:2: ( ruleFunction )
            // InternalFromText.g:2618:3: ruleFunction
            {
             before(grammarAccess.getAlgorithmAccess().getFunctionsFunctionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getAlgorithmAccess().getFunctionsFunctionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__FunctionsAssignment_5_1"


    // $ANTLR start "rule__Algorithm__InputsAssignment_5_3_0"
    // InternalFromText.g:2627:1: rule__Algorithm__InputsAssignment_5_3_0 : ( ruleArgument ) ;
    public final void rule__Algorithm__InputsAssignment_5_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2631:1: ( ( ruleArgument ) )
            // InternalFromText.g:2632:2: ( ruleArgument )
            {
            // InternalFromText.g:2632:2: ( ruleArgument )
            // InternalFromText.g:2633:3: ruleArgument
            {
             before(grammarAccess.getAlgorithmAccess().getInputsArgumentParserRuleCall_5_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getAlgorithmAccess().getInputsArgumentParserRuleCall_5_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__InputsAssignment_5_3_0"


    // $ANTLR start "rule__Algorithm__InputsAssignment_5_3_1_1"
    // InternalFromText.g:2642:1: rule__Algorithm__InputsAssignment_5_3_1_1 : ( ruleArgument ) ;
    public final void rule__Algorithm__InputsAssignment_5_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2646:1: ( ( ruleArgument ) )
            // InternalFromText.g:2647:2: ( ruleArgument )
            {
            // InternalFromText.g:2647:2: ( ruleArgument )
            // InternalFromText.g:2648:3: ruleArgument
            {
             before(grammarAccess.getAlgorithmAccess().getInputsArgumentParserRuleCall_5_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getAlgorithmAccess().getInputsArgumentParserRuleCall_5_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__InputsAssignment_5_3_1_1"


    // $ANTLR start "rule__Function__OperationAssignment_1"
    // InternalFromText.g:2657:1: rule__Function__OperationAssignment_1 : ( ruleOperation ) ;
    public final void rule__Function__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2661:1: ( ( ruleOperation ) )
            // InternalFromText.g:2662:2: ( ruleOperation )
            {
            // InternalFromText.g:2662:2: ( ruleOperation )
            // InternalFromText.g:2663:3: ruleOperation
            {
             before(grammarAccess.getFunctionAccess().getOperationOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getOperationOperationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__OperationAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A002L});
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});

}