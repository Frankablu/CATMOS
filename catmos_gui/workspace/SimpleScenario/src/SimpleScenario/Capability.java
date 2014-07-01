/**
 */
package SimpleScenario;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleScenario.Capability#getName <em>Name</em>}</li>
 *   <li>{@link SimpleScenario.Capability#getSearchObjective <em>Search Objective</em>}</li>
 *   <li>{@link SimpleScenario.Capability#getStandAlone <em>Stand Alone</em>}</li>
 *   <li>{@link SimpleScenario.Capability#getReuse <em>Reuse</em>}</li>
 *   <li>{@link SimpleScenario.Capability#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link SimpleScenario.Capability#getEndDate <em>End Date</em>}</li>
 *   <li>{@link SimpleScenario.Capability#getStatus <em>Status</em>}</li>
 *   <li>{@link SimpleScenario.Capability#getColour <em>Colour</em>}</li>
 *   <li>{@link SimpleScenario.Capability#getSequentialScheduling <em>Sequential Scheduling</em>}</li>
 *   <li>{@link SimpleScenario.Capability#getDecomposes <em>Decomposes</em>}</li>
 *   <li>{@link SimpleScenario.Capability#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link SimpleScenario.Capability#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleScenario.SimpleScenarioPackage#getCapability()
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
   * @see SimpleScenario.SimpleScenarioPackage#getCapability_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link SimpleScenario.Capability#getName <em>Name</em>}' attribute.
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
   * @see SimpleScenario.SimpleScenarioPackage#getCapability_SearchObjective()
   * @model
   * @generated
   */
  Boolean getSearchObjective();

  /**
   * Sets the value of the '{@link SimpleScenario.Capability#getSearchObjective <em>Search Objective</em>}' attribute.
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
   * @see SimpleScenario.SimpleScenarioPackage#getCapability_StandAlone()
   * @model
   * @generated
   */
  Boolean getStandAlone();

  /**
   * Sets the value of the '{@link SimpleScenario.Capability#getStandAlone <em>Stand Alone</em>}' attribute.
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
   * @see SimpleScenario.SimpleScenarioPackage#getCapability_Reuse()
   * @model
   * @generated
   */
  Integer getReuse();

  /**
   * Sets the value of the '{@link SimpleScenario.Capability#getReuse <em>Reuse</em>}' attribute.
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
   * @see SimpleScenario.SimpleScenarioPackage#getCapability_StartDate()
   * @model
   * @generated
   */
  String getStartDate();

  /**
   * Sets the value of the '{@link SimpleScenario.Capability#getStartDate <em>Start Date</em>}' attribute.
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
   * @see SimpleScenario.SimpleScenarioPackage#getCapability_EndDate()
   * @model
   * @generated
   */
  String getEndDate();

  /**
   * Sets the value of the '{@link SimpleScenario.Capability#getEndDate <em>End Date</em>}' attribute.
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
   * @see SimpleScenario.SimpleScenarioPackage#getCapability_Status()
   * @model
   * @generated
   */
  Float getStatus();

  /**
   * Sets the value of the '{@link SimpleScenario.Capability#getStatus <em>Status</em>}' attribute.
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
   * @see SimpleScenario.SimpleScenarioPackage#getCapability_Colour()
   * @model
   * @generated
   */
  String getColour();

  /**
   * Sets the value of the '{@link SimpleScenario.Capability#getColour <em>Colour</em>}' attribute.
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
   * @see SimpleScenario.SimpleScenarioPackage#getCapability_SequentialScheduling()
   * @model
   * @generated
   */
  Boolean getSequentialScheduling();

  /**
   * Sets the value of the '{@link SimpleScenario.Capability#getSequentialScheduling <em>Sequential Scheduling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequential Scheduling</em>' attribute.
   * @see #getSequentialScheduling()
   * @generated
   */
  void setSequentialScheduling(Boolean value);

  /**
   * Returns the value of the '<em><b>Decomposes</b></em>' reference list.
   * The list contents are of type {@link SimpleScenario.Capability}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decomposes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decomposes</em>' reference list.
   * @see SimpleScenario.SimpleScenarioPackage#getCapability_Decomposes()
   * @model annotation="gmf.link target.decoration='arrow' style='dash' color='0,0,255'"
   * @generated
   */
  EList<Capability> getDecomposes();

  /**
   * Returns the value of the '<em><b>Satisfied By</b></em>' reference list.
   * The list contents are of type {@link SimpleScenario.Capability}.
   * It is bidirectional and its opposite is '{@link SimpleScenario.Capability#getSatisfies <em>Satisfies</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Satisfied By</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Satisfied By</em>' reference list.
   * @see SimpleScenario.SimpleScenarioPackage#getCapability_SatisfiedBy()
   * @see SimpleScenario.Capability#getSatisfies
   * @model opposite="satisfies"
   * @generated
   */
  EList<Capability> getSatisfiedBy();

  /**
   * Returns the value of the '<em><b>Satisfies</b></em>' reference list.
   * The list contents are of type {@link SimpleScenario.Capability}.
   * It is bidirectional and its opposite is '{@link SimpleScenario.Capability#getSatisfiedBy <em>Satisfied By</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Satisfies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Satisfies</em>' reference list.
   * @see SimpleScenario.SimpleScenarioPackage#getCapability_Satisfies()
   * @see SimpleScenario.Capability#getSatisfiedBy
   * @model opposite="satisfiedBy"
   *        annotation="gmf.link target.decoration='arrow' style='dash' color='0,0,255'"
   * @generated
   */
  EList<Capability> getSatisfies();

} // Capability
