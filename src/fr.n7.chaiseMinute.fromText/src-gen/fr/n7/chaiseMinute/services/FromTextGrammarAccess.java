/*
 * generated by Xtext 2.32.0
 */
package fr.n7.chaiseMinute.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class FromTextGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ChaiseMinuteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.chaiseMinute.FromText.ChaiseMinute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cTablesAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cTablesTableParserRuleCall_1_0_0 = (RuleCall)cTablesAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cTablesAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cTablesTableParserRuleCall_1_1_1_0 = (RuleCall)cTablesAssignment_1_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ChaiseMinute returns ChaiseMinute:
		//    '{'
		//        (tables+=Table ( ','? tables+=Table)* )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{'
		//    (tables+=Table ( ','? tables+=Table)* )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//(tables+=Table ( ','? tables+=Table)* )?
		public Group getGroup_1() { return cGroup_1; }
		
		//tables+=Table
		public Assignment getTablesAssignment_1_0() { return cTablesAssignment_1_0; }
		
		//Table
		public RuleCall getTablesTableParserRuleCall_1_0_0() { return cTablesTableParserRuleCall_1_0_0; }
		
		//( ','? tables+=Table)*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//','?
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//tables+=Table
		public Assignment getTablesAssignment_1_1_1() { return cTablesAssignment_1_1_1; }
		
		//Table
		public RuleCall getTablesTableParserRuleCall_1_1_1_0() { return cTablesTableParserRuleCall_1_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class TableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.chaiseMinute.FromText.Table");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cIndexColumnAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIndexColumnIndexColumnParserRuleCall_3_0 = (RuleCall)cIndexColumnAssignment_3.eContents().get(0);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cColumnsAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cColumnsColumnParserRuleCall_5_0_0 = (RuleCall)cColumnsAssignment_5_0.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cGroup_5.eContents().get(1);
		private final Keyword cCommaKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cColumnsAssignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final RuleCall cColumnsColumnParserRuleCall_5_1_1_0 = (RuleCall)cColumnsAssignment_5_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Table returns Table:
		//    '{'
		//    name=EString ','
		//    indexColumn=IndexColumn ','
		//    (columns+=Column ( "," columns+=Column)* )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{'
		//name=EString ','
		//indexColumn=IndexColumn ','
		//(columns+=Column ( "," columns+=Column)* )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//indexColumn=IndexColumn
		public Assignment getIndexColumnAssignment_3() { return cIndexColumnAssignment_3; }
		
		//IndexColumn
		public RuleCall getIndexColumnIndexColumnParserRuleCall_3_0() { return cIndexColumnIndexColumnParserRuleCall_3_0; }
		
		//','
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
		
		//(columns+=Column ( "," columns+=Column)* )?
		public Group getGroup_5() { return cGroup_5; }
		
		//columns+=Column
		public Assignment getColumnsAssignment_5_0() { return cColumnsAssignment_5_0; }
		
		//Column
		public RuleCall getColumnsColumnParserRuleCall_5_0_0() { return cColumnsColumnParserRuleCall_5_0_0; }
		
		//( "," columns+=Column)*
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//","
		public Keyword getCommaKeyword_5_1_0() { return cCommaKeyword_5_1_0; }
		
		//columns+=Column
		public Assignment getColumnsAssignment_5_1_1() { return cColumnsAssignment_5_1_1; }
		
		//Column
		public RuleCall getColumnsColumnParserRuleCall_5_1_1_0() { return cColumnsColumnParserRuleCall_5_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class IndexColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.chaiseMinute.FromText.IndexColumn");
		private final Action cIndexColumnAction = (Action)rule.eContents().get(1);
		
		//IndexColumn returns IndexColumn:
		//    {IndexColumn}
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{IndexColumn}
		public Action getIndexColumnAction() { return cIndexColumnAction; }
	}
	public class ColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.chaiseMinute.FromText.Column");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cColumnDataParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cComputedColumnParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cImportedColumnParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Column returns Column:
		//    ColumnData | ComputedColumn | ImportedColumn;
		@Override public ParserRule getRule() { return rule; }
		
		//ColumnData | ComputedColumn | ImportedColumn
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ColumnData
		public RuleCall getColumnDataParserRuleCall_0() { return cColumnDataParserRuleCall_0; }
		
		//ComputedColumn
		public RuleCall getComputedColumnParserRuleCall_1() { return cComputedColumnParserRuleCall_1; }
		
		//ImportedColumn
		public RuleCall getImportedColumnParserRuleCall_2() { return cImportedColumnParserRuleCall_2; }
	}
	public class ColumnDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.chaiseMinute.FromText.ColumnData");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDataKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeDataTypeEnumRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cIdAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cIdEStringParserRuleCall_5_0 = (RuleCall)cIdAssignment_5.eContents().get(0);
		
		//ColumnData returns ColumnData:
		//    'data' '(' type=DataType ')' ':' id=EString
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'data' '(' type=DataType ')' ':' id=EString
		public Group getGroup() { return cGroup; }
		
		//'data'
		public Keyword getDataKeyword_0() { return cDataKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//type=DataType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//DataType
		public RuleCall getTypeDataTypeEnumRuleCall_2_0() { return cTypeDataTypeEnumRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//id=EString
		public Assignment getIdAssignment_5() { return cIdAssignment_5; }
		
		//EString
		public RuleCall getIdEStringParserRuleCall_5_0() { return cIdEStringParserRuleCall_5_0; }
	}
	public class ImportedColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.chaiseMinute.FromText.ImportedColumn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportedKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeDataTypeEnumRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cPathAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPathEStringParserRuleCall_5_0 = (RuleCall)cPathAssignment_5.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cIdAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cIdEStringParserRuleCall_7_0 = (RuleCall)cIdAssignment_7.eContents().get(0);
		
		//ImportedColumn returns ImportedColumn:
		//    'imported' '(' type=DataType ')' ':'
		//    path=EString
		//    '->'
		//    id=EString
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'imported' '(' type=DataType ')' ':'
		//path=EString
		//'->'
		//id=EString
		public Group getGroup() { return cGroup; }
		
		//'imported'
		public Keyword getImportedKeyword_0() { return cImportedKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//type=DataType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//DataType
		public RuleCall getTypeDataTypeEnumRuleCall_2_0() { return cTypeDataTypeEnumRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//path=EString
		public Assignment getPathAssignment_5() { return cPathAssignment_5; }
		
		//EString
		public RuleCall getPathEStringParserRuleCall_5_0() { return cPathEStringParserRuleCall_5_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_6() { return cHyphenMinusGreaterThanSignKeyword_6; }
		
		//id=EString
		public Assignment getIdAssignment_7() { return cIdAssignment_7; }
		
		//EString
		public RuleCall getIdEStringParserRuleCall_7_0() { return cIdEStringParserRuleCall_7_0; }
	}
	public class ComputedColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.chaiseMinute.FromText.ComputedColumn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComputedKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeDataTypeEnumRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAlgorithmAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAlgorithmAlgorithmParserRuleCall_5_0 = (RuleCall)cAlgorithmAssignment_5.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cIdAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cIdEStringParserRuleCall_7_0 = (RuleCall)cIdAssignment_7.eContents().get(0);
		
		//ComputedColumn returns ComputedColumn:
		//    'computed'
		//    '('
		//    type=DataType
		//    ')'
		//    ':'
		//    algorithm=Algorithm
		//    '->'
		//    id=EString
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'computed'
		//'('
		//type=DataType
		//')'
		//':'
		//algorithm=Algorithm
		//'->'
		//id=EString
		public Group getGroup() { return cGroup; }
		
		//'computed'
		public Keyword getComputedKeyword_0() { return cComputedKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//type=DataType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//DataType
		public RuleCall getTypeDataTypeEnumRuleCall_2_0() { return cTypeDataTypeEnumRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//algorithm=Algorithm
		public Assignment getAlgorithmAssignment_5() { return cAlgorithmAssignment_5; }
		
		//Algorithm
		public RuleCall getAlgorithmAlgorithmParserRuleCall_5_0() { return cAlgorithmAlgorithmParserRuleCall_5_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_6() { return cHyphenMinusGreaterThanSignKeyword_6; }
		
		//id=EString
		public Assignment getIdAssignment_7() { return cIdAssignment_7; }
		
		//EString
		public RuleCall getIdEStringParserRuleCall_7_0() { return cIdEStringParserRuleCall_7_0; }
	}
	public class ColumnArgumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.chaiseMinute.FromText.ColumnArgument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cColumnArgumentAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cColumnPathAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cColumnPathSTRINGTerminalRuleCall_1_0 = (RuleCall)cColumnPathAssignment_1.eContents().get(0);
		
		//ColumnArgument returns function::ColumnArgument:
		//    {function::ColumnArgument}
		//    columnPath=STRING
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{function::ColumnArgument}
		//columnPath=STRING
		public Group getGroup() { return cGroup; }
		
		//{function::ColumnArgument}
		public Action getColumnArgumentAction_0() { return cColumnArgumentAction_0; }
		
		//columnPath=STRING
		public Assignment getColumnPathAssignment_1() { return cColumnPathAssignment_1; }
		
		//STRING
		public RuleCall getColumnPathSTRINGTerminalRuleCall_1_0() { return cColumnPathSTRINGTerminalRuleCall_1_0; }
	}
	public class ArgumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.chaiseMinute.FromText.Argument");
		private final RuleCall cColumnArgumentParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Argument returns function::Argument:
		//    ColumnArgument
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//ColumnArgument
		public RuleCall getColumnArgumentParserRuleCall() { return cColumnArgumentParserRuleCall; }
	}
	public class AlgorithmElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.chaiseMinute.FromText.Algorithm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAlgorithmAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cFunctionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFunctionsEStringParserRuleCall_1_0 = (RuleCall)cFunctionsAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cInputsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cInputsArgumentParserRuleCall_3_0_0 = (RuleCall)cInputsAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cInputsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cInputsArgumentParserRuleCall_3_1_1_0 = (RuleCall)cInputsAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cGreaterThanSignKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cFunctionsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cFunctionsEStringParserRuleCall_5_1_0 = (RuleCall)cFunctionsAssignment_5_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Assignment cInputsAssignment_5_3_0 = (Assignment)cGroup_5_3.eContents().get(0);
		private final RuleCall cInputsArgumentParserRuleCall_5_3_0_0 = (RuleCall)cInputsAssignment_5_3_0.eContents().get(0);
		private final Group cGroup_5_3_1 = (Group)cGroup_5_3.eContents().get(1);
		private final Keyword cCommaKeyword_5_3_1_0 = (Keyword)cGroup_5_3_1.eContents().get(0);
		private final Assignment cInputsAssignment_5_3_1_1 = (Assignment)cGroup_5_3_1.eContents().get(1);
		private final RuleCall cInputsArgumentParserRuleCall_5_3_1_1_0 = (RuleCall)cInputsAssignment_5_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		
		//Algorithm returns algorithm::Algorithm:
		//    {algorithm::Algorithm}
		//    functions+=EString
		//    '('
		//        (inputs+=Argument ( "," inputs+=Argument)*)?
		//    ')'
		//    (
		//        '>'
		//        functions+=EString
		//        '('
		//        (inputs+=Argument ( "," inputs+=Argument)*)?
		//        ')'
		//    )?
		//        ;
		@Override public ParserRule getRule() { return rule; }
		
		//{algorithm::Algorithm}
		//functions+=EString
		//'('
		//    (inputs+=Argument ( "," inputs+=Argument)*)?
		//')'
		//(
		//    '>'
		//    functions+=EString
		//    '('
		//    (inputs+=Argument ( "," inputs+=Argument)*)?
		//    ')'
		//)?
		public Group getGroup() { return cGroup; }
		
		//{algorithm::Algorithm}
		public Action getAlgorithmAction_0() { return cAlgorithmAction_0; }
		
		//functions+=EString
		public Assignment getFunctionsAssignment_1() { return cFunctionsAssignment_1; }
		
		//EString
		public RuleCall getFunctionsEStringParserRuleCall_1_0() { return cFunctionsEStringParserRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//(inputs+=Argument ( "," inputs+=Argument)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//inputs+=Argument
		public Assignment getInputsAssignment_3_0() { return cInputsAssignment_3_0; }
		
		//Argument
		public RuleCall getInputsArgumentParserRuleCall_3_0_0() { return cInputsArgumentParserRuleCall_3_0_0; }
		
		//( "," inputs+=Argument)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//inputs+=Argument
		public Assignment getInputsAssignment_3_1_1() { return cInputsAssignment_3_1_1; }
		
		//Argument
		public RuleCall getInputsArgumentParserRuleCall_3_1_1_0() { return cInputsArgumentParserRuleCall_3_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//(
		//    '>'
		//    functions+=EString
		//    '('
		//    (inputs+=Argument ( "," inputs+=Argument)*)?
		//    ')'
		//)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5_0() { return cGreaterThanSignKeyword_5_0; }
		
		//functions+=EString
		public Assignment getFunctionsAssignment_5_1() { return cFunctionsAssignment_5_1; }
		
		//EString
		public RuleCall getFunctionsEStringParserRuleCall_5_1_0() { return cFunctionsEStringParserRuleCall_5_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5_2() { return cLeftParenthesisKeyword_5_2; }
		
		//(inputs+=Argument ( "," inputs+=Argument)*)?
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//inputs+=Argument
		public Assignment getInputsAssignment_5_3_0() { return cInputsAssignment_5_3_0; }
		
		//Argument
		public RuleCall getInputsArgumentParserRuleCall_5_3_0_0() { return cInputsArgumentParserRuleCall_5_3_0_0; }
		
		//( "," inputs+=Argument)*
		public Group getGroup_5_3_1() { return cGroup_5_3_1; }
		
		//","
		public Keyword getCommaKeyword_5_3_1_0() { return cCommaKeyword_5_3_1_0; }
		
		//inputs+=Argument
		public Assignment getInputsAssignment_5_3_1_1() { return cInputsAssignment_5_3_1_1; }
		
		//Argument
		public RuleCall getInputsArgumentParserRuleCall_5_3_1_1_0() { return cInputsArgumentParserRuleCall_5_3_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5_4() { return cRightParenthesisKeyword_5_4; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.chaiseMinute.FromText.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt returns ecore::EInt:
		//    '-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.chaiseMinute.FromText.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	public class DataTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.chaiseMinute.FromText.DataType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStringStringKeyword_0_0 = (Keyword)cStringEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cIntEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cIntIntKeyword_1_0 = (Keyword)cIntEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum DataType returns DataType:
		//                String = 'String' | Int = 'Int';
		public EnumRule getRule() { return rule; }
		
		//String = 'String' | Int = 'Int'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//String = 'String'
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_0() { return cStringEnumLiteralDeclaration_0; }
		
		//'String'
		public Keyword getStringStringKeyword_0_0() { return cStringStringKeyword_0_0; }
		
		//Int = 'Int'
		public EnumLiteralDeclaration getIntEnumLiteralDeclaration_1() { return cIntEnumLiteralDeclaration_1; }
		
		//'Int'
		public Keyword getIntIntKeyword_1_0() { return cIntIntKeyword_1_0; }
	}
	
	private final ChaiseMinuteElements pChaiseMinute;
	private final TableElements pTable;
	private final IndexColumnElements pIndexColumn;
	private final ColumnElements pColumn;
	private final DataTypeElements eDataType;
	private final ColumnDataElements pColumnData;
	private final ImportedColumnElements pImportedColumn;
	private final ComputedColumnElements pComputedColumn;
	private final ColumnArgumentElements pColumnArgument;
	private final ArgumentElements pArgument;
	private final AlgorithmElements pAlgorithm;
	private final EIntElements pEInt;
	private final EStringElements pEString;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FromTextGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pChaiseMinute = new ChaiseMinuteElements();
		this.pTable = new TableElements();
		this.pIndexColumn = new IndexColumnElements();
		this.pColumn = new ColumnElements();
		this.eDataType = new DataTypeElements();
		this.pColumnData = new ColumnDataElements();
		this.pImportedColumn = new ImportedColumnElements();
		this.pComputedColumn = new ComputedColumnElements();
		this.pColumnArgument = new ColumnArgumentElements();
		this.pArgument = new ArgumentElements();
		this.pAlgorithm = new AlgorithmElements();
		this.pEInt = new EIntElements();
		this.pEString = new EStringElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.n7.chaiseMinute.FromText".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ChaiseMinute returns ChaiseMinute:
	//    '{'
	//        (tables+=Table ( ','? tables+=Table)* )?
	//    '}';
	public ChaiseMinuteElements getChaiseMinuteAccess() {
		return pChaiseMinute;
	}
	
	public ParserRule getChaiseMinuteRule() {
		return getChaiseMinuteAccess().getRule();
	}
	
	//Table returns Table:
	//    '{'
	//    name=EString ','
	//    indexColumn=IndexColumn ','
	//    (columns+=Column ( "," columns+=Column)* )?
	//    '}';
	public TableElements getTableAccess() {
		return pTable;
	}
	
	public ParserRule getTableRule() {
		return getTableAccess().getRule();
	}
	
	//IndexColumn returns IndexColumn:
	//    {IndexColumn}
	//    ;
	public IndexColumnElements getIndexColumnAccess() {
		return pIndexColumn;
	}
	
	public ParserRule getIndexColumnRule() {
		return getIndexColumnAccess().getRule();
	}
	
	//Column returns Column:
	//    ColumnData | ComputedColumn | ImportedColumn;
	public ColumnElements getColumnAccess() {
		return pColumn;
	}
	
	public ParserRule getColumnRule() {
		return getColumnAccess().getRule();
	}
	
	//enum DataType returns DataType:
	//                String = 'String' | Int = 'Int';
	public DataTypeElements getDataTypeAccess() {
		return eDataType;
	}
	
	public EnumRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//ColumnData returns ColumnData:
	//    'data' '(' type=DataType ')' ':' id=EString
	//    ;
	public ColumnDataElements getColumnDataAccess() {
		return pColumnData;
	}
	
	public ParserRule getColumnDataRule() {
		return getColumnDataAccess().getRule();
	}
	
	//ImportedColumn returns ImportedColumn:
	//    'imported' '(' type=DataType ')' ':'
	//    path=EString
	//    '->'
	//    id=EString
	//    ;
	public ImportedColumnElements getImportedColumnAccess() {
		return pImportedColumn;
	}
	
	public ParserRule getImportedColumnRule() {
		return getImportedColumnAccess().getRule();
	}
	
	//ComputedColumn returns ComputedColumn:
	//    'computed'
	//    '('
	//    type=DataType
	//    ')'
	//    ':'
	//    algorithm=Algorithm
	//    '->'
	//    id=EString
	//    ;
	public ComputedColumnElements getComputedColumnAccess() {
		return pComputedColumn;
	}
	
	public ParserRule getComputedColumnRule() {
		return getComputedColumnAccess().getRule();
	}
	
	//ColumnArgument returns function::ColumnArgument:
	//    {function::ColumnArgument}
	//    columnPath=STRING
	//    ;
	public ColumnArgumentElements getColumnArgumentAccess() {
		return pColumnArgument;
	}
	
	public ParserRule getColumnArgumentRule() {
		return getColumnArgumentAccess().getRule();
	}
	
	//Argument returns function::Argument:
	//    ColumnArgument
	//    ;
	public ArgumentElements getArgumentAccess() {
		return pArgument;
	}
	
	public ParserRule getArgumentRule() {
		return getArgumentAccess().getRule();
	}
	
	//Algorithm returns algorithm::Algorithm:
	//    {algorithm::Algorithm}
	//    functions+=EString
	//    '('
	//        (inputs+=Argument ( "," inputs+=Argument)*)?
	//    ')'
	//    (
	//        '>'
	//        functions+=EString
	//        '('
	//        (inputs+=Argument ( "," inputs+=Argument)*)?
	//        ')'
	//    )?
	//        ;
	public AlgorithmElements getAlgorithmAccess() {
		return pAlgorithm;
	}
	
	public ParserRule getAlgorithmRule() {
		return getAlgorithmAccess().getRule();
	}
	
	//EInt returns ecore::EInt:
	//    '-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
