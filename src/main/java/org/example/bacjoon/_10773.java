package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();

        int tmp = 0;
        for (int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            tmp = Integer.parseInt(st.nextToken());
            if (tmp == 0) {
               stack.pop();
            } else {
                stack.add(tmp);
            }
        }
        //System.out.println("stack = " + stack);
        int answer = 0;
        int maxNum = stack.size();
        for (int i=0; i<maxNum; i++) {
            answer += stack.peek();
            //System.out.println("stack.peek() = " + stack.peek());
            stack.pop();
        }
        System.out.println(answer);

    }
}
