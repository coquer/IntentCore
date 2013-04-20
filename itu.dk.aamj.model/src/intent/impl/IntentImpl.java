/**
 */
package intent.impl;

import intent.Callback;
import intent.Extra;
import intent.Intent;
import intent.IntentPackage;
import intent.IntentType;
import intent.Permissions;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intent.impl.IntentImpl#getExtras <em>Extras</em>}</li>
 *   <li>{@link intent.impl.IntentImpl#getAction <em>Action</em>}</li>
 *   <li>{@link intent.impl.IntentImpl#getIntentType <em>Intent Type</em>}</li>
 *   <li>{@link intent.impl.IntentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link intent.impl.IntentImpl#getType <em>Type</em>}</li>
 *   <li>{@link intent.impl.IntentImpl#getData <em>Data</em>}</li>
 *   <li>{@link intent.impl.IntentImpl#getSucessCallback <em>Sucess Callback</em>}</li>
 *   <li>{@link intent.impl.IntentImpl#getExceptionName <em>Exception Name</em>}</li>
 *   <li>{@link intent.impl.IntentImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentImpl extends NamedElementImpl implements Intent {
	/**
	 * The cached value of the '{@link #getExtras() <em>Extras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtras()
	 * @generated
	 * @ordered
	 */
	protected EList<Extra> extras;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntentType() <em>Intent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntentType()
	 * @generated
	 * @ordered
	 */
	protected static final IntentType INTENT_TYPE_EDEFAULT = IntentType.STANDARD;

	/**
	 * The cached value of the '{@link #getIntentType() <em>Intent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntentType()
	 * @generated
	 * @ordered
	 */
	protected IntentType intentType = INTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSucessCallback() <em>Sucess Callback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucessCallback()
	 * @generated
	 * @ordered
	 */
	protected Callback sucessCallback;

	/**
	 * The default value of the '{@link #getExceptionName() <em>Exception Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionName() <em>Exception Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionName()
	 * @generated
	 * @ordered
	 */
	protected String exceptionName = EXCEPTION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permissions> permissions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentPackage.Literals.INTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extra> getExtras() {
		if (extras == null) {
			extras = new EObjectContainmentEList<Extra>(Extra.class, this, IntentPackage.INTENT__EXTRAS);
		}
		return extras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.INTENT__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentType getIntentType() {
		return intentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntentType(IntentType newIntentType) {
		IntentType oldIntentType = intentType;
		intentType = newIntentType == null ? INTENT_TYPE_EDEFAULT : newIntentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.INTENT__INTENT_TYPE, oldIntentType, intentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.INTENT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.INTENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.INTENT__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callback getSucessCallback() {
		return sucessCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSucessCallback(Callback newSucessCallback, NotificationChain msgs) {
		Callback oldSucessCallback = sucessCallback;
		sucessCallback = newSucessCallback;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntentPackage.INTENT__SUCESS_CALLBACK, oldSucessCallback, newSucessCallback);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSucessCallback(Callback newSucessCallback) {
		if (newSucessCallback != sucessCallback) {
			NotificationChain msgs = null;
			if (sucessCallback != null)
				msgs = ((InternalEObject)sucessCallback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntentPackage.INTENT__SUCESS_CALLBACK, null, msgs);
			if (newSucessCallback != null)
				msgs = ((InternalEObject)newSucessCallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntentPackage.INTENT__SUCESS_CALLBACK, null, msgs);
			msgs = basicSetSucessCallback(newSucessCallback, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.INTENT__SUCESS_CALLBACK, newSucessCallback, newSucessCallback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExceptionName() {
		return exceptionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionName(String newExceptionName) {
		String oldExceptionName = exceptionName;
		exceptionName = newExceptionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.INTENT__EXCEPTION_NAME, oldExceptionName, exceptionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permissions> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectContainmentEList<Permissions>(Permissions.class, this, IntentPackage.INTENT__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntentPackage.INTENT__EXTRAS:
				return ((InternalEList<?>)getExtras()).basicRemove(otherEnd, msgs);
			case IntentPackage.INTENT__SUCESS_CALLBACK:
				return basicSetSucessCallback(null, msgs);
			case IntentPackage.INTENT__PERMISSIONS:
				return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntentPackage.INTENT__EXTRAS:
				return getExtras();
			case IntentPackage.INTENT__ACTION:
				return getAction();
			case IntentPackage.INTENT__INTENT_TYPE:
				return getIntentType();
			case IntentPackage.INTENT__CATEGORY:
				return getCategory();
			case IntentPackage.INTENT__TYPE:
				return getType();
			case IntentPackage.INTENT__DATA:
				return getData();
			case IntentPackage.INTENT__SUCESS_CALLBACK:
				return getSucessCallback();
			case IntentPackage.INTENT__EXCEPTION_NAME:
				return getExceptionName();
			case IntentPackage.INTENT__PERMISSIONS:
				return getPermissions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntentPackage.INTENT__EXTRAS:
				getExtras().clear();
				getExtras().addAll((Collection<? extends Extra>)newValue);
				return;
			case IntentPackage.INTENT__ACTION:
				setAction((String)newValue);
				return;
			case IntentPackage.INTENT__INTENT_TYPE:
				setIntentType((IntentType)newValue);
				return;
			case IntentPackage.INTENT__CATEGORY:
				setCategory((String)newValue);
				return;
			case IntentPackage.INTENT__TYPE:
				setType((String)newValue);
				return;
			case IntentPackage.INTENT__DATA:
				setData((String)newValue);
				return;
			case IntentPackage.INTENT__SUCESS_CALLBACK:
				setSucessCallback((Callback)newValue);
				return;
			case IntentPackage.INTENT__EXCEPTION_NAME:
				setExceptionName((String)newValue);
				return;
			case IntentPackage.INTENT__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends Permissions>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IntentPackage.INTENT__EXTRAS:
				getExtras().clear();
				return;
			case IntentPackage.INTENT__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case IntentPackage.INTENT__INTENT_TYPE:
				setIntentType(INTENT_TYPE_EDEFAULT);
				return;
			case IntentPackage.INTENT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case IntentPackage.INTENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IntentPackage.INTENT__DATA:
				setData(DATA_EDEFAULT);
				return;
			case IntentPackage.INTENT__SUCESS_CALLBACK:
				setSucessCallback((Callback)null);
				return;
			case IntentPackage.INTENT__EXCEPTION_NAME:
				setExceptionName(EXCEPTION_NAME_EDEFAULT);
				return;
			case IntentPackage.INTENT__PERMISSIONS:
				getPermissions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntentPackage.INTENT__EXTRAS:
				return extras != null && !extras.isEmpty();
			case IntentPackage.INTENT__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case IntentPackage.INTENT__INTENT_TYPE:
				return intentType != INTENT_TYPE_EDEFAULT;
			case IntentPackage.INTENT__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case IntentPackage.INTENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case IntentPackage.INTENT__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case IntentPackage.INTENT__SUCESS_CALLBACK:
				return sucessCallback != null;
			case IntentPackage.INTENT__EXCEPTION_NAME:
				return EXCEPTION_NAME_EDEFAULT == null ? exceptionName != null : !EXCEPTION_NAME_EDEFAULT.equals(exceptionName);
			case IntentPackage.INTENT__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (action: ");
		result.append(action);
		result.append(", intentType: ");
		result.append(intentType);
		result.append(", category: ");
		result.append(category);
		result.append(", type: ");
		result.append(type);
		result.append(", data: ");
		result.append(data);
		result.append(", exceptionName: ");
		result.append(exceptionName);
		result.append(')');
		return result.toString();
	}

} //IntentImpl
