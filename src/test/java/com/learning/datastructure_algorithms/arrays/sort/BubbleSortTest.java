package com.learning.datastructure_algorithms.arrays.sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.learning.Utils;

class BubbleSortTest {

	@Test
	public void TestCase1() {
		int[] expected = { 2, 3, 5, 5, 6, 8, 9 };
		int[] input = { 8, 5, 2, 9, 5, 6, 3 };
		assertTrue(Utils.compare(BubbleSort.sort(input), expected));
	}

	@Test
	public void TestCase2() {
		int[] expected = { 1, 2, 3, 4, 5 };
		int[] input = { 1, 2, 3, 4, 5 };
		assertTrue(Utils.compare(BubbleSort.sort(input), expected));
	}

	@Test
	public void TestCase3() {
		int[] expected = { 43, 65, 77, 88, 99, 103 };
		int[] input = { 103, 99, 88, 77, 65, 43 };
		assertTrue(Utils.compare(BubbleSort.sort(input), expected));
	}


}
