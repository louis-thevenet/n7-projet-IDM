/**
 */
package calculusv2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.Constante#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see calculusv2.Calculusv2Package#getConstante()
 * @model
 * @generated
 */
public interface Constante extends UsableExpression {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see calculusv2.Calculusv2Package#getConstante_Value()
	 * @model required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link calculusv2.Constante#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);
} // Constante
