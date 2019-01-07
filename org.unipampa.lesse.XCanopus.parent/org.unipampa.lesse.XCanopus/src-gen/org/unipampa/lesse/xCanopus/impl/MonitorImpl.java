/**
 * generated by Xtext 2.16.0
 */
package org.unipampa.lesse.xCanopus.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.unipampa.lesse.xCanopus.HARDWARE;
import org.unipampa.lesse.xCanopus.Monitor;
import org.unipampa.lesse.xCanopus.SUT;
import org.unipampa.lesse.xCanopus.XCanopusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MonitorImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MonitorImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MonitorImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.MonitorImpl#getSut <em>Sut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitorImpl extends MinimalEObjectImpl.Container implements Monitor
{
  /**
   * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostname()
   * @generated
   * @ordered
   */
  protected static final String HOSTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostname()
   * @generated
   * @ordered
   */
  protected String hostname = HOSTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp()
   * @generated
   * @ordered
   */
  protected static final String IP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp()
   * @generated
   * @ordered
   */
  protected String ip = IP_EDEFAULT;

  /**
   * The default value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHardware()
   * @generated
   * @ordered
   */
  protected static final HARDWARE HARDWARE_EDEFAULT = HARDWARE.PHYSICAL_MACHINE;

  /**
   * The cached value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHardware()
   * @generated
   * @ordered
   */
  protected HARDWARE hardware = HARDWARE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSut() <em>Sut</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSut()
   * @generated
   * @ordered
   */
  protected EList<SUT> sut;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonitorImpl()
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
    return XCanopusPackage.Literals.MONITOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getHostname()
  {
    return hostname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHostname(String newHostname)
  {
    String oldHostname = hostname;
    hostname = newHostname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.MONITOR__HOSTNAME, oldHostname, hostname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getIp()
  {
    return ip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIp(String newIp)
  {
    String oldIp = ip;
    ip = newIp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.MONITOR__IP, oldIp, ip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HARDWARE getHardware()
  {
    return hardware;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHardware(HARDWARE newHardware)
  {
    HARDWARE oldHardware = hardware;
    hardware = newHardware == null ? HARDWARE_EDEFAULT : newHardware;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XCanopusPackage.MONITOR__HARDWARE, oldHardware, hardware));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SUT> getSut()
  {
    if (sut == null)
    {
      sut = new EObjectResolvingEList<SUT>(SUT.class, this, XCanopusPackage.MONITOR__SUT);
    }
    return sut;
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
      case XCanopusPackage.MONITOR__HOSTNAME:
        return getHostname();
      case XCanopusPackage.MONITOR__IP:
        return getIp();
      case XCanopusPackage.MONITOR__HARDWARE:
        return getHardware();
      case XCanopusPackage.MONITOR__SUT:
        return getSut();
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
      case XCanopusPackage.MONITOR__HOSTNAME:
        setHostname((String)newValue);
        return;
      case XCanopusPackage.MONITOR__IP:
        setIp((String)newValue);
        return;
      case XCanopusPackage.MONITOR__HARDWARE:
        setHardware((HARDWARE)newValue);
        return;
      case XCanopusPackage.MONITOR__SUT:
        getSut().clear();
        getSut().addAll((Collection<? extends SUT>)newValue);
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
      case XCanopusPackage.MONITOR__HOSTNAME:
        setHostname(HOSTNAME_EDEFAULT);
        return;
      case XCanopusPackage.MONITOR__IP:
        setIp(IP_EDEFAULT);
        return;
      case XCanopusPackage.MONITOR__HARDWARE:
        setHardware(HARDWARE_EDEFAULT);
        return;
      case XCanopusPackage.MONITOR__SUT:
        getSut().clear();
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
      case XCanopusPackage.MONITOR__HOSTNAME:
        return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
      case XCanopusPackage.MONITOR__IP:
        return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
      case XCanopusPackage.MONITOR__HARDWARE:
        return hardware != HARDWARE_EDEFAULT;
      case XCanopusPackage.MONITOR__SUT:
        return sut != null && !sut.isEmpty();
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
    result.append(" (hostname: ");
    result.append(hostname);
    result.append(", ip: ");
    result.append(ip);
    result.append(", hardware: ");
    result.append(hardware);
    result.append(')');
    return result.toString();
  }

} //MonitorImpl