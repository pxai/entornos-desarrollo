/**
 * 
 */
package org.cuatrovientos.activitydiagrams;

import java.util.Scanner;

/**
 * Shows a basic program flow with ifelse conditional
 * This program tell us wether a number positive, negative or zero
 * @author Pello Altadill
 *
 */
public class BasicIfElseIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;

		String line = "";
		Scanner reader = new Scanner(System.in);
		
		// Ask user for a number
		System.out.println("Please, enter a number:");
		line = reader.nextLine();
		
		// Convert the String to int
		number = Integer.parseInt(line);
		
		// Check number 
		if (number > 0) {
			System.out.println("number is positive");
		} else {
			if (number < 0) {
				System.out.println("number is negative");				
			} else {
				System.out.println("number is 0");				
			}			
		}
		
	}

}
