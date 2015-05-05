/**
 * 
 */
package org.cuatrovientos.booleansamples;

/**
 * @author Administrador
 *
 */
public class Boolean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean result = false;
		// Operators: 
		// operador and en java: && 
		// operador or en java: or 
		// operador not en java: !
		result = true && true;
		System.out.println(result);

		result = (4 > 0) && (4 % 2 == 0);
		System.out.println(result);
		
		result = true || false;
		System.out.println(result);

		result = !true;
		System.out.println(result);

	}

}
