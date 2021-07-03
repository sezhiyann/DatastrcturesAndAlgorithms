package com.learning.datastructure_algorithms.recursions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {

    @Test
    void getNthNumber() {
        assertEquals(0, FibonacciSeries.getNthNumber(-1));
        assertEquals(0, FibonacciSeries.getNthNumber(0));
        assertEquals(0, FibonacciSeries.getNthNumber(1));
        assertEquals(1, FibonacciSeries.getNthNumber(2));
        assertEquals(1, FibonacciSeries.getNthNumber(3));
        assertEquals(2, FibonacciSeries.getNthNumber(4));
        assertEquals(3, FibonacciSeries.getNthNumber(5));
        assertEquals(5, FibonacciSeries.getNthNumber(6));
    }

    @Test
    void getNthNumberByRecursion() {
        assertEquals(0, FibonacciSeries.getNthNumberByRecursion(-1));
        assertEquals(0, FibonacciSeries.getNthNumberByRecursion(0));
        assertEquals(0, FibonacciSeries.getNthNumberByRecursion(1));
        assertEquals(1, FibonacciSeries.getNthNumberByRecursion(2));
        assertEquals(1, FibonacciSeries.getNthNumberByRecursion(3));
        assertEquals(2, FibonacciSeries.getNthNumberByRecursion(4));
        assertEquals(3, FibonacciSeries.getNthNumberByRecursion(5));
        assertEquals(5, FibonacciSeries.getNthNumberByRecursion(6));
    }
}