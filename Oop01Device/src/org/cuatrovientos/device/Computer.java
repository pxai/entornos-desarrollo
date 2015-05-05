/**
 * 
 */
package org.cuatrovientos.device;

/**
 * Represents a Computer
 * @author Pello Altadill
 *
 */
public class Computer extends Device {

	private String processor;
	
	/**
	 * @param name
	 * @param brand
	 * @param price
	 */
	public Computer(String name, String brand, String price) {
		super(name, brand, price);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the processor
	 */
	public String getProcessor() {
		return processor;
	}

	/**
	 * @param processor the processor to set
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Computer [processor=" + processor + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
