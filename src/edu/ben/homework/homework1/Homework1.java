package edu.ben.homework.homework1;

/**
 * 
 * @author maazfitter
 * @version eclipse homework 1 redo
 * 
 */

public class Homework1 {

	/**
	 * 
	 * @param values
	 *            is my array that will be tested
	 * @return true if the method/for loop/if check works
	 */

	public static boolean isConsecutiveFour(int[][] values) {
		for (int i = 0; i < values.length; i++) { //iterates through the array
			if (consecutiveFour(values[i])) { //test consecutive four in a row vertical
				return true;
			}
		}
		for (int j = 0; j < values[0].length; j++) {
			int[] column = new int[values.length];
			for (int i = 0; i < values.length; i++) {
				column[i] = values[i][j];
			}
			if (consecutiveFour(column)) { //test four in a row horizontal
				return true;
			}
		}
		for (int i = 0; i < values.length - 3; i++) {
			int diagonalNumbers = Math.min(values.length - i, values[0].length);
			int[] diagonal = new int[diagonalNumbers];
			for (int k = 0; k < diagonalNumbers; k++) {
				diagonal[k] = values[(k + i)][k];
			}
			if (consecutiveFour(diagonal)) { //test four in a row diagonally to the right
				return true;
			}
		}
		for (int j = 1; j < values[0].length - 3; j++) {
			int diagonalNumbers = Math.min(values[0].length - j, values.length);
			int[] diagonal = new int[diagonalNumbers];
			for (int k = 0; k < diagonalNumbers; k++) {
				diagonal[k] = values[k][(k + j)];
			}
			if (consecutiveFour(diagonal)) { //test four in a row diagonally to the left
				return true;
			}
		}
		for (int j = 3; j < values[0].length; j++) {
			int diagonalNumbers = Math.min(j + 1, values.length);
			int[] diagonal = new int[diagonalNumbers];
			for (int k = 0; k < diagonalNumbers; k++) {
				diagonal[k] = values[k][(j - k)];
			}
			if (consecutiveFour(diagonal)) { //test four in a row diagonally
				return true;
			}
		}
		for (int i = 1; i < values.length - 3; i++) {
			int diagonalNumbers = Math.min(values.length - i, values[0].length);
			int[] diagonal = new int[diagonalNumbers];
			for (int k = 0; k < diagonalNumbers; k++) {
				diagonal[k] = values[(k + i)][(values[0].length - k - 1)];
			}
			if (consecutiveFour(diagonal)) {
				return true;
			}
		}
		return false; //test the four in a row 
	}

	/**
	 * 
	 * @param values
	 * @return if equal to then true, if not then false
	 */
	public static boolean consecutiveFour(int[] values) { //allows the other method to call consecutiveFour to find if
		for (int i = 0; i < values.length - 3; i++) { //there are four in a row
			boolean equalTo = true;
			for (int j = i; j < i + 3; j++) {
				if (values[j] != values[(j + 1)]) {
					equalTo = false;
					break;
				}
			}
			if (equalTo)
				return true;
		}
		return false;
	}

}