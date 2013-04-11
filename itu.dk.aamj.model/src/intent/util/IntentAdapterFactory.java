/**
 */
package intent.util;

import intent.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see intent.IntentPackage
 * @generated
 */
public class IntentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentSwitch<Adapter> modelSwitch =
		new IntentSwitch<Adapter>() {
			@Override
			public Adapter caseIntent(Intent object) {
				return createIntentAdapter();
			}
			@Override
			public Adapter caseBundle(Bundle object) {
				return createBundleAdapter();
			}
			@Override
			public Adapter caseExplicitIntent(ExplicitIntent object) {
				return createExplicitIntentAdapter();
			}
			@Override
			public Adapter caseImplicitIntent(ImplicitIntent object) {
				return createImplicitIntentAdapter();
			}
			@Override
			public Adapter caseDoubleExtra(DoubleExtra object) {
				return createDoubleExtraAdapter();
			}
			@Override
			public Adapter caseIntExtra(IntExtra object) {
				return createIntExtraAdapter();
			}
			@Override
			public Adapter caseCharSequenceExtra(CharSequenceExtra object) {
				return createCharSequenceExtraAdapter();
			}
			@Override
			public Adapter caseCharExtra(CharExtra object) {
				return createCharExtraAdapter();
			}
			@Override
			public Adapter caseBundleExtra(BundleExtra object) {
				return createBundleExtraAdapter();
			}
			@Override
			public Adapter caseParceableExtra(ParceableExtra object) {
				return createParceableExtraAdapter();
			}
			@Override
			public Adapter caseSerializableExtra(SerializableExtra object) {
				return createSerializableExtraAdapter();
			}
			@Override
			public Adapter caseFloatExtra(FloatExtra object) {
				return createFloatExtraAdapter();
			}
			@Override
			public Adapter caseByteExtra(ByteExtra object) {
				return createByteExtraAdapter();
			}
			@Override
			public Adapter caseLongExtra(LongExtra object) {
				return createLongExtraAdapter();
			}
			@Override
			public Adapter caseStringExtra(StringExtra object) {
				return createStringExtraAdapter();
			}
			@Override
			public Adapter caseCallback(Callback object) {
				return createCallbackAdapter();
			}
			@Override
			public Adapter casePermissions(Permissions object) {
				return createPermissionsAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link intent.Intent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.Intent
	 * @generated
	 */
	public Adapter createIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.Bundle
	 * @generated
	 */
	public Adapter createBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.ExplicitIntent <em>Explicit Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.ExplicitIntent
	 * @generated
	 */
	public Adapter createExplicitIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.ImplicitIntent <em>Implicit Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.ImplicitIntent
	 * @generated
	 */
	public Adapter createImplicitIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.DoubleExtra <em>Double Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.DoubleExtra
	 * @generated
	 */
	public Adapter createDoubleExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.IntExtra <em>Int Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.IntExtra
	 * @generated
	 */
	public Adapter createIntExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.CharSequenceExtra <em>Char Sequence Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.CharSequenceExtra
	 * @generated
	 */
	public Adapter createCharSequenceExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.CharExtra <em>Char Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.CharExtra
	 * @generated
	 */
	public Adapter createCharExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.BundleExtra <em>Bundle Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.BundleExtra
	 * @generated
	 */
	public Adapter createBundleExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.ParceableExtra <em>Parceable Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.ParceableExtra
	 * @generated
	 */
	public Adapter createParceableExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.SerializableExtra <em>Serializable Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.SerializableExtra
	 * @generated
	 */
	public Adapter createSerializableExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.FloatExtra <em>Float Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.FloatExtra
	 * @generated
	 */
	public Adapter createFloatExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.ByteExtra <em>Byte Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.ByteExtra
	 * @generated
	 */
	public Adapter createByteExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.LongExtra <em>Long Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.LongExtra
	 * @generated
	 */
	public Adapter createLongExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.StringExtra <em>String Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.StringExtra
	 * @generated
	 */
	public Adapter createStringExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.Callback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.Callback
	 * @generated
	 */
	public Adapter createCallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.Permissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.Permissions
	 * @generated
	 */
	public Adapter createPermissionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intent.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intent.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IntentAdapterFactory
