package com.learning.datastructure;
public class Subsequence {
    public static void main(String[] args) {
        int[] main = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int[] sub = new int[] { 3, 2, 1 };
        int counter = 0;
        for (int i = 0; i < sub.length; i++) {
            for (int j = 0; j < main.length; j++) {
                if (sub[i] == main[j]) {
                    counter++;
                    break;
                }
            }
        }
        if (counter == sub.length) {
            System.out.println("sub is a sub sequence of main");
        } else {
            System.out.println("sub is not a sub sequence of main");
        }
    }
}
