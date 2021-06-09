package com.learning.algorithms.sort;

import com.learning.Utils;

public class QuickSort {

	// [8, 5, 2, 9, 5, 6, 3]
	public static int[] sort(int[] array) {
		if (array == null || array.length == 0) {
			return array;
		}
		sort(array, 0, array.length - 1);
		return array;
	}

	public static void sort(int[] array, int startIdx, int endIdx) {
		if (startIdx >= endIdx) {
			return;
		}
		int pointer = startIdx;
		int leftP = startIdx + 1;
		int rightP = endIdx;
		while (rightP >= leftP) {
			if (array[leftP] > array[pointer] && array[rightP] < array[pointer]) {
				Utils.swap(array, leftP, rightP);
			} else if (array[leftP] <= array[pointer]) {
				leftP++;
			} else if (array[rightP] >= array[pointer]) {
				rightP--;
			}
		}
		Utils.swap(array, pointer, rightP);
		// check which sublist is small to reduce time complexity.
		if (rightP - 1 - startIdx < endIdx - rightP + 1) {
			sort(array, startIdx, rightP - 1);
			sort(array, rightP + 1, endIdx);
		} else {
			sort(array, rightP + 1, endIdx);
			sort(array, startIdx, rightP - 1);
		}
	}

}
