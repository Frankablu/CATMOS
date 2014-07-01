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
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScenarioModel.Component#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.Component#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ScenarioModel.Component#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ScenarioModel.Component#getProvides <em>Provides</em>}</li>
 *   <li>{@link ScenarioModel.Component#getUpgrades <em>Upgrades</em>}</li>
 *   <li>{@link ScenarioModel.Component#getRequires <em>Requires</em>}</li>
 *   <li>{@link ScenarioModel.Component#getCosts <em>Costs</em>}</li>
 * </ul>
 * </p>
 *
 * @see ScenarioModel.ScenarioModelPackage#getComponent()
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
   * @see ScenarioModel.ScenarioModelPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ScenarioModel.Component#getName <em>Name</em>}' attribute.
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
   * @see ScenarioModel.ScenarioModelPackage#getComponent_StartDate()
   * @model
   * @generated
   */
  String getStartDate();

  /**
   * Sets the value of the '{@link ScenarioModel.Component#getStartDate <em>Start Date</em>}' attribute.
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
   * @see ScenarioModel.ScenarioModelPackage#getComponent_EndDate()
   * @model
   * @generated
   */
  String getEndDate();

  /**
   * Sets the value of the '{@link ScenarioModel.Component#getEndDate <em>End Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Date</em>' attribute.
   * @see #getEndDate()
   * @generated
   */
  void setEndDate(String value);

  /**
   * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
   * The list contents are of type {@link ScenarioModel.Capability}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provides</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provides</em>' containment reference list.
   * @see ScenarioModel.ScenarioModelPackage#getComponent_Provides()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<Capability> getProvides();

  /**
   * Returns the value of the '<em><b>Upgrades</b></em>' containment reference list.
   * The list contents are of type {@link ScenarioModel.CapabilityUpgrade}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upgrades</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upgrades</em>' containment reference list.
   * @see ScenarioModel.ScenarioModelPackage#getComponent_Upgrades()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<CapabilityUpgrade> getUpgrades();

  /**
   * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
   * The list contents are of type {@link ScenarioModel.Capability}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requires</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires</em>' containment reference list.
   * @see ScenarioModel.ScenarioModelPackage#getComponent_Requires()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<Capability> getRequires();

  /**
   * Returns the value of the '<em><b>Costs</b></em>' containment reference list.
   * The list contents are of type {@link ScenarioModel.Cost}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Costs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Costs</em>' containment reference list.
   * @see ScenarioModel.ScenarioModelPackage#getComponent_Costs()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<Cost> getCosts();

} // Component
