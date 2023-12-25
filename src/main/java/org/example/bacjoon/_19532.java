package org.example.bacjoon;

import java.util.Scanner;

public class _19532 {
  public static void main(String[] args) {
        /*
        2 5 8 3 -4 -11
        0 1 2 2 1 4
         */
    //입력받기
    Scanner sc = new Scanner(System.in);
    int a,b,c,d,e,f;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    f=sc.nextInt();
    for (int i = -999; i < 1000; i++) {
      for (int j = -999; j < 1000; j++) {


        if(a*i+b*j==c && d*i+e*j==f) {
          System.out.println(i+" "+j);
        }
      }
    }

  }

//  public static int getLcm(int a, int b) {
//    return a * b / getGcd(a, b);
//  }
//
//  public static int getGcd(int a, int b) {
//    if (a % b == 0) {
//      return b;
//    }
//    return getGcd(b, a%b);
//  }
}