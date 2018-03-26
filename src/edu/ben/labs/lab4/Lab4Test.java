package edu.ben.labs.lab4;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class Lab4Test {

	@Test
	public void testPalindromeTrue() {

		boolean expected = true;
		boolean actual = Lab4.testPalindrome("Amore, roma");
		assertEquals(expected, actual);
	}

	@Test
	public void testPalindromeFalse() {

		boolean expected = false;
		boolean actual = Lab4.testPalindrome("Hello");
		assertEquals(expected, actual);
	}

	@Test
	public void testFile() throws FileNotFoundException {
		Lab4.testFile("Lab4.txt");
	}
}
