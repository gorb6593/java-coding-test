package org.example.bacjoon;

import java.util.Scanner;

public class _2480 {
  public static void main(String[] args) {
    //https://harrystroy.tistory.com/17
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int money = 0;
    int answer = 0;
    int check_same = 0;
    if(a == b && a == c && b == c){
       money = 10000;
       answer = money + a*1000;
    }else if(a != b && a != c && b != c){
      if(a>b && a>c){
        answer = a*100;
      }else if(b>a && b>c){
        answer = b*100;
      }else if(c>a && c>b){
        answer = c*100;
      }
    }else{
      if(a>=b && a>=c){
        if(a == b){
          check_same = a;
        }else{
          check_same = c;
        }
      }else if(b>=a && b>=c){
        if(b == a){
          check_same = b;
        }else{
          check_same = c;
        }
      }else if(c>=a && c>=b){
        if(c == b){
          check_same = c;
        }else{
          check_same = a;
        }
      }
      money = 1000;
      answer = money+(check_same*100);
    }
    System.out.println(answer);
  }
}
