package edu.ben.labs.lab4;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void testPeek() {
		MyStack ms = new MyStack(1);

		ms.push("a");
		String expected2 = "a";
		String actual2 = ms.peek();
		assertEquals(expected2, actual2);

		ms.push("b");
		String expected = "b";
		String actual = ms.peek();
		assertEquals(expected, actual);
	}

	@Test
	public void testPush() {
		MyStack ms = new MyStack(1);

		ms.push("a");
		String expected2 = "a";
		String actual2 = ms.peek();
		assertEquals(expected2, actual2);

		ms.push("b");
		String expected3 = "b";
		String actual3 = ms.peek();
		assertEquals(expected3, actual3);

		ms.push("c");
		String expected4 = "c";
		String actual4 = ms.peek();
		assertEquals(expected4, actual4);
	}

	@Test
	public void testIsEmpty() {
		MyStack ms = new MyStack(1);

		boolean expected = true;
		boolean actual = ms.isEmpty();
		assertEquals(expected, actual);

		ms.push("a");
		boolean expected1 = false;
		boolean actual1 = ms.isEmpty();
		assertEquals(expected1, actual1);
	}

	@Test
	public void testGetSize() {
		MyStack ms = new MyStack(1);

		int expected = 0;
		int actual = ms.getSize();
		assertEquals(expected, actual);

		ms.push("a");
		int expected1 = 1;
		int actual1 = ms.getSize();
		assertEquals(expected1, actual1);
	}

	@Test
	public void testPop() {
		MyStack ms = new MyStack(1);

		ms.push("a");
		ms.push("b");
		ms.pop();
		String expected = "a";
		String actual = ms.peek();
		assertEquals(expected, actual);
	}

	@Test
	public void testIsFull() {
		MyStack ms = new MyStack(1);

		ms.push("a");
		boolean expected = true;
		boolean actual = ms.isFull();
		assertEquals(expected, actual);

		ms.pop();
		boolean expected1 = false;
		boolean actual1 = ms.isFull();
		assertEquals(expected1, actual1);
	}

	@Test
	public void testGetCapacity() {
		MyStack ms = new MyStack(1);

		int expected = 1;
		int actual = ms.getCapacity();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRemainingCapacity() {
		MyStack ms = new MyStack(1);

		int expected = 1;
		int actual = ms.getRemainingCapacity();
		assertEquals(expected, actual);
	}

	@Test
	public void testToString() {
		MyStack ms = new MyStack(1);

		ms.push("musa");
		ms.push("hamza");
		ms.push("a");
		assertEquals("My Stack array = " + "\n" + "a" + "\n" + "hamza" + "\n"
				+ "musa", ms.toString());
	}
}
