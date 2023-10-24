package org.example.bacjoon;

import java.util.Scanner;

public class _5597 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean student[] = new boolean[31];

    for(int i=0; i<28; i++) {
      student[sc.nextInt()] = true;
    }
    for(int i=1; i<student.length; i++) {
      if(!student[i])
        System.out.println(i);
    }
  }
}
