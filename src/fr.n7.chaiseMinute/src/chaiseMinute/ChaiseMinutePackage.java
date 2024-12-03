/**
 */
package chaiseMinute;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see chaiseMinute.ChaiseMinuteFactory
 * @model kind="package"
 * @generated
 */
public interface ChaiseMinutePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chaiseMinute";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://chaiseMinute";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chaiseMinute";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChaiseMinutePackage eINSTANCE = chaiseMinute.impl.ChaiseMinutePackageImpl.init();

	/**
	 * The meta object id for the '{@link chaiseMinute.impl.ChaiseMinuteImpl <em>Chaise Minute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chaiseMinute.impl.ChaiseMinuteImpl
	 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getChaiseMinute()
	 * @generated
	 */
	int CHAISE_MINUTE = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAISE_MINUTE__TABLES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAISE_MINUTE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Chaise Minute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAISE_MINUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Chaise Minute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAISE_MINUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chaiseMinute.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chaiseMinute.impl.TableImpl
	 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Chaise Minute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CHAISE_MINUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Index Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__INDEX_COLUMN = 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chaiseMinute.Column <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chaiseMinute.Column
	 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 3;

	/**
	 * The meta object id for the '{@link chaiseMinute.impl.IndexColumnImpl <em>Index Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chaiseMinute.impl.IndexColumnImpl
	 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getIndexColumn()
	 * @generated
	 */
	int INDEX_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN__ID = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN__TABLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Index Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Index Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ID = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chaiseMinute.impl.ColumnDataImpl <em>Column Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chaiseMinute.impl.ColumnDataImpl
	 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getColumnData()
	 * @generated
	 */
	int COLUMN_DATA = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DATA__ID = COLUMN__ID;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DATA__TABLE = COLUMN__TABLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DATA__TYPE = COLUMN__TYPE;

	/**
	 * The number of structural features of the '<em>Column Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DATA_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Column Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DATA_OPERATION_COUNT = COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chaiseMinute.impl.ComputedColumnImpl <em>Computed Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chaiseMinute.impl.ComputedColumnImpl
	 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getComputedColumn()
	 * @generated
	 */
	int COMPUTED_COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_COLUMN__ID = COLUMN__ID;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_COLUMN__TABLE = COLUMN__TABLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_COLUMN__TYPE = COLUMN__TYPE;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_COLUMN__ALGORITHM = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computed Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_COLUMN_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Computed Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_COLUMN_OPERATION_COUNT = COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chaiseMinute.impl.ImportedColumnImpl <em>Imported Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chaiseMinute.impl.ImportedColumnImpl
	 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getImportedColumn()
	 * @generated
	 */
	int IMPORTED_COLUMN = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_COLUMN__ID = COLUMN__ID;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_COLUMN__TABLE = COLUMN__TABLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_COLUMN__TYPE = COLUMN__TYPE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_COLUMN__PATH = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imported Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_COLUMN_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Imported Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_COLUMN_OPERATION_COUNT = COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chaiseMinute.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chaiseMinute.DataType
	 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link chaiseMinute.ChaiseMinute <em>Chaise Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chaise Minute</em>'.
	 * @see chaiseMinute.ChaiseMinute
	 * @generated
	 */
	EClass getChaiseMinute();

	/**
	 * Returns the meta object for the containment reference list '{@link chaiseMinute.ChaiseMinute#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see chaiseMinute.ChaiseMinute#getTables()
	 * @see #getChaiseMinute()
	 * @generated
	 */
	EReference getChaiseMinute_Tables();

	/**
	 * Returns the meta object for the attribute '{@link chaiseMinute.ChaiseMinute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chaiseMinute.ChaiseMinute#getName()
	 * @see #getChaiseMinute()
	 * @generated
	 */
	EAttribute getChaiseMinute_Name();

	/**
	 * Returns the meta object for class '{@link chaiseMinute.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see chaiseMinute.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link chaiseMinute.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see chaiseMinute.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the container reference '{@link chaiseMinute.Table#getChaiseMinute <em>Chaise Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Chaise Minute</em>'.
	 * @see chaiseMinute.Table#getChaiseMinute()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ChaiseMinute();

	/**
	 * Returns the meta object for the attribute '{@link chaiseMinute.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chaiseMinute.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link chaiseMinute.Table#getIndexColumn <em>Index Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Column</em>'.
	 * @see chaiseMinute.Table#getIndexColumn()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_IndexColumn();

	/**
	 * Returns the meta object for class '{@link chaiseMinute.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see chaiseMinute.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link chaiseMinute.Column#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see chaiseMinute.Column#getId()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Id();

	/**
	 * Returns the meta object for the container reference '{@link chaiseMinute.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see chaiseMinute.Column#getTable()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link chaiseMinute.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see chaiseMinute.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for class '{@link chaiseMinute.IndexColumn <em>Index Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Column</em>'.
	 * @see chaiseMinute.IndexColumn
	 * @generated
	 */
	EClass getIndexColumn();

	/**
	 * Returns the meta object for the attribute '{@link chaiseMinute.IndexColumn#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see chaiseMinute.IndexColumn#getId()
	 * @see #getIndexColumn()
	 * @generated
	 */
	EAttribute getIndexColumn_Id();

	/**
	 * Returns the meta object for the container reference '{@link chaiseMinute.IndexColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see chaiseMinute.IndexColumn#getTable()
	 * @see #getIndexColumn()
	 * @generated
	 */
	EReference getIndexColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link chaiseMinute.IndexColumn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see chaiseMinute.IndexColumn#getType()
	 * @see #getIndexColumn()
	 * @generated
	 */
	EAttribute getIndexColumn_Type();

	/**
	 * Returns the meta object for class '{@link chaiseMinute.ColumnData <em>Column Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Data</em>'.
	 * @see chaiseMinute.ColumnData
	 * @generated
	 */
	EClass getColumnData();

	/**
	 * Returns the meta object for class '{@link chaiseMinute.ComputedColumn <em>Computed Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computed Column</em>'.
	 * @see chaiseMinute.ComputedColumn
	 * @generated
	 */
	EClass getComputedColumn();

	/**
	 * Returns the meta object for the containment reference '{@link chaiseMinute.ComputedColumn#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algorithm</em>'.
	 * @see chaiseMinute.ComputedColumn#getAlgorithm()
	 * @see #getComputedColumn()
	 * @generated
	 */
	EReference getComputedColumn_Algorithm();

	/**
	 * Returns the meta object for class '{@link chaiseMinute.ImportedColumn <em>Imported Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Column</em>'.
	 * @see chaiseMinute.ImportedColumn
	 * @generated
	 */
	EClass getImportedColumn();

	/**
	 * Returns the meta object for the attribute '{@link chaiseMinute.ImportedColumn#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see chaiseMinute.ImportedColumn#getPath()
	 * @see #getImportedColumn()
	 * @generated
	 */
	EAttribute getImportedColumn_Path();

	/**
	 * Returns the meta object for enum '{@link chaiseMinute.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see chaiseMinute.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChaiseMinuteFactory getChaiseMinuteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link chaiseMinute.impl.ChaiseMinuteImpl <em>Chaise Minute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chaiseMinute.impl.ChaiseMinuteImpl
		 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getChaiseMinute()
		 * @generated
		 */
		EClass CHAISE_MINUTE = eINSTANCE.getChaiseMinute();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAISE_MINUTE__TABLES = eINSTANCE.getChaiseMinute_Tables();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAISE_MINUTE__NAME = eINSTANCE.getChaiseMinute_Name();

		/**
		 * The meta object literal for the '{@link chaiseMinute.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chaiseMinute.impl.TableImpl
		 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Chaise Minute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CHAISE_MINUTE = eINSTANCE.getTable_ChaiseMinute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Index Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__INDEX_COLUMN = eINSTANCE.getTable_IndexColumn();

		/**
		 * The meta object literal for the '{@link chaiseMinute.Column <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chaiseMinute.Column
		 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__ID = eINSTANCE.getColumn_Id();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__TABLE = eINSTANCE.getColumn_Table();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '{@link chaiseMinute.impl.IndexColumnImpl <em>Index Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chaiseMinute.impl.IndexColumnImpl
		 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getIndexColumn()
		 * @generated
		 */
		EClass INDEX_COLUMN = eINSTANCE.getIndexColumn();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN__ID = eINSTANCE.getIndexColumn_Id();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_COLUMN__TABLE = eINSTANCE.getIndexColumn_Table();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN__TYPE = eINSTANCE.getIndexColumn_Type();

		/**
		 * The meta object literal for the '{@link chaiseMinute.impl.ColumnDataImpl <em>Column Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chaiseMinute.impl.ColumnDataImpl
		 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getColumnData()
		 * @generated
		 */
		EClass COLUMN_DATA = eINSTANCE.getColumnData();

		/**
		 * The meta object literal for the '{@link chaiseMinute.impl.ComputedColumnImpl <em>Computed Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chaiseMinute.impl.ComputedColumnImpl
		 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getComputedColumn()
		 * @generated
		 */
		EClass COMPUTED_COLUMN = eINSTANCE.getComputedColumn();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTED_COLUMN__ALGORITHM = eINSTANCE.getComputedColumn_Algorithm();

		/**
		 * The meta object literal for the '{@link chaiseMinute.impl.ImportedColumnImpl <em>Imported Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chaiseMinute.impl.ImportedColumnImpl
		 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getImportedColumn()
		 * @generated
		 */
		EClass IMPORTED_COLUMN = eINSTANCE.getImportedColumn();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_COLUMN__PATH = eINSTANCE.getImportedColumn_Path();

		/**
		 * The meta object literal for the '{@link chaiseMinute.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chaiseMinute.DataType
		 * @see chaiseMinute.impl.ChaiseMinutePackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //ChaiseMinutePackage
