package org.example.test3_2;

import java.util.*;

public class tset0002 {
  public static void main(String[] args){
    String my_string = "banana";
    String is_prefix = "ban";
    int temp_length = is_prefix.length();
    System.out.println("temp_length = " + temp_length);

    if (my_string.substring(0, temp_length).equals(is_prefix)) {
      System.out.println("temp_length = " + temp_length);
    } else {
      System.out.println("temp_length = " + temp_length);
    }


/*
Key : 3, Val : 1
Key : 24, Val : 3
Key : 76, Val : 2
*/
  }
}
