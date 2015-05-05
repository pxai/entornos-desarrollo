/**
 * 
 */
package org.cuatrovientos.customer;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Represents a customer contacts list
 * @author Pello Altadill
 *
 */
public class Contacts {
	private String owner;
	private Hashtable<String,Customer> customers;
	
	/**
	 * @param owner
	 */
	public Contacts(String owner) {
		this.owner = owner;
		customers = new Hashtable<String,Customer>();
	}
	
	/**
	 * adds customer to our contacts list
	 * @param customer
	 */
	public void addCustomer(Customer customer) {
			customers.put(customer.getDni(), customer);
	}

	/**
	 * searches for a car in the parking
	 * @param dni
	 * @return
	 */
	public Customer searchCustomer(String dni) {
		Customer customer = null;
		
		customer = customers.get(dni);
		
		return customer;
	}
	
	/**
	 * remove customer from the list
	 * @param plate
	 */
	public void removeCustomer(String dni) {
		customers.remove(dni);
	}
	
	/**
	 * shows all customers in the contacts list
	 * @return
	 */
	public String showAll() {
		String allCustomers = "";
		
		// import java.util.Enumeration
		Enumeration<String> keys = customers.keys();
		
		while (keys.hasMoreElements()) {
			String dni = keys.nextElement();
			allCustomers = allCustomers + customers.get(dni).toString() + "\n";
		}
		
		return allCustomers;
	} 
	
}
