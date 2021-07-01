package com.learning.datastructure_algorithms.arrays.sort;

import com.learning.Utils;

/**
 * <div ><p>
 *   Write a function that takes in an array of integers and returns a sorted
 *   version of that array. Use the Bubble Sort algorithm to sort the array.
 * </p>
 * <p>
 *   If you're unfamiliar with Bubble Sort, we recommend watching the Conceptual
 *   Overview section of this question's video explanation before starting to code.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span >array</span> = [8, 5, 2, 9, 5, 6, 3]
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>[2, 3, 5, 5, 6, 8, 9]
 * </pre></div>
 */
public class BubbleSort {

	//TODO: time / space
	public static int[] sort(int[] array) {
		// Write your code here.
		int size = array.length - 1;
		int counter = 0;
		boolean swap = false;
		while (counter < size) {
			if (array[counter] > array[counter + 1]) {
				Utils.swap(array, counter, counter + 1);
				swap = true;
			}

			if (counter == size - 1 && swap) {
				size--;
				counter = 0;
				swap = false;
			} else {
				counter++;
			}
		}
		return array;
	}
}
