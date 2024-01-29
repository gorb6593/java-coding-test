import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String f = "factor\n";
        String m = "multiple\n";
        String n = "neither\n";
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) break;
            if (b % a == 0) {
                sb.append(f);
            } else if (a % b == 0) {
                sb.append(m);
            } else {
                sb.append(n);
            }
        }
        System.out.print(sb);
    }
}


