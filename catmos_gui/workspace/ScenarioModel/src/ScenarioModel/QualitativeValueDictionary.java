/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualitative Value Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScenarioModel.QualitativeValueDictionary#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.QualitativeValueDictionary#getGreaterThan <em>Greater Than</em>}</li>
 *   <li>{@link ScenarioModel.QualitativeValueDictionary#getLessThan <em>Less Than</em>}</li>
 * </ul>
 * </p>
 *
 * @see ScenarioModel.ScenarioModelPackage#getQualitativeValueDictionary()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface QualitativeValueDictionary extends OurObject
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
   * @see ScenarioModel.ScenarioModelPackage#getQualitativeValueDictionary_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ScenarioModel.QualitativeValueDictionary#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Greater Than</b></em>' reference.
   * It is bidirectional and its opposite is '{@link ScenarioModel.QualitativeValueDictionary#getLessThan <em>Less Than</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Greater Than</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greater Than</em>' reference.
   * @see #setGreaterThan(QualitativeValueDictionary)
   * @see ScenarioModel.ScenarioModelPackage#getQualitativeValueDictionary_GreaterThan()
   * @see ScenarioModel.QualitativeValueDictionary#getLessThan
   * @model opposite="lessThan"
   *        annotation="gmf.link target.decoration='arrow' style='dash' color='0,56,186'"
   * @generated
   */
  QualitativeValueDictionary getGreaterThan();

  /**
   * Sets the value of the '{@link ScenarioModel.QualitativeValueDictionary#getGreaterThan <em>Greater Than</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Greater Than</em>' reference.
   * @see #getGreaterThan()
   * @generated
   */
  void setGreaterThan(QualitativeValueDictionary value);

  /**
   * Returns the value of the '<em><b>Less Than</b></em>' reference.
   * It is bidirectional and its opposite is '{@link ScenarioModel.QualitativeValueDictionary#getGreaterThan <em>Greater Than</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Less Than</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Less Than</em>' reference.
   * @see #setLessThan(QualitativeValueDictionary)
   * @see ScenarioModel.ScenarioModelPackage#getQualitativeValueDictionary_LessThan()
   * @see ScenarioModel.QualitativeValueDictionary#getGreaterThan
   * @model opposite="greaterThan"
   * @generated
   */
  QualitativeValueDictionary getLessThan();

  /**
   * Sets the value of the '{@link ScenarioModel.QualitativeValueDictionary#getLessThan <em>Less Than</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Less Than</em>' reference.
   * @see #getLessThan()
   * @generated
   */
  void setLessThan(QualitativeValueDictionary value);

} // QualitativeValueDictionary
