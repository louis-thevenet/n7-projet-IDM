/**
 */
package calculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finale Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculus.FinaleExpression#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see calculus.CalculusPackage#getFinaleExpression()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FinaleExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Expression)
	 * @see calculus.CalculusPackage#getFinaleExpression_Input()
	 * @model required="true"
	 * @generated
	 */
	Expression getInput();

	/**
	 * Sets the value of the '{@link calculus.FinaleExpression#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Expression value);

} // FinaleExpression
