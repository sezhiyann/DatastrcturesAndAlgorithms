package com.learning.datastructure_algorithms.arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SubsequenceTest {

	@Test
	void testSolutionOne() {
		assertTrue(Subsequence.solutionOne(new int[] { 1, 2, 3, 4, 5, 6, 7 }, new int[] { 1, 2, 3 }));
		assertTrue(Subsequence.solutionOne(new int[] { 2, 1, 3, 4, 7, 6, 5 }, new int[] { 3, 7, 5 }));
		assertFalse(Subsequence.solutionOne(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{3, 2, 1}));
	}


	@Test
	void testSolutionTwo() {
		assertTrue(Subsequence.solutionOne(new int[] { 1, 2, 3, 4, 5, 6, 7 }, new int[] { 1, 2, 3 }));
		assertTrue(Subsequence.solutionOne(new int[] { 2, 1, 3, 4, 7, 6, 5 }, new int[] { 3, 7, 5 }));
		assertFalse(Subsequence.solutionOne(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{3, 2, 1}));
	}
}
