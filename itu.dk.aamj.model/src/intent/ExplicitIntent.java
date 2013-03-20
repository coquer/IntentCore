/**
 */
package intent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Intent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intent.ExplicitIntent#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see intent.IntentPackage#getExplicitIntent()
 * @model
 * @generated
 */
public interface ExplicitIntent extends Intent {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' attribute.
	 * @see #setComponent(String)
	 * @see intent.IntentPackage#getExplicitIntent_Component()
	 * @model required="true"
	 * @generated
	 */
	String getComponent();

	/**
	 * Sets the value of the '{@link intent.ExplicitIntent#getComponent <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' attribute.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(String value);

} // ExplicitIntent
