/**
 * 
 */
package org.cuatrovientos.customer;

/**
 * Represents a Customer
 * @author Pello Altadill
 *
 */
public class Customer {
	private String dni;
	private String name;
	private String email;
	
	
	/**
	 * @param dni
	 * @param name
	 * @param email
	 */
	public Customer(String dni, String name, String email) {
		this.dni = dni;
		this.name = name;
		this.email = email;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [dni=" + dni + ", name=" + name + ", email=" + email
				+ "]";
	}
	
	
	
}
