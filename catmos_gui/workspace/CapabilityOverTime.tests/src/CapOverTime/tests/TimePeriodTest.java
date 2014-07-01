/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CapOverTime.tests;

import CapOverTime.CapOverTimeFactory;
import CapOverTime.TimePeriod;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Period</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimePeriodTest extends TestCase
{

  /**
   * The fixture for this Time Period test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimePeriod fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TimePeriodTest.class);
  }

  /**
   * Constructs a new Time Period test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimePeriodTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Time Period test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(TimePeriod fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Time Period test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimePeriod getFixture()
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
    setFixture(CapOverTimeFactory.eINSTANCE.createTimePeriod());
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

} //TimePeriodTest
