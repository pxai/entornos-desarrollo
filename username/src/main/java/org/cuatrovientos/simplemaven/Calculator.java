/**
 * 
 */
package org.cuatrovientos.simplemaven;

/**
 * @author Administrador
 *
 */
public class Calculator {
	
	/**
	 * Add method
	 * @param a
	 * @param b
	 * @return
	 */
	public int add (int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	public int sub (int a, int b) {
		return a - b;
	}

	public int mul (int a, int b) {
		return a * b;
	}

	public int div (int a, int b) {
		return a / b;
	}


}
