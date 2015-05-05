/**
 * 
 */
package org.cuatrovientos.javakart;

/**
 * Represents a circuit where races take place
 * @author Pello Altadill
 *
 */
public class Circuit {
	private String name;
	private int length;
	
	/**
	 * @param name
	 * @param length
	 */
	public Circuit(String name, int length) {
		this.name = name;
		this.length = length;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}


	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circuit [name=" + name + ", length=" + length + "]";
	}
	
	
}
