package com.learning.datastructure.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TwoNumberSumTest {

	@Test
	public void TestCase1() {
		int[] output = TwoNumberSum.twoNumberSum(new int[] { 3, 5, -4, 8, 11, 1, -1, 6 }, 10);
		assertTrue(output.length == 2);
		assertTrue(Arrays.stream(output).anyMatch(x -> x == -1));
		assertTrue(Arrays.stream(output).anyMatch(x -> x == 11));
	}

}
