package org.example.bacjoon;

import java.util.Scanner;

public class _2444 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i=1; i<=n; i++) {
      for (int j=0; j<n-i; j++) {
        //해당 줄이 n보다 작으면 띄우기
        System.out.print(" ");
      }
      for(int j=0; j<i; j++) {
        //해당 줄의 중간 포함 왼쪽부분
        System.out.print("*");
      }
      for(int j=0; j<i-1; j++) {
        //해당 줄의 중간 불포함 오른쪽부분
        System.out.print("*");
      }
      //끝나면 줄바꿈
      System.out.println();
    }

    for(int i=1; i<n; i++) {
      for (int j=0; j<i; j++) {
        System.out.print(" ");
      }
      for(int j=0; j<n-i; j++) {
        System.out.print("*");
      }
      for(int j=0; j<n-i-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }


}
