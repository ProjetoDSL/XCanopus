/**
 * generated by Xtext 2.16.0
 */
package org.unipampa.lesse.xCanopus.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.unipampa.lesse.xCanopus.Counter;
import org.unipampa.lesse.xCanopus.Criteria;
import org.unipampa.lesse.xCanopus.Disk;
import org.unipampa.lesse.xCanopus.Disk_IO_Counter;
import org.unipampa.lesse.xCanopus.Memory;
import org.unipampa.lesse.xCanopus.MemoryCounter;
import org.unipampa.lesse.xCanopus.Metric;
import org.unipampa.lesse.xCanopus.MetricModel;
import org.unipampa.lesse.xCanopus.Threshold;
import org.unipampa.lesse.xCanopus.TransactionCounter;
import org.unipampa.lesse.xCanopus.XCanopusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MetricModelImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MetricModelImpl#getDisk <em>Disk</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MetricModelImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MetricModelImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MetricModelImpl#getDiskCounter <em>Disk Counter</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MetricModelImpl#getTransactionCounter <em>Transaction Counter</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MetricModelImpl#getMemoryCounter <em>Memory Counter</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MetricModelImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MetricModelImpl#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricModelImpl extends MinimalEObjectImpl.Container implements MetricModel
{
  /**
   * The cached value of the '{@link #getMemory() <em>Memory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemory()
   * @generated
   * @ordered
   */
  protected Memory memory;

  /**
   * The cached value of the '{@link #getDisk() <em>Disk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisk()
   * @generated
   * @ordered
   */
  protected Disk disk;

  /**
   * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriteria()
   * @generated
   * @ordered
   */
  protected EList<Criteria> criteria;

  /**
   * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected EList<Threshold> threshold;

  /**
   * The cached value of the '{@link #getDiskCounter() <em>Disk Counter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiskCounter()
   * @generated
   * @ordered
   */
  protected Disk_IO_Counter diskCounter;

  /**
   * The cached value of the '{@link #getTransactionCounter() <em>Transaction Counter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactionCounter()
   * @generated
   * @ordered
   */
  protected TransactionCounter transactionCounter;

  /**
   * The cached value of the '{@link #getMemoryCounter() <em>Memory Counter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemoryCounter()
   * @generated
   * @ordered
   */
  protected MemoryCounter memoryCounter;

  /**
   * The cached value of the '{@link #getMetric() <em>Metric</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected EList<Metric> metric;

  /**
   * The cached value of the '{@link #getCounter() <em>Counter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCounter()
   * @generated
   * @ordered
   */
  protected EList<Counter> counter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetricModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XCanopusPackage.Literals.METRIC_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Memory getMemory()
  {
    return memory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMemory(Memory newMemory, NotificationChain msgs)
  {
    Memory oldMemory = memory;
    memory = newMemory;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XCanopusPackage.METRIC_MODEL__MEMORY, oldMemory, newMemory);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMemory(Memory newMemory)
  {
    if (newMemory != memory)
    {
      NotificationChain msgs = null;
      if (memory != null)
        msgs = ((InternalEObject)memory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XCanopusPackage.METRIC_MODEL__MEMORY, null, msgs);
      if (newMemory != null)
        msgs = ((InternalEObject)newMemory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XCanopusPackage.METRIC_MODEL__MEMORY, null, msgs);
      msgs = basicSetMemory(newMemory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.METRIC_MODEL__MEMORY, newMemory, newMemory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Disk getDisk()
  {
    return disk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDisk(Disk newDisk, NotificationChain msgs)
  {
    Disk oldDisk = disk;
    disk = newDisk;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XCanopusPackage.METRIC_MODEL__DISK, oldDisk, newDisk);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDisk(Disk newDisk)
  {
    if (newDisk != disk)
    {
      NotificationChain msgs = null;
      if (disk != null)
        msgs = ((InternalEObject)disk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XCanopusPackage.METRIC_MODEL__DISK, null, msgs);
      if (newDisk != null)
        msgs = ((InternalEObject)newDisk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XCanopusPackage.METRIC_MODEL__DISK, null, msgs);
      msgs = basicSetDisk(newDisk, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.METRIC_MODEL__DISK, newDisk, newDisk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Criteria> getCriteria()
  {
    if (criteria == null)
    {
      criteria = new EObjectContainmentEList<Criteria>(Criteria.class, this, XCanopusPackage.METRIC_MODEL__CRITERIA);
    }
    return criteria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Threshold> getThreshold()
  {
    if (threshold == null)
    {
      threshold = new EObjectContainmentEList<Threshold>(Threshold.class, this, XCanopusPackage.METRIC_MODEL__THRESHOLD);
    }
    return threshold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Disk_IO_Counter getDiskCounter()
  {
    return diskCounter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiskCounter(Disk_IO_Counter newDiskCounter, NotificationChain msgs)
  {
    Disk_IO_Counter oldDiskCounter = diskCounter;
    diskCounter = newDiskCounter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XCanopusPackage.METRIC_MODEL__DISK_COUNTER, oldDiskCounter, newDiskCounter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDiskCounter(Disk_IO_Counter newDiskCounter)
  {
    if (newDiskCounter != diskCounter)
    {
      NotificationChain msgs = null;
      if (diskCounter != null)
        msgs = ((InternalEObject)diskCounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XCanopusPackage.METRIC_MODEL__DISK_COUNTER, null, msgs);
      if (newDiskCounter != null)
        msgs = ((InternalEObject)newDiskCounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XCanopusPackage.METRIC_MODEL__DISK_COUNTER, null, msgs);
      msgs = basicSetDiskCounter(newDiskCounter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.METRIC_MODEL__DISK_COUNTER, newDiskCounter, newDiskCounter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TransactionCounter getTransactionCounter()
  {
    return transactionCounter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransactionCounter(TransactionCounter newTransactionCounter, NotificationChain msgs)
  {
    TransactionCounter oldTransactionCounter = transactionCounter;
    transactionCounter = newTransactionCounter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XCanopusPackage.METRIC_MODEL__TRANSACTION_COUNTER, oldTransactionCounter, newTransactionCounter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTransactionCounter(TransactionCounter newTransactionCounter)
  {
    if (newTransactionCounter != transactionCounter)
    {
      NotificationChain msgs = null;
      if (transactionCounter != null)
        msgs = ((InternalEObject)transactionCounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XCanopusPackage.METRIC_MODEL__TRANSACTION_COUNTER, null, msgs);
      if (newTransactionCounter != null)
        msgs = ((InternalEObject)newTransactionCounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XCanopusPackage.METRIC_MODEL__TRANSACTION_COUNTER, null, msgs);
      msgs = basicSetTransactionCounter(newTransactionCounter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.METRIC_MODEL__TRANSACTION_COUNTER, newTransactionCounter, newTransactionCounter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MemoryCounter getMemoryCounter()
  {
    return memoryCounter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMemoryCounter(MemoryCounter newMemoryCounter, NotificationChain msgs)
  {
    MemoryCounter oldMemoryCounter = memoryCounter;
    memoryCounter = newMemoryCounter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XCanopusPackage.METRIC_MODEL__MEMORY_COUNTER, oldMemoryCounter, newMemoryCounter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMemoryCounter(MemoryCounter newMemoryCounter)
  {
    if (newMemoryCounter != memoryCounter)
    {
      NotificationChain msgs = null;
      if (memoryCounter != null)
        msgs = ((InternalEObject)memoryCounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XCanopusPackage.METRIC_MODEL__MEMORY_COUNTER, null, msgs);
      if (newMemoryCounter != null)
        msgs = ((InternalEObject)newMemoryCounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XCanopusPackage.METRIC_MODEL__MEMORY_COUNTER, null, msgs);
      msgs = basicSetMemoryCounter(newMemoryCounter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.METRIC_MODEL__MEMORY_COUNTER, newMemoryCounter, newMemoryCounter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Metric> getMetric()
  {
    if (metric == null)
    {
      metric = new EObjectContainmentEList<Metric>(Metric.class, this, XCanopusPackage.METRIC_MODEL__METRIC);
    }
    return metric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Counter> getCounter()
  {
    if (counter == null)
    {
      counter = new EObjectContainmentEList<Counter>(Counter.class, this, XCanopusPackage.METRIC_MODEL__COUNTER);
    }
    return counter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XCanopusPackage.METRIC_MODEL__MEMORY:
        return basicSetMemory(null, msgs);
      case XCanopusPackage.METRIC_MODEL__DISK:
        return basicSetDisk(null, msgs);
      case XCanopusPackage.METRIC_MODEL__CRITERIA:
        return ((InternalEList<?>)getCriteria()).basicRemove(otherEnd, msgs);
      case XCanopusPackage.METRIC_MODEL__THRESHOLD:
        return ((InternalEList<?>)getThreshold()).basicRemove(otherEnd, msgs);
      case XCanopusPackage.METRIC_MODEL__DISK_COUNTER:
        return basicSetDiskCounter(null, msgs);
      case XCanopusPackage.METRIC_MODEL__TRANSACTION_COUNTER:
        return basicSetTransactionCounter(null, msgs);
      case XCanopusPackage.METRIC_MODEL__MEMORY_COUNTER:
        return basicSetMemoryCounter(null, msgs);
      case XCanopusPackage.METRIC_MODEL__METRIC:
        return ((InternalEList<?>)getMetric()).basicRemove(otherEnd, msgs);
      case XCanopusPackage.METRIC_MODEL__COUNTER:
        return ((InternalEList<?>)getCounter()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XCanopusPackage.METRIC_MODEL__MEMORY:
        return getMemory();
      case XCanopusPackage.METRIC_MODEL__DISK:
        return getDisk();
      case XCanopusPackage.METRIC_MODEL__CRITERIA:
        return getCriteria();
      case XCanopusPackage.METRIC_MODEL__THRESHOLD:
        return getThreshold();
      case XCanopusPackage.METRIC_MODEL__DISK_COUNTER:
        return getDiskCounter();
      case XCanopusPackage.METRIC_MODEL__TRANSACTION_COUNTER:
        return getTransactionCounter();
      case XCanopusPackage.METRIC_MODEL__MEMORY_COUNTER:
        return getMemoryCounter();
      case XCanopusPackage.METRIC_MODEL__METRIC:
        return getMetric();
      case XCanopusPackage.METRIC_MODEL__COUNTER:
        return getCounter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XCanopusPackage.METRIC_MODEL__MEMORY:
        setMemory((Memory)newValue);
        return;
      case XCanopusPackage.METRIC_MODEL__DISK:
        setDisk((Disk)newValue);
        return;
      case XCanopusPackage.METRIC_MODEL__CRITERIA:
        getCriteria().clear();
        getCriteria().addAll((Collection<? extends Criteria>)newValue);
        return;
      case XCanopusPackage.METRIC_MODEL__THRESHOLD:
        getThreshold().clear();
        getThreshold().addAll((Collection<? extends Threshold>)newValue);
        return;
      case XCanopusPackage.METRIC_MODEL__DISK_COUNTER:
        setDiskCounter((Disk_IO_Counter)newValue);
        return;
      case XCanopusPackage.METRIC_MODEL__TRANSACTION_COUNTER:
        setTransactionCounter((TransactionCounter)newValue);
        return;
      case XCanopusPackage.METRIC_MODEL__MEMORY_COUNTER:
        setMemoryCounter((MemoryCounter)newValue);
        return;
      case XCanopusPackage.METRIC_MODEL__METRIC:
        getMetric().clear();
        getMetric().addAll((Collection<? extends Metric>)newValue);
        return;
      case XCanopusPackage.METRIC_MODEL__COUNTER:
        getCounter().clear();
        getCounter().addAll((Collection<? extends Counter>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XCanopusPackage.METRIC_MODEL__MEMORY:
        setMemory((Memory)null);
        return;
      case XCanopusPackage.METRIC_MODEL__DISK:
        setDisk((Disk)null);
        return;
      case XCanopusPackage.METRIC_MODEL__CRITERIA:
        getCriteria().clear();
        return;
      case XCanopusPackage.METRIC_MODEL__THRESHOLD:
        getThreshold().clear();
        return;
      case XCanopusPackage.METRIC_MODEL__DISK_COUNTER:
        setDiskCounter((Disk_IO_Counter)null);
        return;
      case XCanopusPackage.METRIC_MODEL__TRANSACTION_COUNTER:
        setTransactionCounter((TransactionCounter)null);
        return;
      case XCanopusPackage.METRIC_MODEL__MEMORY_COUNTER:
        setMemoryCounter((MemoryCounter)null);
        return;
      case XCanopusPackage.METRIC_MODEL__METRIC:
        getMetric().clear();
        return;
      case XCanopusPackage.METRIC_MODEL__COUNTER:
        getCounter().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XCanopusPackage.METRIC_MODEL__MEMORY:
        return memory != null;
      case XCanopusPackage.METRIC_MODEL__DISK:
        return disk != null;
      case XCanopusPackage.METRIC_MODEL__CRITERIA:
        return criteria != null && !criteria.isEmpty();
      case XCanopusPackage.METRIC_MODEL__THRESHOLD:
        return threshold != null && !threshold.isEmpty();
      case XCanopusPackage.METRIC_MODEL__DISK_COUNTER:
        return diskCounter != null;
      case XCanopusPackage.METRIC_MODEL__TRANSACTION_COUNTER:
        return transactionCounter != null;
      case XCanopusPackage.METRIC_MODEL__MEMORY_COUNTER:
        return memoryCounter != null;
      case XCanopusPackage.METRIC_MODEL__METRIC:
        return metric != null && !metric.isEmpty();
      case XCanopusPackage.METRIC_MODEL__COUNTER:
        return counter != null && !counter.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MetricModelImpl