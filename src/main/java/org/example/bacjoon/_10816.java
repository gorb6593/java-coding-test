package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _10816 {
    public static void main(String[] args) throws IOException {
/*
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10
 */
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        //첫 번째 줄 가져오기
        st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<count; i++) {
            int tmp = Integer.parseInt(st.nextToken());

            //중복 x
            if (!map.containsKey(tmp)) {
                map.put(tmp , 1);

            }
            //중복 o
            else {
                map.put(tmp, map.get(tmp) + 1);
            }
        }

        //두 번째 줄 가져오기
        st = new StringTokenizer(br.readLine());
        int count2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<count2; i++) {
            int tmp2 = Integer.parseInt(st.nextToken());

            //없으면 0
            if(map.get(tmp2) == null) {
                sb.append(0 + " ");
            }
            //있으면 밸류 가져오기
            else {
                sb.append(map.get(tmp2)).append(" ");
            }
        }
        System.out.println(sb);
    }
}
