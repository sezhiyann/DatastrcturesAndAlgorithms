package com.learning.algorithms.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.learning.algorithms.search.BinarySearch;

class BinarySearchTest {

	@Test
	void test_1() {
		assertEquals(3, BinarySearch.binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33));
	}

	@Test
	void test_2() {
		assertEquals(-1, BinarySearch.binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 31));
	}

}
