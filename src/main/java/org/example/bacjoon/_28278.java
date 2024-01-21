package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _28278 {
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
            if (tmp == 1) {
                //sb.append(Integer.parseInt(st.nextToken())).append("\n");
                //System.out.println("st.nextToken() = " + st.nextToken());
                stack.add(Integer.parseInt(st.nextToken()));
            } else if ( tmp == 2) {
                if (stack.empty()) {
//                    System.out.println("-1");
                    sb.append(-1).append("\n");
                } else {
//                    System.out.println(stack.peek());
                    sb.append(stack.peek()).append("\n");
                    stack.pop();
                }
            } else if ( tmp == 3) {
                sb.append(stack.size()).append("\n");
//                System.out.println(stack.size());
            } else if ( tmp == 4) {
                if (stack.empty()) {
//                    System.out.println("1");
                    sb.append(1).append("\n");
                } else {
//                    System.out.println("0");
                    sb.append(0).append("\n");
                }
            } else if ( tmp == 5) {
                if (stack.empty()) {
//                    System.out.println("-1");
                    sb.append(-1).append("\n");
                } else {
//                    System.out.println(stack.peek());
                    sb.append(stack.peek()).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}

