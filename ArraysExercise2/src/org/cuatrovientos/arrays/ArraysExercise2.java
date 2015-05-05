/**
 * 
 */
package org.cuatrovientos.arrays;

import java.util.Scanner;

/**
 * Creates array of names
 * @author Pello Altadill
 *
 */
public class ArraysExercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] names = {"","","","","","","","","",""};
		String line = "";
		Scanner reader = new Scanner(System.in);
		
		for (int i = 0;i<names.length;i++) {
			System.out.println("Enter a name");
			line = reader.nextLine();
			names[i] = line;
		}
		
		System.out.println("Names introduced:");
		for (int i = 0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}

}
