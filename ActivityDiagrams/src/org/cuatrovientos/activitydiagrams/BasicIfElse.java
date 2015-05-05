/**
 * 
 */
package org.cuatrovientos.activitydiagrams;

import java.util.Scanner;

/**
 * Shows a basic program flow with ifelse conditional
 * This program tell us wether a number is even or odd
 * @author Pello Altadill
 *
 */
public class BasicIfElse {

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
		
		if (number % 2  == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");			
		}
		
	}

}
