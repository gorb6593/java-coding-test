package org.example.bacjoon;

import java.util.Scanner;

public class _10807 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] arr = new int[a];
    for(int i=0; i<a; i++){
      arr[i] = sc.nextInt();
    }

    int b = sc.nextInt();
    int count = 0;
    for(int j=0; j<a; j++){
      System.out.println(arr[j]);
      if(b == arr[j]){
        count++;
      }
    }
    System.out.println(count);



  }
}
