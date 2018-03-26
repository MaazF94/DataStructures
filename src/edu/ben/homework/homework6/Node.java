package edu.ben.homework.homework6;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * @param <E>
 *            the generic type
 */

public class Node<E> {

	/**
	 * class variables
	 */
	private Node<E> next;
	private E value;

	/**
	 * constructor
	 * 
	 * @param value
	 *            value being passed in
	 */
	public Node(E value) {
		this.value = value;
	}

	/**
	 * constructor
	 * 
	 * @param value
	 *            being passed in
	 * @param object
	 *            the next object
	 */
	public Node(E value, Node<E> object) {
		this.value = value;
		next = object;
	}

	/**
	 * get next
	 * 
	 * @return next which is the next node
	 */
	public Node<E> getNext() {
		return next;
	}

	/**
	 * set next
	 * 
	 * @param next
	 *            set the next node
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}

	/**
	 * get value
	 * 
	 * @return value which is the value of the node
	 */
	public E getValue() {
		return value;
	}

	/**
	 * set the value
	 * 
	 * @param value
	 *            pass in the integer
	 */
	public void setValue(E value) {
		this.value = value;
	}

	/**
	 * toString for node
	 * 
	 * @return String the node
	 */
	public String toString() {
		return "Node[value = " + value + "]";
	}

}
