/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.tests;

import ScenarioModel.CapabilityProvision;
import ScenarioModel.ScenarioModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Capability Provision</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilityProvisionTest extends CapabilityTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(CapabilityProvisionTest.class);
  }

  /**
   * Constructs a new Capability Provision test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapabilityProvisionTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Capability Provision test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected CapabilityProvision getFixture()
  {
    return (CapabilityProvision)fixture;
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
    setFixture(ScenarioModelFactory.eINSTANCE.createCapabilityProvision());
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

} //CapabilityProvisionTest
