/**
 */
package SimpleScenario;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleScenario.Component#getName <em>Name</em>}</li>
 *   <li>{@link SimpleScenario.Component#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link SimpleScenario.Component#getEndDate <em>End Date</em>}</li>
 *   <li>{@link SimpleScenario.Component#getProvides <em>Provides</em>}</li>
 *   <li>{@link SimpleScenario.Component#getUpgrades <em>Upgrades</em>}</li>
 *   <li>{@link SimpleScenario.Component#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleScenario.SimpleScenarioPackage#getComponent()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Component extends OurObject
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
   * @see SimpleScenario.SimpleScenarioPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link SimpleScenario.Component#getName <em>Name</em>}' attribute.
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
   * @see SimpleScenario.SimpleScenarioPackage#getComponent_StartDate()
   * @model
   * @generated
   */
  String getStartDate();

  /**
   * Sets the value of the '{@link SimpleScenario.Component#getStartDate <em>Start Date</em>}' attribute.
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
   * @see SimpleScenario.SimpleScenarioPackage#getComponent_EndDate()
   * @model
   * @generated
   */
  String getEndDate();

  /**
   * Sets the value of the '{@link SimpleScenario.Component#getEndDate <em>End Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Date</em>' attribute.
   * @see #getEndDate()
   * @generated
   */
  void setEndDate(String value);

  /**
   * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
   * The list contents are of type {@link SimpleScenario.Capability}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provides</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provides</em>' containment reference list.
   * @see SimpleScenario.SimpleScenarioPackage#getComponent_Provides()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<Capability> getProvides();

  /**
   * Returns the value of the '<em><b>Upgrades</b></em>' containment reference list.
   * The list contents are of type {@link SimpleScenario.CapabilityUpgrade}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upgrades</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upgrades</em>' containment reference list.
   * @see SimpleScenario.SimpleScenarioPackage#getComponent_Upgrades()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<CapabilityUpgrade> getUpgrades();

  /**
   * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
   * The list contents are of type {@link SimpleScenario.Capability}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requires</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires</em>' containment reference list.
   * @see SimpleScenario.SimpleScenarioPackage#getComponent_Requires()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<Capability> getRequires();

} // Component
