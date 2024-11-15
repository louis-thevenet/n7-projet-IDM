/**
 */
package chaiseMinute;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chaise Minute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chaiseMinute.ChaiseMinute#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see chaiseMinute.ChaiseMinutePackage#getChaiseMinute()
 * @model
 * @generated
 */
public interface ChaiseMinute extends EObject {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' reference.
	 * @see #setTables(Table)
	 * @see chaiseMinute.ChaiseMinutePackage#getChaiseMinute_Tables()
	 * @model
	 * @generated
	 */
	Table getTables();

	/**
	 * Sets the value of the '{@link chaiseMinute.ChaiseMinute#getTables <em>Tables</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tables</em>' reference.
	 * @see #getTables()
	 * @generated
	 */
	void setTables(Table value);

} // ChaiseMinute
