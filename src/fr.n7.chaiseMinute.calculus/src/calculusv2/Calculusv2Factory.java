/**
 */
package calculusv2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see calculusv2.Calculusv2Package
 * @generated
 */
public interface Calculusv2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Calculusv2Factory eINSTANCE = calculusv2.impl.Calculusv2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Calculus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calculus</em>'.
	 * @generated
	 */
	Calculus createCalculus();

	/**
	 * Returns a new object of class '<em>Input Args</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Args</em>'.
	 * @generated
	 */
	InputArgs createInputArgs();

	/**
	 * Returns a new object of class '<em>Oppose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oppose</em>'.
	 * @generated
	 */
	Oppose createOppose();

	/**
	 * Returns a new object of class '<em>Reciprocal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reciprocal</em>'.
	 * @generated
	 */
	Reciprocal createReciprocal();

	/**
	 * Returns a new object of class '<em>Sum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sum</em>'.
	 * @generated
	 */
	Sum createSum();

	/**
	 * Returns a new object of class '<em>Products</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Products</em>'.
	 * @generated
	 */
	Products createProducts();

	/**
	 * Returns a new object of class '<em>Substraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substraction</em>'.
	 * @generated
	 */
	Substraction createSubstraction();

	/**
	 * Returns a new object of class '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Division</em>'.
	 * @generated
	 */
	Division createDivision();

	/**
	 * Returns a new object of class '<em>Constante</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constante</em>'.
	 * @generated
	 */
	Constante createConstante();

	/**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
	Result createResult();

	/**
	 * Returns a new object of class '<em>Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipe</em>'.
	 * @generated
	 */
	Pipe createPipe();

	/**
	 * Returns a new object of class '<em>Pipe Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipe Final</em>'.
	 * @generated
	 */
	PipeFinal createPipeFinal();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Calculusv2Package getCalculusv2Package();

} //Calculusv2Factory
