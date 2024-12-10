/**
 */
package chaiseMinute;

import algorithm.Algorithm;
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
 *   <li>{@link chaiseMinute.Table#getChaiseMinute <em>Chaise Minute</em>}</li>
 *   <li>{@link chaiseMinute.Table#getName <em>Name</em>}</li>
 *   <li>{@link chaiseMinute.Table#getIndexColumn <em>Index Column</em>}</li>
 *   <li>{@link chaiseMinute.Table#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see chaiseMinute.ChaiseMinutePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link chaiseMinute.Column}.
	 * It is bidirectional and its opposite is '{@link chaiseMinute.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see chaiseMinute.ChaiseMinutePackage#getTable_Columns()
	 * @see chaiseMinute.Column#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Chaise Minute</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link chaiseMinute.ChaiseMinute#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chaise Minute</em>' container reference.
	 * @see #setChaiseMinute(ChaiseMinute)
	 * @see chaiseMinute.ChaiseMinutePackage#getTable_ChaiseMinute()
	 * @see chaiseMinute.ChaiseMinute#getTables
	 * @model opposite="tables" required="true" transient="false"
	 * @generated
	 */
	ChaiseMinute getChaiseMinute();

	/**
	 * Sets the value of the '{@link chaiseMinute.Table#getChaiseMinute <em>Chaise Minute</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chaise Minute</em>' container reference.
	 * @see #getChaiseMinute()
	 * @generated
	 */
	void setChaiseMinute(ChaiseMinute value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see chaiseMinute.ChaiseMinutePackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chaiseMinute.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Index Column</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link chaiseMinute.IndexColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Column</em>' containment reference.
	 * @see #setIndexColumn(IndexColumn)
	 * @see chaiseMinute.ChaiseMinutePackage#getTable_IndexColumn()
	 * @see chaiseMinute.IndexColumn#getTable
	 * @model opposite="table" containment="true" required="true"
	 * @generated
	 */
	IndexColumn getIndexColumn();

	/**
	 * Sets the value of the '{@link chaiseMinute.Table#getIndexColumn <em>Index Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Column</em>' containment reference.
	 * @see #getIndexColumn()
	 * @generated
	 */
	void setIndexColumn(IndexColumn value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link algorithm.Algorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see chaiseMinute.ChaiseMinutePackage#getTable_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Algorithm> getConstraints();

} // Table
