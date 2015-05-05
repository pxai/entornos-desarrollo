package org.cuatrovientos.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableExample {

	public static void main(String[] args) {
		Hashtable<String,Car> cars = new Hashtable<String,Car>();
		
		Car myCar = new Car("0666EVL","Delorean");
		
		cars.put("0666EVL", myCar);

		Car otherCar = new Car("0042ASI","Opel Corsa");
		
		cars.put(otherCar.getPlate(), otherCar);
		
		cars.put("0095MAQ", new Car("0095MAQ","Lightning Mcqueen"));
		
		
		System.out.println(cars.get("0666EVL").toString());
		
		cars.remove("0042ASI");
		
		if (cars.get("0042ASI") == null) {
			System.out.println("That car doesn't exist");
		}

		// Get all the keys
		Enumeration<String> keys = cars.keys();
		
		while (keys.hasMoreElements()) {
			// get current key
			String k = keys.nextElement();
			// show car instance
			System.out.println(cars.get(k));
		}
		
		
		
	}

}
