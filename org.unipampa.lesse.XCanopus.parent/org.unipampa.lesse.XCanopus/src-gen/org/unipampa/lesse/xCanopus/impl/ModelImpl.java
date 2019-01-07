/**
 * generated by Xtext 2.16.0
 */
package org.unipampa.lesse.xCanopus.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.unipampa.lesse.xCanopus.Include;
import org.unipampa.lesse.xCanopus.LoadGenerator;
import org.unipampa.lesse.xCanopus.Model;
import org.unipampa.lesse.xCanopus.Monitoring;
import org.unipampa.lesse.xCanopus.SUT;
import org.unipampa.lesse.xCanopus.XCanopusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.ModelImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.ModelImpl#getMonitorings <em>Monitorings</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.ModelImpl#getSuts <em>Suts</em>}</li>
 *   <li>{@link org.unipampa.lesse.xCanopus.impl.ModelImpl#getLoadGenerators <em>Load Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<Include> includes;

  /**
   * The cached value of the '{@link #getMonitorings() <em>Monitorings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonitorings()
   * @generated
   * @ordered
   */
  protected EList<Monitoring> monitorings;

  /**
   * The cached value of the '{@link #getSuts() <em>Suts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuts()
   * @generated
   * @ordered
   */
  protected EList<SUT> suts;

  /**
   * The cached value of the '{@link #getLoadGenerators() <em>Load Generators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoadGenerators()
   * @generated
   * @ordered
   */
  protected EList<LoadGenerator> loadGenerators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return XCanopusPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Include> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectContainmentEList<Include>(Include.class, this, XCanopusPackage.MODEL__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Monitoring> getMonitorings()
  {
    if (monitorings == null)
    {
      monitorings = new EObjectContainmentEList<Monitoring>(Monitoring.class, this, XCanopusPackage.MODEL__MONITORINGS);
    }
    return monitorings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SUT> getSuts()
  {
    if (suts == null)
    {
      suts = new EObjectContainmentEList<SUT>(SUT.class, this, XCanopusPackage.MODEL__SUTS);
    }
    return suts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LoadGenerator> getLoadGenerators()
  {
    if (loadGenerators == null)
    {
      loadGenerators = new EObjectContainmentEList<LoadGenerator>(LoadGenerator.class, this, XCanopusPackage.MODEL__LOAD_GENERATORS);
    }
    return loadGenerators;
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
      case XCanopusPackage.MODEL__INCLUDES:
        return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
      case XCanopusPackage.MODEL__MONITORINGS:
        return ((InternalEList<?>)getMonitorings()).basicRemove(otherEnd, msgs);
      case XCanopusPackage.MODEL__SUTS:
        return ((InternalEList<?>)getSuts()).basicRemove(otherEnd, msgs);
      case XCanopusPackage.MODEL__LOAD_GENERATORS:
        return ((InternalEList<?>)getLoadGenerators()).basicRemove(otherEnd, msgs);
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
      case XCanopusPackage.MODEL__INCLUDES:
        return getIncludes();
      case XCanopusPackage.MODEL__MONITORINGS:
        return getMonitorings();
      case XCanopusPackage.MODEL__SUTS:
        return getSuts();
      case XCanopusPackage.MODEL__LOAD_GENERATORS:
        return getLoadGenerators();
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
      case XCanopusPackage.MODEL__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends Include>)newValue);
        return;
      case XCanopusPackage.MODEL__MONITORINGS:
        getMonitorings().clear();
        getMonitorings().addAll((Collection<? extends Monitoring>)newValue);
        return;
      case XCanopusPackage.MODEL__SUTS:
        getSuts().clear();
        getSuts().addAll((Collection<? extends SUT>)newValue);
        return;
      case XCanopusPackage.MODEL__LOAD_GENERATORS:
        getLoadGenerators().clear();
        getLoadGenerators().addAll((Collection<? extends LoadGenerator>)newValue);
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
      case XCanopusPackage.MODEL__INCLUDES:
        getIncludes().clear();
        return;
      case XCanopusPackage.MODEL__MONITORINGS:
        getMonitorings().clear();
        return;
      case XCanopusPackage.MODEL__SUTS:
        getSuts().clear();
        return;
      case XCanopusPackage.MODEL__LOAD_GENERATORS:
        getLoadGenerators().clear();
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
      case XCanopusPackage.MODEL__INCLUDES:
        return includes != null && !includes.isEmpty();
      case XCanopusPackage.MODEL__MONITORINGS:
        return monitorings != null && !monitorings.isEmpty();
      case XCanopusPackage.MODEL__SUTS:
        return suts != null && !suts.isEmpty();
      case XCanopusPackage.MODEL__LOAD_GENERATORS:
        return loadGenerators != null && !loadGenerators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl