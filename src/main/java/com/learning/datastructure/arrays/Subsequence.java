package com.learning.datastructure.arrays;

public class Subsequence {

    // int[] main = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    // int[] sub = new int[] { 1, 2 , 3 };
    // same order but need not be adjacent
    public static boolean solutionOne(int[] main, int[] sub) {
        int mainIdx = 0;
        int subIdx = 0;
        while (mainIdx < main.length && subIdx < sub.length) {
            if (main[mainIdx] == sub[subIdx]) {
                subIdx++;
                mainIdx++;
            } else {
                mainIdx++;
            }
        }
        return subIdx == sub.length;
    }


    public static boolean solutionTwo(int[] main, int[] sub) {
        int counter = 0;
        for (int i = 0; i < sub.length; i++) {
            for (int j = 0; j < main.length; j++) {
                if (sub[i] == main[j]) {
                    counter++;
                    break;
                }
            }
        }
        return counter == sub.length;
    }
}
