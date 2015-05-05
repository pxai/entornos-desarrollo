/**
 * 
 */
package org.cuatrovientos.hoygan;

import java.util.Scanner;

/**
 * @author Administrador
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		HoyganConversor hoygan = new HoyganConversor();
		String text2Convert = "Ayuda  quiero hackear el hotmail de mi novia";
		
		System.out.println("Original: " + text2Convert);
		
		System.out.println("Translated to HOYGAN: ");
		System.out.println(hoygan.convert(text2Convert));

		for (;;) {
			System.out.println("\nEnter normal text:");
			text2Convert = reader.nextLine();
			
			System.out.println("Translated to HOYGAN: ");
			System.out.println(hoygan.convert(text2Convert));
		}
		
		
		
	}

}
