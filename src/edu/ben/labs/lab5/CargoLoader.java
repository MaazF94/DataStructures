package edu.ben.labs.lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 */

public class CargoLoader {

	/**
	 * load the cargo
	 * 
	 * @param aircraftLog
	 *            the aircraft log
	 * @param cargoLog
	 *            the cargo log
	 */
	public static void loadCargo(File aircraftLog, File cargoLog) { // load the
																	// files
		System.out.println("\n" + "******* CARGO MANIFEST *******");
		MyStack airplanes = new MyStack(100);
		Scanner input1;
		try { // load the file
			input1 = new Scanner(aircraftLog);
			input1.nextLine();
			while (input1.hasNextLine()) {
				String fileText = input1.nextLine();
				String[] values = fileText.split(","); // delete commas and add
														// to array
				try {
				Airplane aircraft = new Airplane(nonNumeric(values[0]),
						nonNumeric(values[1]), nonNumeric(values[2]),
						nonNumeric(values[3]));
				airplanes.push(aircraft); // add all the values into the
											// aircraft
			} catch (NumberFormatException e) {
				
			}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // if file not found
		}

		Scanner input2;
		MyStack notLoaded = new MyStack(100);
		try { // load file
			input2 = new Scanner(cargoLog);
			input2.nextLine();
			while (input2.hasNextLine()) {
				String fileText = input2.nextLine();
				String[] values = fileText.split(","); // take out commas
				try {
					Cargo cargos = new Cargo(nonNumeric(values[0]),
							nonNumeric(values[1]), nonNumeric(values[2]),
							nonNumeric(values[3]));
					boolean loaded = false; // default, making sure it was
											// loaded
					for (int i = 0; i < airplanes.getSize(); i++) {
						Airplane a = (Airplane) airplanes.get(i);
						if (a.getRemainingCapacity() > cargos.getCubicFeet() // checking
																				// for
																				// room
								&& a.getRemainingWeight() > cargos.getWeight()) {
							a.putCargo(cargos);
							loaded = true;
							break;
						}
					}

					if (!loaded) {
						notLoaded.push(cargos);
					}
				} catch (NumberFormatException e) {
					
				}

			}
			System.out
					.println(airplanes
							+ "\n\n"
							+ "Unable to load the following cargo on any available aircraft:");
			for (int i = 0; i < notLoaded.getSize(); i++) {
				System.out.println("\t" + notLoaded.get(i));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace(); // if file isn't loaded correctly
		}
	}

	/**
	 * this will output the manifest and the data from our files
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) { // main screen
		loadCargo(new File("aircraftLog.txt"), new File("cargoLog.txt"));
	}

	/**
	 * accounts for any non numeric numbers and drops them, keeps the digits
	 * only
	 * 
	 * @param s
	 *            the string being passed in
	 * @return Integer.parseInt(newText) the integers inside of the string only
	 */
	public static int nonNumeric(String s) {
		String newText = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) { // checks for digits only,
													// makes sure nothing else
													// is included
				newText += s.charAt(i);
			}
		}
		return Integer.parseInt(newText);
	}
}
