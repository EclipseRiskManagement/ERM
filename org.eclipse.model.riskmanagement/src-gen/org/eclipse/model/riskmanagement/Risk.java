/**
 */
package org.eclipse.model.riskmanagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.model.riskmanagement.Risk#getView <em>View</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.Risk#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.Risk#getImpact <em>Impact</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.Risk#getProduces <em>Produces</em>}</li>
 *   <li>{@link org.eclipse.model.riskmanagement.Risk#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getRisk()
 * @model
 * @generated
 */
public interface Risk extends EObject {
	/**
	 * Returns the value of the '<em><b>View</b></em>' attribute.
	 * The default value is <code>"Neutral"</code>.
	 * The literals are from the enumeration {@link org.eclipse.model.riskmanagement.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' attribute.
	 * @see org.eclipse.model.riskmanagement.View
	 * @see #setView(View)
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getRisk_View()
	 * @model default="Neutral" required="true"
	 * @generated
	 */
	View getView();

	/**
	 * Sets the value of the '{@link org.eclipse.model.riskmanagement.Risk#getView <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' attribute.
	 * @see org.eclipse.model.riskmanagement.View
	 * @see #getView()
	 * @generated
	 */
	void setView(View value);

	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence</em>' attribute.
	 * @see #setOccurrence(int)
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getRisk_Occurrence()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getOccurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.model.riskmanagement.Risk#getOccurrence <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence</em>' attribute.
	 * @see #getOccurrence()
	 * @generated
	 */
	void setOccurrence(int value);

	/**
	 * Returns the value of the '<em><b>Impact</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact</em>' attribute.
	 * @see #setImpact(int)
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getRisk_Impact()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getImpact();

	/**
	 * Sets the value of the '{@link org.eclipse.model.riskmanagement.Risk#getImpact <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' attribute.
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(int value);

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.model.riskmanagement.Consequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' containment reference list.
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getRisk_Produces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Consequence> getProduces();

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
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getRisk_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.model.riskmanagement.Risk#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Risk
