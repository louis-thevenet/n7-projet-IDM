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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'index'", "'('", "')'", "':'", "'data'", "'imported'", "'->'", "'computed'", "'>'", "'String'", "'Int'"
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
    // InternalFromText.g:72:1: ruleChaiseMinute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleChaiseMinute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_tables_2_0 = null;

        EObject lv_tables_4_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:78:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )* )? otherlv_5= '}' ) )
            // InternalFromText.g:79:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )* )? otherlv_5= '}' )
            {
            // InternalFromText.g:79:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )* )? otherlv_5= '}' )
            // InternalFromText.g:80:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )* )? otherlv_5= '}'
            {
            // InternalFromText.g:80:3: ( (lv_name_0_0= ruleEString ) )
            // InternalFromText.g:81:4: (lv_name_0_0= ruleEString )
            {
            // InternalFromText.g:81:4: (lv_name_0_0= ruleEString )
            // InternalFromText.g:82:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getChaiseMinuteAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChaiseMinuteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.n7.chaiseMinute.FromText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChaiseMinuteAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFromText.g:103:3: ( ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFromText.g:104:4: ( (lv_tables_2_0= ruleTable ) ) ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )*
                    {
                    // InternalFromText.g:104:4: ( (lv_tables_2_0= ruleTable ) )
                    // InternalFromText.g:105:5: (lv_tables_2_0= ruleTable )
                    {
                    // InternalFromText.g:105:5: (lv_tables_2_0= ruleTable )
                    // InternalFromText.g:106:6: lv_tables_2_0= ruleTable
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
                    							"fr.n7.chaiseMinute.FromText.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFromText.g:123:4: ( (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalFromText.g:124:5: (otherlv_3= ',' )? ( (lv_tables_4_0= ruleTable ) )
                    	    {
                    	    // InternalFromText.g:124:5: (otherlv_3= ',' )?
                    	    int alt1=2;
                    	    int LA1_0 = input.LA(1);

                    	    if ( (LA1_0==12) ) {
                    	        alt1=1;
                    	    }
                    	    switch (alt1) {
                    	        case 1 :
                    	            // InternalFromText.g:125:6: otherlv_3= ','
                    	            {
                    	            otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    	            						newLeafNode(otherlv_3, grammarAccess.getChaiseMinuteAccess().getCommaKeyword_2_1_0());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalFromText.g:130:5: ( (lv_tables_4_0= ruleTable ) )
                    	    // InternalFromText.g:131:6: (lv_tables_4_0= ruleTable )
                    	    {
                    	    // InternalFromText.g:131:6: (lv_tables_4_0= ruleTable )
                    	    // InternalFromText.g:132:7: lv_tables_4_0= ruleTable
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

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getChaiseMinuteAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalFromText.g:159:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalFromText.g:159:46: (iv_ruleTable= ruleTable EOF )
            // InternalFromText.g:160:2: iv_ruleTable= ruleTable EOF
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
    // InternalFromText.g:166:1: ruleTable returns [EObject current=null] : (otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}' ) ;
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
            // InternalFromText.g:172:2: ( (otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}' ) )
            // InternalFromText.g:173:2: (otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}' )
            {
            // InternalFromText.g:173:2: (otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}' )
            // InternalFromText.g:174:3: otherlv_0= '{' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ',' ( (lv_indexColumn_3_0= ruleIndexColumn ) ) otherlv_4= ',' ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalFromText.g:178:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFromText.g:179:4: (lv_name_1_0= ruleEString )
            {
            // InternalFromText.g:179:4: (lv_name_1_0= ruleEString )
            // InternalFromText.g:180:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getCommaKeyword_2());
            		
            // InternalFromText.g:201:3: ( (lv_indexColumn_3_0= ruleIndexColumn ) )
            // InternalFromText.g:202:4: (lv_indexColumn_3_0= ruleIndexColumn )
            {
            // InternalFromText.g:202:4: (lv_indexColumn_3_0= ruleIndexColumn )
            // InternalFromText.g:203:5: lv_indexColumn_3_0= ruleIndexColumn
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

            otherlv_4=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_4());
            		
            // InternalFromText.g:224:3: ( ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=18 && LA5_0<=19)||LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFromText.g:225:4: ( (lv_columns_5_0= ruleColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )*
                    {
                    // InternalFromText.g:225:4: ( (lv_columns_5_0= ruleColumn ) )
                    // InternalFromText.g:226:5: (lv_columns_5_0= ruleColumn )
                    {
                    // InternalFromText.g:226:5: (lv_columns_5_0= ruleColumn )
                    // InternalFromText.g:227:6: lv_columns_5_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalFromText.g:244:4: (otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==12) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalFromText.g:245:5: otherlv_6= ',' ( (lv_columns_7_0= ruleColumn ) )
                    	    {
                    	    otherlv_6=(Token)match(input,12,FOLLOW_11); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTableAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalFromText.g:249:5: ( (lv_columns_7_0= ruleColumn ) )
                    	    // InternalFromText.g:250:6: (lv_columns_7_0= ruleColumn )
                    	    {
                    	    // InternalFromText.g:250:6: (lv_columns_7_0= ruleColumn )
                    	    // InternalFromText.g:251:7: lv_columns_7_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
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
    // InternalFromText.g:278:1: entryRuleIndexColumn returns [EObject current=null] : iv_ruleIndexColumn= ruleIndexColumn EOF ;
    public final EObject entryRuleIndexColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexColumn = null;


        try {
            // InternalFromText.g:278:52: (iv_ruleIndexColumn= ruleIndexColumn EOF )
            // InternalFromText.g:279:2: iv_ruleIndexColumn= ruleIndexColumn EOF
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
    // InternalFromText.g:285:1: ruleIndexColumn returns [EObject current=null] : ( () otherlv_1= 'index' otherlv_2= '(' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_id_6_0= ruleEString ) ) ) ;
    public final EObject ruleIndexColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_id_6_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:291:2: ( ( () otherlv_1= 'index' otherlv_2= '(' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_id_6_0= ruleEString ) ) ) )
            // InternalFromText.g:292:2: ( () otherlv_1= 'index' otherlv_2= '(' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_id_6_0= ruleEString ) ) )
            {
            // InternalFromText.g:292:2: ( () otherlv_1= 'index' otherlv_2= '(' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_id_6_0= ruleEString ) ) )
            // InternalFromText.g:293:3: () otherlv_1= 'index' otherlv_2= '(' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_id_6_0= ruleEString ) )
            {
            // InternalFromText.g:293:3: ()
            // InternalFromText.g:294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexColumnAccess().getIndexColumnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexColumnAccess().getIndexKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexColumnAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFromText.g:308:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalFromText.g:309:4: (lv_type_3_0= ruleDataType )
            {
            // InternalFromText.g:309:4: (lv_type_3_0= ruleDataType )
            // InternalFromText.g:310:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getIndexColumnAccess().getTypeDataTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexColumnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"fr.n7.chaiseMinute.FromText.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexColumnAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getIndexColumnAccess().getColonKeyword_5());
            		
            // InternalFromText.g:335:3: ( (lv_id_6_0= ruleEString ) )
            // InternalFromText.g:336:4: (lv_id_6_0= ruleEString )
            {
            // InternalFromText.g:336:4: (lv_id_6_0= ruleEString )
            // InternalFromText.g:337:5: lv_id_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIndexColumnAccess().getIdEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_id_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexColumnRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_6_0,
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
    // $ANTLR end "ruleIndexColumn"


    // $ANTLR start "entryRuleColumn"
    // InternalFromText.g:358:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalFromText.g:358:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalFromText.g:359:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalFromText.g:365:1: ruleColumn returns [EObject current=null] : (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        EObject this_ColumnData_0 = null;

        EObject this_ComputedColumn_1 = null;

        EObject this_ImportedColumn_2 = null;



        	enterRule();

        try {
            // InternalFromText.g:371:2: ( (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn ) )
            // InternalFromText.g:372:2: (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn )
            {
            // InternalFromText.g:372:2: (this_ColumnData_0= ruleColumnData | this_ComputedColumn_1= ruleComputedColumn | this_ImportedColumn_2= ruleImportedColumn )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 19:
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
                    // InternalFromText.g:373:3: this_ColumnData_0= ruleColumnData
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
                    // InternalFromText.g:382:3: this_ComputedColumn_1= ruleComputedColumn
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
                    // InternalFromText.g:391:3: this_ImportedColumn_2= ruleImportedColumn
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
    // InternalFromText.g:403:1: entryRuleColumnData returns [EObject current=null] : iv_ruleColumnData= ruleColumnData EOF ;
    public final EObject entryRuleColumnData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnData = null;


        try {
            // InternalFromText.g:403:51: (iv_ruleColumnData= ruleColumnData EOF )
            // InternalFromText.g:404:2: iv_ruleColumnData= ruleColumnData EOF
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
    // InternalFromText.g:410:1: ruleColumnData returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) ) ) ;
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
            // InternalFromText.g:416:2: ( (otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) ) ) )
            // InternalFromText.g:417:2: (otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) ) )
            {
            // InternalFromText.g:417:2: (otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) ) )
            // InternalFromText.g:418:3: otherlv_0= 'data' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_id_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnDataAccess().getDataKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnDataAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFromText.g:426:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalFromText.g:427:4: (lv_type_2_0= ruleDataType )
            {
            // InternalFromText.g:427:4: (lv_type_2_0= ruleDataType )
            // InternalFromText.g:428:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getColumnDataAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnDataAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnDataAccess().getColonKeyword_4());
            		
            // InternalFromText.g:453:3: ( (lv_id_5_0= ruleEString ) )
            // InternalFromText.g:454:4: (lv_id_5_0= ruleEString )
            {
            // InternalFromText.g:454:4: (lv_id_5_0= ruleEString )
            // InternalFromText.g:455:5: lv_id_5_0= ruleEString
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
    // InternalFromText.g:476:1: entryRuleImportedColumn returns [EObject current=null] : iv_ruleImportedColumn= ruleImportedColumn EOF ;
    public final EObject entryRuleImportedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedColumn = null;


        try {
            // InternalFromText.g:476:55: (iv_ruleImportedColumn= ruleImportedColumn EOF )
            // InternalFromText.g:477:2: iv_ruleImportedColumn= ruleImportedColumn EOF
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
    // InternalFromText.g:483:1: ruleImportedColumn returns [EObject current=null] : (otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) ) ;
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
            // InternalFromText.g:489:2: ( (otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) ) )
            // InternalFromText.g:490:2: (otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) )
            {
            // InternalFromText.g:490:2: (otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) )
            // InternalFromText.g:491:3: otherlv_0= 'imported' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_path_5_0= ruleEString ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getImportedColumnAccess().getImportedKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getImportedColumnAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFromText.g:499:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalFromText.g:500:4: (lv_type_2_0= ruleDataType )
            {
            // InternalFromText.g:500:4: (lv_type_2_0= ruleDataType )
            // InternalFromText.g:501:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getImportedColumnAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getImportedColumnAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getImportedColumnAccess().getColonKeyword_4());
            		
            // InternalFromText.g:526:3: ( (lv_path_5_0= ruleEString ) )
            // InternalFromText.g:527:4: (lv_path_5_0= ruleEString )
            {
            // InternalFromText.g:527:4: (lv_path_5_0= ruleEString )
            // InternalFromText.g:528:5: lv_path_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getImportedColumnAccess().getPathEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_6=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getImportedColumnAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            // InternalFromText.g:549:3: ( (lv_id_7_0= ruleEString ) )
            // InternalFromText.g:550:4: (lv_id_7_0= ruleEString )
            {
            // InternalFromText.g:550:4: (lv_id_7_0= ruleEString )
            // InternalFromText.g:551:5: lv_id_7_0= ruleEString
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
    // InternalFromText.g:572:1: entryRuleComputedColumn returns [EObject current=null] : iv_ruleComputedColumn= ruleComputedColumn EOF ;
    public final EObject entryRuleComputedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedColumn = null;


        try {
            // InternalFromText.g:572:55: (iv_ruleComputedColumn= ruleComputedColumn EOF )
            // InternalFromText.g:573:2: iv_ruleComputedColumn= ruleComputedColumn EOF
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
    // InternalFromText.g:579:1: ruleComputedColumn returns [EObject current=null] : (otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_algorithm_5_0= ruleAlgorithm ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) ) ;
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
            // InternalFromText.g:585:2: ( (otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_algorithm_5_0= ruleAlgorithm ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) ) )
            // InternalFromText.g:586:2: (otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_algorithm_5_0= ruleAlgorithm ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) )
            {
            // InternalFromText.g:586:2: (otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_algorithm_5_0= ruleAlgorithm ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) ) )
            // InternalFromText.g:587:3: otherlv_0= 'computed' otherlv_1= '(' ( (lv_type_2_0= ruleDataType ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_algorithm_5_0= ruleAlgorithm ) ) otherlv_6= '->' ( (lv_id_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getComputedColumnAccess().getComputedKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getComputedColumnAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFromText.g:595:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalFromText.g:596:4: (lv_type_2_0= ruleDataType )
            {
            // InternalFromText.g:596:4: (lv_type_2_0= ruleDataType )
            // InternalFromText.g:597:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getComputedColumnAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getComputedColumnAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getComputedColumnAccess().getColonKeyword_4());
            		
            // InternalFromText.g:622:3: ( (lv_algorithm_5_0= ruleAlgorithm ) )
            // InternalFromText.g:623:4: (lv_algorithm_5_0= ruleAlgorithm )
            {
            // InternalFromText.g:623:4: (lv_algorithm_5_0= ruleAlgorithm )
            // InternalFromText.g:624:5: lv_algorithm_5_0= ruleAlgorithm
            {

            					newCompositeNode(grammarAccess.getComputedColumnAccess().getAlgorithmAlgorithmParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_6=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getComputedColumnAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            // InternalFromText.g:645:3: ( (lv_id_7_0= ruleEString ) )
            // InternalFromText.g:646:4: (lv_id_7_0= ruleEString )
            {
            // InternalFromText.g:646:4: (lv_id_7_0= ruleEString )
            // InternalFromText.g:647:5: lv_id_7_0= ruleEString
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
    // InternalFromText.g:668:1: entryRuleColumnArgument returns [EObject current=null] : iv_ruleColumnArgument= ruleColumnArgument EOF ;
    public final EObject entryRuleColumnArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnArgument = null;


        try {
            // InternalFromText.g:668:55: (iv_ruleColumnArgument= ruleColumnArgument EOF )
            // InternalFromText.g:669:2: iv_ruleColumnArgument= ruleColumnArgument EOF
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
    // InternalFromText.g:675:1: ruleColumnArgument returns [EObject current=null] : ( () ( (lv_columnPath_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleColumnArgument() throws RecognitionException {
        EObject current = null;

        Token lv_columnPath_1_0=null;


        	enterRule();

        try {
            // InternalFromText.g:681:2: ( ( () ( (lv_columnPath_1_0= RULE_STRING ) ) ) )
            // InternalFromText.g:682:2: ( () ( (lv_columnPath_1_0= RULE_STRING ) ) )
            {
            // InternalFromText.g:682:2: ( () ( (lv_columnPath_1_0= RULE_STRING ) ) )
            // InternalFromText.g:683:3: () ( (lv_columnPath_1_0= RULE_STRING ) )
            {
            // InternalFromText.g:683:3: ()
            // InternalFromText.g:684:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnArgumentAccess().getColumnArgumentAction_0(),
            					current);
            			

            }

            // InternalFromText.g:690:3: ( (lv_columnPath_1_0= RULE_STRING ) )
            // InternalFromText.g:691:4: (lv_columnPath_1_0= RULE_STRING )
            {
            // InternalFromText.g:691:4: (lv_columnPath_1_0= RULE_STRING )
            // InternalFromText.g:692:5: lv_columnPath_1_0= RULE_STRING
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
    // InternalFromText.g:712:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalFromText.g:712:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalFromText.g:713:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalFromText.g:719:1: ruleArgument returns [EObject current=null] : this_ColumnArgument_0= ruleColumnArgument ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_ColumnArgument_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:725:2: (this_ColumnArgument_0= ruleColumnArgument )
            // InternalFromText.g:726:2: this_ColumnArgument_0= ruleColumnArgument
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


    // $ANTLR start "entryRuleFunction"
    // InternalFromText.g:737:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalFromText.g:737:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalFromText.g:738:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalFromText.g:744:1: ruleFunction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_inputs_3_0 = null;

        EObject lv_inputs_5_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:750:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) )
            // InternalFromText.g:751:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            {
            // InternalFromText.g:751:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            // InternalFromText.g:752:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )* )? otherlv_6= ')'
            {
            // InternalFromText.g:752:3: ()
            // InternalFromText.g:753:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionAccess().getFunctionAction_0(),
            					current);
            			

            }

            // InternalFromText.g:759:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFromText.g:760:4: (lv_name_1_0= ruleEString )
            {
            // InternalFromText.g:760:4: (lv_name_1_0= ruleEString )
            // InternalFromText.g:761:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.n7.chaiseMinute.FromText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFromText.g:782:3: ( ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFromText.g:783:4: ( (lv_inputs_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )*
                    {
                    // InternalFromText.g:783:4: ( (lv_inputs_3_0= ruleArgument ) )
                    // InternalFromText.g:784:5: (lv_inputs_3_0= ruleArgument )
                    {
                    // InternalFromText.g:784:5: (lv_inputs_3_0= ruleArgument )
                    // InternalFromText.g:785:6: lv_inputs_3_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getInputsArgumentParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_inputs_3_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_3_0,
                    							"fr.n7.chaiseMinute.FromText.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFromText.g:802:4: (otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==12) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFromText.g:803:5: otherlv_4= ',' ( (lv_inputs_5_0= ruleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_19); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalFromText.g:807:5: ( (lv_inputs_5_0= ruleArgument ) )
                    	    // InternalFromText.g:808:6: (lv_inputs_5_0= ruleArgument )
                    	    {
                    	    // InternalFromText.g:808:6: (lv_inputs_5_0= ruleArgument )
                    	    // InternalFromText.g:809:7: lv_inputs_5_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getInputsArgumentParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_inputs_5_0=ruleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_5_0,
                    	    								"fr.n7.chaiseMinute.FromText.Argument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAlgorithm"
    // InternalFromText.g:836:1: entryRuleAlgorithm returns [EObject current=null] : iv_ruleAlgorithm= ruleAlgorithm EOF ;
    public final EObject entryRuleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithm = null;


        try {
            // InternalFromText.g:836:50: (iv_ruleAlgorithm= ruleAlgorithm EOF )
            // InternalFromText.g:837:2: iv_ruleAlgorithm= ruleAlgorithm EOF
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
    // InternalFromText.g:843:1: ruleAlgorithm returns [EObject current=null] : ( () ( (lv_functions_1_0= ruleFunction ) ) (otherlv_2= '>' ( (lv_functions_3_0= ruleFunction ) ) )? ) ;
    public final EObject ruleAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_functions_1_0 = null;

        EObject lv_functions_3_0 = null;



        	enterRule();

        try {
            // InternalFromText.g:849:2: ( ( () ( (lv_functions_1_0= ruleFunction ) ) (otherlv_2= '>' ( (lv_functions_3_0= ruleFunction ) ) )? ) )
            // InternalFromText.g:850:2: ( () ( (lv_functions_1_0= ruleFunction ) ) (otherlv_2= '>' ( (lv_functions_3_0= ruleFunction ) ) )? )
            {
            // InternalFromText.g:850:2: ( () ( (lv_functions_1_0= ruleFunction ) ) (otherlv_2= '>' ( (lv_functions_3_0= ruleFunction ) ) )? )
            // InternalFromText.g:851:3: () ( (lv_functions_1_0= ruleFunction ) ) (otherlv_2= '>' ( (lv_functions_3_0= ruleFunction ) ) )?
            {
            // InternalFromText.g:851:3: ()
            // InternalFromText.g:852:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlgorithmAccess().getAlgorithmAction_0(),
            					current);
            			

            }

            // InternalFromText.g:858:3: ( (lv_functions_1_0= ruleFunction ) )
            // InternalFromText.g:859:4: (lv_functions_1_0= ruleFunction )
            {
            // InternalFromText.g:859:4: (lv_functions_1_0= ruleFunction )
            // InternalFromText.g:860:5: lv_functions_1_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getAlgorithmAccess().getFunctionsFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_functions_1_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmRule());
            					}
            					add(
            						current,
            						"functions",
            						lv_functions_1_0,
            						"fr.n7.chaiseMinute.FromText.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFromText.g:877:3: (otherlv_2= '>' ( (lv_functions_3_0= ruleFunction ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFromText.g:878:4: otherlv_2= '>' ( (lv_functions_3_0= ruleFunction ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getAlgorithmAccess().getGreaterThanSignKeyword_2_0());
                    			
                    // InternalFromText.g:882:4: ( (lv_functions_3_0= ruleFunction ) )
                    // InternalFromText.g:883:5: (lv_functions_3_0= ruleFunction )
                    {
                    // InternalFromText.g:883:5: (lv_functions_3_0= ruleFunction )
                    // InternalFromText.g:884:6: lv_functions_3_0= ruleFunction
                    {

                    						newCompositeNode(grammarAccess.getAlgorithmAccess().getFunctionsFunctionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_functions_3_0=ruleFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlgorithmRule());
                    						}
                    						add(
                    							current,
                    							"functions",
                    							lv_functions_3_0,
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
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "entryRuleEString"
    // InternalFromText.g:906:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFromText.g:906:47: (iv_ruleEString= ruleEString EOF )
            // InternalFromText.g:907:2: iv_ruleEString= ruleEString EOF
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
    // InternalFromText.g:913:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFromText.g:919:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFromText.g:920:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFromText.g:920:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalFromText.g:921:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFromText.g:929:3: this_ID_1= RULE_ID
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
    // InternalFromText.g:940:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFromText.g:946:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) ) )
            // InternalFromText.g:947:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) )
            {
            // InternalFromText.g:947:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFromText.g:948:3: (enumLiteral_0= 'String' )
                    {
                    // InternalFromText.g:948:3: (enumLiteral_0= 'String' )
                    // InternalFromText.g:949:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFromText.g:956:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalFromText.g:956:3: (enumLiteral_1= 'Int' )
                    // InternalFromText.g:957:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000002C2000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000002C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400002L});

}