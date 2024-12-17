/**
 */
package calculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calculus.Constante#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see calculus.CalculusPackage#getConstante()
 * @model
 * @generated
 */
public interface Constante extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see calculus.CalculusPackage#getConstante_Value()
	 * @model required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link calculus.Constante#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // Constante
