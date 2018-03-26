package edu.ben.labs.lab4;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {

	@Test
	public void testPeek() throws Exception {

		MyQueue mq = new MyQueue(1);
		mq.enqueue("a");
		String expected = "a";
		String actual = mq.peek();

		assertEquals(expected, actual);

		mq.dequeue();

		String expected2 = null;
		String actual2 = mq.peek();

		assertEquals(expected2, actual2);

	}

	@Test
	public void testEnqueue() throws Exception {
		MyQueue mq = new MyQueue(1);

		boolean expected = true;
		boolean actual = mq.enqueue("a");
		assertEquals(expected, actual);

		MyQueue empty = new MyQueue(0);

		boolean expected1 = false;
		boolean actual2 = mq.enqueue("a");
		assertEquals(expected1, actual2);

	}

	@Test
	public void testGetSize() throws Exception {
		MyQueue mq = new MyQueue(5);

		mq.enqueue("a");
		mq.enqueue("b");
		mq.enqueue("c");
		mq.dequeue();

		int expected = 2;
		int actual = mq.getSize();

		assertEquals(expected, actual);
	}

	@Test
	public void testIsFull() throws Exception {
		MyQueue mq = new MyQueue(1);
		mq.enqueue("a");

		boolean expected = true;
		boolean actual = mq.isFull();
		assertEquals(expected, actual);

		mq.dequeue();
		boolean expected1 = false;
		boolean actual2 = mq.isFull();
		assertEquals(expected1, actual2);
	}

	@Test
	public void isEmpty() throws Exception {
		MyQueue mq = new MyQueue(1);
		mq.enqueue("a");
		mq.dequeue();

		boolean expected = true;
		boolean actual = mq.isEmpty();
		assertEquals(expected, actual);

		mq.enqueue("a");
		boolean expected1 = false;
		boolean actual2 = mq.isEmpty();
		assertEquals(expected1, actual2);
	}

	@Test
	public void testDequeue() throws Exception {
		MyQueue mq = new MyQueue(2);
		mq.enqueue("a");

		String expected = "a";
		String actual = mq.dequeue();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCapacity() {
		MyQueue mq = new MyQueue(5);

		mq.enqueue("a");
		mq.enqueue("b");

		int expected = 5;
		int actual = mq.getCapacity();

		assertEquals(expected, actual);

	}

	@Test
	public void testGetRemainingCapacity() {
		MyQueue mq = new MyQueue(10);
		mq.enqueue("a");
		mq.enqueue("b");
		mq.enqueue("c");
		mq.enqueue("d");

		int expected = 6;
		int actual = mq.getRemainingCapacity();
		assertEquals(expected, actual);
	}

	@Test
	public void testToString() {
		MyQueue mq = new MyQueue(2);
		mq.enqueue("a");
		mq.enqueue("b");
		System.out.println(mq);

		assertEquals("My Queue [array = a, b]", mq.toString());
	}
}