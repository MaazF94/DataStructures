package edu.ben.homework.homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 */

public class Homework2 {

	private static final int NUMBER_OF_EMPLOYEES = 500; // will not change
	private static Employee[] employee = new Employee[NUMBER_OF_EMPLOYEES];
	private static int arrayLocation = 0;

	/**
	 * Imports employee data from a CSV file. This method expects the file to
	 * have a header line
	 * 
	 * @param importData
	 *            file containing data in csv format, including header line
	 * @throws FileNotFoundException
	 *             thrown if the file does not exist
	 */

	public static void importEmployees(File importData)
			throws FileNotFoundException {

		Scanner input = new Scanner(importData);
		input.nextLine();
		employee = new Employee[NUMBER_OF_EMPLOYEES];

		while (input.hasNextLine()) {
			String fileText = input.nextLine();
			String[] values = fileText.split(",");
			String firstName = values[0];
			String lastName = values[1];
			String salaryOfEmployeeFromFile = values[2];
			double salaryOfEmployee = Double
					.parseDouble(salaryOfEmployeeFromFile);
			String startDate = values[3];
			employee[arrayLocation++] = new Employee(firstName, lastName,
					salaryOfEmployee, startDate);
		}
		input.close();
	}

	/**
	 * returns an array of all employee objects
	 * 
	 * @return an array of employee objects
	 */
	public static Employee[] getEmployeeRecords() {
		return employee;

	}

	/**
	 * returns the first employee object that matches the given parameter. This
	 * method is case sensitive.
	 * 
	 * @param firstName
	 *            the matching employee object or null if not found
	 * @return the matching employee object or null if not found
	 */
	public static Employee getEmployeeByFirstName(String firstName) {
		for (int i = 0; i < arrayLocation; i++) {
			if (firstName.equalsIgnoreCase(employee[i].getFirstName())) {
				return employee[i];
			}
		}
		return null;

	}

	/**
	 * returns the first employee object that matches the given parameter. This
	 * method is case sensitive.
	 * 
	 * @param lastName
	 *            the matching employee object or null if not found
	 * @return the matching employee object or null if not found
	 */
	public static Employee getEmployeeByLastName(String lastName) {
		for (int i = 0; i < arrayLocation; i++) {
			if (lastName.equalsIgnoreCase(employee[i].getLastName())) {
				return employee[i];
			}
		}
		return null;
	}

	/**
	 * deletes all current employee data stored in this class
	 */
	public static void deleteAllEmployees() {
		employee = new Employee[NUMBER_OF_EMPLOYEES];
	}

}
