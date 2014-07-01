/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.tests;

import ScenarioModel.DesireLow;
import ScenarioModel.ScenarioModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Desire Low</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DesireLowTest extends ConstraintTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(DesireLowTest.class);
  }

  /**
   * Constructs a new Desire Low test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DesireLowTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Desire Low test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected DesireLow getFixture()
  {
    return (DesireLow)fixture;
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
    setFixture(ScenarioModelFactory.eINSTANCE.createDesireLow());
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

} //DesireLowTest
