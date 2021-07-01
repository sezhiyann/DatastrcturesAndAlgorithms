package com.learning.datastructure_algorithms.arrays.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWaitingTimeTest {

    @Test
    void minimumWaitingTime_1() {
        assertEquals(17, MinimumWaitingTime.get(new int[]{3, 2, 1, 2, 6}));
    }

    @Test
    void minimumWaitingTime_2() {
        assertEquals(6, MinimumWaitingTime.get(new int[]{1, 4, 5}));
    }

    @Test
    void minimumWaitingTime_3() {
        assertEquals(10, MinimumWaitingTime.get(new int[]{17, 4, 3}));
    }


}