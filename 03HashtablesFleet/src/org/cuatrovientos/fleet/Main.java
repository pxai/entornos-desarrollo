/**
 * 
 */
package org.cuatrovientos.fleet;

/**
 * @author Pello Altadill
 *
 */
public class Main {
	public static void main (String args[]) {
		//i.	Crear una instancia de Fleet.
		Fleet myFleet = new Fleet("Imperial Fleet");
		
		//ii.	Crear tres instancias de Commander
		Commander redCommander = new Commander("Red 1",42);
		Commander blackCommander = new Commander("Black 2",666);
		Commander goldCommander = new Commander("Drake 5",100);
		
		//iii.	Crear tres instancias de Ship asignándoles un Commander a cada
		Ship shipOne = new Ship(10, 15,true, redCommander);
		Ship shipTwo = new Ship(20, 10, false, blackCommander);
		Ship shipThree = new Ship(25, 10,true, goldCommander);
		
		//iv.	Introducir las naves en la Fleet.
		myFleet.addShip(shipOne);
		myFleet.addShip(shipTwo);
		myFleet.addShip(shipThree);
		
		//v.	Mostrar todas las naves.
		System.out.println("Fleet status: ");
		System.out.println(myFleet.showAll());
		
		//vi.	Eliminar una nave
		myFleet.removeShip(redCommander);
		
		//vii.	Mostrar todas las naves.
		System.out.println("Fleet status after redCommander deletion: ");
		System.out.println(myFleet.showAll());

	}
}
