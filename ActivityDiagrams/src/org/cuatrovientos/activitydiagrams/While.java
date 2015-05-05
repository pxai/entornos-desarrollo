/**
 * 
 */
package org.cuatrovientos.activitydiagrams;

import java.util.Scanner;

/**
 * Shows a basic while iteration
 * to calculate factorial
 * @author Pello Altadill
 *
 */
public class While {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		int result = 1;
		String line = "";
		Scanner reader = new Scanner(System.in);
		
		// Ask user for a number
		System.out.println("Enter a number: ");
		line = reader.nextLine();
		
		// Convert the String to int
		number = Integer.parseInt(line);

		// Calculate factorial
		while (number >1) {
			result = result * number;
			number = number - 1;
		}
		
		// Show result
		System.out.println("Factorial is " + result);
	}

}
