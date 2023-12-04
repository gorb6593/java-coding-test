package org.example.bacjoon;

import java.util.Scanner;

//티스토리 연동해야함
public class _10988 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String str = sc.next();
    sc.close();

    int len = str.length();
    int answer = 1;

    for(int i=0; i<len/2; i++){
      if(str.charAt(i) != str.charAt(len-1-i)){
        answer = 0;
        break;
      }
    }
    System.out.println(answer);
  }
}
