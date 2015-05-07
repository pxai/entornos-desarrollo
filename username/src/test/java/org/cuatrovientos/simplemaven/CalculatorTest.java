package org.cuatrovientos.simplemaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class for testing Calculator
 * @author Pello Altadill
 *
 */
public class CalculatorTest {
	
	private Calculator target;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		target = new Calculator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.cuatrovientos.simplemaven.Calculator#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		int expected = 42;
		int actual = target.add(40,2);
		assertEquals("Testing add",expected, actual);
	}
	
	/**
	 * Test method for {@link org.cuatrovientos.simplemaven.Calculator#add(int, int)}.
	 */
	@Test
	public void testSub() {
		int expected = 38;
		int actual = target.sub(40,2);
		assertEquals("Testing sub",expected, actual);
	}
	
	/**
	 * Test method for {@link org.cuatrovientos.simplemaven.Calculator#add(int, int)}.
	 */
	@Test
	public void testMul() {
		int expected = 80;
		int actual = target.mul(40,2);
		assertEquals("Testing mul",expected, actual);
	}
	
	/**
	 * Test method for {@link org.cuatrovientos.simplemaven.Calculator#add(int, int)}.
	 */
	@Test
	public void testDiv() {
		int expected = 20;
		int actual = target.div(40,2);
		assertEquals("Testing div", expected, actual);
	}

}
