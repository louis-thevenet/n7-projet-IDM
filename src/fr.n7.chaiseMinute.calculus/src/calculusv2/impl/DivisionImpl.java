/**
 */
package calculusv2.impl;

import calculusv2.Calculus;
import calculusv2.Calculusv2Package;
import calculusv2.Division;
import calculusv2.Pipe;

import calculusv2.PipeSuper;
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
 * An implementation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.impl.DivisionImpl#getCalculus <em>Calculus</em>}</li>
 *   <li>{@link calculusv2.impl.DivisionImpl#getName <em>Name</em>}</li>
 *   <li>{@link calculusv2.impl.DivisionImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link calculusv2.impl.DivisionImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link calculusv2.impl.DivisionImpl#getBeforeSecond <em>Before Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DivisionImpl extends MinimalEObjectImpl.Container implements Division {
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
	protected EList<PipeSuper> usedBy;

	/**
	 * The cached value of the '{@link #getBefore() <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefore()
	 * @generated
	 * @ordered
	 */
	protected Pipe before;

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
	protected DivisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Calculusv2Package.Literals.DIVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Calculus getCalculus() {
		if (eContainerFeatureID() != Calculusv2Package.DIVISION__CALCULUS) return null;
		return (Calculus)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculus(Calculus newCalculus, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCalculus, Calculusv2Package.DIVISION__CALCULUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalculus(Calculus newCalculus) {
		if (newCalculus != eInternalContainer() || (eContainerFeatureID() != Calculusv2Package.DIVISION__CALCULUS && newCalculus != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.DIVISION__CALCULUS, newCalculus, newCalculus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.DIVISION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PipeSuper> getUsedBy() {
		if (usedBy == null) {
			usedBy = new EObjectWithInverseResolvingEList<PipeSuper>(PipeSuper.class, this, Calculusv2Package.DIVISION__USED_BY, Calculusv2Package.PIPE_SUPER__SOURCE_PIPE);
		}
		return usedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipe getBefore() {
		if (before != null && before.eIsProxy()) {
			InternalEObject oldBefore = (InternalEObject)before;
			before = (Pipe)eResolveProxy(oldBefore);
			if (before != oldBefore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Calculusv2Package.DIVISION__BEFORE, oldBefore, before));
			}
		}
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pipe basicGetBefore() {
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefore(Pipe newBefore, NotificationChain msgs) {
		Pipe oldBefore = before;
		before = newBefore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Calculusv2Package.DIVISION__BEFORE, oldBefore, newBefore);
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
	public void setBefore(Pipe newBefore) {
		if (newBefore != before) {
			NotificationChain msgs = null;
			if (before != null)
				msgs = ((InternalEObject)before).eInverseRemove(this, Calculusv2Package.PIPE__TARGET_PIPE, Pipe.class, msgs);
			if (newBefore != null)
				msgs = ((InternalEObject)newBefore).eInverseAdd(this, Calculusv2Package.PIPE__TARGET_PIPE, Pipe.class, msgs);
			msgs = basicSetBefore(newBefore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.DIVISION__BEFORE, newBefore, newBefore));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Calculusv2Package.DIVISION__BEFORE_SECOND, oldBeforeSecond, beforeSecond));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.DIVISION__BEFORE_SECOND, oldBeforeSecond, beforeSecond));
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
			case Calculusv2Package.DIVISION__CALCULUS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCalculus((Calculus)otherEnd, msgs);
			case Calculusv2Package.DIVISION__USED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedBy()).basicAdd(otherEnd, msgs);
			case Calculusv2Package.DIVISION__BEFORE:
				if (before != null)
					msgs = ((InternalEObject)before).eInverseRemove(this, Calculusv2Package.PIPE__TARGET_PIPE, Pipe.class, msgs);
				return basicSetBefore((Pipe)otherEnd, msgs);
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
			case Calculusv2Package.DIVISION__CALCULUS:
				return basicSetCalculus(null, msgs);
			case Calculusv2Package.DIVISION__USED_BY:
				return ((InternalEList<?>)getUsedBy()).basicRemove(otherEnd, msgs);
			case Calculusv2Package.DIVISION__BEFORE:
				return basicSetBefore(null, msgs);
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
			case Calculusv2Package.DIVISION__CALCULUS:
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
			case Calculusv2Package.DIVISION__CALCULUS:
				return getCalculus();
			case Calculusv2Package.DIVISION__NAME:
				return getName();
			case Calculusv2Package.DIVISION__USED_BY:
				return getUsedBy();
			case Calculusv2Package.DIVISION__BEFORE:
				if (resolve) return getBefore();
				return basicGetBefore();
			case Calculusv2Package.DIVISION__BEFORE_SECOND:
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
			case Calculusv2Package.DIVISION__CALCULUS:
				setCalculus((Calculus)newValue);
				return;
			case Calculusv2Package.DIVISION__NAME:
				setName((String)newValue);
				return;
			case Calculusv2Package.DIVISION__USED_BY:
				getUsedBy().clear();
				getUsedBy().addAll((Collection<? extends PipeSuper>)newValue);
				return;
			case Calculusv2Package.DIVISION__BEFORE:
				setBefore((Pipe)newValue);
				return;
			case Calculusv2Package.DIVISION__BEFORE_SECOND:
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
			case Calculusv2Package.DIVISION__CALCULUS:
				setCalculus((Calculus)null);
				return;
			case Calculusv2Package.DIVISION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Calculusv2Package.DIVISION__USED_BY:
				getUsedBy().clear();
				return;
			case Calculusv2Package.DIVISION__BEFORE:
				setBefore((Pipe)null);
				return;
			case Calculusv2Package.DIVISION__BEFORE_SECOND:
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
			case Calculusv2Package.DIVISION__CALCULUS:
				return getCalculus() != null;
			case Calculusv2Package.DIVISION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Calculusv2Package.DIVISION__USED_BY:
				return usedBy != null && !usedBy.isEmpty();
			case Calculusv2Package.DIVISION__BEFORE:
				return before != null;
			case Calculusv2Package.DIVISION__BEFORE_SECOND:
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

} //DivisionImpl
