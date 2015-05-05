/**
 * 
 */
package org.cuatrovientos.classes;

/**
 * Simple class to show the use of classes
 * @author Pello Altadill
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int counter = 0;
		Customer oneCustomer;
		Customer anotherCustomer;
		
		oneCustomer = new Customer();
		oneCustomer.setName("Ainhoa");
		
		oneCustomer.sayHello();
		anotherCustomer = oneCustomer;
		
		anotherCustomer.sayHello();
		
		
		
		
		
		

	}

}
