package com.learning.datastructure_algorithms.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TwoNumberSumTest {

	@Test
	public void TestCase1() {
		int[] output = TwoNumberSum.twoNumberSum(new int[] { 3, 5, -4, 8, 11, 1, -1, 6 }, 10);
		assertEquals(2, output.length);
		assertTrue(Arrays.stream(output).anyMatch(x -> x == -1));
		assertTrue(Arrays.stream(output).anyMatch(x -> x == 11));
	}

}
