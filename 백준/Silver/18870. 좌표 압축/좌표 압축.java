import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int max = Integer.parseInt(br.readLine());
        int temp;
        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[max];
        int[] arr2 = new int[max];
        for (int i = 0; i < max; i++) {
            temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            arr2[i] = temp;
        }
        Arrays.sort(arr2);

        int count = 0;
        
        for (int i : arr2) {
            //같은 값이 아니면 추가하기 .. ( 나는 큰 수만 넣어야 한다고 착각했다..)
            if(!map.containsKey(i)) {
                map.put(i, count);
                count++;
            }
        }
//        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
//            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
//        }
        for (int j : arr) {
            if(map.containsKey(j)) {
                sb.append(map.get(j)).append(" ");
            }
        }

        System.out.println(sb);
    }
}