package com.learning.datastructure_algorithms.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * take aribitary numbers in an array. find which sum of combinations result in
 * a given number
 */

public class SumOfCombinations {
    public static void main(String[] args) {
        int sum = 3;
        int combo = 3;
        List<Integer> numbers = Arrays.asList(8, -5, -4, 7, -1, 3);
        combinations(new ArrayList<>(), numbers, sum, combo, 0).forEach(a -> {
            System.out.println();
            for (Integer integer : a) {
                System.out.print(integer + " ");
            }
        });
    }

    // input 65, 35, 45, 95 combinations are
    // 65 * 35,45,95
    // 65,35 * 45,95
    public static List<List<Integer>> combinations(List<Integer> numbers, List<Integer> remaining, int sum, int combo,
            int curCombo) {
        List<List<Integer>> combos = new ArrayList<>();
        if (!numbers.isEmpty() && isSumEqualTo(numbers, sum) && curCombo <= combo) {
            combos.add(numbers);
        }
        
        if (curCombo == combo) {
            // no need to do anything.
            return combos;
        }

        for (int index = 0; index < remaining.size(); index++) {
            List<Integer> list = new ArrayList<>();
            list.addAll(numbers);
            list.add(remaining.get(index));
            combos.addAll(combinations(list, remaining.subList(index + 1, remaining.size()), sum, combo, curCombo + 1));
        }
        return combos;
    }

    public static boolean isSumEqualTo(List<Integer> numbers, int sum) {
        if (numbers != null) {
            return numbers.stream().mapToInt(Integer::intValue).sum() == sum;
        }
        return true;
    }
}