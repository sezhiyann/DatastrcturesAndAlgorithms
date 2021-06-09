package com.learning.algorithms.sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.learning.Utils;

class QuickSortTest {

	@Test
	void test() {
		int[] expected = { 2, 3, 5, 5, 6, 8, 9 };
		int[] input = { 8, 5, 2, 9, 5, 6, 3 };
		assertTrue(Utils.compare(QuickSort.sort(input), expected));
	}

}
