/**
 * 
 */
package org.cuatrovientos.sqaure;

/**
 * Simple class to draw squeares on console
 * @author Pello Altadill
 *
 */
public class Square {
	private char character; 
	
	/**
	 * default constructor
	 */
	public Square () {
		character = '#';
	}
	
	/**
	 * Constructor with character
	 * @param character
	 */
	public Square (char character) {
		this.character = character;
	}

	/**
	 * changes character
	 * @param character
	 */
	public void setCharacter (char character) {
		this.character = character;
	} 
	
	private String generate (int size) {
		String square = "";
		
		for (int i = 0; i< size; i++) {
			for (int j = 0; j< size; j++) {
				square = square + character;
			}			
			square = square + "\n";
		}
		
		return square;
	} 
	
	/**
	 * shows square on console
	 * @param size
	 */
	public void show (int size) {
		System.out.println(generate(size));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Square mySquare = new Square();
		Square niggaSquare = new Square('$');
		
		mySquare.show(6);
		niggaSquare.show(10);
		
		mySquare.setCharacter('@');
		mySquare.show(100);
		

	}

}
