package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _1269 {
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int count2 = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new HashMap<>();

        int tmp = 0;
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<count; i++) {
            tmp = Integer.parseInt(st.nextToken());
            map.put(tmp, tmp);
        }
        st = new StringTokenizer(br.readLine());
        int countValue = 0;

        for (int i=0; i<count2; i++) {
            tmp = Integer.parseInt(st.nextToken());
            if(map.containsKey(tmp)) countValue++;
            map.put(tmp, tmp);
        }

//        System.out.println("map.size() = " + map.size());
//        System.out.println("countValue = " + countValue);
        System.out.println(map.size()-countValue);

    }
}
