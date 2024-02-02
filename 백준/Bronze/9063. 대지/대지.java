import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(token.nextToken());
            b[i] = Integer.parseInt(token.nextToken());
        }


        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println((a[n - 1] - a[0]) * (b[n - 1] - b[0]));
    }
}
