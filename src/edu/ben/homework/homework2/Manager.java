package edu.ben.homework.homework2;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 */

public class Manager extends Employee {
	/**
	 * class variables
	 */
	@SuppressWarnings("unused")
	private static final int NUMBER_OF_EMPLOYEES = 500; // will not change

	/**
	 * Constructor for manager, due to extends, super makes it a constructor for
	 * employee
	 * 
	 * @param firstName
	 *            parameter for first name
	 * @param lastName
	 *            parameter for last name
	 * @param salary
	 *            parameter for salary
	 * @param startDate
	 *            parameter for start date
	 */
	protected Manager(String firstName, String lastName, double salary,
			String startDate) {
		super(firstName, lastName, salary, startDate);
	}

}
