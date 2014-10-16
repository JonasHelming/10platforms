/**
 */
package org.eclipsercp.e4.hyperbola.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipsercp.e4.hyperbola.model.Contact#isPrivateContact <em>Private Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipsercp.e4.hyperbola.model.ModelPackage#getContact()
 * @model
 * @generated
 */
public interface Contact extends ContactEntry {

	/**
	 * Returns the value of the '<em><b>Private Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Contact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Contact</em>' attribute.
	 * @see #setPrivateContact(boolean)
	 * @see org.eclipsercp.e4.hyperbola.model.ModelPackage#getContact_PrivateContact()
	 * @model
	 * @generated
	 */
	boolean isPrivateContact();

	/**
	 * Sets the value of the '{@link org.eclipsercp.e4.hyperbola.model.Contact#isPrivateContact <em>Private Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Contact</em>' attribute.
	 * @see #isPrivateContact()
	 * @generated
	 */
	void setPrivateContact(boolean value);
} // Contact
