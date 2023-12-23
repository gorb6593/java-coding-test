package org.example.bacjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _2798 {
  public static void main(String[] args) {
        /*
        10 500
        93 181 245 214 315 36 185 138 216 295
         */
    //입력 받아오기
    Scanner sc = new Scanner(System.in);

    //첫 번째 크기
    int cardSum = sc.nextInt();

    //두 번째 크기
    int target = sc.nextInt();

    //정답
    int answer = 0;
    int testCount = 0;
    int tmp = 0;

    int[] cards = new int[cardSum];
    for (int i=0; i<cards.length; i++) {
      cards[i] = sc.nextInt();
    }

    for (int a=0; a<cards.length; a++) {
      for (int b=a+1; b<cards.length; b++) {
        for (int c=b+1; c<cards.length; c++) {

          //갯수 테스트
          //testCount++;
          tmp = cards[a] + cards[b] + cards[c];
          if(tmp == target) {
            answer = tmp;
            //System.out.println(tmp);
            break;
          }

          if((tmp <= target) && (tmp >= answer)) {
            answer = tmp;
          }


        }
      }
    }
    //System.out.println("testCount ::" + testCount);
    System.out.println(answer);


  }
}

