package org.cuatrovientos.fleet;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author Administrador
 *
 */
public class Fleet {
	private String fleetName;
	private Hashtable<Commander,Ship> ships;
	
	/**
	 * @param fleetName
	 */
	public Fleet(String fleetName) {
		this.fleetName = fleetName;
		ships = new Hashtable<Commander,Ship>();
	}
	
	/**
	 * 
	 * @param ship
	 */
	public void addShip(Ship ship) {
		ships.put(ship.getCommander(), ship);
	}
	
	/**
	 * 
	 * @param commander
	 * @return
	 */
	public Ship searchShip (Commander commander) {
		return ships.get(commander);
	}
	
	/**
	 * 
	 * @param commander
	 */
	public void removeShip(Commander commander) {
		ships.remove(commander);
	}
	
	/**
	 * 
	 * @return
	 */
	public String showAll() {
		String result = "";
		
		Enumeration<Commander> commanders = ships.keys();
		
		while (commanders.hasMoreElements()) {
			Commander commander = commanders.nextElement();
			result = result + ships.get(commander).toString() + "\n";
		}
		return result;
	}


	
	
}
