/**
 * 
 */
package org.cuatrovientos.arrays;

/**
 * Inits array of numbers and shows them
 * @author Pello Altadill
 *
 */
public class ArraysExercise1 {

	public static void main (String [] args) {
		int[]  numbers = {23,11,0,15,42,42,555,666,1,9};

		for (int i = 0; i< numbers.length;i++) {
			System.out.println(i + ": " + numbers[i]);
		}
	}

}
