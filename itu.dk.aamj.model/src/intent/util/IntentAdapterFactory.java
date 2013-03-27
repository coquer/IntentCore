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
	protected IntentSwitch modelSwitch =
		new IntentSwitch() {
			public Object caseIntent(Intent object) {
				return createIntentAdapter();
			}
			public Object caseBundle(Bundle object) {
				return createBundleAdapter();
			}
			public Object caseExplicitIntent(ExplicitIntent object) {
				return createExplicitIntentAdapter();
			}
			public Object caseImplicitIntent(ImplicitIntent object) {
				return createImplicitIntentAdapter();
			}
			public Object caseDoubleExtra(DoubleExtra object) {
				return createDoubleExtraAdapter();
			}
			public Object caseIntExtra(IntExtra object) {
				return createIntExtraAdapter();
			}
			public Object caseCharSequenceExtra(CharSequenceExtra object) {
				return createCharSequenceExtraAdapter();
			}
			public Object caseCharExtra(CharExtra object) {
				return createCharExtraAdapter();
			}
			public Object caseBundleExtra(BundleExtra object) {
				return createBundleExtraAdapter();
			}
			public Object caseParceableExtra(ParceableExtra object) {
				return createParceableExtraAdapter();
			}
			public Object caseSerializableExtra(SerializableExtra object) {
				return createSerializableExtraAdapter();
			}
			public Object caseFloatExtra(FloatExtra object) {
				return createFloatExtraAdapter();
			}
			public Object caseByteExtra(ByteExtra object) {
				return createByteExtraAdapter();
			}
			public Object caseLongExtra(LongExtra object) {
				return createLongExtraAdapter();
			}
			public Object caseStringExtra(StringExtra object) {
				return createStringExtraAdapter();
			}
			public Object caseCallback(Callback object) {
				return createCallbackAdapter();
			}
			public Object casePermissions(Permissions object) {
				return createPermissionsAdapter();
			}
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
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
