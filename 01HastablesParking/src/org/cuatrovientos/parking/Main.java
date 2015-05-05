/**
 * 
 */
package org.cuatrovientos.parking;

/**
 * @author Administrador
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parking parking = new Parking("Nuestra Señoral del Gorrilla", 42);
		Car sampleCar = new Car("0666EVL","Opel Corsa","Red");
		Car otherSampleCar = new Car("0042FER","Ferrari Enzo","Fuchsia");
		
		// add cars to the parking
		parking.addCar(sampleCar);
		parking.addCar(otherSampleCar);
		
		// show parking
		System.out.println("Parking cars: " + parking.showAll());
		
		// Search car:
		Car found = parking.searchCar("0666EVL");
		if (null != found) {
			System.out.println("Car found: " + found.toString());
		}
		
		// remove a car:
		parking.removeCar("0666EVL");
		
		System.out.println("\nShow parking after removal:");
		// show parking
		System.out.println("Parking cars: " + parking.showAll());

	}

}
