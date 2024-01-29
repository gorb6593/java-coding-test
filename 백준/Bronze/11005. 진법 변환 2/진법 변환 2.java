import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        //대문자 65~90
        while (a != 0) {

            //나머지 값이 10보다 크면 55더해서 65로 만들어서 출력
            if (a % b >= 10) {
                //System.out.println("a%b + 55 = " + (char)(a%b + 55));
                sb.append((char) ((a % b) + 55));
            } else {
                sb.append(a % b);
            }
            a /= b;
        }
        //System.out.println(sb);
        System.out.println(sb.reverse());
    }
}

