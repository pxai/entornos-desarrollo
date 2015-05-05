/**
 * 
 */
package org.cuatrovientos.methods;

import java.util.Date;

/**
 * Shows the use of methods
 * @author Pello Altadill
 * @version 1.0.1
 */
public class Methods {

	/**
	 * simple method to say hello
	 */
	public static void sayHello () {
		System.out.println("Hi there");
	}
	
	/**
	 * Adds to integer values a and b
	 * @param a
	 * @param b
	 * @return the result
	 */
	public static int add (int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}
	
	/**
	 * Shows message on console
	 * @param message
	 */
	public static void msg (String message) {
		drawLineCustom("*",42);
		System.out.println(new Date().toString());
		System.out.println(message);
		drawLineCustom("/\\",21);
	}
	
	/**
	 * Draws a customized line on console
	 * @param c
	 * @param length
	 */
	public static void drawLineCustom (String c, int length) {
		String line = "";
		for (int i=0;i<length;i++) {
			line = line + c;
		}
		System.out.println(line);		
	}

	/**
	 * Draws a line on console
	 */
	public static void drawLine () {
		String line = "";
		for (int i=0;i<80;i++) {
			line = line + "-";
		}
		System.out.println(line);		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// This is a comment
		sayHello();		
		int c = add(600,66);
		msg("Result is " + c);
	}
	
	

}
