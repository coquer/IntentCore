/**
 */
package intent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	String eNS_URI = "itu.dk.aamj.model";

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
	int NAMED_ELEMENT = 4;

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
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__ACTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Intent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__INTENT_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__CATEGORY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__DATA = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sucess Callback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__SUCESS_CALLBACK = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Exception Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__EXCEPTION_NAME = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__PERMISSIONS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link intent.impl.ExtraImpl <em>Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.ExtraImpl
	 * @see intent.impl.IntentPackageImpl#getExtra()
	 * @generated
	 */
	int EXTRA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link intent.impl.CallbackImpl <em>Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.CallbackImpl
	 * @see intent.impl.IntentPackageImpl#getCallback()
	 * @generated
	 */
	int CALLBACK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intent.impl.PermissionsImpl <em>Permissions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.impl.PermissionsImpl
	 * @see intent.impl.IntentPackageImpl#getPermissions()
	 * @generated
	 */
	int PERMISSIONS = 3;

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
	int MODEL = 5;

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
	 * The meta object id for the '{@link intent.ExtraType <em>Extra Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.ExtraType
	 * @see intent.impl.IntentPackageImpl#getExtraType()
	 * @generated
	 */
	int EXTRA_TYPE = 6;


	/**
	 * The meta object id for the '{@link intent.IntentType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intent.IntentType
	 * @see intent.impl.IntentPackageImpl#getIntentType()
	 * @generated
	 */
	int INTENT_TYPE = 7;


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
	 * Returns the meta object for the attribute '{@link intent.Intent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see intent.Intent#getAction()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Action();

	/**
	 * Returns the meta object for the attribute '{@link intent.Intent#getIntentType <em>Intent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intent Type</em>'.
	 * @see intent.Intent#getIntentType()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_IntentType();

	/**
	 * Returns the meta object for the attribute '{@link intent.Intent#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see intent.Intent#getCategory()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Category();

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
	 * Returns the meta object for class '{@link intent.Extra <em>Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra</em>'.
	 * @see intent.Extra
	 * @generated
	 */
	EClass getExtra();

	/**
	 * Returns the meta object for the attribute '{@link intent.Extra#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see intent.Extra#getValue()
	 * @see #getExtra()
	 * @generated
	 */
	EAttribute getExtra_Value();

	/**
	 * Returns the meta object for the attribute '{@link intent.Extra#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see intent.Extra#getType()
	 * @see #getExtra()
	 * @generated
	 */
	EAttribute getExtra_Type();

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
	 * Returns the meta object for enum '{@link intent.ExtraType <em>Extra Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Extra Type</em>'.
	 * @see intent.ExtraType
	 * @generated
	 */
	EEnum getExtraType();

	/**
	 * Returns the meta object for enum '{@link intent.IntentType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see intent.IntentType
	 * @generated
	 */
	EEnum getIntentType();

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
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__ACTION = eINSTANCE.getIntent_Action();

		/**
		 * The meta object literal for the '<em><b>Intent Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__INTENT_TYPE = eINSTANCE.getIntent_IntentType();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__CATEGORY = eINSTANCE.getIntent_Category();

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
		 * The meta object literal for the '{@link intent.impl.ExtraImpl <em>Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.impl.ExtraImpl
		 * @see intent.impl.IntentPackageImpl#getExtra()
		 * @generated
		 */
		EClass EXTRA = eINSTANCE.getExtra();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA__VALUE = eINSTANCE.getExtra_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA__TYPE = eINSTANCE.getExtra_Type();

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

		/**
		 * The meta object literal for the '{@link intent.ExtraType <em>Extra Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.ExtraType
		 * @see intent.impl.IntentPackageImpl#getExtraType()
		 * @generated
		 */
		EEnum EXTRA_TYPE = eINSTANCE.getExtraType();

		/**
		 * The meta object literal for the '{@link intent.IntentType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intent.IntentType
		 * @see intent.impl.IntentPackageImpl#getIntentType()
		 * @generated
		 */
		EEnum INTENT_TYPE = eINSTANCE.getIntentType();

	}

} //IntentPackage
