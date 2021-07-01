package com.learning.datastructure_algorithms.arrays.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ClassPhotosTest {

    @Test
    void canArrange_1() {

        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blue = new ArrayList<>(Arrays.asList(6, 9, 2, 4, 5));
        assertTrue(ClassPhotos.canArrange(red, blue));
    }

    @Test
    void canArrange_2() {
        ArrayList<Integer> red = new ArrayList<>(Collections.singletonList(6));
        ArrayList<Integer> blue = new ArrayList<>(Collections.singletonList(6));
        assertFalse(ClassPhotos.canArrange(red, blue));
    }
}