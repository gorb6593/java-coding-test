import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //잘 모라서 구글링으로 했다.. 다시 풀어보기..
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            int count = 0;
            int[] arr = new int[a + 1];
            arr[0] = arr[1] = 1;

            //소수 구하기
            for (int j = 2; j * j <= a; j++) {
                for (int k = j + j; k <= a; k += j) {
                    //System.out.println("k = " + k);
                    arr[k] = 1;
                }
            }
            //System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
            for (int j = 2; j <= a / 2; j++) {   
                if (arr[j] == 0 && arr[a - j] == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}