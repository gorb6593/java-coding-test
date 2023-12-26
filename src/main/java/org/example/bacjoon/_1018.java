package org.example.bacjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _1018 {
  public static void main(String[] args) {
/*
10 13
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
WWWWWWWWWWBWB
WWWWWWWWWWBWB
 */
    //입력값 받기
    Scanner sc = new Scanner(System.in);

    int row = sc.nextInt();
    int col = sc.nextInt();
    sc.nextLine();

    String[] board = new String[row];
    System.out.println("row::"+row);
    System.out.println("col::"+col);

    for(int i=0; i<row; i++) {
      board[i] = sc.nextLine();
    }
    System.out.println(Arrays.toString(board));


  }
}
