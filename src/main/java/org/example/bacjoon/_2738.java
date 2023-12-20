package org.example.bacjoon;

import java.util.Scanner;

public class _2738 {
  public static void main(String[] args) {

    /*
      3 3

      1 1 1
      2 2 2
      0 1 0
      3 3 3
      4 4 4
      5 5 100
     */
    //입력 받아오기
    Scanner sc = new Scanner(System.in);

    //첫 번째 크기
    int first = sc.nextInt();

    //두 번째 크기
    int second = sc.nextInt();

    //첫 번째와 두 번째 크기의 배열 2개 생성
    int[][] arr1 = new int[first][second];
    int[][] arr2 = new int[first][second];

    //첫 번째 배열에 행 -> 렬 순서로 입력값을 넣음
    for (int i = 0; i < first; i++) {
      for (int j = 0; j < second; j++) {
        //입력 값(sc)의 숫자를 순서대로 넣음
        arr1[i][j] = sc.nextInt();
      }
    }
    //이중 배열 출력
    //System.out.println(Arrays.deepToString(arr1)+"::arr1");

    //두 번째 배열에 행 -> 렬 순서로 입력값을 넣음
    for (int i = 0; i < first; i++) {
      for (int j = 0; j < second; j++) {
        //입력 값(sc)의 그 다음 숫자부터 다시 두 번째 배열에 넣음
        arr2[i][j] = sc.nextInt();
      }
    }
    //이중 배열 출력
    //System.out.println(Arrays.deepToString(arr1)+"::arr2");

    for (int i = 0; i < first; i++) {
      for (int j = 0; j < second; j++) {
        //같은 행에 한 칸 씩 띄우고 출력
        System.out.print(arr1[i][j] + arr2[i][j] + " ");
        //행이 끝나면 줄 바꿈
        if(j == (second-1) ) System.out.println();
      }
    }

  }
}
