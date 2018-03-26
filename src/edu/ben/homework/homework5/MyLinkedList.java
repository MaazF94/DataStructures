package edu.ben.homework.homework5;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 */

public class MyLinkedList implements MyLinkedListInterface {
	/**
	 * class variable
	 */
	private Node head;

	/**
	 * constructor for linked list
	 */
	public MyLinkedList() {
		head = null; // head is a null node
	}

	/**
	 * Inserts the specified element at the specified position in this list.
	 * 
	 * @param index
	 *            the spot you want to add it in
	 * @param o
	 *            the object being passed in
	 */
	@Override
	public void add(int index, Object o) {
		if (head == null) {
			head = new Node(o);
			return;
		} else if (index > 0 && index <= getSize()) {
			index--;
			Node temp = new Node(o);
			Node current = head;
			// go to the requested index or the last element in the list,
			// whichever comes first
			while (current.getNext() != null && index != 0) {
				current = current.getNext();
				index--;
			}
			// set the new node's next-node reference to this node's next-node
			// reference
			temp.setNext(current.getNext());
			// now set this node's next-node reference to the new node
			current.setNext(temp);
		} else if (index == 0) {
			Node temp = new Node(o);
			temp.setNext(head);
			head = temp;
		}
	}

	/**
	 * Appends the specified element to the end of this list.
	 * 
	 * @param o
	 *            the object being added in
	 */
	@Override
	public void add(Object o) {
		add(getSize(), o); // add to end of list
	}

	/**
	 * Inserts all of the elements in the specified collection into this list
	 * 
	 * @param values
	 *            the array of values that will be added in
	 */
	@Override
	public void addAll(Object[] values) {
		for (int i = 0; i < values.length; i++) {
			add(values[i]); // use the add method you already made
		}
	}

	/**
	 * Inserts the specified element at the beginning of this list.
	 * 
	 * @param o
	 *            the object to be added first
	 */
	@Override
	public void addFirst(Object o) {
		add(0, o); // use the add method you already made, 0 index which is
					// first
	}

	/**
	 * Appends the specified element to the end of this list.
	 * 
	 * @param o
	 *            the object to be added last
	 */
	@Override
	public void addLast(Object o) {
		add(getSize(), o); // use the add method you already made, adds to end already
	}

	/**
	 * Removes all of the elements from this list.
	 */
	@Override
	public void clear() {
		head = null;
	}

	/**
	 * Returns true if this list contains the specified element.
	 * 
	 * @param o
	 *            the object that is contained in the linked list
	 * @return false if empty, true if found, false if not
	 */
	@Override
	public boolean contains(Object o) {
		if (isEmpty()) { // check if empty
			return false;
		}
		Node current = head;
		while (current != null) {
			if (current.getValue().equals(o)) { // checks here
				return true;
			}
			current = current.getNext(); // keep checking
		}

		return false;
	}

	/**
	 * Returns the element at the specified position in this list.
	 * 
	 * @param index
	 *            the spot where the variable is
	 * @return null if index not found, null if empty, or the index
	 */
	@Override
	public Object get(int index) {
		// index must be 1 or higher
		if (index < 0) {
			return null;
		}

		Node current = head;
		for (int i = 0; i < index; i++) { // go to specified index
			if (current == null) {
				return null;
			}
			current = current.getNext();
		}
		return current.getValue();
	}

	/**
	 * Returns the first element in this list.
	 * 
	 * @return the object at the first index
	 */
	@Override
	public Object getFirst() {
		if (isEmpty()) {
			return null;
		}

		return get(0); // use get and put first index
	}

	/**
	 * NOT NORMALLY IMPLEMENTED AS THIS WILL EXPOSE OUR LIST. ONLY HERE FOR
	 * PURPOSES OF THIS ASSIGNMENT.
	 * 
	 * Returns the head of the list.
	 * 
	 * @return head which is the first node
	 */
	@Override
	public Node getHead() {
		if (head == null) {
			return null;
		}

		return head;

	}

