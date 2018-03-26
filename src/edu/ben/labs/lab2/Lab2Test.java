package edu.ben.labs.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lab2Test {

	int[][] array = { { 1, 2 }, { 3, 4 } };

	@Test
	public void getArrayTest() {
		int[][] array = null;

		Lab2 testArray = new Lab2(array);
		assertEquals(true, testArray.getArray());

		int[][] array1 = { { 1, 2 }, { 3, 4 } };

		Lab2 testArray1 = new Lab2(array1);
		assertEquals(false, testArray1.getArray());

	}

	@Test
	public void getTotalTest() throws Exception {
		Lab2 testTotal = new Lab2(array);
		assertEquals(10, testTotal.getTotal(), 0);
	}

	@Test
	public void getAverageTest() throws Exception {
		Lab2 testAverage = new Lab2(array);
		assertEquals(2.0, testAverage.getAverage(), 0);
	}

	@Test
	public void getColumnTotalTest() throws Exception {
		Lab2 testColumnTotal = new Lab2(array);
		assertEquals(6, testColumnTotal.getColumnTotal(1), 0);
	}

	@Test
	public void getRowTotalTest() throws Exception {
		Lab2 testRowTotal = new Lab2(array);
		assertEquals(7, testRowTotal.getRowTotal(1), 0);
	}

	@Test
	public void getHighestInRowTest() throws Exception {
		Lab2 testHighestInRow = new Lab2(array);
		assertEquals(4, testHighestInRow.getHighestInRow(1), 0);
	}

	@Test
	public void getHighestInColumnTest() throws Exception {
		Lab2 testHighestInColumn = new Lab2(array);
		assertEquals(3, testHighestInColumn.getHighestInColumn(0), 0);
	}
}
