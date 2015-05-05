/**
 * 
 */
package org.cuatrovientos.activitydiagrams;

import java.util.Scanner;

/**
 * Shows a basic program flow
 * @author Pello Altadill
 *
 */
public class Basic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		int result = 0;
		String line = "";
		Scanner reader = new Scanner(System.in);
		
		// Ask user for a number
		System.out.println("Enter a number: ");
		line = reader.nextLine();
		
		// Convert the String to int
		number = Integer.parseInt(line);

		// Calculate square
		result = number * number; 
		
		// Show result
		System.out.println("Result is " + result);
	}

}
