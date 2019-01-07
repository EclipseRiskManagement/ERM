/**
 */
package org.eclipse.model.riskmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.model.riskmanagement.Consequence;
import org.eclipse.model.riskmanagement.Risk;
import org.eclipse.model.riskmanagement.RiskmanagementPackage;
import org.eclipse.model.riskmanagement.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.model.riskmanagement.impl.RiskImpl#getView <em>View</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.impl.RiskImpl#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.impl.RiskImpl#getImpact <em>Impact</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.impl.RiskImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.impl.RiskImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskImpl extends MinimalEObjectImpl.Container implements Risk {
	/**
	 * The default value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected static final View VIEW_EDEFAULT = View.NEUTRAL;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected View view = VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final int OCCURRENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected int occurrence = OCCURRENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpact() <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpact()
	 * @generated
	 * @ordered
	 */
	protected static final int IMPACT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getImpact() <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpact()
	 * @generated
	 * @ordered
	 */
	protected int impact = IMPACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<Consequence> produces;

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
	protected RiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskmanagementPackage.Literals.RISK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View getView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setView(View newView) {
		View oldView = view;
		view = newView == null ? VIEW_EDEFAULT : newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiskmanagementPackage.RISK__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOccurrence() {
		return occurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccurrence(int newOccurrence) {
		int oldOccurrence = occurrence;
		occurrence = newOccurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiskmanagementPackage.RISK__OCCURRENCE, oldOccurrence,
					occurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getImpact() {
		return impact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImpact(int newImpact) {
		int oldImpact = impact;
		impact = newImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiskmanagementPackage.RISK__IMPACT, oldImpact,
					impact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Consequence> getProduces() {
		if (produces == null) {
			produces = new EObjectContainmentEList<Consequence>(Consequence.class, this,
					RiskmanagementPackage.RISK__PRODUCES);
		}
		return produces;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RiskmanagementPackage.RISK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RiskmanagementPackage.RISK__PRODUCES:
			return ((InternalEList<?>) getProduces()).basicRemove(otherEnd, msgs);
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
		case RiskmanagementPackage.RISK__VIEW:
			return getView();
		case RiskmanagementPackage.RISK__OCCURRENCE:
			return getOccurrence();
		case RiskmanagementPackage.RISK__IMPACT:
			return getImpact();
		case RiskmanagementPackage.RISK__PRODUCES:
			return getProduces();
		case RiskmanagementPackage.RISK__NAME:
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
		case RiskmanagementPackage.RISK__VIEW:
			setView((View) newValue);
			return;
		case RiskmanagementPackage.RISK__OCCURRENCE:
			setOccurrence((Integer) newValue);
			return;
		case RiskmanagementPackage.RISK__IMPACT:
			setImpact((Integer) newValue);
			return;
		case RiskmanagementPackage.RISK__PRODUCES:
			getProduces().clear();
			getProduces().addAll((Collection<? extends Consequence>) newValue);
			return;
		case RiskmanagementPackage.RISK__NAME:
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
		case RiskmanagementPackage.RISK__VIEW:
			setView(VIEW_EDEFAULT);
			return;
		case RiskmanagementPackage.RISK__OCCURRENCE:
			setOccurrence(OCCURRENCE_EDEFAULT);
			return;
		case RiskmanagementPackage.RISK__IMPACT:
			setImpact(IMPACT_EDEFAULT);
			return;
		case RiskmanagementPackage.RISK__PRODUCES:
			getProduces().clear();
			return;
		case RiskmanagementPackage.RISK__NAME:
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
		case RiskmanagementPackage.RISK__VIEW:
			return view != VIEW_EDEFAULT;
		case RiskmanagementPackage.RISK__OCCURRENCE:
			return occurrence != OCCURRENCE_EDEFAULT;
		case RiskmanagementPackage.RISK__IMPACT:
			return impact != IMPACT_EDEFAULT;
		case RiskmanagementPackage.RISK__PRODUCES:
			return produces != null && !produces.isEmpty();
		case RiskmanagementPackage.RISK__NAME:
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
		result.append(" (view: ");
		result.append(view);
		result.append(", occurrence: ");
		result.append(occurrence);
		result.append(", impact: ");
		result.append(impact);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RiskImpl
