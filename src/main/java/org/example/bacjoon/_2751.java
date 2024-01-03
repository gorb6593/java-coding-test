package org.example.bacjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _2751 {
  public static void main(String[] args) {
    /*
    7
    8
5
4
3
2
1
6
     */
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int count = sc.nextInt();

    //int[] arr = new int[count];

    ArrayList<Integer> arr = new ArrayList<>();

    for (int i=0; i<count; i++) {
      arr.add(sc.nextInt());
    }

    //어레이 솔트 안됨 -> 타임아웃 걸림
    //Arrays.sort(arr);
    Collections.sort(arr);

    //System.out.println(arr);

//    for (Integer i : arr) {
//      System.out.println(i);
//    }
    for(int i : arr) {
      sb.append(i).append('\n');
    }
    System.out.println(sb);
  }
}
