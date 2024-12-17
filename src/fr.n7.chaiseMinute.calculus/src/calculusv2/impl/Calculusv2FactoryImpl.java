/**
 */
package calculusv2.impl;

import calculusv2.*;

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
public class Calculusv2FactoryImpl extends EFactoryImpl implements Calculusv2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Calculusv2Factory init() {
		try {
			Calculusv2Factory theCalculusv2Factory = (Calculusv2Factory)EPackage.Registry.INSTANCE.getEFactory(Calculusv2Package.eNS_URI);
			if (theCalculusv2Factory != null) {
				return theCalculusv2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Calculusv2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calculusv2FactoryImpl() {
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
			case Calculusv2Package.CALCULUS: return createCalculus();
			case Calculusv2Package.INPUT_ARGS: return createInputArgs();
			case Calculusv2Package.SUM: return createSum();
			case Calculusv2Package.PRODUCTS: return createProducts();
			case Calculusv2Package.SUBSTRACTION: return createSubstraction();
			case Calculusv2Package.DIVISION: return createDivision();
			case Calculusv2Package.CONSTANTE: return createConstante();
			case Calculusv2Package.RESULT: return createResult();
			case Calculusv2Package.PIPE: return createPipe();
			case Calculusv2Package.PIPE_FINAL: return createPipeFinal();
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
	public Calculus createCalculus() {
		CalculusImpl calculus = new CalculusImpl();
		return calculus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputArgs createInputArgs() {
		InputArgsImpl inputArgs = new InputArgsImpl();
		return inputArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sum createSum() {
		SumImpl sum = new SumImpl();
		return sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Products createProducts() {
		ProductsImpl products = new ProductsImpl();
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Substraction createSubstraction() {
		SubstractionImpl substraction = new SubstractionImpl();
		return substraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constante createConstante() {
		ConstanteImpl constante = new ConstanteImpl();
		return constante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Result createResult() {
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipe createPipe() {
		PipeImpl pipe = new PipeImpl();
		return pipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PipeFinal createPipeFinal() {
		PipeFinalImpl pipeFinal = new PipeFinalImpl();
		return pipeFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Calculusv2Package getCalculusv2Package() {
		return (Calculusv2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Calculusv2Package getPackage() {
		return Calculusv2Package.eINSTANCE;
	}

} //Calculusv2FactoryImpl
