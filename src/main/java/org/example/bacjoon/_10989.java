package org.example.bacjoon;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10989 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int count = Integer.parseInt(br.readLine());
    int arr[] = new int[count];

    for(int i=0; i<count; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    br.close();
    Arrays.sort(arr);

    for(int i : arr) {
      sb.append(i).append('\n');
    }

    System.out.println(sb);
  }
}

