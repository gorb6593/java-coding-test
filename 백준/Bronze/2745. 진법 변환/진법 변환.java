import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int value = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int result = 0;

        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (c - 55) * tmp;
            } else {
                result += (c - 48) * tmp;
            }
            tmp *= value;
        }
        System.out.println(result);
    }
}


