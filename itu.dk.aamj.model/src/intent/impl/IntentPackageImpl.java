/**
 */
package intent.impl;

import intent.Bundle;
import intent.BundleExtra;
import intent.ByteExtra;
import intent.CharExtra;
import intent.CharSequenceExtra;
import intent.Data;
import intent.DoubleExtra;
import intent.ExplicitIntent;
import intent.FloatExtra;
import intent.ImplicitIntent;
import intent.IntExtra;
import intent.Intent;
import intent.IntentFactory;
import intent.IntentFilter;
import intent.IntentPackage;
import intent.LongExtra;
import intent.ParceableExtra;
import intent.SerializableExtra;
import intent.StringExtra;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentPackageImpl extends EPackageImpl implements IntentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explicitIntentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitIntentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequenceExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parceableExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializableExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byteExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExtraEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see intent.IntentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntentPackageImpl() {
		super(eNS_URI, IntentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IntentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntentPackage init() {
		if (isInited) return (IntentPackage)EPackage.Registry.INSTANCE.getEPackage(IntentPackage.eNS_URI);

		// Obtain or create and register package
		IntentPackageImpl theIntentPackage = (IntentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntentPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIntentPackage.createPackageContents();

		// Initialize created meta-data
		theIntentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntentPackage.eNS_URI, theIntentPackage);
		return theIntentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntent() {
		return intentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntent_Extras() {
		return (EReference)intentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntent_Type() {
		return (EAttribute)intentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundle() {
		return bundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundle_Name() {
		return (EAttribute)bundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundle_Value() {
		return (EAttribute)bundleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplicitIntent() {
		return explicitIntentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExplicitIntent_Component() {
		return (EAttribute)explicitIntentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitIntent() {
		return implicitIntentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplicitIntent_Action() {
		return (EAttribute)implicitIntentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplicitIntent_Category() {
		return (EAttribute)implicitIntentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleExtra() {
		return doubleExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntExtra() {
		return intExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentFilter() {
		return intentFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentFilter_Action() {
		return (EAttribute)intentFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentFilter_Category() {
		return (EAttribute)intentFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentFilter_Datas() {
		return (EReference)intentFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Host() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_MimeType() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Path() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_PathPrefix() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_PathPattern() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Port() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Scheme() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequenceExtra() {
		return charSequenceExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharExtra() {
		return charExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleExtra() {
		return bundleExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParceableExtra() {
		return parceableExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializableExtra() {
		return serializableExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatExtra() {
		return floatExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByteExtra() {
		return byteExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongExtra() {
		return longExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringExtra() {
		return stringExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentFactory getIntentFactory() {
		return (IntentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		intentEClass = createEClass(INTENT);
		createEReference(intentEClass, INTENT__EXTRAS);
		createEAttribute(intentEClass, INTENT__TYPE);

		bundleEClass = createEClass(BUNDLE);
		createEAttribute(bundleEClass, BUNDLE__NAME);
		createEAttribute(bundleEClass, BUNDLE__VALUE);

		explicitIntentEClass = createEClass(EXPLICIT_INTENT);
		createEAttribute(explicitIntentEClass, EXPLICIT_INTENT__COMPONENT);

		implicitIntentEClass = createEClass(IMPLICIT_INTENT);
		createEAttribute(implicitIntentEClass, IMPLICIT_INTENT__ACTION);
		createEAttribute(implicitIntentEClass, IMPLICIT_INTENT__CATEGORY);

		doubleExtraEClass = createEClass(DOUBLE_EXTRA);

		intExtraEClass = createEClass(INT_EXTRA);

		intentFilterEClass = createEClass(INTENT_FILTER);
		createEAttribute(intentFilterEClass, INTENT_FILTER__ACTION);
		createEAttribute(intentFilterEClass, INTENT_FILTER__CATEGORY);
		createEReference(intentFilterEClass, INTENT_FILTER__DATAS);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__HOST);
		createEAttribute(dataEClass, DATA__MIME_TYPE);
		createEAttribute(dataEClass, DATA__PATH);
		createEAttribute(dataEClass, DATA__PATH_PREFIX);
		createEAttribute(dataEClass, DATA__PATH_PATTERN);
		createEAttribute(dataEClass, DATA__PORT);
		createEAttribute(dataEClass, DATA__SCHEME);

		charSequenceExtraEClass = createEClass(CHAR_SEQUENCE_EXTRA);

		charExtraEClass = createEClass(CHAR_EXTRA);

		bundleExtraEClass = createEClass(BUNDLE_EXTRA);

		parceableExtraEClass = createEClass(PARCEABLE_EXTRA);

		serializableExtraEClass = createEClass(SERIALIZABLE_EXTRA);

		floatExtraEClass = createEClass(FLOAT_EXTRA);

		byteExtraEClass = createEClass(BYTE_EXTRA);

		longExtraEClass = createEClass(LONG_EXTRA);

		stringExtraEClass = createEClass(STRING_EXTRA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		explicitIntentEClass.getESuperTypes().add(this.getIntent());
		implicitIntentEClass.getESuperTypes().add(this.getIntent());
		doubleExtraEClass.getESuperTypes().add(this.getBundle());
		intExtraEClass.getESuperTypes().add(this.getBundle());
		charSequenceExtraEClass.getESuperTypes().add(this.getBundle());
		charExtraEClass.getESuperTypes().add(this.getBundle());
		bundleExtraEClass.getESuperTypes().add(this.getBundle());
		parceableExtraEClass.getESuperTypes().add(this.getBundle());
		serializableExtraEClass.getESuperTypes().add(this.getBundle());
		floatExtraEClass.getESuperTypes().add(this.getBundle());
		byteExtraEClass.getESuperTypes().add(this.getBundle());
		longExtraEClass.getESuperTypes().add(this.getBundle());
		stringExtraEClass.getESuperTypes().add(this.getBundle());

		// Initialize classes and features; add operations and parameters
		initEClass(intentEClass, Intent.class, "Intent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntent_Extras(), this.getBundle(), null, "extras", null, 0, -1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntent_Type(), ecorePackage.getEString(), "type", null, 0, 1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleEClass, Bundle.class, "Bundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundle_Name(), ecorePackage.getEString(), "name", null, 1, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundle_Value(), ecorePackage.getEString(), "value", null, 1, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(explicitIntentEClass, ExplicitIntent.class, "ExplicitIntent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExplicitIntent_Component(), ecorePackage.getEString(), "component", null, 1, 1, ExplicitIntent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicitIntentEClass, ImplicitIntent.class, "ImplicitIntent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplicitIntent_Action(), ecorePackage.getEString(), "action", null, 1, 1, ImplicitIntent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplicitIntent_Category(), ecorePackage.getEString(), "category", null, 0, 1, ImplicitIntent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleExtraEClass, DoubleExtra.class, "DoubleExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intExtraEClass, IntExtra.class, "IntExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intentFilterEClass, IntentFilter.class, "IntentFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentFilter_Action(), ecorePackage.getEString(), "action", null, 1, -1, IntentFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntentFilter_Category(), ecorePackage.getEString(), "category", null, 1, 1, IntentFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntentFilter_Datas(), this.getData(), null, "datas", null, 0, -1, IntentFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Host(), ecorePackage.getEString(), "host", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_MimeType(), ecorePackage.getEString(), "mimeType", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Path(), ecorePackage.getEString(), "path", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_PathPrefix(), ecorePackage.getEString(), "pathPrefix", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_PathPattern(), ecorePackage.getEString(), "pathPattern", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Port(), ecorePackage.getEString(), "port", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Scheme(), ecorePackage.getEString(), "scheme", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(charSequenceExtraEClass, CharSequenceExtra.class, "CharSequenceExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(charExtraEClass, CharExtra.class, "CharExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bundleExtraEClass, BundleExtra.class, "BundleExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parceableExtraEClass, ParceableExtra.class, "ParceableExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serializableExtraEClass, SerializableExtra.class, "SerializableExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatExtraEClass, FloatExtra.class, "FloatExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(byteExtraEClass, ByteExtra.class, "ByteExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(longExtraEClass, LongExtra.class, "LongExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringExtraEClass, StringExtra.class, "StringExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IntentPackageImpl
