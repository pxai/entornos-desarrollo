package org.cuatrovientos.arrays;

import java.util.Date;
import java.util.Scanner;

/**
 * ArraysExercise3
 * @author Pello Altadill
 *
 */
public class ArraysExercise3 {
	public static void main (String args[]) {
		int [] numbers = {0,0,0,0,0,0,0,0,0,0};
		Scanner reader = new Scanner(System.in);
		String line = "";

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter a number, please");
			line = reader.nextLine();
			numbers[i] = Integer.parseInt(line);		
		}
		
		
		for (int i = 0;i<numbers.length;i++) {
			for (int j = i+1;j<numbers.length;j++) {
				if (numbers[i] == numbers[j]) {
					System.out.println("Repeated value: " + numbers[i]);
					//return;
					System.exit(0);
				}
			}			
		}
		
	}
}
