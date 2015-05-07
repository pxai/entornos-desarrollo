/**
 * 
 */
package org.cuatrovientos.simplemaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Administrador
 *
 */
public class UserNameTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.cuatrovientos.simplemaven.UserName#UserName()}.
	 */
	@Test
	public void testUserName() {
		UserName target = new UserName();
		String expectedName = "";
		String actualName = target.getName();
		
		assertEquals("Testing default cons.", expectedName, actualName);
	}

	/**
	 * Test method for {@link org.cuatrovientos.simplemaven.UserName#UserName(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUserNameStringString() {
		UserName target = new UserName("Jon","Snow");
		String expectedName = "Jon";
		String actualName = target.getName();
		
		assertEquals("Testing constructor with params", expectedName, actualName);

	}

	/**
	 * Test method for {@link org.cuatrovientos.simplemaven.UserName#generate()}.
	 */
	@Test
	public void testGenerate() {
		UserName target = new UserName("Jon","Snow");
		String expected = "jon_snow";
		String actual = target.generate();
		
		assertEquals("Testing generate", expected, actual);

	}

	
	@Test
	public void testGenerateEmpty() {
		UserName target = new UserName();
		String expected = "-empty-";
		String actual = target.generate();
		
		assertEquals("Testing empty generation", expected, actual);

	}
}
