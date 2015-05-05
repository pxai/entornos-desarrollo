/**
 * 
 */
package org.cuatrovientos.javakart;

import java.util.Random;

/**
 * Represents a Vehicle
 * @author Pello Altadill
 *
 */
public class Vehicle {
	protected String name;
	protected int speed;
	protected int acceleration;
	protected int grip;
	
	/**
	 * constructor
	 * @param name
	 */
	public Vehicle (String name) {
		this.name = name;
		speed = 0;
		acceleration = 0;
		grip = 0;
		init();
	}
	
	/**
	 * inits vehicle values
	 */
	private void init () {
		int pointsLeft = 18;
		int randomPoints = 0;
		int max = 3;
		Random random = new Random();

		// deal points randomly 
		// until they're finished
		
		do {
			randomPoints = random.nextInt(max) + 1;
			
			switch (random.nextInt(3)) {
				case 0: speed = speed + randomPoints;
						break;
				case 1: acceleration = acceleration + randomPoints;
						break;
				default: grip = grip + randomPoints;
						break;
			}
			pointsLeft = pointsLeft - randomPoints;
			if (pointsLeft < max) {
				max = pointsLeft;
			}
			
			// Uncomment this to check how values are evolving...
			// System.out.println(pointsLeft + ":" + randomPoints + ":" + max);
			
		} while (pointsLeft != 0);
	}
	
	/**
	 * simulates movement
	 * @return points of movement
	 */
	public int move () {
		int points = 0;
		Random random = new Random();
		
		points = speed + acceleration + random.nextInt(6); 
		
		return points;
	}
	
	/**
	 * simulates maneuvre
	 * @return points of maneuvre
	 */
	public int maneuvre () {
		int points = 0;
		Random random = new Random();
		
		points = grip + random.nextInt(6); 
		
		return points;
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
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * @return the acceleration
	 */
	public int getAcceleration() {
		return acceleration;
	}
	/**
	 * @param acceleration the acceleration to set
	 */
	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}
	/**
	 * @return the grip
	 */
	public int getGrip() {
		return grip;
	}
	/**
	 * @param grip the grip to set
	 */
	public void setGrip(int grip) {
		this.grip = grip;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", speed=" + speed + ", acceleration="
				+ acceleration + ", grip=" + grip + "]";
	}
	
	
	
}
