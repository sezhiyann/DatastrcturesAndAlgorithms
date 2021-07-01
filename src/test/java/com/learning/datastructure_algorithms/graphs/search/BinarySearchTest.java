package com.learning.datastructure_algorithms.graphs.search;

import static org.junit.jupiter.api.Assertions.*;

import com.learning.datastructure_algorithms.graphs.search.BinarySearch;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void test_1() {
        assertEquals(3, BinarySearch.search(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33));
    }

    @Test
    void test_2() {
        assertEquals(-1, BinarySearch.search(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 31));
    }

}
