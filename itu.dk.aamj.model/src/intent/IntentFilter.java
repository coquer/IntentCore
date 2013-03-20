/**
 */
package intent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intent.IntentFilter#getAction <em>Action</em>}</li>
 *   <li>{@link intent.IntentFilter#getCategory <em>Category</em>}</li>
 *   <li>{@link intent.IntentFilter#getDatas <em>Datas</em>}</li>
 * </ul>
 * </p>
 *
 * @see intent.IntentPackage#getIntentFilter()
 * @model
 * @generated
 */
public interface IntentFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute list.
	 * @see intent.IntentPackage#getIntentFilter_Action()
	 * @model required="true"
	 * @generated
	 */
	EList getAction();

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
	 * @see intent.IntentPackage#getIntentFilter_Category()
	 * @model required="true"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link intent.IntentFilter#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Datas</b></em>' containment reference list.
	 * The list contents are of type {@link intent.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datas</em>' containment reference list.
	 * @see intent.IntentPackage#getIntentFilter_Datas()
	 * @model type="intent.Data" containment="true"
	 * @generated
	 */
	EList getDatas();

} // IntentFilter
