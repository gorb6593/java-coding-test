package org.example.bacjoon;

import java.util.Scanner;

//https://harrystroy.tistory.com/manage/posts/
public class _25314 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();

    String answer = "";
    for(int i=0; i<Math.ceil(a/4); i++){
       answer += "long ";
    }
    answer = answer + "int";
    System.out.println(answer);
  }
}
