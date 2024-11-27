/**
 */
package algorithm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithm.Argument#getUsedBy <em>Used By</em>}</li>
 * </ul>
 *
 * @see algorithm.AlgorithmPackage#getArgument()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Argument extends EObject {

	/**
	 * Returns the value of the '<em><b>Used By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithm.Function#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By</em>' container reference.
	 * @see #setUsedBy(Function)
	 * @see algorithm.AlgorithmPackage#getArgument_UsedBy()
	 * @see algorithm.Function#getInput
	 * @model opposite="input" transient="false"
	 * @generated
	 */
	Function getUsedBy();

	/**
	 * Sets the value of the '{@link algorithm.Argument#getUsedBy <em>Used By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used By</em>' container reference.
	 * @see #getUsedBy()
	 * @generated
	 */
	void setUsedBy(Function value);
} // Argument
