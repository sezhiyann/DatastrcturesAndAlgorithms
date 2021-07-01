package com.learning.datastructure_algorithms.arrays;

/**
 * <div ><p>
 *   Write a function that takes in a non-empty array of distinct integers and an
 *   integer representing a target sum. If any two numbers in the input array sum
 *   up to the target sum, the function should return them in an array, in any
 *   order. If no two numbers sum up to the target sum, the function should return
 *   an empty array.
 * </p>
 * <p>
 *   Note that the target sum has to be obtained by summing two different integers
 *   in the array; you can't add a single integer to itself in order to obtain the
 *   target sum.
 * </p>
 * <p>
 *   You can assume that there will be at most one pair of numbers summing up to
 *   the target sum.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span >array</span> = [3, 5, -4, 8, 11, 1, -1, 6]
 * <span >targetSum</span> = 10
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>[-1, 11] <span >// the numbers could be in reverse order</span>
 * </pre></div>
 */
public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    return new int[] { array[i], array[j] };
                }
            }
        }
        return new int[0];
    }
}
