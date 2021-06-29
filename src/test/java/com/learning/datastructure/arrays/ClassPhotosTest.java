package com.learning.datastructure.arrays;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ClassNamePatternFilterUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ClassPhotosTest {

    @Test
    void canArrange_1() {

        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(new Integer[]{5, 8, 1, 3, 4}));
        ArrayList<Integer> blue = new ArrayList<Integer>(Arrays.asList(new Integer[]{6, 9, 2, 4, 5}));
        assertTrue(ClassPhotos.canArrange(red, blue));
    }

    @Test
    void canArrange_2() {
        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(new Integer[]{6}));
        ArrayList<Integer> blue = new ArrayList<Integer>(Arrays.asList(new Integer[]{6}));
        assertTrue(!ClassPhotos.canArrange(red, blue));
    }
}