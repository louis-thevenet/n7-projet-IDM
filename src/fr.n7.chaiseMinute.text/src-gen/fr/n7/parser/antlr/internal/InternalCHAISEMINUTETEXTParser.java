package fr.n7.parser.antlr.internal;

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
import fr.n7.services.CHAISEMINUTETEXTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCHAISEMINUTETEXTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'constrained'", "'by'", "'indexed'", "'on'", "'('", "')'", "'of'", "'computed'", "'with'", "'imported'", "'from'", "'['", "'>'", "']'", "'string'", "'int'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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


        public InternalCHAISEMINUTETEXTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCHAISEMINUTETEXTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCHAISEMINUTETEXTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCHAISEMINUTETEXT.g"; }



     	private CHAISEMINUTETEXTGrammarAccess grammarAccess;

        public InternalCHAISEMINUTETEXTParser(TokenStream input, CHAISEMINUTETEXTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ChaiseMinute";
       	}

       	@Override
       	protected CHAISEMINUTETEXTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleChaiseMinute"
    // InternalCHAISEMINUTETEXT.g:65:1: entryRuleChaiseMinute returns [EObject current=null] : iv_ruleChaiseMinute= ruleChaiseMinute EOF ;
    public final EObject entryRuleChaiseMinute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChaiseMinute = null;


        try {
            // InternalCHAISEMINUTETEXT.g:65:53: (iv_ruleChaiseMinute= ruleChaiseMinute EOF )
            // InternalCHAISEMINUTETEXT.g:66:2: iv_ruleChaiseMinute= ruleChaiseMinute EOF
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
    // InternalCHAISEMINUTETEXT.g:72:1: ruleChaiseMinute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )* )? otherlv_5= '}' (otherlv_6= 'constrained' otherlv_7= 'by' ( (lv_constraints_8_0= ruleAlgorithm ) ) )? ) ;
    public final EObject ruleChaiseMinute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_tables_2_0 = null;

        EObject lv_tables_4_0 = null;

        EObject lv_constraints_8_0 = null;



        	enterRule();

        try {
            // InternalCHAISEMINUTETEXT.g:78:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )* )? otherlv_5= '}' (otherlv_6= 'constrained' otherlv_7= 'by' ( (lv_constraints_8_0= ruleAlgorithm ) ) )? ) )
            // InternalCHAISEMINUTETEXT.g:79:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )* )? otherlv_5= '}' (otherlv_6= 'constrained' otherlv_7= 'by' ( (lv_constraints_8_0= ruleAlgorithm ) ) )? )
            {
            // InternalCHAISEMINUTETEXT.g:79:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )* )? otherlv_5= '}' (otherlv_6= 'constrained' otherlv_7= 'by' ( (lv_constraints_8_0= ruleAlgorithm ) ) )? )
            // InternalCHAISEMINUTETEXT.g:80:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )* )? otherlv_5= '}' (otherlv_6= 'constrained' otherlv_7= 'by' ( (lv_constraints_8_0= ruleAlgorithm ) ) )?
            {
            // InternalCHAISEMINUTETEXT.g:80:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCHAISEMINUTETEXT.g:81:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCHAISEMINUTETEXT.g:81:4: (lv_name_0_0= RULE_ID )
            // InternalCHAISEMINUTETEXT.g:82:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChaiseMinuteAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChaiseMinuteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChaiseMinuteAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCHAISEMINUTETEXT.g:102:3: ( ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCHAISEMINUTETEXT.g:103:4: ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )*
                    {
                    // InternalCHAISEMINUTETEXT.g:103:4: ( (lv_tables_2_0= ruleTable ) )
                    // InternalCHAISEMINUTETEXT.g:104:5: (lv_tables_2_0= ruleTable )
                    {
                    // InternalCHAISEMINUTETEXT.g:104:5: (lv_tables_2_0= ruleTable )
                    // InternalCHAISEMINUTETEXT.g:105:6: lv_tables_2_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getChaiseMinuteAccess().getTablesTableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_tables_2_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChaiseMinuteRule());
                    						}
                    						add(
                    							current,
                    							"tables",
                    							lv_tables_2_0,
                    							"fr.n7.CHAISEMINUTETEXT.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCHAISEMINUTETEXT.g:122:4: ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID||LA2_0==12) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalCHAISEMINUTETEXT.g:123:5: (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) )
                    	    {
                    	    // InternalCHAISEMINUTETEXT.g:123:5: (otherlv_3= ',' )?
                    	    int alt1=2;
                    	    int LA1_0 = input.LA(1);

                    	    if ( (LA1_0==12) ) {
                    	        alt1=1;
                    	    }
                    	    switch (alt1) {
                    	        case 1 :
                    	            // InternalCHAISEMINUTETEXT.g:124:6: otherlv_3= ','
                    	            {
                    	            otherlv_3=(Token)match(input,12,FOLLOW_6); 

                    	            						newLeafNode(otherlv_3, grammarAccess.getChaiseMinuteAccess().getCommaKeyword_2_1_0());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalCHAISEMINUTETEXT.g:129:5: ( (lv_tables_4_0= ruleTable ) )
                    	    // InternalCHAISEMINUTETEXT.g:130:6: (lv_tables_4_0= ruleTable )
                    	    {
                    	    // InternalCHAISEMINUTETEXT.g:130:6: (lv_tables_4_0= ruleTable )
                    	    // InternalCHAISEMINUTETEXT.g:131:7: lv_tables_4_0= ruleTable
                    	    {

                    	    							newCompositeNode(grammarAccess.getChaiseMinuteAccess().getTablesTableParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_tables_4_0=ruleTable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChaiseMinuteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tables",
                    	    								lv_tables_4_0,
                    	    								"fr.n7.CHAISEMINUTETEXT.Table");
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

            otherlv_5=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getChaiseMinuteAccess().getRightCurlyBracketKeyword_3());
            		
            // InternalCHAISEMINUTETEXT.g:154:3: (otherlv_6= 'constrained' otherlv_7= 'by' ( (lv_constraints_8_0= ruleAlgorithm ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCHAISEMINUTETEXT.g:155:4: otherlv_6= 'constrained' otherlv_7= 'by' ( (lv_constraints_8_0= ruleAlgorithm ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getChaiseMinuteAccess().getConstrainedKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getChaiseMinuteAccess().getByKeyword_4_1());
                    			
                    // InternalCHAISEMINUTETEXT.g:163:4: ( (lv_constraints_8_0= ruleAlgorithm ) )
                    // InternalCHAISEMINUTETEXT.g:164:5: (lv_constraints_8_0= ruleAlgorithm )
                    {
                    // InternalCHAISEMINUTETEXT.g:164:5: (lv_constraints_8_0= ruleAlgorithm )
                    // InternalCHAISEMINUTETEXT.g:165:6: lv_constraints_8_0= ruleAlgorithm
                    {

                    						newCompositeNode(grammarAccess.getChaiseMinuteAccess().getConstraintsAlgorithmParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_constraints_8_0=ruleAlgorithm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChaiseMinuteRule());
                    						}
                    						set(
                    							current,
                    							"constraints",
                    							lv_constraints_8_0,
                    							"fr.n7.CHAISEMINUTETEXT.Algorithm");
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
    // $ANTLR end "ruleChaiseMinute"


    // $ANTLR start "entryRuleTable"
    // InternalCHAISEMINUTETEXT.g:187:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalCHAISEMINUTETEXT.g:187:46: (iv_ruleTable= ruleTable EOF )
            // InternalCHAISEMINUTETEXT.g:188:2: iv_ruleTable= ruleTable EOF
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
    // InternalCHAISEMINUTETEXT.g:194:1: ruleTable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'indexed' otherlv_2= 'on' ( (lv_indexcolumn_3_0= ruleIndexColumn ) ) otherlv_4= '(' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= ')' (otherlv_9= 'constrained' otherlv_10= 'by' ( (lv_constraints_11_0= ruleAlgorithm ) ) )? ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_indexcolumn_3_0 = null;

        EObject lv_columns_5_0 = null;

        EObject lv_columns_7_0 = null;

        EObject lv_constraints_11_0 = null;



        	enterRule();

        try {
            // InternalCHAISEMINUTETEXT.g:200:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'indexed' otherlv_2= 'on' ( (lv_indexcolumn_3_0= ruleIndexColumn ) ) otherlv_4= '(' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= ')' (otherlv_9= 'constrained' otherlv_10= 'by' ( (lv_constraints_11_0= ruleAlgorithm ) ) )? ) )
            // InternalCHAISEMINUTETEXT.g:201:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'indexed' otherlv_2= 'on' ( (lv_indexcolumn_3_0= ruleIndexColumn ) ) otherlv_4= '(' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= ')' (otherlv_9= 'constrained' otherlv_10= 'by' ( (lv_constraints_11_0= ruleAlgorithm ) ) )? )
            {
            // InternalCHAISEMINUTETEXT.g:201:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'indexed' otherlv_2= 'on' ( (lv_indexcolumn_3_0= ruleIndexColumn ) ) otherlv_4= '(' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= ')' (otherlv_9= 'constrained' otherlv_10= 'by' ( (lv_constraints_11_0= ruleAlgorithm ) ) )? )
            // InternalCHAISEMINUTETEXT.g:202:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'indexed' otherlv_2= 'on' ( (lv_indexcolumn_3_0= ruleIndexColumn ) ) otherlv_4= '(' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= ')' (otherlv_9= 'constrained' otherlv_10= 'by' ( (lv_constraints_11_0= ruleAlgorithm ) ) )?
            {
            // InternalCHAISEMINUTETEXT.g:202:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCHAISEMINUTETEXT.g:203:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCHAISEMINUTETEXT.g:203:4: (lv_name_0_0= RULE_ID )
            // InternalCHAISEMINUTETEXT.g:204:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getIndexedKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getOnKeyword_2());
            		
            // InternalCHAISEMINUTETEXT.g:228:3: ( (lv_indexcolumn_3_0= ruleIndexColumn ) )
            // InternalCHAISEMINUTETEXT.g:229:4: (lv_indexcolumn_3_0= ruleIndexColumn )
            {
            // InternalCHAISEMINUTETEXT.g:229:4: (lv_indexcolumn_3_0= ruleIndexColumn )
            // InternalCHAISEMINUTETEXT.g:230:5: lv_indexcolumn_3_0= ruleIndexColumn
            {

            					newCompositeNode(grammarAccess.getTableAccess().getIndexcolumnIndexColumnParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_indexcolumn_3_0=ruleIndexColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"indexcolumn",
            						lv_indexcolumn_3_0,
            						"fr.n7.CHAISEMINUTETEXT.IndexColumn");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getTableAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCHAISEMINUTETEXT.g:251:3: ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCHAISEMINUTETEXT.g:252:4: ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )*
                    {
                    // InternalCHAISEMINUTETEXT.g:252:4: ( (lv_columns_5_0= ruleColumn ) )
                    // InternalCHAISEMINUTETEXT.g:253:5: (lv_columns_5_0= ruleColumn )
                    {
                    // InternalCHAISEMINUTETEXT.g:253:5: (lv_columns_5_0= ruleColumn )
                    // InternalCHAISEMINUTETEXT.g:254:6: lv_columns_5_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_columns_5_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_5_0,
                    							"fr.n7.CHAISEMINUTETEXT.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCHAISEMINUTETEXT.g:271:4: (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==12) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCHAISEMINUTETEXT.g:272:5: otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) )
                    	    {
                    	    otherlv_6=(Token)match(input,12,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTableAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalCHAISEMINUTETEXT.g:276:5: ( (lv_columns_7_0= ruleColumn ) )
                    	    // InternalCHAISEMINUTETEXT.g:277:6: (lv_columns_7_0= ruleColumn )
                    	    {
                    	    // InternalCHAISEMINUTETEXT.g:277:6: (lv_columns_7_0= ruleColumn )
                    	    // InternalCHAISEMINUTETEXT.g:278:7: lv_columns_7_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_columns_7_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_7_0,
                    	    								"fr.n7.CHAISEMINUTETEXT.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getTableAccess().getRightParenthesisKeyword_6());
            		
            // InternalCHAISEMINUTETEXT.g:301:3: (otherlv_9= 'constrained' otherlv_10= 'by' ( (lv_constraints_11_0= ruleAlgorithm ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCHAISEMINUTETEXT.g:302:4: otherlv_9= 'constrained' otherlv_10= 'by' ( (lv_constraints_11_0= ruleAlgorithm ) )
                    {
                    otherlv_9=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getTableAccess().getConstrainedKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getTableAccess().getByKeyword_7_1());
                    			
                    // InternalCHAISEMINUTETEXT.g:310:4: ( (lv_constraints_11_0= ruleAlgorithm ) )
                    // InternalCHAISEMINUTETEXT.g:311:5: (lv_constraints_11_0= ruleAlgorithm )
                    {
                    // InternalCHAISEMINUTETEXT.g:311:5: (lv_constraints_11_0= ruleAlgorithm )
                    // InternalCHAISEMINUTETEXT.g:312:6: lv_constraints_11_0= ruleAlgorithm
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getConstraintsAlgorithmParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_constraints_11_0=ruleAlgorithm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"constraints",
                    							lv_constraints_11_0,
                    							"fr.n7.CHAISEMINUTETEXT.Algorithm");
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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleIndexColumn"
    // InternalCHAISEMINUTETEXT.g:334:1: entryRuleIndexColumn returns [EObject current=null] : iv_ruleIndexColumn= ruleIndexColumn EOF ;
    public final EObject entryRuleIndexColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexColumn = null;


        try {
            // InternalCHAISEMINUTETEXT.g:334:52: (iv_ruleIndexColumn= ruleIndexColumn EOF )
            // InternalCHAISEMINUTETEXT.g:335:2: iv_ruleIndexColumn= ruleIndexColumn EOF
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
    // InternalCHAISEMINUTETEXT.g:341:1: ruleIndexColumn returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'of' ( (lv_type_3_0= ruleDataType ) ) ) ;
    public final EObject ruleIndexColumn() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalCHAISEMINUTETEXT.g:347:2: ( ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'of' ( (lv_type_3_0= ruleDataType ) ) ) )
            // InternalCHAISEMINUTETEXT.g:348:2: ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'of' ( (lv_type_3_0= ruleDataType ) ) )
            {
            // InternalCHAISEMINUTETEXT.g:348:2: ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'of' ( (lv_type_3_0= ruleDataType ) ) )
            // InternalCHAISEMINUTETEXT.g:349:3: () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'of' ( (lv_type_3_0= ruleDataType ) )
            {
            // InternalCHAISEMINUTETEXT.g:349:3: ()
            // InternalCHAISEMINUTETEXT.g:350:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexColumnAccess().getIndexColumnAction_0(),
            					current);
            			

            }

            // InternalCHAISEMINUTETEXT.g:356:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalCHAISEMINUTETEXT.g:357:4: (lv_id_1_0= RULE_ID )
            {
            // InternalCHAISEMINUTETEXT.g:357:4: (lv_id_1_0= RULE_ID )
            // InternalCHAISEMINUTETEXT.g:358:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_id_1_0, grammarAccess.getIndexColumnAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexColumnAccess().getOfKeyword_2());
            		
            // InternalCHAISEMINUTETEXT.g:378:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalCHAISEMINUTETEXT.g:379:4: (lv_type_3_0= ruleDataType )
            {
            // InternalCHAISEMINUTETEXT.g:379:4: (lv_type_3_0= ruleDataType )
            // InternalCHAISEMINUTETEXT.g:380:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getIndexColumnAccess().getTypeDataTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexColumnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"fr.n7.CHAISEMINUTETEXT.DataType");
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
    // $ANTLR end "ruleIndexColumn"


    // $ANTLR start "entryRuleColumn"
    // InternalCHAISEMINUTETEXT.g:401:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalCHAISEMINUTETEXT.g:401:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalCHAISEMINUTETEXT.g:402:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalCHAISEMINUTETEXT.g:408:1: ruleColumn returns [EObject current=null] : (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        EObject this_ColumnData_0 = null;

        EObject this_ComputedColumn_1 = null;

        EObject this_ImportedColumn_2 = null;



        	enterRule();

        try {
            // InternalCHAISEMINUTETEXT.g:414:2: ( (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn ) )
            // InternalCHAISEMINUTETEXT.g:415:2: (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn )
            {
            // InternalCHAISEMINUTETEXT.g:415:2: (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==20) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==28) ) {
                        switch ( input.LA(4) ) {
                        case 21:
                            {
                            alt8=2;
                            }
                            break;
                        case EOF:
                        case 12:
                        case 19:
                            {
                            alt8=1;
                            }
                            break;
                        case 23:
                            {
                            alt8=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 3, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA8_2==29) ) {
                        switch ( input.LA(4) ) {
                        case 23:
                            {
                            alt8=3;
                            }
                            break;
                        case 21:
                            {
                            alt8=2;
                            }
                            break;
                        case EOF:
                        case 12:
                        case 19:
                            {
                            alt8=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 4, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCHAISEMINUTETEXT.g:416:3: this_ColumnData_0= ruleColumnData
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
                    // InternalCHAISEMINUTETEXT.g:425:3: this_ComputedColumn_1= ruleComputedColumn
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
                    // InternalCHAISEMINUTETEXT.g:434:3: this_ImportedColumn_2= ruleImportedColumn
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
    // InternalCHAISEMINUTETEXT.g:446:1: entryRuleColumnData returns [EObject current=null] : iv_ruleColumnData= ruleColumnData EOF ;
    public final EObject entryRuleColumnData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnData = null;


        try {
            // InternalCHAISEMINUTETEXT.g:446:51: (iv_ruleColumnData= ruleColumnData EOF )
            // InternalCHAISEMINUTETEXT.g:447:2: iv_ruleColumnData= ruleColumnData EOF
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
    // InternalCHAISEMINUTETEXT.g:453:1: ruleColumnData returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) ) ;
    public final EObject ruleColumnData() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalCHAISEMINUTETEXT.g:459:2: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) ) )
            // InternalCHAISEMINUTETEXT.g:460:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) )
            {
            // InternalCHAISEMINUTETEXT.g:460:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) )
            // InternalCHAISEMINUTETEXT.g:461:3: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) )
            {
            // InternalCHAISEMINUTETEXT.g:461:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalCHAISEMINUTETEXT.g:462:4: (lv_id_0_0= RULE_ID )
            {
            // InternalCHAISEMINUTETEXT.g:462:4: (lv_id_0_0= RULE_ID )
            // InternalCHAISEMINUTETEXT.g:463:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_id_0_0, grammarAccess.getColumnDataAccess().getIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnDataAccess().getOfKeyword_1());
            		
            // InternalCHAISEMINUTETEXT.g:483:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalCHAISEMINUTETEXT.g:484:4: (lv_type_2_0= ruleDataType )
            {
            // InternalCHAISEMINUTETEXT.g:484:4: (lv_type_2_0= ruleDataType )
            // InternalCHAISEMINUTETEXT.g:485:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getColumnDataAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnDataRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.n7.CHAISEMINUTETEXT.DataType");
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


    // $ANTLR start "entryRuleComputedColumn"
    // InternalCHAISEMINUTETEXT.g:506:1: entryRuleComputedColumn returns [EObject current=null] : iv_ruleComputedColumn= ruleComputedColumn EOF ;
    public final EObject entryRuleComputedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedColumn = null;


        try {
            // InternalCHAISEMINUTETEXT.g:506:55: (iv_ruleComputedColumn= ruleComputedColumn EOF )
            // InternalCHAISEMINUTETEXT.g:507:2: iv_ruleComputedColumn= ruleComputedColumn EOF
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
    // InternalCHAISEMINUTETEXT.g:513:1: ruleComputedColumn returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= 'computed' otherlv_4= 'with' ( (lv_algorithm_5_0= ruleAlgorithm ) ) ) ;
    public final EObject ruleComputedColumn() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_algorithm_5_0 = null;



        	enterRule();

        try {
            // InternalCHAISEMINUTETEXT.g:519:2: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= 'computed' otherlv_4= 'with' ( (lv_algorithm_5_0= ruleAlgorithm ) ) ) )
            // InternalCHAISEMINUTETEXT.g:520:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= 'computed' otherlv_4= 'with' ( (lv_algorithm_5_0= ruleAlgorithm ) ) )
            {
            // InternalCHAISEMINUTETEXT.g:520:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= 'computed' otherlv_4= 'with' ( (lv_algorithm_5_0= ruleAlgorithm ) ) )
            // InternalCHAISEMINUTETEXT.g:521:3: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= 'computed' otherlv_4= 'with' ( (lv_algorithm_5_0= ruleAlgorithm ) )
            {
            // InternalCHAISEMINUTETEXT.g:521:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalCHAISEMINUTETEXT.g:522:4: (lv_id_0_0= RULE_ID )
            {
            // InternalCHAISEMINUTETEXT.g:522:4: (lv_id_0_0= RULE_ID )
            // InternalCHAISEMINUTETEXT.g:523:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_id_0_0, grammarAccess.getComputedColumnAccess().getIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComputedColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getComputedColumnAccess().getOfKeyword_1());
            		
            // InternalCHAISEMINUTETEXT.g:543:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalCHAISEMINUTETEXT.g:544:4: (lv_type_2_0= ruleDataType )
            {
            // InternalCHAISEMINUTETEXT.g:544:4: (lv_type_2_0= ruleDataType )
            // InternalCHAISEMINUTETEXT.g:545:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getComputedColumnAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_2_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputedColumnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.n7.CHAISEMINUTETEXT.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getComputedColumnAccess().getComputedKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getComputedColumnAccess().getWithKeyword_4());
            		
            // InternalCHAISEMINUTETEXT.g:570:3: ( (lv_algorithm_5_0= ruleAlgorithm ) )
            // InternalCHAISEMINUTETEXT.g:571:4: (lv_algorithm_5_0= ruleAlgorithm )
            {
            // InternalCHAISEMINUTETEXT.g:571:4: (lv_algorithm_5_0= ruleAlgorithm )
            // InternalCHAISEMINUTETEXT.g:572:5: lv_algorithm_5_0= ruleAlgorithm
            {

            					newCompositeNode(grammarAccess.getComputedColumnAccess().getAlgorithmAlgorithmParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_algorithm_5_0=ruleAlgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputedColumnRule());
            					}
            					set(
            						current,
            						"algorithm",
            						lv_algorithm_5_0,
            						"fr.n7.CHAISEMINUTETEXT.Algorithm");
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


    // $ANTLR start "entryRuleImportedColumn"
    // InternalCHAISEMINUTETEXT.g:593:1: entryRuleImportedColumn returns [EObject current=null] : iv_ruleImportedColumn= ruleImportedColumn EOF ;
    public final EObject entryRuleImportedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedColumn = null;


        try {
            // InternalCHAISEMINUTETEXT.g:593:55: (iv_ruleImportedColumn= ruleImportedColumn EOF )
            // InternalCHAISEMINUTETEXT.g:594:2: iv_ruleImportedColumn= ruleImportedColumn EOF
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
    // InternalCHAISEMINUTETEXT.g:600:1: ruleImportedColumn returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= 'imported' otherlv_4= 'from' ( (lv_path_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleImportedColumn() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_path_5_0=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalCHAISEMINUTETEXT.g:606:2: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= 'imported' otherlv_4= 'from' ( (lv_path_5_0= RULE_STRING ) ) ) )
            // InternalCHAISEMINUTETEXT.g:607:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= 'imported' otherlv_4= 'from' ( (lv_path_5_0= RULE_STRING ) ) )
            {
            // InternalCHAISEMINUTETEXT.g:607:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= 'imported' otherlv_4= 'from' ( (lv_path_5_0= RULE_STRING ) ) )
            // InternalCHAISEMINUTETEXT.g:608:3: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= 'imported' otherlv_4= 'from' ( (lv_path_5_0= RULE_STRING ) )
            {
            // InternalCHAISEMINUTETEXT.g:608:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalCHAISEMINUTETEXT.g:609:4: (lv_id_0_0= RULE_ID )
            {
            // InternalCHAISEMINUTETEXT.g:609:4: (lv_id_0_0= RULE_ID )
            // InternalCHAISEMINUTETEXT.g:610:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_id_0_0, grammarAccess.getImportedColumnAccess().getIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportedColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getImportedColumnAccess().getOfKeyword_1());
            		
            // InternalCHAISEMINUTETEXT.g:630:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalCHAISEMINUTETEXT.g:631:4: (lv_type_2_0= ruleDataType )
            {
            // InternalCHAISEMINUTETEXT.g:631:4: (lv_type_2_0= ruleDataType )
            // InternalCHAISEMINUTETEXT.g:632:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getImportedColumnAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_2_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportedColumnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.n7.CHAISEMINUTETEXT.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getImportedColumnAccess().getImportedKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getImportedColumnAccess().getFromKeyword_4());
            		
            // InternalCHAISEMINUTETEXT.g:657:3: ( (lv_path_5_0= RULE_STRING ) )
            // InternalCHAISEMINUTETEXT.g:658:4: (lv_path_5_0= RULE_STRING )
            {
            // InternalCHAISEMINUTETEXT.g:658:4: (lv_path_5_0= RULE_STRING )
            // InternalCHAISEMINUTETEXT.g:659:5: lv_path_5_0= RULE_STRING
            {
            lv_path_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_5_0, grammarAccess.getImportedColumnAccess().getPathSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportedColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_5_0,
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
    // $ANTLR end "ruleImportedColumn"


    // $ANTLR start "entryRuleAlgorithm"
    // InternalCHAISEMINUTETEXT.g:679:1: entryRuleAlgorithm returns [EObject current=null] : iv_ruleAlgorithm= ruleAlgorithm EOF ;
    public final EObject entryRuleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithm = null;


        try {
            // InternalCHAISEMINUTETEXT.g:679:50: (iv_ruleAlgorithm= ruleAlgorithm EOF )
            // InternalCHAISEMINUTETEXT.g:680:2: iv_ruleAlgorithm= ruleAlgorithm EOF
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
    // InternalCHAISEMINUTETEXT.g:686:1: ruleAlgorithm returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_functions_2_0= ruleFunction ) ) (otherlv_3= '>' ( (lv_functions_4_0= ruleFunction ) ) )? otherlv_5= ']' ) ;
    public final EObject ruleAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_functions_2_0 = null;

        EObject lv_functions_4_0 = null;



        	enterRule();

        try {
            // InternalCHAISEMINUTETEXT.g:692:2: ( ( () otherlv_1= '[' ( (lv_functions_2_0= ruleFunction ) ) (otherlv_3= '>' ( (lv_functions_4_0= ruleFunction ) ) )? otherlv_5= ']' ) )
            // InternalCHAISEMINUTETEXT.g:693:2: ( () otherlv_1= '[' ( (lv_functions_2_0= ruleFunction ) ) (otherlv_3= '>' ( (lv_functions_4_0= ruleFunction ) ) )? otherlv_5= ']' )
            {
            // InternalCHAISEMINUTETEXT.g:693:2: ( () otherlv_1= '[' ( (lv_functions_2_0= ruleFunction ) ) (otherlv_3= '>' ( (lv_functions_4_0= ruleFunction ) ) )? otherlv_5= ']' )
            // InternalCHAISEMINUTETEXT.g:694:3: () otherlv_1= '[' ( (lv_functions_2_0= ruleFunction ) ) (otherlv_3= '>' ( (lv_functions_4_0= ruleFunction ) ) )? otherlv_5= ']'
            {
            // InternalCHAISEMINUTETEXT.g:694:3: ()
            // InternalCHAISEMINUTETEXT.g:695:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlgorithmAccess().getAlgorithmAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgorithmAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalCHAISEMINUTETEXT.g:705:3: ( (lv_functions_2_0= ruleFunction ) )
            // InternalCHAISEMINUTETEXT.g:706:4: (lv_functions_2_0= ruleFunction )
            {
            // InternalCHAISEMINUTETEXT.g:706:4: (lv_functions_2_0= ruleFunction )
            // InternalCHAISEMINUTETEXT.g:707:5: lv_functions_2_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getAlgorithmAccess().getFunctionsFunctionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_functions_2_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmRule());
            					}
            					add(
            						current,
            						"functions",
            						lv_functions_2_0,
            						"fr.n7.CHAISEMINUTETEXT.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCHAISEMINUTETEXT.g:724:3: (otherlv_3= '>' ( (lv_functions_4_0= ruleFunction ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCHAISEMINUTETEXT.g:725:4: otherlv_3= '>' ( (lv_functions_4_0= ruleFunction ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getAlgorithmAccess().getGreaterThanSignKeyword_3_0());
                    			
                    // InternalCHAISEMINUTETEXT.g:729:4: ( (lv_functions_4_0= ruleFunction ) )
                    // InternalCHAISEMINUTETEXT.g:730:5: (lv_functions_4_0= ruleFunction )
                    {
                    // InternalCHAISEMINUTETEXT.g:730:5: (lv_functions_4_0= ruleFunction )
                    // InternalCHAISEMINUTETEXT.g:731:6: lv_functions_4_0= ruleFunction
                    {

                    						newCompositeNode(grammarAccess.getAlgorithmAccess().getFunctionsFunctionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_functions_4_0=ruleFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlgorithmRule());
                    						}
                    						add(
                    							current,
                    							"functions",
                    							lv_functions_4_0,
                    							"fr.n7.CHAISEMINUTETEXT.Function");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAlgorithmAccess().getRightSquareBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleFunction"
    // InternalCHAISEMINUTETEXT.g:757:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalCHAISEMINUTETEXT.g:757:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalCHAISEMINUTETEXT.g:758:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalCHAISEMINUTETEXT.g:764:1: ruleFunction returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_inputs_5_0 = null;



        	enterRule();

        try {
            // InternalCHAISEMINUTETEXT.g:770:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) )
            // InternalCHAISEMINUTETEXT.g:771:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            {
            // InternalCHAISEMINUTETEXT.g:771:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            // InternalCHAISEMINUTETEXT.g:772:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )* )? otherlv_6= ')'
            {
            // InternalCHAISEMINUTETEXT.g:772:3: ()
            // InternalCHAISEMINUTETEXT.g:773:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionAccess().getFunctionAction_0(),
            					current);
            			

            }

            // InternalCHAISEMINUTETEXT.g:779:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCHAISEMINUTETEXT.g:780:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCHAISEMINUTETEXT.g:780:4: (lv_name_1_0= RULE_ID )
            // InternalCHAISEMINUTETEXT.g:781:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCHAISEMINUTETEXT.g:801:3: ( ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCHAISEMINUTETEXT.g:802:4: ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )*
                    {
                    // InternalCHAISEMINUTETEXT.g:802:4: ( (lv_inputs_3_0= ruleArgument ) )
                    // InternalCHAISEMINUTETEXT.g:803:5: (lv_inputs_3_0= ruleArgument )
                    {
                    // InternalCHAISEMINUTETEXT.g:803:5: (lv_inputs_3_0= ruleArgument )
                    // InternalCHAISEMINUTETEXT.g:804:6: lv_inputs_3_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getInputsArgumentParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_inputs_3_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_3_0,
                    							"fr.n7.CHAISEMINUTETEXT.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCHAISEMINUTETEXT.g:821:4: (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==12) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalCHAISEMINUTETEXT.g:822:5: otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_21); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCHAISEMINUTETEXT.g:826:5: ( (lv_inputs_5_0= ruleArgument ) )
                    	    // InternalCHAISEMINUTETEXT.g:827:6: (lv_inputs_5_0= ruleArgument )
                    	    {
                    	    // InternalCHAISEMINUTETEXT.g:827:6: (lv_inputs_5_0= ruleArgument )
                    	    // InternalCHAISEMINUTETEXT.g:828:7: lv_inputs_5_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getInputsArgumentParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_inputs_5_0=ruleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_5_0,
                    	    								"fr.n7.CHAISEMINUTETEXT.Argument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
            		

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


    // $ANTLR start "entryRuleArgument"
    // InternalCHAISEMINUTETEXT.g:855:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalCHAISEMINUTETEXT.g:855:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalCHAISEMINUTETEXT.g:856:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalCHAISEMINUTETEXT.g:862:1: ruleArgument returns [EObject current=null] : this_ColumnArgument_0= ruleColumnArgument ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_ColumnArgument_0 = null;



        	enterRule();

        try {
            // InternalCHAISEMINUTETEXT.g:868:2: (this_ColumnArgument_0= ruleColumnArgument )
            // InternalCHAISEMINUTETEXT.g:869:2: this_ColumnArgument_0= ruleColumnArgument
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


    // $ANTLR start "entryRuleColumnArgument"
    // InternalCHAISEMINUTETEXT.g:880:1: entryRuleColumnArgument returns [EObject current=null] : iv_ruleColumnArgument= ruleColumnArgument EOF ;
    public final EObject entryRuleColumnArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnArgument = null;


        try {
            // InternalCHAISEMINUTETEXT.g:880:55: (iv_ruleColumnArgument= ruleColumnArgument EOF )
            // InternalCHAISEMINUTETEXT.g:881:2: iv_ruleColumnArgument= ruleColumnArgument EOF
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
    // InternalCHAISEMINUTETEXT.g:887:1: ruleColumnArgument returns [EObject current=null] : ( () ( (lv_columnpath_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleColumnArgument() throws RecognitionException {
        EObject current = null;

        Token lv_columnpath_1_0=null;


        	enterRule();

        try {
            // InternalCHAISEMINUTETEXT.g:893:2: ( ( () ( (lv_columnpath_1_0= RULE_STRING ) ) ) )
            // InternalCHAISEMINUTETEXT.g:894:2: ( () ( (lv_columnpath_1_0= RULE_STRING ) ) )
            {
            // InternalCHAISEMINUTETEXT.g:894:2: ( () ( (lv_columnpath_1_0= RULE_STRING ) ) )
            // InternalCHAISEMINUTETEXT.g:895:3: () ( (lv_columnpath_1_0= RULE_STRING ) )
            {
            // InternalCHAISEMINUTETEXT.g:895:3: ()
            // InternalCHAISEMINUTETEXT.g:896:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnArgumentAccess().getColumnArgumentAction_0(),
            					current);
            			

            }

            // InternalCHAISEMINUTETEXT.g:902:3: ( (lv_columnpath_1_0= RULE_STRING ) )
            // InternalCHAISEMINUTETEXT.g:903:4: (lv_columnpath_1_0= RULE_STRING )
            {
            // InternalCHAISEMINUTETEXT.g:903:4: (lv_columnpath_1_0= RULE_STRING )
            // InternalCHAISEMINUTETEXT.g:904:5: lv_columnpath_1_0= RULE_STRING
            {
            lv_columnpath_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_columnpath_1_0, grammarAccess.getColumnArgumentAccess().getColumnpathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"columnpath",
            						lv_columnpath_1_0,
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


    // $ANTLR start "ruleDataType"
    // InternalCHAISEMINUTETEXT.g:924:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCHAISEMINUTETEXT.g:930:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) ) )
            // InternalCHAISEMINUTETEXT.g:931:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) )
            {
            // InternalCHAISEMINUTETEXT.g:931:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCHAISEMINUTETEXT.g:932:3: (enumLiteral_0= 'string' )
                    {
                    // InternalCHAISEMINUTETEXT.g:932:3: (enumLiteral_0= 'string' )
                    // InternalCHAISEMINUTETEXT.g:933:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCHAISEMINUTETEXT.g:940:3: (enumLiteral_1= 'int' )
                    {
                    // InternalCHAISEMINUTETEXT.g:940:3: (enumLiteral_1= 'int' )
                    // InternalCHAISEMINUTETEXT.g:941:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080020L});

}