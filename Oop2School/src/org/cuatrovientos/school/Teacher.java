/**
 * 
 */
package org.cuatrovientos.school;

import java.util.Arrays;

/**
 * @author Administrador
 *
 */
public class Teacher extends Person {
	private String degree;
	private String[] subjects;
	
	public Teacher () {
		degree = "DAM";
		subjects = new String[2];
		subjects[0] = "RET";
		subjects[1] = "FOL";
	}
	
	

	/**
	 * @param name
	 * @param age
	 */
	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 */
	public Teacher(String name, int age,String degree, String[] subjects) {
		super(name, age);
		this.degree = degree;
		this.subjects = subjects;
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param degree
	 * @param subjects
	 */
	public Teacher(String degree, String[] subjects) {
		super();
		this.degree = degree;
		this.subjects = subjects;
	}

	/**
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}

	/**
	 * @return the subjects
	 */
	public String[] getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teacher [degree=" + degree + ", subjects="
				+ Arrays.toString(subjects) + ", toString()="
				+ super.toString() + "]";
	}


	
	
	
}
