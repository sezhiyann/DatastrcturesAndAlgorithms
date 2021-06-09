package com.learning.datastructure.arrays;

import java.util.Arrays;

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
