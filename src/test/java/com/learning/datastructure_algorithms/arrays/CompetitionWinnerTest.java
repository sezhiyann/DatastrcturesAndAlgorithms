package com.learning.datastructure_algorithms.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompetitionWinnerTest {


	@Test
	public void TestCase1() {
		ArrayList<ArrayList<String>> competitions = new ArrayList<>();
		competitions.add(new ArrayList<>(Arrays.asList("HTML", "Java")));
		competitions.add(new ArrayList<>(Arrays.asList("Java", "Python")));
		competitions.add(new ArrayList<>(Arrays.asList("Python", "HTML")));
		competitions.add(new ArrayList<>(Arrays.asList("C#", "Python")));
		competitions.add(new ArrayList<>(Arrays.asList("Java", "C#")));
		competitions.add(new ArrayList<>(Arrays.asList("C#", "HTML")));
		
		ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 1, 1, 1, 0, 1));
		String expected = "C#";
		var actual = CompetitionWinner.getWinner(competitions, results);
		assertEquals(expected, actual);
		
	}

}
