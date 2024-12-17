/**
 */
package calculusv2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipe Final</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.PipeFinal#getSource <em>Source</em>}</li>
 *   <li>{@link calculusv2.PipeFinal#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see calculusv2.Calculusv2Package#getPipeFinal()
 * @model
 * @generated
 */
public interface PipeFinal extends CalculusElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(UsableExpression)
	 * @see calculusv2.Calculusv2Package#getPipeFinal_Source()
	 * @model required="true"
	 * @generated
	 */
	UsableExpression getSource();

	/**
	 * Sets the value of the '{@link calculusv2.PipeFinal#getSource <em>Source</em>}' reference.
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
	 * @see #setTarget(FinalExpression)
	 * @see calculusv2.Calculusv2Package#getPipeFinal_Target()
	 * @model required="true"
	 * @generated
	 */
	FinalExpression getTarget();

	/**
	 * Sets the value of the '{@link calculusv2.PipeFinal#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(FinalExpression value);

} // PipeFinal
