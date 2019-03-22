/**
 * generated by Xtext 2.16.0
 */
package org.unipampa.lesse.xCanopus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>and the metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.xCanopus.and_the_metric#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.and_the_metric#getInteger1 <em>Integer1</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.and_the_metric#getInteger2 <em>Integer2</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.and_the_metric#getInteger3 <em>Integer3</em>}</li>
 * </ul>
 *
 * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getand_the_metric()
 * @model
 * @generated
 */
public interface and_the_metric extends STEPS
{
  /**
   * Returns the value of the '<em><b>Metric</b></em>' attribute.
   * The literals are from the enumeration {@link org.unipampa.lesse.xCanopus.METRICTYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metric</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metric</em>' attribute.
   * @see org.unipampa.lesse.xCanopus.METRICTYPE
   * @see #setMetric(METRICTYPE)
   * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getand_the_metric_Metric()
   * @model
   * @generated
   */
  METRICTYPE getMetric();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.xCanopus.and_the_metric#getMetric <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metric</em>' attribute.
   * @see org.unipampa.lesse.xCanopus.METRICTYPE
   * @see #getMetric()
   * @generated
   */
  void setMetric(METRICTYPE value);

  /**
   * Returns the value of the '<em><b>Integer1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer1</em>' attribute.
   * @see #setInteger1(int)
   * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getand_the_metric_Integer1()
   * @model
   * @generated
   */
  int getInteger1();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.xCanopus.and_the_metric#getInteger1 <em>Integer1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer1</em>' attribute.
   * @see #getInteger1()
   * @generated
   */
  void setInteger1(int value);

  /**
   * Returns the value of the '<em><b>Integer2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer2</em>' attribute.
   * @see #setInteger2(int)
   * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getand_the_metric_Integer2()
   * @model
   * @generated
   */
  int getInteger2();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.xCanopus.and_the_metric#getInteger2 <em>Integer2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer2</em>' attribute.
   * @see #getInteger2()
   * @generated
   */
  void setInteger2(int value);

  /**
   * Returns the value of the '<em><b>Integer3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer3</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer3</em>' attribute.
   * @see #setInteger3(int)
   * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getand_the_metric_Integer3()
   * @model
   * @generated
   */
  int getInteger3();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.xCanopus.and_the_metric#getInteger3 <em>Integer3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer3</em>' attribute.
   * @see #getInteger3()
   * @generated
   */
  void setInteger3(int value);

} // and_the_metric
