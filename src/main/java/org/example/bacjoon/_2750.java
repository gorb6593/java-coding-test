package org.example.bacjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _2750 {
  public static void main(String[] args) {
        /*
        5
5
2
3
4
1
         */
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();

    int[] arr = new int[count];
    //
    //System.out.println(Arrays.toString(arr));
    for (int i=0; i<count; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    Arrays.sort(arr);
    //System.out.println(Arrays.toString(arr));
    for (int i=0; i<count; i++) {
      System.out.println(arr[i]);
    }


  }
}
