/**
 * 
 */
package org.cuatrovientos.activitydiagrams;

import java.util.Scanner;

/**
 * Ask user for a number and then displays position on field
 * @author Pello Altadill
 *
 */
public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		// Ask user for a number
		System.out.println("Please enter a number");
		line = reader.nextLine();
		
		// Convert to int
		number = Integer.parseInt(line);
		
		// Check that is between 0 and 99
		if (number >= 0 && number <= 99) {
			// Determine field position
			switch (number) {
				case 1:	
					System.out.println("Goalkeeper");
					break;
				case 3:
				case 4:
				case 5:
					System.out.println("Back");
					break;
				case 6:
				case 8:
				case 11:
					System.out.println("Midfield");
					break;
				case 9:
					System.out.println("Striker");
					break;
				default:
					System.out.println("Polivalent");
					break;
			}
		}

	}

}
