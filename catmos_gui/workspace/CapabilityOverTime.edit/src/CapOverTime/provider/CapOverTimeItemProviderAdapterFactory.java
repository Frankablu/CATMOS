/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CapOverTime.provider;

import CapOverTime.util.CapOverTimeAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CapOverTimeItemProviderAdapterFactory extends CapOverTimeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapOverTimeItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link CapOverTime.CapabilityOverTime} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CapabilityOverTimeItemProvider capabilityOverTimeItemProvider;

  /**
   * This creates an adapter for a {@link CapOverTime.CapabilityOverTime}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createCapabilityOverTimeAdapter()
  {
    if (capabilityOverTimeItemProvider == null)
    {
      capabilityOverTimeItemProvider = new CapabilityOverTimeItemProvider(this);
    }

    return capabilityOverTimeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link CapOverTime.TimePeriod} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimePeriodItemProvider timePeriodItemProvider;

  /**
   * This creates an adapter for a {@link CapOverTime.TimePeriod}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createTimePeriodAdapter()
  {
    if (timePeriodItemProvider == null)
    {
      timePeriodItemProvider = new TimePeriodItemProvider(this);
    }

    return timePeriodItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link CapOverTime.OurObject} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OurObjectItemProvider ourObjectItemProvider;

  /**
   * This creates an adapter for a {@link CapOverTime.OurObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createOurObjectAdapter()
  {
    if (ourObjectItemProvider == null)
    {
      ourObjectItemProvider = new OurObjectItemProvider(this);
    }

    return ourObjectItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link CapOverTime.Capability} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CapabilityItemProvider capabilityItemProvider;

  /**
   * This creates an adapter for a {@link CapOverTime.Capability}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createCapabilityAdapter()
  {
    if (capabilityItemProvider == null)
    {
      capabilityItemProvider = new CapabilityItemProvider(this);
    }

    return capabilityItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link CapOverTime.Measurement} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MeasurementItemProvider measurementItemProvider;

  /**
   * This creates an adapter for a {@link CapOverTime.Measurement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMeasurementAdapter()
  {
    if (measurementItemProvider == null)
    {
      measurementItemProvider = new MeasurementItemProvider(this);
    }

    return measurementItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link CapOverTime.QualitativeValue} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualitativeValueItemProvider qualitativeValueItemProvider;

  /**
   * This creates an adapter for a {@link CapOverTime.QualitativeValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createQualitativeValueAdapter()
  {
    if (qualitativeValueItemProvider == null)
    {
      qualitativeValueItemProvider = new QualitativeValueItemProvider(this);
    }

    return qualitativeValueItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory()
  {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type)
  {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type)
  {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type)
  {
    if (isFactoryForType(type))
    {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
      {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification)
  {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null)
    {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose()
  {
    if (capabilityOverTimeItemProvider != null) capabilityOverTimeItemProvider.dispose();
    if (timePeriodItemProvider != null) timePeriodItemProvider.dispose();
    if (ourObjectItemProvider != null) ourObjectItemProvider.dispose();
    if (capabilityItemProvider != null) capabilityItemProvider.dispose();
    if (measurementItemProvider != null) measurementItemProvider.dispose();
    if (qualitativeValueItemProvider != null) qualitativeValueItemProvider.dispose();
  }

}
