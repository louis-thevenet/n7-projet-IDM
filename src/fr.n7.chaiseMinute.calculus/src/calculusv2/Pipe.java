/**
 */
package calculusv2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.Pipe#getSource <em>Source</em>}</li>
 *   <li>{@link calculusv2.Pipe#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see calculusv2.Calculusv2Package#getPipe()
 * @model
 * @generated
 */
public interface Pipe extends CalculusElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link calculusv2.UsableExpression#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(UsableExpression)
	 * @see calculusv2.Calculusv2Package#getPipe_Source()
	 * @see calculusv2.UsableExpression#getUsedBy
	 * @model opposite="usedBy" required="true"
	 * @generated
	 */
	UsableExpression getSource();

	/**
	 * Sets the value of the '{@link calculusv2.Pipe#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(UsableExpression value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Operation)
	 * @see calculusv2.Calculusv2Package#getPipe_Target()
	 * @model
	 * @generated
	 */
	Operation getTarget();

	/**
	 * Sets the value of the '{@link calculusv2.Pipe#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Operation value);

} // Pipe
