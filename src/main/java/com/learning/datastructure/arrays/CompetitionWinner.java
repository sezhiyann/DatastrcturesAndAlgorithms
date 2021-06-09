package com.learning.datastructure.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class CompetitionWinner {

	public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		// Write your code here.
		HashMap<String, Integer> scores = new HashMap<>();
		String highestScore = null;
		for (int i = 0; i < results.size(); i++) {
			int result = results.get(i);
			ArrayList<String> participants = competitions.get(i);
			String winner = participants.get(result == 1 ? 0 : 1);
			int totalScore = 3;
			if(scores.containsKey(winner)) {
				totalScore += scores.get(winner);
			}
			scores.put(winner, totalScore);
			if (highestScore == null || highestScore == winner || scores.get(highestScore) < totalScore) {
				highestScore = winner;
			}
		}
		return highestScore;
	}
}
