package com.learning.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TandemBicycleTest {

    @Test
    void fastest() {
        assertEquals(TandemBicycle.get(new int[]{5, 5, 3, 9, 2}, new int[]{3, 6, 7, 2, 1}, true), 32);
    }

    @Test
    void slowest() {
        assertEquals(TandemBicycle.get(new int[]{5, 5, 3, 9, 2}, new int[]{3, 6, 7, 2, 1}, false), 25);
    }

    @Test
    void slowest_1() {
        assertEquals(TandemBicycle.get(new int[]{5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5}, false), 15);
    }

    @Test
    void emptyArray() {
        assertEquals(TandemBicycle.get(new int[]{}, new int[]{}, true), 0);
        assertEquals(TandemBicycle.get(null, null, true), 0);
        assertEquals(TandemBicycle.get(new int[]{5, 5, 3, 9, 2}, null, true), 0);
        assertEquals(TandemBicycle.get(null, new int[]{5, 5, 3, 9, 2}, true), 0);

    }


}