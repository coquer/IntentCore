/**
 */
package intent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intent.Intent#getExtras <em>Extras</em>}</li>
 *   <li>{@link intent.Intent#getType <em>Type</em>}</li>
 *   <li>{@link intent.Intent#getData <em>Data</em>}</li>
 *   <li>{@link intent.Intent#getSucessCallback <em>Sucess Callback</em>}</li>
 *   <li>{@link intent.Intent#getExceptionName <em>Exception Name</em>}</li>
 *   <li>{@link intent.Intent#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @see intent.IntentPackage#getIntent()
 * @model abstract="true"
 * @generated
 */
public interface Intent extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Extras</b></em>' containment reference list.
	 * The list contents are of type {@link intent.Bundle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extras</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extras</em>' containment reference list.
	 * @see intent.IntentPackage#getIntent_Extras()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bundle> getExtras();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see intent.IntentPackage#getIntent_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link intent.Intent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see intent.IntentPackage#getIntent_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link intent.Intent#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Sucess Callback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sucess Callback</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sucess Callback</em>' containment reference.
	 * @see #setSucessCallback(Callback)
	 * @see intent.IntentPackage#getIntent_SucessCallback()
	 * @model containment="true"
	 * @generated
	 */
	Callback getSucessCallback();

	/**
	 * Sets the value of the '{@link intent.Intent#getSucessCallback <em>Sucess Callback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sucess Callback</em>' containment reference.
	 * @see #getSucessCallback()
	 * @generated
	 */
	void setSucessCallback(Callback value);

	/**
	 * Returns the value of the '<em><b>Exception Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Name</em>' attribute.
	 * @see #setExceptionName(String)
	 * @see intent.IntentPackage#getIntent_ExceptionName()
	 * @model
	 * @generated
	 */
	String getExceptionName();

	/**
	 * Sets the value of the '{@link intent.Intent#getExceptionName <em>Exception Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Name</em>' attribute.
	 * @see #getExceptionName()
	 * @generated
	 */
	void setExceptionName(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link intent.Permissions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see intent.IntentPackage#getIntent_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permissions> getPermissions();

} // Intent
