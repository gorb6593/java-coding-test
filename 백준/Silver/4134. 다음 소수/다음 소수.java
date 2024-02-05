import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long temp;
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            temp = Long.parseLong(st.nextToken());

            while (true) {
                if (is_prime(temp)) {
                    sb.append(temp).append("\n");
                    break;
                } else {
                    temp++;
                }
            }
        }
        System.out.println(sb);


    }
    // 소수 판별 메소드
    public static boolean is_prime(long number) {

        // 0 과 1 은 소수가 아니다
        if(number < 2) {
            return false;
        }

        // 2 는 소수다
        if(number == 2) {
            return true;
        }

        for(int i = 2; i < Math.sqrt(number) +1 ; i++) {

            // 소수가 아닐경우
            if(number % i == 0) return false;
        }
        // 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
        return true;
    }
}