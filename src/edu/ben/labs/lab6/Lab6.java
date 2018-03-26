package edu.ben.labs.lab6;

import java.util.Scanner;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 * @param <E>
 */

public class Lab6<E> {

	/**
	 * class variable
	 */
	private static Phonebook book = new Phonebook();

	/**
	 * displays the main menu
	 */
	public static void mainMenu() {
		System.out
				.println("Please select from the following menu (Enter # only): ");
		System.out.println("1. Display phone book");
		System.out.println("2. Add new record"); // displays menu
		System.out.println("3. Delete record by last name");
		System.out.println("4. Search for record");
		System.out.println("5. Exit");
	}

	/**
	 * call to the prompt for user to see
	 * 
	 * @param args
	 *            parameter
	 * @throws InvalidInputType
	 *             from our class we made
	 */
	public static void main(String[] args) throws InvalidInputType {
		Scanner input = new Scanner(System.in); // call to the prompt
		int menuChoice = 0;

		while (menuChoice != 5) {

			System.out.println("");
			mainMenu();
			menuChoice = input.nextInt();

			switch (menuChoice) {
			case 1:
				book.toString();
				System.out.println(book.toString());
				break;
			case 2:
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your first name: "); // get user info
				String firstName = sc.next();
				System.out.println("Enter your last name: ");
				String lastName = sc.next();
				System.out
						.println("Enter your phone number (Ex: 1234567890): ");
				String phoneNumber = sc.next();

				book.addRecord(new Record(firstName, lastName, phoneNumber));
				break;
			case 3:
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter your first name: ");
				String firstName1 = sc1.next();
				System.out.println("Enter your last name: ");
				String lastName1 = sc1.next();
				System.out
						.println("Enter your phone number (Ex: 1234567890): ");
				String phoneNumber1 = sc1.next();
				book.deleteRecord(new Record(firstName1, lastName1,
						phoneNumber1));
				break;
			case 4:
				subMenu();
				break;
			case 5:
				exit();
				break;
			default:
				exit();
				break;
			}
		}
		input.close();
	}

	/**
	 * displays the menu inside of search
	 */
	public static void menu2() {
		System.out.println("How would you like to search? ");
		System.out.println("1. By LAST name");
		System.out.println("2. By FIRST name"); // search by
		System.out.println("3. By PHONE number");
	}

	/**
	 * displays the menu for search with cases
	 */
	public static void subMenu() {
		Scanner input = new Scanner(System.in);
		int choice = 0;

		while (choice < 4) {

			System.out.println("");
			menu2();
			choice = input.nextInt();

			switch (choice) {

			case 1:
				Scanner input1 = new Scanner(System.in);
				System.out.println("Enter the LAST NAME you want to search: ");
				String lastName = input1.next(); // enter now

				book.searchByLastName(lastName);
				break;

			case 2:
				Scanner input2 = new Scanner(System.in);
				System.out.println("Enter the FIRST NAME you want to search: ");
				String firstName = input2.next();

				book.searchByFirstName(firstName);
				break;

			case 3:
				Scanner input3 = new Scanner(System.in);
				System.out
						.println("Enter the PHONE NUMBER you want to search: ");
				String phoneNumber = input3.next();

				book.searchByFirstName(phoneNumber);
				break;

			default:
				break;
			}
		}
		input.close();
	}

	/**
	 * search for a record, contains the sub-menu
	 */
	public static void searchForRecord() {
		subMenu(); // call to method
	}

	/**
	 * the exit method
	 */
	public static void exit() {
		System.out.println("You have closed the phonebook"); // exit
	}
}
