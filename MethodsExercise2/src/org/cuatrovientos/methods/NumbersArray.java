/**
 * 
 */
package org.cuatrovientos.methods;

import java.util.Random;

/**
 * @author Pello Altadill
 *
 */
public class NumbersArray {

	/**
	 * show all elements of an array
	 */
	public static void showAll (int [] myArray) {
		System.out.println("Array content: ");
		for (int i = 0; i< myArray.length;i++) {
			System.out.println(i + ": " + myArray[i]);
		}
	}
	
	/**
	 * inits array elements with given number
	 * @param myArray
	 * @param number
	 */
	public static void initWithNumber (int[] myArray, int number) {
		for (int i = 0; i< myArray.length;i++) {
			myArray[i] = number;
		}
	}
	
	/**
	 * inits array elements with random numbers
	 * @param myArray
	 */
	public static void initRandom (int[] myArray) {
		Random random = new Random();
		for (int i = 0; i< myArray.length;i++) {
			myArray[i] = random.nextInt(11);
		}
	}
	
	/**
	 * return a random item from the array
	 * @param miArray
	 * @return
	 */
	public static int randomElement (int[] miArray) {
		Random random = new Random();
		int randomIndex = random.nextInt(miArray.length);
		return miArray[randomIndex];
	}
	
	/**
	 * counts even numbers in array
	 * @param myArray
	 * @return total even numbers
	 */
	public static int even (int[] myArray) {
		int totalEven = 0;
		for (int i = 0; i< myArray.length;i++) {
			if (myArray[i] % 2 == 0) {
				totalEven++;
			}
		}
		return totalEven;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] numbers = new int[15];
		Random random = new Random();
		
		int aNumber = random.nextInt(10);
		
		showAll(numbers);
		
		initWithNumber(numbers, aNumber);
		showAll(numbers);
		
		initRandom(numbers);
		showAll(numbers);
		
		System.out.println("Get random element: ");
		System.out.println(randomElement(numbers));
		
		System.out.println("Total even elements: ");
		System.out.println(even(numbers));

	}

}
