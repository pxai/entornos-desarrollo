/**
 * 
 */
package org.cuatrovientos.device;

/**
 * @author Administrador
 *
 */
public class Mobile extends Device{
	private String number;

	public Mobile(String name, String brand, String price) {
		super(name, brand, price);
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " Mobile [number=" + number + "]";
	}
	
	

}
