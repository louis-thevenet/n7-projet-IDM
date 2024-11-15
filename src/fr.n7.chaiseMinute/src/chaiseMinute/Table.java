/**
 */
package chaiseMinute;

import Column.Column;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chaiseMinute.Table#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see chaiseMinute.ChaiseMinutePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link Column.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see chaiseMinute.ChaiseMinutePackage#getTable_Columns()
	 * @model
	 * @generated
	 */
	EList<Column> getColumns();

} // Table