	/**
	 * Returns the last element in this list.
	 * 
	 * @return get(listCount - 1) null if empty or the last object
	 */
	@Override
	public Object getLast() {
		if (isEmpty()) {
			return null;
		}

		return get(getSize() - 1); // index is 1 less than size
	}

	/**
	 * Returns the number of elements in this list.
	 * 
	 * @return listCount which is the number of elements added into the list
	 */
	@Override
	public int getSize() {
		int variable = 0;
		Node current = head;
		while (current != null) {
			variable++; // keeps track
			current = current.getNext();
		}

		return variable;
	}

	/**
	 * Returns the index of the first occurrence of the specified element in
	 * this list, or -1 if this list does not contain the element.
	 * 
	 * @param o
	 *            the object we pass in
	 * @return the index of the object
	 */
	@Override
	public int indexOf(Object o) {
		if (isEmpty()) {
			return -1;
		}
		int index = 1;
		Node current = head;
		while (current.getValue() != o) { // check here
			current = current.getNext();
			if (current == null) {
				return -1;
			}
			index++;
		}
		return index;
	}

	/**
	 * Return true if the list is empty, false otherwise
	 * 
	 * @return true if empty or false if not empty
	 */
	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	/**
	 * Returns the index of the last occurrence of the specified element in this
	 * list, or -1 if this list does not contain the element.
	 * 
	 * @param o
	 *            is the object we pass in
	 * @return index which is the index of the object
	 */
	@Override
	public int lastIndexOf(Object o) {
		if (isEmpty()) {
			return -1;
		}
		int index = 0;
		Node current = head;
		int lastIndex = 1;
		while (current.getNext() != null) {
			lastIndex++;
			current = current.getNext();
			if (current.getValue().equals(o)) {
				index = lastIndex;
			}
		}
		return index;
	}

	/**
	 * Retrieves, but does not remove, the head (first element) of this list.
	 * 
	 * @return get(0) which is the first element
	 */
	@Override
	public Object peek() {
		if (isEmpty()) {
			return null;
		}

		return get(0);
	}

	/**
	 * Retrieves, but does not remove, the last element of this list, or returns
	 * null if this list is empty.
	 * 
	 * @return get(listCount - 1) null if empty or the last element
	 */
	@Override
	public Object peekLast() {
		if (isEmpty()) {
			return null;
		}

		return get(getSize() - 1);
	}

	/**
	 * Retrieves and removes the head (first element) of this list.
	 * 
	 * @return The first element of the list, null if empty
	 */
	@Override
	public Object remove() {
		if (isEmpty()) {
			return null;
		}
		Node temp = head;
		head = temp.getNext();

		return temp.getValue();

	}

	/**
	 * Removes and returns the last element from this list.
	 * 
	 * @return The last element of the list, null if empty
	 */
	@Override
	public Object removeLast() {
		if (isEmpty()) {
			return null;
		}
		Node temp = head;
		for (int i = 0; i < getSize() - 1; i++) {
			temp = temp.getNext();
		}

		return temp.getValue();
	}

	/**
	 * Returns an array containing all of the elements in this list in proper
	 * sequence (from first to last element).
	 * 
	 * @return An array representation of the list or an empty array if list is
	 *         empty
	 */
	@Override
	public Object[] toArray() {
		Object[] array = new Object[getSize()];
		Node current = head;
		if (isEmpty()) {
			return array;
		}

		for (int i = 0; i < getSize(); i++) {
			if (current != null) {
				array[i] = current.getValue();
			}
			current = current.getNext();
		}
		return array;
	}

	/**
	 * Returns a string representation of the Linked List Data Structure in the
	 * following form: "List = [<i>value1, value2, value3</i>]"
	 * 
	 * @return output representing the linked list
	 */
	public String toString() {
		String output = "";
		Node current = head;
		while (current != null) {
			output += "[" + current.getValue().toString() + "]";
			current = current.getNext();
		}
		return output;
	}

}
