/**
 * 
 */
package org.cuatrovientos.school;

/**
 * Main program
 * @author Pello Altadill
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teacher oneTeacher = new Teacher("Susana",29);
		Teacher otherTeacher = new Teacher("María",35);
		Teacher yetAnotherTeacher = new Teacher("Félix",42);
		
		// create Student instance
		Student student = new Student();
		student.setAge(30);
		student.setName("John  Rambo");
		student.setDegree("Navy Seal");
		student.setCourse("1º");
		
		// Set teacher data
		oneTeacher.setDegree("Navy Seal");
		String[] subjects = {"FOL","Hand to hand combat",""};
		oneTeacher.setSubjects(subjects);

		// show them
		System.out.println(student.toString());
		System.out.println(oneTeacher.toString());

	}

}
