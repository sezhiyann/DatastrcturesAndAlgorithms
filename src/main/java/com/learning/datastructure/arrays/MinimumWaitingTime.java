package com.learning.datastructure.arrays;

import java.util.Arrays;

public class MinimumWaitingTime {
    //Time : O(N log(N))
    //Space : O(1)
    public static int get(int[] queries) {
        Arrays.sort(queries);
        int minimumWaitingTime = 0;
        int lastSum = 0;
        for (int i = 1; i < queries.length; i++) {
            lastSum = lastSum + queries[i - 1];
            minimumWaitingTime = minimumWaitingTime + lastSum;
        }
        return minimumWaitingTime;
    }
}
