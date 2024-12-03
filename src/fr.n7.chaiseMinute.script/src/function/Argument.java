/**
 */
package function;

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
 *   <li>{@link function.Argument#getUsed_by <em>Used by</em>}</li>
 * </ul>
 *
 * @see function.FunctionPackage#getArgument()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Argument extends EObject {

	/**
	 * Returns the value of the '<em><b>Used by</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link function.Function#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used by</em>' container reference.
	 * @see #setUsed_by(Function)
	 * @see function.FunctionPackage#getArgument_Used_by()
	 * @see function.Function#getInputs
	 * @model opposite="inputs" transient="false"
	 * @generated
	 */
	Function getUsed_by();

	/**
	 * Sets the value of the '{@link function.Argument#getUsed_by <em>Used by</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used by</em>' container reference.
	 * @see #getUsed_by()
	 * @generated
	 */
	void setUsed_by(Function value);
} // Argument
