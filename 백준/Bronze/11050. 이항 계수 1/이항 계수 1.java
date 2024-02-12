import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        //아직까지 이항계수가 실무에서 쓰인적이 없다..
        //그래서 이항계수라는 공식이 있다는 것만 알고 넘어갔다!
        //n! / ((n-k)! * k!)
        System.out.println(factorial(a) / (factorial(a - b) * factorial(b)));
    }

    private static int factorial(int n) {
        if (n <= 1) return 1;

        return n * factorial(n - 1);
    }
}