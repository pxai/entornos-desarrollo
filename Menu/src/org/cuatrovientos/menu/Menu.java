/**
 * 
 */
package org.cuatrovientos.menu;

import java.util.Random;
import java.util.Scanner;

/**
 * Simple program to display a menu and process choices
 * @author pello altadill
 * @version 1.0
 */
public class Menu {

	/**
	 * loves you
	 */
	public static void sayYouLoveMe() {
		System.out.println("I love you so much");
		
	}

	/**
	 * insults randomly
	 */
	public static void insult() {
		String[] insults = {"Cocksucker","Bitch","Queer","Faggot","Madafaka"};
		Random random = new Random();
		int index = random.nextInt(insults.length);
		System.out.println(insults[index]);
	}

	/**
	 * says hello
	 */
	public static void sayHello() {
		System.out.println("Hello!");
		System.out.println("How are you?");
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String option = "";
		
		do {
			showMenu();
		
			option = reader.nextLine();
			
			switch (option) {
				case "1":
							System.out.println("You selected 1");
							sayHello();
							break;
				case "2":	
							System.out.println("You selected 2");
							insult();
							break;
				case "3":
							System.out.println("You selected 3");
							sayYouLoveMe();
							break;
				case "4":	
							System.out.println("You selected 4");
							System.out.println("Byeee");
							break;
				default:	
							System.out.println("Incorrect option");
			}
			
		} while (!option.equals("4"));
		
		
		
	}

	/**
	 * 
	 */
	public static void showMenu() {
		System.out.println("Please select: ");
		System.out.println("1) Say hello ");
		System.out.println("2) Insult me ");
		System.out.println("3) Say that you love me ");
		System.out.println("4) Exit");
	}


}
