package org.example.bacjoon;

import java.util.Scanner;

public class _2525 {
  public static void main(String[] args) {
    //https://harrystroy.tistory.com/16
    Scanner in = new Scanner(System.in);

    int A = in.nextInt();
    int B = in.nextInt();
    int C = in.nextInt();

    int min = 60 * A + B;
    min += C;

    int hour = (min / 60) % 24;
    int minute = min % 60;

    System.out.println(hour + " " + minute);
  }
}
