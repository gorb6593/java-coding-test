package org.example.level2;

import org.example.level1.card;

import java.util.Stack;

public class bracket {

    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        bracket bracket = new bracket();

        String s = "(()()())";
        System.out.println(bracket.solution(s));
    }
}
