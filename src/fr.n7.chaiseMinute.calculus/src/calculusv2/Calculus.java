/**
 */
package calculusv2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.Calculus#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see calculusv2.Calculusv2Package#getCalculus()
 * @model
 * @generated
 */
public interface Calculus extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link calculusv2.CalculusElement}.
	 * It is bidirectional and its opposite is '{@link calculusv2.CalculusElement#getCalculus <em>Calculus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see calculusv2.Calculusv2Package#getCalculus_Elements()
	 * @see calculusv2.CalculusElement#getCalculus
	 * @model opposite="calculus" containment="true"
	 * @generated
	 */
	EList<CalculusElement> getElements();

} // Calculus
