package edu.ben.homework.homework2;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

public class Homework2Test {

	@Test
	public void testImportEmployees() {
		try {
			Homework2.importEmployees(new File("homework2.data"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testgetEmployeeFirstName() {
		Employee actual = Homework2.getEmployeeByFirstName("Zena");
		assertEquals("Zena", actual.getFirstName());
		actual = Homework2.getEmployeeByFirstName("Molly");
		assertEquals("Molly", actual.getFirstName());
		actual = Homework2.getEmployeeByFirstName("Hayes");
		assertEquals("Hayes", actual.getFirstName());
	}

	@Test
	public void testgetEmployeeLastName() {
		Employee actual = Homework2.getEmployeeByLastName("Burch");
		assertEquals("Burch", actual.getLastName());
		actual = Homework2.getEmployeeByLastName("Norton");
		assertEquals("Norton", actual.getLastName());
		actual = Homework2.getEmployeeByLastName("Gentry");
		assertEquals("Gentry", actual.getLastName());
	}
}
