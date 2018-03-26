package edu.ben.homework.homework5;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 */

public interface MyLinkedListInterface {
	/**
	 * Inserts the specified element at the specified position in this list.
	 * 
	 * @param index
	 *            the spot you want to add it in
	 * @param o
	 *            the object being passed in
	 */
	void add(int index, Object o);

	/**
	 * Appends the specified element to the end of this list.
	 * 
	 * @param o
	 *            the object being added in
	 */
	void add(Object o);

	/**
	 * Inserts all of the elements in the specified collection into this list
	 * 
	 * @param values
	 *            the array of values that will be added in
	 */
	void addAll(Object[] values);

	/**
	 * Inserts the specified element at the beginning of this list.
	 * 
	 * @param o
	 *            the object to be added first
	 */
	void addFirst(Object o);

	/**
	 * Appends the specified element to the end of this list.
	 * 
	 * @param o
	 *            the object to be added last
	 */
	void addLast(Object o);

	/**
	 * Removes all of the elements from this list.
	 */
	void clear();

	/**
	 * Returns true if this list contains the specified element.
	 * 
	 * @param o
	 *            the object that is contained in the linked list
	 * @return false if empty, true if found, false if not
	 */
	boolean contains(Object o);

	/**
	 * Returns the element at the specified position in this list.
	 * 
	 * @param index
	 *            the spot where the variable is
	 * @return null if index not found, null if empty, or the index
	 */
	Object get(int index);

	/**
	 * Returns the first element in this list.
	 * 
	 * @return the object at the first index
	 */
	Object getFirst();

	/**
	 * NOT NORMALLY IMPLEMENTED AS THIS WILL EXPOSE OUR LIST. ONLY HERE FOR
	 * PURPOSES OF THIS ASSIGNMENT.
	 * 
	 * Returns the head of the list.
	 * 
	 * @return head which is the first node
	 */
	Node getHead();

	/**
	 * Returns the last element in this list.
	 * 
	 * @return get(listCount - 1) null if empty or the last object
	 */
	Object getLast();

	/**
	 * Returns the number of elements in this list.
	 * 
	 * @return listCount which is the number of elements added into the list
	 */
	int getSize();

	/**
	 * Returns the index of the first occurrence of the specified element in
	 * this list, or -1 if this list does not contain the element.
	 * 
	 * @param o
	 *            the object we pass in
	 * @return the index of the object
	 */
	int indexOf(Object o);

	/**
	 * Return true if the list is empty, false otherwise
	 * 
	 * @return true if empty or false if not empty
	 */
	boolean isEmpty();

	/**
	 * Returns the index of the last occurrence of the specified element in this
	 * list, or -1 if this list does not contain the element.
	 * 
	 * @param o
	 *            is the object we pass in
	 * @return index which is the index of the object
	 */
	int lastIndexOf(Object o);

	/**
	 * Retrieves, but does not remove, the head (first element) of this list.
	 * 
	 * @return get(0) which is the first element
	 */
	Object peek();

	/**
	 * Retrieves, but does not remove, the last element of this list, or returns
	 * null if this list is empty.
	 * 
	 * @return the last element of the list
	 */
	Object peekLast();

	/**
	 * Retrieves and removes the head (first element) of this list.
	 * 
	 * @return The first element of the list, null if empty
	 */
	Object remove();

	/**
	 * Removes and returns the last element from this list.
	 * 
	 * @return The last element of the list, null if empty
	 */
	Object removeLast();

	/**
	 * Returns an array containing all of the elements in this list in proper
	 * sequence (from first to last element).
	 * 
	 * @return An array representation of the list or an empty array if list is
	 *         empty
	 */
	Object[] toArray();

	/**
	 * Returns a string representation of the Linked List Data Structure in the
	 * following form: "List = [<i>value1, value2, value3</i>]"
	 * 
	 * @return A string representing the linked list
	 */
	@Override
	String toString();
}