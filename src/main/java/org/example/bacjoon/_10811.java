package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10811 {
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //첫 번째 줄에서 차례대로 값 a,b에 저장
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int tmp;
        int left;
        int right;
        //배열 생성(a의 크기만큼)
        int arr[] = new int[a];

        //a의 크기 만큼 1부터 숫자 넣기
        for (int i = 0; i < a; i++) {
            arr[i] = (i + 1);
        }

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            left = Integer.parseInt(st.nextToken()) - 1;
            right = Integer.parseInt(st.nextToken()) - 1;
            //System.out.println("Arrays.toString(arr) start!!= " + Arrays.toString(arr));
            //역순으로 만들기 왼쪽 숫자부터 오른쪽 숫자까지 변경하기
            while (left < right) {
                //오른쪽에 있는 것을 왼쪽으로 이동해야 함(역순 으로 만드니까)
                //왼쪽것을 임시보관
                tmp = arr[left];
                //오른쪽에 있는 숫자를 왼쪽에 넣고 +1 시키기
                arr[left++] = arr[right];
                //임시보관했던 것을 오른쪽으로 이동하고 -1 시키기
                arr[right--] = tmp;
                //System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
