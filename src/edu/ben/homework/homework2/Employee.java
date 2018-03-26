package edu.ben.homework.homework2;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 */

public class Employee {

	/**
	 * class variables
	 */

	private String firstName; // set the static class variables
	private String lastName;
	private double salary;
	private String startDate;

	/**
	 * Constructor for Employee
	 * 
	 * @param firstName
	 *            which is for the first name for the employee
	 * @param lastName
	 *            which is for the last name for the employee
	 * @param salary
	 *            which is for the salary for the employee
	 * @param startDate
	 *            which is for the start date for the employee
	 */
	protected Employee(String firstName, String lastName, double salary,
			String startDate) {
		this.firstName = firstName; // retrieve the specific information
		this.lastName = lastName;
		this.salary = salary;
		this.startDate = startDate;
	}

	/**
	 * Get the first name
	 * 
	 * @return firstName from what it was set as
	 */
	public String getFirstName() { // get the first name
		return firstName;
	}

	/**
	 * 
	 * @param theFirstName
	 *            this variable will be set to the first name of the getter
	 */
	public void setFirstName(String theFirstName) {
		this.firstName = theFirstName;
	}

	/**
	 * Get the last name
	 * 
	 * @return lastName from what it was set as
	 */
	public String getLastName() { // get the last name
		return lastName;
	}

	/**
	 * 
	 * @param theLastName
	 *            this variable will be set to the last name getter
	 */
	public void setLastName(String theLastName) {
		this.lastName = theLastName; // set the first and last names
	}

	/**
	 * Get the salary
	 * 
	 * @return salary from the set method
	 */
	public double getSalary() {
		return salary; // get the salary
	}

	/**
	 * 
	 * @param theSalary
	 *            this variable will be set to the salary getter
	 */
	public void setSalary(double theSalary) {
		this.salary = theSalary; // set the specific salary
	}

	/**
	 * Get the start date
	 * 
	 * @return startDate as set in the setter
	 */
	public String getStartDate() {
		return startDate; // get the start date
	}

	/**
	 * 
	 * @param theStartDate
	 *            this variable will be set to the start date getter
	 */
	public void setStartDate(String theStartDate) {
		this.startDate = theStartDate; // set the start date
	}
}
