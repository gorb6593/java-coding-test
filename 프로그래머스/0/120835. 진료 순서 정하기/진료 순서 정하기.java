import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int[] temp = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
          temp[i] = arr[i];
        }
        Arrays.sort(arr);
        int[] reverseArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
          reverseArr[j] = arr[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<reverseArr.length; i++) {
          map.put(reverseArr[i], i+1);
        }
        
        for (int i=arr.length-1; i>=0; i--) {
          answer[i] = map.get(temp[i]);
        }
        return answer;
    }
}