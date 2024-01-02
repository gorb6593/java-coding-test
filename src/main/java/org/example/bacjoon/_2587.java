package org.example.bacjoon;

import java.util.Scanner;
import java.util.Arrays;
public class _2587 {
  public static void main(String[] args) {
        /*
        10
40
30
60
30
         */
    Scanner sc = new Scanner(System.in);
    int answer = 0;
    int sum = 0;
    int[] arr = new int[5];
    for (int i=0; i<5; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    for (int i=0; i<5; i++){
      sum += arr[i];
      if(i == 2) {
        answer = arr[i];
      }
    }
    System.out.println(sum/5);
    System.out.println(answer);

  }
}
