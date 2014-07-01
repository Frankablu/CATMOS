/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CapOverTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualitative Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CapOverTime.QualitativeValue#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see CapOverTime.CapOverTimePackage#getQualitativeValue()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface QualitativeValue extends EObject
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
   * @see CapOverTime.CapOverTimePackage#getQualitativeValue_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link CapOverTime.QualitativeValue#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // QualitativeValue
