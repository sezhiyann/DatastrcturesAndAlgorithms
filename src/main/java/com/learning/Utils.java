package com.learning;

public final class Utils {

	public static void swap(int[] array, int firstIdx, int secondIdx) {
		if (array.length == 0 || firstIdx < 0 || firstIdx > array.length - 1 || secondIdx < 0
				|| secondIdx > array.length - 1) {
			return;
		}
		int tmp = array[firstIdx];
		array[firstIdx] = array[secondIdx];
		array[secondIdx] = tmp;
	}

	public static boolean compare(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
}
