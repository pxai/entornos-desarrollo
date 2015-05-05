/**
 * 
 */
package org.cuatrovientos.kitty;

/**
 * @author Administrador
 *
 */
public class Fruit extends Food {

	private String vitamin;
	
	/**
	 * constructor from superclass
	 * @param name
	 * @param weight
	 */
	public Fruit(String name, float weight) {
		super(name, weight);
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fruit [vitamin=" + vitamin + ", name=" + name + ", weight="
				+ weight + "]";
	}


	
}
