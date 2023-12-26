package org.example.bacjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _1018 {

  public static int getSolusion(int startRow, int startCol, String[] board) {
    String[] orBoard = {"WBWBWBWB", "BWBWBWBW"};
    int whiteSol = 0;
    for (int i=0; i<8; i++) {
      int row = startRow + i;
      for (int j=0; j<8; j++) {
        int col = startCol + j;
        if (board[row].charAt(col) != orBoard[row % 2].charAt(j)) {
          whiteSol++;
        }
      }
    }
    return Math.min(whiteSol, 64 - whiteSol);
  }
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


    for(int i=0; i<row; i++) {
      board[i] = sc.nextLine();
    }
    //테스트
    //System.out.println("row::"+row);
    //System.out.println("col::"+col);
    //System.out.println(Arrays.toString(board));

    //체스판 자르기
    int sol = Integer.MAX_VALUE;

    for (int i=0; i < row-8; i++) {
      for (int j=0; j < col -8; j++) {
        int curSol = getSolusion(i,j,board);

        if(sol > curSol) {
          sol = curSol;
        }
      }
    }

    System.out.println(sol);
    sc.close();


  }
}
