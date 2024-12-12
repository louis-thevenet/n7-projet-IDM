/*
 * generated by Xtext 2.32.0
 */
package fr.n7.serializer;

import com.google.inject.Inject;
import fr.n7.cHAISEMINUTETEXT.Algorithm;
import fr.n7.cHAISEMINUTETEXT.CHAISEMINUTETEXTPackage;
import fr.n7.cHAISEMINUTETEXT.ChaiseMinute;
import fr.n7.cHAISEMINUTETEXT.ColumnArgument;
import fr.n7.cHAISEMINUTETEXT.ColumnData;
import fr.n7.cHAISEMINUTETEXT.ComputedColumn;
import fr.n7.cHAISEMINUTETEXT.Function;
import fr.n7.cHAISEMINUTETEXT.ImportedColumn;
import fr.n7.cHAISEMINUTETEXT.IndexColumn;
import fr.n7.cHAISEMINUTETEXT.Table;
import fr.n7.services.CHAISEMINUTETEXTGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CHAISEMINUTETEXTSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CHAISEMINUTETEXTGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CHAISEMINUTETEXTPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CHAISEMINUTETEXTPackage.ALGORITHM:
				sequence_Algorithm(context, (Algorithm) semanticObject); 
				return; 
			case CHAISEMINUTETEXTPackage.CHAISE_MINUTE:
				sequence_ChaiseMinute(context, (ChaiseMinute) semanticObject); 
				return; 
			case CHAISEMINUTETEXTPackage.COLUMN_ARGUMENT:
				sequence_ColumnArgument(context, (ColumnArgument) semanticObject); 
				return; 
			case CHAISEMINUTETEXTPackage.COLUMN_DATA:
				sequence_ColumnData(context, (ColumnData) semanticObject); 
				return; 
			case CHAISEMINUTETEXTPackage.COMPUTED_COLUMN:
				sequence_ComputedColumn(context, (ComputedColumn) semanticObject); 
				return; 
			case CHAISEMINUTETEXTPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case CHAISEMINUTETEXTPackage.IMPORTED_COLUMN:
				sequence_ImportedColumn(context, (ImportedColumn) semanticObject); 
				return; 
			case CHAISEMINUTETEXTPackage.INDEX_COLUMN:
				sequence_IndexColumn(context, (IndexColumn) semanticObject); 
				return; 
			case CHAISEMINUTETEXTPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Algorithm returns Algorithm
	 *
	 * Constraint:
	 *     (functions+=Function functions+=Function?)
	 * </pre>
	 */
	protected void sequence_Algorithm(ISerializationContext context, Algorithm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ChaiseMinute returns ChaiseMinute
	 *
	 * Constraint:
	 *     (name=ID (tables+=Table tables+=Table*)? (constraints+=Algorithm constraints+=Algorithm*)?)
	 * </pre>
	 */
	protected void sequence_ChaiseMinute(ISerializationContext context, ChaiseMinute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Argument returns ColumnArgument
	 *     ColumnArgument returns ColumnArgument
	 *
	 * Constraint:
	 *     columnpath=STRING
	 * </pre>
	 */
	protected void sequence_ColumnArgument(ISerializationContext context, ColumnArgument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN_ARGUMENT__COLUMNPATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN_ARGUMENT__COLUMNPATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColumnArgumentAccess().getColumnpathSTRINGTerminalRuleCall_1_0(), semanticObject.getColumnpath());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Column returns ColumnData
	 *     ColumnData returns ColumnData
	 *
	 * Constraint:
	 *     (id=ID type=DataType)
	 * </pre>
	 */
	protected void sequence_ColumnData(ISerializationContext context, ColumnData semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN__ID));
			if (transientValues.isValueTransient(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColumnDataAccess().getIdIDTerminalRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getColumnDataAccess().getTypeDataTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Column returns ComputedColumn
	 *     ComputedColumn returns ComputedColumn
	 *
	 * Constraint:
	 *     (id=ID type=DataType algorithm=Algorithm)
	 * </pre>
	 */
	protected void sequence_ComputedColumn(ISerializationContext context, ComputedColumn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN__ID));
			if (transientValues.isValueTransient(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN__TYPE));
			if (transientValues.isValueTransient(semanticObject, CHAISEMINUTETEXTPackage.Literals.COMPUTED_COLUMN__ALGORITHM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CHAISEMINUTETEXTPackage.Literals.COMPUTED_COLUMN__ALGORITHM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComputedColumnAccess().getIdIDTerminalRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getComputedColumnAccess().getTypeDataTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getComputedColumnAccess().getAlgorithmAlgorithmParserRuleCall_5_0(), semanticObject.getAlgorithm());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (name=ID (inputs+=Argument inputs+=Argument*)?)
	 * </pre>
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Column returns ImportedColumn
	 *     ImportedColumn returns ImportedColumn
	 *
	 * Constraint:
	 *     (id=ID type=DataType path=STRING)
	 * </pre>
	 */
	protected void sequence_ImportedColumn(ISerializationContext context, ImportedColumn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN__ID));
			if (transientValues.isValueTransient(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CHAISEMINUTETEXTPackage.Literals.COLUMN__TYPE));
			if (transientValues.isValueTransient(semanticObject, CHAISEMINUTETEXTPackage.Literals.IMPORTED_COLUMN__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CHAISEMINUTETEXTPackage.Literals.IMPORTED_COLUMN__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportedColumnAccess().getIdIDTerminalRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getImportedColumnAccess().getTypeDataTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getImportedColumnAccess().getPathSTRINGTerminalRuleCall_5_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IndexColumn returns IndexColumn
	 *
	 * Constraint:
	 *     (id=ID type=DataType)
	 * </pre>
	 */
	protected void sequence_IndexColumn(ISerializationContext context, IndexColumn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CHAISEMINUTETEXTPackage.Literals.INDEX_COLUMN__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CHAISEMINUTETEXTPackage.Literals.INDEX_COLUMN__ID));
			if (transientValues.isValueTransient(semanticObject, CHAISEMINUTETEXTPackage.Literals.INDEX_COLUMN__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CHAISEMINUTETEXTPackage.Literals.INDEX_COLUMN__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIndexColumnAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getIndexColumnAccess().getTypeDataTypeEnumRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Table returns Table
	 *
	 * Constraint:
	 *     (name=ID indexcolumn=IndexColumn (columns+=Column columns+=Column*)? (constraints+=Algorithm constraints+=Algorithm*)?)
	 * </pre>
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
