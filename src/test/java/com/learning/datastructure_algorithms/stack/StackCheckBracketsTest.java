package com.learning.datastructure_algorithms.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackCheckBracketsTest {

    @Test
    void invalid() {
        String[] brackets = new String[]{"[", "{", "{", "]"};
        assertFalse(StackCheckBrackets.checkCorrectness(brackets));
    }

    @Test
    void valid() {
        String[] brackets = new String[]{"[", "{", "}", "]"};
        assertTrue(StackCheckBrackets.checkCorrectness(brackets));
    }
}