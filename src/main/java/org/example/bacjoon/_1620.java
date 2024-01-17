package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _1620 {
    public static void main(String[] args) throws IOException {

        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //첫 번째 줄 가져오기
        st = new StringTokenizer(br.readLine());

        //첫 번째 줄의 첫 번째 값 저장
        int count = Integer.parseInt(st.nextToken());

        //첫 번째 줄의 두 번째 값 저장
        int count2 = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        String tmp = "";
        for (int i=1; i<=count; i++) {
            st = new StringTokenizer(br.readLine());
            tmp = st.nextToken();
            map.put(i,tmp);
            map2.put(tmp,i);
        }
//        for(Integer key : map.keySet()) {
//            String value = map.get(key);
//            System.out.println(key + " : " + value);
//        }
//        for(String key : map2.keySet()) {
//            Integer value = map2.get(key);
//            System.out.println(key + " : " + value);
//        }

        String tmp2 = "";
        for (int i=1; i<=count2; i++) {
            st = new StringTokenizer(br.readLine());
            tmp2 = st.nextToken();
            //System.out.println("tmp2 = " + tmp2);
            if(tmp2.matches("^[a-zA-Z]*$")) {
//                for(Integer key : map.keySet()) {
//                    if (map.get(key).equals(tmp)) {
//                        //System.out.println("key = " + key);
//                        System.out.println(key);
//                        break;
//                    }
//                }
                System.out.println(map2.get(tmp2));
            } else {
                //System.out.println("map.get(st) = " + map.get(Integer.parseInt(tmp)));
                System.out.println(map.get(Integer.parseInt(tmp2)));
            }
        }
    }
}
