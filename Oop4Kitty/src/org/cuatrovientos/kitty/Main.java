/**
 * 
 */
package org.cuatrovientos.kitty;

/**
 * @author Administrador
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Basket myPinkBasket = new Basket();
		
		Fruit oneFruit = new Fruit("Apple",4.2f);
		Candy sweet = new Candy("Bubblegum",100.5f);
		
		myPinkBasket.addFood(oneFruit);
		myPinkBasket.addFood(sweet);
		
		myPinkBasket.addFood(new Fruit("Potato",266.6f));
		
		System.out.println("Total weight:");
		System.out.println(myPinkBasket.totalWeight());

		System.out.println("Basket contents:");
		System.out.println(myPinkBasket.toString());

		
		

	}

}
