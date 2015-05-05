/**
 * 
 */
package org.cuatrovientos.fleet;

/**
 * @author Administrador
 *
 */
public class Ship {
	private int firepower;
	private int shield;
	private boolean hyperdrive;
	private Commander commander;
	/**
	 * @param firepower
	 * @param shield
	 * @param hyperdrive
	 * @param commander
	 */
	public Ship(int firepower, int shield, boolean hyperdrive,
			Commander commander) {
		this.firepower = firepower;
		this.shield = shield;
		this.hyperdrive = hyperdrive;
		this.commander = commander;
	}
	/**
	 * @return the firepower
	 */
	public int getFirepower() {
		return firepower;
	}
	/**
	 * @param firepower the firepower to set
	 */
	public void setFirepower(int firepower) {
		this.firepower = firepower;
	}
	/**
	 * @return the shield
	 */
	public int getShield() {
		return shield;
	}
	/**
	 * @param shield the shield to set
	 */
	public void setShield(int shield) {
		this.shield = shield;
	}
	/**
	 * @return the hyperdrive
	 */
	public boolean isHyperdrive() {
		return hyperdrive;
	}
	/**
	 * @param hyperdrive the hyperdrive to set
	 */
	public void setHyperdrive(boolean hyperdrive) {
		this.hyperdrive = hyperdrive;
	}
	/**
	 * @return the commander
	 */
	public Commander getCommander() {
		return commander;
	}
	/**
	 * @param commander the commander to set
	 */
	public void setCommander(Commander commander) {
		this.commander = commander;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ship [firepower=" + firepower + ", shield=" + shield
				+ ", hyperdrive=" + hyperdrive + ", commander=" + commander
				+ "]";
	}
	
	
}
