package edu.ben.labs.lab3;

/**
 * 
 * @author maaz fitter
 * @version 1
 * 
 */

public class Coffee {

	/**
	 * class variables, constant variables are public variables that will be
	 * used in the other classes are private
	 */

	public static final int TALL = 1; // these will be used with size
	public static final int GRANDE = 2;
	public static final int VENTI = 3;

	private String name;
	private int size;
	private double cost;
	private int timeToMake; // in seconds

	/**
	 * constructor for Coffee object
	 * 
	 * @param name
	 *            is the name of the coffee item
	 * @param cost
	 *            is the cost of each coffee item
	 * @param size
	 *            is the size of each coffee item
	 * @param timeToMake
	 *            is the time each coffee item takes to make in seconds
	 */

	public Coffee(String name, int size, double cost, int timeToMake) {
		this.name = name;
		this.size = size;
		this.cost = cost;
		this.timeToMake = timeToMake; // in seconds
	}

	/**
	 * gets the name of the item
	 * 
	 * @return name of coffee item
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the name
	 * 
	 * @param name
	 *            equal to the text that was entered aka the item
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets the cost of the item
	 * 
	 * @return the cost of the item
	 */

	public double getCost() {
		return cost;
	}

	/**
	 * sets the cost of the item
	 * 
	 * @param cost
	 *            is now set to the cost that of each item
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * gets the size of the item
	 * 
	 * @return the size of the item
	 */
	public int getSize() {
		return size;
	}

	/**
	 * sets the size of the item
	 * 
	 * @param size
	 *            of the item
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * gets the time to make each item
	 * 
	 * @return the time to make each item
	 */
	public int getTimeToMake() { // in seconds
		return timeToMake;
	}

	/**
	 * sets the time to make each item
	 * 
	 * @param timeToMake
	 *            is now set to the time for each item
	 */
	public void setTimeToMake(int timeToMake) { // in seconds
		this.timeToMake = timeToMake;
	}

	/**
	 * This will display the queue
	 */
	@Override
	public String toString() {

		return "Name: \'" + this.name + "\', Size: \'" + this.size
				+ "\', Cost: \'" + this.cost + "\', Time to Make: \'"
				+ this.timeToMake + "\'";
	}

	/**
	 * This makes sure that the Coffee object is equal to the Coffee c object
	 * that we created in test cases
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Coffee) {
			Coffee c = (Coffee) obj;
			return name.equals(c.name) && size == (c.size)
					&& timeToMake == c.timeToMake && cost == c.cost;
		}
		return false;
	}
}
