package edu.ben.labs.lab1;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class Lab1Test extends Lab1 {

	@Test
	public void testAddInt() throws Exception {
		int result = Lab1.add(15, 11);
        assertEquals(26, result, 0);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testAddDouble() throws Exception {
		double result = Lab1.add(15.3, 11.2);
        Assert.assertEquals(26.5, result);
	}

	@Test
	public void testDivide() throws Exception {
		int result = Lab1.divide(15, 5);
        assertEquals(3, result, 0);

	}

	@Test
	public void testDivideFloat() throws Exception {
		float result = Lab1.divide(20, 5);
        assertEquals(4, result, 0);
	}

	@Test
	public void testAddFloat() throws Exception {
		float result = Lab1.add(25F, 5F);
        assertEquals(30F, result, 0);

	}

	@Test
	public void testDivideDouble() throws Exception {
		double result = Lab1.divide(25, 5);
        assertEquals(5, result, 0);
	}

	@Test
	public void testCharacterCount() throws Exception {
		String text = "Hi my name is Maaz & I am in CMSC 205!";

		int count = 0;

		char[] c = text.toCharArray();
		for (int i = 0; i < text.length(); i++) {
			if (c[i] != ' ')
				count++;
		}

		int spaces = text.length() - count;
		count = spaces + count;

		assertEquals(38, count);
	}

	@Test
	public void testformatText() {
		String a = "Abcde";
		String b = new String(a);
		assertTrue(a.equals(b));
		assertFalse(a == b);
		assertEquals(a, b);
	}
}
