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
        
        //대기열을 스택으로 생성
        Stack<Integer> stack = new Stack<>();
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<count; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }

        int minValue = 1;

        //현재줄(큐)이 빌때까지 진행
        while (!queue.isEmpty()) {
            //꺼내는 값이 가장 작은 수면 바로 꺼내고 +1
            if (queue.peek() == minValue) {
                queue.poll();
                minValue++;

                //대기열에 무엇인가가 있고 그 값이 가장 작은 수면 꺼내고 +1
            } else if (!stack.isEmpty() && stack.peek() == minValue) {
                stack.pop();
                minValue++;

                //지금 당장 나갈 사람에 해당 없으면 현재열 => 대기열(스택)에 추가
            } else {
                stack.push(queue.poll());
            }
        }

        //현재줄은 다 빠졌고 대기줄 사람 체크
        while (!stack.isEmpty()) {

            //대기줄에서 꺼낸 값이 가장 작은 수면 꺼내고 +1
            if (stack.peek() == minValue) {
                stack.pop();
                minValue++;
            } else {
                //아니면 정답
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");

    }
}
