package edu.ben.homework.homework6;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 * @param <E>
 *            the generic type
 */

public class MyLinkedList<E> {

	/**
	 * class variable
	 */
	private Node<E> head; // head variable

	/**
	 * constructor
	 */
	public MyLinkedList() { // constructor
		head = null;
	}

	/**
	 * constructor
	 * 
	 * @param value
	 *            being passed in
	 */
	public MyLinkedList(E value) { // constructor
		head = new Node<E>(value);
	}

	/**
	 * adds a value to the linked list
	 * 
	 * @param value
	 *            integer being added in
	 */
	public void add(E value) { // add a value to the linked list
		if (head == null) {
			head = new Node<E>(value);
			return;
		} else {
			Node<E> temp = new Node<E>(value);
			Node<E> current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			// set the new node's next-node reference to this node's next-node
			// reference
			temp.setNext(current.getNext());
			// now set this node's next-node reference to the new node
			current.setNext(temp);
		}
	}

	/**
	 * get the head
	 * 
	 * @return head which is the head of the linked list
	 */
	public Node<E> getHead() { // get the head
		if (head == null) {
			return null;
		}
		return head;

	}

	/**
	 * toString for linked list
	 * 
	 * @return String the linked list
	 */
	public String toString() { // display the linked list
		String output = "";
		Node<E> current = head;
		while (current != null) {
			output += "[" + current.getValue().toString() + "]";
			current = current.getNext();
		}
		return output;
	}

}
