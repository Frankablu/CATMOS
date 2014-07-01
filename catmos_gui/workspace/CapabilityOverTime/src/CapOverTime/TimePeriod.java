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
 * A representation of the model object '<em><b>Time Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CapOverTime.TimePeriod#getName <em>Name</em>}</li>
 *   <li>{@link CapOverTime.TimePeriod#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link CapOverTime.TimePeriod#getEndDate <em>End Date</em>}</li>
 *   <li>{@link CapOverTime.TimePeriod#getOurObjects <em>Our Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see CapOverTime.CapOverTimePackage#getTimePeriod()
 * @model annotation="gmf.node label='startDate,endDate' label.pattern='{0} - {1}'"
 * @generated
 */
public interface TimePeriod extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see CapOverTime.CapOverTimePackage#getTimePeriod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link CapOverTime.TimePeriod#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Date</em>' attribute.
   * @see #setStartDate(String)
   * @see CapOverTime.CapOverTimePackage#getTimePeriod_StartDate()
   * @model
   * @generated
   */
  String getStartDate();

  /**
   * Sets the value of the '{@link CapOverTime.TimePeriod#getStartDate <em>Start Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Date</em>' attribute.
   * @see #getStartDate()
   * @generated
   */
  void setStartDate(String value);

  /**
   * Returns the value of the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Date</em>' attribute.
   * @see #setEndDate(String)
   * @see CapOverTime.CapOverTimePackage#getTimePeriod_EndDate()
   * @model
   * @generated
   */
  String getEndDate();

  /**
   * Sets the value of the '{@link CapOverTime.TimePeriod#getEndDate <em>End Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Date</em>' attribute.
   * @see #getEndDate()
   * @generated
   */
  void setEndDate(String value);

  /**
   * Returns the value of the '<em><b>Our Objects</b></em>' containment reference list.
   * The list contents are of type {@link CapOverTime.OurObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Our Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Our Objects</em>' containment reference list.
   * @see CapOverTime.CapOverTimePackage#getTimePeriod_OurObjects()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<OurObject> getOurObjects();

} // TimePeriod
