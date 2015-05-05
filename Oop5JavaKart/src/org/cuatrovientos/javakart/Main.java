/**
 * 
 */
package org.cuatrovientos.javakart;

/**
 * Main entry point to the project
 * @author Pello Altadill
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circuit circuit = new Circuit("Montmelo",1000);
		Race race = new Race("GP of Rep. of Catalunya", circuit);
		
		race.addVehicle(new Car("Mario"));
		race.addVehicle(new Car("Luigi"));
		race.addVehicle(new Car("Bowser"));

		System.out.println("Vehicles: \n" + race.vehicleData());
		
		Vehicle winner = race.race();
		
		System.out.println("Winner is: " + winner.toString());
	}

}
