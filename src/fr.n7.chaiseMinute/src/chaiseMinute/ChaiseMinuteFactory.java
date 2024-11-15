/**
 */
package chaiseMinute;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see chaiseMinute.ChaiseMinutePackage
 * @generated
 */
public interface ChaiseMinuteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChaiseMinuteFactory eINSTANCE = chaiseMinute.impl.ChaiseMinuteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Chaise Minute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chaise Minute</em>'.
	 * @generated
	 */
	ChaiseMinute createChaiseMinute();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChaiseMinutePackage getChaiseMinutePackage();

} //ChaiseMinuteFactory
