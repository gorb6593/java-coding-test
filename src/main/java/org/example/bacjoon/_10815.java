package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _10815 {
  public static void main(String[] args) throws IOException {
        /*
        5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10
         */

    //입력 받기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    //첫 번째 라인 만큼 반복
    int count = Integer.parseInt(br.readLine());

    //해시맵에 저장
    HashMap<String, Integer> map = new HashMap<>();

    st = new StringTokenizer(br.readLine());

    for (int i=0; i<count; i++) {
      map.put(st.nextToken(), 0);
    }

    int count2 = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());

    for (int i=0; i<count2; i++) {
      if(map.get(st.nextToken()) != null) {
        sb.append("1 ");
      } else {
        sb.append("0 ");
      }
    }
    System.out.println(sb);


  }
}

