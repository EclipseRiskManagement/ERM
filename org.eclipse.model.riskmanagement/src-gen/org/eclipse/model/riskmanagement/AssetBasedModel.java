/**
 */
package org.eclipse.model.riskmanagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Based Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.model.riskmanagement.AssetBasedModel#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getAssetBasedModel()
 * @model
 * @generated
 */
public interface AssetBasedModel extends Model {
	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' containment reference.
	 * @see #setAsset(Asset)
	 * @see org.eclipse.model.riskmanagement.RiskmanagementPackage#getAssetBasedModel_Asset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link org.eclipse.model.riskmanagement.AssetBasedModel#getAsset <em>Asset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' containment reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

} // AssetBasedModel
