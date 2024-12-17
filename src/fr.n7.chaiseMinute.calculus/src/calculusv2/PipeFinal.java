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
 *   <li>{@link calculusv2.PipeFinal#getTargetPipeFinal <em>Target Pipe Final</em>}</li>
 * </ul>
 *
 * @see calculusv2.Calculusv2Package#getPipeFinal()
 * @model
 * @generated
 */
public interface PipeFinal extends PipeSuper {
	/**
	 * Returns the value of the '<em><b>Target Pipe Final</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link calculusv2.FinalExpression#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Pipe Final</em>' reference.
	 * @see #setTargetPipeFinal(FinalExpression)
	 * @see calculusv2.Calculusv2Package#getPipeFinal_TargetPipeFinal()
	 * @see calculusv2.FinalExpression#getBefore
	 * @model opposite="before" required="true"
	 * @generated
	 */
	FinalExpression getTargetPipeFinal();

	/**
	 * Sets the value of the '{@link calculusv2.PipeFinal#getTargetPipeFinal <em>Target Pipe Final</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Pipe Final</em>' reference.
	 * @see #getTargetPipeFinal()
	 * @generated
	 */
	void setTargetPipeFinal(FinalExpression value);

} // PipeFinal
