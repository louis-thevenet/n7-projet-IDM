/**
 */
package chaiseMinute;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chaiseMinute.IndexColumn#getId <em>Id</em>}</li>
 *   <li>{@link chaiseMinute.IndexColumn#getTable <em>Table</em>}</li>
 *   <li>{@link chaiseMinute.IndexColumn#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see chaiseMinute.ChaiseMinutePackage#getIndexColumn()
 * @model
 * @generated
 */
public interface IndexColumn extends EObject {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"id"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see chaiseMinute.ChaiseMinutePackage#getIndexColumn_Id()
	 * @model default="id" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link chaiseMinute.IndexColumn#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link chaiseMinute.Table#getIndexColumn <em>Index Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see chaiseMinute.ChaiseMinutePackage#getIndexColumn_Table()
	 * @see chaiseMinute.Table#getIndexColumn
	 * @model opposite="indexColumn" required="true" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link chaiseMinute.IndexColumn#getTable <em>Table</em>}' container reference.
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
	 * @see chaiseMinute.ChaiseMinutePackage#getIndexColumn_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link chaiseMinute.IndexColumn#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see chaiseMinute.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);
} // IndexColumn
