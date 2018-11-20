/**
 * generated by Xtext 2.15.0
 */
package org.unipampa.lesse.xCanopus;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.unipampa.lesse.xCanopus.XCanopusPackage
 * @generated
 */
public interface XCanopusFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XCanopusFactory eINSTANCE = org.unipampa.lesse.xCanopus.impl.XCanopusFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include</em>'.
   * @generated
   */
  Include createInclude();

  /**
   * Returns a new object of class '<em>Monitoring</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Monitoring</em>'.
   * @generated
   */
  Monitoring createMonitoring();

  /**
   * Returns a new object of class '<em>Metric</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metric</em>'.
   * @generated
   */
  Metric createMetric();

  /**
   * Returns a new object of class '<em>Counter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Counter</em>'.
   * @generated
   */
  Counter createCounter();

  /**
   * Returns a new object of class '<em>SUT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SUT</em>'.
   * @generated
   */
  SUT createSUT();

  /**
   * Returns a new object of class '<em>Load Generator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load Generator</em>'.
   * @generated
   */
  LoadGenerator createLoadGenerator();

  /**
   * Returns a new object of class '<em>Monitor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Monitor</em>'.
   * @generated
   */
  Monitor createMonitor();

  /**
   * Returns a new object of class '<em>Metric Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metric Model</em>'.
   * @generated
   */
  MetricModel createMetricModel();

  /**
   * Returns a new object of class '<em>Memory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Memory</em>'.
   * @generated
   */
  Memory createMemory();

  /**
   * Returns a new object of class '<em>Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transaction</em>'.
   * @generated
   */
  Transaction createTransaction();

  /**
   * Returns a new object of class '<em>Disk</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disk</em>'.
   * @generated
   */
  Disk createDisk();

  /**
   * Returns a new object of class '<em>Criteria</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Criteria</em>'.
   * @generated
   */
  Criteria createCriteria();

  /**
   * Returns a new object of class '<em>Threshold</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Threshold</em>'.
   * @generated
   */
  Threshold createThreshold();

  /**
   * Returns a new object of class '<em>Disk IO Counter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disk IO Counter</em>'.
   * @generated
   */
  Disk_IO_Counter createDisk_IO_Counter();

  /**
   * Returns a new object of class '<em>Transaction Counter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transaction Counter</em>'.
   * @generated
   */
  TransactionCounter createTransactionCounter();

  /**
   * Returns a new object of class '<em>Memory Counter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Memory Counter</em>'.
   * @generated
   */
  MemoryCounter createMemoryCounter();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XCanopusPackage getXCanopusPackage();

} //XCanopusFactory
