/**
 */
package SimpleScenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleScenario.Scenario#getOurObjects <em>Our Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleScenario.SimpleScenarioPackage#getScenario()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface Scenario extends EObject
{
  /**
   * Returns the value of the '<em><b>Our Objects</b></em>' containment reference list.
   * The list contents are of type {@link SimpleScenario.OurObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Our Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Our Objects</em>' containment reference list.
   * @see SimpleScenario.SimpleScenarioPackage#getScenario_OurObjects()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<OurObject> getOurObjects();

} // Scenario
