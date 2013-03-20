/**
 */
package intent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 * </ul>
 * </p>
 *
 * @see intent.IntentPackage#getIntent()
 * @model
 * @generated
 */
public interface Intent extends EObject {
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
	 * @model type="intent.Bundle" containment="true"
	 * @generated
	 */
	EList getExtras();

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

} // Intent
