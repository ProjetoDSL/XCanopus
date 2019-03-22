/**
 * generated by Xtext 2.16.0
 */
package org.unipampa.lesse.xCanopus.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.unipampa.lesse.xCanopus.METRICTYPE;
import org.unipampa.lesse.xCanopus.XCanopusPackage;
import org.unipampa.lesse.xCanopus.then;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>then</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.thenImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.thenImpl#getInteger1 <em>Integer1</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.thenImpl#getInteger2 <em>Integer2</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.thenImpl#getInteger3 <em>Integer3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class thenImpl extends STEPSImpl implements then
{
  /**
   * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected static final METRICTYPE METRIC_EDEFAULT = METRICTYPE.AVAILABLEMBYTESCOUNTER;

  /**
   * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected METRICTYPE metric = METRIC_EDEFAULT;

  /**
   * The default value of the '{@link #getInteger1() <em>Integer1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger1()
   * @generated
   * @ordered
   */
  protected static final int INTEGER1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInteger1() <em>Integer1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger1()
   * @generated
   * @ordered
   */
  protected int integer1 = INTEGER1_EDEFAULT;

  /**
   * The default value of the '{@link #getInteger2() <em>Integer2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger2()
   * @generated
   * @ordered
   */
  protected static final int INTEGER2_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInteger2() <em>Integer2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger2()
   * @generated
   * @ordered
   */
  protected int integer2 = INTEGER2_EDEFAULT;

  /**
   * The default value of the '{@link #getInteger3() <em>Integer3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger3()
   * @generated
   * @ordered
   */
  protected static final int INTEGER3_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInteger3() <em>Integer3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger3()
   * @generated
   * @ordered
   */
  protected int integer3 = INTEGER3_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected thenImpl()
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
    return XCanopusPackage.Literals.THEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public METRICTYPE getMetric()
  {
    return metric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMetric(METRICTYPE newMetric)
  {
    METRICTYPE oldMetric = metric;
    metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.THEN__METRIC, oldMetric, metric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getInteger1()
  {
    return integer1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInteger1(int newInteger1)
  {
    int oldInteger1 = integer1;
    integer1 = newInteger1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.THEN__INTEGER1, oldInteger1, integer1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getInteger2()
  {
    return integer2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInteger2(int newInteger2)
  {
    int oldInteger2 = integer2;
    integer2 = newInteger2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.THEN__INTEGER2, oldInteger2, integer2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getInteger3()
  {
    return integer3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInteger3(int newInteger3)
  {
    int oldInteger3 = integer3;
    integer3 = newInteger3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.THEN__INTEGER3, oldInteger3, integer3));
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
      case XCanopusPackage.THEN__METRIC:
        return getMetric();
      case XCanopusPackage.THEN__INTEGER1:
        return getInteger1();
      case XCanopusPackage.THEN__INTEGER2:
        return getInteger2();
      case XCanopusPackage.THEN__INTEGER3:
        return getInteger3();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XCanopusPackage.THEN__METRIC:
        setMetric((METRICTYPE)newValue);
        return;
      case XCanopusPackage.THEN__INTEGER1:
        setInteger1((Integer)newValue);
        return;
      case XCanopusPackage.THEN__INTEGER2:
        setInteger2((Integer)newValue);
        return;
      case XCanopusPackage.THEN__INTEGER3:
        setInteger3((Integer)newValue);
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
      case XCanopusPackage.THEN__METRIC:
        setMetric(METRIC_EDEFAULT);
        return;
      case XCanopusPackage.THEN__INTEGER1:
        setInteger1(INTEGER1_EDEFAULT);
        return;
      case XCanopusPackage.THEN__INTEGER2:
        setInteger2(INTEGER2_EDEFAULT);
        return;
      case XCanopusPackage.THEN__INTEGER3:
        setInteger3(INTEGER3_EDEFAULT);
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
      case XCanopusPackage.THEN__METRIC:
        return metric != METRIC_EDEFAULT;
      case XCanopusPackage.THEN__INTEGER1:
        return integer1 != INTEGER1_EDEFAULT;
      case XCanopusPackage.THEN__INTEGER2:
        return integer2 != INTEGER2_EDEFAULT;
      case XCanopusPackage.THEN__INTEGER3:
        return integer3 != INTEGER3_EDEFAULT;
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
    result.append(" (metric: ");
    result.append(metric);
    result.append(", integer1: ");
    result.append(integer1);
    result.append(", integer2: ");
    result.append(integer2);
    result.append(", integer3: ");
    result.append(integer3);
    result.append(')');
    return result.toString();
  }

} //thenImpl
