package org.example.bacjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _1018 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    String[][] arr = new String[a][b];
    System.out.println("a::"+a);
    System.out.println("b::"+b);

    for(int i=0; i<a; i++) {
      for(int j=0; j<b; j++) {
        System.out.println("sc.next::"+sc.next());
        //arr[i][j] = sc.next();
      }
    }
    System.out.println(Arrays.deepToString(arr));
  }
}
