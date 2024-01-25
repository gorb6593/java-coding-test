package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _18258 {
    public static void main(String[] args) throws IOException {

        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        //첫 번째 숫자 가져오기
        int count = Integer.parseInt(st.nextToken());
        Deque<Integer> q = new LinkedList<>();
        String tmp = "";
        for (int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            tmp = st.nextToken();
            //push X: 정수 X를 큐에 넣는 연산이다.
            if (tmp.equals("push")) {
                q.offer(Integer.valueOf(st.nextToken()));
            }
            //pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다
            else if (tmp.equals("pop")) {
                if (q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.poll()).append("\n");
                }
            }
            //size: 큐에 들어있는 정수의 개수를 출력한다.
            else if (tmp.equals("size")) {
                sb.append(q.size()).append("\n");
            }
            //empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
            else if (tmp.equals("empty")) {
                if (q.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            //front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            else if (tmp.equals("front")) {
                if (q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.peek()).append("\n");
                }
            }
            //back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            else if (tmp.equals("back")) {
                if (q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
