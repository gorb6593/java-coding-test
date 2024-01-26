package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _11866 {
    public static void main(String[] args) throws IOException {

        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int target = Integer.parseInt(st.nextToken());
        int kill = Integer.parseInt(st.nextToken());

        Deque<Integer> q = new LinkedList<>();

        for (int i=1; i<=target; i++) {
            q.add(i);
        }

        sb.append('<');
        while (q.size() > 1) {

            //없애야 하는 숫자 전까지 반복하면서 숫자를 제거하고 뒤에 붙이기 => 원처럼 되는 효과
            for (int i=0; i<(kill-1); i++) {
                q.offer(q.poll());
            }
            //다 돌았으면 처음에 있는 숫자 제거
            sb.append(q.poll()).append(", ");
        }
        //마기막으로 남은 숫자도 추가
        sb.append((q.poll()));
        sb.append('>');
        System.out.println(sb);
    }
}
