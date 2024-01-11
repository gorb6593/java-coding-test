package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _10814 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int length = Integer.parseInt(br.readLine());
    String[][] arr = new String[length][2];
    for(int i = 0; i < length; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      arr[i][0] = st.nextToken();	// 나이
      arr[i][1] = st.nextToken();	// 이름
    }

    Arrays.sort(arr, new Comparator<String[]>() {
      // 나이순으로 정렬
      @Override
      public int compare(String[] s1, String[] s2) {
        return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
      }

    });

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < length; i++) {
      sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
    }

    System.out.println(sb);

  }
}
