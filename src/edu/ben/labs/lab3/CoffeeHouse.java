package edu.ben.labs.lab3;

/**
 * 
 * @author maazfitter
 * @version lab 3 CoffeeHouse
 * 
 */

public class CoffeeHouse {

	/**
	 * class variables these are all private variables because they are not
	 * constants the variables below the queue will act as the front and back of
	 * the queue, the size, and the total profit
	 */
	/* Using array to act like a queue */
	private Coffee[] array;
	private int size = 0;
	private double totalProfit = 0;

	// constructor
	public CoffeeHouse() {
		array = new Coffee[100];
	}

	/**
	 * Takes a coffee object and adds it to the next location in the "queue"
	 * 
	 * @param c
	 *            not null coffee object
	 * @return true if coffee was added to queue, false if param c is null
	 */
	public boolean takeOrder(Coffee c) {

		if (c == null) {
			return false;
		} else {

			if (size < array.length) { // check if there is space in the queue

				array[size++] = c;

			} else {

				// create a new array by expanding and add objects to it
				Coffee[] newArray = new Coffee[array.length + 1];

				for (int i = 0; i < array.length; i++) {
					newArray[i] = array[i];
				}

				// point old array to new array
				array = newArray;
				array[size++] = c;
			}

			return true;
		}
	}

	/**
	 * "serves" the order to the customer. This call will process the next
	 * order. in the queue, track any necessary metrics, and return the coffee
	 * order
	 * 
	 * @return the next coffee order in the queue
	 */
	public Coffee serveOrder() {
		if (size == 0) { // if the array is empty, you can't dequeue
			return null;
		}
		if (array.length == 1) {
			size--;
			return array[0];
		}
		Coffee temp = array[0];

		size--;

		for (int i = 0; i < size; i++) {
			array[i] = array[i + 1]; // if the queue is not empty, move
										// everything over one spot
		}
		totalProfit += temp.getCost(); // add to the total profit for the last
		// method totalProfit
		return temp;
	}

	/**
	 * determines the potential profit based on the value of each coffee order
	 * in the queue
	 * 
	 * @return profit of all coffee orders currently in the queue
	 */
	public double getPotentialProfit() { // treat this as revenue not as profit

		double potentialProfit = 0.0;

		for (int i = 0; i < size; i++) {
			potentialProfit += array[i].getCost();
		}
		return potentialProfit;

	}

	/**
	 * Determines, at any given time, how long it will take to make all the
	 * coffee orders currently in the queue
	 * 
	 * @return time to make all coffee orders, 0 if none in queue
	 */
	public int timeToMakeCoffeeOrders() {
		int timeToMake = 0; // this is in seconds
		for (int i = 0; i < size; i++) {
			timeToMake += array[i].getTimeToMake();
			if (array.length == 0) { // if nothing in queue, return 0
				return 0;
			}
		}

		return timeToMake;
	}

	/**
	 * gets the number of orders in the queue
	 * 
	 * @return the number of orders in the queue
	 */

	public int numOfOrders() {

		int numberOfOrders = size; // shows the num of orders in
									// the queue

		return numberOfOrders;

	}

	/**
	 * returns an array containing the size counts of the coffee orders.
	 * Location 0 is the count of the smallest size, location 1 is the size of
	 * the medium size, and location 2 is the count of the largest size
	 * 
	 * @return array containing the number of coffee orders by size
	 */

	public int[] getSizeCount() {

		int[] getSizeCount = { 0, 0, 0 };
		for (int i = 0; i < size; i++) {
			if (array[i].getSize() == Coffee.TALL) {
				getSizeCount[0]++;
			}
			if (array[i].getSize() == Coffee.GRANDE) {
				getSizeCount[1]++;
			}
			if (array[i].getSize() == Coffee.VENTI) {
				getSizeCount[2]++;
			}
		}
		return getSizeCount;
	}

	/**
	 * returns the next pending coffee order to be made without removing it from
	 * the queue. A way to check what is coming without actually processing it.
	 * 
	 * @return a copy of the next coffee order subject
	 */

	public Coffee viewNextOrder() {
		if (size == 0) { // is empty
			return null;
		}
		return array[0]; // peek into first spot of queue

	}

	/**
	 * returns the number of orders in the queue.
	 * 
	 * @return number of orders in queue
	 */
	public int getNumOrders() {

		int numberOfOrders = size;

		return numberOfOrders;

	}

	/**
	 * returns the total profit processed to date. This does not include any
	 * pending orders not yet served sitting in the queue.
	 * 
	 * @return total profit to this point
	 */

	public double getProfit() { // treat this as revenue not as profit

		return totalProfit; // did this in serveOrder method

	}
}
