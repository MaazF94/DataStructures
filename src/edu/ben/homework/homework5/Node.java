package edu.ben.homework.homework5;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 */

public class Node {

	/**
	 * class variables
	 */
	private Object value; // class variables
	private Node next;

	/**
	 * constructor for node
	 * 
	 * @param value
	 *            which is the value passed in
	 */
	public Node(Object value) { // constructor
		this.value = value;
	}

	/**
	 * get the value
	 * 
	 * @return value of object
	 */
	public Object getValue() { // get the value
		return value;
	}

	/**
	 * set the value
	 * 
	 * @param value
	 *            of the object
	 */
	public void setValue(int value) { // set the value
		this.value = value;
	}

	/**
	 * get the next node
	 * 
	 * @return next node of list
	 */
	public Node getNext() { // get next
		return next;
	}

	/**
	 * set the next node
	 * 
	 * @param next
	 *            node of the list
	 */
	public void setNext(Node next) { // set next
		this.next = next;
	}
}
