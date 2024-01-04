package org.example.bacjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _25305 {
  public static void main(String[] args) {
    /*
  5 2
100 76 85 93 98
   */
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();
    int cutLine = sc.nextInt();

    int[] arr = new int[count];

    for (int i=0; i<count; i++){
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    //System.out.println(Arrays.toString(arr));
    System.out.println(arr[arr.length - cutLine]);
  }


}
