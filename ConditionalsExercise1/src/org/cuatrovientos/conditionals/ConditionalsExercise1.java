/**
 * 
 */
package org.cuatrovientos.conditionals;

import java.util.Scanner;

/**
 * @author Administrador
 *
 */
public class ConditionalsExercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;

		String line = "";
		Scanner reader = new Scanner(System.in);
		
		line = reader.nextLine();
		number = Integer.parseInt(line);
		
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
