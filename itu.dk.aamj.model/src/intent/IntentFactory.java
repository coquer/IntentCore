/**
 */
package intent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see intent.IntentPackage
 * @generated
 */
public interface IntentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntentFactory eINSTANCE = intent.impl.IntentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Intent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent</em>'.
	 * @generated
	 */
	Intent createIntent();

	/**
	 * Returns a new object of class '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle</em>'.
	 * @generated
	 */
	Bundle createBundle();

	/**
	 * Returns a new object of class '<em>Explicit Intent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explicit Intent</em>'.
	 * @generated
	 */
	ExplicitIntent createExplicitIntent();

	/**
	 * Returns a new object of class '<em>Implicit Intent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicit Intent</em>'.
	 * @generated
	 */
	ImplicitIntent createImplicitIntent();

	/**
	 * Returns a new object of class '<em>Double Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Extra</em>'.
	 * @generated
	 */
	DoubleExtra createDoubleExtra();

	/**
	 * Returns a new object of class '<em>Int Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Extra</em>'.
	 * @generated
	 */
	IntExtra createIntExtra();

	/**
	 * Returns a new object of class '<em>Char Sequence Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence Extra</em>'.
	 * @generated
	 */
	CharSequenceExtra createCharSequenceExtra();

	/**
	 * Returns a new object of class '<em>Char Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Extra</em>'.
	 * @generated
	 */
	CharExtra createCharExtra();

	/**
	 * Returns a new object of class '<em>Bundle Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Extra</em>'.
	 * @generated
	 */
	BundleExtra createBundleExtra();

	/**
	 * Returns a new object of class '<em>Parceable Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parceable Extra</em>'.
	 * @generated
	 */
	ParceableExtra createParceableExtra();

	/**
	 * Returns a new object of class '<em>Serializable Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serializable Extra</em>'.
	 * @generated
	 */
	SerializableExtra createSerializableExtra();

	/**
	 * Returns a new object of class '<em>Float Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Extra</em>'.
	 * @generated
	 */
	FloatExtra createFloatExtra();

	/**
	 * Returns a new object of class '<em>Byte Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Byte Extra</em>'.
	 * @generated
	 */
	ByteExtra createByteExtra();

	/**
	 * Returns a new object of class '<em>Long Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Extra</em>'.
	 * @generated
	 */
	LongExtra createLongExtra();

	/**
	 * Returns a new object of class '<em>String Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Extra</em>'.
	 * @generated
	 */
	StringExtra createStringExtra();

	/**
	 * Returns a new object of class '<em>Callback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Callback</em>'.
	 * @generated
	 */
	Callback createCallback();

	/**
	 * Returns a new object of class '<em>Permissions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Permissions</em>'.
	 * @generated
	 */
	Permissions createPermissions();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntentPackage getIntentPackage();

} //IntentFactory
