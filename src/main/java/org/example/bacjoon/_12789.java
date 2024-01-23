package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class _12789 {
    public static void main(String[] args) throws IOException {

        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        //첫 번째 숫자 가져오기
        int count = Integer.parseInt(st.nextToken());

        //현재 줄 큐로 생성
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack1 = new Stack<>();
        st = new StringTokenizer(br.readLine());
        int value;
        for (int i=0; i<count; i++) {
            value = Integer.parseInt(st.nextToken());
            queue.add(value);
        }
        int minValue = queue.peek();

        for (int i=0; i<count; i++) {
            if(queue.peek() <= minValue) minValue = queue.peek();
            stack1.push(queue.poll());
        }

        for (int i=0; i<count; i++) {
            if(stack1.peek() == minValue) {
                stack1.pop();
            }
        }


    }
}
