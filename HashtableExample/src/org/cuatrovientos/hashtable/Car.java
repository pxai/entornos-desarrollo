package org.cuatrovientos.hashtable;

public class Car {
	private String plate;
	private String model;
	
	
	/**
	 * @param plate
	 * @param model
	 */
	public Car(String plate, String model) {
		this.plate = plate;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [plate=" + plate + ", model=" + model + "]";
	}
	
	
}
