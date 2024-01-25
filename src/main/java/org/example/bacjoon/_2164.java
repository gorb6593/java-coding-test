package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _2164 {
    public static void main(String[] args) throws IOException {

        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());

        Deque<Integer> q = new LinkedList<>();
        int value = count;
        for (int i=0; i<count; i++) {
            q.push(value);
            value--;
        }

        while (q.size() > 1) {
            q.pop();
            q.add(q.pop());
        }
        System.out.println(q.peek());

    }
}
