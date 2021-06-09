package com.learning.datastructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * take aribitary numbers in an array. find which sum of combinations result in
 * a given number
 */

public class CombinationsOfLetters {
    public static void main(String[] args) {
        final int combo = 2;
        final int curCombo = 0;
        List<String> strings = Arrays.asList("a", "b", "c", "d");
        combinations("", strings, combo, curCombo).forEach(a -> System.out.println(a));
    }

    public static List<String> combinations(String string, List<String> remaining, int combo, int curCombo) {
        List<String> combos = new ArrayList<>();
        if (curCombo == combo && !string.isEmpty()) {
            combos.add(string);
            return combos;
        }

        for (int index = 0; index < remaining.size(); index++) {
            combos.addAll(combinations(string + " " + remaining.get(index),
                    remaining.subList(index + 1, remaining.size()), combo, curCombo + 1));
        }
        return combos;
    }

}