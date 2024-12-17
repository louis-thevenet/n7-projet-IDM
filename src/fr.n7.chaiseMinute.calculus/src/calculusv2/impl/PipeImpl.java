/**
 */
package calculusv2.impl;

import calculusv2.Calculus;
import calculusv2.Calculusv2Package;
import calculusv2.Operation;
import calculusv2.Pipe;
import calculusv2.UsableExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.impl.PipeImpl#getCalculus <em>Calculus</em>}</li>
 *   <li>{@link calculusv2.impl.PipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link calculusv2.impl.PipeImpl#getSourcePipe <em>Source Pipe</em>}</li>
 *   <li>{@link calculusv2.impl.PipeImpl#getTargetPipe <em>Target Pipe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipeImpl extends MinimalEObjectImpl.Container implements Pipe {
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
	 * The cached value of the '{@link #getSourcePipe() <em>Source Pipe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePipe()
	 * @generated
	 * @ordered
	 */
	protected UsableExpression sourcePipe;

	/**
	 * The cached value of the '{@link #getTargetPipe() <em>Target Pipe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPipe()
	 * @generated
	 * @ordered
	 */
	protected Operation targetPipe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Calculusv2Package.Literals.PIPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Calculus getCalculus() {
		if (eContainerFeatureID() != Calculusv2Package.PIPE__CALCULUS) return null;
		return (Calculus)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculus(Calculus newCalculus, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCalculus, Calculusv2Package.PIPE__CALCULUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalculus(Calculus newCalculus) {
		if (newCalculus != eInternalContainer() || (eContainerFeatureID() != Calculusv2Package.PIPE__CALCULUS && newCalculus != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.PIPE__CALCULUS, newCalculus, newCalculus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.PIPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsableExpression getSourcePipe() {
		if (sourcePipe != null && sourcePipe.eIsProxy()) {
			InternalEObject oldSourcePipe = (InternalEObject)sourcePipe;
			sourcePipe = (UsableExpression)eResolveProxy(oldSourcePipe);
			if (sourcePipe != oldSourcePipe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Calculusv2Package.PIPE__SOURCE_PIPE, oldSourcePipe, sourcePipe));
			}
		}
		return sourcePipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsableExpression basicGetSourcePipe() {
		return sourcePipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourcePipe(UsableExpression newSourcePipe, NotificationChain msgs) {
		UsableExpression oldSourcePipe = sourcePipe;
		sourcePipe = newSourcePipe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Calculusv2Package.PIPE__SOURCE_PIPE, oldSourcePipe, newSourcePipe);
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
	public void setSourcePipe(UsableExpression newSourcePipe) {
		if (newSourcePipe != sourcePipe) {
			NotificationChain msgs = null;
			if (sourcePipe != null)
				msgs = ((InternalEObject)sourcePipe).eInverseRemove(this, Calculusv2Package.USABLE_EXPRESSION__USED_BY, UsableExpression.class, msgs);
			if (newSourcePipe != null)
				msgs = ((InternalEObject)newSourcePipe).eInverseAdd(this, Calculusv2Package.USABLE_EXPRESSION__USED_BY, UsableExpression.class, msgs);
			msgs = basicSetSourcePipe(newSourcePipe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.PIPE__SOURCE_PIPE, newSourcePipe, newSourcePipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getTargetPipe() {
		if (targetPipe != null && targetPipe.eIsProxy()) {
			InternalEObject oldTargetPipe = (InternalEObject)targetPipe;
			targetPipe = (Operation)eResolveProxy(oldTargetPipe);
			if (targetPipe != oldTargetPipe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Calculusv2Package.PIPE__TARGET_PIPE, oldTargetPipe, targetPipe));
			}
		}
		return targetPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetTargetPipe() {
		return targetPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPipe(Operation newTargetPipe, NotificationChain msgs) {
		Operation oldTargetPipe = targetPipe;
		targetPipe = newTargetPipe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Calculusv2Package.PIPE__TARGET_PIPE, oldTargetPipe, newTargetPipe);
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
	public void setTargetPipe(Operation newTargetPipe) {
		if (newTargetPipe != targetPipe) {
			NotificationChain msgs = null;
			if (targetPipe != null)
				msgs = ((InternalEObject)targetPipe).eInverseRemove(this, Calculusv2Package.OPERATION__BEFORE, Operation.class, msgs);
			if (newTargetPipe != null)
				msgs = ((InternalEObject)newTargetPipe).eInverseAdd(this, Calculusv2Package.OPERATION__BEFORE, Operation.class, msgs);
			msgs = basicSetTargetPipe(newTargetPipe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.PIPE__TARGET_PIPE, newTargetPipe, newTargetPipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Calculusv2Package.PIPE__CALCULUS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCalculus((Calculus)otherEnd, msgs);
			case Calculusv2Package.PIPE__SOURCE_PIPE:
				if (sourcePipe != null)
					msgs = ((InternalEObject)sourcePipe).eInverseRemove(this, Calculusv2Package.USABLE_EXPRESSION__USED_BY, UsableExpression.class, msgs);
				return basicSetSourcePipe((UsableExpression)otherEnd, msgs);
			case Calculusv2Package.PIPE__TARGET_PIPE:
				if (targetPipe != null)
					msgs = ((InternalEObject)targetPipe).eInverseRemove(this, Calculusv2Package.OPERATION__BEFORE, Operation.class, msgs);
				return basicSetTargetPipe((Operation)otherEnd, msgs);
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
			case Calculusv2Package.PIPE__CALCULUS:
				return basicSetCalculus(null, msgs);
			case Calculusv2Package.PIPE__SOURCE_PIPE:
				return basicSetSourcePipe(null, msgs);
			case Calculusv2Package.PIPE__TARGET_PIPE:
				return basicSetTargetPipe(null, msgs);
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
			case Calculusv2Package.PIPE__CALCULUS:
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
			case Calculusv2Package.PIPE__CALCULUS:
				return getCalculus();
			case Calculusv2Package.PIPE__NAME:
				return getName();
			case Calculusv2Package.PIPE__SOURCE_PIPE:
				if (resolve) return getSourcePipe();
				return basicGetSourcePipe();
			case Calculusv2Package.PIPE__TARGET_PIPE:
				if (resolve) return getTargetPipe();
				return basicGetTargetPipe();
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
			case Calculusv2Package.PIPE__CALCULUS:
				setCalculus((Calculus)newValue);
				return;
			case Calculusv2Package.PIPE__NAME:
				setName((String)newValue);
				return;
			case Calculusv2Package.PIPE__SOURCE_PIPE:
				setSourcePipe((UsableExpression)newValue);
				return;
			case Calculusv2Package.PIPE__TARGET_PIPE:
				setTargetPipe((Operation)newValue);
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
			case Calculusv2Package.PIPE__CALCULUS:
				setCalculus((Calculus)null);
				return;
			case Calculusv2Package.PIPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Calculusv2Package.PIPE__SOURCE_PIPE:
				setSourcePipe((UsableExpression)null);
				return;
			case Calculusv2Package.PIPE__TARGET_PIPE:
				setTargetPipe((Operation)null);
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
			case Calculusv2Package.PIPE__CALCULUS:
				return getCalculus() != null;
			case Calculusv2Package.PIPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Calculusv2Package.PIPE__SOURCE_PIPE:
				return sourcePipe != null;
			case Calculusv2Package.PIPE__TARGET_PIPE:
				return targetPipe != null;
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

} //PipeImpl
