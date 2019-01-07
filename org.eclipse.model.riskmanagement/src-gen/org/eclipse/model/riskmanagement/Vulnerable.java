/**
 */
package org.eclipse.model.riskmanagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vulnerable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.model.riskmanagement.Vulnerable#getIndicates <em>Indicates</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.Vulnerable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getVulnerable()
 * @model
 * @generated
 */
public interface Vulnerable extends EObject {
	/**
	 * Returns the value of the '<em><b>Indicates</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.model.riskmanagement.Consequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicates</em>' reference list.
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getVulnerable_Indicates()
	 * @model required="true"
	 * @generated
	 */
	EList<Consequence> getIndicates();

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
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getVulnerable_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.model.riskmanagement.Vulnerable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Vulnerable
