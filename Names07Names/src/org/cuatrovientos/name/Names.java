/**
 * 
 */
package org.cuatrovientos.name;

import java.util.Random;

/**
 * Random name generator
 * @author Pello Altadill
 * 
 */
public class Names {

	private int length;
	
	/**
	 * default constructor
	 */
	public Names () {
		length = 2;
	}
	
	/**
	 * constructor with name length
	 * @param length
	 */
	public Names (int length) {
		if (length > 1) {
			this.length = length;
		} else {
			this.length = 2;
		}
	}
	
	/**
	 * generates a random name
	 * @return name
	 */
	public String generate () {
		Random random = new Random();
		String name = "";
		String [] vowels = {"a","a","e","e","i","i","o","u","y"};
		String [] consonants = {"b","c","d","f","g","h","j","k","ll","l","m","n","p","qu","r","s","t","v","w","x","y","z"};
		
		
		for (int i =0;i<length;i++) {
			name = name + consonants[random.nextInt(consonants.length)];
			name = name + vowels[random.nextInt(vowels.length)];
		}
		return name;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Names names = new Names(3);
		String name = "";
		int tries = 0;
		
//		for (int i=0;i<100000;i++) {
		for (;;) {
			name = names.generate();
			tries++;
			System.out.println(name);
			if (name.equals("basallo")) {
				System.out.println("basallo was randomly generated: " + tries);
				break;
			}
		}
	}

}
