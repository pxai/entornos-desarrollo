/**
 * 
 */
package org.cuatrovientos.loops;

import java.util.Scanner;

/**
 * @author Administrador
 *
 */
public class LoopsExercise1 {

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
		
		if (number > 0) {
			for (int i = 0; i < number; i++) {
				System.out.println(i + " Hello ");
			}
		} else {
			System.out.println("Invalid number");
		}

	}

}
