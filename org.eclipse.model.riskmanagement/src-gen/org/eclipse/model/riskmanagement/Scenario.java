/**
 */
package org.eclipse.model.riskmanagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.model.riskmanagement.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.Scenario#getSubscenario <em>Subscenario</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.Scenario#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getScenario_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.model.riskmanagement.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subscenario</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.model.riskmanagement.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscenario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscenario</em>' containment reference list.
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getScenario_Subscenario()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getSubscenario();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.model.riskmanagement.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getScenario_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getAction();

} // Scenario
