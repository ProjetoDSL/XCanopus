/**
 * generated by Xtext 2.16.0
 */
package org.unipampa.lesse.xCanopus.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.unipampa.lesse.xCanopus.COUNTER_MEMORY;
import org.unipampa.lesse.xCanopus.MemoryCounter;
import org.unipampa.lesse.xCanopus.XCanopusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MemoryCounterImpl#getCounterMemory <em>Counter Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryCounterImpl extends CounterImpl implements MemoryCounter
{
  /**
   * The cached value of the '{@link #getCounterMemory() <em>Counter Memory</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCounterMemory()
   * @generated
   * @ordered
   */
  protected EList<COUNTER_MEMORY> counterMemory;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MemoryCounterImpl()
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
    return XCanopusPackage.Literals.MEMORY_COUNTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<COUNTER_MEMORY> getCounterMemory()
  {
    if (counterMemory == null)
    {
      counterMemory = new EDataTypeEList<COUNTER_MEMORY>(COUNTER_MEMORY.class, this, XCanopusPackage.MEMORY_COUNTER__COUNTER_MEMORY);
    }
    return counterMemory;
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
      case XCanopusPackage.MEMORY_COUNTER__COUNTER_MEMORY:
        return getCounterMemory();
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
      case XCanopusPackage.MEMORY_COUNTER__COUNTER_MEMORY:
        getCounterMemory().clear();
        getCounterMemory().addAll((Collection<? extends COUNTER_MEMORY>)newValue);
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
      case XCanopusPackage.MEMORY_COUNTER__COUNTER_MEMORY:
        getCounterMemory().clear();
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
      case XCanopusPackage.MEMORY_COUNTER__COUNTER_MEMORY:
        return counterMemory != null && !counterMemory.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (counterMemory: ");
    result.append(counterMemory);
    result.append(')');
    return result.toString();
  }

} //MemoryCounterImpl