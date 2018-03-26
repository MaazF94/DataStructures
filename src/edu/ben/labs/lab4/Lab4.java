package edu.ben.labs.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author maazfitter
 * @version 1.0
 */

public class Lab4 {

	/**
	 * this is the main method where the user will be prompted
	 * 
	 * @param args
	 *            for the main method
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) { // continue to prompt the user until QUIT
			System.out
					.println("Enter S for string, F for file, or type QUIT: ");
			String text = input.nextLine();

			if (text.equalsIgnoreCase("QUIT")) { // if the user quits then end
													// the program
				System.out.println("You have quit the program!");
				System.exit(0);
			}
			if (text.equalsIgnoreCase("s")) {
				System.out.println("Enter a string: ");
				String testString = input.nextLine();
				if (testPalindrome(testString)) {
					System.out.println("This IS a palindrome!");
				} else {
					System.out.println("This is NOT a palindrome!");
				}
			}
			if (text.equalsIgnoreCase("f")) {
				System.out.println("Enter a file name: ");
				String testFileName = input.nextLine();
				testFile(testFileName);
			}
		}
	}

	/**
	 * in this method, the palindrome will be tested based off a string from
	 * user input
	 * 
	 * @param text
	 *            that the user will input
	 * @return true if palindrome, false if not
	 */
	public static boolean testPalindrome(String text) {
		text = text.toLowerCase().replaceAll(" ", "")
				.replaceAll("[^\\p{Alpha}]+", "");
		MyStack stack = new MyStack(1);
		Integer length = text.length();
		MyQueue queue = new MyQueue(1);
		for (int i = 0; i < length; i++) {
			String character = text.substring(i, i + 1);
			queue.enqueue(character);
			stack.push(character);
		}
		// compare both stack & queue to see if same characters
		while (!queue.isEmpty()) {
			// remove character from queue
			String queueFront = null;
			try {
				queueFront = queue.dequeue();
			} catch (Exception e) {
				e.printStackTrace();
			}
			// remove character from stack
			String stackTop = stack.pop();
			// if not equal, return NOT a palindrome
			if (!queueFront.equalsIgnoreCase(stackTop)) {
				return false;
			}
		}
		// should be a palindrome at this point
		return true;
	}

	/**
	 * this will load a file and check to see if the lines have palindromes by
	 * returning an array of which lines do
	 * 
	 * @param fileName
	 *            the file that will be loaded
	 * @return the array of which lines have palindromes
	 */
	public static int[] testFile(String fileName) {
		Scanner input = null;
		int palindromeLines = 0; // which lines have palindromes
		int numberOfLines = 0; // number of lines in the text file
		int[] lineCount = new int[numberOfLines]; // array of which lines have
													// palindromes
		try {
			input = new Scanner(new File(fileName));
			while (input.hasNextLine()) {
				String fileText = input.nextLine(); // load the file and convert
				numberOfLines++;
				lineCount = new int[numberOfLines];
				if (testPalindrome(fileText)) { // call the testPalindrome
												// method and use it
					lineCount[palindromeLines] = numberOfLines;
					palindromeLines++;
					System.out
							.println("Palindrome in line: " + palindromeLines);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			lineCount = null;

		} finally {
			try {
				input.close(); // close input
			} catch (NullPointerException e) {
				/* nothing to do but, pray */
			}
		}
		return lineCount; // return array
	}
}
