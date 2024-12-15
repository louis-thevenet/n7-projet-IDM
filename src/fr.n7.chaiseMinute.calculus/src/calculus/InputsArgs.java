/**
 */
package calculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inputs Args</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculus.InputsArgs#getArgName <em>Arg Name</em>}</li>
 * </ul>
 *
 * @see calculus.CalculusPackage#getInputsArgs()
 * @model
 * @generated
 */
public interface InputsArgs extends Expression {
	/**
	 * Returns the value of the '<em><b>Arg Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg Name</em>' attribute.
	 * @see #setArgName(String)
	 * @see calculus.CalculusPackage#getInputsArgs_ArgName()
	 * @model required="true"
	 * @generated
	 */
	String getArgName();

	/**
	 * Sets the value of the '{@link calculus.InputsArgs#getArgName <em>Arg Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg Name</em>' attribute.
	 * @see #getArgName()
	 * @generated
	 */
	void setArgName(String value);

} // InputsArgs
