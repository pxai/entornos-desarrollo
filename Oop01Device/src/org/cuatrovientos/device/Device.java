/**
 * 
 */
package org.cuatrovientos.device;

/**
 * @author Administrador
 *
 */
public class Device {
	protected String name;
	protected String brand;
	protected String price;
	
	/**
	 * @param name
	 * @param brand
	 * @param price
	 */
	public Device(String name, String brand, String price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
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
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Device [name=" + name + ", brand=" + brand + ", price=" + price
				+ "]";
	}
	
	
	
}
