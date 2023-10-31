package org.example.bacjoon;

import java.util.Scanner;
import java.util.StringTokenizer;
//https://harrystroy.tistory.com/22
public class _1152 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.nextLine();
    StringTokenizer st = new StringTokenizer(S," ");
    System.out.println(st.countTokens());
  }

}
