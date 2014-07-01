/**
 */
package SimpleScenario.provider;


import SimpleScenario.Capability;
import SimpleScenario.SimpleScenarioPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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
 * This is the item provider adapter for a {@link SimpleScenario.Capability} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilityItemProvider
  extends OurObjectItemProvider
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
  public CapabilityItemProvider(AdapterFactory adapterFactory)
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

      addNamePropertyDescriptor(object);
      addSearchObjectivePropertyDescriptor(object);
      addStandAlonePropertyDescriptor(object);
      addReusePropertyDescriptor(object);
      addStartDatePropertyDescriptor(object);
      addEndDatePropertyDescriptor(object);
      addStatusPropertyDescriptor(object);
      addColourPropertyDescriptor(object);
      addSequentialSchedulingPropertyDescriptor(object);
      addDecomposesPropertyDescriptor(object);
      addSatisfiedByPropertyDescriptor(object);
      addSatisfiesPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Capability_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Capability_name_feature", "_UI_Capability_type"),
         SimpleScenarioPackage.Literals.CAPABILITY__NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Search Objective feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSearchObjectivePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Capability_searchObjective_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Capability_searchObjective_feature", "_UI_Capability_type"),
         SimpleScenarioPackage.Literals.CAPABILITY__SEARCH_OBJECTIVE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Stand Alone feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addStandAlonePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Capability_standAlone_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Capability_standAlone_feature", "_UI_Capability_type"),
         SimpleScenarioPackage.Literals.CAPABILITY__STAND_ALONE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Reuse feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addReusePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Capability_reuse_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Capability_reuse_feature", "_UI_Capability_type"),
         SimpleScenarioPackage.Literals.CAPABILITY__REUSE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
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
         getString("_UI_Capability_startDate_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Capability_startDate_feature", "_UI_Capability_type"),
         SimpleScenarioPackage.Literals.CAPABILITY__START_DATE,
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
         getString("_UI_Capability_endDate_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Capability_endDate_feature", "_UI_Capability_type"),
         SimpleScenarioPackage.Literals.CAPABILITY__END_DATE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Status feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addStatusPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Capability_status_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Capability_status_feature", "_UI_Capability_type"),
         SimpleScenarioPackage.Literals.CAPABILITY__STATUS,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Colour feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addColourPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Capability_colour_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Capability_colour_feature", "_UI_Capability_type"),
         SimpleScenarioPackage.Literals.CAPABILITY__COLOUR,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Sequential Scheduling feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSequentialSchedulingPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Capability_sequentialScheduling_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Capability_sequentialScheduling_feature", "_UI_Capability_type"),
         SimpleScenarioPackage.Literals.CAPABILITY__SEQUENTIAL_SCHEDULING,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Decomposes feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDecomposesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Capability_decomposes_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Capability_decomposes_feature", "_UI_Capability_type"),
         SimpleScenarioPackage.Literals.CAPABILITY__DECOMPOSES,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Satisfied By feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSatisfiedByPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Capability_satisfiedBy_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Capability_satisfiedBy_feature", "_UI_Capability_type"),
         SimpleScenarioPackage.Literals.CAPABILITY__SATISFIED_BY,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Satisfies feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSatisfiesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Capability_satisfies_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Capability_satisfies_feature", "_UI_Capability_type"),
         SimpleScenarioPackage.Literals.CAPABILITY__SATISFIES,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This returns Capability.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Capability"));
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
    String label = ((Capability)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_Capability_type") :
      getString("_UI_Capability_type") + " " + label;
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

    switch (notification.getFeatureID(Capability.class))
    {
      case SimpleScenarioPackage.CAPABILITY__NAME:
      case SimpleScenarioPackage.CAPABILITY__SEARCH_OBJECTIVE:
      case SimpleScenarioPackage.CAPABILITY__STAND_ALONE:
      case SimpleScenarioPackage.CAPABILITY__REUSE:
      case SimpleScenarioPackage.CAPABILITY__START_DATE:
      case SimpleScenarioPackage.CAPABILITY__END_DATE:
      case SimpleScenarioPackage.CAPABILITY__STATUS:
      case SimpleScenarioPackage.CAPABILITY__COLOUR:
      case SimpleScenarioPackage.CAPABILITY__SEQUENTIAL_SCHEDULING:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
  }

}
