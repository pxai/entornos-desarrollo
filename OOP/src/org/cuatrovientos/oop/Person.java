
package org.cuatrovientos.oop;

/**
 * Represents a regular person
 * @author Pello Altadill
 *
 */
public class Person {
	public String name;
	protected int age;
	private String phone;
	
	/**
	 * default constructor
	 */
	public Person () {
		name = "Rutiger";
		age = 42;
		phone = "666000666";
	}
	
	/**
	 * @param name
	 * @param age
	 * @param phone
	 */
	public Person(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	/**
	 * says hello
	 * @return hello
	 */
	public String sayHello () {
		return "Hello";
	}
	
	/**
	 * returns hello
	 * @return
	 */
	private String hello () {
		return "hello";
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
