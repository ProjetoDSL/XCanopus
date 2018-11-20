/**
 * generated by Xtext 2.15.0
 */
package org.unipampa.lesse.xCanopus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disk IO Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.xCanopus.Disk_IO_Counter#getCounterDisk <em>Counter Disk</em>}</li>
 * </ul>
 *
 * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getDisk_IO_Counter()
 * @model
 * @generated
 */
public interface Disk_IO_Counter extends Counter
{
  /**
   * Returns the value of the '<em><b>Counter Disk</b></em>' attribute list.
   * The list contents are of type {@link org.unipampa.lesse.xCanopus.COUNTER_DISK}.
   * The literals are from the enumeration {@link org.unipampa.lesse.xCanopus.COUNTER_DISK}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Counter Disk</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Counter Disk</em>' attribute list.
   * @see org.unipampa.lesse.xCanopus.COUNTER_DISK
   * @see org.unipampa.lesse.xCanopus.XCanopusPackage#getDisk_IO_Counter_CounterDisk()
   * @model unique="false"
   * @generated
   */
  EList<COUNTER_DISK> getCounterDisk();

} // Disk_IO_Counter
