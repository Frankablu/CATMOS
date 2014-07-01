/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.provider;


import ScenarioModel.ScenarioModelFactory;
import ScenarioModel.ScenarioModelPackage;
import ScenarioModel.ThroughLifePlanning;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ScenarioModel.ThroughLifePlanning} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThroughLifePlanningItemProvider
  extends RunConfigurationItemProvider
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThroughLifePlanningItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addStartDatePropertyDescriptor(object);
      addEndDatePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Start Date feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addStartDatePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ThroughLifePlanning_startDate_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ThroughLifePlanning_startDate_feature", "_UI_ThroughLifePlanning_type"),
         ScenarioModelPackage.Literals.THROUGH_LIFE_PLANNING__START_DATE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the End Date feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addEndDatePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ThroughLifePlanning_endDate_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ThroughLifePlanning_endDate_feature", "_UI_ThroughLifePlanning_type"),
         ScenarioModelPackage.Literals.THROUGH_LIFE_PLANNING__END_DATE,
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
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(ScenarioModelPackage.Literals.THROUGH_LIFE_PLANNING__COMPONENTS);
      childrenFeatures.add(ScenarioModelPackage.Literals.THROUGH_LIFE_PLANNING__CONSTRAINTS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns ThroughLifePlanning.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/ThroughLifePlanning"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((ThroughLifePlanning)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_ThroughLifePlanning_type") :
      getString("_UI_ThroughLifePlanning_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(ThroughLifePlanning.class))
    {
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__START_DATE:
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__END_DATE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__COMPONENTS:
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__CONSTRAINTS:
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
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (ScenarioModelPackage.Literals.THROUGH_LIFE_PLANNING__COMPONENTS,
         ScenarioModelFactory.eINSTANCE.createComponentU()));

    newChildDescriptors.add
      (createChildParameter
        (ScenarioModelPackage.Literals.THROUGH_LIFE_PLANNING__COMPONENTS,
         ScenarioModelFactory.eINSTANCE.createExistingComponent()));

    newChildDescriptors.add
      (createChildParameter
        (ScenarioModelPackage.Literals.THROUGH_LIFE_PLANNING__COMPONENTS,
         ScenarioModelFactory.eINSTANCE.createAcquirableComponent()));

    newChildDescriptors.add
      (createChildParameter
        (ScenarioModelPackage.Literals.THROUGH_LIFE_PLANNING__CONSTRAINTS,
         ScenarioModelFactory.eINSTANCE.createConstraint()));

    newChildDescriptors.add
      (createChildParameter
        (ScenarioModelPackage.Literals.THROUGH_LIFE_PLANNING__CONSTRAINTS,
         ScenarioModelFactory.eINSTANCE.createDesireHigh()));

    newChildDescriptors.add
      (createChildParameter
        (ScenarioModelPackage.Literals.THROUGH_LIFE_PLANNING__CONSTRAINTS,
         ScenarioModelFactory.eINSTANCE.createDesireLow()));

    newChildDescriptors.add
      (createChildParameter
        (ScenarioModelPackage.Literals.THROUGH_LIFE_PLANNING__CONSTRAINTS,
         ScenarioModelFactory.eINSTANCE.createBudget()));
  }

}
