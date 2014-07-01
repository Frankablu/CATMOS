/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CapOverTime.tests;

import CapOverTime.CapOverTimeFactory;
import CapOverTime.Measurement;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasurementTest extends TestCase
{

  /**
   * The fixture for this Measurement test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Measurement fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MeasurementTest.class);
  }

  /**
   * Constructs a new Measurement test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeasurementTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Measurement test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Measurement fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Measurement test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Measurement getFixture()
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
    setFixture(CapOverTimeFactory.eINSTANCE.createMeasurement());
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

} //MeasurementTest
