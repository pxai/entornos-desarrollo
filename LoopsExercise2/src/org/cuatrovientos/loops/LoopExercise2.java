/**
 * 
 */
package org.cuatrovientos.loops;

import java.util.Scanner;

/**
 * @author Administrador
 *
 */
public class LoopExercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number;
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Please, enter a number:");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		
		if (number > 0 && number % 2 == 0) {
			for (int i = 0; i < number; i++) {
				System.out.print("*");
			}
		} else {
			System.out.println("Invalid number");
			//return;
			System.exit(0);
		}
		
		

	}

}
