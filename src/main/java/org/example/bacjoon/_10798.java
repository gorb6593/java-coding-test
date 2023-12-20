package org.example.bacjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10798 {
  public static void main(String[] args) throws IOException {

    /*
      ABCDE
      abcde
      01234
      FGHIJ
      fghij

      AABCDD
      afzz
      09121
      a8EWg6
      P5h3kx
     */
    //입력 받아오기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    //2차원 배열 생성
    String[][] arr = new String[5][15];
    String tmpValue = "";
    String[] tmpArr;
    String answer = "";
    //System.out.println(Arrays.deepToString(arr));

    //총 다섯줄의 입력이 주어지고, 각 줄에는 1~15글자들인 연속으로 주어진다
    for (int i = 0; i < 5; i++) {

      //한 행씩 토큰화 한다. => 문자열을 분리한다(줄 바꿈 기준으로)
      st = new StringTokenizer(br.readLine());

      //값을 받아서 한 줄씩 값에 담음
      tmpValue = st.nextToken();

      //받은 값을 한 칸씩 띄움
      tmpArr = tmpValue.split("");
      for (int j = 0; j < 15; j++) {

        if(j > tmpArr.length-1) {
          //최대길이 보다 크면 null넣음
          arr[i][j] = null;
        } else {
          //값이 있으면 그 값 넣음
          arr[i][j] = tmpArr[j];
        }
      }
    }

    for ( int i = 0; i < 15; i++) {
      for ( int j = 0; j < 5; j++ ) {
        if(arr[j][i] != null) {
          answer += arr[j][i];
        }
        //System.out.println(arr[j][i]);
      }
    }

    System.out.println(answer);
    //System.out.println(Arrays.deepToString(arr));
  }
}