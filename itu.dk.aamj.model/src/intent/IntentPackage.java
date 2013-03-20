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
	String eNS_URI = "http://intent/1.0";

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
	 * The meta object id for the '{@link intent.impl.IntentImpl <em>Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.IntentImpl
	 * @see intent.impl.IntentPackageImpl#getIntent()
	 * @generated
	 */
	int INTENT = 0;

	/**
	 * The feature id for the '<em><b>Extras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__EXTRAS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_FEATURE_COUNT = 2;

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
	int BUNDLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__ACTION = INTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__CATEGORY = INTENT_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link intent.impl.IntentFilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.IntentFilterImpl
	 * @see intent.impl.IntentPackageImpl#getIntentFilter()
	 * @generated
	 */
	int INTENT_FILTER = 6;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_FILTER__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_FILTER__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Datas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_FILTER__DATAS = 2;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_FILTER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link intent.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.DataImpl
	 * @see intent.impl.IntentPackageImpl#getData()
	 * @generated
	 */
	int DATA = 7;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__HOST = 0;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__MIME_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PATH = 2;

	/**
	 * The feature id for the '<em><b>Path Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PATH_PREFIX = 3;

	/**
	 * The feature id for the '<em><b>Path Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PATH_PATTERN = 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PORT = 5;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SCHEME = 6;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link intent.impl.CharSequenceExtraImpl <em>Char Sequence Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.CharSequenceExtraImpl
	 * @see intent.impl.IntentPackageImpl#getCharSequenceExtra()
	 * @generated
	 */
	int CHAR_SEQUENCE_EXTRA = 8;

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
	int CHAR_EXTRA = 9;

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
	int BUNDLE_EXTRA = 10;

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
	int PARCEABLE_EXTRA = 11;

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
	int SERIALIZABLE_EXTRA = 12;

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
	int FLOAT_EXTRA = 13;

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
	int BYTE_EXTRA = 14;

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
	int LONG_EXTRA = 15;

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
	int STRING_EXTRA = 16;

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
	 * Returns the meta object for class '{@link intent.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see intent.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for the attribute '{@link intent.Bundle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intent.Bundle#getName()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Name();

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
	 * Returns the meta object for class '{@link intent.IntentFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see intent.IntentFilter
	 * @generated
	 */
	EClass getIntentFilter();

	/**
	 * Returns the meta object for the attribute list '{@link intent.IntentFilter#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Action</em>'.
	 * @see intent.IntentFilter#getAction()
	 * @see #getIntentFilter()
	 * @generated
	 */
	EAttribute getIntentFilter_Action();

	/**
	 * Returns the meta object for the attribute '{@link intent.IntentFilter#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see intent.IntentFilter#getCategory()
	 * @see #getIntentFilter()
	 * @generated
	 */
	EAttribute getIntentFilter_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link intent.IntentFilter#getDatas <em>Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datas</em>'.
	 * @see intent.IntentFilter#getDatas()
	 * @see #getIntentFilter()
	 * @generated
	 */
	EReference getIntentFilter_Datas();

	/**
	 * Returns the meta object for class '{@link intent.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see intent.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link intent.Data#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see intent.Data#getHost()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Host();

	/**
	 * Returns the meta object for the attribute '{@link intent.Data#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see intent.Data#getMimeType()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link intent.Data#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see intent.Data#getPath()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Path();

	/**
	 * Returns the meta object for the attribute '{@link intent.Data#getPathPrefix <em>Path Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Prefix</em>'.
	 * @see intent.Data#getPathPrefix()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_PathPrefix();

	/**
	 * Returns the meta object for the attribute '{@link intent.Data#getPathPattern <em>Path Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Pattern</em>'.
	 * @see intent.Data#getPathPattern()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_PathPattern();

	/**
	 * Returns the meta object for the attribute '{@link intent.Data#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see intent.Data#getPort()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Port();

	/**
	 * Returns the meta object for the attribute '{@link intent.Data#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see intent.Data#getScheme()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Scheme();

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
		 * The meta object literal for the '{@link intent.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.BundleImpl
		 * @see intent.impl.IntentPackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__NAME = eINSTANCE.getBundle_Name();

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
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICIT_INTENT__ACTION = eINSTANCE.getImplicitIntent_Action();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICIT_INTENT__CATEGORY = eINSTANCE.getImplicitIntent_Category();

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
		 * The meta object literal for the '{@link intent.impl.IntentFilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.IntentFilterImpl
		 * @see intent.impl.IntentPackageImpl#getIntentFilter()
		 * @generated
		 */
		EClass INTENT_FILTER = eINSTANCE.getIntentFilter();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_FILTER__ACTION = eINSTANCE.getIntentFilter_Action();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_FILTER__CATEGORY = eINSTANCE.getIntentFilter_Category();

		/**
		 * The meta object literal for the '<em><b>Datas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_FILTER__DATAS = eINSTANCE.getIntentFilter_Datas();

		/**
		 * The meta object literal for the '{@link intent.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.DataImpl
		 * @see intent.impl.IntentPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__HOST = eINSTANCE.getData_Host();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__MIME_TYPE = eINSTANCE.getData_MimeType();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__PATH = eINSTANCE.getData_Path();

		/**
		 * The meta object literal for the '<em><b>Path Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__PATH_PREFIX = eINSTANCE.getData_PathPrefix();

		/**
		 * The meta object literal for the '<em><b>Path Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__PATH_PATTERN = eINSTANCE.getData_PathPattern();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__PORT = eINSTANCE.getData_Port();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__SCHEME = eINSTANCE.getData_Scheme();

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

	}

} //IntentPackage
