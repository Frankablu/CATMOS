/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScenarioModel.Measurement#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.Measurement#getCriticalValue <em>Critical Value</em>}</li>
 *   <li>{@link ScenarioModel.Measurement#getBenchmarkValue <em>Benchmark Value</em>}</li>
 *   <li>{@link ScenarioModel.Measurement#getProvidedValue <em>Provided Value</em>}</li>
 *   <li>{@link ScenarioModel.Measurement#getCriticalValues <em>Critical Values</em>}</li>
 *   <li>{@link ScenarioModel.Measurement#getBenchmarkValues <em>Benchmark Values</em>}</li>
 *   <li>{@link ScenarioModel.Measurement#getProvidedValues <em>Provided Values</em>}</li>
 *   <li>{@link ScenarioModel.Measurement#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see ScenarioModel.ScenarioModelPackage#getMeasurement()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Measurement extends EObject
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
   * @see ScenarioModel.ScenarioModelPackage#getMeasurement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ScenarioModel.Measurement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Critical Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Critical Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Critical Value</em>' attribute.
   * @see #setCriticalValue(Float)
   * @see ScenarioModel.ScenarioModelPackage#getMeasurement_CriticalValue()
   * @model
   * @generated
   */
  Float getCriticalValue();

  /**
   * Sets the value of the '{@link ScenarioModel.Measurement#getCriticalValue <em>Critical Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Critical Value</em>' attribute.
   * @see #getCriticalValue()
   * @generated
   */
  void setCriticalValue(Float value);

  /**
   * Returns the value of the '<em><b>Benchmark Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Benchmark Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Benchmark Value</em>' attribute.
   * @see #setBenchmarkValue(Float)
   * @see ScenarioModel.ScenarioModelPackage#getMeasurement_BenchmarkValue()
   * @model
   * @generated
   */
  Float getBenchmarkValue();

  /**
   * Sets the value of the '{@link ScenarioModel.Measurement#getBenchmarkValue <em>Benchmark Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Benchmark Value</em>' attribute.
   * @see #getBenchmarkValue()
   * @generated
   */
  void setBenchmarkValue(Float value);

  /**
   * Returns the value of the '<em><b>Provided Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provided Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provided Value</em>' attribute.
   * @see #setProvidedValue(Float)
   * @see ScenarioModel.ScenarioModelPackage#getMeasurement_ProvidedValue()
   * @model
   * @generated
   */
  Float getProvidedValue();

  /**
   * Sets the value of the '{@link ScenarioModel.Measurement#getProvidedValue <em>Provided Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provided Value</em>' attribute.
   * @see #getProvidedValue()
   * @generated
   */
  void setProvidedValue(Float value);

  /**
   * Returns the value of the '<em><b>Critical Values</b></em>' containment reference list.
   * The list contents are of type {@link ScenarioModel.QualitativeValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Critical Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Critical Values</em>' containment reference list.
   * @see ScenarioModel.ScenarioModelPackage#getMeasurement_CriticalValues()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<QualitativeValue> getCriticalValues();

  /**
   * Returns the value of the '<em><b>Benchmark Values</b></em>' containment reference list.
   * The list contents are of type {@link ScenarioModel.QualitativeValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Benchmark Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Benchmark Values</em>' containment reference list.
   * @see ScenarioModel.ScenarioModelPackage#getMeasurement_BenchmarkValues()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<QualitativeValue> getBenchmarkValues();

  /**
   * Returns the value of the '<em><b>Provided Values</b></em>' containment reference list.
   * The list contents are of type {@link ScenarioModel.QualitativeValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provided Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provided Values</em>' containment reference list.
   * @see ScenarioModel.ScenarioModelPackage#getMeasurement_ProvidedValues()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<QualitativeValue> getProvidedValues();

  /**
   * Returns the value of the '<em><b>Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script</em>' attribute.
   * @see #setScript(String)
   * @see ScenarioModel.ScenarioModelPackage#getMeasurement_Script()
   * @model
   * @generated
   */
  String getScript();

  /**
   * Sets the value of the '{@link ScenarioModel.Measurement#getScript <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' attribute.
   * @see #getScript()
   * @generated
   */
  void setScript(String value);

} // Measurement
