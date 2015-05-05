/**
 * 
 */
package org.cuatrovientos.javakart;

import java.util.Enumeration;
import java.util.Hashtable;


/**
 * Represents a race.
 * This version uses a Hashtable instead of two
 * Vector
 * Oop5JavaKart
 * @author Pello Altadill
 *
 */
public class Race {
	private String name;
	private Circuit circuit;
	private Hashtable<Vehicle,Integer> vehicles;

	
	/**
	 * constructor
	 * @param name
	 * @param circuit
	 */
	public Race (String name, Circuit circuit) {
		this.name = name;
		this.circuit = circuit;
		vehicles = new Hashtable<Vehicle,Integer>();
	}
	
	/**
	 * add vehicle to race
	 * @param vehicle
	 */
	public void addVehicle (Vehicle vehicle) {
		vehicles.put(vehicle,0);
	}
	
	/**
	 * Moves cars in turns until someone completes the circuit length
	 * @return
	 */
	public Vehicle race () {
		int turn = 0;
		Enumeration<Vehicle> vehiclesKey = null;
		Vehicle winner = null;
		
		do {
			vehiclesKey = vehicles.keys();
			
			// We iterate through the hashtables using keys
			while (vehiclesKey.hasMoreElements()) {
				Vehicle currentVehicle = vehiclesKey.nextElement();
				int movement = currentVehicle.move();       // move the vehicle
				int current = vehicles.get(currentVehicle); // get current position from Hashtable
				int newPosition = movement + current;
				
				// We update value
				vehicles.put(currentVehicle, newPosition);
			
				//System.out.print(currentVehicle.getName());
				//System.out.println(" moved " + movement + ", current pos: " + newPosition);
						
				if (newPosition >= circuit.getLength()) {
					winner = currentVehicle;
					break;
				}
			}
			showTurnInfo(turn);
			turn = turn + 1;
		} while (winner == null);
		return winner;
	}
	
	/**
	 * shows all vehicle status 
	 * @param turn
	 */
	private void showTurnInfo(int turn) {
		System.out.println("Turn " + turn + "------------------------");
		
	}

	/**
	 * shows car data
	 * @return car data
	 */
	public String vehicleData () {
		String vehicleData = "";
		Enumeration<Vehicle> vehiclesKey = vehicles.keys();
		
		while (vehiclesKey.hasMoreElements()) {
			Vehicle currentVehicle = vehiclesKey.nextElement();
			vehicleData = vehicleData + currentVehicle.toString() + "\n";
		}
		
		return vehicleData;
	}
}
