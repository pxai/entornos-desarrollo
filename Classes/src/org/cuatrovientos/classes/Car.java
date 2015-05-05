/**
 * 
 */
package org.cuatrovientos.classes;

/**
 * Represents a car
 * @author Pello Altadill
 *
 */
public class Car {
	private String model;
	private String plate;

	/**
	 * default constructor
	 */
	public Car () {
		this.model = "ACME car";
		this.plate = "0666 EVL";
	}
	
	// POJO: Plain Old Java Object
	
	/**
	 * @param model
	 * @param plate
	 */
	public Car(String model, String plate) {
		this.model = model;
		this.plate = plate;
	}



	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the plate
	 */
	public String getPlate() {
		return plate;
	}
	/**
	 * @param plate the plate to set
	 */
	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	
	
}
