/**
 */
package calculusv2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.Operation#getBefore <em>Before</em>}</li>
 * </ul>
 *
 * @see calculusv2.Calculusv2Package#getOperation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Operation extends UsableExpression {

	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(Pipe)
	 * @see calculusv2.Calculusv2Package#getOperation_Before()
	 * @model required="true"
	 * @generated
	 */
	Pipe getBefore();

	/**
	 * Sets the value of the '{@link calculusv2.Operation#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(Pipe value);
} // Operation
