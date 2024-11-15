/**
 */
package chaiseMinute.impl;

import chaiseMinute.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChaiseMinuteFactoryImpl extends EFactoryImpl implements ChaiseMinuteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChaiseMinuteFactory init() {
		try {
			ChaiseMinuteFactory theChaiseMinuteFactory = (ChaiseMinuteFactory)EPackage.Registry.INSTANCE.getEFactory(ChaiseMinutePackage.eNS_URI);
			if (theChaiseMinuteFactory != null) {
				return theChaiseMinuteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChaiseMinuteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChaiseMinuteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ChaiseMinutePackage.CHAISE_MINUTE: return createChaiseMinute();
			case ChaiseMinutePackage.TABLE: return createTable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChaiseMinute createChaiseMinute() {
		ChaiseMinuteImpl chaiseMinute = new ChaiseMinuteImpl();
		return chaiseMinute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChaiseMinutePackage getChaiseMinutePackage() {
		return (ChaiseMinutePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChaiseMinutePackage getPackage() {
		return ChaiseMinutePackage.eINSTANCE;
	}

} //ChaiseMinuteFactoryImpl
