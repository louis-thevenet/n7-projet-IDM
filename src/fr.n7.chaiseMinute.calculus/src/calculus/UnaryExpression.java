/**
 */
package calculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculus.UnaryExpression#getInput <em>Input</em>}</li>
 *   <li>{@link calculus.UnaryExpression#getNext <em>Next</em>}</li>
 *   <li>{@link calculus.UnaryExpression#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see calculus.CalculusPackage#getUnaryExpression()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface UnaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Expression)
	 * @see calculus.CalculusPackage#getUnaryExpression_Input()
	 * @model required="true"
	 * @generated
	 */
	Expression getInput();

	/**
	 * Sets the value of the '{@link calculus.UnaryExpression#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Expression value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Expression)
	 * @see calculus.CalculusPackage#getUnaryExpression_Next()
	 * @model required="true"
	 * @generated
	 */
	Expression getNext();

	/**
	 * Sets the value of the '{@link calculus.UnaryExpression#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Expression value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see #setOp(String)
	 * @see calculus.CalculusPackage#getUnaryExpression_Op()
	 * @model required="true"
	 * @generated
	 */
	String getOp();

	/**
	 * Sets the value of the '{@link calculus.UnaryExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(String value);

} // UnaryExpression
