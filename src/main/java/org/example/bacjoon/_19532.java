package org.example.bacjoon;

import java.util.Scanner;

public class _19532 {
  public static void main(String[] args) {
        /*
        2 5 8 3 -4 -11
        0 1 2 2 1 4
         */
    Scanner sc = new Scanner(System.in);

    int[] arr1 = new int[3];
    int[] arr2 = new int[3];
    int[] arr3 = new int[3];
    int lcm = 0;
    int multiple1 = 0;
    int multiple2 = 0;
    int valueX = 0;
    int valueY = 0;

    //첫 번째 2차 방정식 배열로 저장
    for (int i=0; i<3; i++) {
      arr1[i] = sc.nextInt();
    }
    //두 번째 2차 방정식 배열로 저장
    for (int i=0; i<3; i++) {
      arr2[i] = sc.nextInt();
    }

    //x최소 공배수 가져오기
    if (arr1[0] == 0) {
      //첫 번째 x값이 0이면
      valueY = arr1[1] / arr2[2];
      //여기할 차례
    }else{
      lcm = getLcm(arr1[0] , arr2[0]);
    }

    System.out.println(lcm);
    //x가 0일때

    //곱해야 하는 수 계산
    //multiple1 = lcm / arr1[0];
    //multiple2 = lcm / arr2[0];

    //System.out.println("prev_arr1 ::"+Arrays.toString(arr1));
    //System.out.println("prev_arr2 ::"+Arrays.toString(arr2));

    //1,2번째 방정식에 첫 번째 변수로 맞춰주기
    for (int i=0; i<3; i++) {
      arr1[i] = arr1[i] * multiple1;
      arr2[i] = arr2[i] * multiple2;
    }
    //System.out.println("after_arr1 ::"+Arrays.toString(arr1));
    //System.out.println("after_arr2 ::"+Arrays.toString(arr2));

    //x값 제거한 값들 배열로 저장
    for (int i=0; i<3; i++) {
      arr3[i] = arr1[i] - arr2[i];
    }
    //System.out.println("arr3 ::"+Arrays.toString(arr3));

    //y값 구하기
    //valueY = arr3[2] / arr3[1];

    //System.out.println("x = " + (arr1[2] - (arr1[1] * valueY) ));
    //x값 구하기
    //valueX = (arr1[2] - (arr1[1] * valueY) ) / arr1[0];

    //System.out.println("x 값 :: "+valueX + ", y 값 :: "+valueY);
    System.out.println(valueX + " " + valueY);


  }

  public static int getLcm(int a, int b) {
    return a * b / getGcd(a, b);
  }

  public static int getGcd(int a, int b) {
    if (a % b == 0) {
      return b;
    }
    return getGcd(b, a%b);
  }
}