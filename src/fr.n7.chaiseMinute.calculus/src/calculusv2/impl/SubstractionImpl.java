/**
 */
package calculusv2.impl;

import calculusv2.Calculus;
import calculusv2.Calculusv2Package;
import calculusv2.Pipe;
import calculusv2.Substraction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.impl.SubstractionImpl#getCalculus <em>Calculus</em>}</li>
 *   <li>{@link calculusv2.impl.SubstractionImpl#getName <em>Name</em>}</li>
 *   <li>{@link calculusv2.impl.SubstractionImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link calculusv2.impl.SubstractionImpl#getBeforeFirst <em>Before First</em>}</li>
 *   <li>{@link calculusv2.impl.SubstractionImpl#getBeforeSecond <em>Before Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstractionImpl extends MinimalEObjectImpl.Container implements Substraction {
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
	 * The cached value of the '{@link #getUsedBy() <em>Used By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Pipe> usedBy;

	/**
	 * The cached value of the '{@link #getBeforeFirst() <em>Before First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeFirst()
	 * @generated
	 * @ordered
	 */
	protected Pipe beforeFirst;

	/**
	 * The cached value of the '{@link #getBeforeSecond() <em>Before Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeSecond()
	 * @generated
	 * @ordered
	 */
	protected Pipe beforeSecond;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Calculusv2Package.Literals.SUBSTRACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Calculus getCalculus() {
		if (eContainerFeatureID() != Calculusv2Package.SUBSTRACTION__CALCULUS) return null;
		return (Calculus)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculus(Calculus newCalculus, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCalculus, Calculusv2Package.SUBSTRACTION__CALCULUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalculus(Calculus newCalculus) {
		if (newCalculus != eInternalContainer() || (eContainerFeatureID() != Calculusv2Package.SUBSTRACTION__CALCULUS && newCalculus != null)) {
			if (EcoreUtil.isAncestor(this, newCalculus))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCalculus != null)
				msgs = ((InternalEObject)newCalculus).eInverseAdd(this, Calculusv2Package.CALCULUS__ELEMENTS, Calculus.class, msgs);
			msgs = basicSetCalculus(newCalculus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.SUBSTRACTION__CALCULUS, newCalculus, newCalculus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.SUBSTRACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pipe> getUsedBy() {
		if (usedBy == null) {
			usedBy = new EObjectWithInverseResolvingEList<Pipe>(Pipe.class, this, Calculusv2Package.SUBSTRACTION__USED_BY, Calculusv2Package.PIPE__SOURCE_PIPE);
		}
		return usedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipe getBeforeFirst() {
		if (beforeFirst != null && beforeFirst.eIsProxy()) {
			InternalEObject oldBeforeFirst = (InternalEObject)beforeFirst;
			beforeFirst = (Pipe)eResolveProxy(oldBeforeFirst);
			if (beforeFirst != oldBeforeFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Calculusv2Package.SUBSTRACTION__BEFORE_FIRST, oldBeforeFirst, beforeFirst));
			}
		}
		return beforeFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pipe basicGetBeforeFirst() {
		return beforeFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeforeFirst(Pipe newBeforeFirst) {
		Pipe oldBeforeFirst = beforeFirst;
		beforeFirst = newBeforeFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.SUBSTRACTION__BEFORE_FIRST, oldBeforeFirst, beforeFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipe getBeforeSecond() {
		if (beforeSecond != null && beforeSecond.eIsProxy()) {
			InternalEObject oldBeforeSecond = (InternalEObject)beforeSecond;
			beforeSecond = (Pipe)eResolveProxy(oldBeforeSecond);
			if (beforeSecond != oldBeforeSecond) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Calculusv2Package.SUBSTRACTION__BEFORE_SECOND, oldBeforeSecond, beforeSecond));
			}
		}
		return beforeSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pipe basicGetBeforeSecond() {
		return beforeSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeforeSecond(Pipe newBeforeSecond) {
		Pipe oldBeforeSecond = beforeSecond;
		beforeSecond = newBeforeSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.SUBSTRACTION__BEFORE_SECOND, oldBeforeSecond, beforeSecond));
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
			case Calculusv2Package.SUBSTRACTION__CALCULUS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCalculus((Calculus)otherEnd, msgs);
			case Calculusv2Package.SUBSTRACTION__USED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedBy()).basicAdd(otherEnd, msgs);
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
			case Calculusv2Package.SUBSTRACTION__CALCULUS:
				return basicSetCalculus(null, msgs);
			case Calculusv2Package.SUBSTRACTION__USED_BY:
				return ((InternalEList<?>)getUsedBy()).basicRemove(otherEnd, msgs);
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
			case Calculusv2Package.SUBSTRACTION__CALCULUS:
				return eInternalContainer().eInverseRemove(this, Calculusv2Package.CALCULUS__ELEMENTS, Calculus.class, msgs);
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
			case Calculusv2Package.SUBSTRACTION__CALCULUS:
				return getCalculus();
			case Calculusv2Package.SUBSTRACTION__NAME:
				return getName();
			case Calculusv2Package.SUBSTRACTION__USED_BY:
				return getUsedBy();
			case Calculusv2Package.SUBSTRACTION__BEFORE_FIRST:
				if (resolve) return getBeforeFirst();
				return basicGetBeforeFirst();
			case Calculusv2Package.SUBSTRACTION__BEFORE_SECOND:
				if (resolve) return getBeforeSecond();
				return basicGetBeforeSecond();
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
			case Calculusv2Package.SUBSTRACTION__CALCULUS:
				setCalculus((Calculus)newValue);
				return;
			case Calculusv2Package.SUBSTRACTION__NAME:
				setName((String)newValue);
				return;
			case Calculusv2Package.SUBSTRACTION__USED_BY:
				getUsedBy().clear();
				getUsedBy().addAll((Collection<? extends Pipe>)newValue);
				return;
			case Calculusv2Package.SUBSTRACTION__BEFORE_FIRST:
				setBeforeFirst((Pipe)newValue);
				return;
			case Calculusv2Package.SUBSTRACTION__BEFORE_SECOND:
				setBeforeSecond((Pipe)newValue);
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
			case Calculusv2Package.SUBSTRACTION__CALCULUS:
				setCalculus((Calculus)null);
				return;
			case Calculusv2Package.SUBSTRACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Calculusv2Package.SUBSTRACTION__USED_BY:
				getUsedBy().clear();
				return;
			case Calculusv2Package.SUBSTRACTION__BEFORE_FIRST:
				setBeforeFirst((Pipe)null);
				return;
			case Calculusv2Package.SUBSTRACTION__BEFORE_SECOND:
				setBeforeSecond((Pipe)null);
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
			case Calculusv2Package.SUBSTRACTION__CALCULUS:
				return getCalculus() != null;
			case Calculusv2Package.SUBSTRACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Calculusv2Package.SUBSTRACTION__USED_BY:
				return usedBy != null && !usedBy.isEmpty();
			case Calculusv2Package.SUBSTRACTION__BEFORE_FIRST:
				return beforeFirst != null;
			case Calculusv2Package.SUBSTRACTION__BEFORE_SECOND:
				return beforeSecond != null;
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

} //SubstractionImpl
