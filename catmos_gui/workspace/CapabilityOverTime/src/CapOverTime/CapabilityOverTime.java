/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CapOverTime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Over Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CapOverTime.CapabilityOverTime#getTimePeriods <em>Time Periods</em>}</li>
 * </ul>
 * </p>
 *
 * @see CapOverTime.CapOverTimePackage#getCapabilityOverTime()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface CapabilityOverTime extends EObject
{
  /**
   * Returns the value of the '<em><b>Time Periods</b></em>' containment reference list.
   * The list contents are of type {@link CapOverTime.TimePeriod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Periods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Periods</em>' containment reference list.
   * @see CapOverTime.CapOverTimePackage#getCapabilityOverTime_TimePeriods()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<TimePeriod> getTimePeriods();

} // CapabilityOverTime
