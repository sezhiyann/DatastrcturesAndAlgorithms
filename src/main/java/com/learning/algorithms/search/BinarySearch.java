package com.learning.algorithms.search;

public class BinarySearch {

	// assuming it is a sorted array
	public static int binarySearch(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int leftIdx = 0;
		int rightIdx = array.length - 1;
		while (leftIdx  <= rightIdx) {
			int middleIdx = (int) Math.floor((leftIdx + rightIdx) / 2);
			int middleValue = array[middleIdx];
			if (target > middleValue) {
				leftIdx = middleIdx + 1;
			} else if (target < middleValue) {
				rightIdx = middleIdx - 1;
			} else {
				return middleIdx;				 
			}
		}
		return -1;
	}
}
