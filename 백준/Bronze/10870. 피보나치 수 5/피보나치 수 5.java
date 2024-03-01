import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(Fibonacci(n));
    }

    private static int Fibonacci(int n) {
        
        if(n <= 1) return n;
        
        return Fibonacci(n -1) + Fibonacci(n - 2);
    }
}