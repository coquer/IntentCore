/**
 */
package intent.impl;

import intent.Data;
import intent.IntentFilter;
import intent.IntentPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intent.impl.IntentFilterImpl#getAction <em>Action</em>}</li>
 *   <li>{@link intent.impl.IntentFilterImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link intent.impl.IntentFilterImpl#getDatas <em>Datas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentFilterImpl extends EObjectImpl implements IntentFilter {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList action;

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
	 * The cached value of the '{@link #getDatas() <em>Datas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatas()
	 * @generated
	 * @ordered
	 */
	protected EList datas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IntentPackage.Literals.INTENT_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAction() {
		if (action == null) {
			action = new EDataTypeUniqueEList(String.class, this, IntentPackage.INTENT_FILTER__ACTION);
		}
		return action;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.INTENT_FILTER__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDatas() {
		if (datas == null) {
			datas = new EObjectContainmentEList(Data.class, this, IntentPackage.INTENT_FILTER__DATAS);
		}
		return datas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntentPackage.INTENT_FILTER__DATAS:
				return ((InternalEList)getDatas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntentPackage.INTENT_FILTER__ACTION:
				return getAction();
			case IntentPackage.INTENT_FILTER__CATEGORY:
				return getCategory();
			case IntentPackage.INTENT_FILTER__DATAS:
				return getDatas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntentPackage.INTENT_FILTER__ACTION:
				getAction().clear();
				getAction().addAll((Collection)newValue);
				return;
			case IntentPackage.INTENT_FILTER__CATEGORY:
				setCategory((String)newValue);
				return;
			case IntentPackage.INTENT_FILTER__DATAS:
				getDatas().clear();
				getDatas().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case IntentPackage.INTENT_FILTER__ACTION:
				getAction().clear();
				return;
			case IntentPackage.INTENT_FILTER__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case IntentPackage.INTENT_FILTER__DATAS:
				getDatas().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntentPackage.INTENT_FILTER__ACTION:
				return action != null && !action.isEmpty();
			case IntentPackage.INTENT_FILTER__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case IntentPackage.INTENT_FILTER__DATAS:
				return datas != null && !datas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (action: ");
		result.append(action);
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //IntentFilterImpl
