package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11651 {
  public static void main(String[] args) throws IOException {

    /*
5
0 4
1 2
1 -1
2 2
3 3
     */
    //입력받기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    //스프링빌러 생성
    StringBuilder sb = new StringBuilder();

    //첫 번째 라인 만큼 반복
    int count = Integer.parseInt(br.readLine());
    //2차원 배열 생성
    int[][] arr = new int[count][2];

    //2차원 배열에 값 넣기
    for (int i=0; i<count; i++) {
      //토큰화하기(값 가져오기)
      st = new StringTokenizer(br.readLine());

      //차례대로 값 인트형으로 넣기
      arr[i][1] = Integer.parseInt(st.nextToken());
      arr[i][0] = Integer.parseInt(st.nextToken());
    }
    //System.out.println("arr = " + Arrays.deepToString(arr));
    //넣은 값들은 첫 번째 크기 만큼
    Arrays.sort(arr, (val1, val2) -> {
      //System.out.println("val1 = " + val1);
      //System.out.println("val2 = " + val2);

      //첫 번째가 같으면
      if(val1[0] == val2[0])  {
        //내림차순
        return val1[1] - val2[1];
      }
      else {
        //오름차순
        return val1[0] - val2[0];
      }
    });

    //출력
    for (int i=0 ; i<count ; i++) {
      //출력 형식 맞춰서 sb에 담기
      sb.append(arr[i][1] + " " + arr[i][0]).append('\n');
    }
    //값 출력
    System.out.println(sb);
  }
}
