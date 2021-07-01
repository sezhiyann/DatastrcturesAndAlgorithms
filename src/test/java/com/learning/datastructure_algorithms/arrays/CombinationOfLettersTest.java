package com.learning.datastructure_algorithms.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CombinationOfLettersTest {

    @Test
    void combinationOfLettersTest_1() {
        final int combo = 2;
        final int curCombo = 0;
        List<String> strings = Arrays.asList("a", "b", "c", "d");
        List<String> combinations = CombinationsOfLetters.combinations("", strings, combo, curCombo);
        assertArrayEquals(combinations.toArray(new String[]{}), new String[]{"ab", "ac", "ad", "bc", "bd", "cd"});
    }

}
