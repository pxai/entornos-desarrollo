/**
 * 
 */
package org.cuatrovientos.oop;

/**
 * Main class for the project
 * @author Pello Altadill
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person onePerson = new Person();
		
		onePerson.name = "Bart";
		onePerson.age = 12;
		
		System.out.println(onePerson.sayHello());
		
		Student oneStudent = new Student();
		oneStudent.name = "Daniel";
		System.out.println("Student age: "  + oneStudent.age);
		System.out.println("Student phone: "  + oneStudent.getPhone());
		
	}

}
