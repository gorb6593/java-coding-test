package org.example.level1;

public class divideString {
    public int solution(String s) {
        char first = s.charAt(0);
        int firstNum = 0;
        int diff = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (firstNum == diff) {
                result++;
                first = s.charAt(i);
            }
            if (s.charAt(i) == first) firstNum++;
            else diff++;
        }
        return result;
    }

    public static void main(String[] args) {
        divideString divideString = new divideString();
        System.out.println(divideString.solution("banana"));
        System.out.println(divideString.solution("abracadabra"));
        System.out.println(divideString.solution("aaabbaccccabba"));
    }
}
