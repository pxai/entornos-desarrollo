/**
 * 
 */
package org.cuatrovientos.parking;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Represents a parking
 * @author Pello Altadill
 *
 */
public class Parking {
	private String name;
	private int capacity;
	private Hashtable<String,Car> places;
	
	/**
	 * @param name
	 * @param capacity
	 */
	public Parking(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		places = new Hashtable<String,Car>();
	}
	
	/**
	 * adds car to our parking
	 * @param car
	 */
	public void addCar(Car car) {
		if (places.size() < capacity) {
			places.put(car.getPlate(), car);
		}
	}

	/**
	 * searches for a car in the parking
	 * @param plate
	 * @return
	 */
	public Car searchCar(String plate) {
		Car car = null;
		
		car = places.get(plate);
		
		return car;
	}
	
	/**
	 * remove the car from the parking
	 * @param plate
	 */
	public void removeCar(String plate) {
		places.remove(plate);
	}
	
	/**
	 * shows all cars in the parking
	 * @return
	 */
	public String showAll() {
		String allCars = "";
		
		// import java.util.Enumeration
		Enumeration<String> keys = places.keys();
		
		while (keys.hasMoreElements()) {
			String plate = keys.nextElement();
			allCars = allCars + places.get(plate).toString() + "\n";
		}
		
		return allCars;
	} 
	
}
