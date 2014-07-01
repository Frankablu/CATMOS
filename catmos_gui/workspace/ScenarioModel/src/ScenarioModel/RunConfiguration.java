/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScenarioModel.RunConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.RunConfiguration#getPopSize <em>Pop Size</em>}</li>
 *   <li>{@link ScenarioModel.RunConfiguration#getGenCount <em>Gen Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see ScenarioModel.ScenarioModelPackage#getRunConfiguration()
 * @model
 * @generated
 */
public interface RunConfiguration extends OurObject
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
   * @see ScenarioModel.ScenarioModelPackage#getRunConfiguration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ScenarioModel.RunConfiguration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pop Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pop Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pop Size</em>' attribute.
   * @see #setPopSize(Integer)
   * @see ScenarioModel.ScenarioModelPackage#getRunConfiguration_PopSize()
   * @model
   * @generated
   */
  Integer getPopSize();

  /**
   * Sets the value of the '{@link ScenarioModel.RunConfiguration#getPopSize <em>Pop Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pop Size</em>' attribute.
   * @see #getPopSize()
   * @generated
   */
  void setPopSize(Integer value);

  /**
   * Returns the value of the '<em><b>Gen Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gen Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen Count</em>' attribute.
   * @see #setGenCount(Integer)
   * @see ScenarioModel.ScenarioModelPackage#getRunConfiguration_GenCount()
   * @model
   * @generated
   */
  Integer getGenCount();

  /**
   * Sets the value of the '{@link ScenarioModel.RunConfiguration#getGenCount <em>Gen Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gen Count</em>' attribute.
   * @see #getGenCount()
   * @generated
   */
  void setGenCount(Integer value);

} // RunConfiguration
