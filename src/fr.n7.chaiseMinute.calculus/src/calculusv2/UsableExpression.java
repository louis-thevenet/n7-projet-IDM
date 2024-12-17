/**
 */
package calculusv2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usable Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.UsableExpression#getUsedBy <em>Used By</em>}</li>
 * </ul>
 *
 * @see calculusv2.Calculusv2Package#getUsableExpression()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface UsableExpression extends CalculusElement {
	/**
	 * Returns the value of the '<em><b>Used By</b></em>' reference list.
	 * The list contents are of type {@link calculusv2.PipeSuper}.
	 * It is bidirectional and its opposite is '{@link calculusv2.PipeSuper#getSourcePipe <em>Source Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By</em>' reference list.
	 * @see calculusv2.Calculusv2Package#getUsableExpression_UsedBy()
	 * @see calculusv2.PipeSuper#getSourcePipe
	 * @model opposite="sourcePipe"
	 * @generated
	 */
	EList<PipeSuper> getUsedBy();

} // UsableExpression
