/**
 * 
 */
package org.cuatrovientos.javakart;

import java.util.Vector;

/**
 * Represents a race
 * @author Pello Altadill
 *
 */
public class Race {
	private String name;
	private Circuit circuit;
	private Vector<Vehicle> vehicles;
	private Vector<Integer> positions;
	
	/**
	 * constructor
	 * @param name
	 * @param circuit
	 */
	public Race (String name, Circuit circuit) {
		this.name = name;
		this.circuit = circuit;
		vehicles = new Vector<Vehicle>();
		positions = new Vector<Integer>();
	}
	
	/**
	 * add vehicle to race
	 * @param vehicle
	 */
	public void addVehicle (Vehicle vehicle) {
		vehicles.add(vehicle);
		positions.add(0);
	}
	
	/**
	 * Moves cars in turns until someone completes the circuit length
	 * @return
	 */
	public Vehicle race () {
		int turn = 0;
		
		Vehicle winner = null;
		do {
			System.out.println("Turn " + turn + "------------------------");
			for (int i = 0; i < vehicles.size();i++) {
				int movement = vehicles.elementAt(i).move();
				int current = positions.elementAt(i);
				int newPosition = movement + current;
			
				System.out.print(vehicles.elementAt(i).getName());
				System.out.println(" moved " + movement + ", current pos: " + newPosition);
			
				positions.setElementAt(newPosition, i);
			
				if (newPosition >= circuit.getLength()) {
					winner = vehicles.elementAt(i);
					break;
				}
			}
			turn = turn + 1;
		} while (winner == null);
		return winner;
	}
	
	/**
	 * shows car data
	 * @return car data
	 */
	public String vehicleData () {
		String vehicleData = "";
		
		for (Vehicle vehicle: vehicles) {
			vehicleData = vehicleData + vehicle.toString() + "\n";
		}
		
		return vehicleData;
	}
}
