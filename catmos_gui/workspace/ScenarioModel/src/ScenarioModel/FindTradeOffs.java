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
 * A representation of the model object '<em><b>Find Trade Offs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScenarioModel.FindTradeOffs#getComponents <em>Components</em>}</li>
 *   <li>{@link ScenarioModel.FindTradeOffs#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see ScenarioModel.ScenarioModelPackage#getFindTradeOffs()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface FindTradeOffs extends RunConfiguration
{
  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link ScenarioModel.ComponentU}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see ScenarioModel.ScenarioModelPackage#getFindTradeOffs_Components()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<ComponentU> getComponents();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link ScenarioModel.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see ScenarioModel.ScenarioModelPackage#getFindTradeOffs_Constraints()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<Constraint> getConstraints();

} // FindTradeOffs
