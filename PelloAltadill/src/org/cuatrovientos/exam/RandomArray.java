package org.cuatrovientos.exam;

import java.util.Random;
import java.util.Scanner;

/**
 * Simple class to manage an array of numbers
 * @author Pello Altadill
 */
public class RandomArray {

	/**
	 * 
	 * @param numbers
	 */
	public static void showArray(int[] numbers) {
		for (int i=0;i< numbers.length;i++) {
			System.out.println(i + ": " + numbers[i]);
		}
	}

	  /**
	   * inits array with random numbers
	   * @param numbers
	   */
	  public static void initRandom(int[] numbers) {
		  Random random = new Random();
		  
		  for (int i=0;i< numbers.length;i++) {
				numbers[i] = random.nextInt(101) - 50;
			}
	  }
	  
	 /**
	  * returns an array with positive numbers
	  * @return array of positive numbers
	  * 
	  * */ 
	 public static int[] getPositives(int[] numbers) { 
		 int [] positiveNumbers = new int[numbers.length]; 
		 int j = 0;
		 
		 for (int i = 0;i<numbers.length;i++) {
			 if (numbers[j] >= 0) {
				 positiveNumbers[i] = numbers[i];
				 j = j + 1;
			 }
		 }
		 
		 return positiveNumbers;
	 }
	 
	 /**
	  * summary of positive, negative and zero values in the array
	  * @param numbers
	  */
	 public static void summary(int[] numbers) {
		 int positives = 0;
		 int negatives = 0;
		 int zero = 0;
		 
		 
		 for (int i = 0; i < numbers.length;i++) {
			 if (numbers[i] > 0) {
				 positives = positives + 1;
			 } else {
				 if (numbers[i] < 0) {
					 negatives = negatives + 1;
				 } else {
					 zero = zero + 1;
				 }
			 }
		 }
		 
		 System.out.println("Total positives: " + positives);
		 System.out.println("Total negatives: " + negatives);
		 System.out.println("Total zeroes: " + zero);
	 }
	 

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		int[] numbers = new int[10];
		String option = "";
		String line = "";
		Scanner reader = new Scanner(System.in);

		do {

			System.out.println("Select an option:");
			System.out.println("1. option 1");
			System.out.println("2. option 2");
			System.out.println("3. option 3");
			System.out.println("4. option 4");
			System.out.println("5. exit");

			option = reader.nextLine();

			switch (option) {
			case "1":
				showArray(numbers);
				break;
			case "2":
				initRandom(numbers);
				break;
			case "3":
				showArray(getPositives(numbers));
				break;
			case "4":
				summary(numbers);
				break;
			case "5":
				System.out.println("See you around");
				break;
			default:
				break;
			}

		} while (!option.equals("5"));
	}

}
