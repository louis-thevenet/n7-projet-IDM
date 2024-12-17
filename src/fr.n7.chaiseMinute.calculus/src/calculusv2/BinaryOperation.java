/**
 */
package calculusv2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.BinaryOperation#getBeforeFirst <em>Before First</em>}</li>
 *   <li>{@link calculusv2.BinaryOperation#getBeforeSecond <em>Before Second</em>}</li>
 * </ul>
 *
 * @see calculusv2.Calculusv2Package#getBinaryOperation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BinaryOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Before First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before First</em>' reference.
	 * @see #setBeforeFirst(Pipe)
	 * @see calculusv2.Calculusv2Package#getBinaryOperation_BeforeFirst()
	 * @model required="true"
	 * @generated
	 */
	Pipe getBeforeFirst();

	/**
	 * Sets the value of the '{@link calculusv2.BinaryOperation#getBeforeFirst <em>Before First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before First</em>' reference.
	 * @see #getBeforeFirst()
	 * @generated
	 */
	void setBeforeFirst(Pipe value);

	/**
	 * Returns the value of the '<em><b>Before Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Second</em>' reference.
	 * @see #setBeforeSecond(Pipe)
	 * @see calculusv2.Calculusv2Package#getBinaryOperation_BeforeSecond()
	 * @model required="true"
	 * @generated
	 */
	Pipe getBeforeSecond();

	/**
	 * Sets the value of the '{@link calculusv2.BinaryOperation#getBeforeSecond <em>Before Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Second</em>' reference.
	 * @see #getBeforeSecond()
	 * @generated
	 */
	void setBeforeSecond(Pipe value);

} // BinaryOperation
