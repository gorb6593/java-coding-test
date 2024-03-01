import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long answer = 1;
        if (n != 0) {
            for (int i = n; i > 0; i--) {
                answer *= i;
            }
        }

        System.out.println(answer);

    }
}