package edu.ben.labs.lab6;

import java.util.Collection;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements MyLinkedListInterface<E> {

	/**
	 * class variable
	 */
	private Node<E> head;

	/**
	 * Constructs a list containing the elements of the specified collection, in
	 * the order they are returned by the collection's iterator
	 * 
	 * @param c
	 *            the collection whose elements are to be placed into this list
	 * @throws NullPointerException
	 *             if the specified collection is null
	 */
	public MyLinkedList(Collection<? extends E> c) throws NullPointerException {
		head = null;
		addAll(c);
	}

	/**
	 * constructor for linked list
	 */
	public MyLinkedList() {
		head = null; // head is a null Node
	}

	/**
	 * Inserts the specified element at the specified position in this list.
	 * Shifts the element currently at that position (if any) and any subsequent
	 * elements to the right (adds one to their indices).
	 * 
	 * @param index
	 *            index at which the specified element is to be inserted
	 * @param o
	 *            element to be inserted
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range (index < 0 || index > size())
	 */
	public void add(int index, E o) throws IndexOutOfBoundsException {
		if (head == null) {
			head = new Node<E>(o);
			return;
		} else if (index > 0 && index <= getSize()) {
			index--;
			Node<E> temp = new Node<E>(o);
			Node<E> current = head;
			// go to the requested index or the last element in the list,
			// whichever comes first
			while (current.getNext() != null && index != 0) {
				current = current.getNext();
				index--;
			}
			// set the new Node's next-Node reference to this Node's next-Node
			// reference
			temp.setNext(current.getNext());
			// now set this Node's next-Node reference to the new Node
			current.setNext(temp);
		} else if (index == 0) {
			Node<E> temp = new Node<E>(o);
			temp.setNext(head);
			head = temp;
		}
	}

	/**
	 * Appends the specified element to the end of this list.
	 * 
	 * @param o
	 *            element to be inserted
	 */
	public void add(E o) {
		add(getSize(), o);

	}

	/**
	 * Inserts all of the elements in the specified collection into this list,
	 * starting at the specified position. Shifts the element currently at that
	 * position (if any) and any subsequent elements to the right (increases
	 * their indices). The new elements will appear in the list in the order
	 * that they are returned by the specified collection's iterator.
	 * 
	 * @param index
	 * @param c
	 *            collection containing elements to be added to this list
	 * @return true if this list changed as a result of the call
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range (index < 0 || index > size())
	 * @throws NullPointerException
	 *             if the specified collection is null
	 */
	public boolean addAll(int index, Collection<? extends E> c)
			throws IndexOutOfBoundsException, NullPointerException {
		if (index < 0 || index > getSize()) {
			return false;
		}
		for (int i = 0; i < c.size(); i++) {
			add(index, (E) (c.toArray()[i])); // use the add method you already
												// made
			return true;
		}
		return false;
	}

	/**
	 * Inserts all of the elements in the specified collection into this list
	 * 
	 * @param c
	 *            collection containing elements to be added to this list
	 * @return true if this list changed as a result of the call
	 * @throws NullPointerException
	 *             if the specified collection is null
	 */
	public boolean addAll(Collection<? extends E> c)
			throws NullPointerException {
		for (int i = 0; i < c.size(); i++) {
			add((E) c.toArray()[i]);
		}
		return false;

	}

	/**
	 * Inserts the specified element at the beginning of this list.
	 * 
	 * @param o
	 */
	public void addFirst(E o) {
		add(0, o); // use the add method you already made, 0 index which is
		// first
	}

	/**
	 * F Appends the specified element to the end of this list.
	 * 
	 * @param o
	 */
	public void addLast(E o) {
		add(o); // use the add method you already made, adds to end already

	}

	/**
	 * Removes all of the elements from this list.
	 */
	public void clear() {
		head = null;

	}

	/**
	 * Returns true if this list contains the specified element.
	 * 
	 * @param o
	 * @return
	 */
	public boolean contains(E o) {
		if (isEmpty()) { // check if empty
			return false;
		}
		Node<E> current = head;
		while (current != null) {
			if (current.getValue().equals(o)) {
				return true;
			}
			current = current.getNext();
		}

		return false;
	}

	/**
	 * Returns the element at the specified position in this list.
	 * 
	 * @param index
	 * @return the element at the specified position in this list
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range (index < 0 || index >= size())
	 */
	public E get(int index) throws IndexOutOfBoundsException {
		// index must be 1 or higher
		if (index < 0) {
			return null;
		}

		Node<E> current = head;
		for (int i = 0; i < index; i++) {
			if (current == null) {
				return null;
			}
			current = current.getNext();
		}
		return (E) current.getValue();
	}

	/**
	 * Returns the first element in this list.
	 * 
	 * @return
	 */
	public E getFirst() {
		if (isEmpty()) {
			return null;
		}

		return get(0);
	}

	/**
	 * NOT NORMALLY IMPLEMENTED AS THIS WILL EXPOSE OUR LIST. ONLY HERE FOR
	 * PURPOSES OF THIS ASSIGNMENT.
	 * 
	 * Returns the head of the list.
	 * 
	 * @return
	 */
	@Override
	public Node<E> getHead() {
		if (head == null) {
			return null;
		}

		return head;
	}

	/**
	 * Returns the last element in this list.
	 * 
	 * @return the last element in this list
	 * @throws NoSuchElementException
	 *             if this list is empty
	 */
	public E getLast() throws NoSuchElementException {
		if (isEmpty()) {
			return null;
		}

		return get(getSize() - 1);
	}

	/**
	 * Returns the number of elements in this list.
	 * 
	 * @return
	 */
	public int getSize() {
		int variable = 0;
		Node<E> current = head;
		while (current != null) {
			variable++;
			current = current.getNext();
		}

		return variable;
	}

	/**
	 * Returns the index of the first occurrence of the specified element in
	 * this list, or -1 if this list does not contain the element. More
	 * formally, returns the lowest index i such that (o==null ? get(i)==null :
	 * o.equals(get(i))), or -1 if there is no such index.
	 * 
	 * @param o
	 * @return the index of the first occurrence of the specified element in
	 *         this list, or -1 if this list does not contain the element
	 */
	public int indexOf(E o) {
		if (isEmpty()) {
			return -1;
		}
		int index = 1;
		Node<E> current = head;
		while (current.getValue() != o) {
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
	 * @return
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	/**
	 * Returns the index of the last occurrence of the specified element in this
	 * list, or -1 if this list does not contain the element. More formally,
	 * returns the highest index i such that (o==null ? get(i)==null :
	 * o.equals(get(i))), or -1 if there is no such index.
	 * 
	 * @param o
	 * @return the index of the last occurrence of the specified element in this
	 *         list, or -1 if this list does not contain the element
	 */
	public int lastIndexOf(E o) {
		if (isEmpty()) {
			return -1;
		}
		int index = 0;
		Node<E> current = head;
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
	 * @return
	 */
	public E peek() {
		if (isEmpty()) {
			return null;
		}

		return get(0);
	}

	/**
	 * Retrieves, but does not remove, the last element of this list, or returns
	 * null if this list is empty.
	 * 
	 * @return
	 */
	public E peekLast() {
		if (isEmpty()) {
			return null;
		}

		return get(getSize() - 1);
	}

	/**
	 * Retrieves and removes the head (first element) of this list.
	 * 
	 * @return The first element of the list, null if empty
	 * @throws if
	 *             this list is empty
	 */
	public E remove() throws NoSuchElementException {
		if (isEmpty()) {
			return null;
		}
		Node<E> temp = head;
		head = temp.getNext();

		return (E) temp.getValue();
	}

	public boolean remove(E value) {
		Node<E> current = head;
		Node<E> previous = null;
		while (current != null && !current.getValue().equals(value)) {
			previous = current;
			current = current.getNext();
		}
		if (current == null) {
			return false;
		} else if (previous != null) {
			previous.setNext(current.getNext());
		} else {
			head = head.getNext();
		}
		return true;
	}

	/**
	 * Removes and returns the last element from this list.
	 * 
	 * @return The last element of the list
	 * @throws if
	 *             this list is empty
	 */
	public E removeLast() throws NoSuchElementException {
		if (isEmpty()) {
			return null;
		}
		Node<E> temp = head;
		for (int i = 0; i < getSize() - 1; i++) {
			temp = temp.getNext();
		}

		return (E) temp.getValue();

	}

	/**
	 * <div class="block">Returns an array containing all of the elements in
	 * this list in proper sequence (from first to last element); the runtime
	 * type of the returned array is that of the specified array. If the list
	 * fits in the specified array, it is returned therein. Otherwise, a new
	 * array is allocated with the runtime type of the specified array and the
	 * size of this list.
	 * 
	 * <p>
	 * If the list fits in the specified array with room to spare (i.e., the
	 * array has more elements than the list), the element in the array
	 * immediately following the end of the list is set to <code>null</code>.
	 * (This is useful in determining the length of the list <i>only</i> if the
	 * caller knows that the list does not contain any null elements.)
	 * 
	 * </p>
	 * <p>
	 * Like the <a href="../../java/util/LinkedList.html#toArray()">
	 * <code>toArray()</code></a> method, this method acts as bridge between
	 * array-based and collection-based APIs. Further, this method allows
	 * precise control over the runtime type of the output array, and may, under
	 * certain circumstances, be used to save allocation costs.
	 * 
	 * </p>
	 * <p>
	 * Suppose <code>x</code> is a list known to contain only strings. The
	 * following code can be used to dump the list into a newly allocated array
	 * of <code>String</code>:
	 * 
	 * </p>
	 * 
	 * <pre>
	 * String[] y = x.toArray(new String[0]);
	 * </pre>
	 * 
	 * Note that <code>toArray(new Object[0])</code> is identical in function to
	 * <code>toArray()</code>.</div>
	 * 
	 * @return An array representation of the list or an empty array if list is
	 *         empty
	 * @throws NullPointerException
	 *             if the specified array is null
	 */
	public E[] toArray() {
		Object[] array = new Object[getSize()];
		Node<E> current = head;
		if (isEmpty()) {
			return (E[]) array;
		}

		for (int i = 0; i < getSize(); i++) {
			if (current != null) {
				array[i] = current.getValue();
			}
			current = current.getNext();
		}
		return (E[]) array;
	}

	/**
	 * Returns a string representation of the Linked List Data Structure in the
	 * following form: "List = [<i>value1, value2, value3</i>]"
	 * 
	 * @return A string representing the linked list
	 */
	@Override
	public String toString() {
		Node<E> current = head;
		String list = "[";
		while (current != null) {
			list += current.getValue();

			if (current.getNext() != null) {
				list += ", ";
			}
			current = current.getNext();
		}
		return "List = " + list + "]";
	}
}
