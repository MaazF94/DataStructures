package edu.ben.labs.lab6;

import static org.junit.Assert.*;
import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PhonebookTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAddRecord() throws InvalidInputType {
		Phonebook a = new Phonebook();
		String FirstName = "Derrick";
		String LastName = "Rose";
		String PhoneNumber = "2342342345";

		String FirstName1 = "Kobe";
		String LastName1 = "Bryant";
		String PhoneNumber1 = "1231231234";

		a.addRecord(new Record(FirstName, LastName, PhoneNumber));
		a.addRecord(new Record(FirstName1, LastName1, PhoneNumber1));
		/* The getSize assert Equals proves that it added a record */
		assertEquals(2, a.getSize());
	}

}
