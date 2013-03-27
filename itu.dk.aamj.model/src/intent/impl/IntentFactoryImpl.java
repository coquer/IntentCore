/**
 */
package intent.impl;

import intent.*;

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
public class IntentFactoryImpl extends EFactoryImpl implements IntentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntentFactory init() {
		try {
			IntentFactory theIntentFactory = (IntentFactory)EPackage.Registry.INSTANCE.getEFactory("itu.dk.aamj.model"); 
			if (theIntentFactory != null) {
				return theIntentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IntentPackage.INTENT: return createIntent();
			case IntentPackage.BUNDLE: return createBundle();
			case IntentPackage.EXPLICIT_INTENT: return createExplicitIntent();
			case IntentPackage.IMPLICIT_INTENT: return createImplicitIntent();
			case IntentPackage.DOUBLE_EXTRA: return createDoubleExtra();
			case IntentPackage.INT_EXTRA: return createIntExtra();
			case IntentPackage.CHAR_SEQUENCE_EXTRA: return createCharSequenceExtra();
			case IntentPackage.CHAR_EXTRA: return createCharExtra();
			case IntentPackage.BUNDLE_EXTRA: return createBundleExtra();
			case IntentPackage.PARCEABLE_EXTRA: return createParceableExtra();
			case IntentPackage.SERIALIZABLE_EXTRA: return createSerializableExtra();
			case IntentPackage.FLOAT_EXTRA: return createFloatExtra();
			case IntentPackage.BYTE_EXTRA: return createByteExtra();
			case IntentPackage.LONG_EXTRA: return createLongExtra();
			case IntentPackage.STRING_EXTRA: return createStringExtra();
			case IntentPackage.CALLBACK: return createCallback();
			case IntentPackage.PERMISSIONS: return createPermissions();
			case IntentPackage.NAMED_ELEMENT: return createNamedElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intent createIntent() {
		IntentImpl intent = new IntentImpl();
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitIntent createExplicitIntent() {
		ExplicitIntentImpl explicitIntent = new ExplicitIntentImpl();
		return explicitIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitIntent createImplicitIntent() {
		ImplicitIntentImpl implicitIntent = new ImplicitIntentImpl();
		return implicitIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleExtra createDoubleExtra() {
		DoubleExtraImpl doubleExtra = new DoubleExtraImpl();
		return doubleExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExtra createIntExtra() {
		IntExtraImpl intExtra = new IntExtraImpl();
		return intExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequenceExtra createCharSequenceExtra() {
		CharSequenceExtraImpl charSequenceExtra = new CharSequenceExtraImpl();
		return charSequenceExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharExtra createCharExtra() {
		CharExtraImpl charExtra = new CharExtraImpl();
		return charExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleExtra createBundleExtra() {
		BundleExtraImpl bundleExtra = new BundleExtraImpl();
		return bundleExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParceableExtra createParceableExtra() {
		ParceableExtraImpl parceableExtra = new ParceableExtraImpl();
		return parceableExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializableExtra createSerializableExtra() {
		SerializableExtraImpl serializableExtra = new SerializableExtraImpl();
		return serializableExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatExtra createFloatExtra() {
		FloatExtraImpl floatExtra = new FloatExtraImpl();
		return floatExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByteExtra createByteExtra() {
		ByteExtraImpl byteExtra = new ByteExtraImpl();
		return byteExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongExtra createLongExtra() {
		LongExtraImpl longExtra = new LongExtraImpl();
		return longExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExtra createStringExtra() {
		StringExtraImpl stringExtra = new StringExtraImpl();
		return stringExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callback createCallback() {
		CallbackImpl callback = new CallbackImpl();
		return callback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permissions createPermissions() {
		PermissionsImpl permissions = new PermissionsImpl();
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentPackage getIntentPackage() {
		return (IntentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static IntentPackage getPackage() {
		return IntentPackage.eINSTANCE;
	}

} //IntentFactoryImpl
