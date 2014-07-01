/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CapOverTime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CapOverTime.CapOverTimePackage
 * @generated
 */
public interface CapOverTimeFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CapOverTimeFactory eINSTANCE = CapOverTime.impl.CapOverTimeFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Capability Over Time</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capability Over Time</em>'.
   * @generated
   */
  CapabilityOverTime createCapabilityOverTime();

  /**
   * Returns a new object of class '<em>Time Period</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Period</em>'.
   * @generated
   */
  TimePeriod createTimePeriod();

  /**
   * Returns a new object of class '<em>Our Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Our Object</em>'.
   * @generated
   */
  OurObject createOurObject();

  /**
   * Returns a new object of class '<em>Capability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capability</em>'.
   * @generated
   */
  Capability createCapability();

  /**
   * Returns a new object of class '<em>Measurement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Measurement</em>'.
   * @generated
   */
  Measurement createMeasurement();

  /**
   * Returns a new object of class '<em>Qualitative Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualitative Value</em>'.
   * @generated
   */
  QualitativeValue createQualitativeValue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CapOverTimePackage getCapOverTimePackage();

} //CapOverTimeFactory
