import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] arr_1 = new int[3];
//        HashMap<Integer, Integer> map = new HashMap<>();
//        HashMap<Integer, Integer> map2 = new HashMap<>();
        int[] arr_2 = new int[3];
        int a = 0;
        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                a = Integer.parseInt(st.nextToken());
                if (j == 0) arr_1[i] = a;
                if (j == 1) arr_2[i] = a;
//                if(j == 0) {
//                    if(map.containsKey(a)) {
//                        map.put(a, 2);
//                    } else {
//                        map.put(a, 1);
//                    }
//                }
//                if(j == 1) {
//                    if(map2.containsKey(a)) {
//                        map2.put(a, 2);
//                    } else {
//                        map2.put(a, 1);
//                    }
//                }
            }
        }
        int answer = 0;
        int answer2 = 0;

//        if(map.get(0) % 2 == 0) {
//            answer = map.get(1);
//        } else {
//            answer = map.get(2);
//        }
//
//        if(map2.get(0) % 2 == 0) {
//            answer2 = map2.get(1);
//        } else {
//            answer2 = map2.get(2);
//        }

        if (arr_1[0] == arr_1[1]) {
            answer = arr_1[2];
        } else if (arr_1[0] == arr_1[2]) {
            answer = arr_1[1];
        } else {
            answer = arr_1[0];
        }
        if (arr_2[0] == arr_2[1]) {
            answer2 = arr_2[2];
        } else if (arr_2[0] == arr_2[2]) {
            answer2 = arr_2[1];
        } else {
            answer2 = arr_2[0];
        }
        System.out.println(answer + " " + answer2);
    }
}
