/**
 * 
 */
package org.cuatrovientos.maven.userlist;

/**
 * @author Administrador
 *
 */
public class User {
	private String name;
	private String surname;
	
	/**
	 * default constructor
	 */
	public User () {
		
	}
	
	
	/**
	 * @param name
	 * @param surname
	 */
	public User(String name, String surname) {
		this.name = name;
		this.surname = surname;
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
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + "]";
	}
	
}
