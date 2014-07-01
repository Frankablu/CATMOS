/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CapOverTime.util;

import CapOverTime.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CapOverTime.CapOverTimePackage
 * @generated
 */
public class CapOverTimeAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CapOverTimePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapOverTimeAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CapOverTimePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CapOverTimeSwitch<Adapter> modelSwitch =
    new CapOverTimeSwitch<Adapter>()
    {
      @Override
      public Adapter caseCapabilityOverTime(CapabilityOverTime object)
      {
        return createCapabilityOverTimeAdapter();
      }
      @Override
      public Adapter caseTimePeriod(TimePeriod object)
      {
        return createTimePeriodAdapter();
      }
      @Override
      public Adapter caseOurObject(OurObject object)
      {
        return createOurObjectAdapter();
      }
      @Override
      public Adapter caseCapability(Capability object)
      {
        return createCapabilityAdapter();
      }
      @Override
      public Adapter caseMeasurement(Measurement object)
      {
        return createMeasurementAdapter();
      }
      @Override
      public Adapter caseQualitativeValue(QualitativeValue object)
      {
        return createQualitativeValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link CapOverTime.CapabilityOverTime <em>Capability Over Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see CapOverTime.CapabilityOverTime
   * @generated
   */
  public Adapter createCapabilityOverTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link CapOverTime.TimePeriod <em>Time Period</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see CapOverTime.TimePeriod
   * @generated
   */
  public Adapter createTimePeriodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link CapOverTime.OurObject <em>Our Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see CapOverTime.OurObject
   * @generated
   */
  public Adapter createOurObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link CapOverTime.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see CapOverTime.Capability
   * @generated
   */
  public Adapter createCapabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link CapOverTime.Measurement <em>Measurement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see CapOverTime.Measurement
   * @generated
   */
  public Adapter createMeasurementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link CapOverTime.QualitativeValue <em>Qualitative Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see CapOverTime.QualitativeValue
   * @generated
   */
  public Adapter createQualitativeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CapOverTimeAdapterFactory
