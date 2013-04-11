/**
 */
package intent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see intent.IntentFactory
 * @model kind="package"
 * @generated
 */
public interface IntentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "intent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "itu.dk.aamj";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntentPackage eINSTANCE = intent.impl.IntentPackageImpl.init();

	/**
	 * The meta object id for the '{@link intent.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.NamedElementImpl
	 * @see intent.impl.IntentPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link intent.impl.IntentImpl <em>Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.IntentImpl
	 * @see intent.impl.IntentPackageImpl#getIntent()
	 * @generated
	 */
	int INTENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Extras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__EXTRAS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__DATA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sucess Callback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__SUCESS_CALLBACK = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exception Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__EXCEPTION_NAME = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__PERMISSIONS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link intent.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.BundleImpl
	 * @see intent.impl.IntentPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link intent.impl.ExplicitIntentImpl <em>Explicit Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.ExplicitIntentImpl
	 * @see intent.impl.IntentPackageImpl#getExplicitIntent()
	 * @generated
	 */
	int EXPLICIT_INTENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__NAME = INTENT__NAME;

	/**
	 * The feature id for the '<em><b>Extras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__EXTRAS = INTENT__EXTRAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__TYPE = INTENT__TYPE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__DATA = INTENT__DATA;

	/**
	 * The feature id for the '<em><b>Sucess Callback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__SUCESS_CALLBACK = INTENT__SUCESS_CALLBACK;

	/**
	 * The feature id for the '<em><b>Exception Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__EXCEPTION_NAME = INTENT__EXCEPTION_NAME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__PERMISSIONS = INTENT__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__COMPONENT = INTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Explicit Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT_FEATURE_COUNT = INTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link intent.impl.ImplicitIntentImpl <em>Implicit Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.ImplicitIntentImpl
	 * @see intent.impl.IntentPackageImpl#getImplicitIntent()
	 * @generated
	 */
	int IMPLICIT_INTENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__NAME = INTENT__NAME;

	/**
	 * The feature id for the '<em><b>Extras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__EXTRAS = INTENT__EXTRAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__TYPE = INTENT__TYPE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__DATA = INTENT__DATA;

	/**
	 * The feature id for the '<em><b>Sucess Callback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__SUCESS_CALLBACK = INTENT__SUCESS_CALLBACK;

	/**
	 * The feature id for the '<em><b>Exception Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__EXCEPTION_NAME = INTENT__EXCEPTION_NAME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__PERMISSIONS = INTENT__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__CATEGORY = INTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__ACTION = INTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implicit Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT_FEATURE_COUNT = INTENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link intent.impl.DoubleExtraImpl <em>Double Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.DoubleExtraImpl
	 * @see intent.impl.IntentPackageImpl#getDoubleExtra()
	 * @generated
	 */
	int DOUBLE_EXTRA = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_EXTRA__NAME = BUNDLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_EXTRA__VALUE = BUNDLE__VALUE;

	/**
	 * The number of structural features of the '<em>Double Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_EXTRA_FEATURE_COUNT = BUNDLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intent.impl.IntExtraImpl <em>Int Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.IntExtraImpl
	 * @see intent.impl.IntentPackageImpl#getIntExtra()
	 * @generated
	 */
	int INT_EXTRA = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXTRA__NAME = BUNDLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXTRA__VALUE = BUNDLE__VALUE;

	/**
	 * The number of structural features of the '<em>Int Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXTRA_FEATURE_COUNT = BUNDLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intent.impl.CharSequenceExtraImpl <em>Char Sequence Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.CharSequenceExtraImpl
	 * @see intent.impl.IntentPackageImpl#getCharSequenceExtra()
	 * @generated
	 */
	int CHAR_SEQUENCE_EXTRA = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_EXTRA__NAME = BUNDLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_EXTRA__VALUE = BUNDLE__VALUE;

	/**
	 * The number of structural features of the '<em>Char Sequence Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_EXTRA_FEATURE_COUNT = BUNDLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intent.impl.CharExtraImpl <em>Char Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.CharExtraImpl
	 * @see intent.impl.IntentPackageImpl#getCharExtra()
	 * @generated
	 */
	int CHAR_EXTRA = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_EXTRA__NAME = BUNDLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_EXTRA__VALUE = BUNDLE__VALUE;

	/**
	 * The number of structural features of the '<em>Char Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_EXTRA_FEATURE_COUNT = BUNDLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intent.impl.BundleExtraImpl <em>Bundle Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.BundleExtraImpl
	 * @see intent.impl.IntentPackageImpl#getBundleExtra()
	 * @generated
	 */
	int BUNDLE_EXTRA = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_EXTRA__NAME = BUNDLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_EXTRA__VALUE = BUNDLE__VALUE;

	/**
	 * The number of structural features of the '<em>Bundle Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_EXTRA_FEATURE_COUNT = BUNDLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intent.impl.ParceableExtraImpl <em>Parceable Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.ParceableExtraImpl
	 * @see intent.impl.IntentPackageImpl#getParceableExtra()
	 * @generated
	 */
	int PARCEABLE_EXTRA = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEABLE_EXTRA__NAME = BUNDLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEABLE_EXTRA__VALUE = BUNDLE__VALUE;

	/**
	 * The number of structural features of the '<em>Parceable Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEABLE_EXTRA_FEATURE_COUNT = BUNDLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intent.impl.SerializableExtraImpl <em>Serializable Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.SerializableExtraImpl
	 * @see intent.impl.IntentPackageImpl#getSerializableExtra()
	 * @generated
	 */
	int SERIALIZABLE_EXTRA = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_EXTRA__NAME = BUNDLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_EXTRA__VALUE = BUNDLE__VALUE;

	/**
	 * The number of structural features of the '<em>Serializable Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_EXTRA_FEATURE_COUNT = BUNDLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intent.impl.FloatExtraImpl <em>Float Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.FloatExtraImpl
	 * @see intent.impl.IntentPackageImpl#getFloatExtra()
	 * @generated
	 */
	int FLOAT_EXTRA = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_EXTRA__NAME = BUNDLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_EXTRA__VALUE = BUNDLE__VALUE;

	/**
	 * The number of structural features of the '<em>Float Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_EXTRA_FEATURE_COUNT = BUNDLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intent.impl.ByteExtraImpl <em>Byte Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.ByteExtraImpl
	 * @see intent.impl.IntentPackageImpl#getByteExtra()
	 * @generated
	 */
	int BYTE_EXTRA = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_EXTRA__NAME = BUNDLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_EXTRA__VALUE = BUNDLE__VALUE;

	/**
	 * The number of structural features of the '<em>Byte Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_EXTRA_FEATURE_COUNT = BUNDLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intent.impl.LongExtraImpl <em>Long Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.LongExtraImpl
	 * @see intent.impl.IntentPackageImpl#getLongExtra()
	 * @generated
	 */
	int LONG_EXTRA = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_EXTRA__NAME = BUNDLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_EXTRA__VALUE = BUNDLE__VALUE;

	/**
	 * The number of structural features of the '<em>Long Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_EXTRA_FEATURE_COUNT = BUNDLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intent.impl.StringExtraImpl <em>String Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.StringExtraImpl
	 * @see intent.impl.IntentPackageImpl#getStringExtra()
	 * @generated
	 */
	int STRING_EXTRA = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXTRA__NAME = BUNDLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXTRA__VALUE = BUNDLE__VALUE;

	/**
	 * The number of structural features of the '<em>String Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXTRA_FEATURE_COUNT = BUNDLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intent.impl.CallbackImpl <em>Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.CallbackImpl
	 * @see intent.impl.IntentPackageImpl#getCallback()
	 * @generated
	 */
	int CALLBACK = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__DATA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link intent.impl.PermissionsImpl <em>Permissions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.PermissionsImpl
	 * @see intent.impl.IntentPackageImpl#getPermissions()
	 * @generated
	 */
	int PERMISSIONS = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Permissions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intent.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.ModelImpl
	 * @see intent.impl.IntentPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Intents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INTENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link intent.Intent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent</em>'.
	 * @see intent.Intent
	 * @generated
	 */
	EClass getIntent();

	/**
	 * Returns the meta object for the containment reference list '{@link intent.Intent#getExtras <em>Extras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extras</em>'.
	 * @see intent.Intent#getExtras()
	 * @see #getIntent()
	 * @generated
	 */
	EReference getIntent_Extras();

	/**
	 * Returns the meta object for the attribute '{@link intent.Intent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see intent.Intent#getType()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Type();

	/**
	 * Returns the meta object for the attribute '{@link intent.Intent#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see intent.Intent#getData()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Data();

	/**
	 * Returns the meta object for the containment reference '{@link intent.Intent#getSucessCallback <em>Sucess Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sucess Callback</em>'.
	 * @see intent.Intent#getSucessCallback()
	 * @see #getIntent()
	 * @generated
	 */
	EReference getIntent_SucessCallback();

	/**
	 * Returns the meta object for the attribute '{@link intent.Intent#getExceptionName <em>Exception Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Name</em>'.
	 * @see intent.Intent#getExceptionName()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_ExceptionName();

	/**
	 * Returns the meta object for the containment reference list '{@link intent.Intent#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see intent.Intent#getPermissions()
	 * @see #getIntent()
	 * @generated
	 */
	EReference getIntent_Permissions();

	/**
	 * Returns the meta object for class '{@link intent.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see intent.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for the attribute '{@link intent.Bundle#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see intent.Bundle#getValue()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Value();

	/**
	 * Returns the meta object for class '{@link intent.ExplicitIntent <em>Explicit Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explicit Intent</em>'.
	 * @see intent.ExplicitIntent
	 * @generated
	 */
	EClass getExplicitIntent();

	/**
	 * Returns the meta object for the attribute '{@link intent.ExplicitIntent#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component</em>'.
	 * @see intent.ExplicitIntent#getComponent()
	 * @see #getExplicitIntent()
	 * @generated
	 */
	EAttribute getExplicitIntent_Component();

	/**
	 * Returns the meta object for class '{@link intent.ImplicitIntent <em>Implicit Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Intent</em>'.
	 * @see intent.ImplicitIntent
	 * @generated
	 */
	EClass getImplicitIntent();

	/**
	 * Returns the meta object for the attribute '{@link intent.ImplicitIntent#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see intent.ImplicitIntent#getCategory()
	 * @see #getImplicitIntent()
	 * @generated
	 */
	EAttribute getImplicitIntent_Category();

	/**
	 * Returns the meta object for the attribute '{@link intent.ImplicitIntent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see intent.ImplicitIntent#getAction()
	 * @see #getImplicitIntent()
	 * @generated
	 */
	EAttribute getImplicitIntent_Action();

	/**
	 * Returns the meta object for class '{@link intent.DoubleExtra <em>Double Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Extra</em>'.
	 * @see intent.DoubleExtra
	 * @generated
	 */
	EClass getDoubleExtra();

	/**
	 * Returns the meta object for class '{@link intent.IntExtra <em>Int Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Extra</em>'.
	 * @see intent.IntExtra
	 * @generated
	 */
	EClass getIntExtra();

	/**
	 * Returns the meta object for class '{@link intent.CharSequenceExtra <em>Char Sequence Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Extra</em>'.
	 * @see intent.CharSequenceExtra
	 * @generated
	 */
	EClass getCharSequenceExtra();

	/**
	 * Returns the meta object for class '{@link intent.CharExtra <em>Char Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Extra</em>'.
	 * @see intent.CharExtra
	 * @generated
	 */
	EClass getCharExtra();

	/**
	 * Returns the meta object for class '{@link intent.BundleExtra <em>Bundle Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Extra</em>'.
	 * @see intent.BundleExtra
	 * @generated
	 */
	EClass getBundleExtra();

	/**
	 * Returns the meta object for class '{@link intent.ParceableExtra <em>Parceable Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parceable Extra</em>'.
	 * @see intent.ParceableExtra
	 * @generated
	 */
	EClass getParceableExtra();

	/**
	 * Returns the meta object for class '{@link intent.SerializableExtra <em>Serializable Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serializable Extra</em>'.
	 * @see intent.SerializableExtra
	 * @generated
	 */
	EClass getSerializableExtra();

	/**
	 * Returns the meta object for class '{@link intent.FloatExtra <em>Float Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Extra</em>'.
	 * @see intent.FloatExtra
	 * @generated
	 */
	EClass getFloatExtra();

	/**
	 * Returns the meta object for class '{@link intent.ByteExtra <em>Byte Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte Extra</em>'.
	 * @see intent.ByteExtra
	 * @generated
	 */
	EClass getByteExtra();

	/**
	 * Returns the meta object for class '{@link intent.LongExtra <em>Long Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Extra</em>'.
	 * @see intent.LongExtra
	 * @generated
	 */
	EClass getLongExtra();

	/**
	 * Returns the meta object for class '{@link intent.StringExtra <em>String Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Extra</em>'.
	 * @see intent.StringExtra
	 * @generated
	 */
	EClass getStringExtra();

	/**
	 * Returns the meta object for class '{@link intent.Callback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callback</em>'.
	 * @see intent.Callback
	 * @generated
	 */
	EClass getCallback();

	/**
	 * Returns the meta object for the attribute '{@link intent.Callback#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see intent.Callback#getData()
	 * @see #getCallback()
	 * @generated
	 */
	EAttribute getCallback_Data();

	/**
	 * Returns the meta object for class '{@link intent.Permissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permissions</em>'.
	 * @see intent.Permissions
	 * @generated
	 */
	EClass getPermissions();

	/**
	 * Returns the meta object for class '{@link intent.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see intent.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link intent.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intent.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link intent.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see intent.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link intent.Model#getIntents <em>Intents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intents</em>'.
	 * @see intent.Model#getIntents()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Intents();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntentFactory getIntentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link intent.impl.IntentImpl <em>Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.IntentImpl
		 * @see intent.impl.IntentPackageImpl#getIntent()
		 * @generated
		 */
		EClass INTENT = eINSTANCE.getIntent();

		/**
		 * The meta object literal for the '<em><b>Extras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT__EXTRAS = eINSTANCE.getIntent_Extras();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__TYPE = eINSTANCE.getIntent_Type();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__DATA = eINSTANCE.getIntent_Data();

		/**
		 * The meta object literal for the '<em><b>Sucess Callback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT__SUCESS_CALLBACK = eINSTANCE.getIntent_SucessCallback();

		/**
		 * The meta object literal for the '<em><b>Exception Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__EXCEPTION_NAME = eINSTANCE.getIntent_ExceptionName();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT__PERMISSIONS = eINSTANCE.getIntent_Permissions();

		/**
		 * The meta object literal for the '{@link intent.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.BundleImpl
		 * @see intent.impl.IntentPackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__VALUE = eINSTANCE.getBundle_Value();

		/**
		 * The meta object literal for the '{@link intent.impl.ExplicitIntentImpl <em>Explicit Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.ExplicitIntentImpl
		 * @see intent.impl.IntentPackageImpl#getExplicitIntent()
		 * @generated
		 */
		EClass EXPLICIT_INTENT = eINSTANCE.getExplicitIntent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLICIT_INTENT__COMPONENT = eINSTANCE.getExplicitIntent_Component();

		/**
		 * The meta object literal for the '{@link intent.impl.ImplicitIntentImpl <em>Implicit Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.ImplicitIntentImpl
		 * @see intent.impl.IntentPackageImpl#getImplicitIntent()
		 * @generated
		 */
		EClass IMPLICIT_INTENT = eINSTANCE.getImplicitIntent();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICIT_INTENT__CATEGORY = eINSTANCE.getImplicitIntent_Category();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICIT_INTENT__ACTION = eINSTANCE.getImplicitIntent_Action();

		/**
		 * The meta object literal for the '{@link intent.impl.DoubleExtraImpl <em>Double Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.DoubleExtraImpl
		 * @see intent.impl.IntentPackageImpl#getDoubleExtra()
		 * @generated
		 */
		EClass DOUBLE_EXTRA = eINSTANCE.getDoubleExtra();

		/**
		 * The meta object literal for the '{@link intent.impl.IntExtraImpl <em>Int Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.IntExtraImpl
		 * @see intent.impl.IntentPackageImpl#getIntExtra()
		 * @generated
		 */
		EClass INT_EXTRA = eINSTANCE.getIntExtra();

		/**
		 * The meta object literal for the '{@link intent.impl.CharSequenceExtraImpl <em>Char Sequence Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.CharSequenceExtraImpl
		 * @see intent.impl.IntentPackageImpl#getCharSequenceExtra()
		 * @generated
		 */
		EClass CHAR_SEQUENCE_EXTRA = eINSTANCE.getCharSequenceExtra();

		/**
		 * The meta object literal for the '{@link intent.impl.CharExtraImpl <em>Char Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.CharExtraImpl
		 * @see intent.impl.IntentPackageImpl#getCharExtra()
		 * @generated
		 */
		EClass CHAR_EXTRA = eINSTANCE.getCharExtra();

		/**
		 * The meta object literal for the '{@link intent.impl.BundleExtraImpl <em>Bundle Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.BundleExtraImpl
		 * @see intent.impl.IntentPackageImpl#getBundleExtra()
		 * @generated
		 */
		EClass BUNDLE_EXTRA = eINSTANCE.getBundleExtra();

		/**
		 * The meta object literal for the '{@link intent.impl.ParceableExtraImpl <em>Parceable Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.ParceableExtraImpl
		 * @see intent.impl.IntentPackageImpl#getParceableExtra()
		 * @generated
		 */
		EClass PARCEABLE_EXTRA = eINSTANCE.getParceableExtra();

		/**
		 * The meta object literal for the '{@link intent.impl.SerializableExtraImpl <em>Serializable Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.SerializableExtraImpl
		 * @see intent.impl.IntentPackageImpl#getSerializableExtra()
		 * @generated
		 */
		EClass SERIALIZABLE_EXTRA = eINSTANCE.getSerializableExtra();

		/**
		 * The meta object literal for the '{@link intent.impl.FloatExtraImpl <em>Float Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.FloatExtraImpl
		 * @see intent.impl.IntentPackageImpl#getFloatExtra()
		 * @generated
		 */
		EClass FLOAT_EXTRA = eINSTANCE.getFloatExtra();

		/**
		 * The meta object literal for the '{@link intent.impl.ByteExtraImpl <em>Byte Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.ByteExtraImpl
		 * @see intent.impl.IntentPackageImpl#getByteExtra()
		 * @generated
		 */
		EClass BYTE_EXTRA = eINSTANCE.getByteExtra();

		/**
		 * The meta object literal for the '{@link intent.impl.LongExtraImpl <em>Long Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.LongExtraImpl
		 * @see intent.impl.IntentPackageImpl#getLongExtra()
		 * @generated
		 */
		EClass LONG_EXTRA = eINSTANCE.getLongExtra();

		/**
		 * The meta object literal for the '{@link intent.impl.StringExtraImpl <em>String Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.StringExtraImpl
		 * @see intent.impl.IntentPackageImpl#getStringExtra()
		 * @generated
		 */
		EClass STRING_EXTRA = eINSTANCE.getStringExtra();

		/**
		 * The meta object literal for the '{@link intent.impl.CallbackImpl <em>Callback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.CallbackImpl
		 * @see intent.impl.IntentPackageImpl#getCallback()
		 * @generated
		 */
		EClass CALLBACK = eINSTANCE.getCallback();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLBACK__DATA = eINSTANCE.getCallback_Data();

		/**
		 * The meta object literal for the '{@link intent.impl.PermissionsImpl <em>Permissions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.PermissionsImpl
		 * @see intent.impl.IntentPackageImpl#getPermissions()
		 * @generated
		 */
		EClass PERMISSIONS = eINSTANCE.getPermissions();

		/**
		 * The meta object literal for the '{@link intent.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.NamedElementImpl
		 * @see intent.impl.IntentPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link intent.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.ModelImpl
		 * @see intent.impl.IntentPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Intents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__INTENTS = eINSTANCE.getModel_Intents();

	}

} //IntentPackage
