import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        int N = s.length();
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr;
        arr = s.toUpperCase().split("");
        for (int i = 0; i < N; i++) {
            //System.out.println("arr[i] = " + arr[i]);
            if (map.containsKey(arr[i])) {
                int value = map.get(arr[i]) + 1;
                map.put(arr[i], value);
            } else {
                map.put(arr[i], 1);
            }
        }
        //System.out.println("map = " + map);
        String maxKey = null;
        for (String key : map.keySet()) {
            if (maxKey == null || map.get(key) > map.get(maxKey)) {
                maxKey = key;
            }
        }
        //System.out.println("maxKey = " + maxKey);
        int answer = map.get(maxKey);
        String answerValue = maxKey;
        int answer2;
        map.remove(maxKey);
        //System.out.println("map = " + map);
        String maxKey2 = null;
        for (String key : map.keySet()) {
            if (maxKey2 == null || map.get(key) > map.get(maxKey2)) {
                maxKey2 = key;
            }
        }
        //System.out.println("answer2 = " + answer2);
        answer2 = map.getOrDefault(maxKey2, 0);

        if(answer == answer2) {
            System.out.println("?");
        } else {
            //System.out.println(answer);
            System.out.println(answerValue);
        }



    }
}
