/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package internalusage.tests;

import internalusage.InternalusageFactory;
import internalusage.Main;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainTest extends TestCase
{

  /**
   * The fixture for this Main test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Main fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MainTest.class);
  }

  /**
   * Constructs a new Main test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Main test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Main fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Main test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Main getFixture()
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
    setFixture(InternalusageFactory.eINSTANCE.createMain());
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

} //MainTest
