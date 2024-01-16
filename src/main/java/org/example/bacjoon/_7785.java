package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _7785 {
    public static void main(String[] args) throws IOException {
        /*
       4
Baha enter
Askar enter
Baha leave
Artem enter
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //첫 번째 줄 가져오기
        st = new StringTokenizer(br.readLine());

        //첫 번째 줄의 첫 번째 값 저장
        int count = Integer.parseInt(st.nextToken());

        String key = "";
        String value = "";
        HashMap<String, String> map = new HashMap<>();


        for (int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            //같은 줄의 첫 번째 값은 key에 저장
            key = st.nextToken();
            //같은 줄의 두 번째 값은 value에 저장
            value = st.nextToken();

            //이미 키 값이 존재한다면 퇴근
            if(map.containsKey(key)){
                //System.out.println("key :: 같다 !! " + key);
                map.remove(key);
            } else {
                //키가 없으면 출근
                //System.out.println("key,value :: 다르다 !! " + key + "," + value);
                map.put(key, value);
            }
        }
        //System.out.println("map.keySet() = " + map.keySet());
        //알파벳 순서로 저장하기 위해 리스트에 정렬
        ArrayList<String> arrayList = new ArrayList<String>(map.keySet());
        //알파벳 역순 정렬(오름차순)
        arrayList.sort(Collections.reverseOrder());
        for (String val : arrayList) {
            System.out.println(val);
        }

    }
}
