import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        while (true) {
            int sum = 0;
            int N = Integer.parseInt(br.readLine());
            if (N == -1) break;
            for (int i = 1; i <= (N / 2); i++) {
                if (N % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }
            if (sum == N) {
                sb.append(N).append(" = ");
                for(int i=0; i<list.size(); i++){
                    if(i == list.size() -1) {
                        sb.append(list.get(i));
                    } else {
                        sb.append(list.get(i)).append(" + ");
                    }
                }
                System.out.println(sb);
                sb.setLength(0);
                list.clear();
            } else {
                sb.setLength(0);
                list.clear();
                System.out.println(N + " is NOT perfect.");
            }


        }
    }
}

