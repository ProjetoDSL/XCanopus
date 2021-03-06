/**
 * generated by Xtext 2.16.0
 */
package org.unipampa.lesse.xCanopus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>and workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.xCanopus.and_workload#getSut1 <em>Sut1</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.and_workload#getSuttype <em>Suttype</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.and_workload#getSut2 <em>Sut2</em>}</li>
 * </ul>
 *
 * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getand_workload()
 * @model
 * @generated
 */
public interface and_workload extends STEPS
{
  /**
   * Returns the value of the '<em><b>Sut1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sut1</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sut1</em>' reference.
   * @see #setSut1(SUT)
   * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getand_workload_Sut1()
   * @model
   * @generated
   */
  SUT getSut1();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.xCanopus.and_workload#getSut1 <em>Sut1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sut1</em>' reference.
   * @see #getSut1()
   * @generated
   */
  void setSut1(SUT value);

  /**
   * Returns the value of the '<em><b>Suttype</b></em>' attribute.
   * The literals are from the enumeration {@link org.unipampa.lesse.xCanopus.SUT_TYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suttype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suttype</em>' attribute.
   * @see org.unipampa.lesse.xCanopus.SUT_TYPE
   * @see #setSuttype(SUT_TYPE)
   * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getand_workload_Suttype()
   * @model
   * @generated
   */
  SUT_TYPE getSuttype();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.xCanopus.and_workload#getSuttype <em>Suttype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suttype</em>' attribute.
   * @see org.unipampa.lesse.xCanopus.SUT_TYPE
   * @see #getSuttype()
   * @generated
   */
  void setSuttype(SUT_TYPE value);

  /**
   * Returns the value of the '<em><b>Sut2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sut2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sut2</em>' reference.
   * @see #setSut2(SUT)
   * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getand_workload_Sut2()
   * @model
   * @generated
   */
  SUT getSut2();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.xCanopus.and_workload#getSut2 <em>Sut2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sut2</em>' reference.
   * @see #getSut2()
   * @generated
   */
  void setSut2(SUT value);

} // and_workload
