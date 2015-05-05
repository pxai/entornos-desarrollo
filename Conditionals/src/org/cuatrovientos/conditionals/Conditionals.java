/**
 * 
 */
package org.cuatrovientos.conditionals;

/**
 * Simple program to show the use of
 * conditional expressions in Java
 * @author Pello Altadill
 *
 */
public class Conditionals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 6;
		
		if (a > b) {
			System.out.println("a is bigger than b");
		} else {
			if (a == b) {
				System.out.println("a and b are equal");
			} else {
				System.out.println("a is smaller than b");							
			}
		}
		
		/*
		if (a == 0) {
			System.out.println("A is 0");
		} else {
			if (a == 1) {
				System.out.println("A is 1");				
			} else {
				if (a == 5) {
					System.out.println("A is 5");
				} else {
					System.out.println("I don't know what a is");					
				}
			}
		}*/
		
		switch (a) {
			case 0:
					System.out.println("A is 0");
					break;
			case 1:
					System.out.println("A is 1");
					break;
			case 5:
					System.out.println("A is 5");
					break;
			default:
					System.out.println("I don't know what a is");					
					break;
		}
		
		
		
		System.out.println("Program ended.");

	}

}
