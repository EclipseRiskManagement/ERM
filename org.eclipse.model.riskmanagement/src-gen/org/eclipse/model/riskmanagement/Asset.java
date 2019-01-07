/**
 */
package org.eclipse.model.riskmanagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.model.riskmanagement.Asset#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.Asset#getHas <em>Has</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.Asset#getCauses <em>Causes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getAsset_Name()
	 * @model default="" id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.model.riskmanagement.Asset#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.model.riskmanagement.Vulnerable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' reference list.
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getAsset_Has()
	 * @model required="true"
	 * @generated
	 */
	EList<Vulnerable> getHas();

	/**
	 * Returns the value of the '<em><b>Causes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.model.riskmanagement.Risk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Causes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causes</em>' containment reference list.
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getAsset_Causes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Risk> getCauses();

} // Asset
