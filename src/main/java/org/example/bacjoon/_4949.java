package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String tmp;

        while (true) {
            tmp = br.readLine();

            //끝나는 조건
            if(tmp.equals(".")) {
                break;
            }

            sb.append(solve(tmp)).append("\n");
        }

        System.out.println(sb);
    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            //한 글자씩 가져오기
            char c = s.charAt(i);

            if (c == '(' || c == '[') {
                //다른 문자는 거르고 여는 문자일 때 넣기
                stack.push(c);
            } else if (c == ')'){

                //닫는 소괄호일때 매칭되는 여는 소괄호가 아니면 바로 리턴 => 검증 더 이상 할 필요없음
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                } else {
                    //매칭이 되면 꺼내서 없애기
                    stack.pop();
                }
            } else if (c == ']') {

                //닫는 대괄호일때 매칭되는 여는 대괄호가 아니면 바로 리턴 => 검증 더 이상 할 필요없음
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    //매칭이 되면 꺼내서 없애기
                    stack.pop();
                }
            }
        }

        if (stack.empty()) {
            //비었다면 매칭이 되는 것
            //괄호가 없으면 push가 안되서 스택은 비었으므로 yes
            return "yes";
        } else {
            return "no";
        }
    }
}
