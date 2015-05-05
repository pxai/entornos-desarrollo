/**
 * 
 */
package org.cuatrovientos.oop;

/**
 * Represents a student
 * @author Pello Altadill
 *
 */
public class Student  extends  Person {
	private String school;
	
	public Student () {
		school = "Cuatroviento High School";
	}

	
	/**
	 * @param name
	 * @param age
	 * @param phone
	 */
	public Student(String name, int age, String phone) {
		super(name, age, phone);
		
	}



	/**
	 * @param school
	 */
	public Student(String school) {
		this.school = school;
	}



	/**
	 * learns
	 */
	public void learn () {
		System.out.println("I'm learning");
		
	}
	
	
}
