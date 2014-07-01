/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScenarioModel.Capability#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.Capability#getSearchObjective <em>Search Objective</em>}</li>
 *   <li>{@link ScenarioModel.Capability#getStandAlone <em>Stand Alone</em>}</li>
 *   <li>{@link ScenarioModel.Capability#getReuse <em>Reuse</em>}</li>
 *   <li>{@link ScenarioModel.Capability#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ScenarioModel.Capability#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ScenarioModel.Capability#getStatus <em>Status</em>}</li>
 *   <li>{@link ScenarioModel.Capability#getColour <em>Colour</em>}</li>
 *   <li>{@link ScenarioModel.Capability#getSequentialScheduling <em>Sequential Scheduling</em>}</li>
 *   <li>{@link ScenarioModel.Capability#getAccumulation <em>Accumulation</em>}</li>
 *   <li>{@link ScenarioModel.Capability#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link ScenarioModel.Capability#getDecomposes <em>Decomposes</em>}</li>
 *   <li>{@link ScenarioModel.Capability#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link ScenarioModel.Capability#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 * </p>
 *
 * @see ScenarioModel.ScenarioModelPackage#getCapability()
 * @model annotation="gmf.node label='name,colour' label.pattern='{0} : {1}'"
 * @generated
 */
public interface Capability extends OurObject
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
   * @see ScenarioModel.ScenarioModelPackage#getCapability_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ScenarioModel.Capability#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Search Objective</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Search Objective</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Search Objective</em>' attribute.
   * @see #setSearchObjective(Boolean)
   * @see ScenarioModel.ScenarioModelPackage#getCapability_SearchObjective()
   * @model
   * @generated
   */
  Boolean getSearchObjective();

  /**
   * Sets the value of the '{@link ScenarioModel.Capability#getSearchObjective <em>Search Objective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Search Objective</em>' attribute.
   * @see #getSearchObjective()
   * @generated
   */
  void setSearchObjective(Boolean value);

  /**
   * Returns the value of the '<em><b>Stand Alone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stand Alone</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stand Alone</em>' attribute.
   * @see #setStandAlone(Boolean)
   * @see ScenarioModel.ScenarioModelPackage#getCapability_StandAlone()
   * @model
   * @generated
   */
  Boolean getStandAlone();

  /**
   * Sets the value of the '{@link ScenarioModel.Capability#getStandAlone <em>Stand Alone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stand Alone</em>' attribute.
   * @see #getStandAlone()
   * @generated
   */
  void setStandAlone(Boolean value);

  /**
   * Returns the value of the '<em><b>Reuse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reuse</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reuse</em>' attribute.
   * @see #setReuse(Integer)
   * @see ScenarioModel.ScenarioModelPackage#getCapability_Reuse()
   * @model
   * @generated
   */
  Integer getReuse();

  /**
   * Sets the value of the '{@link ScenarioModel.Capability#getReuse <em>Reuse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reuse</em>' attribute.
   * @see #getReuse()
   * @generated
   */
  void setReuse(Integer value);

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
   * @see ScenarioModel.ScenarioModelPackage#getCapability_StartDate()
   * @model
   * @generated
   */
  String getStartDate();

  /**
   * Sets the value of the '{@link ScenarioModel.Capability#getStartDate <em>Start Date</em>}' attribute.
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
   * @see ScenarioModel.ScenarioModelPackage#getCapability_EndDate()
   * @model
   * @generated
   */
  String getEndDate();

  /**
   * Sets the value of the '{@link ScenarioModel.Capability#getEndDate <em>End Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Date</em>' attribute.
   * @see #getEndDate()
   * @generated
   */
  void setEndDate(String value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see #setStatus(Float)
   * @see ScenarioModel.ScenarioModelPackage#getCapability_Status()
   * @model
   * @generated
   */
  Float getStatus();

  /**
   * Sets the value of the '{@link ScenarioModel.Capability#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see #getStatus()
   * @generated
   */
  void setStatus(Float value);

  /**
   * Returns the value of the '<em><b>Colour</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Colour</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colour</em>' attribute.
   * @see #setColour(String)
   * @see ScenarioModel.ScenarioModelPackage#getCapability_Colour()
   * @model
   * @generated
   */
  String getColour();

  /**
   * Sets the value of the '{@link ScenarioModel.Capability#getColour <em>Colour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Colour</em>' attribute.
   * @see #getColour()
   * @generated
   */
  void setColour(String value);

  /**
   * Returns the value of the '<em><b>Sequential Scheduling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequential Scheduling</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequential Scheduling</em>' attribute.
   * @see #setSequentialScheduling(Boolean)
   * @see ScenarioModel.ScenarioModelPackage#getCapability_SequentialScheduling()
   * @model
   * @generated
   */
  Boolean getSequentialScheduling();

  /**
   * Sets the value of the '{@link ScenarioModel.Capability#getSequentialScheduling <em>Sequential Scheduling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequential Scheduling</em>' attribute.
   * @see #getSequentialScheduling()
   * @generated
   */
  void setSequentialScheduling(Boolean value);

  /**
   * Returns the value of the '<em><b>Accumulation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accumulation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accumulation</em>' reference.
   * @see #setAccumulation(Measurement)
   * @see ScenarioModel.ScenarioModelPackage#getCapability_Accumulation()
   * @model annotation="gmf.link target.decoration='arrow' style='dash' color='0,0,255'"
   * @generated
   */
  Measurement getAccumulation();

  /**
   * Sets the value of the '{@link ScenarioModel.Capability#getAccumulation <em>Accumulation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accumulation</em>' reference.
   * @see #getAccumulation()
   * @generated
   */
  void setAccumulation(Measurement value);

  /**
   * Returns the value of the '<em><b>Measurements</b></em>' containment reference list.
   * The list contents are of type {@link ScenarioModel.Measurement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measurements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measurements</em>' containment reference list.
   * @see ScenarioModel.ScenarioModelPackage#getCapability_Measurements()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<Measurement> getMeasurements();

  /**
   * Returns the value of the '<em><b>Decomposes</b></em>' reference list.
   * The list contents are of type {@link ScenarioModel.Capability}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decomposes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decomposes</em>' reference list.
   * @see ScenarioModel.ScenarioModelPackage#getCapability_Decomposes()
   * @model annotation="gmf.link target.decoration='arrow' style='dash' color='0,0,255'"
   * @generated
   */
  EList<Capability> getDecomposes();

  /**
   * Returns the value of the '<em><b>Satisfied By</b></em>' reference list.
   * The list contents are of type {@link ScenarioModel.Capability}.
   * It is bidirectional and its opposite is '{@link ScenarioModel.Capability#getSatisfies <em>Satisfies</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Satisfied By</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Satisfied By</em>' reference list.
   * @see ScenarioModel.ScenarioModelPackage#getCapability_SatisfiedBy()
   * @see ScenarioModel.Capability#getSatisfies
   * @model opposite="satisfies"
   * @generated
   */
  EList<Capability> getSatisfiedBy();

  /**
   * Returns the value of the '<em><b>Satisfies</b></em>' reference list.
   * The list contents are of type {@link ScenarioModel.Capability}.
   * It is bidirectional and its opposite is '{@link ScenarioModel.Capability#getSatisfiedBy <em>Satisfied By</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Satisfies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Satisfies</em>' reference list.
   * @see ScenarioModel.ScenarioModelPackage#getCapability_Satisfies()
   * @see ScenarioModel.Capability#getSatisfiedBy
   * @model opposite="satisfiedBy"
   *        annotation="gmf.link target.decoration='arrow' style='dash' color='0,0,255'"
   * @generated
   */
  EList<Capability> getSatisfies();

} // Capability
