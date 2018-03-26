package edu.ben.labs.lab5;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 */

public class Airplane {

	/**
	 * Class variables, private
	 */

	private int aircraftType = 0; // in file
	private int flightNumber = 0; // in file
	private int cargoCapacity = 0; // in cubic feet
	private int maximumCapacity = 0; // in file
	private int cargoWeight = 0; // in lbs
	private int maximumWeight = 0; // in file

	/**
	 * constructor for cargo that goes into plane
	 */
	protected MyStack cargoInPlane = new MyStack(100); // constructor

	/**
	 * constructor for airplane information
	 * 
	 * @param aircraftType
	 *            the number from the file
	 * @param flightNumber
	 *            the flight number
	 * @param maximumCapacity
	 *            how much cargo the plane can hold in cubic feet
	 * @param maximumWeight
	 *            the weight of the cargo in lbs
	 */
	public Airplane(int aircraftType, int flightNumber, int maximumCapacity,
			int maximumWeight) {
		this.aircraftType = aircraftType; // all of these are of the airplane
		this.flightNumber = flightNumber;
		this.maximumCapacity = maximumCapacity;
		this.maximumWeight = maximumWeight;
	}

	/**
	 * get the type of aircraft
	 * 
	 * @return aircraft type
	 */
	public int getAircraftType() { // get the aircraft type
		return aircraftType;
	}

	/**
	 * gets the remaining capacity
	 * 
	 * @return maximumCapacity - cargoCapacity which is the remaining capacity
	 */
	public int getRemainingCapacity() { // get the remaining capacity
		return maximumCapacity - cargoCapacity;
	}

	/**
	 * get the remaining weight
	 * 
	 * @return maximumWeight - cargoWeight which is the remaining weight
	 */
	public int getRemainingWeight() { // get the remaining weight
		return maximumWeight - cargoWeight;
	}

	/**
	 * get the maximum capacity
	 * 
	 * @return maximumCapacity which is the capacity of the plane
	 */
	public int getMaximumCapacity() { // get the max capacity
		return maximumCapacity;
	}

	/**
	 * set the maximum capacity
	 * 
	 * @param maximumCapacity
	 *            which is from the airplane
	 */
	public void setMaximumCapacity(int maximumCapacity) { // set the max
															// capacity
		this.maximumCapacity = maximumCapacity;
	}

	/**
	 * get the max weight
	 * 
	 * @return maximumWeight which is from the plane
	 */
	public int getMaximumWeight() { // get the max weight
		return maximumWeight;
	}

	/**
	 * set the maximum weight
	 * 
	 * @param maximumWeight
	 *            which is the max weight of the plane that it can hold
	 */
	public void setMaximumWeight(int maximumWeight) { // set the max weight
		this.maximumWeight = maximumWeight;
	}

	/**
	 * set the aircraft type
	 * 
	 * @param aircraftType
	 *            which is a number
	 */
	public void setAircraftType(int aircraftType) { // set the aircraft type
		this.aircraftType = aircraftType;
	}

	/**
	 * get the flight number
	 * 
	 * @return the flight number
	 */
	public int getFlightNumber() { // get the flight number
		return flightNumber;
	}

	/**
	 * set the flight number
	 * 
	 * @param flightNumber
	 *            which will be set
	 */
	public void setFlightNumber(int flightNumber) { // set the flight number
		this.flightNumber = flightNumber;
	}

	/**
	 * get the capacity of the cargo on the plane
	 * 
	 * @return the cargo capacity
	 */
	public int getCargoCapacity() { // get the cargo capacity
		return cargoCapacity;
	}

	/**
	 * set the capacity of the cargo
	 * 
	 * @param cargoCapacity
	 *            in cubic feet
	 */
	public void setCargoCapacity(int cargoCapacity) { // set the cargo capacity
		this.cargoCapacity = cargoCapacity;
	}

	/**
	 * get the weight of the cargo that the plane can hold
	 * 
	 * @return the weight of the cargo
	 */
	public int getCargoWeight() { // get the cargo weight
		return cargoWeight;
	}

	/**
	 * set the weight of the cargo that the plane can hold
	 * 
	 * @param cargoWeight
	 *            the weight of the cargo
	 */
	public void setCargoWeight(int cargoWeight) { // set the cargo weight
		this.cargoWeight = cargoWeight;
	}

	/**
	 * @return the cargoInPlane
	 */
	public MyStack getCargoInPlane() {
		return cargoInPlane;
	}

	/**
	 * @param cargoInPlane
	 *            the cargoInPlane to set
	 */
	public void setCargoInPlane(MyStack cargoInPlane) {
		this.cargoInPlane = cargoInPlane;
	}

	/**
	 * adds cargo into the plane
	 * 
	 * @param c
	 *            the cargo that will be added in
	 */
	public void putCargo(Cargo c) { // put cargo in
		MyStack temp = new MyStack(100);
		if (!getCargoInPlane().isEmpty()) { // check if there's anything in the
											// plane
			while (!getCargoInPlane().isEmpty() // while plane isn't empty and
												// there
					// is something in the
					// plane, add if the weight pushed
					// is less
					// than what's in the plane
					&& c.getWeight() < ((Cargo) (getCargoInPlane().peek()))
							.getWeight()) {
				temp.push(getCargoInPlane().pop()); // pop and push cargo from
													// plane
				// into temp
			}
			getCargoInPlane().push(c); // push in cargo
			while (!temp.isEmpty()) { // while temp isn't empty
				getCargoInPlane().push(temp.pop()); // push from temp to plane
													// until
				// temp is empty
			}

		} else {
			getCargoInPlane().push(c); // if empty just add cargo
		}
		cargoCapacity += c.getCubicFeet();
		cargoWeight += c.getWeight();
	}

	/**
	 * override the toString method
	 * 
	 * @return s which is the string
	 */
	@Override
	public String toString() { // output
		String s = "Flight #" + getFlightNumber() + " Cargo: " + cargoCapacity
				+ "/" + getMaximumCapacity() + " cu/ft. " + +cargoWeight + "/"
				+ getMaximumWeight() + " lbs.";
		s += " \n CARGO DETAILS: \n";
		for (int i = 0; i < getCargoInPlane().getSize(); i++) {
			s += "\t" + getCargoInPlane().get(i) + "\n";
		}

		if (getCargoInPlane().isEmpty()) {
			s += "\t" + "NO CARGO"; // if nothing on plane
		}
		return s; // the original string of all info
	}
}
