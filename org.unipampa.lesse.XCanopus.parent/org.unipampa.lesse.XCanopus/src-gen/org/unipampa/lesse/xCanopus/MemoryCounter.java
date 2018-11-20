/**
 * generated by Xtext 2.15.0
 */
package org.unipampa.lesse.xCanopus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.xCanopus.MemoryCounter#getCounterMemory <em>Counter Memory</em>}</li>
 * </ul>
 *
 * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getMemoryCounter()
 * @model
 * @generated
 */
public interface MemoryCounter extends Counter
{
  /**
   * Returns the value of the '<em><b>Counter Memory</b></em>' attribute list.
   * The list contents are of type {@link org.unipampa.lesse.xCanopus.COUNTER_MEMORY}.
   * The literals are from the enumeration {@link org.unipampa.lesse.xCanopus.COUNTER_MEMORY}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Counter Memory</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Counter Memory</em>' attribute list.
   * @see org.unipampa.lesse.xCanopus.COUNTER_MEMORY
   * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getMemoryCounter_CounterMemory()
   * @model unique="false"
   * @generated
   */
  EList<COUNTER_MEMORY> getCounterMemory();

} // MemoryCounter
