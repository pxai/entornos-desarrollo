/**
 * 
 */
package org.cuatrovientos.loops;

import java.util.Scanner;

/**
 * Simple program to calculate factorial
 * @author Pello Altadill
 *
 */
public class LoopsExercise6 {
	public static void main (String args[]) {
		int number = 0;
		int factorial = 0;
		
		String line = "";
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		
		// 5! = 5 * 4 * 3 * 2 * 1
		factorial = number;
		number = number - 1;
		
		while (number > 1) {
			System.out.println(factorial + " " + number);
			factorial = factorial * number;
			number = number - 1;
		}
		
		
	//	for (int i = number; i>1 ; i--) {
			
	//	}
		
		//for (int i = 0; i<number; i++) {
			
		//}
		
		
		System.out.println("Factorial :" + factorial);
		
		
	}
}
