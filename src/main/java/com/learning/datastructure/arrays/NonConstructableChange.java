package com.learning.datastructure.arrays;

import java.util.Arrays;

public class NonConstructableChange {


    /**
     * Given an array of positive integers representing the values of coins in your
     * possession, write a function that returns the minimum amount of change (the minimum sum of money) that you  create.
     * The given coins can have any positive integer value and aren't necessarily unique
     * (i.e., you can have multiple coins of the same value).
     *
     * Sample input
     *  coins = [5,7,1,1,2,3,22]
     * Sample output
     *  20
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
