/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package internalusage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see internalusage.InternalusagePackage
 * @generated
 */
public interface InternalusageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InternalusageFactory eINSTANCE = internalusage.impl.InternalusageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Main</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main</em>'.
   * @generated
   */
  Main createMain();

  /**
   * Returns a new object of class '<em>Value Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Pair</em>'.
   * @generated
   */
  ValuePair createValuePair();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  InternalusagePackage getInternalusagePackage();

} //InternalusageFactory
