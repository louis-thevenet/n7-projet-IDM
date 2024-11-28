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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'data'", "'('", "')'", "':'", "'imported'", "'->'", "'computed'", "'Sum'", "'Feur'", "'>'", "'String'", "'Int'"
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
    // InternalFromText.g:72:1: ruleChaiseMinute returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_tables_1_0= ruleTable ) ) ( (otherlv_2= ',' )? ( (lv_tables_3_0= ruleTable ) ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleChaiseMinute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tables_1_0 = null;

        EObject lv_tables_3_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:78:2: ( (otherlv_0= '{' ( ( (lv_tables_1_0= ruleTable ) ) ( (otherlv_2= ',' )? ( (lv_tables_3_0= ruleTable ) ) )* )? otherlv_4= '}' ) )
            // InternalFromText.g:79:2: (otherlv_0= '{' ( ( (lv_tables_1_0= ruleTable ) ) ( (otherlv_2= ',' )? ( (lv_tables_3_0= ruleTable ) ) )* )? otherlv_4= '}' )
            {
            // InternalFromText.g:79:2: (otherlv_0= '{' ( ( (lv_tables_1_0= ruleTable ) ) ( (otherlv_2= ',' )? ( (lv_tables_3_0= ruleTable ) ) )* )? otherlv_4= '}' )
            // InternalFromText.g:80:3: otherlv_0= '{' ( ( (lv_tables_1_0= ruleTable ) ) ( (otherlv_2= ',' )? ( (lv_tables_3_0= ruleTable ) ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChaiseMinuteAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalFromText.g:84:3: ( ( (lv_tables_1_0= ruleTable ) ) ( (otherlv_2= ',' )? ( (lv_tables_3_0= ruleTable ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFromText.g:85:4: ( (lv_tables_1_0= ruleTable ) ) ( (otherlv_2= ',' )? ( (lv_tables_3_0= ruleTable ) ) )*
                    {
                    // InternalFromText.g:85:4: ( (lv_tables_1_0= ruleTable ) )
                    // InternalFromText.g:86:5: (lv_tables_1_0= ruleTable )
                    {
                    // InternalFromText.g:86:5: (lv_tables_1_0= ruleTable )
                    // InternalFromText.g:87:6: lv_tables_1_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getChaiseMinuteAccess().getTablesTableParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
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

                    // InternalFromText.g:104:4: ( (otherlv_2= ',' )? ( (lv_tables_3_0= ruleTable ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalFromText.g:105:5: (otherlv_2= ',' )? ( (lv_tables_3_0= ruleTable ) )
                    	    {
                    	    // InternalFromText.g:105:5: (otherlv_2= ',' )?
                    	    int alt1=2;
                    	    int LA1_0 = input.LA(1);

                    	    if ( (LA1_0==12) ) {
                    	        alt1=1;
                    	    }
                    	    switch (alt1) {
                    	        case 1 :
                    	            // InternalFromText.g:106:6: otherlv_2= ','
                    	            {
                    	            otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    	            						newLeafNode(otherlv_2, grammarAccess.getChaiseMinuteAccess().getCommaKeyword_1_1_0());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalFromText.g:111:5: ( (lv_tables_3_0= ruleTable ) )
                    	    // InternalFromText.g:112:6: (lv_tables_3_0= ruleTable )
                    	    {
                    	    // InternalFromText.g:112:6: (lv_tables_3_0= ruleTable )
                    	    // InternalFromText.g:113:7: lv_tables_3_0= ruleTable
                    	    {

                    	    							newCompositeNode(grammarAccess.getChaiseMinuteAccess().getTablesTableParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_tables_3_0=ruleTable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChaiseMinuteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tables",
                    	    								lv_tables_3_0,
                    	    								"fr.n7.chaiseMinute.FromText.Table");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getChaiseMinuteAccess().getRightCurlyBracketKeyword_2());
            		

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
    // InternalFromText.g:140:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalFromText.g:140:46: (iv_ruleTable= ruleTable EOF )
            // InternalFromText.g:141:2: iv_ruleTable= ruleTable EOF
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
    // InternalFromText.g:147:1: ruleTable returns [EObject current=null] : (otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}' ) ;
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
            // InternalFromText.g:153:2: ( (otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}' ) )
            // InternalFromText.g:154:2: (otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}' )
            {
            // InternalFromText.g:154:2: (otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}' )
            // InternalFromText.g:155:3: otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalFromText.g:159:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFromText.g:160:4: (lv_name_1_0= ruleEString )
            {
            // InternalFromText.g:160:4: (lv_name_1_0= ruleEString )
            // InternalFromText.g:161:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getCommaKeyword_2());
            		
            // InternalFromText.g:182:3: ( (lv_indexColumn_3_0= ruleIndexColumn ) )
            // InternalFromText.g:183:4: (lv_indexColumn_3_0= ruleIndexColumn )
            {
            // InternalFromText.g:183:4: (lv_indexColumn_3_0= ruleIndexColumn )
            // InternalFromText.g:184:5: lv_indexColumn_3_0= ruleIndexColumn
            {

            					newCompositeNode(grammarAccess.getTableAccess().getIndexColumnIndexColumnParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_4=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_4());
            		
            // InternalFromText.g:205:3: ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14||LA5_0==18||LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFromText.g:206:4: ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )*
                    {
                    // InternalFromText.g:206:4: ( (lv_columns_5_0= ruleColumn ) )
                    // InternalFromText.g:207:5: (lv_columns_5_0= ruleColumn )
                    {
                    // InternalFromText.g:207:5: (lv_columns_5_0= ruleColumn )
                    // InternalFromText.g:208:6: lv_columns_5_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalFromText.g:225:4: (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==12) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalFromText.g:226:5: otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) )
                    	    {
                    	    otherlv_6=(Token)match(input,12,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTableAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalFromText.g:230:5: ( (lv_columns_7_0= ruleColumn ) )
                    	    // InternalFromText.g:231:6: (lv_columns_7_0= ruleColumn )
                    	    {
                    	    // InternalFromText.g:231:6: (lv_columns_7_0= ruleColumn )
                    	    // InternalFromText.g:232:7: lv_columns_7_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

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
    // InternalFromText.g:259:1: entryRuleIndexColumn returns [EObject current=null] : iv_ruleIndexColumn= ruleIndexColumn EOF ;
    public final EObject entryRuleIndexColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexColumn = null;


        try {
            // InternalFromText.g:259:52: (iv_ruleIndexColumn= ruleIndexColumn EOF )
            // InternalFromText.g:260:2: iv_ruleIndexColumn= ruleIndexColumn EOF
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
    // InternalFromText.g:266:1: ruleIndexColumn returns [EObject current=null] : () ;
    public final EObject ruleIndexColumn() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalFromText.g:272:2: ( () )
            // InternalFromText.g:273:2: ()
            {
            // InternalFromText.g:273:2: ()
            // InternalFromText.g:274:3: 
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
    // InternalFromText.g:283:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalFromText.g:283:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalFromText.g:284:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalFromText.g:290:1: ruleColumn returns [EObject current=null] : (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        EObject this_ColumnData_0 = null;

        EObject this_ComputedColumn_1 = null;

        EObject this_ImportedColumn_2 = null;



        	enterRule();

        try {
            // InternalFromText.g:296:2: ( (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn ) )
            // InternalFromText.g:297:2: (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn )
            {
            // InternalFromText.g:297:2: (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFromText.g:298:3: this_ColumnData_0= ruleColumnData
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
                    // InternalFromText.g:307:3: this_ComputedColumn_1= ruleComputedColumn
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
                    // InternalFromText.g:316:3: this_ImportedColumn_2= ruleImportedColumn
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
    // InternalFromText.g:328:1: entryRuleColumnData returns [EObject current=null] : iv_ruleColumnData= ruleColumnData EOF ;
    public final EObject entryRuleColumnData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnData = null;


        try {
            // InternalFromText.g:328:51: (iv_ruleColumnData= ruleColumnData EOF )
            // InternalFromText.g:329:2: iv_ruleColumnData= ruleColumnData EOF
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
    // InternalFromText.g:335:1: ruleColumnData returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) ) ) ;
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
            // InternalFromText.g:341:2: ( (otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) ) ) )
            // InternalFromText.g:342:2: (otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) ) )
            {
            // InternalFromText.g:342:2: (otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) ) )
            // InternalFromText.g:343:3: otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnDataAccess().getDataKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnDataAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFromText.g:351:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalFromText.g:352:4: (lv_type_2_0= ruleDataType )
            {
            // InternalFromText.g:352:4: (lv_type_2_0= ruleDataType )
            // InternalFromText.g:353:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getColumnDataAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnDataAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnDataAccess().getColonKeyword_4());
            		
            // InternalFromText.g:378:3: ( (lv_id_5_0= ruleEString ) )
            // InternalFromText.g:379:4: (lv_id_5_0= ruleEString )
            {
            // InternalFromText.g:379:4: (lv_id_5_0= ruleEString )
            // InternalFromText.g:380:5: lv_id_5_0= ruleEString
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
    // InternalFromText.g:401:1: entryRuleImportedColumn returns [EObject current=null] : iv_ruleImportedColumn= ruleImportedColumn EOF ;
    public final EObject entryRuleImportedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedColumn = null;


        try {
            // InternalFromText.g:401:55: (iv_ruleImportedColumn= ruleImportedColumn EOF )
            // InternalFromText.g:402:2: iv_ruleImportedColumn= ruleImportedColumn EOF
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
    // InternalFromText.g:408:1: ruleImportedColumn returns [EObject current=null] : (otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) ) ;
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
            // InternalFromText.g:414:2: ( (otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) ) )
            // InternalFromText.g:415:2: (otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) )
            {
            // InternalFromText.g:415:2: (otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) )
            // InternalFromText.g:416:3: otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getImportedColumnAccess().getImportedKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getImportedColumnAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFromText.g:424:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalFromText.g:425:4: (lv_type_2_0= ruleDataType )
            {
            // InternalFromText.g:425:4: (lv_type_2_0= ruleDataType )
            // InternalFromText.g:426:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getImportedColumnAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getImportedColumnAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getImportedColumnAccess().getColonKeyword_4());
            		
            // InternalFromText.g:451:3: ( (lv_path_5_0= ruleEString ) )
            // InternalFromText.g:452:4: (lv_path_5_0= ruleEString )
            {
            // InternalFromText.g:452:4: (lv_path_5_0= ruleEString )
            // InternalFromText.g:453:5: lv_path_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getImportedColumnAccess().getPathEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_6=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getImportedColumnAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            // InternalFromText.g:474:3: ( (lv_id_7_0= ruleEString ) )
            // InternalFromText.g:475:4: (lv_id_7_0= ruleEString )
            {
            // InternalFromText.g:475:4: (lv_id_7_0= ruleEString )
            // InternalFromText.g:476:5: lv_id_7_0= ruleEString
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
    // InternalFromText.g:497:1: entryRuleComputedColumn returns [EObject current=null] : iv_ruleComputedColumn= ruleComputedColumn EOF ;
    public final EObject entryRuleComputedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedColumn = null;


        try {
            // InternalFromText.g:497:55: (iv_ruleComputedColumn= ruleComputedColumn EOF )
            // InternalFromText.g:498:2: iv_ruleComputedColumn= ruleComputedColumn EOF
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
    // InternalFromText.g:504:1: ruleComputedColumn returns [EObject current=null] : (otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_algorithm_5_0= ruleAlgorithm ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) ) ;
    public final EObject ruleComputedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_algorithm_5_0 = null;

        AntlrDatatypeRuleToken lv_id_7_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:510:2: ( (otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_algorithm_5_0= ruleAlgorithm ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) ) )
            // InternalFromText.g:511:2: (otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_algorithm_5_0= ruleAlgorithm ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) )
            {
            // InternalFromText.g:511:2: (otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_algorithm_5_0= ruleAlgorithm ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) )
            // InternalFromText.g:512:3: otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_algorithm_5_0= ruleAlgorithm ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getComputedColumnAccess().getComputedKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getComputedColumnAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFromText.g:520:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalFromText.g:521:4: (lv_type_2_0= ruleDataType )
            {
            // InternalFromText.g:521:4: (lv_type_2_0= ruleDataType )
            // InternalFromText.g:522:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getComputedColumnAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getComputedColumnAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getComputedColumnAccess().getColonKeyword_4());
            		
            // InternalFromText.g:547:3: ( (lv_algorithm_5_0= ruleAlgorithm ) )
            // InternalFromText.g:548:4: (lv_algorithm_5_0= ruleAlgorithm )
            {
            // InternalFromText.g:548:4: (lv_algorithm_5_0= ruleAlgorithm )
            // InternalFromText.g:549:5: lv_algorithm_5_0= ruleAlgorithm
            {

            					newCompositeNode(grammarAccess.getComputedColumnAccess().getAlgorithmAlgorithmParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_algorithm_5_0=ruleAlgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputedColumnRule());
            					}
            					set(
            						current,
            						"algorithm",
            						lv_algorithm_5_0,
            						"fr.n7.chaiseMinute.FromText.Algorithm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getComputedColumnAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            // InternalFromText.g:570:3: ( (lv_id_7_0= ruleEString ) )
            // InternalFromText.g:571:4: (lv_id_7_0= ruleEString )
            {
            // InternalFromText.g:571:4: (lv_id_7_0= ruleEString )
            // InternalFromText.g:572:5: lv_id_7_0= ruleEString
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
    // InternalFromText.g:593:1: entryRuleColumnArgument returns [EObject current=null] : iv_ruleColumnArgument= ruleColumnArgument EOF ;
    public final EObject entryRuleColumnArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnArgument = null;


        try {
            // InternalFromText.g:593:55: (iv_ruleColumnArgument= ruleColumnArgument EOF )
            // InternalFromText.g:594:2: iv_ruleColumnArgument= ruleColumnArgument EOF
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
    // InternalFromText.g:600:1: ruleColumnArgument returns [EObject current=null] : ( () ( (lv_columnPath_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleColumnArgument() throws RecognitionException {
        EObject current = null;

        Token lv_columnPath_1_0=null;


        	enterRule();

        try {
            // InternalFromText.g:606:2: ( ( () ( (lv_columnPath_1_0= RULE_STRING ) ) ) )
            // InternalFromText.g:607:2: ( () ( (lv_columnPath_1_0= RULE_STRING ) ) )
            {
            // InternalFromText.g:607:2: ( () ( (lv_columnPath_1_0= RULE_STRING ) ) )
            // InternalFromText.g:608:3: () ( (lv_columnPath_1_0= RULE_STRING ) )
            {
            // InternalFromText.g:608:3: ()
            // InternalFromText.g:609:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnArgumentAccess().getColumnArgumentAction_0(),
            					current);
            			

            }

            // InternalFromText.g:615:3: ( (lv_columnPath_1_0= RULE_STRING ) )
            // InternalFromText.g:616:4: (lv_columnPath_1_0= RULE_STRING )
            {
            // InternalFromText.g:616:4: (lv_columnPath_1_0= RULE_STRING )
            // InternalFromText.g:617:5: lv_columnPath_1_0= RULE_STRING
            {
            lv_columnPath_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_columnPath_1_0, grammarAccess.getColumnArgumentAccess().getColumnPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"columnPath",
            						lv_columnPath_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // InternalFromText.g:637:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalFromText.g:637:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalFromText.g:638:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalFromText.g:644:1: ruleArgument returns [EObject current=null] : this_ColumnArgument_0= ruleColumnArgument ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_ColumnArgument_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:650:2: (this_ColumnArgument_0= ruleColumnArgument )
            // InternalFromText.g:651:2: this_ColumnArgument_0= ruleColumnArgument
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


    // $ANTLR start "entryRuleAlgorithm"
    // InternalFromText.g:662:1: entryRuleAlgorithm returns [EObject current=null] : iv_ruleAlgorithm= ruleAlgorithm EOF ;
    public final EObject entryRuleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithm = null;


        try {
            // InternalFromText.g:662:50: (iv_ruleAlgorithm= ruleAlgorithm EOF )
            // InternalFromText.g:663:2: iv_ruleAlgorithm= ruleAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithm=ruleAlgorithm();

            state._fsp--;

             current =iv_ruleAlgorithm; 
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
    // $ANTLR end "entryRuleAlgorithm"


    // $ANTLR start "ruleAlgorithm"
    // InternalFromText.g:669:1: ruleAlgorithm returns [EObject current=null] : ( () ( (lv_function_1_0= ruleFunction ) ) ) ;
    public final EObject ruleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject lv_function_1_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:675:2: ( ( () ( (lv_function_1_0= ruleFunction ) ) ) )
            // InternalFromText.g:676:2: ( () ( (lv_function_1_0= ruleFunction ) ) )
            {
            // InternalFromText.g:676:2: ( () ( (lv_function_1_0= ruleFunction ) ) )
            // InternalFromText.g:677:3: () ( (lv_function_1_0= ruleFunction ) )
            {
            // InternalFromText.g:677:3: ()
            // InternalFromText.g:678:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlgorithmAccess().getAlgorithmAction_0(),
            					current);
            			

            }

            // InternalFromText.g:684:3: ( (lv_function_1_0= ruleFunction ) )
            // InternalFromText.g:685:4: (lv_function_1_0= ruleFunction )
            {
            // InternalFromText.g:685:4: (lv_function_1_0= ruleFunction )
            // InternalFromText.g:686:5: lv_function_1_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getAlgorithmAccess().getFunctionFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_function_1_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"fr.n7.chaiseMinute.FromText.Function");
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
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "entryRuleOperation"
    // InternalFromText.g:707:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalFromText.g:707:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalFromText.g:708:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalFromText.g:714:1: ruleOperation returns [EObject current=null] : (this_Sum_0= ruleSum | this_Feur_1= ruleFeur ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Sum_0 = null;

        EObject this_Feur_1 = null;



        	enterRule();

        try {
            // InternalFromText.g:720:2: ( (this_Sum_0= ruleSum | this_Feur_1= ruleFeur ) )
            // InternalFromText.g:721:2: (this_Sum_0= ruleSum | this_Feur_1= ruleFeur )
            {
            // InternalFromText.g:721:2: (this_Sum_0= ruleSum | this_Feur_1= ruleFeur )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFromText.g:722:3: this_Sum_0= ruleSum
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getSumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sum_0=ruleSum();

                    state._fsp--;


                    			current = this_Sum_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFromText.g:731:3: this_Feur_1= ruleFeur
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getFeurParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Feur_1=ruleFeur();

                    state._fsp--;


                    			current = this_Feur_1;
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSum"
    // InternalFromText.g:743:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalFromText.g:743:44: (iv_ruleSum= ruleSum EOF )
            // InternalFromText.g:744:2: iv_ruleSum= ruleSum EOF
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
    // InternalFromText.g:750:1: ruleSum returns [EObject current=null] : ( () otherlv_1= 'Sum' ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFromText.g:756:2: ( ( () otherlv_1= 'Sum' ) )
            // InternalFromText.g:757:2: ( () otherlv_1= 'Sum' )
            {
            // InternalFromText.g:757:2: ( () otherlv_1= 'Sum' )
            // InternalFromText.g:758:3: () otherlv_1= 'Sum'
            {
            // InternalFromText.g:758:3: ()
            // InternalFromText.g:759:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSumAccess().getSumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFeur"
    // InternalFromText.g:773:1: entryRuleFeur returns [EObject current=null] : iv_ruleFeur= ruleFeur EOF ;
    public final EObject entryRuleFeur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeur = null;


        try {
            // InternalFromText.g:773:45: (iv_ruleFeur= ruleFeur EOF )
            // InternalFromText.g:774:2: iv_ruleFeur= ruleFeur EOF
            {
             newCompositeNode(grammarAccess.getFeurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeur=ruleFeur();

            state._fsp--;

             current =iv_ruleFeur; 
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
    // $ANTLR end "entryRuleFeur"


    // $ANTLR start "ruleFeur"
    // InternalFromText.g:780:1: ruleFeur returns [EObject current=null] : ( () otherlv_1= 'Feur' ) ;
    public final EObject ruleFeur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFromText.g:786:2: ( ( () otherlv_1= 'Feur' ) )
            // InternalFromText.g:787:2: ( () otherlv_1= 'Feur' )
            {
            // InternalFromText.g:787:2: ( () otherlv_1= 'Feur' )
            // InternalFromText.g:788:3: () otherlv_1= 'Feur'
            {
            // InternalFromText.g:788:3: ()
            // InternalFromText.g:789:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeurAccess().getFeurAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFeurAccess().getFeurKeyword_1());
            		

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
    // $ANTLR end "ruleFeur"


    // $ANTLR start "entryRuleFunction"
    // InternalFromText.g:803:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalFromText.g:803:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalFromText.g:804:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalFromText.g:810:1: ruleFunction returns [EObject current=null] : ( () ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= '(' ( ( (lv_input_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_input_5_0= ruleArgument ) ) )* )? otherlv_6= ')' (otherlv_7= '>' ( (lv_next_8_0= ruleFunction ) ) )? ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_operation_1_0 = null;

        EObject lv_input_3_0 = null;

        EObject lv_input_5_0 = null;

        EObject lv_next_8_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:816:2: ( ( () ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= '(' ( ( (lv_input_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_input_5_0= ruleArgument ) ) )* )? otherlv_6= ')' (otherlv_7= '>' ( (lv_next_8_0= ruleFunction ) ) )? ) )
            // InternalFromText.g:817:2: ( () ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= '(' ( ( (lv_input_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_input_5_0= ruleArgument ) ) )* )? otherlv_6= ')' (otherlv_7= '>' ( (lv_next_8_0= ruleFunction ) ) )? )
            {
            // InternalFromText.g:817:2: ( () ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= '(' ( ( (lv_input_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_input_5_0= ruleArgument ) ) )* )? otherlv_6= ')' (otherlv_7= '>' ( (lv_next_8_0= ruleFunction ) ) )? )
            // InternalFromText.g:818:3: () ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= '(' ( ( (lv_input_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_input_5_0= ruleArgument ) ) )* )? otherlv_6= ')' (otherlv_7= '>' ( (lv_next_8_0= ruleFunction ) ) )?
            {
            // InternalFromText.g:818:3: ()
            // InternalFromText.g:819:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionAccess().getFunctionAction_0(),
            					current);
            			

            }

            // InternalFromText.g:825:3: ( (lv_operation_1_0= ruleOperation ) )
            // InternalFromText.g:826:4: (lv_operation_1_0= ruleOperation )
            {
            // InternalFromText.g:826:4: (lv_operation_1_0= ruleOperation )
            // InternalFromText.g:827:5: lv_operation_1_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getOperationOperationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_operation_1_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_1_0,
            						"fr.n7.chaiseMinute.FromText.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFromText.g:848:3: ( ( (lv_input_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_input_5_0= ruleArgument ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFromText.g:849:4: ( (lv_input_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_input_5_0= ruleArgument ) ) )*
                    {
                    // InternalFromText.g:849:4: ( (lv_input_3_0= ruleArgument ) )
                    // InternalFromText.g:850:5: (lv_input_3_0= ruleArgument )
                    {
                    // InternalFromText.g:850:5: (lv_input_3_0= ruleArgument )
                    // InternalFromText.g:851:6: lv_input_3_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getInputArgumentParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_input_3_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"input",
                    							lv_input_3_0,
                    							"fr.n7.chaiseMinute.FromText.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFromText.g:868:4: (otherlv_4= ',' ( (lv_input_5_0= ruleArgument ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==12) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalFromText.g:869:5: otherlv_4= ',' ( (lv_input_5_0= ruleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_19); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalFromText.g:873:5: ( (lv_input_5_0= ruleArgument ) )
                    	    // InternalFromText.g:874:6: (lv_input_5_0= ruleArgument )
                    	    {
                    	    // InternalFromText.g:874:6: (lv_input_5_0= ruleArgument )
                    	    // InternalFromText.g:875:7: lv_input_5_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getInputArgumentParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_input_5_0=ruleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"input",
                    	    								lv_input_5_0,
                    	    								"fr.n7.chaiseMinute.FromText.Argument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
            		
            // InternalFromText.g:898:3: (otherlv_7= '>' ( (lv_next_8_0= ruleFunction ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFromText.g:899:4: otherlv_7= '>' ( (lv_next_8_0= ruleFunction ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getGreaterThanSignKeyword_5_0());
                    			
                    // InternalFromText.g:903:4: ( (lv_next_8_0= ruleFunction ) )
                    // InternalFromText.g:904:5: (lv_next_8_0= ruleFunction )
                    {
                    // InternalFromText.g:904:5: (lv_next_8_0= ruleFunction )
                    // InternalFromText.g:905:6: lv_next_8_0= ruleFunction
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getNextFunctionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_next_8_0=ruleFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						set(
                    							current,
                    							"next",
                    							lv_next_8_0,
                    							"fr.n7.chaiseMinute.FromText.Function");
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleEString"
    // InternalFromText.g:927:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFromText.g:927:47: (iv_ruleEString= ruleEString EOF )
            // InternalFromText.g:928:2: iv_ruleEString= ruleEString EOF
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
    // InternalFromText.g:934:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFromText.g:940:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFromText.g:941:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFromText.g:941:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFromText.g:942:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFromText.g:950:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleDataType"
    // InternalFromText.g:961:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFromText.g:967:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) ) )
            // InternalFromText.g:968:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) )
            {
            // InternalFromText.g:968:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFromText.g:969:3: (enumLiteral_0= 'String' )
                    {
                    // InternalFromText.g:969:3: (enumLiteral_0= 'String' )
                    // InternalFromText.g:970:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFromText.g:977:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalFromText.g:977:3: (enumLiteral_1= 'Int' )
                    // InternalFromText.g:978:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000146000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000144000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});

}