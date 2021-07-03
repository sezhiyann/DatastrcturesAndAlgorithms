package com.learning.datastructure_algorithms.recursions;

/**
 * <div ><p>
 *   The Fibonacci sequence is defined as follows: the first number of the sequence
 *   is <span>0</span>, the second number is <span>1</span>, and the nth number is the sum of the (n - 1)th
 *   and (n - 2)th numbers. Write a function that takes in an integer
 *   <span>n</span> and returns the nth Fibonacci number.
 * </p>
 * <p>
 *   Important note: the Fibonacci sequence is often defined with its first two
 *   numbers as <span>F0 = 0</span> and <span>F1 = 1</span>. For the purpose of
 *   this question, the first Fibonacci number is <span>F0</span>; therefore,
 *   <span>getNthFib(1)</span> is equal to <span>F0</span>, <span>getNthFib(2)</span>
 *   is equal to <span>F1</span>, etc..
 * </p>
 * <h3>Sample Input #1</h3>
 * <pre><span >n</span> = 2
 * </pre>
 * <h3>Sample Output #1</h3>
 * <pre>1 <span >// 0, 1</span>
 * </pre>
 * <h3>Sample Input #2</h3>
 * <pre><span >n</span> = 6
 * </pre>
 * <h3>Sample Output #2</h3>
 * <pre>5 <span >// 0, 1, 1, 2, 3, 5</span>
 * </pre></div>
 * <p>
 * Time : O(N)
 * Space : O(1)
 */
public class FibonacciSeries {
    public static int getNthNumberByRecursion(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return getNthNumber(n - 1) + getNthNumber(n - 2);
    }

    public static int getNthNumber(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        int series = 3;
        int fn_1 = 0;
        int fn_2 = 1;
        int number;
        do {
            number = fn_1 + fn_2;
            series++;
            fn_1 = fn_2;
            fn_2 = number;
        } while (series <= n);
        return number;
    }


}
