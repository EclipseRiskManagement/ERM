/**
 */
package org.eclipse.model.riskmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Based Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.model.riskmanagement.ScenarioBasedModel#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getScenarioBasedModel()
 * @model
 * @generated
 */
public interface ScenarioBasedModel extends Model {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.model.riskmanagement.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference list.
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getScenarioBasedModel_Scenario()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Scenario> getScenario();

} // ScenarioBasedModel
