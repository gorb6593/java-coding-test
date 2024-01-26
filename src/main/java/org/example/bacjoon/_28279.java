package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _28279 {
    public static void main(String[] args) throws IOException {

        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int targetNumber = Integer.parseInt(st.nextToken());

        Deque<Integer> q = new LinkedList<>();
        int tmp;
        for (int i=0; i<targetNumber; i++) {
            st = new StringTokenizer(br.readLine());
            tmp = Integer.parseInt(st.nextToken());
            //1=> 앞에 넣기
            if (tmp == 1) {
                q.offerFirst(Integer.valueOf(st.nextToken()));
            }
            //2=> 뒤에 넣기
            else if (tmp == 2) {
                q.offerLast(Integer.valueOf(st.nextToken()));
            }
            //3=> 맨 앞에 있는 값 빼고 출력
            else if (tmp == 3) {
                if (q.isEmpty()) {
                    //없으면 -1
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.pollFirst()).append("\n");
                }
            }
            //4=> 맨 뒤에 있는 값 빼고 출력
            else if (tmp == 4) {
                if (q.isEmpty()) {
                    //없으면 -1
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.pollLast()).append("\n");
                }
            }
            //5=> 크기 출력
            else if (tmp == 5) {
                sb.append(q.size()).append("\n");
            }
            //6=> 비었으면 1 아니면 0
            else if (tmp == 6) {
                if (q.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            //7=> 맨 앞 출력, 없으면 -1
            else if (tmp == 7) {
                if (q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.peekFirst()).append("\n");
                }
            }
            //8=> 맨 뒤 출력, 없으면 -1
            else if (tmp == 8) {
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
