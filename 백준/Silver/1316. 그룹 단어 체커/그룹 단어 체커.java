import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        String temp = "";
        String[] arr;
        int count = 0;
        int answer = 0;
        String tempValue = "";
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            temp = st.nextToken();
            arr = temp.split("");
            for (int j = 0; j < arr.length; j++) {
                if (j == 0 ) {
                    map.put(arr[0], 1);
                    tempValue = arr[0];
                }

                //System.out.println("tempValue = " + tempValue);
                //System.out.println("arr[j] = " + arr[j]);
                if (tempValue.equals(arr[j])) {
                    tempValue = arr[j];
                } else {
                    if (map.containsKey(arr[j])) {
                        //System.out.println("값은 다른데 키에 있음!!");
                        count++;
                        break;
                    } else {
                        //System.out.println("값은 다른데 키에 없음!!");
                        tempValue = arr[j];
                    }
                }
                map.put(arr[j], 1);
            }
            tempValue = "";
            map.clear();
            if(count == 0) {
                answer++;
            }
            count = 0;
        }
        System.out.println(answer);

    }
}
