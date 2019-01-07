/**
 */
package org.eclipse.model.riskmanagement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.model.riskmanagement.Asset;
import org.eclipse.model.riskmanagement.AssetBasedModel;
import org.eclipse.model.riskmanagement.RiskmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Based Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.model.riskmanagement.impl.AssetBasedModelImpl#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetBasedModelImpl extends ModelImpl implements AssetBasedModel {
	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetBasedModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskmanagementPackage.Literals.ASSET_BASED_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset getAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsset(Asset newAsset, NotificationChain msgs) {
		Asset oldAsset = asset;
		asset = newAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RiskmanagementPackage.ASSET_BASED_MODEL__ASSET, oldAsset, newAsset);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsset(Asset newAsset) {
		if (newAsset != asset) {
			NotificationChain msgs = null;
			if (asset != null)
				msgs = ((InternalEObject) asset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RiskmanagementPackage.ASSET_BASED_MODEL__ASSET, null, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject) newAsset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RiskmanagementPackage.ASSET_BASED_MODEL__ASSET, null, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiskmanagementPackage.ASSET_BASED_MODEL__ASSET,
					newAsset, newAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RiskmanagementPackage.ASSET_BASED_MODEL__ASSET:
			return basicSetAsset(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RiskmanagementPackage.ASSET_BASED_MODEL__ASSET:
			return getAsset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RiskmanagementPackage.ASSET_BASED_MODEL__ASSET:
			setAsset((Asset) newValue);
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
		case RiskmanagementPackage.ASSET_BASED_MODEL__ASSET:
			setAsset((Asset) null);
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
		case RiskmanagementPackage.ASSET_BASED_MODEL__ASSET:
			return asset != null;
		}
		return super.eIsSet(featureID);
	}

} //AssetBasedModelImpl
