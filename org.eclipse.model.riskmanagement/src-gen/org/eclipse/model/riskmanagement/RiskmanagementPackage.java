/**
 */
package org.eclipse.model.riskmanagement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.model.riskmanagement.RiskmanagementFactory
 * @model kind="package"
 * @generated
 */
public interface RiskmanagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "riskmanagement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/riskmanagement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "riskmanagement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RiskmanagementPackage eINSTANCE = org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.impl.RiskImpl <em>Risk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.impl.RiskImpl
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getRisk()
	 * @generated
	 */
	int RISK = 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__VIEW = 0;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__OCCURRENCE = 1;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__IMPACT = 2;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__PRODUCES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__NAME = 4;

	/**
	 * The number of structural features of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.impl.OpportunityImpl <em>Opportunity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.impl.OpportunityImpl
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getOpportunity()
	 * @generated
	 */
	int OPPORTUNITY = 1;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY__VIEW = RISK__VIEW;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY__OCCURRENCE = RISK__OCCURRENCE;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY__IMPACT = RISK__IMPACT;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY__PRODUCES = RISK__PRODUCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY__NAME = RISK__NAME;

	/**
	 * The number of structural features of the '<em>Opportunity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_FEATURE_COUNT = RISK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Opportunity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_OPERATION_COUNT = RISK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.impl.UncertaintyImpl <em>Uncertainty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.impl.UncertaintyImpl
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getUncertainty()
	 * @generated
	 */
	int UNCERTAINTY = 2;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__VIEW = RISK__VIEW;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__OCCURRENCE = RISK__OCCURRENCE;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__IMPACT = RISK__IMPACT;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__PRODUCES = RISK__PRODUCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__NAME = RISK__NAME;

	/**
	 * The number of structural features of the '<em>Uncertainty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_FEATURE_COUNT = RISK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uncertainty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_OPERATION_COUNT = RISK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.impl.ThreatImpl <em>Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.impl.ThreatImpl
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getThreat()
	 * @generated
	 */
	int THREAT = 3;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__VIEW = RISK__VIEW;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__OCCURRENCE = RISK__OCCURRENCE;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__IMPACT = RISK__IMPACT;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__PRODUCES = RISK__PRODUCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__NAME = RISK__NAME;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = RISK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_OPERATION_COUNT = RISK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.impl.ControlImpl
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 4;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__OBJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__AFFECTS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = 4;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.impl.AssetImpl
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__HAS = 1;

	/**
	 * The feature id for the '<em><b>Causes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CAUSES = 2;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.impl.VulnerableImpl <em>Vulnerable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.impl.VulnerableImpl
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getVulnerable()
	 * @generated
	 */
	int VULNERABLE = 6;

	/**
	 * The feature id for the '<em><b>Indicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE__INDICATES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Vulnerable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vulnerable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.impl.ConsequenceImpl <em>Consequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.impl.ConsequenceImpl
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getConsequence()
	 * @generated
	 */
	int CONSEQUENCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Consequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Consequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.impl.ModelImpl
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.impl.AssetBasedModelImpl <em>Asset Based Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.impl.AssetBasedModelImpl
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getAssetBasedModel()
	 * @generated
	 */
	int ASSET_BASED_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_BASED_MODEL__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_BASED_MODEL__ASSET = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asset Based Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_BASED_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Asset Based Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_BASED_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.impl.ScenarioBasedModelImpl <em>Scenario Based Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.impl.ScenarioBasedModelImpl
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getScenarioBasedModel()
	 * @generated
	 */
	int SCENARIO_BASED_MODEL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BASED_MODEL__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BASED_MODEL__SCENARIO = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scenario Based Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BASED_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scenario Based Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BASED_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.impl.ScenarioImpl
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subscenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SUBSCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ACTION = 2;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.impl.ActionImpl
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ASSET = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.View <em>View</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.View
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.ControlType <em>Control Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.ControlType
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getControlType()
	 * @generated
	 */
	int CONTROL_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.model.riskmanagement.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.model.riskmanagement.Status
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 15;

	/**
	 * The meta object id for the '<em>Likehood</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getLikehood()
	 * @generated
	 */
	int LIKEHOOD = 16;

	/**
	 * Returns the meta object for class '{@link org.eclipse.model.riskmanagement.Risk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk</em>'.
	 * @see org.eclipse.model.riskmanagement.Risk
	 * @generated
	 */
	EClass getRisk();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.model.riskmanagement.Risk#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.eclipse.model.riskmanagement.Risk#getView()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_View();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.model.riskmanagement.Risk#getOccurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurrence</em>'.
	 * @see org.eclipse.model.riskmanagement.Risk#getOccurrence()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Occurrence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.model.riskmanagement.Risk#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact</em>'.
	 * @see org.eclipse.model.riskmanagement.Risk#getImpact()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Impact();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.model.riskmanagement.Risk#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Produces</em>'.
	 * @see org.eclipse.model.riskmanagement.Risk#getProduces()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_Produces();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.model.riskmanagement.Risk#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.model.riskmanagement.Risk#getName()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.model.riskmanagement.Opportunity <em>Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opportunity</em>'.
	 * @see org.eclipse.model.riskmanagement.Opportunity
	 * @generated
	 */
	EClass getOpportunity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.model.riskmanagement.Uncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uncertainty</em>'.
	 * @see org.eclipse.model.riskmanagement.Uncertainty
	 * @generated
	 */
	EClass getUncertainty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.model.riskmanagement.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat</em>'.
	 * @see org.eclipse.model.riskmanagement.Threat
	 * @generated
	 */
	EClass getThreat();

	/**
	 * Returns the meta object for class '{@link org.eclipse.model.riskmanagement.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see org.eclipse.model.riskmanagement.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.model.riskmanagement.Control#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Objective</em>'.
	 * @see org.eclipse.model.riskmanagement.Control#getObjective()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Objective();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.model.riskmanagement.Control#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.model.riskmanagement.Control#getType()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.model.riskmanagement.Control#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eclipse.model.riskmanagement.Control#getStatus()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Status();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.model.riskmanagement.Control#getAffects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affects</em>'.
	 * @see org.eclipse.model.riskmanagement.Control#getAffects()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Affects();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.model.riskmanagement.Control#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.model.riskmanagement.Control#getName()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.model.riskmanagement.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see org.eclipse.model.riskmanagement.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.model.riskmanagement.Asset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.model.riskmanagement.Asset#getName()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.model.riskmanagement.Asset#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has</em>'.
	 * @see org.eclipse.model.riskmanagement.Asset#getHas()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.model.riskmanagement.Asset#getCauses <em>Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Causes</em>'.
	 * @see org.eclipse.model.riskmanagement.Asset#getCauses()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Causes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.model.riskmanagement.Vulnerable <em>Vulnerable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerable</em>'.
	 * @see org.eclipse.model.riskmanagement.Vulnerable
	 * @generated
	 */
	EClass getVulnerable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.model.riskmanagement.Vulnerable#getIndicates <em>Indicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Indicates</em>'.
	 * @see org.eclipse.model.riskmanagement.Vulnerable#getIndicates()
	 * @see #getVulnerable()
	 * @generated
	 */
	EReference getVulnerable_Indicates();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.model.riskmanagement.Vulnerable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.model.riskmanagement.Vulnerable#getName()
	 * @see #getVulnerable()
	 * @generated
	 */
	EAttribute getVulnerable_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.model.riskmanagement.Consequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consequence</em>'.
	 * @see org.eclipse.model.riskmanagement.Consequence
	 * @generated
	 */
	EClass getConsequence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.model.riskmanagement.Consequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.model.riskmanagement.Consequence#getName()
	 * @see #getConsequence()
	 * @generated
	 */
	EAttribute getConsequence_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.model.riskmanagement.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.model.riskmanagement.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.model.riskmanagement.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.model.riskmanagement.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.model.riskmanagement.AssetBasedModel <em>Asset Based Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Based Model</em>'.
	 * @see org.eclipse.model.riskmanagement.AssetBasedModel
	 * @generated
	 */
	EClass getAssetBasedModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.model.riskmanagement.AssetBasedModel#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asset</em>'.
	 * @see org.eclipse.model.riskmanagement.AssetBasedModel#getAsset()
	 * @see #getAssetBasedModel()
	 * @generated
	 */
	EReference getAssetBasedModel_Asset();

	/**
	 * Returns the meta object for class '{@link org.eclipse.model.riskmanagement.ScenarioBasedModel <em>Scenario Based Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Based Model</em>'.
	 * @see org.eclipse.model.riskmanagement.ScenarioBasedModel
	 * @generated
	 */
	EClass getScenarioBasedModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.model.riskmanagement.ScenarioBasedModel#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario</em>'.
	 * @see org.eclipse.model.riskmanagement.ScenarioBasedModel#getScenario()
	 * @see #getScenarioBasedModel()
	 * @generated
	 */
	EReference getScenarioBasedModel_Scenario();

	/**
	 * Returns the meta object for class '{@link org.eclipse.model.riskmanagement.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.eclipse.model.riskmanagement.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.model.riskmanagement.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.model.riskmanagement.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.model.riskmanagement.Scenario#getSubscenario <em>Subscenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscenario</em>'.
	 * @see org.eclipse.model.riskmanagement.Scenario#getSubscenario()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Subscenario();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.model.riskmanagement.Scenario#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.eclipse.model.riskmanagement.Scenario#getAction()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Action();

	/**
	 * Returns the meta object for class '{@link org.eclipse.model.riskmanagement.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.eclipse.model.riskmanagement.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.model.riskmanagement.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.model.riskmanagement.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.model.riskmanagement.Action#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset</em>'.
	 * @see org.eclipse.model.riskmanagement.Action#getAsset()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Asset();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.model.riskmanagement.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>View</em>'.
	 * @see org.eclipse.model.riskmanagement.View
	 * @generated
	 */
	EEnum getView();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.model.riskmanagement.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Type</em>'.
	 * @see org.eclipse.model.riskmanagement.ControlType
	 * @generated
	 */
	EEnum getControlType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.model.riskmanagement.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see org.eclipse.model.riskmanagement.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Likehood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Likehood</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getLikehood();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RiskmanagementFactory getRiskmanagementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.impl.RiskImpl <em>Risk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.impl.RiskImpl
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getRisk()
		 * @generated
		 */
		EClass RISK = eINSTANCE.getRisk();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__VIEW = eINSTANCE.getRisk_View();

		/**
		 * The meta object literal for the '<em><b>Occurrence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__OCCURRENCE = eINSTANCE.getRisk_Occurrence();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__IMPACT = eINSTANCE.getRisk_Impact();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK__PRODUCES = eINSTANCE.getRisk_Produces();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__NAME = eINSTANCE.getRisk_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.impl.OpportunityImpl <em>Opportunity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.impl.OpportunityImpl
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getOpportunity()
		 * @generated
		 */
		EClass OPPORTUNITY = eINSTANCE.getOpportunity();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.impl.UncertaintyImpl <em>Uncertainty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.impl.UncertaintyImpl
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getUncertainty()
		 * @generated
		 */
		EClass UNCERTAINTY = eINSTANCE.getUncertainty();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.impl.ThreatImpl <em>Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.impl.ThreatImpl
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getThreat()
		 * @generated
		 */
		EClass THREAT = eINSTANCE.getThreat();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.impl.ControlImpl
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__OBJECTIVE = eINSTANCE.getControl_Objective();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__TYPE = eINSTANCE.getControl_Type();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__STATUS = eINSTANCE.getControl_Status();

		/**
		 * The meta object literal for the '<em><b>Affects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__AFFECTS = eINSTANCE.getControl_Affects();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__NAME = eINSTANCE.getControl_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.impl.AssetImpl
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__HAS = eINSTANCE.getAsset_Has();

		/**
		 * The meta object literal for the '<em><b>Causes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__CAUSES = eINSTANCE.getAsset_Causes();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.impl.VulnerableImpl <em>Vulnerable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.impl.VulnerableImpl
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getVulnerable()
		 * @generated
		 */
		EClass VULNERABLE = eINSTANCE.getVulnerable();

		/**
		 * The meta object literal for the '<em><b>Indicates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VULNERABLE__INDICATES = eINSTANCE.getVulnerable_Indicates();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABLE__NAME = eINSTANCE.getVulnerable_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.impl.ConsequenceImpl <em>Consequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.impl.ConsequenceImpl
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getConsequence()
		 * @generated
		 */
		EClass CONSEQUENCE = eINSTANCE.getConsequence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSEQUENCE__NAME = eINSTANCE.getConsequence_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.impl.ModelImpl
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.impl.AssetBasedModelImpl <em>Asset Based Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.impl.AssetBasedModelImpl
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getAssetBasedModel()
		 * @generated
		 */
		EClass ASSET_BASED_MODEL = eINSTANCE.getAssetBasedModel();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_BASED_MODEL__ASSET = eINSTANCE.getAssetBasedModel_Asset();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.impl.ScenarioBasedModelImpl <em>Scenario Based Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.impl.ScenarioBasedModelImpl
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getScenarioBasedModel()
		 * @generated
		 */
		EClass SCENARIO_BASED_MODEL = eINSTANCE.getScenarioBasedModel();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_BASED_MODEL__SCENARIO = eINSTANCE.getScenarioBasedModel_Scenario();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.impl.ScenarioImpl
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Subscenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SUBSCENARIO = eINSTANCE.getScenario_Subscenario();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__ACTION = eINSTANCE.getScenario_Action();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.impl.ActionImpl
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ASSET = eINSTANCE.getAction_Asset();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.View <em>View</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.View
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getView()
		 * @generated
		 */
		EEnum VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.ControlType <em>Control Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.ControlType
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getControlType()
		 * @generated
		 */
		EEnum CONTROL_TYPE = eINSTANCE.getControlType();

		/**
		 * The meta object literal for the '{@link org.eclipse.model.riskmanagement.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.model.riskmanagement.Status
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em>Likehood</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.model.riskmanagement.impl.RiskmanagementPackageImpl#getLikehood()
		 * @generated
		 */
		EDataType LIKEHOOD = eINSTANCE.getLikehood();

	}

} //RiskmanagementPackage
