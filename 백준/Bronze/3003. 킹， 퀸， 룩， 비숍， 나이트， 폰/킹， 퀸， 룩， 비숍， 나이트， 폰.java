import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //첫 번째 줄에서 차례대로 값 a,b에 저장
        int a;
        //= Integer.parseInt(st.nextToken());

        int[] arr = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            int temp = Integer.parseInt(st.nextToken());
            //System.out.println("temp = " + temp);
            //System.out.println("arr[i] = " + arr[i]);
            if (i == 5) {
                System.out.print((arr[i] - temp));
            } else {
                System.out.print((arr[i] - temp) + " ");
            }

        }

    }
}