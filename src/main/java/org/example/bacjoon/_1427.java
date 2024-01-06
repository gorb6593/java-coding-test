package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class _1427 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] strArr = str.split("");
    int[] arr = new int[strArr.length];

    for (int i=0; i<strArr.length; i++) {
      arr[i] = Integer.parseInt(strArr[i]);
    }

    Arrays.sort(arr);
    //System.out.println(Arrays.toString(arr));

    for (int i=strArr.length -1; i>=0; i--) {
      System.out.print(arr[i]);
    }
  }
}
