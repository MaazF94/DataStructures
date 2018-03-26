package edu.ben.labs.lab5;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 */

public class Cargo {

	/**
	 * the class variables which are private
	 */

	// Declare class variables
	private int trackingNumber = 0; // in file
	private int cubicFeet = 0; // in file
	private int value = 0; // in file
	private int weight = 0; // in file

	/**
	 * TAKES IN PARAMATERS AND ASSIGNS TO VARIABLES
	 * 
	 * @param trackingNumber
	 *            which is for the cargo
	 * @param cubicFeet
	 *            of the cargo
	 * @param value
	 *            the amount it's worth in $
	 * @param weight
	 *            the weight in lbs
	 */
	public Cargo(int trackingNumber, int cubicFeet, int value, int weight) {
		this.trackingNumber = trackingNumber; // of cargo
		this.cubicFeet = cubicFeet; // of cargo
		this.value = value; // of cargo
		this.weight = weight; // of cargo
	}

	/**
	 * get the tracking number
	 * 
	 * @return the tracking number
	 */
	public int getTrackingNumber() {
		return trackingNumber; // return tracking number
	}

	/**
	 * set the tracking number
	 * 
	 * @param trackingNumber
	 *            for the cargo
	 */
	public void setTrackingNumber(int trackingNumber) {
		this.trackingNumber = trackingNumber; // set tracking number
	}

	/**
	 * get the cubic feet
	 * 
	 * @return cubic feet
	 */
	public int getCubicFeet() {
		return cubicFeet; // return cubic feet of cargo
	}

	/**
	 * set the cubic feet
	 * 
	 * @param cubicFeet
	 *            for the cargo
	 */
	public void setCubicFeet(int cubicFeet) {
		this.cubicFeet = cubicFeet; // get cubic feet of cargo
	}

	/**
	 * get the value of the cargo
	 * 
	 * @return value in $ for the cargo
	 */
	public int getValue() {
		return value; // return value in $
	}

	/**
	 * set the value of the cargo
	 * 
	 * @param value
	 *            in $
	 */
	public void setValue(int value) {
		this.value = value; // set value in $
	}

	/**
	 * get the weight of the cargo
	 * 
	 * @return the weight
	 */
	public int getWeight() {
		return weight; // get weight of cargo
	}

	/**
	 * set the weight of the cargo
	 * 
	 * @param weight
	 *            of the cargo
	 */
	public void setWeight(int weight) {
		this.weight = weight; // set weight of cargo
	}

	/**
	 * override the toString method
	 * 
	 * @return manifest the string
	 */
	@Override
	public String toString() {
		String manifest = "#" + getTrackingNumber() + ", " + getCubicFeet()
				+ " cu/ft., " + getWeight() + " lbs. $" + getValue();
		return manifest; // return manifest

	}
}
