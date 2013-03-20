/**
 */
package intent.util;

import intent.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
public class IntentSwitch {
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
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IntentPackage.INTENT: {
				Intent intent = (Intent)theEObject;
				Object result = caseIntent(intent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.BUNDLE: {
				Bundle bundle = (Bundle)theEObject;
				Object result = caseBundle(bundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.EXPLICIT_INTENT: {
				ExplicitIntent explicitIntent = (ExplicitIntent)theEObject;
				Object result = caseExplicitIntent(explicitIntent);
				if (result == null) result = caseIntent(explicitIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.IMPLICIT_INTENT: {
				ImplicitIntent implicitIntent = (ImplicitIntent)theEObject;
				Object result = caseImplicitIntent(implicitIntent);
				if (result == null) result = caseIntent(implicitIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.DOUBLE_EXTRA: {
				DoubleExtra doubleExtra = (DoubleExtra)theEObject;
				Object result = caseDoubleExtra(doubleExtra);
				if (result == null) result = caseBundle(doubleExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.INT_EXTRA: {
				IntExtra intExtra = (IntExtra)theEObject;
				Object result = caseIntExtra(intExtra);
				if (result == null) result = caseBundle(intExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.INTENT_FILTER: {
				IntentFilter intentFilter = (IntentFilter)theEObject;
				Object result = caseIntentFilter(intentFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.DATA: {
				Data data = (Data)theEObject;
				Object result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.CHAR_SEQUENCE_EXTRA: {
				CharSequenceExtra charSequenceExtra = (CharSequenceExtra)theEObject;
				Object result = caseCharSequenceExtra(charSequenceExtra);
				if (result == null) result = caseBundle(charSequenceExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.CHAR_EXTRA: {
				CharExtra charExtra = (CharExtra)theEObject;
				Object result = caseCharExtra(charExtra);
				if (result == null) result = caseBundle(charExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.BUNDLE_EXTRA: {
				BundleExtra bundleExtra = (BundleExtra)theEObject;
				Object result = caseBundleExtra(bundleExtra);
				if (result == null) result = caseBundle(bundleExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.PARCEABLE_EXTRA: {
				ParceableExtra parceableExtra = (ParceableExtra)theEObject;
				Object result = caseParceableExtra(parceableExtra);
				if (result == null) result = caseBundle(parceableExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.SERIALIZABLE_EXTRA: {
				SerializableExtra serializableExtra = (SerializableExtra)theEObject;
				Object result = caseSerializableExtra(serializableExtra);
				if (result == null) result = caseBundle(serializableExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.FLOAT_EXTRA: {
				FloatExtra floatExtra = (FloatExtra)theEObject;
				Object result = caseFloatExtra(floatExtra);
				if (result == null) result = caseBundle(floatExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.BYTE_EXTRA: {
				ByteExtra byteExtra = (ByteExtra)theEObject;
				Object result = caseByteExtra(byteExtra);
				if (result == null) result = caseBundle(byteExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.LONG_EXTRA: {
				LongExtra longExtra = (LongExtra)theEObject;
				Object result = caseLongExtra(longExtra);
				if (result == null) result = caseBundle(longExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.STRING_EXTRA: {
				StringExtra stringExtra = (StringExtra)theEObject;
				Object result = caseStringExtra(stringExtra);
				if (result == null) result = caseBundle(stringExtra);
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
	public Object caseIntent(Intent object) {
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
	public Object caseBundle(Bundle object) {
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
	public Object caseExplicitIntent(ExplicitIntent object) {
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
	public Object caseImplicitIntent(ImplicitIntent object) {
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
	public Object caseDoubleExtra(DoubleExtra object) {
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
	public Object caseIntExtra(IntExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntentFilter(IntentFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseData(Data object) {
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
	public Object caseCharSequenceExtra(CharSequenceExtra object) {
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
	public Object caseCharExtra(CharExtra object) {
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
	public Object caseBundleExtra(BundleExtra object) {
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
	public Object caseParceableExtra(ParceableExtra object) {
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
	public Object caseSerializableExtra(SerializableExtra object) {
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
	public Object caseFloatExtra(FloatExtra object) {
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
	public Object caseByteExtra(ByteExtra object) {
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
	public Object caseLongExtra(LongExtra object) {
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
	public Object caseStringExtra(StringExtra object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //IntentSwitch
