package edu.ben.labs.lab6;

import java.util.ArrayList;

/**
 * 
 * @author maazfitter
 * @version 1.0
 * 
 */
public class Phonebook {

	/**
	 * class variable
	 */
	MyLinkedList<Record> records = new MyLinkedList<Record>();

	/**
	 * add record to phone book
	 * 
	 * @param person
	 *            that is passed in
	 * @throws InvalidInputType
	 *             in case not valid
	 */
	public void addRecord(Record person) throws InvalidInputType {
		if (person == null) {
			throw new InvalidInputType();
		}

		records.addLast(person);

	}

	/**
	 * delete person from book
	 * 
	 * @param person
	 *            that is passed in
	 * @return true bc it's done
	 */
	public boolean deleteRecord(Record person) {
		records.remove(person);
		return true;
	}

	/**
	 * size of book
	 * 
	 * @return size of book
	 */
	public int getSize() {
		return records.getSize();

	}

	/**
	 * search by first name
	 * 
	 * @param firstName
	 *            passed in
	 * @return name otherwise null
	 */
	public ArrayList<Record> searchByFirstName(String firstName) {
		ArrayList<Record> name = new ArrayList<Record>();
		Node<Record> current = records.getHead();

		while ((current != null)
				&& (!current.getValue().getFirstName().equals(firstName))) {
			if (current.getValue().getFirstName().equals(firstName)) {
				name.add(current.getValue());
				return name;
			}
			current = current.getNext();
		}
		return null;
	}

	/**
	 * search by last name
	 * 
	 * @param lastName
	 *            passed in
	 * @return name otherwise null
	 */
	public ArrayList<Record> searchByLastName(String lastName) {
		ArrayList<Record> name = new ArrayList<Record>();
		Node<Record> current = records.getHead();

		while ((current != null)
				&& (!current.getValue().getFirstName().equals(lastName))) {
			if (current.getValue().getFirstName().equals(lastName)) {
				name.add(current.getValue());
				return name;
			}
			current = current.getNext();
		}
		return null;
	}

	/**
	 * search by phone number
	 * 
	 * @param phoneNumber
	 *            passed in
	 * @return r otherwise null
	 */
	public Record searchByPhoneNumber(String phoneNumber) {
		for (int i = 0; i < records.getSize(); i++) {
			Record r = (Record) (records.get(i));
			if (r.phoneNumber.equals(phoneNumber)) {
				return r;
			}
		}

		return null;

	}

	/**
	 * toString for records
	 * 
	 * @return records.toString
	 */
	public String toString() {
		return records.toString();

	}

}
