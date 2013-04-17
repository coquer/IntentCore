/**
 */
package intent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intent.Callback#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see intent.IntentPackage#getCallback()
 * @model
 * @generated
 */
public interface Callback extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see intent.IntentPackage#getCallback_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link intent.Callback#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

} // Callback
