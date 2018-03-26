package edu.ben.homework.homework4;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 */

public class MyStack {

	/**
	 * class variables
	 */
	private Object[] array; // treat this as stack
	private static final int DEFAULT_SIZE = 1; // the size will remain this
	private int counter; // when objects are added or removed, keep count

	/**
	 * constructor for the stack
	 */
	public MyStack() {
		array = new Object[DEFAULT_SIZE]; // set the stack equal to default size
		counter = 0; // when objects are added or removed, keep count

	}

	/**
	 * peek will look at the top of the stack without removing it
	 * 
	 * @return the top of the stack, null if it's empty
	 */
	public Object peek() {
		if (array != null) {
			return array[counter - 1]; // the top of the stack
		} else {
			return null;
		}

	}

	/**
	 * push will pass in an object and 'push' it to the bottom of the stack
	 * expand the array if not enough room
	 * 
	 * @param o
	 *            which is an object that will be passed in
	 */
	public void push(Object o) {

		if (counter < array.length) { // there is room in the stack, add
			array[counter++] = o;
		} else {

			Object[] newArray = new Object[array.length + 1]; // expand the
																// array
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray; // set old stack = to new stack and then add in
								// the objects
			array[counter++] = o;
		}
	}

	/**
	 * pop will remove an object from the top of the stack
	 * 
	 * @return null if empty or the object at the top of the stack
	 */
	public Object pop() {
		if (!isEmpty()) {
			return array[--counter];
		}

		return null;
	}

	/**
	 * get's how many objects are in the stack
	 * 
	 * @return the number of objects in the stack
	 */
	public int getSize() {
		return counter; // the number of objects in the stack
	}

	/**
	 * the entire length of the stack
	 * 
	 * @return the length of the array
	 */
	public int getCapacity() {

		return array.length; // the size of the stack
	}

	/**
	 * should be the remainder of the size of the stack - the objects in the
	 * stack
	 * 
	 * @return the remaining capacity
	 */
	public int getRemainingCapacity() {

		return array.length - counter; // difference between size and objects
	}

	/**
	 * the stack is full
	 * 
	 * @return the objects are = to the size of the stack
	 */
	public boolean isFull() {

		return counter == array.length; // the entire array size is equal to the
										// elements in the stack
	}

	/**
	 * if the stack is empty, this will return 0
	 * 
	 * @return counter is 0 because there's nothing in the stack
	 */
	public boolean isEmpty() {

		return counter == 0; // the counter is 0 which means there are no
								// elements in the queue
	}

	/**
	 * converts the stack to a string
	 * 
	 * @return the string
	 */
	@Override
	public String toString() {
		String s = "My Stack array = "; // will display our stack
		for (int i = counter - 1; i >= 0; i--) {
			if (i >= 0) {
				s += "\n";
			}

			s = s + array[i];
		}
		return s;
	}

	/**
	 * adds the objects in an array to the array that we made
	 * 
	 * @param o
	 *            which are the objects that will be created in the reference
	 *            tests
	 * @return true since it will all be added
	 */
	public boolean addAll(Object[] o) {
		for (int i = 0; i < o.length; i++) { // new array is created with
												// objects and adds them to the
												// top
			push(o[i]);
		}
		return true;
	}

	/**
	 * check if the object that will be passed in to the test is contained in
	 * the stack
	 * 
	 * @param o
	 *            the object passed in
	 * @return false is empty, true if contains the object, otherwise false
	 */
	public boolean contains(Object o) {
		if (isEmpty()) { // checks if any objects at all in the stack
			return false;
		}

		for (int i = 0; i < counter; i++) {
			if (array[i] == o) { // if the object is in the stack, return true
				return true;
			}
		}
		return false;
	}

	/**
	 * will check if the array of objects passed in is contained in the stack
	 * 
	 * @param o
	 *            the array of objects
	 * @return false if not contained, otherwise true
	 */
	public boolean containsAll(Object[] o) {
		for (int i = 0; i < o.length; i++) {
			if (!contains(o[i])) { // if the object in the array is not
									// contained in the stack, return false
				return false;
			}
		}
		return true;
	}

	/**
	 * the stack itself
	 * 
	 * @return the temp variable which is equal to the array so no one can
	 *         change it
	 */
	public Object[] toArray() {
		Object[] temp = new Object[array.length];
		for (int i = 0; i < counter; i++) { // return the stack itself, as
											// an array
			temp[i] = array[i];
		}
		return temp;

	}
}
