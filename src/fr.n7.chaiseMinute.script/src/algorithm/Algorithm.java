/**
 */
package algorithm;

import function.Argument;

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
 *   <li>{@link algorithm.Algorithm#getInputs <em>Inputs</em>}</li>
 *   <li>{@link algorithm.Algorithm#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see algorithm.AlgorithmPackage#getAlgorithm()
 * @model
 * @generated
 */
public interface Algorithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link function.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see algorithm.AlgorithmPackage#getAlgorithm_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getInputs();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' attribute list.
	 * @see algorithm.AlgorithmPackage#getAlgorithm_Functions()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getFunctions();

} // Algorithm
