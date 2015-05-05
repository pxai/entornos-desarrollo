/**
 * 
 */
package org.cuatrovientos.parking;

/**
 * Represents a Car, hello
 * @author Pello Altadill
 *
 */
public class Car {
	private String plate;
	private String model;
	private String color;
	/**
	 * @param plate
	 * @param model
	 * @param color
	 */
	public Car(String plate, String model, String color) {
		this.plate = plate;
		this.model = model;
		this.color = color;
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [plate=" + plate + ", model=" + model + ", color=" + color
				+ "]";
	}
	
	
}
