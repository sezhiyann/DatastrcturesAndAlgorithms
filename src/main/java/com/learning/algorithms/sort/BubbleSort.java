package com.learning.algorithms.sort;

import com.learning.Utils;

public class BubbleSort {

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
