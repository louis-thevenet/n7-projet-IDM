/**
 */
package algorithm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithm.Algorithm#getInput <em>Input</em>}</li>
 *   <li>{@link algorithm.Algorithm#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see algorithm.AlgorithmPackage#getAlgorithm()
 * @model
 * @generated
 */
public interface Algorithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link algorithm.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see algorithm.AlgorithmPackage#getAlgorithm_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getInput();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Function)
	 * @see algorithm.AlgorithmPackage#getAlgorithm_Function()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link algorithm.Algorithm#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

} // Algorithm
