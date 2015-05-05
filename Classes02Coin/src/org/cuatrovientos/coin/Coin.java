/**
 * 
 */
package org.cuatrovientos.coin;

import java.util.Random;

/**
 * @author Administrador
 *
 */
public class Coin {
	
	/**
	 * default constructor
	 */
	public Coin () {
		System.out.println("New instance of Coin");
	}
	
	/**
	 * flips a coin
	 */
	public void flip () {
		Random random = new Random();
		int result = 0;
		
		result = random.nextInt(2);
		
		if (result == 0) {
			System.out.println("HEADS");
		} else {
			System.out.println("TAILS");			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coin mySuperCoin = new Coin();
		for (int i =0;i<5;i++) {
			mySuperCoin.flip();
		}

	}

}
