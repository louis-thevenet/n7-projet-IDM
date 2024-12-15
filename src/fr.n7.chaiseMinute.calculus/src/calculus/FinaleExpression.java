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
 *   <li>{@link calculus.FinaleExpression#getResult <em>Result</em>}</li>
 *   <li>{@link calculus.FinaleExpression#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see calculus.CalculusPackage#getFinaleExpression()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FinaleExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see calculus.CalculusPackage#getFinaleExpression_Result()
	 * @model required="true"
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link calculus.FinaleExpression#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Expression)
	 * @see calculus.CalculusPackage#getFinaleExpression_From()
	 * @model required="true"
	 * @generated
	 */
	Expression getFrom();

	/**
	 * Sets the value of the '{@link calculus.FinaleExpression#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Expression value);

} // FinaleExpression
