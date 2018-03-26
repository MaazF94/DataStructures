package edu.ben.homework.homework3;

/**
 * 
 * @author maazfitter
 * @version 1
 * 
 */

public class MyQueue {

	/**
	 * class variables
	 */
	private int[] array;
	private int counter = 0; // to help us count the spots left in the queue, in

	// case out of bounds

	/**
	 * this queue will be as big as the user wants
	 * 
	 * @param num
	 *            allows the user to enter how big the queue will be
	 */
	public MyQueue(int num) { // The queue will be as big as the user wants it
								// to be

		array = new int[num]; // constructor for our queue
	}

	/**
	 * Returns the next value in the queue without removing it or null if
	 * nothing in queue
	 * 
	 * @return null if nothing in queue otherwise return first element in the
	 *         queue
	 */
	public Integer peek() {

		if (isEmpty()) { // if the array is empty, you can't dequeue
			return null;
		}

		return array[0]; // will look at the first value in the queue

	}

	/**
	 * Takes an integer value and inserts it at the end of this queue returns
	 * true/false
	 * 
	 * @param num
	 *            which is the number that the user enters to put in the queue
	 * @return true if enqueue and false if not able to enqueue
	 */

	public boolean enqueue(int num) {

		if (counter < array.length) { // check if there is space in the queue

			array[counter] = num;
			counter++;
			return true;

		}

		return false;

	}

	/**
	 * returns size of array
	 * 
	 * @return length of however many spots taken in array, doesn't include
	 *         empty spaces
	 */
	public int getSize() {

		return counter; // size of however many elements are in the queue

	}

	/**
	 * Checks to see if the array is full, returns true if it is
	 * 
	 * @return true if array is full, otherwise, false
	 */
	public boolean isFull() {

		return counter == array.length; // the entire array equal to the
										// elements in the queue
	}

	/**
	 * if array is empty the return value will say "Empty"
	 * 
	 * @return true is queue is empty, false otherwise
	 */
	public boolean isEmpty() {

		return counter == 0; // the counter is 0 which means there are no
								// elements in the queue
	}

	/**
	 * removes the first integer from the queue and returns it.
	 * 
	 * @return temp
	 * @throws Exception
	 *             if there is nothing to dequeue
	 */
	public Integer dequeue() throws Exception {
		if (isEmpty()) { // if the array is empty, you can't dequeue
			return null;
		}
		if (array.length == 1) {
			counter--;
			return array[0];
		}
		int temp = array[0];

		counter--;

		for (int i = 0; i < counter; i++) {
			array[i] = array[i + 1]; // if the queue is not empty, move
										// everything over one spot
		}

		return temp;
	}

	/**
	 * Returns the capacity of the queue
	 * 
	 * @return array.length
	 */
	public int getCapacity() {

		return array.length; // the capacity of the queue is how many spots the
								// queue has

	}

	/**
	 * Returns the number of additional numbers this queue can accept
	 * 
	 * @return array.length - counter
	 */
	public int getRemainingCapacity() {

		return array.length - counter; // shows the entire queue size - the
										// elements in the queue

	}

	/**
	 * Returns largest number in queue
	 * 
	 * @return largest
	 */
	public Integer getLargest() {

		if (isEmpty()) { // if the array is empty, you can't dequeue
			return null;
		}

		int largest = array[0];

		for (int i = 0; i < counter; i++) {
			largest = Math.max(largest, array[i]); // largest number in the
													// queue
		}

		return largest;

	}

	/**
	 * Returns smallest value in array
	 * 
	 * @return smallest
	 */
	public Integer getSmallest() {

		if (isEmpty()) { // if the array is empty, you can't dequeue
			return null;
		}

		int smallest = array[0];

		for (int i = 0; i < counter; i++) {
			smallest = Math.min(smallest, array[i]); // smallest number in queue
		}

		return smallest;

	}

	@Override
	public String toString() {
		String s = "My Queue [array = "; // will display our queue
		for (int i = 0; i < counter; i++) {
			if (i > 0) {
				s += ", ";
			}

			s = s + array[i];
		}
		return s + "]";
	}

}
