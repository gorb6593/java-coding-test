import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int Q = 25;
        int D = 10;
        int N = 5;
        int P = 1;
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            System.out.print(temp / Q + " ");
            temp = temp % Q;
            System.out.print(temp / D + " ");
            temp = temp % D;
            System.out.print(temp / N + " ");
            temp = temp % N;
            System.out.println(temp / P);
        }
    }
}

