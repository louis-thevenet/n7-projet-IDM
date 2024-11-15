/**
 */
package chaiseMinute;

import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAISE_MINUTE__TABLES = 0;

	/**
	 * The number of structural features of the '<em>Chaise Minute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAISE_MINUTE_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the reference '{@link chaiseMinute.ChaiseMinute#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tables</em>'.
	 * @see chaiseMinute.ChaiseMinute#getTables()
	 * @see #getChaiseMinute()
	 * @generated
	 */
	EReference getChaiseMinute_Tables();

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
	 * Returns the meta object for the reference list '{@link chaiseMinute.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see chaiseMinute.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

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
		 * The meta object literal for the '<em><b>Tables</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAISE_MINUTE__TABLES = eINSTANCE.getChaiseMinute_Tables();

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
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

	}

} //ChaiseMinutePackage
