/**
 */
package chaiseMinute;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chaiseMinute.Column#getId <em>Id</em>}</li>
 *   <li>{@link chaiseMinute.Column#getTable <em>Table</em>}</li>
 *   <li>{@link chaiseMinute.Column#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see chaiseMinute.ChaiseMinutePackage#getColumn()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"id"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see chaiseMinute.ChaiseMinutePackage#getColumn_Id()
	 * @model default="id" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link chaiseMinute.Column#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link chaiseMinute.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see chaiseMinute.ChaiseMinutePackage#getColumn_Table()
	 * @see chaiseMinute.Table#getColumns
	 * @model opposite="columns" required="true" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link chaiseMinute.Column#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link chaiseMinute.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see chaiseMinute.DataType
	 * @see #setType(DataType)
	 * @see chaiseMinute.ChaiseMinutePackage#getColumn_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link chaiseMinute.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see chaiseMinute.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // Column
