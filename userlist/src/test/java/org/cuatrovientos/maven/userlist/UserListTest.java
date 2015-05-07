package org.cuatrovientos.maven.userlist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUserList() {
		UserList target = new UserList();
		assertNotNull("Check list null",target.getList());
	}

	@Test
	public void testUserAt() {
		UserList list = new UserList();
		User user1 = new User("Jon","Targaryen");
		list.addUser(user1);
		
		int target = list.userAt(user1);
		int expected = 0;
		
		assertEquals("User at", target, expected);
		
	}

	@Test
	public void testDeleteUser() {
		UserList list = new UserList();
		User user1 = new User("Jon","Targaryen");
		list.addUser(user1);

		assertEquals("User at", list.userAt(user1), 0);

		list.deleteUser(user1);

		int target = list.userAt(user1);
		int expected = -1;
		
		assertEquals("User delete user", target, expected);
		
		
	}

}
