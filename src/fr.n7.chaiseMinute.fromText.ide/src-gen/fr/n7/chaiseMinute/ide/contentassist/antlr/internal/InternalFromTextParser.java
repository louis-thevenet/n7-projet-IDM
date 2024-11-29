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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Int'", "'{'", "'}'", "','", "'data'", "'('", "')'", "':'", "'imported'", "'->'", "'computed'", "'>'"
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


    // $ANTLR start "ruleDataType"
    // InternalFromText.g:328:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:332:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalFromText.g:333:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalFromText.g:333:2: ( ( rule__DataType__Alternatives ) )
            // InternalFromText.g:334:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalFromText.g:335:3: ( rule__DataType__Alternatives )
            // InternalFromText.g:335:4: rule__DataType__Alternatives
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
    // InternalFromText.g:343:1: rule__Column__Alternatives : ( ( ruleColumnData ) | ( ruleComputedColumn ) | ( ruleImportedColumn ) );
    public final void rule__Column__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:347:1: ( ( ruleColumnData ) | ( ruleComputedColumn ) | ( ruleImportedColumn ) )
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
                    // InternalFromText.g:348:2: ( ruleColumnData )
                    {
                    // InternalFromText.g:348:2: ( ruleColumnData )
                    // InternalFromText.g:349:3: ruleColumnData
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
                    // InternalFromText.g:354:2: ( ruleComputedColumn )
                    {
                    // InternalFromText.g:354:2: ( ruleComputedColumn )
                    // InternalFromText.g:355:3: ruleComputedColumn
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
                    // InternalFromText.g:360:2: ( ruleImportedColumn )
                    {
                    // InternalFromText.g:360:2: ( ruleImportedColumn )
                    // InternalFromText.g:361:3: ruleImportedColumn
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
    // InternalFromText.g:370:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:374:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalFromText.g:375:2: ( RULE_STRING )
                    {
                    // InternalFromText.g:375:2: ( RULE_STRING )
                    // InternalFromText.g:376:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFromText.g:381:2: ( RULE_ID )
                    {
                    // InternalFromText.g:381:2: ( RULE_ID )
                    // InternalFromText.g:382:3: RULE_ID
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
    // InternalFromText.g:391:1: rule__DataType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Int' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:395:1: ( ( ( 'String' ) ) | ( ( 'Int' ) ) )
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
                    // InternalFromText.g:396:2: ( ( 'String' ) )
                    {
                    // InternalFromText.g:396:2: ( ( 'String' ) )
                    // InternalFromText.g:397:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalFromText.g:398:3: ( 'String' )
                    // InternalFromText.g:398:4: 'String'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFromText.g:402:2: ( ( 'Int' ) )
                    {
                    // InternalFromText.g:402:2: ( ( 'Int' ) )
                    // InternalFromText.g:403:3: ( 'Int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalFromText.g:404:3: ( 'Int' )
                    // InternalFromText.g:404:4: 'Int'
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
    // InternalFromText.g:412:1: rule__ChaiseMinute__Group__0 : rule__ChaiseMinute__Group__0__Impl rule__ChaiseMinute__Group__1 ;
    public final void rule__ChaiseMinute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:416:1: ( rule__ChaiseMinute__Group__0__Impl rule__ChaiseMinute__Group__1 )
            // InternalFromText.g:417:2: rule__ChaiseMinute__Group__0__Impl rule__ChaiseMinute__Group__1
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
    // InternalFromText.g:424:1: rule__ChaiseMinute__Group__0__Impl : ( '{' ) ;
    public final void rule__ChaiseMinute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:428:1: ( ( '{' ) )
            // InternalFromText.g:429:1: ( '{' )
            {
            // InternalFromText.g:429:1: ( '{' )
            // InternalFromText.g:430:2: '{'
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
    // InternalFromText.g:439:1: rule__ChaiseMinute__Group__1 : rule__ChaiseMinute__Group__1__Impl rule__ChaiseMinute__Group__2 ;
    public final void rule__ChaiseMinute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:443:1: ( rule__ChaiseMinute__Group__1__Impl rule__ChaiseMinute__Group__2 )
            // InternalFromText.g:444:2: rule__ChaiseMinute__Group__1__Impl rule__ChaiseMinute__Group__2
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
    // InternalFromText.g:451:1: rule__ChaiseMinute__Group__1__Impl : ( ( rule__ChaiseMinute__Group_1__0 )? ) ;
    public final void rule__ChaiseMinute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:455:1: ( ( ( rule__ChaiseMinute__Group_1__0 )? ) )
            // InternalFromText.g:456:1: ( ( rule__ChaiseMinute__Group_1__0 )? )
            {
            // InternalFromText.g:456:1: ( ( rule__ChaiseMinute__Group_1__0 )? )
            // InternalFromText.g:457:2: ( rule__ChaiseMinute__Group_1__0 )?
            {
             before(grammarAccess.getChaiseMinuteAccess().getGroup_1()); 
            // InternalFromText.g:458:2: ( rule__ChaiseMinute__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFromText.g:458:3: rule__ChaiseMinute__Group_1__0
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
    // InternalFromText.g:466:1: rule__ChaiseMinute__Group__2 : rule__ChaiseMinute__Group__2__Impl ;
    public final void rule__ChaiseMinute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:470:1: ( rule__ChaiseMinute__Group__2__Impl )
            // InternalFromText.g:471:2: rule__ChaiseMinute__Group__2__Impl
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
    // InternalFromText.g:477:1: rule__ChaiseMinute__Group__2__Impl : ( '}' ) ;
    public final void rule__ChaiseMinute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:481:1: ( ( '}' ) )
            // InternalFromText.g:482:1: ( '}' )
            {
            // InternalFromText.g:482:1: ( '}' )
            // InternalFromText.g:483:2: '}'
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
    // InternalFromText.g:493:1: rule__ChaiseMinute__Group_1__0 : rule__ChaiseMinute__Group_1__0__Impl rule__ChaiseMinute__Group_1__1 ;
    public final void rule__ChaiseMinute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:497:1: ( rule__ChaiseMinute__Group_1__0__Impl rule__ChaiseMinute__Group_1__1 )
            // InternalFromText.g:498:2: rule__ChaiseMinute__Group_1__0__Impl rule__ChaiseMinute__Group_1__1
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
    // InternalFromText.g:505:1: rule__ChaiseMinute__Group_1__0__Impl : ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) ) ;
    public final void rule__ChaiseMinute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:509:1: ( ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) ) )
            // InternalFromText.g:510:1: ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) )
            {
            // InternalFromText.g:510:1: ( ( rule__ChaiseMinute__TablesAssignment_1_0 ) )
            // InternalFromText.g:511:2: ( rule__ChaiseMinute__TablesAssignment_1_0 )
            {
             before(grammarAccess.getChaiseMinuteAccess().getTablesAssignment_1_0()); 
            // InternalFromText.g:512:2: ( rule__ChaiseMinute__TablesAssignment_1_0 )
            // InternalFromText.g:512:3: rule__ChaiseMinute__TablesAssignment_1_0
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
    // InternalFromText.g:520:1: rule__ChaiseMinute__Group_1__1 : rule__ChaiseMinute__Group_1__1__Impl ;
    public final void rule__ChaiseMinute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:524:1: ( rule__ChaiseMinute__Group_1__1__Impl )
            // InternalFromText.g:525:2: rule__ChaiseMinute__Group_1__1__Impl
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
    // InternalFromText.g:531:1: rule__ChaiseMinute__Group_1__1__Impl : ( ( rule__ChaiseMinute__Group_1_1__0 )* ) ;
    public final void rule__ChaiseMinute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:535:1: ( ( ( rule__ChaiseMinute__Group_1_1__0 )* ) )
            // InternalFromText.g:536:1: ( ( rule__ChaiseMinute__Group_1_1__0 )* )
            {
            // InternalFromText.g:536:1: ( ( rule__ChaiseMinute__Group_1_1__0 )* )
            // InternalFromText.g:537:2: ( rule__ChaiseMinute__Group_1_1__0 )*
            {
             before(grammarAccess.getChaiseMinuteAccess().getGroup_1_1()); 
            // InternalFromText.g:538:2: ( rule__ChaiseMinute__Group_1_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13||LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFromText.g:538:3: rule__ChaiseMinute__Group_1_1__0
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
    // InternalFromText.g:547:1: rule__ChaiseMinute__Group_1_1__0 : rule__ChaiseMinute__Group_1_1__0__Impl rule__ChaiseMinute__Group_1_1__1 ;
    public final void rule__ChaiseMinute__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:551:1: ( rule__ChaiseMinute__Group_1_1__0__Impl rule__ChaiseMinute__Group_1_1__1 )
            // InternalFromText.g:552:2: rule__ChaiseMinute__Group_1_1__0__Impl rule__ChaiseMinute__Group_1_1__1
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
    // InternalFromText.g:559:1: rule__ChaiseMinute__Group_1_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__ChaiseMinute__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:563:1: ( ( ( ',' )? ) )
            // InternalFromText.g:564:1: ( ( ',' )? )
            {
            // InternalFromText.g:564:1: ( ( ',' )? )
            // InternalFromText.g:565:2: ( ',' )?
            {
             before(grammarAccess.getChaiseMinuteAccess().getCommaKeyword_1_1_0()); 
            // InternalFromText.g:566:2: ( ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFromText.g:566:3: ','
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
    // InternalFromText.g:574:1: rule__ChaiseMinute__Group_1_1__1 : rule__ChaiseMinute__Group_1_1__1__Impl ;
    public final void rule__ChaiseMinute__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:578:1: ( rule__ChaiseMinute__Group_1_1__1__Impl )
            // InternalFromText.g:579:2: rule__ChaiseMinute__Group_1_1__1__Impl
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
    // InternalFromText.g:585:1: rule__ChaiseMinute__Group_1_1__1__Impl : ( ( rule__ChaiseMinute__TablesAssignment_1_1_1 ) ) ;
    public final void rule__ChaiseMinute__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:589:1: ( ( ( rule__ChaiseMinute__TablesAssignment_1_1_1 ) ) )
            // InternalFromText.g:590:1: ( ( rule__ChaiseMinute__TablesAssignment_1_1_1 ) )
            {
            // InternalFromText.g:590:1: ( ( rule__ChaiseMinute__TablesAssignment_1_1_1 ) )
            // InternalFromText.g:591:2: ( rule__ChaiseMinute__TablesAssignment_1_1_1 )
            {
             before(grammarAccess.getChaiseMinuteAccess().getTablesAssignment_1_1_1()); 
            // InternalFromText.g:592:2: ( rule__ChaiseMinute__TablesAssignment_1_1_1 )
            // InternalFromText.g:592:3: rule__ChaiseMinute__TablesAssignment_1_1_1
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
    // InternalFromText.g:601:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:605:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalFromText.g:606:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalFromText.g:613:1: rule__Table__Group__0__Impl : ( '{' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:617:1: ( ( '{' ) )
            // InternalFromText.g:618:1: ( '{' )
            {
            // InternalFromText.g:618:1: ( '{' )
            // InternalFromText.g:619:2: '{'
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
    // InternalFromText.g:628:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:632:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalFromText.g:633:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalFromText.g:640:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:644:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalFromText.g:645:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalFromText.g:645:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalFromText.g:646:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalFromText.g:647:2: ( rule__Table__NameAssignment_1 )
            // InternalFromText.g:647:3: rule__Table__NameAssignment_1
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
    // InternalFromText.g:655:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:659:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalFromText.g:660:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalFromText.g:667:1: rule__Table__Group__2__Impl : ( ',' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:671:1: ( ( ',' ) )
            // InternalFromText.g:672:1: ( ',' )
            {
            // InternalFromText.g:672:1: ( ',' )
            // InternalFromText.g:673:2: ','
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
    // InternalFromText.g:682:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:686:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalFromText.g:687:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalFromText.g:694:1: rule__Table__Group__3__Impl : ( ( rule__Table__IndexColumnAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:698:1: ( ( ( rule__Table__IndexColumnAssignment_3 ) ) )
            // InternalFromText.g:699:1: ( ( rule__Table__IndexColumnAssignment_3 ) )
            {
            // InternalFromText.g:699:1: ( ( rule__Table__IndexColumnAssignment_3 ) )
            // InternalFromText.g:700:2: ( rule__Table__IndexColumnAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getIndexColumnAssignment_3()); 
            // InternalFromText.g:701:2: ( rule__Table__IndexColumnAssignment_3 )
            // InternalFromText.g:701:3: rule__Table__IndexColumnAssignment_3
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
    // InternalFromText.g:709:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:713:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalFromText.g:714:2: rule__Table__Group__4__Impl rule__Table__Group__5
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
    // InternalFromText.g:721:1: rule__Table__Group__4__Impl : ( ',' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:725:1: ( ( ',' ) )
            // InternalFromText.g:726:1: ( ',' )
            {
            // InternalFromText.g:726:1: ( ',' )
            // InternalFromText.g:727:2: ','
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
    // InternalFromText.g:736:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:740:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalFromText.g:741:2: rule__Table__Group__5__Impl rule__Table__Group__6
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
    // InternalFromText.g:748:1: rule__Table__Group__5__Impl : ( ( rule__Table__Group_5__0 )? ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:752:1: ( ( ( rule__Table__Group_5__0 )? ) )
            // InternalFromText.g:753:1: ( ( rule__Table__Group_5__0 )? )
            {
            // InternalFromText.g:753:1: ( ( rule__Table__Group_5__0 )? )
            // InternalFromText.g:754:2: ( rule__Table__Group_5__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_5()); 
            // InternalFromText.g:755:2: ( rule__Table__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16||LA7_0==20||LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFromText.g:755:3: rule__Table__Group_5__0
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
    // InternalFromText.g:763:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:767:1: ( rule__Table__Group__6__Impl )
            // InternalFromText.g:768:2: rule__Table__Group__6__Impl
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
    // InternalFromText.g:774:1: rule__Table__Group__6__Impl : ( '}' ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:778:1: ( ( '}' ) )
            // InternalFromText.g:779:1: ( '}' )
            {
            // InternalFromText.g:779:1: ( '}' )
            // InternalFromText.g:780:2: '}'
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
    // InternalFromText.g:790:1: rule__Table__Group_5__0 : rule__Table__Group_5__0__Impl rule__Table__Group_5__1 ;
    public final void rule__Table__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:794:1: ( rule__Table__Group_5__0__Impl rule__Table__Group_5__1 )
            // InternalFromText.g:795:2: rule__Table__Group_5__0__Impl rule__Table__Group_5__1
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
    // InternalFromText.g:802:1: rule__Table__Group_5__0__Impl : ( ( rule__Table__ColumnsAssignment_5_0 ) ) ;
    public final void rule__Table__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:806:1: ( ( ( rule__Table__ColumnsAssignment_5_0 ) ) )
            // InternalFromText.g:807:1: ( ( rule__Table__ColumnsAssignment_5_0 ) )
            {
            // InternalFromText.g:807:1: ( ( rule__Table__ColumnsAssignment_5_0 ) )
            // InternalFromText.g:808:2: ( rule__Table__ColumnsAssignment_5_0 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_0()); 
            // InternalFromText.g:809:2: ( rule__Table__ColumnsAssignment_5_0 )
            // InternalFromText.g:809:3: rule__Table__ColumnsAssignment_5_0
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
    // InternalFromText.g:817:1: rule__Table__Group_5__1 : rule__Table__Group_5__1__Impl ;
    public final void rule__Table__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:821:1: ( rule__Table__Group_5__1__Impl )
            // InternalFromText.g:822:2: rule__Table__Group_5__1__Impl
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
    // InternalFromText.g:828:1: rule__Table__Group_5__1__Impl : ( ( rule__Table__Group_5_1__0 )* ) ;
    public final void rule__Table__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:832:1: ( ( ( rule__Table__Group_5_1__0 )* ) )
            // InternalFromText.g:833:1: ( ( rule__Table__Group_5_1__0 )* )
            {
            // InternalFromText.g:833:1: ( ( rule__Table__Group_5_1__0 )* )
            // InternalFromText.g:834:2: ( rule__Table__Group_5_1__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_5_1()); 
            // InternalFromText.g:835:2: ( rule__Table__Group_5_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFromText.g:835:3: rule__Table__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalFromText.g:844:1: rule__Table__Group_5_1__0 : rule__Table__Group_5_1__0__Impl rule__Table__Group_5_1__1 ;
    public final void rule__Table__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:848:1: ( rule__Table__Group_5_1__0__Impl rule__Table__Group_5_1__1 )
            // InternalFromText.g:849:2: rule__Table__Group_5_1__0__Impl rule__Table__Group_5_1__1
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
    // InternalFromText.g:856:1: rule__Table__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:860:1: ( ( ',' ) )
            // InternalFromText.g:861:1: ( ',' )
            {
            // InternalFromText.g:861:1: ( ',' )
            // InternalFromText.g:862:2: ','
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
    // InternalFromText.g:871:1: rule__Table__Group_5_1__1 : rule__Table__Group_5_1__1__Impl ;
    public final void rule__Table__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:875:1: ( rule__Table__Group_5_1__1__Impl )
            // InternalFromText.g:876:2: rule__Table__Group_5_1__1__Impl
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
    // InternalFromText.g:882:1: rule__Table__Group_5_1__1__Impl : ( ( rule__Table__ColumnsAssignment_5_1_1 ) ) ;
    public final void rule__Table__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:886:1: ( ( ( rule__Table__ColumnsAssignment_5_1_1 ) ) )
            // InternalFromText.g:887:1: ( ( rule__Table__ColumnsAssignment_5_1_1 ) )
            {
            // InternalFromText.g:887:1: ( ( rule__Table__ColumnsAssignment_5_1_1 ) )
            // InternalFromText.g:888:2: ( rule__Table__ColumnsAssignment_5_1_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_1_1()); 
            // InternalFromText.g:889:2: ( rule__Table__ColumnsAssignment_5_1_1 )
            // InternalFromText.g:889:3: rule__Table__ColumnsAssignment_5_1_1
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
    // InternalFromText.g:898:1: rule__ColumnData__Group__0 : rule__ColumnData__Group__0__Impl rule__ColumnData__Group__1 ;
    public final void rule__ColumnData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:902:1: ( rule__ColumnData__Group__0__Impl rule__ColumnData__Group__1 )
            // InternalFromText.g:903:2: rule__ColumnData__Group__0__Impl rule__ColumnData__Group__1
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
    // InternalFromText.g:910:1: rule__ColumnData__Group__0__Impl : ( 'data' ) ;
    public final void rule__ColumnData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:914:1: ( ( 'data' ) )
            // InternalFromText.g:915:1: ( 'data' )
            {
            // InternalFromText.g:915:1: ( 'data' )
            // InternalFromText.g:916:2: 'data'
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
    // InternalFromText.g:925:1: rule__ColumnData__Group__1 : rule__ColumnData__Group__1__Impl rule__ColumnData__Group__2 ;
    public final void rule__ColumnData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:929:1: ( rule__ColumnData__Group__1__Impl rule__ColumnData__Group__2 )
            // InternalFromText.g:930:2: rule__ColumnData__Group__1__Impl rule__ColumnData__Group__2
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
    // InternalFromText.g:937:1: rule__ColumnData__Group__1__Impl : ( '(' ) ;
    public final void rule__ColumnData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:941:1: ( ( '(' ) )
            // InternalFromText.g:942:1: ( '(' )
            {
            // InternalFromText.g:942:1: ( '(' )
            // InternalFromText.g:943:2: '('
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
    // InternalFromText.g:952:1: rule__ColumnData__Group__2 : rule__ColumnData__Group__2__Impl rule__ColumnData__Group__3 ;
    public final void rule__ColumnData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:956:1: ( rule__ColumnData__Group__2__Impl rule__ColumnData__Group__3 )
            // InternalFromText.g:957:2: rule__ColumnData__Group__2__Impl rule__ColumnData__Group__3
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
    // InternalFromText.g:964:1: rule__ColumnData__Group__2__Impl : ( ( rule__ColumnData__TypeAssignment_2 ) ) ;
    public final void rule__ColumnData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:968:1: ( ( ( rule__ColumnData__TypeAssignment_2 ) ) )
            // InternalFromText.g:969:1: ( ( rule__ColumnData__TypeAssignment_2 ) )
            {
            // InternalFromText.g:969:1: ( ( rule__ColumnData__TypeAssignment_2 ) )
            // InternalFromText.g:970:2: ( rule__ColumnData__TypeAssignment_2 )
            {
             before(grammarAccess.getColumnDataAccess().getTypeAssignment_2()); 
            // InternalFromText.g:971:2: ( rule__ColumnData__TypeAssignment_2 )
            // InternalFromText.g:971:3: rule__ColumnData__TypeAssignment_2
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
    // InternalFromText.g:979:1: rule__ColumnData__Group__3 : rule__ColumnData__Group__3__Impl rule__ColumnData__Group__4 ;
    public final void rule__ColumnData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:983:1: ( rule__ColumnData__Group__3__Impl rule__ColumnData__Group__4 )
            // InternalFromText.g:984:2: rule__ColumnData__Group__3__Impl rule__ColumnData__Group__4
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
    // InternalFromText.g:991:1: rule__ColumnData__Group__3__Impl : ( ')' ) ;
    public final void rule__ColumnData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:995:1: ( ( ')' ) )
            // InternalFromText.g:996:1: ( ')' )
            {
            // InternalFromText.g:996:1: ( ')' )
            // InternalFromText.g:997:2: ')'
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
    // InternalFromText.g:1006:1: rule__ColumnData__Group__4 : rule__ColumnData__Group__4__Impl rule__ColumnData__Group__5 ;
    public final void rule__ColumnData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1010:1: ( rule__ColumnData__Group__4__Impl rule__ColumnData__Group__5 )
            // InternalFromText.g:1011:2: rule__ColumnData__Group__4__Impl rule__ColumnData__Group__5
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
    // InternalFromText.g:1018:1: rule__ColumnData__Group__4__Impl : ( ':' ) ;
    public final void rule__ColumnData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1022:1: ( ( ':' ) )
            // InternalFromText.g:1023:1: ( ':' )
            {
            // InternalFromText.g:1023:1: ( ':' )
            // InternalFromText.g:1024:2: ':'
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
    // InternalFromText.g:1033:1: rule__ColumnData__Group__5 : rule__ColumnData__Group__5__Impl ;
    public final void rule__ColumnData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1037:1: ( rule__ColumnData__Group__5__Impl )
            // InternalFromText.g:1038:2: rule__ColumnData__Group__5__Impl
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
    // InternalFromText.g:1044:1: rule__ColumnData__Group__5__Impl : ( ( rule__ColumnData__IdAssignment_5 ) ) ;
    public final void rule__ColumnData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1048:1: ( ( ( rule__ColumnData__IdAssignment_5 ) ) )
            // InternalFromText.g:1049:1: ( ( rule__ColumnData__IdAssignment_5 ) )
            {
            // InternalFromText.g:1049:1: ( ( rule__ColumnData__IdAssignment_5 ) )
            // InternalFromText.g:1050:2: ( rule__ColumnData__IdAssignment_5 )
            {
             before(grammarAccess.getColumnDataAccess().getIdAssignment_5()); 
            // InternalFromText.g:1051:2: ( rule__ColumnData__IdAssignment_5 )
            // InternalFromText.g:1051:3: rule__ColumnData__IdAssignment_5
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
    // InternalFromText.g:1060:1: rule__ImportedColumn__Group__0 : rule__ImportedColumn__Group__0__Impl rule__ImportedColumn__Group__1 ;
    public final void rule__ImportedColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1064:1: ( rule__ImportedColumn__Group__0__Impl rule__ImportedColumn__Group__1 )
            // InternalFromText.g:1065:2: rule__ImportedColumn__Group__0__Impl rule__ImportedColumn__Group__1
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
    // InternalFromText.g:1072:1: rule__ImportedColumn__Group__0__Impl : ( 'imported' ) ;
    public final void rule__ImportedColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1076:1: ( ( 'imported' ) )
            // InternalFromText.g:1077:1: ( 'imported' )
            {
            // InternalFromText.g:1077:1: ( 'imported' )
            // InternalFromText.g:1078:2: 'imported'
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
    // InternalFromText.g:1087:1: rule__ImportedColumn__Group__1 : rule__ImportedColumn__Group__1__Impl rule__ImportedColumn__Group__2 ;
    public final void rule__ImportedColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1091:1: ( rule__ImportedColumn__Group__1__Impl rule__ImportedColumn__Group__2 )
            // InternalFromText.g:1092:2: rule__ImportedColumn__Group__1__Impl rule__ImportedColumn__Group__2
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
    // InternalFromText.g:1099:1: rule__ImportedColumn__Group__1__Impl : ( '(' ) ;
    public final void rule__ImportedColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1103:1: ( ( '(' ) )
            // InternalFromText.g:1104:1: ( '(' )
            {
            // InternalFromText.g:1104:1: ( '(' )
            // InternalFromText.g:1105:2: '('
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
    // InternalFromText.g:1114:1: rule__ImportedColumn__Group__2 : rule__ImportedColumn__Group__2__Impl rule__ImportedColumn__Group__3 ;
    public final void rule__ImportedColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1118:1: ( rule__ImportedColumn__Group__2__Impl rule__ImportedColumn__Group__3 )
            // InternalFromText.g:1119:2: rule__ImportedColumn__Group__2__Impl rule__ImportedColumn__Group__3
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
    // InternalFromText.g:1126:1: rule__ImportedColumn__Group__2__Impl : ( ( rule__ImportedColumn__TypeAssignment_2 ) ) ;
    public final void rule__ImportedColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1130:1: ( ( ( rule__ImportedColumn__TypeAssignment_2 ) ) )
            // InternalFromText.g:1131:1: ( ( rule__ImportedColumn__TypeAssignment_2 ) )
            {
            // InternalFromText.g:1131:1: ( ( rule__ImportedColumn__TypeAssignment_2 ) )
            // InternalFromText.g:1132:2: ( rule__ImportedColumn__TypeAssignment_2 )
            {
             before(grammarAccess.getImportedColumnAccess().getTypeAssignment_2()); 
            // InternalFromText.g:1133:2: ( rule__ImportedColumn__TypeAssignment_2 )
            // InternalFromText.g:1133:3: rule__ImportedColumn__TypeAssignment_2
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
    // InternalFromText.g:1141:1: rule__ImportedColumn__Group__3 : rule__ImportedColumn__Group__3__Impl rule__ImportedColumn__Group__4 ;
    public final void rule__ImportedColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1145:1: ( rule__ImportedColumn__Group__3__Impl rule__ImportedColumn__Group__4 )
            // InternalFromText.g:1146:2: rule__ImportedColumn__Group__3__Impl rule__ImportedColumn__Group__4
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
    // InternalFromText.g:1153:1: rule__ImportedColumn__Group__3__Impl : ( ')' ) ;
    public final void rule__ImportedColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1157:1: ( ( ')' ) )
            // InternalFromText.g:1158:1: ( ')' )
            {
            // InternalFromText.g:1158:1: ( ')' )
            // InternalFromText.g:1159:2: ')'
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
    // InternalFromText.g:1168:1: rule__ImportedColumn__Group__4 : rule__ImportedColumn__Group__4__Impl rule__ImportedColumn__Group__5 ;
    public final void rule__ImportedColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1172:1: ( rule__ImportedColumn__Group__4__Impl rule__ImportedColumn__Group__5 )
            // InternalFromText.g:1173:2: rule__ImportedColumn__Group__4__Impl rule__ImportedColumn__Group__5
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
    // InternalFromText.g:1180:1: rule__ImportedColumn__Group__4__Impl : ( ':' ) ;
    public final void rule__ImportedColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1184:1: ( ( ':' ) )
            // InternalFromText.g:1185:1: ( ':' )
            {
            // InternalFromText.g:1185:1: ( ':' )
            // InternalFromText.g:1186:2: ':'
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
    // InternalFromText.g:1195:1: rule__ImportedColumn__Group__5 : rule__ImportedColumn__Group__5__Impl rule__ImportedColumn__Group__6 ;
    public final void rule__ImportedColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1199:1: ( rule__ImportedColumn__Group__5__Impl rule__ImportedColumn__Group__6 )
            // InternalFromText.g:1200:2: rule__ImportedColumn__Group__5__Impl rule__ImportedColumn__Group__6
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
    // InternalFromText.g:1207:1: rule__ImportedColumn__Group__5__Impl : ( ( rule__ImportedColumn__PathAssignment_5 ) ) ;
    public final void rule__ImportedColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1211:1: ( ( ( rule__ImportedColumn__PathAssignment_5 ) ) )
            // InternalFromText.g:1212:1: ( ( rule__ImportedColumn__PathAssignment_5 ) )
            {
            // InternalFromText.g:1212:1: ( ( rule__ImportedColumn__PathAssignment_5 ) )
            // InternalFromText.g:1213:2: ( rule__ImportedColumn__PathAssignment_5 )
            {
             before(grammarAccess.getImportedColumnAccess().getPathAssignment_5()); 
            // InternalFromText.g:1214:2: ( rule__ImportedColumn__PathAssignment_5 )
            // InternalFromText.g:1214:3: rule__ImportedColumn__PathAssignment_5
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
    // InternalFromText.g:1222:1: rule__ImportedColumn__Group__6 : rule__ImportedColumn__Group__6__Impl rule__ImportedColumn__Group__7 ;
    public final void rule__ImportedColumn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1226:1: ( rule__ImportedColumn__Group__6__Impl rule__ImportedColumn__Group__7 )
            // InternalFromText.g:1227:2: rule__ImportedColumn__Group__6__Impl rule__ImportedColumn__Group__7
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
    // InternalFromText.g:1234:1: rule__ImportedColumn__Group__6__Impl : ( '->' ) ;
    public final void rule__ImportedColumn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1238:1: ( ( '->' ) )
            // InternalFromText.g:1239:1: ( '->' )
            {
            // InternalFromText.g:1239:1: ( '->' )
            // InternalFromText.g:1240:2: '->'
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
    // InternalFromText.g:1249:1: rule__ImportedColumn__Group__7 : rule__ImportedColumn__Group__7__Impl ;
    public final void rule__ImportedColumn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1253:1: ( rule__ImportedColumn__Group__7__Impl )
            // InternalFromText.g:1254:2: rule__ImportedColumn__Group__7__Impl
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
    // InternalFromText.g:1260:1: rule__ImportedColumn__Group__7__Impl : ( ( rule__ImportedColumn__IdAssignment_7 ) ) ;
    public final void rule__ImportedColumn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1264:1: ( ( ( rule__ImportedColumn__IdAssignment_7 ) ) )
            // InternalFromText.g:1265:1: ( ( rule__ImportedColumn__IdAssignment_7 ) )
            {
            // InternalFromText.g:1265:1: ( ( rule__ImportedColumn__IdAssignment_7 ) )
            // InternalFromText.g:1266:2: ( rule__ImportedColumn__IdAssignment_7 )
            {
             before(grammarAccess.getImportedColumnAccess().getIdAssignment_7()); 
            // InternalFromText.g:1267:2: ( rule__ImportedColumn__IdAssignment_7 )
            // InternalFromText.g:1267:3: rule__ImportedColumn__IdAssignment_7
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
    // InternalFromText.g:1276:1: rule__ComputedColumn__Group__0 : rule__ComputedColumn__Group__0__Impl rule__ComputedColumn__Group__1 ;
    public final void rule__ComputedColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1280:1: ( rule__ComputedColumn__Group__0__Impl rule__ComputedColumn__Group__1 )
            // InternalFromText.g:1281:2: rule__ComputedColumn__Group__0__Impl rule__ComputedColumn__Group__1
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
    // InternalFromText.g:1288:1: rule__ComputedColumn__Group__0__Impl : ( 'computed' ) ;
    public final void rule__ComputedColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1292:1: ( ( 'computed' ) )
            // InternalFromText.g:1293:1: ( 'computed' )
            {
            // InternalFromText.g:1293:1: ( 'computed' )
            // InternalFromText.g:1294:2: 'computed'
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
    // InternalFromText.g:1303:1: rule__ComputedColumn__Group__1 : rule__ComputedColumn__Group__1__Impl rule__ComputedColumn__Group__2 ;
    public final void rule__ComputedColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1307:1: ( rule__ComputedColumn__Group__1__Impl rule__ComputedColumn__Group__2 )
            // InternalFromText.g:1308:2: rule__ComputedColumn__Group__1__Impl rule__ComputedColumn__Group__2
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
    // InternalFromText.g:1315:1: rule__ComputedColumn__Group__1__Impl : ( '(' ) ;
    public final void rule__ComputedColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1319:1: ( ( '(' ) )
            // InternalFromText.g:1320:1: ( '(' )
            {
            // InternalFromText.g:1320:1: ( '(' )
            // InternalFromText.g:1321:2: '('
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
    // InternalFromText.g:1330:1: rule__ComputedColumn__Group__2 : rule__ComputedColumn__Group__2__Impl rule__ComputedColumn__Group__3 ;
    public final void rule__ComputedColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1334:1: ( rule__ComputedColumn__Group__2__Impl rule__ComputedColumn__Group__3 )
            // InternalFromText.g:1335:2: rule__ComputedColumn__Group__2__Impl rule__ComputedColumn__Group__3
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
    // InternalFromText.g:1342:1: rule__ComputedColumn__Group__2__Impl : ( ( rule__ComputedColumn__TypeAssignment_2 ) ) ;
    public final void rule__ComputedColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1346:1: ( ( ( rule__ComputedColumn__TypeAssignment_2 ) ) )
            // InternalFromText.g:1347:1: ( ( rule__ComputedColumn__TypeAssignment_2 ) )
            {
            // InternalFromText.g:1347:1: ( ( rule__ComputedColumn__TypeAssignment_2 ) )
            // InternalFromText.g:1348:2: ( rule__ComputedColumn__TypeAssignment_2 )
            {
             before(grammarAccess.getComputedColumnAccess().getTypeAssignment_2()); 
            // InternalFromText.g:1349:2: ( rule__ComputedColumn__TypeAssignment_2 )
            // InternalFromText.g:1349:3: rule__ComputedColumn__TypeAssignment_2
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
    // InternalFromText.g:1357:1: rule__ComputedColumn__Group__3 : rule__ComputedColumn__Group__3__Impl rule__ComputedColumn__Group__4 ;
    public final void rule__ComputedColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1361:1: ( rule__ComputedColumn__Group__3__Impl rule__ComputedColumn__Group__4 )
            // InternalFromText.g:1362:2: rule__ComputedColumn__Group__3__Impl rule__ComputedColumn__Group__4
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
    // InternalFromText.g:1369:1: rule__ComputedColumn__Group__3__Impl : ( ')' ) ;
    public final void rule__ComputedColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1373:1: ( ( ')' ) )
            // InternalFromText.g:1374:1: ( ')' )
            {
            // InternalFromText.g:1374:1: ( ')' )
            // InternalFromText.g:1375:2: ')'
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
    // InternalFromText.g:1384:1: rule__ComputedColumn__Group__4 : rule__ComputedColumn__Group__4__Impl rule__ComputedColumn__Group__5 ;
    public final void rule__ComputedColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1388:1: ( rule__ComputedColumn__Group__4__Impl rule__ComputedColumn__Group__5 )
            // InternalFromText.g:1389:2: rule__ComputedColumn__Group__4__Impl rule__ComputedColumn__Group__5
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
    // InternalFromText.g:1396:1: rule__ComputedColumn__Group__4__Impl : ( ':' ) ;
    public final void rule__ComputedColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1400:1: ( ( ':' ) )
            // InternalFromText.g:1401:1: ( ':' )
            {
            // InternalFromText.g:1401:1: ( ':' )
            // InternalFromText.g:1402:2: ':'
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
    // InternalFromText.g:1411:1: rule__ComputedColumn__Group__5 : rule__ComputedColumn__Group__5__Impl rule__ComputedColumn__Group__6 ;
    public final void rule__ComputedColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1415:1: ( rule__ComputedColumn__Group__5__Impl rule__ComputedColumn__Group__6 )
            // InternalFromText.g:1416:2: rule__ComputedColumn__Group__5__Impl rule__ComputedColumn__Group__6
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
    // InternalFromText.g:1423:1: rule__ComputedColumn__Group__5__Impl : ( ( rule__ComputedColumn__AlgorithmAssignment_5 ) ) ;
    public final void rule__ComputedColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1427:1: ( ( ( rule__ComputedColumn__AlgorithmAssignment_5 ) ) )
            // InternalFromText.g:1428:1: ( ( rule__ComputedColumn__AlgorithmAssignment_5 ) )
            {
            // InternalFromText.g:1428:1: ( ( rule__ComputedColumn__AlgorithmAssignment_5 ) )
            // InternalFromText.g:1429:2: ( rule__ComputedColumn__AlgorithmAssignment_5 )
            {
             before(grammarAccess.getComputedColumnAccess().getAlgorithmAssignment_5()); 
            // InternalFromText.g:1430:2: ( rule__ComputedColumn__AlgorithmAssignment_5 )
            // InternalFromText.g:1430:3: rule__ComputedColumn__AlgorithmAssignment_5
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
    // InternalFromText.g:1438:1: rule__ComputedColumn__Group__6 : rule__ComputedColumn__Group__6__Impl rule__ComputedColumn__Group__7 ;
    public final void rule__ComputedColumn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1442:1: ( rule__ComputedColumn__Group__6__Impl rule__ComputedColumn__Group__7 )
            // InternalFromText.g:1443:2: rule__ComputedColumn__Group__6__Impl rule__ComputedColumn__Group__7
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
    // InternalFromText.g:1450:1: rule__ComputedColumn__Group__6__Impl : ( '->' ) ;
    public final void rule__ComputedColumn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1454:1: ( ( '->' ) )
            // InternalFromText.g:1455:1: ( '->' )
            {
            // InternalFromText.g:1455:1: ( '->' )
            // InternalFromText.g:1456:2: '->'
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
    // InternalFromText.g:1465:1: rule__ComputedColumn__Group__7 : rule__ComputedColumn__Group__7__Impl ;
    public final void rule__ComputedColumn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1469:1: ( rule__ComputedColumn__Group__7__Impl )
            // InternalFromText.g:1470:2: rule__ComputedColumn__Group__7__Impl
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
    // InternalFromText.g:1476:1: rule__ComputedColumn__Group__7__Impl : ( ( rule__ComputedColumn__IdAssignment_7 ) ) ;
    public final void rule__ComputedColumn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1480:1: ( ( ( rule__ComputedColumn__IdAssignment_7 ) ) )
            // InternalFromText.g:1481:1: ( ( rule__ComputedColumn__IdAssignment_7 ) )
            {
            // InternalFromText.g:1481:1: ( ( rule__ComputedColumn__IdAssignment_7 ) )
            // InternalFromText.g:1482:2: ( rule__ComputedColumn__IdAssignment_7 )
            {
             before(grammarAccess.getComputedColumnAccess().getIdAssignment_7()); 
            // InternalFromText.g:1483:2: ( rule__ComputedColumn__IdAssignment_7 )
            // InternalFromText.g:1483:3: rule__ComputedColumn__IdAssignment_7
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
    // InternalFromText.g:1492:1: rule__ColumnArgument__Group__0 : rule__ColumnArgument__Group__0__Impl rule__ColumnArgument__Group__1 ;
    public final void rule__ColumnArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1496:1: ( rule__ColumnArgument__Group__0__Impl rule__ColumnArgument__Group__1 )
            // InternalFromText.g:1497:2: rule__ColumnArgument__Group__0__Impl rule__ColumnArgument__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFromText.g:1504:1: rule__ColumnArgument__Group__0__Impl : ( () ) ;
    public final void rule__ColumnArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1508:1: ( ( () ) )
            // InternalFromText.g:1509:1: ( () )
            {
            // InternalFromText.g:1509:1: ( () )
            // InternalFromText.g:1510:2: ()
            {
             before(grammarAccess.getColumnArgumentAccess().getColumnArgumentAction_0()); 
            // InternalFromText.g:1511:2: ()
            // InternalFromText.g:1511:3: 
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
    // InternalFromText.g:1519:1: rule__ColumnArgument__Group__1 : rule__ColumnArgument__Group__1__Impl ;
    public final void rule__ColumnArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1523:1: ( rule__ColumnArgument__Group__1__Impl )
            // InternalFromText.g:1524:2: rule__ColumnArgument__Group__1__Impl
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
    // InternalFromText.g:1530:1: rule__ColumnArgument__Group__1__Impl : ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) ) ;
    public final void rule__ColumnArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1534:1: ( ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) ) )
            // InternalFromText.g:1535:1: ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) )
            {
            // InternalFromText.g:1535:1: ( ( rule__ColumnArgument__ColumnPathAssignment_1 ) )
            // InternalFromText.g:1536:2: ( rule__ColumnArgument__ColumnPathAssignment_1 )
            {
             before(grammarAccess.getColumnArgumentAccess().getColumnPathAssignment_1()); 
            // InternalFromText.g:1537:2: ( rule__ColumnArgument__ColumnPathAssignment_1 )
            // InternalFromText.g:1537:3: rule__ColumnArgument__ColumnPathAssignment_1
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
    // InternalFromText.g:1546:1: rule__Algorithm__Group__0 : rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 ;
    public final void rule__Algorithm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1550:1: ( rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 )
            // InternalFromText.g:1551:2: rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1
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
    // InternalFromText.g:1558:1: rule__Algorithm__Group__0__Impl : ( () ) ;
    public final void rule__Algorithm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1562:1: ( ( () ) )
            // InternalFromText.g:1563:1: ( () )
            {
            // InternalFromText.g:1563:1: ( () )
            // InternalFromText.g:1564:2: ()
            {
             before(grammarAccess.getAlgorithmAccess().getAlgorithmAction_0()); 
            // InternalFromText.g:1565:2: ()
            // InternalFromText.g:1565:3: 
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
    // InternalFromText.g:1573:1: rule__Algorithm__Group__1 : rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2 ;
    public final void rule__Algorithm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1577:1: ( rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2 )
            // InternalFromText.g:1578:2: rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2
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
    // InternalFromText.g:1585:1: rule__Algorithm__Group__1__Impl : ( ( rule__Algorithm__FunctionsAssignment_1 ) ) ;
    public final void rule__Algorithm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1589:1: ( ( ( rule__Algorithm__FunctionsAssignment_1 ) ) )
            // InternalFromText.g:1590:1: ( ( rule__Algorithm__FunctionsAssignment_1 ) )
            {
            // InternalFromText.g:1590:1: ( ( rule__Algorithm__FunctionsAssignment_1 ) )
            // InternalFromText.g:1591:2: ( rule__Algorithm__FunctionsAssignment_1 )
            {
             before(grammarAccess.getAlgorithmAccess().getFunctionsAssignment_1()); 
            // InternalFromText.g:1592:2: ( rule__Algorithm__FunctionsAssignment_1 )
            // InternalFromText.g:1592:3: rule__Algorithm__FunctionsAssignment_1
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
    // InternalFromText.g:1600:1: rule__Algorithm__Group__2 : rule__Algorithm__Group__2__Impl rule__Algorithm__Group__3 ;
    public final void rule__Algorithm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1604:1: ( rule__Algorithm__Group__2__Impl rule__Algorithm__Group__3 )
            // InternalFromText.g:1605:2: rule__Algorithm__Group__2__Impl rule__Algorithm__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalFromText.g:1612:1: rule__Algorithm__Group__2__Impl : ( '(' ) ;
    public final void rule__Algorithm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1616:1: ( ( '(' ) )
            // InternalFromText.g:1617:1: ( '(' )
            {
            // InternalFromText.g:1617:1: ( '(' )
            // InternalFromText.g:1618:2: '('
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
    // InternalFromText.g:1627:1: rule__Algorithm__Group__3 : rule__Algorithm__Group__3__Impl rule__Algorithm__Group__4 ;
    public final void rule__Algorithm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1631:1: ( rule__Algorithm__Group__3__Impl rule__Algorithm__Group__4 )
            // InternalFromText.g:1632:2: rule__Algorithm__Group__3__Impl rule__Algorithm__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalFromText.g:1639:1: rule__Algorithm__Group__3__Impl : ( ( rule__Algorithm__Group_3__0 )? ) ;
    public final void rule__Algorithm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1643:1: ( ( ( rule__Algorithm__Group_3__0 )? ) )
            // InternalFromText.g:1644:1: ( ( rule__Algorithm__Group_3__0 )? )
            {
            // InternalFromText.g:1644:1: ( ( rule__Algorithm__Group_3__0 )? )
            // InternalFromText.g:1645:2: ( rule__Algorithm__Group_3__0 )?
            {
             before(grammarAccess.getAlgorithmAccess().getGroup_3()); 
            // InternalFromText.g:1646:2: ( rule__Algorithm__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFromText.g:1646:3: rule__Algorithm__Group_3__0
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
    // InternalFromText.g:1654:1: rule__Algorithm__Group__4 : rule__Algorithm__Group__4__Impl rule__Algorithm__Group__5 ;
    public final void rule__Algorithm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1658:1: ( rule__Algorithm__Group__4__Impl rule__Algorithm__Group__5 )
            // InternalFromText.g:1659:2: rule__Algorithm__Group__4__Impl rule__Algorithm__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalFromText.g:1666:1: rule__Algorithm__Group__4__Impl : ( ')' ) ;
    public final void rule__Algorithm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1670:1: ( ( ')' ) )
            // InternalFromText.g:1671:1: ( ')' )
            {
            // InternalFromText.g:1671:1: ( ')' )
            // InternalFromText.g:1672:2: ')'
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
    // InternalFromText.g:1681:1: rule__Algorithm__Group__5 : rule__Algorithm__Group__5__Impl ;
    public final void rule__Algorithm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1685:1: ( rule__Algorithm__Group__5__Impl )
            // InternalFromText.g:1686:2: rule__Algorithm__Group__5__Impl
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
    // InternalFromText.g:1692:1: rule__Algorithm__Group__5__Impl : ( ( rule__Algorithm__Group_5__0 )? ) ;
    public final void rule__Algorithm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1696:1: ( ( ( rule__Algorithm__Group_5__0 )? ) )
            // InternalFromText.g:1697:1: ( ( rule__Algorithm__Group_5__0 )? )
            {
            // InternalFromText.g:1697:1: ( ( rule__Algorithm__Group_5__0 )? )
            // InternalFromText.g:1698:2: ( rule__Algorithm__Group_5__0 )?
            {
             before(grammarAccess.getAlgorithmAccess().getGroup_5()); 
            // InternalFromText.g:1699:2: ( rule__Algorithm__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFromText.g:1699:3: rule__Algorithm__Group_5__0
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
    // InternalFromText.g:1708:1: rule__Algorithm__Group_3__0 : rule__Algorithm__Group_3__0__Impl rule__Algorithm__Group_3__1 ;
    public final void rule__Algorithm__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1712:1: ( rule__Algorithm__Group_3__0__Impl rule__Algorithm__Group_3__1 )
            // InternalFromText.g:1713:2: rule__Algorithm__Group_3__0__Impl rule__Algorithm__Group_3__1
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
    // InternalFromText.g:1720:1: rule__Algorithm__Group_3__0__Impl : ( ( rule__Algorithm__InputsAssignment_3_0 ) ) ;
    public final void rule__Algorithm__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1724:1: ( ( ( rule__Algorithm__InputsAssignment_3_0 ) ) )
            // InternalFromText.g:1725:1: ( ( rule__Algorithm__InputsAssignment_3_0 ) )
            {
            // InternalFromText.g:1725:1: ( ( rule__Algorithm__InputsAssignment_3_0 ) )
            // InternalFromText.g:1726:2: ( rule__Algorithm__InputsAssignment_3_0 )
            {
             before(grammarAccess.getAlgorithmAccess().getInputsAssignment_3_0()); 
            // InternalFromText.g:1727:2: ( rule__Algorithm__InputsAssignment_3_0 )
            // InternalFromText.g:1727:3: rule__Algorithm__InputsAssignment_3_0
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
    // InternalFromText.g:1735:1: rule__Algorithm__Group_3__1 : rule__Algorithm__Group_3__1__Impl ;
    public final void rule__Algorithm__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1739:1: ( rule__Algorithm__Group_3__1__Impl )
            // InternalFromText.g:1740:2: rule__Algorithm__Group_3__1__Impl
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
    // InternalFromText.g:1746:1: rule__Algorithm__Group_3__1__Impl : ( ( rule__Algorithm__Group_3_1__0 )* ) ;
    public final void rule__Algorithm__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1750:1: ( ( ( rule__Algorithm__Group_3_1__0 )* ) )
            // InternalFromText.g:1751:1: ( ( rule__Algorithm__Group_3_1__0 )* )
            {
            // InternalFromText.g:1751:1: ( ( rule__Algorithm__Group_3_1__0 )* )
            // InternalFromText.g:1752:2: ( rule__Algorithm__Group_3_1__0 )*
            {
             before(grammarAccess.getAlgorithmAccess().getGroup_3_1()); 
            // InternalFromText.g:1753:2: ( rule__Algorithm__Group_3_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFromText.g:1753:3: rule__Algorithm__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Algorithm__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalFromText.g:1762:1: rule__Algorithm__Group_3_1__0 : rule__Algorithm__Group_3_1__0__Impl rule__Algorithm__Group_3_1__1 ;
    public final void rule__Algorithm__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1766:1: ( rule__Algorithm__Group_3_1__0__Impl rule__Algorithm__Group_3_1__1 )
            // InternalFromText.g:1767:2: rule__Algorithm__Group_3_1__0__Impl rule__Algorithm__Group_3_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFromText.g:1774:1: rule__Algorithm__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Algorithm__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1778:1: ( ( ',' ) )
            // InternalFromText.g:1779:1: ( ',' )
            {
            // InternalFromText.g:1779:1: ( ',' )
            // InternalFromText.g:1780:2: ','
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
    // InternalFromText.g:1789:1: rule__Algorithm__Group_3_1__1 : rule__Algorithm__Group_3_1__1__Impl ;
    public final void rule__Algorithm__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1793:1: ( rule__Algorithm__Group_3_1__1__Impl )
            // InternalFromText.g:1794:2: rule__Algorithm__Group_3_1__1__Impl
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
    // InternalFromText.g:1800:1: rule__Algorithm__Group_3_1__1__Impl : ( ( rule__Algorithm__InputsAssignment_3_1_1 ) ) ;
    public final void rule__Algorithm__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1804:1: ( ( ( rule__Algorithm__InputsAssignment_3_1_1 ) ) )
            // InternalFromText.g:1805:1: ( ( rule__Algorithm__InputsAssignment_3_1_1 ) )
            {
            // InternalFromText.g:1805:1: ( ( rule__Algorithm__InputsAssignment_3_1_1 ) )
            // InternalFromText.g:1806:2: ( rule__Algorithm__InputsAssignment_3_1_1 )
            {
             before(grammarAccess.getAlgorithmAccess().getInputsAssignment_3_1_1()); 
            // InternalFromText.g:1807:2: ( rule__Algorithm__InputsAssignment_3_1_1 )
            // InternalFromText.g:1807:3: rule__Algorithm__InputsAssignment_3_1_1
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
    // InternalFromText.g:1816:1: rule__Algorithm__Group_5__0 : rule__Algorithm__Group_5__0__Impl rule__Algorithm__Group_5__1 ;
    public final void rule__Algorithm__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1820:1: ( rule__Algorithm__Group_5__0__Impl rule__Algorithm__Group_5__1 )
            // InternalFromText.g:1821:2: rule__Algorithm__Group_5__0__Impl rule__Algorithm__Group_5__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalFromText.g:1828:1: rule__Algorithm__Group_5__0__Impl : ( '>' ) ;
    public final void rule__Algorithm__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1832:1: ( ( '>' ) )
            // InternalFromText.g:1833:1: ( '>' )
            {
            // InternalFromText.g:1833:1: ( '>' )
            // InternalFromText.g:1834:2: '>'
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
    // InternalFromText.g:1843:1: rule__Algorithm__Group_5__1 : rule__Algorithm__Group_5__1__Impl rule__Algorithm__Group_5__2 ;
    public final void rule__Algorithm__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1847:1: ( rule__Algorithm__Group_5__1__Impl rule__Algorithm__Group_5__2 )
            // InternalFromText.g:1848:2: rule__Algorithm__Group_5__1__Impl rule__Algorithm__Group_5__2
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
    // InternalFromText.g:1855:1: rule__Algorithm__Group_5__1__Impl : ( ( rule__Algorithm__FunctionsAssignment_5_1 ) ) ;
    public final void rule__Algorithm__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1859:1: ( ( ( rule__Algorithm__FunctionsAssignment_5_1 ) ) )
            // InternalFromText.g:1860:1: ( ( rule__Algorithm__FunctionsAssignment_5_1 ) )
            {
            // InternalFromText.g:1860:1: ( ( rule__Algorithm__FunctionsAssignment_5_1 ) )
            // InternalFromText.g:1861:2: ( rule__Algorithm__FunctionsAssignment_5_1 )
            {
             before(grammarAccess.getAlgorithmAccess().getFunctionsAssignment_5_1()); 
            // InternalFromText.g:1862:2: ( rule__Algorithm__FunctionsAssignment_5_1 )
            // InternalFromText.g:1862:3: rule__Algorithm__FunctionsAssignment_5_1
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
    // InternalFromText.g:1870:1: rule__Algorithm__Group_5__2 : rule__Algorithm__Group_5__2__Impl rule__Algorithm__Group_5__3 ;
    public final void rule__Algorithm__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1874:1: ( rule__Algorithm__Group_5__2__Impl rule__Algorithm__Group_5__3 )
            // InternalFromText.g:1875:2: rule__Algorithm__Group_5__2__Impl rule__Algorithm__Group_5__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalFromText.g:1882:1: rule__Algorithm__Group_5__2__Impl : ( '(' ) ;
    public final void rule__Algorithm__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1886:1: ( ( '(' ) )
            // InternalFromText.g:1887:1: ( '(' )
            {
            // InternalFromText.g:1887:1: ( '(' )
            // InternalFromText.g:1888:2: '('
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
    // InternalFromText.g:1897:1: rule__Algorithm__Group_5__3 : rule__Algorithm__Group_5__3__Impl rule__Algorithm__Group_5__4 ;
    public final void rule__Algorithm__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1901:1: ( rule__Algorithm__Group_5__3__Impl rule__Algorithm__Group_5__4 )
            // InternalFromText.g:1902:2: rule__Algorithm__Group_5__3__Impl rule__Algorithm__Group_5__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalFromText.g:1909:1: rule__Algorithm__Group_5__3__Impl : ( ( rule__Algorithm__Group_5_3__0 )? ) ;
    public final void rule__Algorithm__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1913:1: ( ( ( rule__Algorithm__Group_5_3__0 )? ) )
            // InternalFromText.g:1914:1: ( ( rule__Algorithm__Group_5_3__0 )? )
            {
            // InternalFromText.g:1914:1: ( ( rule__Algorithm__Group_5_3__0 )? )
            // InternalFromText.g:1915:2: ( rule__Algorithm__Group_5_3__0 )?
            {
             before(grammarAccess.getAlgorithmAccess().getGroup_5_3()); 
            // InternalFromText.g:1916:2: ( rule__Algorithm__Group_5_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFromText.g:1916:3: rule__Algorithm__Group_5_3__0
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
    // InternalFromText.g:1924:1: rule__Algorithm__Group_5__4 : rule__Algorithm__Group_5__4__Impl ;
    public final void rule__Algorithm__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1928:1: ( rule__Algorithm__Group_5__4__Impl )
            // InternalFromText.g:1929:2: rule__Algorithm__Group_5__4__Impl
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
    // InternalFromText.g:1935:1: rule__Algorithm__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Algorithm__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1939:1: ( ( ')' ) )
            // InternalFromText.g:1940:1: ( ')' )
            {
            // InternalFromText.g:1940:1: ( ')' )
            // InternalFromText.g:1941:2: ')'
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
    // InternalFromText.g:1951:1: rule__Algorithm__Group_5_3__0 : rule__Algorithm__Group_5_3__0__Impl rule__Algorithm__Group_5_3__1 ;
    public final void rule__Algorithm__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1955:1: ( rule__Algorithm__Group_5_3__0__Impl rule__Algorithm__Group_5_3__1 )
            // InternalFromText.g:1956:2: rule__Algorithm__Group_5_3__0__Impl rule__Algorithm__Group_5_3__1
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
    // InternalFromText.g:1963:1: rule__Algorithm__Group_5_3__0__Impl : ( ( rule__Algorithm__InputsAssignment_5_3_0 ) ) ;
    public final void rule__Algorithm__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1967:1: ( ( ( rule__Algorithm__InputsAssignment_5_3_0 ) ) )
            // InternalFromText.g:1968:1: ( ( rule__Algorithm__InputsAssignment_5_3_0 ) )
            {
            // InternalFromText.g:1968:1: ( ( rule__Algorithm__InputsAssignment_5_3_0 ) )
            // InternalFromText.g:1969:2: ( rule__Algorithm__InputsAssignment_5_3_0 )
            {
             before(grammarAccess.getAlgorithmAccess().getInputsAssignment_5_3_0()); 
            // InternalFromText.g:1970:2: ( rule__Algorithm__InputsAssignment_5_3_0 )
            // InternalFromText.g:1970:3: rule__Algorithm__InputsAssignment_5_3_0
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
    // InternalFromText.g:1978:1: rule__Algorithm__Group_5_3__1 : rule__Algorithm__Group_5_3__1__Impl ;
    public final void rule__Algorithm__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1982:1: ( rule__Algorithm__Group_5_3__1__Impl )
            // InternalFromText.g:1983:2: rule__Algorithm__Group_5_3__1__Impl
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
    // InternalFromText.g:1989:1: rule__Algorithm__Group_5_3__1__Impl : ( ( rule__Algorithm__Group_5_3_1__0 )* ) ;
    public final void rule__Algorithm__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:1993:1: ( ( ( rule__Algorithm__Group_5_3_1__0 )* ) )
            // InternalFromText.g:1994:1: ( ( rule__Algorithm__Group_5_3_1__0 )* )
            {
            // InternalFromText.g:1994:1: ( ( rule__Algorithm__Group_5_3_1__0 )* )
            // InternalFromText.g:1995:2: ( rule__Algorithm__Group_5_3_1__0 )*
            {
             before(grammarAccess.getAlgorithmAccess().getGroup_5_3_1()); 
            // InternalFromText.g:1996:2: ( rule__Algorithm__Group_5_3_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFromText.g:1996:3: rule__Algorithm__Group_5_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Algorithm__Group_5_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalFromText.g:2005:1: rule__Algorithm__Group_5_3_1__0 : rule__Algorithm__Group_5_3_1__0__Impl rule__Algorithm__Group_5_3_1__1 ;
    public final void rule__Algorithm__Group_5_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2009:1: ( rule__Algorithm__Group_5_3_1__0__Impl rule__Algorithm__Group_5_3_1__1 )
            // InternalFromText.g:2010:2: rule__Algorithm__Group_5_3_1__0__Impl rule__Algorithm__Group_5_3_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFromText.g:2017:1: rule__Algorithm__Group_5_3_1__0__Impl : ( ',' ) ;
    public final void rule__Algorithm__Group_5_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2021:1: ( ( ',' ) )
            // InternalFromText.g:2022:1: ( ',' )
            {
            // InternalFromText.g:2022:1: ( ',' )
            // InternalFromText.g:2023:2: ','
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
    // InternalFromText.g:2032:1: rule__Algorithm__Group_5_3_1__1 : rule__Algorithm__Group_5_3_1__1__Impl ;
    public final void rule__Algorithm__Group_5_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2036:1: ( rule__Algorithm__Group_5_3_1__1__Impl )
            // InternalFromText.g:2037:2: rule__Algorithm__Group_5_3_1__1__Impl
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
    // InternalFromText.g:2043:1: rule__Algorithm__Group_5_3_1__1__Impl : ( ( rule__Algorithm__InputsAssignment_5_3_1_1 ) ) ;
    public final void rule__Algorithm__Group_5_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2047:1: ( ( ( rule__Algorithm__InputsAssignment_5_3_1_1 ) ) )
            // InternalFromText.g:2048:1: ( ( rule__Algorithm__InputsAssignment_5_3_1_1 ) )
            {
            // InternalFromText.g:2048:1: ( ( rule__Algorithm__InputsAssignment_5_3_1_1 ) )
            // InternalFromText.g:2049:2: ( rule__Algorithm__InputsAssignment_5_3_1_1 )
            {
             before(grammarAccess.getAlgorithmAccess().getInputsAssignment_5_3_1_1()); 
            // InternalFromText.g:2050:2: ( rule__Algorithm__InputsAssignment_5_3_1_1 )
            // InternalFromText.g:2050:3: rule__Algorithm__InputsAssignment_5_3_1_1
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


    // $ANTLR start "rule__ChaiseMinute__TablesAssignment_1_0"
    // InternalFromText.g:2059:1: rule__ChaiseMinute__TablesAssignment_1_0 : ( ruleTable ) ;
    public final void rule__ChaiseMinute__TablesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2063:1: ( ( ruleTable ) )
            // InternalFromText.g:2064:2: ( ruleTable )
            {
            // InternalFromText.g:2064:2: ( ruleTable )
            // InternalFromText.g:2065:3: ruleTable
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
    // InternalFromText.g:2074:1: rule__ChaiseMinute__TablesAssignment_1_1_1 : ( ruleTable ) ;
    public final void rule__ChaiseMinute__TablesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2078:1: ( ( ruleTable ) )
            // InternalFromText.g:2079:2: ( ruleTable )
            {
            // InternalFromText.g:2079:2: ( ruleTable )
            // InternalFromText.g:2080:3: ruleTable
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
    // InternalFromText.g:2089:1: rule__Table__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2093:1: ( ( ruleEString ) )
            // InternalFromText.g:2094:2: ( ruleEString )
            {
            // InternalFromText.g:2094:2: ( ruleEString )
            // InternalFromText.g:2095:3: ruleEString
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
    // InternalFromText.g:2104:1: rule__Table__IndexColumnAssignment_3 : ( ruleIndexColumn ) ;
    public final void rule__Table__IndexColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2108:1: ( ( ruleIndexColumn ) )
            // InternalFromText.g:2109:2: ( ruleIndexColumn )
            {
            // InternalFromText.g:2109:2: ( ruleIndexColumn )
            // InternalFromText.g:2110:3: ruleIndexColumn
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
    // InternalFromText.g:2119:1: rule__Table__ColumnsAssignment_5_0 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2123:1: ( ( ruleColumn ) )
            // InternalFromText.g:2124:2: ( ruleColumn )
            {
            // InternalFromText.g:2124:2: ( ruleColumn )
            // InternalFromText.g:2125:3: ruleColumn
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
    // InternalFromText.g:2134:1: rule__Table__ColumnsAssignment_5_1_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2138:1: ( ( ruleColumn ) )
            // InternalFromText.g:2139:2: ( ruleColumn )
            {
            // InternalFromText.g:2139:2: ( ruleColumn )
            // InternalFromText.g:2140:3: ruleColumn
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
    // InternalFromText.g:2149:1: rule__ColumnData__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__ColumnData__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2153:1: ( ( ruleDataType ) )
            // InternalFromText.g:2154:2: ( ruleDataType )
            {
            // InternalFromText.g:2154:2: ( ruleDataType )
            // InternalFromText.g:2155:3: ruleDataType
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
    // InternalFromText.g:2164:1: rule__ColumnData__IdAssignment_5 : ( ruleEString ) ;
    public final void rule__ColumnData__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2168:1: ( ( ruleEString ) )
            // InternalFromText.g:2169:2: ( ruleEString )
            {
            // InternalFromText.g:2169:2: ( ruleEString )
            // InternalFromText.g:2170:3: ruleEString
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
    // InternalFromText.g:2179:1: rule__ImportedColumn__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__ImportedColumn__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2183:1: ( ( ruleDataType ) )
            // InternalFromText.g:2184:2: ( ruleDataType )
            {
            // InternalFromText.g:2184:2: ( ruleDataType )
            // InternalFromText.g:2185:3: ruleDataType
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
    // InternalFromText.g:2194:1: rule__ImportedColumn__PathAssignment_5 : ( ruleEString ) ;
    public final void rule__ImportedColumn__PathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2198:1: ( ( ruleEString ) )
            // InternalFromText.g:2199:2: ( ruleEString )
            {
            // InternalFromText.g:2199:2: ( ruleEString )
            // InternalFromText.g:2200:3: ruleEString
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
    // InternalFromText.g:2209:1: rule__ImportedColumn__IdAssignment_7 : ( ruleEString ) ;
    public final void rule__ImportedColumn__IdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2213:1: ( ( ruleEString ) )
            // InternalFromText.g:2214:2: ( ruleEString )
            {
            // InternalFromText.g:2214:2: ( ruleEString )
            // InternalFromText.g:2215:3: ruleEString
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
    // InternalFromText.g:2224:1: rule__ComputedColumn__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__ComputedColumn__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2228:1: ( ( ruleDataType ) )
            // InternalFromText.g:2229:2: ( ruleDataType )
            {
            // InternalFromText.g:2229:2: ( ruleDataType )
            // InternalFromText.g:2230:3: ruleDataType
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
    // InternalFromText.g:2239:1: rule__ComputedColumn__AlgorithmAssignment_5 : ( ruleAlgorithm ) ;
    public final void rule__ComputedColumn__AlgorithmAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2243:1: ( ( ruleAlgorithm ) )
            // InternalFromText.g:2244:2: ( ruleAlgorithm )
            {
            // InternalFromText.g:2244:2: ( ruleAlgorithm )
            // InternalFromText.g:2245:3: ruleAlgorithm
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
    // InternalFromText.g:2254:1: rule__ComputedColumn__IdAssignment_7 : ( ruleEString ) ;
    public final void rule__ComputedColumn__IdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2258:1: ( ( ruleEString ) )
            // InternalFromText.g:2259:2: ( ruleEString )
            {
            // InternalFromText.g:2259:2: ( ruleEString )
            // InternalFromText.g:2260:3: ruleEString
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
    // InternalFromText.g:2269:1: rule__ColumnArgument__ColumnPathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ColumnArgument__ColumnPathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2273:1: ( ( RULE_STRING ) )
            // InternalFromText.g:2274:2: ( RULE_STRING )
            {
            // InternalFromText.g:2274:2: ( RULE_STRING )
            // InternalFromText.g:2275:3: RULE_STRING
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
    // InternalFromText.g:2284:1: rule__Algorithm__FunctionsAssignment_1 : ( ruleEString ) ;
    public final void rule__Algorithm__FunctionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2288:1: ( ( ruleEString ) )
            // InternalFromText.g:2289:2: ( ruleEString )
            {
            // InternalFromText.g:2289:2: ( ruleEString )
            // InternalFromText.g:2290:3: ruleEString
            {
             before(grammarAccess.getAlgorithmAccess().getFunctionsEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlgorithmAccess().getFunctionsEStringParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalFromText.g:2299:1: rule__Algorithm__InputsAssignment_3_0 : ( ruleArgument ) ;
    public final void rule__Algorithm__InputsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2303:1: ( ( ruleArgument ) )
            // InternalFromText.g:2304:2: ( ruleArgument )
            {
            // InternalFromText.g:2304:2: ( ruleArgument )
            // InternalFromText.g:2305:3: ruleArgument
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
    // InternalFromText.g:2314:1: rule__Algorithm__InputsAssignment_3_1_1 : ( ruleArgument ) ;
    public final void rule__Algorithm__InputsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2318:1: ( ( ruleArgument ) )
            // InternalFromText.g:2319:2: ( ruleArgument )
            {
            // InternalFromText.g:2319:2: ( ruleArgument )
            // InternalFromText.g:2320:3: ruleArgument
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
    // InternalFromText.g:2329:1: rule__Algorithm__FunctionsAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Algorithm__FunctionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2333:1: ( ( ruleEString ) )
            // InternalFromText.g:2334:2: ( ruleEString )
            {
            // InternalFromText.g:2334:2: ( ruleEString )
            // InternalFromText.g:2335:3: ruleEString
            {
             before(grammarAccess.getAlgorithmAccess().getFunctionsEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlgorithmAccess().getFunctionsEStringParserRuleCall_5_1_0()); 

            }


            }

        }
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
    // InternalFromText.g:2344:1: rule__Algorithm__InputsAssignment_5_3_0 : ( ruleArgument ) ;
    public final void rule__Algorithm__InputsAssignment_5_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2348:1: ( ( ruleArgument ) )
            // InternalFromText.g:2349:2: ( ruleArgument )
            {
            // InternalFromText.g:2349:2: ( ruleArgument )
            // InternalFromText.g:2350:3: ruleArgument
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
    // InternalFromText.g:2359:1: rule__Algorithm__InputsAssignment_5_3_1_1 : ( ruleArgument ) ;
    public final void rule__Algorithm__InputsAssignment_5_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFromText.g:2363:1: ( ( ruleArgument ) )
            // InternalFromText.g:2364:2: ( ruleArgument )
            {
            // InternalFromText.g:2364:2: ( ruleArgument )
            // InternalFromText.g:2365:3: ruleArgument
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});

}