package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10813 {
    public static void main(String[] args) throws IOException {

        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //첫 번째 줄에서 차례대로 값 a,b에 저장
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int tmp;
        //배열 생성(a의 크기만큼)
        int arr[] = new int[a];

        //a의 크기 만큼 1부터 숫자 넣기
        for (int i = 0; i < a; i++) {
            arr[i] = (i + 1);
        }

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            System.out.print("c = " + c);
            System.out.println(",d = " + d);

            //바뀌어야 하는 첫 번째 숫자를 임시로 저장
            tmp = arr[c - 1];
            //그리고 그 자리에 바뀔 숫자를 넣음
            arr[c - 1] = arr[d - 1];
            //그리고 임시로 저장한 숫자를 두 번째로 바뀌어야 하는 자리에 넣음
            arr[d - 1] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
