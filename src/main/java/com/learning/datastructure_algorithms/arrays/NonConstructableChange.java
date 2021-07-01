package com.learning.datastructure_algorithms.arrays;

import java.util.Arrays;

/**
 * <div ><p>
 *   Given an array of positive integers representing the values of coins in your
 *   possession, write a function that returns the minimum amount of change (the
 *   minimum sum of money) that you <b>cannot</b> create. The given coins can have
 *   any positive integer value and aren't necessarily unique (i.e., you can have
 *   multiple coins of the same value).
 * </p>
 * <p>
 *   For example, if you're given <span>coins = [1, 2, 5]</span>, the minimum
 *   amount of change that you can't create is <span>4</span>. If you're given no
 *   coins, the minimum amount of change that you can't create is <span>1</span>.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span >coins</span> = [5, 7, 1, 1, 2, 3, 22]
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>20
 * </pre></div>
 */
public class NonConstructableChange {


    /**
     * @param coins - array
     * @return - change
     */
    public static int getNonConstructableChange(int[] coins) {
        if (coins == null || coins.length == 0) {
            return 1;
        }
        //O(nlog(n))
        Arrays.sort(coins);
        //[1, 1, 2, 3, 5, 7, 22]
        int currentChange = 0;
        for (int coin : coins) {
            if(coin > currentChange + 1) {
                return currentChange + 1;
            }
            currentChange += coin;
        }
        return currentChange + 1;
    }
}
