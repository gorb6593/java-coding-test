package org.example.programmers;

public class Solution_12935 {
  
  public int[] solution(int[] arr) {
    //int[] answer = {};
    if(arr.length == 1){
      int[] answer = {-1};
      return answer;
    }
    int[] answer = new int[arr.length-1];
    return answer;
  }

  public static void main(String[] args) {
    int test_arr[] = {1,2};
    Solution_12935 s = new Solution_12935();
  }



}
