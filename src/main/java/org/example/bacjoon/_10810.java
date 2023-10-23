package org.example.bacjoon;


import java.util.Scanner;

public class _10810 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int[] arr = new int[a];
    int b = sc.nextInt();

    for(int i = 0; i < b; i++) {
      int c = sc.nextInt();
      int d = sc.nextInt();
      int f = sc.nextInt();

      for(int j=c-1; j<d; j++) {
        arr[j] = f;
      }
    }
    for(int f = 0; f < arr.length; f++) {
      System.out.print(arr[f] + " ");
    }
  }
}
