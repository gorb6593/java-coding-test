package org.example.level1;

import java.util.Scanner;

public class first_test001_0001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        System.out.println(cNum);
        int sum = 0;
        for ( int i = 0; i < sNum.length(); i++ ) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}

