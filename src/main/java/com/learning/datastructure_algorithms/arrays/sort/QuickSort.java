package com.learning.datastructure_algorithms.arrays.sort;

import com.learning.Utils;

/**
 * <div ><p>
 *   Write a function that takes in an array of integers and returns a sorted
 *   version of that array. Use the Quick Sort algorithm to sort the array.
 * </p>
 * <p>
 *   If you're unfamiliar with Quick Sort, we recommend watching the Conceptual
 *   Overview section of this question's video explanation before starting to code.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span >array</span> = [8, 5, 2, 9, 5, 6, 3]
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>[2, 3, 5, 5, 6, 8, 9]
 * </pre></div>
 */
public class QuickSort {

	//todo : time and space
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
		int leftP = startIdx + 1;
		int rightP = endIdx;
		while (rightP >= leftP) {
			if (array[leftP] > array[startIdx] && array[rightP] < array[startIdx]) {
				Utils.swap(array, leftP, rightP);
			} else if (array[leftP] <= array[startIdx]) {
				leftP++;
			} else if (array[rightP] >= array[startIdx]) {
				rightP--;
			}
		}
		Utils.swap(array, startIdx, rightP);
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
