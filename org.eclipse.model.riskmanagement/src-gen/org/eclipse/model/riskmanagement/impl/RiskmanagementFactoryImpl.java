/**
 */
package org.eclipse.model.riskmanagement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.model.riskmanagement.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RiskmanagementFactoryImpl extends EFactoryImpl implements RiskmanagementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RiskmanagementFactory init() {
		try {
			RiskmanagementFactory theRiskmanagementFactory = (RiskmanagementFactory) EPackage.Registry.INSTANCE
					.getEFactory(RiskmanagementPackage.eNS_URI);
			if (theRiskmanagementFactory != null) {
				return theRiskmanagementFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RiskmanagementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskmanagementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RiskmanagementPackage.RISK:
			return createRisk();
		case RiskmanagementPackage.OPPORTUNITY:
			return createOpportunity();
		case RiskmanagementPackage.UNCERTAINTY:
			return createUncertainty();
		case RiskmanagementPackage.THREAT:
			return createThreat();
		case RiskmanagementPackage.CONTROL:
			return createControl();
		case RiskmanagementPackage.ASSET:
			return createAsset();
		case RiskmanagementPackage.VULNERABLE:
			return createVulnerable();
		case RiskmanagementPackage.CONSEQUENCE:
			return createConsequence();
		case RiskmanagementPackage.MODEL:
			return createModel();
		case RiskmanagementPackage.ASSET_BASED_MODEL:
			return createAssetBasedModel();
		case RiskmanagementPackage.SCENARIO_BASED_MODEL:
			return createScenarioBasedModel();
		case RiskmanagementPackage.SCENARIO:
			return createScenario();
		case RiskmanagementPackage.ACTION:
			return createAction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RiskmanagementPackage.VIEW:
			return createViewFromString(eDataType, initialValue);
		case RiskmanagementPackage.CONTROL_TYPE:
			return createControlTypeFromString(eDataType, initialValue);
		case RiskmanagementPackage.STATUS:
			return createStatusFromString(eDataType, initialValue);
		case RiskmanagementPackage.LIKEHOOD:
			return createLikehoodFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RiskmanagementPackage.VIEW:
			return convertViewToString(eDataType, instanceValue);
		case RiskmanagementPackage.CONTROL_TYPE:
			return convertControlTypeToString(eDataType, instanceValue);
		case RiskmanagementPackage.STATUS:
			return convertStatusToString(eDataType, instanceValue);
		case RiskmanagementPackage.LIKEHOOD:
			return convertLikehoodToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Risk createRisk() {
		RiskImpl risk = new RiskImpl();
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Opportunity createOpportunity() {
		OpportunityImpl opportunity = new OpportunityImpl();
		return opportunity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uncertainty createUncertainty() {
		UncertaintyImpl uncertainty = new UncertaintyImpl();
		return uncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threat createThreat() {
		ThreatImpl threat = new ThreatImpl();
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vulnerable createVulnerable() {
		VulnerableImpl vulnerable = new VulnerableImpl();
		return vulnerable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consequence createConsequence() {
		ConsequenceImpl consequence = new ConsequenceImpl();
		return consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetBasedModel createAssetBasedModel() {
		AssetBasedModelImpl assetBasedModel = new AssetBasedModelImpl();
		return assetBasedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScenarioBasedModel createScenarioBasedModel() {
		ScenarioBasedModelImpl scenarioBasedModel = new ScenarioBasedModelImpl();
		return scenarioBasedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createViewFromString(EDataType eDataType, String initialValue) {
		View result = View.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType createControlTypeFromString(EDataType eDataType, String initialValue) {
		ControlType result = ControlType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createLikehoodFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLikehoodToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskmanagementPackage getRiskmanagementPackage() {
		return (RiskmanagementPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RiskmanagementPackage getPackage() {
		return RiskmanagementPackage.eINSTANCE;
	}

} //RiskmanagementFactoryImpl
