import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int min = 0;
        if ((c - a) >= (d - b)) {
            min = d - b;
        } else {
            min = c - a;
        }

        if (min <= a  && min <= b) {

        } else if (a<= min && a <= b) {
            min = a;
        } else {
            min = b;
        }
        System.out.println(min);
    }
}

