/**
 */
package intent.util;

import intent.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see intent.IntentPackage
 * @generated
 */
public class IntentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentSwitch() {
		if (modelPackage == null) {
			modelPackage = IntentPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IntentPackage.INTENT: {
				Intent intent = (Intent)theEObject;
				T result = caseIntent(intent);
				if (result == null) result = caseNamedElement(intent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.BUNDLE: {
				Bundle bundle = (Bundle)theEObject;
				T result = caseBundle(bundle);
				if (result == null) result = caseNamedElement(bundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.EXPLICIT_INTENT: {
				ExplicitIntent explicitIntent = (ExplicitIntent)theEObject;
				T result = caseExplicitIntent(explicitIntent);
				if (result == null) result = caseIntent(explicitIntent);
				if (result == null) result = caseNamedElement(explicitIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.IMPLICIT_INTENT: {
				ImplicitIntent implicitIntent = (ImplicitIntent)theEObject;
				T result = caseImplicitIntent(implicitIntent);
				if (result == null) result = caseIntent(implicitIntent);
				if (result == null) result = caseNamedElement(implicitIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.DOUBLE_EXTRA: {
				DoubleExtra doubleExtra = (DoubleExtra)theEObject;
				T result = caseDoubleExtra(doubleExtra);
				if (result == null) result = caseBundle(doubleExtra);
				if (result == null) result = caseNamedElement(doubleExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.INT_EXTRA: {
				IntExtra intExtra = (IntExtra)theEObject;
				T result = caseIntExtra(intExtra);
				if (result == null) result = caseBundle(intExtra);
				if (result == null) result = caseNamedElement(intExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.CHAR_SEQUENCE_EXTRA: {
				CharSequenceExtra charSequenceExtra = (CharSequenceExtra)theEObject;
				T result = caseCharSequenceExtra(charSequenceExtra);
				if (result == null) result = caseBundle(charSequenceExtra);
				if (result == null) result = caseNamedElement(charSequenceExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.CHAR_EXTRA: {
				CharExtra charExtra = (CharExtra)theEObject;
				T result = caseCharExtra(charExtra);
				if (result == null) result = caseBundle(charExtra);
				if (result == null) result = caseNamedElement(charExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.BUNDLE_EXTRA: {
				BundleExtra bundleExtra = (BundleExtra)theEObject;
				T result = caseBundleExtra(bundleExtra);
				if (result == null) result = caseBundle(bundleExtra);
				if (result == null) result = caseNamedElement(bundleExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.PARCEABLE_EXTRA: {
				ParceableExtra parceableExtra = (ParceableExtra)theEObject;
				T result = caseParceableExtra(parceableExtra);
				if (result == null) result = caseBundle(parceableExtra);
				if (result == null) result = caseNamedElement(parceableExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.SERIALIZABLE_EXTRA: {
				SerializableExtra serializableExtra = (SerializableExtra)theEObject;
				T result = caseSerializableExtra(serializableExtra);
				if (result == null) result = caseBundle(serializableExtra);
				if (result == null) result = caseNamedElement(serializableExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.FLOAT_EXTRA: {
				FloatExtra floatExtra = (FloatExtra)theEObject;
				T result = caseFloatExtra(floatExtra);
				if (result == null) result = caseBundle(floatExtra);
				if (result == null) result = caseNamedElement(floatExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.BYTE_EXTRA: {
				ByteExtra byteExtra = (ByteExtra)theEObject;
				T result = caseByteExtra(byteExtra);
				if (result == null) result = caseBundle(byteExtra);
				if (result == null) result = caseNamedElement(byteExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.LONG_EXTRA: {
				LongExtra longExtra = (LongExtra)theEObject;
				T result = caseLongExtra(longExtra);
				if (result == null) result = caseBundle(longExtra);
				if (result == null) result = caseNamedElement(longExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.STRING_EXTRA: {
				StringExtra stringExtra = (StringExtra)theEObject;
				T result = caseStringExtra(stringExtra);
				if (result == null) result = caseBundle(stringExtra);
				if (result == null) result = caseNamedElement(stringExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.CALLBACK: {
				Callback callback = (Callback)theEObject;
				T result = caseCallback(callback);
				if (result == null) result = caseNamedElement(callback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.PERMISSIONS: {
				Permissions permissions = (Permissions)theEObject;
				T result = casePermissions(permissions);
				if (result == null) result = caseNamedElement(permissions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.BOOLEAN_EXTRA: {
				BooleanExtra booleanExtra = (BooleanExtra)theEObject;
				T result = caseBooleanExtra(booleanExtra);
				if (result == null) result = caseBundle(booleanExtra);
				if (result == null) result = caseNamedElement(booleanExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.URI_EXTRA: {
				UriExtra uriExtra = (UriExtra)theEObject;
				T result = caseUriExtra(uriExtra);
				if (result == null) result = caseBundle(uriExtra);
				if (result == null) result = caseNamedElement(uriExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntent(Intent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundle(Bundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explicit Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explicit Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplicitIntent(ExplicitIntent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicit Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicit Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicitIntent(ImplicitIntent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleExtra(DoubleExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntExtra(IntExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequenceExtra(CharSequenceExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharExtra(CharExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleExtra(BundleExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parceable Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parceable Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParceableExtra(ParceableExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serializable Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serializable Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializableExtra(SerializableExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatExtra(FloatExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByteExtra(ByteExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongExtra(LongExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringExtra(StringExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallback(Callback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permissions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permissions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermissions(Permissions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExtra(BooleanExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUriExtra(UriExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IntentSwitch
