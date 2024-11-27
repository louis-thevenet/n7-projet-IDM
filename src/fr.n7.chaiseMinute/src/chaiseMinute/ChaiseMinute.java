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

} // ChaiseMinute
