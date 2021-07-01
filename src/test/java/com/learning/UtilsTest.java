package com.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {

    @Test
    void sortEmpty() {
        int[] empty = new int[]{};
        assertEquals(Utils.sort(empty, true), empty);
    }

    @Test
    void sortAscending() {
        assertTrue(Utils.compare(Utils.sort(new int[]{5, 5, 3, 9, 2}, true), new int[]{2, 3, 5, 5, 9}));
    }

    @Test
    void sortDescending() {
        assertTrue(Utils.compare(Utils.sort(new int[]{5, 5, 3, 9, 2}, false), new int[]{9, 5, 5, 3, 2}));
    }

    @Test
    void reverseArray_1() {
        int[] array = new int[]{6, 5, 4, 3, 2, 1};
        Utils.reverseArray(array);
        assertTrue(Utils.compare(array, new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    void reverseArray_2() {
        int[] array = new int[]{6, 5, 4, 3, 2};
        Utils.reverseArray(array);
        assertTrue(Utils.compare(array, new int[]{2, 3, 4, 5, 6}));
    }
}