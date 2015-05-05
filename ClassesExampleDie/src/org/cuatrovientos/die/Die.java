/**
 * 
 */
package org.cuatrovientos.die;

import java.util.Random;

/**
 * @author Administrador
 *
 */
public class Die {
	private int sides;
	
	/**
	 * default constructor
	 */
	public Die () {
		sides = 6;
	} 
	
	/**
	 * creates die with sides
	 * @param sides
	 */
	public Die (int sides) {
		this.sides = sides;
	}
	
	/**
	 * rolls the die
	 * @return
	 */
	public int roll () {
		int result = 0;
		Random random = new Random();
		
		result = random.nextInt(sides) + 1;
		
		return result;
	}

	/**
	 * @return the sides
	 */
	public int getSides() {
		return sides;
	}

	/**
	 * @param sides the sides to set
	 */
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	
}
