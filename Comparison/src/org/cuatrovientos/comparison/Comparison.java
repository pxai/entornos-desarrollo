/**
 * 
 */
package org.cuatrovientos.comparison;

/**
 * Simple class to show use of comparison operators
 * @author Pello Altadill
 *
 */
public class Comparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 6;
		int b = 0;
		
		boolean result = false;
		
		result = a > b;
		System.out.println(result);
		System.out.println(a < b);
		// >  <  >= <= == !=
		result = (a == b);
		System.out.println(result);
		result = (a != b);
		System.out.println(result);
		result = (a >= b);
		System.out.println(result);
		
		result = "A" == "a";
		System.out.println(result);
		
		
	}

}
