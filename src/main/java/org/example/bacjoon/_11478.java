package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _11478 {
  public static void main(String[] args) throws IOException {
    //입력받기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String value = br.readLine();
    //System.out.println("value.length() = " + value.length());
    Set<String> set = new HashSet<>();
    for (int i=0; i<value.length(); i++) {
      for (int j=i+1; j<=value.length(); j++) {
        set.add(value.substring(i, j));
      }
    }

    //System.out.println("set = " + set);
    System.out.println(set.size());




  }

}
