/**
 */
package calculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculus.BinaryExpression#getFirst <em>First</em>}</li>
 *   <li>{@link calculus.BinaryExpression#getSecond <em>Second</em>}</li>
 *   <li>{@link calculus.BinaryExpression#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see calculus.CalculusPackage#getBinaryExpression()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(Expression)
	 * @see calculus.CalculusPackage#getBinaryExpression_First()
	 * @model required="true"
	 * @generated
	 */
	Expression getFirst();

	/**
	 * Sets the value of the '{@link calculus.BinaryExpression#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(Expression value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' reference.
	 * @see #setSecond(Expression)
	 * @see calculus.CalculusPackage#getBinaryExpression_Second()
	 * @model required="true"
	 * @generated
	 */
	Expression getSecond();

	/**
	 * Sets the value of the '{@link calculus.BinaryExpression#getSecond <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(Expression value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see #setOp(String)
	 * @see calculus.CalculusPackage#getBinaryExpression_Op()
	 * @model required="true"
	 * @generated
	 */
	String getOp();

	/**
	 * Sets the value of the '{@link calculus.BinaryExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(String value);

} // BinaryExpression
