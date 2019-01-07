/**
 */
package org.eclipse.model.riskmanagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.model.riskmanagement.Control#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.Control#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.Control#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.Control#getAffects <em>Affects</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.Control#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends EObject {
	/**
	 * Returns the value of the '<em><b>Objective</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' attribute list.
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getControl_Objective()
	 * @model default="" required="true"
	 * @generated
	 */
	EList<String> getObjective();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Legal"</code>.
	 * The literals are from the enumeration {@link org.eclipse.model.riskmanagement.ControlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.model.riskmanagement.ControlType
	 * @see #setType(ControlType)
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getControl_Type()
	 * @model default="Legal" required="true"
	 * @generated
	 */
	ControlType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.model.riskmanagement.Control#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.model.riskmanagement.ControlType
	 * @see #getType()
	 * @generated
	 */
	void setType(ControlType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"New"</code>.
	 * The literals are from the enumeration {@link org.eclipse.model.riskmanagement.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.model.riskmanagement.Status
	 * @see #setStatus(Status)
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getControl_Status()
	 * @model default="New" required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.model.riskmanagement.Control#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.model.riskmanagement.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Affects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.model.riskmanagement.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affects</em>' reference list.
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getControl_Affects()
	 * @model required="true"
	 * @generated
	 */
	EList<Asset> getAffects();

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
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getControl_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.model.riskmanagement.Control#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Control
