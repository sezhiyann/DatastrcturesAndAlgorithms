package com.learning.datastructure_algorithms.stack;

import java.util.Stack;

public class StackCheckBrackets {
    public static boolean checkCorrectness(String[] brackets) {
        if (brackets == null || brackets.length == 0) {
            return true;
        }
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < brackets.length; i++) {
            String current = brackets[i];
            System.out.print(" " + current);
            if (stack.isEmpty()) {
                stack.push(brackets[i]);
            } else {
                String prev = stack.peek();
                String reverse = getInverseBracket(prev);
                if (current == reverse) {
                    stack.pop();
                } else {
                    stack.push(current);
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    private static String getInverseBracket(String bracket) {
        if (bracket != null && !bracket.isEmpty()) {
            switch (bracket) {
                case "[":
                    return "]";
                case "]":
                    return "[";
                case "{":
                    return "}";
                case "}":
                    return "{";
            }
        }
        throw new RuntimeException("Invalid bracket");
    }
}
