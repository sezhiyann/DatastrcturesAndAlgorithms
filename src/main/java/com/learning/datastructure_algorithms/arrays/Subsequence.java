package com.learning.datastructure_algorithms.arrays;

/**
 * <div ><p>
 *   Given two non-empty arrays of integers, write a function that determines
 *   whether the second array is a subsequence of the first one.
 * </p>
 * <p>
 *   A subsequence of an array is a set of numbers that aren't necessarily adjacent
 *   in the array but that are in the same order as they appear in the array. For
 *   instance, the numbers <span>[1, 3, 4]</span> form a subsequence of the array
 *   <span>[1, 2, 3, 4]</span>, and so do the numbers <span>[2, 4]</span>. Note
 *   that a single number in an array and the array itself are both valid
 *   subsequences of the array.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span >array</span> = [5, 1, 22, 25, 6, -1, 8, 10]
 * <span >sequence</span> = [1, 6, -1, 10]
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>true
 * </pre></div>
 */
public class Subsequence {

    // int[] main = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    // int[] sub = new int[] { 1, 2 , 3 };
    // same order but need not be adjacent
    public static boolean solutionOne(int[] main, int[] sub) {
        int mainIdx = 0;
        int subIdx = 0;
        while (mainIdx < main.length && subIdx < sub.length) {
            if (main[mainIdx] == sub[subIdx]) {
                subIdx++;
            }
            mainIdx++;
        }
        return subIdx == sub.length;
    }


    public static boolean solutionTwo(int[] main, int[] sub) {
        int counter = 0;
        for (int k : sub) {
            for (int i : main) {
                if (k == i) {
                    counter++;
                    break;
                }
            }
        }
        return counter == sub.length;
    }
}
