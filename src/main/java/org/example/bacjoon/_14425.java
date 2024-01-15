package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _14425 {
    public static void main(String[] args) throws IOException {

        //입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //첫 번째 줄 가져오기
        st = new StringTokenizer(br.readLine());

        //첫 번째 줄의 첫 번째 값 저장
        int val1 = Integer.parseInt(st.nextToken());
        //첫 번째 줄의 두 번째 값 저장
        int val2 = Integer.parseInt(st.nextToken());
        //System.out.println("val1 = " + val1);
        //System.out.println("val2 = " + val2);

        //해쉬 맵 생성
        HashMap<String, Integer> map = new HashMap<>();

        for (int i=0; i<val1; i++) {
            st = new StringTokenizer(br.readLine());
            //맵의 키에 문자열 저장, 밸류는 크게 의미 없으므로 아무값이나(0) 저장
            map.put(st.nextToken(), 0);
            //System.out.println("st :: " + st.nextToken());
        }
        int answer = 0;
        for (int i=0; i<val2; i++) {
            st = new StringTokenizer(br.readLine());
            if(map.get(st.nextToken()) != null) {
                answer++;
            }
        }
        System.out.println(answer);

    }
}
