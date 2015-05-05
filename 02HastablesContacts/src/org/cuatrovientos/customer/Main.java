/**
 * 
 */
package org.cuatrovientos.customer;

/**
 * @author Pello Altadill
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contacts contacts = new Contacts("El Corte Inglés");
		Customer sampleCustomer = new Customer("55666777L","Chema Alonso","chemari@elmal.es");
		Customer otherCustomer = new Customer("33222444A","Luis Bárcenas","luis@populares.es");
		
		// add customers
		contacts.addCustomer(sampleCustomer);
		contacts.addCustomer(otherCustomer);
		
		// show customers
		System.out.println("Customers: " + contacts.showAll());
		
		// Search for customer:
		Customer found = contacts.searchCustomer("55666777L");
		if (null != found) {
			System.out.println("Customer found: " + found.toString());
		}
		
		// remove a car:
		contacts.removeCustomer("55666777L");
		
		System.out.println("\nShow contacts after removal:");
		// show customers
		System.out.println("Customers: " + contacts.showAll());

	}

}
