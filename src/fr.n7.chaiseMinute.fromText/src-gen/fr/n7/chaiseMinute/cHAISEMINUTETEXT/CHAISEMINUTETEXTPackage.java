/**
 * generated by Xtext 2.32.0
 */
package fr.n7.chaiseMinute.cHAISEMINUTETEXT;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.CHAISEMINUTETEXTFactory
 * @model kind="package"
 * @generated
 */
public interface CHAISEMINUTETEXTPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "cHAISEMINUTETEXT";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.n7.fr/chaiseMinute/CHAISEMINUTETEXT";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "cHAISEMINUTETEXT";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  CHAISEMINUTETEXTPackage eINSTANCE = fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl.init();

  /**
	 * The meta object id for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ChaiseMinuteImpl <em>Chaise Minute</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ChaiseMinuteImpl
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getChaiseMinute()
	 * @generated
	 */
  int CHAISE_MINUTE = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CHAISE_MINUTE__NAME = 0;

  /**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CHAISE_MINUTE__TABLES = 1;

  /**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CHAISE_MINUTE__CONSTRAINTS = 2;

  /**
	 * The number of structural features of the '<em>Chaise Minute</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CHAISE_MINUTE_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.TableImpl
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getTable()
	 * @generated
	 */
  int TABLE = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TABLE__NAME = 0;

  /**
	 * The feature id for the '<em><b>Indexcolumn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TABLE__INDEXCOLUMN = 1;

  /**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TABLE__COLUMNS = 2;

  /**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TABLE__CONSTRAINTS = 3;

  /**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TABLE_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.IndexColumnImpl <em>Index Column</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.IndexColumnImpl
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getIndexColumn()
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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INDEX_COLUMN__TYPE = 1;

  /**
	 * The number of structural features of the '<em>Index Column</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INDEX_COLUMN_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ColumnImpl
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getColumn()
	 * @generated
	 */
  int COLUMN = 3;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLUMN__ID = 0;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLUMN__TYPE = 1;

  /**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLUMN_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ColumnDataImpl <em>Column Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ColumnDataImpl
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getColumnData()
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
	 * The meta object id for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ComputedColumnImpl <em>Computed Column</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ComputedColumnImpl
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getComputedColumn()
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
	 * The meta object id for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ImportedColumnImpl <em>Imported Column</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ImportedColumnImpl
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getImportedColumn()
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
	 * The meta object id for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.AlgorithmImpl <em>Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.AlgorithmImpl
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getAlgorithm()
	 * @generated
	 */
  int ALGORITHM = 7;

  /**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ALGORITHM__FUNCTIONS = 0;

  /**
	 * The number of structural features of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ALGORITHM_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.FunctionImpl
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getFunction()
	 * @generated
	 */
  int FUNCTION = 8;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FUNCTION__NAME = 0;

  /**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FUNCTION__INPUTS = 1;

  /**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FUNCTION_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ArgumentImpl
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getArgument()
	 * @generated
	 */
  int ARGUMENT = 9;

  /**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARGUMENT_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ColumnArgumentImpl <em>Column Argument</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ColumnArgumentImpl
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getColumnArgument()
	 * @generated
	 */
  int COLUMN_ARGUMENT = 10;

  /**
	 * The feature id for the '<em><b>Columnpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLUMN_ARGUMENT__COLUMNPATH = ARGUMENT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Column Argument</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLUMN_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.DataType
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getDataType()
	 * @generated
	 */
  int DATA_TYPE = 11;


  /**
	 * Returns the meta object for class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ChaiseMinute <em>Chaise Minute</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chaise Minute</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ChaiseMinute
	 * @generated
	 */
  EClass getChaiseMinute();

  /**
	 * Returns the meta object for the attribute '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ChaiseMinute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ChaiseMinute#getName()
	 * @see #getChaiseMinute()
	 * @generated
	 */
  EAttribute getChaiseMinute_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ChaiseMinute#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ChaiseMinute#getTables()
	 * @see #getChaiseMinute()
	 * @generated
	 */
  EReference getChaiseMinute_Tables();

  /**
	 * Returns the meta object for the containment reference list '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ChaiseMinute#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ChaiseMinute#getConstraints()
	 * @see #getChaiseMinute()
	 * @generated
	 */
  EReference getChaiseMinute_Constraints();

  /**
	 * Returns the meta object for class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Table
	 * @generated
	 */
  EClass getTable();

  /**
	 * Returns the meta object for the attribute '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
  EAttribute getTable_Name();

  /**
	 * Returns the meta object for the containment reference '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Table#getIndexcolumn <em>Indexcolumn</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indexcolumn</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Table#getIndexcolumn()
	 * @see #getTable()
	 * @generated
	 */
  EReference getTable_Indexcolumn();

  /**
	 * Returns the meta object for the containment reference list '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
  EReference getTable_Columns();

  /**
	 * Returns the meta object for the containment reference list '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Table#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Table#getConstraints()
	 * @see #getTable()
	 * @generated
	 */
  EReference getTable_Constraints();

  /**
	 * Returns the meta object for class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.IndexColumn <em>Index Column</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Column</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.IndexColumn
	 * @generated
	 */
  EClass getIndexColumn();

  /**
	 * Returns the meta object for the attribute '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.IndexColumn#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.IndexColumn#getId()
	 * @see #getIndexColumn()
	 * @generated
	 */
  EAttribute getIndexColumn_Id();

  /**
	 * Returns the meta object for the attribute '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.IndexColumn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.IndexColumn#getType()
	 * @see #getIndexColumn()
	 * @generated
	 */
  EAttribute getIndexColumn_Type();

  /**
	 * Returns the meta object for class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Column
	 * @generated
	 */
  EClass getColumn();

  /**
	 * Returns the meta object for the attribute '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Column#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Column#getId()
	 * @see #getColumn()
	 * @generated
	 */
  EAttribute getColumn_Id();

  /**
	 * Returns the meta object for the attribute '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
  EAttribute getColumn_Type();

  /**
	 * Returns the meta object for class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ColumnData <em>Column Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Data</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ColumnData
	 * @generated
	 */
  EClass getColumnData();

  /**
	 * Returns the meta object for class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ComputedColumn <em>Computed Column</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computed Column</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ComputedColumn
	 * @generated
	 */
  EClass getComputedColumn();

  /**
	 * Returns the meta object for the containment reference '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ComputedColumn#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algorithm</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ComputedColumn#getAlgorithm()
	 * @see #getComputedColumn()
	 * @generated
	 */
  EReference getComputedColumn_Algorithm();

  /**
	 * Returns the meta object for class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ImportedColumn <em>Imported Column</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Column</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ImportedColumn
	 * @generated
	 */
  EClass getImportedColumn();

  /**
	 * Returns the meta object for the attribute '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ImportedColumn#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ImportedColumn#getPath()
	 * @see #getImportedColumn()
	 * @generated
	 */
  EAttribute getImportedColumn_Path();

  /**
	 * Returns the meta object for class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Algorithm
	 * @generated
	 */
  EClass getAlgorithm();

  /**
	 * Returns the meta object for the containment reference list '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Algorithm#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Algorithm#getFunctions()
	 * @see #getAlgorithm()
	 * @generated
	 */
  EReference getAlgorithm_Functions();

  /**
	 * Returns the meta object for class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Function
	 * @generated
	 */
  EClass getFunction();

  /**
	 * Returns the meta object for the attribute '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
  EAttribute getFunction_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Function#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Function#getInputs()
	 * @see #getFunction()
	 * @generated
	 */
  EReference getFunction_Inputs();

  /**
	 * Returns the meta object for class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Argument
	 * @generated
	 */
  EClass getArgument();

  /**
	 * Returns the meta object for class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ColumnArgument <em>Column Argument</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Argument</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ColumnArgument
	 * @generated
	 */
  EClass getColumnArgument();

  /**
	 * Returns the meta object for the attribute '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ColumnArgument#getColumnpath <em>Columnpath</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columnpath</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ColumnArgument#getColumnpath()
	 * @see #getColumnArgument()
	 * @generated
	 */
  EAttribute getColumnArgument_Columnpath();

  /**
	 * Returns the meta object for enum '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.DataType
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
  CHAISEMINUTETEXTFactory getCHAISEMINUTETEXTFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ChaiseMinuteImpl <em>Chaise Minute</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ChaiseMinuteImpl
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getChaiseMinute()
		 * @generated
		 */
    EClass CHAISE_MINUTE = eINSTANCE.getChaiseMinute();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CHAISE_MINUTE__NAME = eINSTANCE.getChaiseMinute_Name();

    /**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CHAISE_MINUTE__TABLES = eINSTANCE.getChaiseMinute_Tables();

    /**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CHAISE_MINUTE__CONSTRAINTS = eINSTANCE.getChaiseMinute_Constraints();

    /**
		 * The meta object literal for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.TableImpl
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getTable()
		 * @generated
		 */
    EClass TABLE = eINSTANCE.getTable();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

    /**
		 * The meta object literal for the '<em><b>Indexcolumn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TABLE__INDEXCOLUMN = eINSTANCE.getTable_Indexcolumn();

    /**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

    /**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TABLE__CONSTRAINTS = eINSTANCE.getTable_Constraints();

    /**
		 * The meta object literal for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.IndexColumnImpl <em>Index Column</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.IndexColumnImpl
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getIndexColumn()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INDEX_COLUMN__TYPE = eINSTANCE.getIndexColumn_Type();

    /**
		 * The meta object literal for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ColumnImpl
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getColumn()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

    /**
		 * The meta object literal for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ColumnDataImpl <em>Column Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ColumnDataImpl
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getColumnData()
		 * @generated
		 */
    EClass COLUMN_DATA = eINSTANCE.getColumnData();

    /**
		 * The meta object literal for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ComputedColumnImpl <em>Computed Column</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ComputedColumnImpl
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getComputedColumn()
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
		 * The meta object literal for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ImportedColumnImpl <em>Imported Column</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ImportedColumnImpl
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getImportedColumn()
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
		 * The meta object literal for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.AlgorithmImpl <em>Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.AlgorithmImpl
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getAlgorithm()
		 * @generated
		 */
    EClass ALGORITHM = eINSTANCE.getAlgorithm();

    /**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ALGORITHM__FUNCTIONS = eINSTANCE.getAlgorithm_Functions();

    /**
		 * The meta object literal for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.FunctionImpl
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getFunction()
		 * @generated
		 */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FUNCTION__INPUTS = eINSTANCE.getFunction_Inputs();

    /**
		 * The meta object literal for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ArgumentImpl
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getArgument()
		 * @generated
		 */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
		 * The meta object literal for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ColumnArgumentImpl <em>Column Argument</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ColumnArgumentImpl
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getColumnArgument()
		 * @generated
		 */
    EClass COLUMN_ARGUMENT = eINSTANCE.getColumnArgument();

    /**
		 * The meta object literal for the '<em><b>Columnpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COLUMN_ARGUMENT__COLUMNPATH = eINSTANCE.getColumnArgument_Columnpath();

    /**
		 * The meta object literal for the '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.DataType
		 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTPackageImpl#getDataType()
		 * @generated
		 */
    EEnum DATA_TYPE = eINSTANCE.getDataType();

  }

} //CHAISEMINUTETEXTPackage