/**
 * 
 */
package org.cuatrovientos.die;

/**
 * @author Administrador
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Die mySimpleDice = new Die();
		System.out.println("Roll result: " + mySimpleDice.roll());
		
		Die myProDice = new Die(10);
		System.out.println("Roll result: " + myProDice.roll());
		
		mySimpleDice.setSides(100);
		System.out.println("Roll result: " + mySimpleDice.roll());
		

	}

}
