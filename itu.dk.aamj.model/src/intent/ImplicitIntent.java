/**
 */
package intent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implicit Intent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intent.ImplicitIntent#getAction <em>Action</em>}</li>
 *   <li>{@link intent.ImplicitIntent#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see intent.IntentPackage#getImplicitIntent()
 * @model
 * @generated
 */
public interface ImplicitIntent extends Intent {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see intent.IntentPackage#getImplicitIntent_Action()
	 * @model required="true"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link intent.ImplicitIntent#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see intent.IntentPackage#getImplicitIntent_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link intent.ImplicitIntent#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

} // ImplicitIntent
