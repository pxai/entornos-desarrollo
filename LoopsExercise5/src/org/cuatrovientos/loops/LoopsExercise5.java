/**
 * 
 */
package org.cuatrovientos.loops;

import java.util.Scanner;

/**
 * @author Administrador
 *
 */
public class LoopsExercise5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		String line = "";
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		
	
		for (int j =0; j<number; j++) {
			for (int i=0; i< number; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
	}

}
