package com.learning.datastructure.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortedSquaredArrayTest {

	@Test
	public void Test_1_sortedSquaredArray_Sol1() {
		int[] input = new int[] { 1, 2, 3, 5, 6, 8, 9 };
		int[] expected = new int[] { 1, 4, 9, 25, 36, 64, 81 };
		int[] actual = SortedSquaredArray.sortedSquaredArray_Sol1(input);
		for (int i = 0; i < expected.length; i++) {
			assertTrue(expected[i] == actual[i]);
		}
	}

	@Test
	public void Test_2_sortedSquaredArray_Sol1() {
		int[] input = new int[] { -10, -8, 1, 2, 3, 5, 6, 8, 9 };
		int[] expected = new int[] { 1, 4, 9, 25, 36, 64, 64, 81, 100 };
		int[] actual = SortedSquaredArray.sortedSquaredArray_Sol1(input);
		for (int i = 0; i < expected.length; i++) {
			assertTrue(expected[i] == actual[i]);
		}
	}

	@Test
	public void Test_1_sortedSquaredArray_Sol2() {
		int[] input = new int[] { 1, 2, 3, 5, 6, 8, 9 };
		int[] expected = new int[] { 1, 4, 9, 25, 36, 64, 81 };
		int[] actual = SortedSquaredArray.sortedSquaredArray_Sol2(input);
		for (int i = 0; i < expected.length; i++) {
			assertTrue(expected[i] == actual[i]);
		}
	}

	@Test
	public void Test_2_sortedSquaredArray_Sol2() {
		int[] input = new int[] { -10, -8, 1, 2, 3, 5, 6, 8, 9 };
		int[] expected = new int[] { 1, 4, 9, 25, 36, 64, 64, 81, 100 };
		int[] actual = SortedSquaredArray.sortedSquaredArray_Sol2(input);
		for (int i = 0; i < expected.length; i++) {
			assertTrue(expected[i] == actual[i]);
		}
	}
}
