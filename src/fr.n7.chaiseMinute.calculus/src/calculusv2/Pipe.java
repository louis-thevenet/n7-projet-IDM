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
 *   <li>{@link calculusv2.Pipe#getTargetPipe <em>Target Pipe</em>}</li>
 * </ul>
 *
 * @see calculusv2.Calculusv2Package#getPipe()
 * @model
 * @generated
 */
public interface Pipe extends PipeSuper {
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
