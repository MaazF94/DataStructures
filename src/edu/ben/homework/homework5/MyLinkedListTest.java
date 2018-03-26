package edu.ben.homework.homework5;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	MyLinkedList list = new MyLinkedList();

	@Test
	public void testAdd() {
		list.addFirst(3);
		list.add(1);
		list.add(2);
		list.add(2, 5);
		list.addLast(2);
		String expected = "[3][1][5][2][2]";
		String actual = list.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testGet() {
		list.add(3);
		list.add(5);
		Object expected = 5;
		Object actual = list.get(1);
		assertEquals(expected, actual);

		Object expected1 = 5;
		Object actual1 = list.getLast();
		assertEquals(expected1, actual1);

		Object expected2 = 5;
		Object actual2 = list.peekLast();
		assertEquals(expected2, actual2);

		Object expected3 = 3;
		Object actual3 = list.peek();
		assertEquals(expected3, actual3);
	}

	@Test
	public void testAddAll() {
		list.add(3);
		Object[] ll = { 1, 2, 3, 4 };
		list.addAll(ll);
		Object expected = 1;
		Object actual = list.get(1);
		assertEquals(expected, actual);

		String expected1 = "[3][1][2][3][4]";
		String actual1 = list.toString();
		assertEquals(expected1, actual1);
	}

	@Test
	public void testGetSize() {
		list.add(3);
		list.add(5);
		int expected = 2;
		int actual = list.getSize();
		assertEquals(expected, actual);
	}

	@Test
	public void testClear() {
		list.add(3);
		list.add(2);
		list.clear();
		String expected = "";
		String actual = list.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testRemove() {
		list.add(3);
		Object expected = 3;
		Object actual = list.remove();
		assertEquals(expected, actual);
	}

	@Test
	public void testRemoveLast() {
		list.add(3);
		list.add(5);
		Object expected = 5;
		Object actual = list.removeLast();
		assertEquals(expected, actual);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testToArray() {
		list.add(3);
		list.add(5);
		Object[] expected = { 3, 5 };
		Object[] actual = list.toArray();
		assertEquals(expected, actual);
	}

	@Test
	public void testContains() {
		list.add(5);
		list.add("b");
		boolean expected = true;
		boolean actual = list.contains(5);
		assertEquals(expected, actual);
	}

	@Test
	public void testIndexOf() {
		list.add(3);
		list.add(5);
		list.add(3);
		list.add(8);
		list.add(9);
		list.add(3);
		int expected = 1;
		int actual = list.indexOf(3);
		assertEquals(expected, actual);

		int expected1 = 6;
		int actual1 = list.lastIndexOf(3);
		assertEquals(expected1, actual1);
	}
}
