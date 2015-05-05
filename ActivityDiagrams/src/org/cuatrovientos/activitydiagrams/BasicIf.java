/**
 * 
 */
package org.cuatrovientos.activitydiagrams;

import java.util.Scanner;

/**
 * Shows a basic program flow with if conditional
 * This program calculates square roots
 * @author Pello Altadill
 *
 */
public class BasicIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		double result = 0;
		String line = "";
		Scanner reader = new Scanner(System.in);
		
		// Ask user for a number
		System.out.println("Enter a number: ");
		line = reader.nextLine();
		
		// Convert the String to int
		number = Integer.parseInt(line);

		// Calculate square only if number is positive
		if (number > 0) {
			result = Math.sqrt(number);
			// Show result
			System.out.println("Result is " + result);
		}
		
	}

}
