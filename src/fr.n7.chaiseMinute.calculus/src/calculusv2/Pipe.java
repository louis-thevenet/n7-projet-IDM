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
 *   <li>{@link calculusv2.Pipe#getSourcePipe <em>Source Pipe</em>}</li>
 *   <li>{@link calculusv2.Pipe#getTargetPipe <em>Target Pipe</em>}</li>
 * </ul>
 *
 * @see calculusv2.Calculusv2Package#getPipe()
 * @model
 * @generated
 */
public interface Pipe extends CalculusElement {
	/**
	 * Returns the value of the '<em><b>Source Pipe</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link calculusv2.UsableExpression#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Pipe</em>' reference.
	 * @see #setSourcePipe(UsableExpression)
	 * @see calculusv2.Calculusv2Package#getPipe_SourcePipe()
	 * @see calculusv2.UsableExpression#getUsedBy
	 * @model opposite="usedBy" required="true"
	 * @generated
	 */
	UsableExpression getSourcePipe();

	/**
	 * Sets the value of the '{@link calculusv2.Pipe#getSourcePipe <em>Source Pipe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Pipe</em>' reference.
	 * @see #getSourcePipe()
	 * @generated
	 */
	void setSourcePipe(UsableExpression value);

	/**
	 * Returns the value of the '<em><b>Target Pipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Pipe</em>' reference.
	 * @see #setTargetPipe(Operation)
	 * @see calculusv2.Calculusv2Package#getPipe_TargetPipe()
	 * @model required="true"
	 * @generated
	 */
	Operation getTargetPipe();

	/**
	 * Sets the value of the '{@link calculusv2.Pipe#getTargetPipe <em>Target Pipe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Pipe</em>' reference.
	 * @see #getTargetPipe()
	 * @generated
	 */
	void setTargetPipe(Operation value);

} // Pipe
