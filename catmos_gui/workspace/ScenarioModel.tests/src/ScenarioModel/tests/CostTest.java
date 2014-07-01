/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.tests;

import ScenarioModel.Cost;
import ScenarioModel.ScenarioModelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cost</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CostTest extends TestCase
{

  /**
   * The fixture for this Cost test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Cost fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(CostTest.class);
  }

  /**
   * Constructs a new Cost test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CostTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Cost test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Cost fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Cost test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Cost getFixture()
  {
    return fixture;
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
    setFixture(ScenarioModelFactory.eINSTANCE.createCost());
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

} //CostTest
