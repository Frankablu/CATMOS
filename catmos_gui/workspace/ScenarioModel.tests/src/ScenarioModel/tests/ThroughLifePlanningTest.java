/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.tests;

import ScenarioModel.ScenarioModelFactory;
import ScenarioModel.ThroughLifePlanning;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Through Life Planning</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThroughLifePlanningTest extends RunConfigurationTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ThroughLifePlanningTest.class);
  }

  /**
   * Constructs a new Through Life Planning test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThroughLifePlanningTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Through Life Planning test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ThroughLifePlanning getFixture()
  {
    return (ThroughLifePlanning)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(ScenarioModelFactory.eINSTANCE.createThroughLifePlanning());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //ThroughLifePlanningTest
