/**
 */
package calculusv2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.FinalExpression#getBefore <em>Before</em>}</li>
 * </ul>
 *
 * @see calculusv2.Calculusv2Package#getFinalExpression()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FinalExpression extends CalculusElement {

	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link calculusv2.PipeFinal#getTargetPipeFinal <em>Target Pipe Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(PipeFinal)
	 * @see calculusv2.Calculusv2Package#getFinalExpression_Before()
	 * @see calculusv2.PipeFinal#getTargetPipeFinal
	 * @model opposite="targetPipeFinal" required="true"
	 * @generated
	 */
	PipeFinal getBefore();

	/**
	 * Sets the value of the '{@link calculusv2.FinalExpression#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(PipeFinal value);
} // FinalExpression
