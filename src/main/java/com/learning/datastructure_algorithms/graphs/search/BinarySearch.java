package com.learning.datastructure_algorithms.graphs.search;

/**
 * <div ><p>
 *   Write a function that takes in a sorted array of integers as well as a target
 *   integer. The function should use the Binary Search algorithm to determine if
 *   the target integer is contained in the array and should return its index if it
 *   is, otherwise <span>-1</span>.
 * </p>
 * <p>
 *   If you're unfamiliar with Binary Search, we recommend watching the Conceptual
 *   Overview section of this question's video explanation before starting to code.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span >array</span> = [0, 1, 21, 33, 45, 45, 61, 71, 72, 73]
 * <span >target</span> = 33
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>3
 * </pre></div>
 */
public class BinarySearch {

    // assuming it is a sorted array
    public static int search(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int leftIdx = 0;
        int rightIdx = array.length - 1;
        while (leftIdx <= rightIdx) {
            int middleIdx = (int) Math.floor((double) (leftIdx + rightIdx) / 2);
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
