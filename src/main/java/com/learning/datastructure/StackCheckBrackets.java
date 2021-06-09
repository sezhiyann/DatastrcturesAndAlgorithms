package com.learning.datastructure;
import java.util.Stack;

public class StackCheckBrackets {
    public static void main(String[] args) {
        // Last in first out
        String[] brackets = new String[] { "[", "{", "{", "]" };
        System.out.print("Brackets : ");
        
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
        System.out.println();
        if(!stack.isEmpty()) {
            System.out.println("Invalid set of brackets");
        } else {
            System.out.println("Brackets are valid");
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
