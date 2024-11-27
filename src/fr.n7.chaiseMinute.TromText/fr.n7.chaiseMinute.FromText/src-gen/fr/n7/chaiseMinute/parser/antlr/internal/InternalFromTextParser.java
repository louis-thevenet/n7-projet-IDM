package fr.n7.chaiseMinute.parser.antlr.internal;

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
import fr.n7.chaiseMinute.services.FromTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFromTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "','", "'data'", "'('", "')'", "':'", "'imported'", "'->'", "'computed'", "'Function'", "'previous'", "'next'", "'input'", "'operation'", "'Sum'", "'String'", "'Int'"
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

        public InternalFromTextParser(TokenStream input, FromTextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ChaiseMinute";
       	}

       	@Override
       	protected FromTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleChaiseMinute"
    // InternalFromText.g:65:1: entryRuleChaiseMinute returns [EObject current=null] : iv_ruleChaiseMinute= ruleChaiseMinute EOF ;
    public final EObject entryRuleChaiseMinute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChaiseMinute = null;


        try {
            // InternalFromText.g:65:53: (iv_ruleChaiseMinute= ruleChaiseMinute EOF )
            // InternalFromText.g:66:2: iv_ruleChaiseMinute= ruleChaiseMinute EOF
            {
             newCompositeNode(grammarAccess.getChaiseMinuteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChaiseMinute=ruleChaiseMinute();

            state._fsp--;

             current =iv_ruleChaiseMinute; 
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
    // $ANTLR end "entryRuleChaiseMinute"


    // $ANTLR start "ruleChaiseMinute"
    // InternalFromText.g:72:1: ruleChaiseMinute returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_tables_1_0= ruleTable ) ) ( (lv_tables_2_0= ruleTable ) )* )? otherlv_3= '}' ) ;
    public final EObject ruleChaiseMinute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_tables_1_0 = null;

        EObject lv_tables_2_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:78:2: ( (otherlv_0= '{' ( ( (lv_tables_1_0= ruleTable ) ) ( (lv_tables_2_0= ruleTable ) )* )? otherlv_3= '}' ) )
            // InternalFromText.g:79:2: (otherlv_0= '{' ( ( (lv_tables_1_0= ruleTable ) ) ( (lv_tables_2_0= ruleTable ) )* )? otherlv_3= '}' )
            {
            // InternalFromText.g:79:2: (otherlv_0= '{' ( ( (lv_tables_1_0= ruleTable ) ) ( (lv_tables_2_0= ruleTable ) )* )? otherlv_3= '}' )
            // InternalFromText.g:80:3: otherlv_0= '{' ( ( (lv_tables_1_0= ruleTable ) ) ( (lv_tables_2_0= ruleTable ) )* )? otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChaiseMinuteAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalFromText.g:84:3: ( ( (lv_tables_1_0= ruleTable ) ) ( (lv_tables_2_0= ruleTable ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFromText.g:85:4: ( (lv_tables_1_0= ruleTable ) ) ( (lv_tables_2_0= ruleTable ) )*
                    {
                    // InternalFromText.g:85:4: ( (lv_tables_1_0= ruleTable ) )
                    // InternalFromText.g:86:5: (lv_tables_1_0= ruleTable )
                    {
                    // InternalFromText.g:86:5: (lv_tables_1_0= ruleTable )
                    // InternalFromText.g:87:6: lv_tables_1_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getChaiseMinuteAccess().getTablesTableParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_tables_1_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChaiseMinuteRule());
                    						}
                    						add(
                    							current,
                    							"tables",
                    							lv_tables_1_0,
                    							"fr.n7.chaiseMinute.FromText.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFromText.g:104:4: ( (lv_tables_2_0= ruleTable ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalFromText.g:105:5: (lv_tables_2_0= ruleTable )
                    	    {
                    	    // InternalFromText.g:105:5: (lv_tables_2_0= ruleTable )
                    	    // InternalFromText.g:106:6: lv_tables_2_0= ruleTable
                    	    {

                    	    						newCompositeNode(grammarAccess.getChaiseMinuteAccess().getTablesTableParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_tables_2_0=ruleTable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getChaiseMinuteRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tables",
                    	    							lv_tables_2_0,
                    	    							"fr.n7.chaiseMinute.FromText.Table");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getChaiseMinuteAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleChaiseMinute"


    // $ANTLR start "entryRuleTable"
    // InternalFromText.g:132:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalFromText.g:132:46: (iv_ruleTable= ruleTable EOF )
            // InternalFromText.g:133:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalFromText.g:139:1: ruleTable returns [EObject current=null] : (otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_indexColumn_3_0 = null;

        EObject lv_columns_5_0 = null;

        EObject lv_columns_7_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:145:2: ( (otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}' ) )
            // InternalFromText.g:146:2: (otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}' )
            {
            // InternalFromText.g:146:2: (otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}' )
            // InternalFromText.g:147:3: otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalFromText.g:151:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFromText.g:152:4: (lv_name_1_0= ruleEString )
            {
            // InternalFromText.g:152:4: (lv_name_1_0= ruleEString )
            // InternalFromText.g:153:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.n7.chaiseMinute.FromText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getCommaKeyword_2());
            		
            // InternalFromText.g:174:3: ( (lv_indexColumn_3_0= ruleIndexColumn ) )
            // InternalFromText.g:175:4: (lv_indexColumn_3_0= ruleIndexColumn )
            {
            // InternalFromText.g:175:4: (lv_indexColumn_3_0= ruleIndexColumn )
            // InternalFromText.g:176:5: lv_indexColumn_3_0= ruleIndexColumn
            {

            					newCompositeNode(grammarAccess.getTableAccess().getIndexColumnIndexColumnParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_indexColumn_3_0=ruleIndexColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"indexColumn",
            						lv_indexColumn_3_0,
            						"fr.n7.chaiseMinute.FromText.IndexColumn");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_4());
            		
            // InternalFromText.g:197:3: ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14||LA4_0==18||LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFromText.g:198:4: ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )*
                    {
                    // InternalFromText.g:198:4: ( (lv_columns_5_0= ruleColumn ) )
                    // InternalFromText.g:199:5: (lv_columns_5_0= ruleColumn )
                    {
                    // InternalFromText.g:199:5: (lv_columns_5_0= ruleColumn )
                    // InternalFromText.g:200:6: lv_columns_5_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_columns_5_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_5_0,
                    							"fr.n7.chaiseMinute.FromText.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFromText.g:217:4: (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalFromText.g:218:5: otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTableAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalFromText.g:222:5: ( (lv_columns_7_0= ruleColumn ) )
                    	    // InternalFromText.g:223:6: (lv_columns_7_0= ruleColumn )
                    	    {
                    	    // InternalFromText.g:223:6: (lv_columns_7_0= ruleColumn )
                    	    // InternalFromText.g:224:7: lv_columns_7_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_columns_7_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_7_0,
                    	    								"fr.n7.chaiseMinute.FromText.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleIndexColumn"
    // InternalFromText.g:251:1: entryRuleIndexColumn returns [EObject current=null] : iv_ruleIndexColumn= ruleIndexColumn EOF ;
    public final EObject entryRuleIndexColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexColumn = null;


        try {
            // InternalFromText.g:251:52: (iv_ruleIndexColumn= ruleIndexColumn EOF )
            // InternalFromText.g:252:2: iv_ruleIndexColumn= ruleIndexColumn EOF
            {
             newCompositeNode(grammarAccess.getIndexColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexColumn=ruleIndexColumn();

            state._fsp--;

             current =iv_ruleIndexColumn; 
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
    // $ANTLR end "entryRuleIndexColumn"


    // $ANTLR start "ruleIndexColumn"
    // InternalFromText.g:258:1: ruleIndexColumn returns [EObject current=null] : () ;
    public final EObject ruleIndexColumn() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalFromText.g:264:2: ( () )
            // InternalFromText.g:265:2: ()
            {
            // InternalFromText.g:265:2: ()
            // InternalFromText.g:266:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getIndexColumnAccess().getIndexColumnAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexColumn"


    // $ANTLR start "entryRuleColumn"
    // InternalFromText.g:275:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalFromText.g:275:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalFromText.g:276:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalFromText.g:282:1: ruleColumn returns [EObject current=null] : (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        EObject this_ColumnData_0 = null;

        EObject this_ComputedColumn_1 = null;

        EObject this_ImportedColumn_2 = null;



        	enterRule();

        try {
            // InternalFromText.g:288:2: ( (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn ) )
            // InternalFromText.g:289:2: (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn )
            {
            // InternalFromText.g:289:2: (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 18:
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
                    // InternalFromText.g:290:3: this_ColumnData_0= ruleColumnData
                    {

                    			newCompositeNode(grammarAccess.getColumnAccess().getColumnDataParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColumnData_0=ruleColumnData();

                    state._fsp--;


                    			current = this_ColumnData_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFromText.g:299:3: this_ComputedColumn_1= ruleComputedColumn
                    {

                    			newCompositeNode(grammarAccess.getColumnAccess().getComputedColumnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComputedColumn_1=ruleComputedColumn();

                    state._fsp--;


                    			current = this_ComputedColumn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFromText.g:308:3: this_ImportedColumn_2= ruleImportedColumn
                    {

                    			newCompositeNode(grammarAccess.getColumnAccess().getImportedColumnParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImportedColumn_2=ruleImportedColumn();

                    state._fsp--;


                    			current = this_ImportedColumn_2;
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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleColumnData"
    // InternalFromText.g:320:1: entryRuleColumnData returns [EObject current=null] : iv_ruleColumnData= ruleColumnData EOF ;
    public final EObject entryRuleColumnData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnData = null;


        try {
            // InternalFromText.g:320:51: (iv_ruleColumnData= ruleColumnData EOF )
            // InternalFromText.g:321:2: iv_ruleColumnData= ruleColumnData EOF
            {
             newCompositeNode(grammarAccess.getColumnDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnData=ruleColumnData();

            state._fsp--;

             current =iv_ruleColumnData; 
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
    // $ANTLR end "entryRuleColumnData"


    // $ANTLR start "ruleColumnData"
    // InternalFromText.g:327:1: ruleColumnData returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) ) ) ;
    public final EObject ruleColumnData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:333:2: ( (otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) ) ) )
            // InternalFromText.g:334:2: (otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) ) )
            {
            // InternalFromText.g:334:2: (otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) ) )
            // InternalFromText.g:335:3: otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnDataAccess().getDataKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnDataAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFromText.g:343:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalFromText.g:344:4: (lv_type_2_0= ruleDataType )
            {
            // InternalFromText.g:344:4: (lv_type_2_0= ruleDataType )
            // InternalFromText.g:345:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getColumnDataAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_2_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnDataRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.n7.chaiseMinute.FromText.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnDataAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnDataAccess().getColonKeyword_4());
            		
            // InternalFromText.g:370:3: ( (lv_id_5_0= ruleEString ) )
            // InternalFromText.g:371:4: (lv_id_5_0= ruleEString )
            {
            // InternalFromText.g:371:4: (lv_id_5_0= ruleEString )
            // InternalFromText.g:372:5: lv_id_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnDataAccess().getIdEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_id_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnDataRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_5_0,
            						"fr.n7.chaiseMinute.FromText.EString");
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
    // $ANTLR end "ruleColumnData"


    // $ANTLR start "entryRuleImportedColumn"
    // InternalFromText.g:393:1: entryRuleImportedColumn returns [EObject current=null] : iv_ruleImportedColumn= ruleImportedColumn EOF ;
    public final EObject entryRuleImportedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedColumn = null;


        try {
            // InternalFromText.g:393:55: (iv_ruleImportedColumn= ruleImportedColumn EOF )
            // InternalFromText.g:394:2: iv_ruleImportedColumn= ruleImportedColumn EOF
            {
             newCompositeNode(grammarAccess.getImportedColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportedColumn=ruleImportedColumn();

            state._fsp--;

             current =iv_ruleImportedColumn; 
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
    // $ANTLR end "entryRuleImportedColumn"


    // $ANTLR start "ruleImportedColumn"
    // InternalFromText.g:400:1: ruleImportedColumn returns [EObject current=null] : (otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) ) ;
    public final EObject ruleImportedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_path_5_0 = null;

        AntlrDatatypeRuleToken lv_id_7_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:406:2: ( (otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) ) )
            // InternalFromText.g:407:2: (otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) )
            {
            // InternalFromText.g:407:2: (otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) )
            // InternalFromText.g:408:3: otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getImportedColumnAccess().getImportedKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getImportedColumnAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFromText.g:416:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalFromText.g:417:4: (lv_type_2_0= ruleDataType )
            {
            // InternalFromText.g:417:4: (lv_type_2_0= ruleDataType )
            // InternalFromText.g:418:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getImportedColumnAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_2_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportedColumnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.n7.chaiseMinute.FromText.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getImportedColumnAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getImportedColumnAccess().getColonKeyword_4());
            		
            // InternalFromText.g:443:3: ( (lv_path_5_0= ruleEString ) )
            // InternalFromText.g:444:4: (lv_path_5_0= ruleEString )
            {
            // InternalFromText.g:444:4: (lv_path_5_0= ruleEString )
            // InternalFromText.g:445:5: lv_path_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getImportedColumnAccess().getPathEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_path_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportedColumnRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_5_0,
            						"fr.n7.chaiseMinute.FromText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getImportedColumnAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            // InternalFromText.g:466:3: ( (lv_id_7_0= ruleEString ) )
            // InternalFromText.g:467:4: (lv_id_7_0= ruleEString )
            {
            // InternalFromText.g:467:4: (lv_id_7_0= ruleEString )
            // InternalFromText.g:468:5: lv_id_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getImportedColumnAccess().getIdEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_id_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportedColumnRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_7_0,
            						"fr.n7.chaiseMinute.FromText.EString");
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
    // $ANTLR end "ruleImportedColumn"


    // $ANTLR start "entryRuleComputedColumn"
    // InternalFromText.g:489:1: entryRuleComputedColumn returns [EObject current=null] : iv_ruleComputedColumn= ruleComputedColumn EOF ;
    public final EObject entryRuleComputedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedColumn = null;


        try {
            // InternalFromText.g:489:55: (iv_ruleComputedColumn= ruleComputedColumn EOF )
            // InternalFromText.g:490:2: iv_ruleComputedColumn= ruleComputedColumn EOF
            {
             newCompositeNode(grammarAccess.getComputedColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComputedColumn=ruleComputedColumn();

            state._fsp--;

             current =iv_ruleComputedColumn; 
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
    // $ANTLR end "entryRuleComputedColumn"


    // $ANTLR start "ruleComputedColumn"
    // InternalFromText.g:496:1: ruleComputedColumn returns [EObject current=null] : (otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) ) ;
    public final EObject ruleComputedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_id_7_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:502:2: ( (otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) ) )
            // InternalFromText.g:503:2: (otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) )
            {
            // InternalFromText.g:503:2: (otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) )
            // InternalFromText.g:504:3: otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComputedColumnAccess().getComputedKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getComputedColumnAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFromText.g:512:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalFromText.g:513:4: (lv_type_2_0= ruleDataType )
            {
            // InternalFromText.g:513:4: (lv_type_2_0= ruleDataType )
            // InternalFromText.g:514:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getComputedColumnAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_2_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputedColumnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.n7.chaiseMinute.FromText.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getComputedColumnAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getComputedColumnAccess().getColonKeyword_4());
            		
            // InternalFromText.g:539:3: ( ( ruleEString ) )
            // InternalFromText.g:540:4: ( ruleEString )
            {
            // InternalFromText.g:540:4: ( ruleEString )
            // InternalFromText.g:541:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComputedColumnRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComputedColumnAccess().getFunctionAlgorithmCrossReference_5_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getComputedColumnAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            // InternalFromText.g:559:3: ( (lv_id_7_0= ruleEString ) )
            // InternalFromText.g:560:4: (lv_id_7_0= ruleEString )
            {
            // InternalFromText.g:560:4: (lv_id_7_0= ruleEString )
            // InternalFromText.g:561:5: lv_id_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComputedColumnAccess().getIdEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_id_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputedColumnRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_7_0,
            						"fr.n7.chaiseMinute.FromText.EString");
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
    // $ANTLR end "ruleComputedColumn"


    // $ANTLR start "entryRuleColumnArgument"
    // InternalFromText.g:582:1: entryRuleColumnArgument returns [EObject current=null] : iv_ruleColumnArgument= ruleColumnArgument EOF ;
    public final EObject entryRuleColumnArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnArgument = null;


        try {
            // InternalFromText.g:582:55: (iv_ruleColumnArgument= ruleColumnArgument EOF )
            // InternalFromText.g:583:2: iv_ruleColumnArgument= ruleColumnArgument EOF
            {
             newCompositeNode(grammarAccess.getColumnArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnArgument=ruleColumnArgument();

            state._fsp--;

             current =iv_ruleColumnArgument; 
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
    // $ANTLR end "entryRuleColumnArgument"


    // $ANTLR start "ruleColumnArgument"
    // InternalFromText.g:589:1: ruleColumnArgument returns [EObject current=null] : ( () ( (lv_columnPath_1_0= ruleEString ) ) ) ;
    public final EObject ruleColumnArgument() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_columnPath_1_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:595:2: ( ( () ( (lv_columnPath_1_0= ruleEString ) ) ) )
            // InternalFromText.g:596:2: ( () ( (lv_columnPath_1_0= ruleEString ) ) )
            {
            // InternalFromText.g:596:2: ( () ( (lv_columnPath_1_0= ruleEString ) ) )
            // InternalFromText.g:597:3: () ( (lv_columnPath_1_0= ruleEString ) )
            {
            // InternalFromText.g:597:3: ()
            // InternalFromText.g:598:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnArgumentAccess().getColumnArgumentAction_0(),
            					current);
            			

            }

            // InternalFromText.g:604:3: ( (lv_columnPath_1_0= ruleEString ) )
            // InternalFromText.g:605:4: (lv_columnPath_1_0= ruleEString )
            {
            // InternalFromText.g:605:4: (lv_columnPath_1_0= ruleEString )
            // InternalFromText.g:606:5: lv_columnPath_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnArgumentAccess().getColumnPathEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_columnPath_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnArgumentRule());
            					}
            					set(
            						current,
            						"columnPath",
            						lv_columnPath_1_0,
            						"fr.n7.chaiseMinute.FromText.EString");
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
    // $ANTLR end "ruleColumnArgument"


    // $ANTLR start "entryRuleArgument"
    // InternalFromText.g:627:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalFromText.g:627:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalFromText.g:628:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalFromText.g:634:1: ruleArgument returns [EObject current=null] : this_ColumnArgument_0= ruleColumnArgument ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_ColumnArgument_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:640:2: (this_ColumnArgument_0= ruleColumnArgument )
            // InternalFromText.g:641:2: this_ColumnArgument_0= ruleColumnArgument
            {

            		newCompositeNode(grammarAccess.getArgumentAccess().getColumnArgumentParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ColumnArgument_0=ruleColumnArgument();

            state._fsp--;


            		current = this_ColumnArgument_0;
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleOperation"
    // InternalFromText.g:652:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalFromText.g:652:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalFromText.g:653:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalFromText.g:659:1: ruleOperation returns [EObject current=null] : this_Sum_0= ruleSum ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Sum_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:665:2: (this_Sum_0= ruleSum )
            // InternalFromText.g:666:2: this_Sum_0= ruleSum
            {

            		newCompositeNode(grammarAccess.getOperationAccess().getSumParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Sum_0=ruleSum();

            state._fsp--;


            		current = this_Sum_0;
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEString"
    // InternalFromText.g:677:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFromText.g:677:47: (iv_ruleEString= ruleEString EOF )
            // InternalFromText.g:678:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFromText.g:684:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFromText.g:690:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFromText.g:691:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFromText.g:691:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFromText.g:692:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFromText.g:700:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFunction"
    // InternalFromText.g:711:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalFromText.g:711:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalFromText.g:712:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalFromText.g:718:1: ruleFunction returns [EObject current=null] : ( () otherlv_1= 'Function' otherlv_2= '{' (otherlv_3= 'previous' ( ( ruleEString ) ) )? (otherlv_5= 'next' ( ( ruleEString ) ) )? (otherlv_7= 'input' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'operation' ( (lv_operation_14_0= ruleOperation ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_operation_14_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:724:2: ( ( () otherlv_1= 'Function' otherlv_2= '{' (otherlv_3= 'previous' ( ( ruleEString ) ) )? (otherlv_5= 'next' ( ( ruleEString ) ) )? (otherlv_7= 'input' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'operation' ( (lv_operation_14_0= ruleOperation ) ) )? otherlv_15= '}' ) )
            // InternalFromText.g:725:2: ( () otherlv_1= 'Function' otherlv_2= '{' (otherlv_3= 'previous' ( ( ruleEString ) ) )? (otherlv_5= 'next' ( ( ruleEString ) ) )? (otherlv_7= 'input' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'operation' ( (lv_operation_14_0= ruleOperation ) ) )? otherlv_15= '}' )
            {
            // InternalFromText.g:725:2: ( () otherlv_1= 'Function' otherlv_2= '{' (otherlv_3= 'previous' ( ( ruleEString ) ) )? (otherlv_5= 'next' ( ( ruleEString ) ) )? (otherlv_7= 'input' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'operation' ( (lv_operation_14_0= ruleOperation ) ) )? otherlv_15= '}' )
            // InternalFromText.g:726:3: () otherlv_1= 'Function' otherlv_2= '{' (otherlv_3= 'previous' ( ( ruleEString ) ) )? (otherlv_5= 'next' ( ( ruleEString ) ) )? (otherlv_7= 'input' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'operation' ( (lv_operation_14_0= ruleOperation ) ) )? otherlv_15= '}'
            {
            // InternalFromText.g:726:3: ()
            // InternalFromText.g:727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionAccess().getFunctionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getFunctionKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFromText.g:741:3: (otherlv_3= 'previous' ( ( ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFromText.g:742:4: otherlv_3= 'previous' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getPreviousKeyword_3_0());
                    			
                    // InternalFromText.g:746:4: ( ( ruleEString ) )
                    // InternalFromText.g:747:5: ( ruleEString )
                    {
                    // InternalFromText.g:747:5: ( ruleEString )
                    // InternalFromText.g:748:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFunctionAccess().getPreviousFunctionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFromText.g:763:3: (otherlv_5= 'next' ( ( ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFromText.g:764:4: otherlv_5= 'next' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getNextKeyword_4_0());
                    			
                    // InternalFromText.g:768:4: ( ( ruleEString ) )
                    // InternalFromText.g:769:5: ( ruleEString )
                    {
                    // InternalFromText.g:769:5: ( ruleEString )
                    // InternalFromText.g:770:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFunctionAccess().getNextFunctionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFromText.g:785:3: (otherlv_7= 'input' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFromText.g:786:4: otherlv_7= 'input' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getInputKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalFromText.g:794:4: ( ( ruleEString ) )
                    // InternalFromText.g:795:5: ( ruleEString )
                    {
                    // InternalFromText.g:795:5: ( ruleEString )
                    // InternalFromText.g:796:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFunctionAccess().getInputArgumentCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFromText.g:810:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalFromText.g:811:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalFromText.g:815:5: ( ( ruleEString ) )
                    	    // InternalFromText.g:816:6: ( ruleEString )
                    	    {
                    	    // InternalFromText.g:816:6: ( ruleEString )
                    	    // InternalFromText.g:817:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFunctionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getInputArgumentCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalFromText.g:837:3: (otherlv_13= 'operation' ( (lv_operation_14_0= ruleOperation ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFromText.g:838:4: otherlv_13= 'operation' ( (lv_operation_14_0= ruleOperation ) )
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_13, grammarAccess.getFunctionAccess().getOperationKeyword_6_0());
                    			
                    // InternalFromText.g:842:4: ( (lv_operation_14_0= ruleOperation ) )
                    // InternalFromText.g:843:5: (lv_operation_14_0= ruleOperation )
                    {
                    // InternalFromText.g:843:5: (lv_operation_14_0= ruleOperation )
                    // InternalFromText.g:844:6: lv_operation_14_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getOperationOperationParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_operation_14_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_14_0,
                    							"fr.n7.chaiseMinute.FromText.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleSum"
    // InternalFromText.g:870:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalFromText.g:870:44: (iv_ruleSum= ruleSum EOF )
            // InternalFromText.g:871:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalFromText.g:877:1: ruleSum returns [EObject current=null] : ( () otherlv_1= 'Sum' ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFromText.g:883:2: ( ( () otherlv_1= 'Sum' ) )
            // InternalFromText.g:884:2: ( () otherlv_1= 'Sum' )
            {
            // InternalFromText.g:884:2: ( () otherlv_1= 'Sum' )
            // InternalFromText.g:885:3: () otherlv_1= 'Sum'
            {
            // InternalFromText.g:885:3: ()
            // InternalFromText.g:886:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSumAccess().getSumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSumAccess().getSumKeyword_1());
            		

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
    // $ANTLR end "ruleSum"


    // $ANTLR start "ruleDataType"
    // InternalFromText.g:900:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFromText.g:906:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) ) )
            // InternalFromText.g:907:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) )
            {
            // InternalFromText.g:907:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFromText.g:908:3: (enumLiteral_0= 'String' )
                    {
                    // InternalFromText.g:908:3: (enumLiteral_0= 'String' )
                    // InternalFromText.g:909:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFromText.g:916:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalFromText.g:916:3: (enumLiteral_1= 'Int' )
                    // InternalFromText.g:917:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000145000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000144000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003C01000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003801000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001000L});

}