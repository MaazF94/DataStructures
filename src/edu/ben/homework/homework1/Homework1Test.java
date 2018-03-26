package edu.ben.homework.homework1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Homework1Test {
	@Test
	public void testisConsecutiveFourHorizontal() {
		int[][] values = {{5, 5, 5, 5}, {2, 2, 4, 2}, {2, 2, 4, 2}, {2, 2, 4, 2}};
		boolean consecutiveFour = Homework1.isConsecutiveFour(values);
		assertTrue(consecutiveFour==true);
		
	}
	
	@Test
	public void testisConsecutiveFourVertical() {
		int[][] values = {{5, 5, 5, 4}, {2, 5, 4, 2}, {2, 5, 4, 2}, {2, 5, 4, 2}};
		boolean consecutiveFour = Homework1.isConsecutiveFour(values);
		assertTrue(consecutiveFour==true);
		
	}
	
	@Test
	public void testisConsecutiveFourDiagonalRight() {
		int[][] values = {{5, 5, 5, 4}, {2, 5, 4, 2}, {2, 5, 5, 2}, {2, 5, 4, 5}};
		boolean consecutiveFour = Homework1.isConsecutiveFour(values);
		assertTrue(consecutiveFour==true);
		
	}
	
	@Test
	public void testisConsecutiveFourDiagonalLeft() {
		int[][] values = {{4, 8, 9, 5}, {2, 5, 5, 2}, {2, 5, 4, 2}, {5, 5, 4, 2}};
		boolean consecutiveFour = Homework1.isConsecutiveFour(values);
		assertTrue(consecutiveFour==true);
		
	}
	
	@Test
	public void testisConsecutiveFourNone() {
		int[][] values = {{4, 8, 9, 5}, {9, 8, 7, 6}, {5, 4, 3, 2 }, {8, 5, 2, 1}};
		boolean consecutiveFour = Homework1.isConsecutiveFour(values);
		assertTrue(consecutiveFour==false);
		
	}
	
	@Test
	public void testisConsecutiveFourNonSquareOneRow() {
		int[][] values = {{4, 4, 4, 4, 6, 8, 6, 4}};
		boolean consecutiveFour = Homework1.isConsecutiveFour(values);
		assertTrue(consecutiveFour==true);
		
	}
	
	@Test
	public void testisConsecutiveFourNonSquareFourRowsHorizontal() {
		int[][] values = {{2, 8, 9, 5}, {2, 5, 5, 2}, {2, 3, 4}, {2}};
		boolean consecutiveFour = Homework1.isConsecutiveFour(values);
		assertTrue(consecutiveFour==true);
		
	}
	
	@Test
	public void testisConsecutiveFourNonSquareFourRowsVertical() {
		int[][] values = {{2, 8, 9, 5}, {5, 5, 5, 5}, {2, 3, 4}, {2}};
		boolean consecutiveFour = Homework1.isConsecutiveFour(values);
		assertTrue(consecutiveFour==true);
		
	}
	
	@Test
	public void testisConsecutiveFourNonSquareFourRowsDiagonalRight() {
		int[][] values = {{5, 4, 3, 2}, {6, 7, 8, 9}, {7, 6, 5, 4}, {8, 7, 6, 5}, {9, 8, 7, 6}};
		boolean consecutiveFour = Homework1.isConsecutiveFour(values);
		assertTrue(consecutiveFour==true);
		
	}
	
	@Test
	public void testisConsecutiveFourNonSquareFourRowsDiagonalLeft() {
		int[][] values = {{4, 3, 2, 1}, {3, 2, 1, 6, 4, 3}, {2, 1, 2, 6, 5}, {1, 7, 5, 3}};
		boolean consecutiveFour = Homework1.isConsecutiveFour(values);
		assertTrue(consecutiveFour==true);
		
	}
	
	@Test
	public void testisConsecutiveFourNonSquareSevenRowsDifferentColumns() {
		int[][] values = {{2, 8, 9, 5}, {5, 5, 5, 5}, {2, 3, 4}, {2}, {2, 8, 9, 5}, {5, 2, 5, 5}, {3, 2, 2}};
		boolean consecutiveFour = Homework1.isConsecutiveFour(values);
		assertTrue(consecutiveFour==true);
		
	}
	
	@Test
	public void testisConsecutiveFourNonSquareNone() {
		int[][] values = {{4, 8, 9, 5}, {9, 8, 7, 6}, {5, 4, 3, 2 }, {8, 5, 2, 6, 5}};
		boolean consecutiveFour = Homework1.isConsecutiveFour(values);
		assertTrue(consecutiveFour==false);
		
	}
	
	@Test
	public void testisConsecutiveFourLessThanFourRows() {
		int[][] values = {{4}, {4}, {4}, {4, 5}};
		boolean consecutiveFour = Homework1.isConsecutiveFour(values);
		assertTrue(consecutiveFour==true);
		
	}
	
	@Test
	public void testconsecutiveFour() {
		int[] values = {3, 3, 3, 3};
		boolean consecutiveFour = Homework1.consecutiveFour(values);
		assertTrue(consecutiveFour==true);
	}
	
	@Test
	public void testconsecutiveFourNone() {
		int[] values = {3, 3, 3, 2};
		boolean consecutiveFour = Homework1.consecutiveFour(values);
		assertTrue(consecutiveFour==false);
	}
}
	
