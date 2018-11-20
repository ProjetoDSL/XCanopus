/**
 * generated by Xtext 2.15.0
 */
package org.unipampa.lesse.xCanopus.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.unipampa.lesse.xCanopus.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.unipampa.lesse.xCanopus.XCanopusPackage
 * @generated
 */
public class XCanopusAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XCanopusPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XCanopusAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = XCanopusPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XCanopusSwitch<Adapter> modelSwitch =
    new XCanopusSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseInclude(Include object)
      {
        return createIncludeAdapter();
      }
      @Override
      public Adapter caseMonitoring(Monitoring object)
      {
        return createMonitoringAdapter();
      }
      @Override
      public Adapter caseMetric(Metric object)
      {
        return createMetricAdapter();
      }
      @Override
      public Adapter caseCounter(Counter object)
      {
        return createCounterAdapter();
      }
      @Override
      public Adapter caseSUT(SUT object)
      {
        return createSUTAdapter();
      }
      @Override
      public Adapter caseLoadGenerator(LoadGenerator object)
      {
        return createLoadGeneratorAdapter();
      }
      @Override
      public Adapter caseMonitor(Monitor object)
      {
        return createMonitorAdapter();
      }
      @Override
      public Adapter caseMetricModel(MetricModel object)
      {
        return createMetricModelAdapter();
      }
      @Override
      public Adapter caseMemory(Memory object)
      {
        return createMemoryAdapter();
      }
      @Override
      public Adapter caseTransaction(Transaction object)
      {
        return createTransactionAdapter();
      }
      @Override
      public Adapter caseDisk(Disk object)
      {
        return createDiskAdapter();
      }
      @Override
      public Adapter caseCriteria(Criteria object)
      {
        return createCriteriaAdapter();
      }
      @Override
      public Adapter caseThreshold(Threshold object)
      {
        return createThresholdAdapter();
      }
      @Override
      public Adapter caseDisk_IO_Counter(Disk_IO_Counter object)
      {
        return createDisk_IO_CounterAdapter();
      }
      @Override
      public Adapter caseTransactionCounter(TransactionCounter object)
      {
        return createTransactionCounterAdapter();
      }
      @Override
      public Adapter caseMemoryCounter(MemoryCounter object)
      {
        return createMemoryCounterAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.Include
   * @generated
   */
  public Adapter createIncludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.Monitoring <em>Monitoring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.Monitoring
   * @generated
   */
  public Adapter createMonitoringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.Metric <em>Metric</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.Metric
   * @generated
   */
  public Adapter createMetricAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.Counter <em>Counter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.Counter
   * @generated
   */
  public Adapter createCounterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.SUT <em>SUT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.SUT
   * @generated
   */
  public Adapter createSUTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.LoadGenerator <em>Load Generator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.LoadGenerator
   * @generated
   */
  public Adapter createLoadGeneratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.Monitor <em>Monitor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.Monitor
   * @generated
   */
  public Adapter createMonitorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.MetricModel <em>Metric Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.MetricModel
   * @generated
   */
  public Adapter createMetricModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.Memory <em>Memory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.Memory
   * @generated
   */
  public Adapter createMemoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.Transaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.Transaction
   * @generated
   */
  public Adapter createTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.Disk <em>Disk</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.Disk
   * @generated
   */
  public Adapter createDiskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.Criteria <em>Criteria</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.Criteria
   * @generated
   */
  public Adapter createCriteriaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.Threshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.Threshold
   * @generated
   */
  public Adapter createThresholdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.Disk_IO_Counter <em>Disk IO Counter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.Disk_IO_Counter
   * @generated
   */
  public Adapter createDisk_IO_CounterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.TransactionCounter <em>Transaction Counter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.TransactionCounter
   * @generated
   */
  public Adapter createTransactionCounterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.unipampa.lesse.xCanopus.MemoryCounter <em>Memory Counter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.unipampa.lesse.xCanopus.MemoryCounter
   * @generated
   */
  public Adapter createMemoryCounterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //XCanopusAdapterFactory
