/**
 * generated by Xtext 2.16.0
 */
package org.unipampa.lesse.xCanopus.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.unipampa.lesse.xCanopus.POSTCONDITION;
import org.unipampa.lesse.xCanopus.XCanopusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>POSTCONDITION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.POSTCONDITIONImpl#getWGT <em>WGT</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.POSTCONDITIONImpl#getTHE <em>THE</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.POSTCONDITIONImpl#getATL <em>ATL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class POSTCONDITIONImpl extends MinimalEObjectImpl.Container implements POSTCONDITION
{
  /**
   * The default value of the '{@link #getWGT() <em>WGT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWGT()
   * @generated
   * @ordered
   */
  protected static final String WGT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWGT() <em>WGT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWGT()
   * @generated
   * @ordered
   */
  protected String wgt = WGT_EDEFAULT;

  /**
   * The default value of the '{@link #getTHE() <em>THE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTHE()
   * @generated
   * @ordered
   */
  protected static final String THE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTHE() <em>THE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTHE()
   * @generated
   * @ordered
   */
  protected String the = THE_EDEFAULT;

  /**
   * The default value of the '{@link #getATL() <em>ATL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getATL()
   * @generated
   * @ordered
   */
  protected static final String ATL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getATL() <em>ATL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getATL()
   * @generated
   * @ordered
   */
  protected String atl = ATL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected POSTCONDITIONImpl()
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
    return XCanopusPackage.Literals.POSTCONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getWGT()
  {
    return wgt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWGT(String newWGT)
  {
    String oldWGT = wgt;
    wgt = newWGT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.POSTCONDITION__WGT, oldWGT, wgt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTHE()
  {
    return the;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTHE(String newTHE)
  {
    String oldTHE = the;
    the = newTHE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.POSTCONDITION__THE, oldTHE, the));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getATL()
  {
    return atl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setATL(String newATL)
  {
    String oldATL = atl;
    atl = newATL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.POSTCONDITION__ATL, oldATL, atl));
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
      case XCanopusPackage.POSTCONDITION__WGT:
        return getWGT();
      case XCanopusPackage.POSTCONDITION__THE:
        return getTHE();
      case XCanopusPackage.POSTCONDITION__ATL:
        return getATL();
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
      case XCanopusPackage.POSTCONDITION__WGT:
        setWGT((String)newValue);
        return;
      case XCanopusPackage.POSTCONDITION__THE:
        setTHE((String)newValue);
        return;
      case XCanopusPackage.POSTCONDITION__ATL:
        setATL((String)newValue);
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
      case XCanopusPackage.POSTCONDITION__WGT:
        setWGT(WGT_EDEFAULT);
        return;
      case XCanopusPackage.POSTCONDITION__THE:
        setTHE(THE_EDEFAULT);
        return;
      case XCanopusPackage.POSTCONDITION__ATL:
        setATL(ATL_EDEFAULT);
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
      case XCanopusPackage.POSTCONDITION__WGT:
        return WGT_EDEFAULT == null ? wgt != null : !WGT_EDEFAULT.equals(wgt);
      case XCanopusPackage.POSTCONDITION__THE:
        return THE_EDEFAULT == null ? the != null : !THE_EDEFAULT.equals(the);
      case XCanopusPackage.POSTCONDITION__ATL:
        return ATL_EDEFAULT == null ? atl != null : !ATL_EDEFAULT.equals(atl);
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
    result.append(" (WGT: ");
    result.append(wgt);
    result.append(", THE: ");
    result.append(the);
    result.append(", ATL: ");
    result.append(atl);
    result.append(')');
    return result.toString();
  }

} //POSTCONDITIONImpl
