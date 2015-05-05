/**
 * 
 */
package org.cuatrovientos.org.currency;

import java.util.Scanner;

/**
 * @author Administrador
 *
 */
public class CurrencyConversor {

	private static final float DOLLAR_CHANGE = 1.27f;
	private static final float YEN_CHANGE = 135.89f;
	private static final float POUND_CHANGE = 0.79f;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float amount = 0;
		String currency = "";
		Scanner reader = new Scanner(System.in);
		String line = "";
		float result = 0;
		
		// 1. Ask user a number/amount in euros
		System.out.println("Please enter amount:");
		line = reader.nextLine();
		amount = Float.parseFloat(line);
		
		// 2. Ask user a currency
		System.out.println("Please enter currency:");
		currency = reader.nextLine();
		
		// 3. Convert euros to that currency
		switch (currency) {
			case "d":
					result = amount * DOLLAR_CHANGE;
					break;
			case "y":
				result = amount * YEN_CHANGE;
				break;
			case "l":		// MAGIC NUMBERS
				result = amount * POUND_CHANGE;
				break;
			default:
				System.out.println("Currency not supported");
				break;
		}
		System.out.println(amount + "-> "+ result);

	}

}
