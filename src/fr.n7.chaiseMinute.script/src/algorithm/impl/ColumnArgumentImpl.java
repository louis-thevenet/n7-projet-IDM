/**
 */
package algorithm.impl;

import algorithm.AlgorithmPackage;
import algorithm.ColumnArgument;

import algorithm.Function;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithm.impl.ColumnArgumentImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link algorithm.impl.ColumnArgumentImpl#getColumnPath <em>Column Path</em>}</li>
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
		return AlgorithmPackage.Literals.COLUMN_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getUsedBy() {
		if (eContainerFeatureID() != AlgorithmPackage.COLUMN_ARGUMENT__USED_BY) return null;
		return (Function)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedBy(Function newUsedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUsedBy, AlgorithmPackage.COLUMN_ARGUMENT__USED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedBy(Function newUsedBy) {
		if (newUsedBy != eInternalContainer() || (eContainerFeatureID() != AlgorithmPackage.COLUMN_ARGUMENT__USED_BY && newUsedBy != null)) {
			if (EcoreUtil.isAncestor(this, newUsedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUsedBy != null)
				msgs = ((InternalEObject)newUsedBy).eInverseAdd(this, AlgorithmPackage.FUNCTION__INPUT, Function.class, msgs);
			msgs = basicSetUsedBy(newUsedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmPackage.COLUMN_ARGUMENT__USED_BY, newUsedBy, newUsedBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmPackage.COLUMN_ARGUMENT__COLUMN_PATH, oldColumnPath, columnPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmPackage.COLUMN_ARGUMENT__USED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUsedBy((Function)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmPackage.COLUMN_ARGUMENT__USED_BY:
				return basicSetUsedBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AlgorithmPackage.COLUMN_ARGUMENT__USED_BY:
				return eInternalContainer().eInverseRemove(this, AlgorithmPackage.FUNCTION__INPUT, Function.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmPackage.COLUMN_ARGUMENT__USED_BY:
				return getUsedBy();
			case AlgorithmPackage.COLUMN_ARGUMENT__COLUMN_PATH:
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
			case AlgorithmPackage.COLUMN_ARGUMENT__USED_BY:
				setUsedBy((Function)newValue);
				return;
			case AlgorithmPackage.COLUMN_ARGUMENT__COLUMN_PATH:
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
			case AlgorithmPackage.COLUMN_ARGUMENT__USED_BY:
				setUsedBy((Function)null);
				return;
			case AlgorithmPackage.COLUMN_ARGUMENT__COLUMN_PATH:
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
			case AlgorithmPackage.COLUMN_ARGUMENT__USED_BY:
				return getUsedBy() != null;
			case AlgorithmPackage.COLUMN_ARGUMENT__COLUMN_PATH:
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
