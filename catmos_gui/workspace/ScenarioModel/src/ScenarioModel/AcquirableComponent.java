/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acquirable Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScenarioModel.AcquirableComponent#getAcquisitionTime <em>Acquisition Time</em>}</li>
 *   <li>{@link ScenarioModel.AcquirableComponent#getLifeSpan <em>Life Span</em>}</li>
 * </ul>
 * </p>
 *
 * @see ScenarioModel.ScenarioModelPackage#getAcquirableComponent()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface AcquirableComponent extends ComponentU
{
  /**
   * Returns the value of the '<em><b>Acquisition Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acquisition Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acquisition Time</em>' attribute.
   * @see #setAcquisitionTime(String)
   * @see ScenarioModel.ScenarioModelPackage#getAcquirableComponent_AcquisitionTime()
   * @model
   * @generated
   */
  String getAcquisitionTime();

  /**
   * Sets the value of the '{@link ScenarioModel.AcquirableComponent#getAcquisitionTime <em>Acquisition Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acquisition Time</em>' attribute.
   * @see #getAcquisitionTime()
   * @generated
   */
  void setAcquisitionTime(String value);

  /**
   * Returns the value of the '<em><b>Life Span</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Life Span</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Life Span</em>' attribute.
   * @see #setLifeSpan(String)
   * @see ScenarioModel.ScenarioModelPackage#getAcquirableComponent_LifeSpan()
   * @model
   * @generated
   */
  String getLifeSpan();

  /**
   * Sets the value of the '{@link ScenarioModel.AcquirableComponent#getLifeSpan <em>Life Span</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Life Span</em>' attribute.
   * @see #getLifeSpan()
   * @generated
   */
  void setLifeSpan(String value);

} // AcquirableComponent
