/**
 */
package function.impl;

import function.ColumnArgument;
import function.FunctionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link function.impl.ColumnArgumentImpl#getColumnPath <em>Column Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnArgumentImpl extends MinimalEObjectImpl.Container implements ColumnArgument {
	/**
	 * The default value of the '{@link #getColumnPath() <em>Column Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnPath()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnPath() <em>Column Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnPath()
	 * @generated
	 * @ordered
	 */
	protected String columnPath = COLUMN_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionPackage.Literals.COLUMN_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColumnPath() {
		return columnPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnPath(String newColumnPath) {
		String oldColumnPath = columnPath;
		columnPath = newColumnPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.COLUMN_ARGUMENT__COLUMN_PATH, oldColumnPath, columnPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionPackage.COLUMN_ARGUMENT__COLUMN_PATH:
				return getColumnPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FunctionPackage.COLUMN_ARGUMENT__COLUMN_PATH:
				setColumnPath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FunctionPackage.COLUMN_ARGUMENT__COLUMN_PATH:
				setColumnPath(COLUMN_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FunctionPackage.COLUMN_ARGUMENT__COLUMN_PATH:
				return COLUMN_PATH_EDEFAULT == null ? columnPath != null : !COLUMN_PATH_EDEFAULT.equals(columnPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (columnPath: ");
		result.append(columnPath);
		result.append(')');
		return result.toString();
	}

} //ColumnArgumentImpl
