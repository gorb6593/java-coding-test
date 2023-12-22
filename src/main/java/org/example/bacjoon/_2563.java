package org.example.bacjoon;

import java.util.Scanner;

public class _2563 {
  public static void main(String[] args) {
    /*
        3
        3 7
        15 7
        5 2
         */
    Scanner sc = new Scanner(System.in);

    //반복할 횟수
    int count = sc.nextInt();
    int answer = 0;
    // 행(100) 열(100) 크기의 배열 생성
    int[][] arr = new int[100][100];

    for ( int i=0; i<count; i++) {
      int length = sc.nextInt();
      int height = sc.nextInt();

      //가로세로 체크
      //System.out.println("length :: " + length  + "," + (length+10));
      //System.out.println("height :: " + height  + "," + (height+10));
      for (int j=length; j<(length+10); j++) {
        for (int k=height; k<(height+10); k++) {
          arr[j][k] = 1;

          //갯수 체크
          //answer++;
        }
      }
    }
    //이중 배열 출력
    //System.out.println(Arrays.deepToString(arr)+"::arr");

    for(int i=0; i<100; i++) {
      for(int j=0; j<100; j++) {
        if(arr[i][j] == 1) answer++;
      }
    }
    System.out.println(answer);
    
  }
}
