package org.example.bacjoon;

import java.util.Scanner;

//티스토리 연동해야함
public class _2908 {
  public static void main(String[] args) {
    //stringbuilder 사용해서 문제풀기

    Scanner in = new Scanner(System.in);

    int A = in.nextInt();
    int B = in.nextInt();

    A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
    B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

    System.out.print(A > B ? A : B);
  }
}
