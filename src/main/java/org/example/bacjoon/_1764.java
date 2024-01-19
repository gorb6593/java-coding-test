package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _1764 {
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        //첫 번째 줄 가져오기
        st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int count2 = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();
        String tmp = "";
        for (int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            tmp = st.nextToken();
            map.put(tmp, tmp);
        }
        int countValue = 0;
        
        ArrayList<String> arr = new ArrayList<>();

        for (int i=0; i<count2; i++) {
            st = new StringTokenizer(br.readLine());
            tmp = st.nextToken();
            if(map.containsKey(tmp)) {
                countValue++;
                //System.out.println("map.get() = " + map.get(tmp));
                //sb.append(map.get(tmp)).append("\n");
                arr.add(map.get(tmp));
            }
        }
        Collections.sort(arr);
        System.out.println(countValue);
        for (String e : arr) {
            System.out.println(e);
        }

        //System.out.println(sb);

    }
}
