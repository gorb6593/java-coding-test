package org.example.bacjoon;

import java.util.Scanner;

public class _1436 {
  public static void main(String[] args) {
    /*
     0< N < 10000 자연수
     */
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();

    int num = 666;
    int count = 1;

    while(count != a) {
      num++;
      //System.out.println("num ::" + num + ", count :: "+count);
      if(String.valueOf(num).contains("666")) {
        count++;
      }
    }
    System.out.println(num);
  }
}
