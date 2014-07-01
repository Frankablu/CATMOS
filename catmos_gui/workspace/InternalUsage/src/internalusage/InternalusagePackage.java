/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package internalusage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see internalusage.InternalusageFactory
 * @model kind="package"
 * @generated
 */
public interface InternalusagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "internalusage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "internalusage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "p";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InternalusagePackage eINSTANCE = internalusage.impl.InternalusagePackageImpl.init();

  /**
   * The meta object id for the '{@link internalusage.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see internalusage.impl.MainImpl
   * @see internalusage.impl.InternalusagePackageImpl#getMain()
   * @generated
   */
  int MAIN = 0;

  /**
   * The feature id for the '<em><b>Value Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__VALUE_PAIRS = 0;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link internalusage.impl.ValuePairImpl <em>Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see internalusage.impl.ValuePairImpl
   * @see internalusage.impl.InternalusagePackageImpl#getValuePair()
   * @generated
   */
  int VALUE_PAIR = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PAIR__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PAIR_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link internalusage.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main</em>'.
   * @see internalusage.Main
   * @generated
   */
  EClass getMain();

  /**
   * Returns the meta object for the containment reference list '{@link internalusage.Main#getValuePairs <em>Value Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value Pairs</em>'.
   * @see internalusage.Main#getValuePairs()
   * @see #getMain()
   * @generated
   */
  EReference getMain_ValuePairs();

  /**
   * Returns the meta object for class '{@link internalusage.ValuePair <em>Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Pair</em>'.
   * @see internalusage.ValuePair
   * @generated
   */
  EClass getValuePair();

  /**
   * Returns the meta object for the attribute '{@link internalusage.ValuePair#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see internalusage.ValuePair#getName()
   * @see #getValuePair()
   * @generated
   */
  EAttribute getValuePair_Name();

  /**
   * Returns the meta object for the attribute '{@link internalusage.ValuePair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see internalusage.ValuePair#getValue()
   * @see #getValuePair()
   * @generated
   */
  EAttribute getValuePair_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  InternalusageFactory getInternalusageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link internalusage.impl.MainImpl <em>Main</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see internalusage.impl.MainImpl
     * @see internalusage.impl.InternalusagePackageImpl#getMain()
     * @generated
     */
    EClass MAIN = eINSTANCE.getMain();

    /**
     * The meta object literal for the '<em><b>Value Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__VALUE_PAIRS = eINSTANCE.getMain_ValuePairs();

    /**
     * The meta object literal for the '{@link internalusage.impl.ValuePairImpl <em>Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see internalusage.impl.ValuePairImpl
     * @see internalusage.impl.InternalusagePackageImpl#getValuePair()
     * @generated
     */
    EClass VALUE_PAIR = eINSTANCE.getValuePair();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_PAIR__NAME = eINSTANCE.getValuePair_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_PAIR__VALUE = eINSTANCE.getValuePair_Value();

  }

} //InternalusagePackage
