package com.learning.datastructure;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import com.learning.datastructure.arrays.CombinationsOfLetters;
import org.junit.jupiter.api.Test;

class CombinationOfLettersTest {

	@Test
	void combinationOfLettersTest_1() {
		final int combo = 2;
		final int curCombo = 0;
		List<String> strings = Arrays.asList("a", "b", "c", "d");
		List<String> combinations = CombinationsOfLetters.combinations("", strings, combo, curCombo);
		assertTrue(Arrays.equals(combinations.toArray(new String[] {}), new String[] {"ab", "ac", "ad", "bc", "bd", "cd"}));
	}

}
