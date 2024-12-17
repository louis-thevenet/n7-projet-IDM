/**
 */
package calculusv2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipe Super</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.PipeSuper#getSourcePipe <em>Source Pipe</em>}</li>
 * </ul>
 *
 * @see calculusv2.Calculusv2Package#getPipeSuper()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PipeSuper extends CalculusElement {
	/**
	 * Returns the value of the '<em><b>Source Pipe</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link calculusv2.UsableExpression#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Pipe</em>' reference.
	 * @see #setSourcePipe(UsableExpression)
	 * @see calculusv2.Calculusv2Package#getPipeSuper_SourcePipe()
	 * @see calculusv2.UsableExpression#getUsedBy
	 * @model opposite="usedBy" required="true"
	 * @generated
	 */
	UsableExpression getSourcePipe();

	/**
	 * Sets the value of the '{@link calculusv2.PipeSuper#getSourcePipe <em>Source Pipe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Pipe</em>' reference.
	 * @see #getSourcePipe()
	 * @generated
	 */
	void setSourcePipe(UsableExpression value);

} // PipeSuper
