package com.learning.datastructure.arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CompetitionWinnerTest {


	@Test
	public void TestCase1() {
		ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
		competitions.add(new ArrayList<String>(Arrays.asList("HTML", "Java"))); 
		competitions.add(new ArrayList<String>(Arrays.asList("Java", "Python")));
		competitions.add(new ArrayList<String>(Arrays.asList("Python", "HTML")));
		competitions.add(new ArrayList<String>(Arrays.asList("C#", "Python")));
		competitions.add(new ArrayList<String>(Arrays.asList("Java", "C#")));
		competitions.add(new ArrayList<String>(Arrays.asList("C#", "HTML")));
		
		ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1, 0, 1));
		String expected = "C#";
		var actual = CompetitionWinner.tournamentWinner(competitions, results);
		assertTrue(expected == actual);
		
	}

}
