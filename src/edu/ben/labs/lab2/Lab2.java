package edu.ben.labs.lab2;

/**
 * 
 * @author maazfitter
 * @version eclipse Lab 2
 */

public class Lab2 {
	private int[][] array; /* Class Variables */// The array cannot be changed

	/**
	 * Accepts a two dimensional array upon construction to allow for operations
	 * to be run against it (Methods contained in class).
	 * 
	 * @param array
	 *            Array to use for any future calculations (methods in class).
	 */
	public Lab2(int[][] array) {
		this.array = array; // Use the array that is constructed (in Test)
	}

	/**
	 * The purpose of this method is to get a null array.
	 * 
	 * @return false if array
	 */
	public boolean getArray() {
		if (array == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Returns the total of all values in the array.
	 * 
	 * @return total of all values in array throws an exception if the value is
	 *         out of bounds of the array
	 */
	public double getTotal() throws Exception {
		double sum = 0.0;

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				sum += array[row][col]; // Add the total of the values together
										// in the array
			}
		}

		return sum;
	}

	/**
	 * Returns the average of all values in the array as an INTEGER due to
	 * method return type, no decimals. throws an exception if the value is out
	 * of bounds of the array
	 * 
	 * @return the average of the elements in the array
	 */
	public int getAverage() throws Exception {
		int sum = 0;
		int count = 0;
		for (int row = 0; row < array.length; row++) { // iterate through the
														// row
			for (int col = 0; col < array[row].length; col++) { // iterate
																// through the
																// column
				count++;
				sum += array[row][col];
			}
		}
		return sum / count; // the sum divided by how many elements there are in
							// the array

	}

	/**
	 * Accepts integer value representing the row.
	 * 
	 * @param row
	 *            Row number to total (0...i-1) throws an exception if the value
	 *            is out of bounds of the array
	 * @return Returns the sum of the values in the specified row.
	 */
	public int getRowTotal(int row) throws Exception {
		int total = 0;

		for (int col = 0; col < array[row].length; col++) {
			total += array[row][col]; // the sum of the numbers that are in the
										// specified array row
		}
		return total;
	}

	/**
	 * Accepts integer value representing the column. throws an exception if the
	 * value is out of bounds of the array
	 * 
	 * @param col
	 *            Column number to total (0...j-1)
	 * @return Returns the sum of the values in the specified column.
	 */
	public int getColumnTotal(int col) throws Exception {
		int total = 0;

		for (int row = 0; row < array.length; row++) {
			total += array[row][col]; // the sum of the numbers that are in the
										// specified array column
		}
		return total;
	}

	/**
	 * Accepts integer value representing the row. throws an exception if the
	 * value is out of bounds of the array
	 * 
	 * @param row
	 *            Row number to use for determining highest value (0...i-1)
	 * @return Returns the highest integer value in the row.
	 */
	public int getHighestInRow(int row) throws Exception {
		int highest = Integer.MIN_VALUE;

		for (int col = 0; col < array[row].length; col++) {
			if (array[row][col] > highest) {
				highest = array[row][col]; // The highest number in the row
			}
		}
		return highest;
	}

	/**
	 * Accepts integer value representing the column. throws an exception if the
	 * value is out of bounds of the array
	 * 
	 * @param col
	 *            Column number to use for determining highest value (0...j-1)
	 * @return Returns the highest integer value in the column.
	 */
	public int getHighestInColumn(int col) throws Exception {
		int highest = Integer.MIN_VALUE;

		for (int row = 0; row < array.length; row++) {
			if (array[row][col] > highest) {
				highest = array[row][col]; // the highest number in the column
			}
		}
		return highest;
	}

}
