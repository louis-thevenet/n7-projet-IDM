/**
 */
package calculusv2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculus Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.CalculusElement#getCalculus <em>Calculus</em>}</li>
 *   <li>{@link calculusv2.CalculusElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see calculusv2.Calculusv2Package#getCalculusElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CalculusElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Calculus</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link calculusv2.Calculus#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculus</em>' container reference.
	 * @see #setCalculus(Calculus)
	 * @see calculusv2.Calculusv2Package#getCalculusElement_Calculus()
	 * @see calculusv2.Calculus#getElements
	 * @model opposite="elements" required="true" transient="false"
	 * @generated
	 */
	Calculus getCalculus();

	/**
	 * Sets the value of the '{@link calculusv2.CalculusElement#getCalculus <em>Calculus</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculus</em>' container reference.
	 * @see #getCalculus()
	 * @generated
	 */
	void setCalculus(Calculus value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see calculusv2.Calculusv2Package#getCalculusElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link calculusv2.CalculusElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CalculusElement
