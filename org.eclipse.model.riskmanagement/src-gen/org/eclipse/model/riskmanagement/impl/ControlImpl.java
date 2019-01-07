/**
 */
package org.eclipse.model.riskmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.model.riskmanagement.Asset;
import org.eclipse.model.riskmanagement.Control;
import org.eclipse.model.riskmanagement.ControlType;
import org.eclipse.model.riskmanagement.RiskmanagementPackage;
import org.eclipse.model.riskmanagement.Status;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.model.riskmanagement.impl.ControlImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.impl.ControlImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.impl.ControlImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.impl.ControlImpl#getAffects <em>Affects</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.impl.ControlImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends MinimalEObjectImpl.Container implements Control {
	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected EList<String> objective;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ControlType TYPE_EDEFAULT = ControlType.LEGAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ControlType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.NEW;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAffects() <em>Affects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffects()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> affects;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskmanagementPackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getObjective() {
		if (objective == null) {
			objective = new EDataTypeUniqueEList<String>(String.class, this, RiskmanagementPackage.CONTROL__OBJECTIVE);
		}
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ControlType newType) {
		ControlType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiskmanagementPackage.CONTROL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiskmanagementPackage.CONTROL__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getAffects() {
		if (affects == null) {
			affects = new EObjectResolvingEList<Asset>(Asset.class, this, RiskmanagementPackage.CONTROL__AFFECTS);
		}
		return affects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiskmanagementPackage.CONTROL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RiskmanagementPackage.CONTROL__OBJECTIVE:
			return getObjective();
		case RiskmanagementPackage.CONTROL__TYPE:
			return getType();
		case RiskmanagementPackage.CONTROL__STATUS:
			return getStatus();
		case RiskmanagementPackage.CONTROL__AFFECTS:
			return getAffects();
		case RiskmanagementPackage.CONTROL__NAME:
			return getName();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RiskmanagementPackage.CONTROL__OBJECTIVE:
			getObjective().clear();
			getObjective().addAll((Collection<? extends String>) newValue);
			return;
		case RiskmanagementPackage.CONTROL__TYPE:
			setType((ControlType) newValue);
			return;
		case RiskmanagementPackage.CONTROL__STATUS:
			setStatus((Status) newValue);
			return;
		case RiskmanagementPackage.CONTROL__AFFECTS:
			getAffects().clear();
			getAffects().addAll((Collection<? extends Asset>) newValue);
			return;
		case RiskmanagementPackage.CONTROL__NAME:
			setName((String) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case RiskmanagementPackage.CONTROL__OBJECTIVE:
			getObjective().clear();
			return;
		case RiskmanagementPackage.CONTROL__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case RiskmanagementPackage.CONTROL__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case RiskmanagementPackage.CONTROL__AFFECTS:
			getAffects().clear();
			return;
		case RiskmanagementPackage.CONTROL__NAME:
			setName(NAME_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RiskmanagementPackage.CONTROL__OBJECTIVE:
			return objective != null && !objective.isEmpty();
		case RiskmanagementPackage.CONTROL__TYPE:
			return type != TYPE_EDEFAULT;
		case RiskmanagementPackage.CONTROL__STATUS:
			return status != STATUS_EDEFAULT;
		case RiskmanagementPackage.CONTROL__AFFECTS:
			return affects != null && !affects.isEmpty();
		case RiskmanagementPackage.CONTROL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (objective: ");
		result.append(objective);
		result.append(", type: ");
		result.append(type);
		result.append(", status: ");
		result.append(status);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ControlImpl
