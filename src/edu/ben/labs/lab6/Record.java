package edu.ben.labs.lab6;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 */
public class Record {

	/**
	 * class variables
	 */
	public String firstName;
	public String lastName;
	public String phoneNumber;

	/**
	 * constructor for Record
	 * 
	 * @param firstName
	 *            that is passed in
	 * @param lastName
	 *            passed in
	 * @param phoneNumber
	 *            passed in
	 */
	public Record(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * get the first name
	 * 
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * set the first name
	 * 
	 * @param firstName
	 *            that's passed in
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * get last name
	 * 
	 * @return last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * set last name
	 * 
	 * @param lastName
	 *            that was passed in
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * get phone number
	 * 
	 * @return phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * set phone number
	 * 
	 * @param phoneNumber
	 *            passed in
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
