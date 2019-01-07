/**
 * generated by Xtext 2.16.0
 */
package org.unipampa.lesse.xCanopus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.xCanopus.Model#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.Model#getMonitorings <em>Monitorings</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.Model#getSuts <em>Suts</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.Model#getLoadGenerators <em>Load Generators</em>}</li>
 * </ul>
 *
 * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link org.unipampa.lesse.xCanopus.Include}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getModel_Includes()
   * @model containment="true"
   * @generated
   */
  EList<Include> getIncludes();

  /**
   * Returns the value of the '<em><b>Monitorings</b></em>' containment reference list.
   * The list contents are of type {@link org.unipampa.lesse.xCanopus.Monitoring}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Monitorings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Monitorings</em>' containment reference list.
   * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getModel_Monitorings()
   * @model containment="true"
   * @generated
   */
  EList<Monitoring> getMonitorings();

  /**
   * Returns the value of the '<em><b>Suts</b></em>' containment reference list.
   * The list contents are of type {@link org.unipampa.lesse.xCanopus.SUT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suts</em>' containment reference list.
   * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getModel_Suts()
   * @model containment="true"
   * @generated
   */
  EList<SUT> getSuts();

  /**
   * Returns the value of the '<em><b>Load Generators</b></em>' containment reference list.
   * The list contents are of type {@link org.unipampa.lesse.xCanopus.LoadGenerator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Load Generators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Load Generators</em>' containment reference list.
   * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getModel_LoadGenerators()
   * @model containment="true"
   * @generated
   */
  EList<LoadGenerator> getLoadGenerators();

} // Model
