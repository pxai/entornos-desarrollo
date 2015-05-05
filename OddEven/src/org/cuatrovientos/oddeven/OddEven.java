/**
 * 
 */
package org.cuatrovientos.oddeven;

import java.util.Scanner;

/**
 * determines if a number is odd or even
 * @author Pello Altadill
 *
 */
public class OddEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		String line = "";
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please, enter a number:");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		
		if (number % 2  == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");			
		}
		
		
	
	}

}
