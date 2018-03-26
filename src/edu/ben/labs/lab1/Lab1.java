package edu.ben.labs.lab1;

/**
 * 
 * @author maazfitter
 * @version 2 Lab 1 redo
 */

public class Lab1 {

	/**
	 * Setting the class variable for the method getTotalComputations, will be
	 * used in all add/divide methods
	 */
	static int COUNT_OF_METHODS; // Set the class variable to be used by
									// multiple methods

	/**
	 * 
	 * @param a
	 *            number to add
	 * @param b
	 *            number to add
	 * @return sum of both numbers a and b
	 * @throws Exception
	 */
	public static double add(double a, double b) throws Exception {
		COUNT_OF_METHODS++;
		return a + b; // returns the sum of a and b as a double
	}

	/**
	 * 
	 * @param c
	 *            is the character, number, special, or alphabet, that's in the
	 *            string
	 * @param text
	 *            - the string that will be given
	 * @return how many characters in the string
	 */
	public static int characterCount(char c, String text) {

		return c; // return the total number of characters in the string
	}

	/**
	 * 
	 * @param text
	 *            the string that will be given
	 * @param formatType
	 *            shows what type of format it will be in according to
	 *            FormatType class
	 * @return the text according to the FormatType
	 */
	public static String formatText(String text, int formatType) {
		return text; // return the string
	}

	/**
	 * 
	 * @param a
	 *            number to add
	 * @param b
	 *            number to add
	 * @return sum of both numbers a and b
	 */
	public static int add(int a, int b) throws Exception {
		COUNT_OF_METHODS++;
		return a + b; // returns the sum of a and b as an integer
	}

	/**
	 * 
	 * @param a
	 *            number to add
	 * @param b
	 *            number to add
	 * @return sum between the numbers a and b
	 * @throws Exception
	 */
	public static float add(float a, float b) throws Exception {
		COUNT_OF_METHODS++;
		return a + b; // returns the sum of a and b as a float
	}

	/**
	 * 
	 * @param a
	 *            number to divide
	 * @param b
	 *            number to divide
	 * @return the division of a divided by b
	 * @throws Exception
	 */
	public static double divide(double a, double b) throws Exception {
		COUNT_OF_METHODS++;
		return a / b; // returns the quotient of a and b as a double
	}

	/**
	 * 
	 * @param a
	 *            number to divide
	 * @param b
	 *            number to divide
	 * @return the division of numbers a and b
	 * @throws Exception
	 */
	public static int divide(int a, int b) throws Exception {
		COUNT_OF_METHODS++;
		return a / b; // returns the quotient of a and b as an integer
	}

	/**
	 * 
	 * @param a
	 *            number to divide
	 * @param b
	 *            number to divide
	 * @return the division of number a and b
	 * @throws Exception
	 */

	public static float divide(float a, float b) throws Exception {
		COUNT_OF_METHODS++;
		return a / b; // returns the quotient of a and b as a float
	}

	/**
	 * 
	 * @return the number of times the add/divide methods were executed
	 * @throws Exception
	 */
	public static int getTotalComputations() throws Exception {
		return COUNT_OF_METHODS; // we will discuss this further on how to test
									// this

	}

}
