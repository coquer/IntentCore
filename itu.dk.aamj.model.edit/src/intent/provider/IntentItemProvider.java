/**
 */
package intent.provider;


import intent.Intent;
import intent.IntentFactory;
import intent.IntentPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link intent.Intent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addDataPropertyDescriptor(object);
			addExceptionNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Intent_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intent_name_feature", "_UI_Intent_type"),
				 IntentPackage.Literals.INTENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Intent_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intent_type_feature", "_UI_Intent_type"),
				 IntentPackage.Literals.INTENT__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Intent_data_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intent_data_feature", "_UI_Intent_type"),
				 IntentPackage.Literals.INTENT__DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exception Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExceptionNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Intent_exceptionName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intent_exceptionName_feature", "_UI_Intent_type"),
				 IntentPackage.Literals.INTENT__EXCEPTION_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(IntentPackage.Literals.INTENT__EXTRAS);
			childrenFeatures.add(IntentPackage.Literals.INTENT__SUCESS_CALLBACK);
			childrenFeatures.add(IntentPackage.Literals.INTENT__PERMISSIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Intent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Intent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Intent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Intent_type") :
			getString("_UI_Intent_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Intent.class)) {
			case IntentPackage.INTENT__NAME:
			case IntentPackage.INTENT__TYPE:
			case IntentPackage.INTENT__DATA:
			case IntentPackage.INTENT__EXCEPTION_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IntentPackage.INTENT__EXTRAS:
			case IntentPackage.INTENT__SUCESS_CALLBACK:
			case IntentPackage.INTENT__PERMISSIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__EXTRAS,
				 IntentFactory.eINSTANCE.createBundle()));

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__EXTRAS,
				 IntentFactory.eINSTANCE.createDoubleExtra()));

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__EXTRAS,
				 IntentFactory.eINSTANCE.createIntExtra()));

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__EXTRAS,
				 IntentFactory.eINSTANCE.createCharSequenceExtra()));

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__EXTRAS,
				 IntentFactory.eINSTANCE.createCharExtra()));

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__EXTRAS,
				 IntentFactory.eINSTANCE.createBundleExtra()));

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__EXTRAS,
				 IntentFactory.eINSTANCE.createParceableExtra()));

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__EXTRAS,
				 IntentFactory.eINSTANCE.createSerializableExtra()));

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__EXTRAS,
				 IntentFactory.eINSTANCE.createFloatExtra()));

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__EXTRAS,
				 IntentFactory.eINSTANCE.createByteExtra()));

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__EXTRAS,
				 IntentFactory.eINSTANCE.createLongExtra()));

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__EXTRAS,
				 IntentFactory.eINSTANCE.createStringExtra()));

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__SUCESS_CALLBACK,
				 IntentFactory.eINSTANCE.createCallback()));

		newChildDescriptors.add
			(createChildParameter
				(IntentPackage.Literals.INTENT__PERMISSIONS,
				 IntentFactory.eINSTANCE.createPermissions()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return IntentEditPlugin.INSTANCE;
	}

}
