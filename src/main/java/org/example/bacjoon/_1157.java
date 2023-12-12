package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157 {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine().toUpperCase();
    boolean flag = false;
    int maxValue = 0;
    int maxIndex = 0;

    int[] Arr = new int[26];
    for (int i = 0; i < str.length(); i++) {
      Arr[str.charAt(i) - 'A']++;
    }

    for (int i = 0; i < 26; i++) {
      int compare = Arr[i] - maxValue;
      if (compare > 0) {
        maxValue = Arr[i];
        flag = false;
        maxIndex = i;
      } else if (compare == 0) {
        flag = true;
      }
    }
    if (flag) {
      System.out.println("?");
    } else {
      System.out.println((char) (maxIndex + 'A'));
    }
  }

}
