package edu.ben.labs.lab6;

public class Node<E> {

	/**
	 * class variables
	 */
	private E value; // class variables
	private Node<E> next;

	/**
	 * constructor for node
	 * 
	 * @param value
	 *            which is the value passed in
	 */
	public Node(E value) { // constructor
		this.value = value;
	}

	/**
	 * get the value
	 * 
	 * @return value of object
	 */
	public E getValue() { // get the value
		return value;
	}

	/**
	 * set the value
	 * 
	 * @param value
	 *            of the object
	 */
	public void setValue(E value) { // set the value
		this.value = value;
	}

	/**
	 * get the next node
	 * 
	 * @return next node of list
	 */
	public Node<E> getNext() { // get next
		return next;
	}

	/**
	 * set the next node
	 * 
	 * @param next
	 *            node of the list
	 */
	public void setNext(Node<E> next) { // set next
		this.next = next;
	}

	@Override
	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
	
	

}