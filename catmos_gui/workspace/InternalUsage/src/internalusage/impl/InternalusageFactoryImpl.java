/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package internalusage.impl;

import internalusage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalusageFactoryImpl extends EFactoryImpl implements InternalusageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InternalusageFactory init()
  {
    try
    {
      InternalusageFactory theInternalusageFactory = (InternalusageFactory)EPackage.Registry.INSTANCE.getEFactory("internalusage"); 
      if (theInternalusageFactory != null)
      {
        return theInternalusageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new InternalusageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalusageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case InternalusagePackage.MAIN: return createMain();
      case InternalusagePackage.VALUE_PAIR: return createValuePair();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main createMain()
  {
    MainImpl main = new MainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuePair createValuePair()
  {
    ValuePairImpl valuePair = new ValuePairImpl();
    return valuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalusagePackage getInternalusagePackage()
  {
    return (InternalusagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static InternalusagePackage getPackage()
  {
    return InternalusagePackage.eINSTANCE;
  }

} //InternalusageFactoryImpl
