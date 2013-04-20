/**
 */
package intent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intent.Extra#getValue <em>Value</em>}</li>
 *   <li>{@link intent.Extra#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see intent.IntentPackage#getExtra()
 * @model
 * @generated
 */
public interface Extra extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see intent.IntentPackage#getExtra_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link intent.Extra#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link intent.ExtraType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see intent.ExtraType
	 * @see #setType(ExtraType)
	 * @see intent.IntentPackage#getExtra_Type()
	 * @model required="true"
	 * @generated
	 */
	ExtraType getType();

	/**
	 * Sets the value of the '{@link intent.Extra#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see intent.ExtraType
	 * @see #getType()
	 * @generated
	 */
	void setType(ExtraType value);

} // Extra
