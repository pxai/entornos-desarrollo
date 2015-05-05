/**
 * 
 */
package org.cuatrovientos.javakart;

/**
 * Represents a Car
 * @author Pello Altadill
 *
 */
public class Car extends Vehicle {
	private String plate;
	
	public Car(String name) {
		super(name);
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [plate=" + plate + ", toString()=" + super.toString() + "]";
	}

	
}
