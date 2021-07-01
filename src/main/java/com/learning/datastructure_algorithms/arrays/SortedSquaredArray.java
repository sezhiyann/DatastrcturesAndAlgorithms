package com.learning.datastructure_algorithms.arrays;

import java.util.Arrays;

/**
 * <div ><p>
 *   Write a function that takes in a non-empty array of integers that are sorted
 *   in ascending order and returns a new array of the same length with the squares
 *   of the original integers also sorted in ascending order.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span >array</span> = [1, 2, 3, 5, 6, 8, 9]
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>[1, 4, 9, 25, 36, 64, 81]
 * </pre></div>
 */
public class SortedSquaredArray {

	// Time complexity O(n log(n) )
	// Space complexity O(N)
	public static int[] sortedSquaredArray_Sol1(int[] array) {
		int mainIdx = 0;
		int[] squared = new int[array.length];
		while (mainIdx < array.length) {
			int value = array[mainIdx];
			squared[mainIdx] = value * value;
			mainIdx++;
		}
		// Time : O( n log(n))
		Arrays.sort(squared);
		return squared;
	}

	public static int[] sortedSquaredArray_Sol2(int[] array) {
		int leftIdx = 0;
		int rightIdx = array.length - 1;
		int[] squared = new int[array.length];
		for (int idx = array.length - 1; idx >= 0; idx--) {
			int leftValue = Math.abs(array[leftIdx]);
			int rightValue = Math.abs(array[rightIdx]);
			if (leftValue >= rightValue) {
				squared[idx] = leftValue * leftValue;
				leftIdx++;
			} else {
				squared[idx] = rightValue * rightValue;
				rightIdx--;
			}
		}

		return squared;
	}

}
