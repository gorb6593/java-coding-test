import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        ArrayList<Integer> answer = new ArrayList<>();

        int sum = 0;
        int count = 0;

        //입력받은 숫자순서대로
        for (int i = a; i < b + 1; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 0 && i != 1) {
                answer.add(i);
            }

            count = 0;
        }

        for(int num : answer) {
            sum += num;
        }

        if(sum ==0) {
            System.out.println(-1);

        }else {
            System.out.println(sum);
            System.out.println(answer.get(0));
        }
    }
}


