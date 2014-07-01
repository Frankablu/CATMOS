/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package internalusage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link internalusage.Main#getValuePairs <em>Value Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @see internalusage.InternalusagePackage#getMain()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface Main extends EObject
{
  /**
   * Returns the value of the '<em><b>Value Pairs</b></em>' containment reference list.
   * The list contents are of type {@link internalusage.ValuePair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Pairs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Pairs</em>' containment reference list.
   * @see internalusage.InternalusagePackage#getMain_ValuePairs()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<ValuePair> getValuePairs();

} // Main
