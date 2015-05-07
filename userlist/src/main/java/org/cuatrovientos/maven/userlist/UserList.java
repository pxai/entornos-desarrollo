/**
 * 
 */
package org.cuatrovientos.maven.userlist;

import java.util.Vector;

/**
 * @author Administrador
 *
 */
public class UserList {
	private Vector<User> list;
	
	/**
	 * default constructor
	 */
	public UserList() {
		list = new Vector<User>();
	}
	/**
	 * adds user
	 * @param user
	 */
	public void addUser(User user)  {
		list.add(user);
	}
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public int userAt(User user) {
		for (int i =0;i< list.size();i++){
			if (list.elementAt(i).getName().equals(user.getName())){
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 
	 * @param user
	 */
	public void deleteUser(User user) {
		for (int i =0;i< list.size();i++){
			if (list.elementAt(i).getName().equals(user.getName())){
				list.removeElementAt(i);
				return;
			}
		}
	}
	
	/**
	 * @return the list
	 */
	public Vector<User> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(Vector<User> list) {
		this.list = list;
	}
	
	
}
