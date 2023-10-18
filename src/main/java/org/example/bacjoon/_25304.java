package org.example.bacjoon;

import java.util.Scanner;

public class _25304 {
  public static void main(String[] args) {
    //https://harrystroy.tistory.com/18
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = 0;

    for(int i=0; i<b; i++){
      int d = sc.nextInt();
      int e = sc.nextInt();
      c = c + (d*e);
    }

    if(c == a){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }


  }
}
