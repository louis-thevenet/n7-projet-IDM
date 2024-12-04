/**
 */
package chaiseMinute;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link chaiseMinute.ChaiseMinute#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see chaiseMinute.ChaiseMinutePackage#getChaiseMinute()
 * @model
 * @generated
 */
public interface ChaiseMinute extends EObject {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link chaiseMinute.Table}.
	 * It is bidirectional and its opposite is '{@link chaiseMinute.Table#getChaiseMinute <em>Chaise Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see chaiseMinute.ChaiseMinutePackage#getChaiseMinute_Tables()
	 * @see chaiseMinute.Table#getChaiseMinute
	 * @model opposite="chaiseMinute" containment="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see chaiseMinute.ChaiseMinutePackage#getChaiseMinute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chaiseMinute.ChaiseMinute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ChaiseMinute
