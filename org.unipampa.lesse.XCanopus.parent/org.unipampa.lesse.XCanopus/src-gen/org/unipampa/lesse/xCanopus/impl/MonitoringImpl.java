/**
 * generated by Xtext 2.16.0
 */
package org.unipampa.lesse.xCanopus.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.unipampa.lesse.xCanopus.CONDITION;
import org.unipampa.lesse.xCanopus.Monitoring;
import org.unipampa.lesse.xCanopus.SUT;
import org.unipampa.lesse.xCanopus.SUT_TYPE;
import org.unipampa.lesse.xCanopus.XCanopusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MonitoringImpl#getSut <em>Sut</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MonitoringImpl#getSut_type <em>Sut type</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MonitoringImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MonitoringImpl#getSut_type2 <em>Sut type2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoringImpl extends MinimalEObjectImpl.Container implements Monitoring
{
  /**
   * The cached value of the '{@link #getSut() <em>Sut</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSut()
   * @generated
   * @ordered
   */
  protected SUT sut;

  /**
   * The default value of the '{@link #getSut_type() <em>Sut type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSut_type()
   * @generated
   * @ordered
   */
  protected static final SUT_TYPE SUT_TYPE_EDEFAULT = SUT_TYPE.DESKTOPAPP;

  /**
   * The cached value of the '{@link #getSut_type() <em>Sut type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSut_type()
   * @generated
   * @ordered
   */
  protected SUT_TYPE sut_type = SUT_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected CONDITION condition;

  /**
   * The default value of the '{@link #getSut_type2() <em>Sut type2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSut_type2()
   * @generated
   * @ordered
   */
  protected static final SUT_TYPE SUT_TYPE2_EDEFAULT = SUT_TYPE.DESKTOPAPP;

  /**
   * The cached value of the '{@link #getSut_type2() <em>Sut type2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSut_type2()
   * @generated
   * @ordered
   */
  protected SUT_TYPE sut_type2 = SUT_TYPE2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonitoringImpl()
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
    return XCanopusPackage.Literals.MONITORING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SUT getSut()
  {
    if (sut != null && sut.eIsProxy())
    {
      InternalEObject oldSut = (InternalEObject)sut;
      sut = (SUT)eResolveProxy(oldSut);
      if (sut != oldSut)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XCanopusPackage.MONITORING__SUT, oldSut, sut));
      }
    }
    return sut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SUT basicGetSut()
  {
    return sut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSut(SUT newSut)
  {
    SUT oldSut = sut;
    sut = newSut;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.MONITORING__SUT, oldSut, sut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SUT_TYPE getSut_type()
  {
    return sut_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSut_type(SUT_TYPE newSut_type)
  {
    SUT_TYPE oldSut_type = sut_type;
    sut_type = newSut_type == null ? SUT_TYPE_EDEFAULT : newSut_type;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.MONITORING__SUT_TYPE, oldSut_type, sut_type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CONDITION getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(CONDITION newCondition, NotificationChain msgs)
  {
    CONDITION oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XCanopusPackage.MONITORING__CONDITION, oldCondition, newCondition);
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
  public void setCondition(CONDITION newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XCanopusPackage.MONITORING__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XCanopusPackage.MONITORING__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.MONITORING__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SUT_TYPE getSut_type2()
  {
    return sut_type2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSut_type2(SUT_TYPE newSut_type2)
  {
    SUT_TYPE oldSut_type2 = sut_type2;
    sut_type2 = newSut_type2 == null ? SUT_TYPE2_EDEFAULT : newSut_type2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.MONITORING__SUT_TYPE2, oldSut_type2, sut_type2));
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
      case XCanopusPackage.MONITORING__CONDITION:
        return basicSetCondition(null, msgs);
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
      case XCanopusPackage.MONITORING__SUT:
        if (resolve) return getSut();
        return basicGetSut();
      case XCanopusPackage.MONITORING__SUT_TYPE:
        return getSut_type();
      case XCanopusPackage.MONITORING__CONDITION:
        return getCondition();
      case XCanopusPackage.MONITORING__SUT_TYPE2:
        return getSut_type2();
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
      case XCanopusPackage.MONITORING__SUT:
        setSut((SUT)newValue);
        return;
      case XCanopusPackage.MONITORING__SUT_TYPE:
        setSut_type((SUT_TYPE)newValue);
        return;
      case XCanopusPackage.MONITORING__CONDITION:
        setCondition((CONDITION)newValue);
        return;
      case XCanopusPackage.MONITORING__SUT_TYPE2:
        setSut_type2((SUT_TYPE)newValue);
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
      case XCanopusPackage.MONITORING__SUT:
        setSut((SUT)null);
        return;
      case XCanopusPackage.MONITORING__SUT_TYPE:
        setSut_type(SUT_TYPE_EDEFAULT);
        return;
      case XCanopusPackage.MONITORING__CONDITION:
        setCondition((CONDITION)null);
        return;
      case XCanopusPackage.MONITORING__SUT_TYPE2:
        setSut_type2(SUT_TYPE2_EDEFAULT);
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
      case XCanopusPackage.MONITORING__SUT:
        return sut != null;
      case XCanopusPackage.MONITORING__SUT_TYPE:
        return sut_type != SUT_TYPE_EDEFAULT;
      case XCanopusPackage.MONITORING__CONDITION:
        return condition != null;
      case XCanopusPackage.MONITORING__SUT_TYPE2:
        return sut_type2 != SUT_TYPE2_EDEFAULT;
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
    result.append(" (sut_type: ");
    result.append(sut_type);
    result.append(", sut_type2: ");
    result.append(sut_type2);
    result.append(')');
    return result.toString();
  }

} //MonitoringImpl
