package com.learning.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NonConsructibleChangeTest {

    @Test
    public void nonConstructableChange_1() {
        int expected = 20;
        int actual = NonConstructableChange.getNonConstructableChange(new int[]{1, 1, 2, 3, 5, 7, 22});
        assertEquals(actual, expected);
    }

    @Test
    public void nonConstructableChange_2() {
        int expected = 1;
        int actual = NonConstructableChange.getNonConstructableChange(new int[]{});
        assertEquals(actual, expected);
    }

    @Test
    public void nonConstructableChange_3() {
        int expected = 40;
        int actual = NonConstructableChange.getNonConstructableChange(new int[]{1, 1, 2, 3, 5, 7, 20});
        assertEquals(expected, actual);
    }

    @Test
    public void nonConstructableChange_4() {
        int expected = 1;
        int actual = NonConstructableChange.getNonConstructableChange(new int[]{64});
        assertEquals(expected, actual);
    }
}