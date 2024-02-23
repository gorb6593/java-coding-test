import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
        }
        int temp = 0;
        for (int i : arr) {
            temp += i;
        }
        int answer1 = Math.round((float) temp /arr.length);

        Arrays.sort(arr);

        if((arr.length % 2) == 1){
            temp = (arr.length/2) + 1;
        } else {
            temp = (arr.length/2);
        }

        int answer2 = arr[temp-1];

        int count = 0;
        int max = -1;
        temp = arr[0];
        boolean check = false;

        for(int i = 0; i < n - 1; i++) {
            //순서대로 정렬했으니까 다음 값이랑 같으면 같은 수임
            //그리고 같으면 카운트 플러스
            if(arr[i] == arr[i + 1]) {
                count++;
            }else {
                count = 0;
            }

            //1.최고값이 현재값(count)보다 작으면 이제 그 값이 최고값 그리고 최빈값(temp)에도 그 값을 저장
            if(max < count) {
                max = count;
                temp = arr[i];
                check = true;
                //그리고 그 다음 값이 같은 값을 때 (max == count) 그리고 check가 true이면
                //(작은 수 부터 정렬되어있음) 두 번째로 작은 값을 여기서 거른다
                // 이 다음에 값이 오면 이제 그 다음 것이 두 번째로 작은 수다
            }else if(max == count && check) {
                temp = arr[i];
                check = false;
            }
        }
        int answer3 = temp;

        int answer4 = arr[arr.length-1] - arr[0];
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
        //System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        
    }
}