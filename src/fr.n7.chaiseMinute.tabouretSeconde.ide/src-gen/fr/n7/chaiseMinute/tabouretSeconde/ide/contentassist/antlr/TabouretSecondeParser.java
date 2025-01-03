/*
 * generated by Xtext 2.32.0
 */
package fr.n7.chaiseMinute.tabouretSeconde.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.n7.chaiseMinute.tabouretSeconde.ide.contentassist.antlr.internal.InternalTabouretSecondeParser;
import fr.n7.chaiseMinute.tabouretSeconde.services.TabouretSecondeGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class TabouretSecondeParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TabouretSecondeGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TabouretSecondeGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getColumnAccess().getAlternatives(), "rule__Column__Alternatives");
			builder.put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
			builder.put(grammarAccess.getChaiseMinuteAccess().getGroup(), "rule__ChaiseMinute__Group__0");
			builder.put(grammarAccess.getChaiseMinuteAccess().getGroup_2(), "rule__ChaiseMinute__Group_2__0");
			builder.put(grammarAccess.getChaiseMinuteAccess().getGroup_2_1(), "rule__ChaiseMinute__Group_2_1__0");
			builder.put(grammarAccess.getChaiseMinuteAccess().getGroup_4(), "rule__ChaiseMinute__Group_4__0");
			builder.put(grammarAccess.getChaiseMinuteAccess().getGroup_4_3(), "rule__ChaiseMinute__Group_4_3__0");
			builder.put(grammarAccess.getTableAccess().getGroup(), "rule__Table__Group__0");
			builder.put(grammarAccess.getTableAccess().getGroup_5(), "rule__Table__Group_5__0");
			builder.put(grammarAccess.getTableAccess().getGroup_5_1(), "rule__Table__Group_5_1__0");
			builder.put(grammarAccess.getTableAccess().getGroup_7(), "rule__Table__Group_7__0");
			builder.put(grammarAccess.getTableAccess().getGroup_7_3(), "rule__Table__Group_7_3__0");
			builder.put(grammarAccess.getIndexColumnAccess().getGroup(), "rule__IndexColumn__Group__0");
			builder.put(grammarAccess.getColumnDataAccess().getGroup(), "rule__ColumnData__Group__0");
			builder.put(grammarAccess.getComputedColumnAccess().getGroup(), "rule__ComputedColumn__Group__0");
			builder.put(grammarAccess.getImportedColumnAccess().getGroup(), "rule__ImportedColumn__Group__0");
			builder.put(grammarAccess.getAlgorithmAccess().getGroup(), "rule__Algorithm__Group__0");
			builder.put(grammarAccess.getAlgorithmAccess().getGroup_3(), "rule__Algorithm__Group_3__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_3(), "rule__Function__Group_3__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_3_1(), "rule__Function__Group_3_1__0");
			builder.put(grammarAccess.getColumnArgumentAccess().getGroup(), "rule__ColumnArgument__Group__0");
			builder.put(grammarAccess.getChaiseMinuteAccess().getNameAssignment_0(), "rule__ChaiseMinute__NameAssignment_0");
			builder.put(grammarAccess.getChaiseMinuteAccess().getTablesAssignment_2_0(), "rule__ChaiseMinute__TablesAssignment_2_0");
			builder.put(grammarAccess.getChaiseMinuteAccess().getTablesAssignment_2_1_1(), "rule__ChaiseMinute__TablesAssignment_2_1_1");
			builder.put(grammarAccess.getChaiseMinuteAccess().getConstraintsAssignment_4_2(), "rule__ChaiseMinute__ConstraintsAssignment_4_2");
			builder.put(grammarAccess.getChaiseMinuteAccess().getConstraintsAssignment_4_3_1(), "rule__ChaiseMinute__ConstraintsAssignment_4_3_1");
			builder.put(grammarAccess.getTableAccess().getNameAssignment_0(), "rule__Table__NameAssignment_0");
			builder.put(grammarAccess.getTableAccess().getIndexcolumnAssignment_3(), "rule__Table__IndexcolumnAssignment_3");
			builder.put(grammarAccess.getTableAccess().getColumnsAssignment_5_0(), "rule__Table__ColumnsAssignment_5_0");
			builder.put(grammarAccess.getTableAccess().getColumnsAssignment_5_1_1(), "rule__Table__ColumnsAssignment_5_1_1");
			builder.put(grammarAccess.getTableAccess().getConstraintsAssignment_7_2(), "rule__Table__ConstraintsAssignment_7_2");
			builder.put(grammarAccess.getTableAccess().getConstraintsAssignment_7_3_1(), "rule__Table__ConstraintsAssignment_7_3_1");
			builder.put(grammarAccess.getIndexColumnAccess().getIdAssignment_1(), "rule__IndexColumn__IdAssignment_1");
			builder.put(grammarAccess.getIndexColumnAccess().getTypeAssignment_3(), "rule__IndexColumn__TypeAssignment_3");
			builder.put(grammarAccess.getColumnDataAccess().getIdAssignment_0(), "rule__ColumnData__IdAssignment_0");
			builder.put(grammarAccess.getColumnDataAccess().getTypeAssignment_2(), "rule__ColumnData__TypeAssignment_2");
			builder.put(grammarAccess.getComputedColumnAccess().getIdAssignment_0(), "rule__ComputedColumn__IdAssignment_0");
			builder.put(grammarAccess.getComputedColumnAccess().getTypeAssignment_2(), "rule__ComputedColumn__TypeAssignment_2");
			builder.put(grammarAccess.getComputedColumnAccess().getAlgorithmAssignment_5(), "rule__ComputedColumn__AlgorithmAssignment_5");
			builder.put(grammarAccess.getImportedColumnAccess().getIdAssignment_0(), "rule__ImportedColumn__IdAssignment_0");
			builder.put(grammarAccess.getImportedColumnAccess().getTypeAssignment_2(), "rule__ImportedColumn__TypeAssignment_2");
			builder.put(grammarAccess.getImportedColumnAccess().getPathAssignment_5(), "rule__ImportedColumn__PathAssignment_5");
			builder.put(grammarAccess.getAlgorithmAccess().getFunctionsAssignment_2(), "rule__Algorithm__FunctionsAssignment_2");
			builder.put(grammarAccess.getAlgorithmAccess().getFunctionsAssignment_3_1(), "rule__Algorithm__FunctionsAssignment_3_1");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getInputsAssignment_3_0(), "rule__Function__InputsAssignment_3_0");
			builder.put(grammarAccess.getFunctionAccess().getInputsAssignment_3_1_1(), "rule__Function__InputsAssignment_3_1_1");
			builder.put(grammarAccess.getColumnArgumentAccess().getColumnpathAssignment_1(), "rule__ColumnArgument__ColumnpathAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TabouretSecondeGrammarAccess grammarAccess;

	@Override
	protected InternalTabouretSecondeParser createParser() {
		InternalTabouretSecondeParser result = new InternalTabouretSecondeParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TabouretSecondeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TabouretSecondeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
