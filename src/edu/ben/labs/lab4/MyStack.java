package edu.ben.labs.lab4;

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
	private String[] stack; // treat this as stack
	private int counter = 0; // when objects are added or removed, keep count

	/**
	 * constructor for the stack
	 * 
	 * @param size
	 *            user inputs how big it is
	 */
	public MyStack(int size) {
		stack = new String[size]; // set the stack equal to default size
	}

	/**
	 * peek will look at the top of the stack without removing it
	 * 
	 * @return the top of the stack, null if it's empty
	 */
	public String peek() {
		if (stack != null) {
			return stack[counter - 1]; // the top of the stack
		} else {
			return null;
		}

	}

	/**
	 * push will pass in a string and 'push' it to the bottom of the stack
	 * expand the array if not enough room
	 * 
	 * @param value
	 *            which is an object that will be passed in
	 * @return true if either space or expand is needed
	 */
	public boolean push(String value) {

		if (counter < stack.length) { // there is room in the stack, add
			stack[counter++] = value;
			return true;
		} else {

			String[] newArray = new String[stack.length + 1]; // expand the
																// array
			for (int i = 0; i < stack.length; i++) {
				newArray[i] = stack[i];
			}
			stack = newArray; // set old stack = to new stack and then add in
								// the objects
			stack[counter++] = value;
			return true;
		}
	}

	/**
	 * pop will remove an object from the top of the stack
	 * 
	 * @return null if empty or the object at the top of the stack
	 */
	public String pop() {
		String temp = null; // the top of the stack is the temp, remove

		if (getSize() > 0) {
			temp = stack[counter - 1]; // the top
			stack[counter - 1] = null;
			counter--;
		}
		return temp;
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

		return stack.length; // the size of the stack
	}

	/**
	 * should be the remainder of the size of the stack - the objects in the
	 * stack
	 * 
	 * @return the remaining capacity
	 */
	public int getRemainingCapacity() {

		return stack.length - counter; // difference between size and objects
	}

	/**
	 * the stack is full
	 * 
	 * @return the objects are = to the size of the stack
	 */
	public boolean isFull() {

		return counter == stack.length; // the entire array size is equal to the
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

			s = s + stack[i];
		}
		return s;
	}
}
