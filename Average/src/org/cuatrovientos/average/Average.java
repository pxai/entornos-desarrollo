/**
 * 
 */
package org.cuatrovientos.average;

import java.util.Scanner;


/**
 * Simple class to calculate the average of 5 numbers
 * @author Pello Altadill
 *
 */
public class Average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int number4 = 0;
		int number5 = 0;
		int average = 0;
		
		// To read from console
		Scanner reader = new Scanner(System.in);
		String line = "";

		// Ask a number
		System.out.println("Enter a number:");
		// read from console
		line = reader.nextLine();
		// Convert to int
		number1 = Integer.parseInt(line);
		
		// Ask a number
		System.out.println("Enter a number:");
		// read from console
		line = reader.nextLine();
		// Convert to int
		number2 = Integer.parseInt(line);
		
		// Ask a number
		System.out.println("Enter a number:");
		// read from console
		line = reader.nextLine();
		// Convert to int
		number3 = Integer.parseInt(line);
		
		// Ask a number
		System.out.println("Enter a number:");
		// read from console
		line = reader.nextLine();
		// Convert to int
		number4 = Integer.parseInt(line);
		
		// Ask a number
		System.out.println("Enter a number:");
		// read from console
		line = reader.nextLine();
		// Convert to int
		number5 = Integer.parseInt(line);
		
		// Calculate the average
		average = (number1 + number2 + number3 + number4 + number5) / 5;
		System.out.println("Average is: " + average);
	}

}
