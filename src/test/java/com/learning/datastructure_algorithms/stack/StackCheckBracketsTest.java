package com.learning.datastructure_algorithms.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackCheckBracketsTest {

    @Test
    void checkCorrectness_1() {
        String[] brackets = new String[]{"[", "{", "{", "]"};
        assertTrue(StackCheckBrackets.checkCorrectness(brackets));
    }
}