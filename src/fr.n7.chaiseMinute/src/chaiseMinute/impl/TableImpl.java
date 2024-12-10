/**
 */
package chaiseMinute.impl;

import algorithm.Algorithm;
import chaiseMinute.ChaiseMinute;
import chaiseMinute.ChaiseMinutePackage;
import chaiseMinute.Column;
import chaiseMinute.IndexColumn;
import chaiseMinute.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chaiseMinute.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link chaiseMinute.impl.TableImpl#getChaiseMinute <em>Chaise Minute</em>}</li>
 *   <li>{@link chaiseMinute.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link chaiseMinute.impl.TableImpl#getIndexColumn <em>Index Column</em>}</li>
 *   <li>{@link chaiseMinute.impl.TableImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIndexColumn() <em>Index Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexColumn()
	 * @generated
	 * @ordered
	 */
	protected IndexColumn indexColumn;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Algorithm> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChaiseMinutePackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentWithInverseEList<Column>(Column.class, this, ChaiseMinutePackage.TABLE__COLUMNS, ChaiseMinutePackage.COLUMN__TABLE);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChaiseMinute getChaiseMinute() {
		if (eContainerFeatureID() != ChaiseMinutePackage.TABLE__CHAISE_MINUTE) return null;
		return (ChaiseMinute)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChaiseMinute(ChaiseMinute newChaiseMinute, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newChaiseMinute, ChaiseMinutePackage.TABLE__CHAISE_MINUTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChaiseMinute(ChaiseMinute newChaiseMinute) {
		if (newChaiseMinute != eInternalContainer() || (eContainerFeatureID() != ChaiseMinutePackage.TABLE__CHAISE_MINUTE && newChaiseMinute != null)) {
			if (EcoreUtil.isAncestor(this, newChaiseMinute))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newChaiseMinute != null)
				msgs = ((InternalEObject)newChaiseMinute).eInverseAdd(this, ChaiseMinutePackage.CHAISE_MINUTE__TABLES, ChaiseMinute.class, msgs);
			msgs = basicSetChaiseMinute(newChaiseMinute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChaiseMinutePackage.TABLE__CHAISE_MINUTE, newChaiseMinute, newChaiseMinute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChaiseMinutePackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexColumn getIndexColumn() {
		return indexColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexColumn(IndexColumn newIndexColumn, NotificationChain msgs) {
		IndexColumn oldIndexColumn = indexColumn;
		indexColumn = newIndexColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChaiseMinutePackage.TABLE__INDEX_COLUMN, oldIndexColumn, newIndexColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndexColumn(IndexColumn newIndexColumn) {
		if (newIndexColumn != indexColumn) {
			NotificationChain msgs = null;
			if (indexColumn != null)
				msgs = ((InternalEObject)indexColumn).eInverseRemove(this, ChaiseMinutePackage.INDEX_COLUMN__TABLE, IndexColumn.class, msgs);
			if (newIndexColumn != null)
				msgs = ((InternalEObject)newIndexColumn).eInverseAdd(this, ChaiseMinutePackage.INDEX_COLUMN__TABLE, IndexColumn.class, msgs);
			msgs = basicSetIndexColumn(newIndexColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChaiseMinutePackage.TABLE__INDEX_COLUMN, newIndexColumn, newIndexColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Algorithm> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Algorithm>(Algorithm.class, this, ChaiseMinutePackage.TABLE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChaiseMinutePackage.TABLE__COLUMNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumns()).basicAdd(otherEnd, msgs);
			case ChaiseMinutePackage.TABLE__CHAISE_MINUTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetChaiseMinute((ChaiseMinute)otherEnd, msgs);
			case ChaiseMinutePackage.TABLE__INDEX_COLUMN:
				if (indexColumn != null)
					msgs = ((InternalEObject)indexColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChaiseMinutePackage.TABLE__INDEX_COLUMN, null, msgs);
				return basicSetIndexColumn((IndexColumn)otherEnd, msgs);
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
			case ChaiseMinutePackage.TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case ChaiseMinutePackage.TABLE__CHAISE_MINUTE:
				return basicSetChaiseMinute(null, msgs);
			case ChaiseMinutePackage.TABLE__INDEX_COLUMN:
				return basicSetIndexColumn(null, msgs);
			case ChaiseMinutePackage.TABLE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case ChaiseMinutePackage.TABLE__CHAISE_MINUTE:
				return eInternalContainer().eInverseRemove(this, ChaiseMinutePackage.CHAISE_MINUTE__TABLES, ChaiseMinute.class, msgs);
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
			case ChaiseMinutePackage.TABLE__COLUMNS:
				return getColumns();
			case ChaiseMinutePackage.TABLE__CHAISE_MINUTE:
				return getChaiseMinute();
			case ChaiseMinutePackage.TABLE__NAME:
				return getName();
			case ChaiseMinutePackage.TABLE__INDEX_COLUMN:
				return getIndexColumn();
			case ChaiseMinutePackage.TABLE__CONSTRAINTS:
				return getConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChaiseMinutePackage.TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case ChaiseMinutePackage.TABLE__CHAISE_MINUTE:
				setChaiseMinute((ChaiseMinute)newValue);
				return;
			case ChaiseMinutePackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case ChaiseMinutePackage.TABLE__INDEX_COLUMN:
				setIndexColumn((IndexColumn)newValue);
				return;
			case ChaiseMinutePackage.TABLE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Algorithm>)newValue);
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
			case ChaiseMinutePackage.TABLE__COLUMNS:
				getColumns().clear();
				return;
			case ChaiseMinutePackage.TABLE__CHAISE_MINUTE:
				setChaiseMinute((ChaiseMinute)null);
				return;
			case ChaiseMinutePackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChaiseMinutePackage.TABLE__INDEX_COLUMN:
				setIndexColumn((IndexColumn)null);
				return;
			case ChaiseMinutePackage.TABLE__CONSTRAINTS:
				getConstraints().clear();
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
			case ChaiseMinutePackage.TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case ChaiseMinutePackage.TABLE__CHAISE_MINUTE:
				return getChaiseMinute() != null;
			case ChaiseMinutePackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChaiseMinutePackage.TABLE__INDEX_COLUMN:
				return indexColumn != null;
			case ChaiseMinutePackage.TABLE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TableImpl
