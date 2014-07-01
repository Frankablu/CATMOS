/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CapOverTime.impl;

import CapOverTime.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapOverTimeFactoryImpl extends EFactoryImpl implements CapOverTimeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CapOverTimeFactory init()
  {
    try
    {
      CapOverTimeFactory theCapOverTimeFactory = (CapOverTimeFactory)EPackage.Registry.INSTANCE.getEFactory("CapOverTime"); 
      if (theCapOverTimeFactory != null)
      {
        return theCapOverTimeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CapOverTimeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapOverTimeFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CapOverTimePackage.CAPABILITY_OVER_TIME: return createCapabilityOverTime();
      case CapOverTimePackage.TIME_PERIOD: return createTimePeriod();
      case CapOverTimePackage.OUR_OBJECT: return createOurObject();
      case CapOverTimePackage.CAPABILITY: return createCapability();
      case CapOverTimePackage.MEASUREMENT: return createMeasurement();
      case CapOverTimePackage.QUALITATIVE_VALUE: return createQualitativeValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapabilityOverTime createCapabilityOverTime()
  {
    CapabilityOverTimeImpl capabilityOverTime = new CapabilityOverTimeImpl();
    return capabilityOverTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimePeriod createTimePeriod()
  {
    TimePeriodImpl timePeriod = new TimePeriodImpl();
    return timePeriod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OurObject createOurObject()
  {
    OurObjectImpl ourObject = new OurObjectImpl();
    return ourObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Capability createCapability()
  {
    CapabilityImpl capability = new CapabilityImpl();
    return capability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Measurement createMeasurement()
  {
    MeasurementImpl measurement = new MeasurementImpl();
    return measurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualitativeValue createQualitativeValue()
  {
    QualitativeValueImpl qualitativeValue = new QualitativeValueImpl();
    return qualitativeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapOverTimePackage getCapOverTimePackage()
  {
    return (CapOverTimePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CapOverTimePackage getPackage()
  {
    return CapOverTimePackage.eINSTANCE;
  }

} //CapOverTimeFactoryImpl
