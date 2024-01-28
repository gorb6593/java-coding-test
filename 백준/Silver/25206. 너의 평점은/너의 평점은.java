import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double sumScore = 0;
        double sumNum = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String obj = st.nextToken();
            double N = Double.parseDouble(st.nextToken());
            String str = st.nextToken();
            double score = 0;
            if (!str.equals("P")) {
                if (str.equals("A+")) {
                    score = 4.5;
                } else if (str.equals("A0")) {
                    score = 4.0;
                } else if (str.equals("B+")) {
                    score = 3.5;
                } else if (str.equals("B0")) {
                    score = 3.0;
                } else if (str.equals("C+")) {
                    score = 2.5;
                } else if (str.equals("C0")) {
                    score = 2.0;
                } else if (str.equals("D+")) {
                    score = 1.5;
                } else if (str.equals("D0")) {
                    score = 1.0;
                } else if (str.equals("F")) {
                    score = 0.0;
                } else {

                }
                sumScore += (N * score);
                sumNum += N;
            }

        }
        //System.out.println("sumNum = " + sumNum);
        //System.out.println("sumScore = " + sumScore);
        double answer = sumScore/sumNum;
        System.out.printf("%.6f", answer);
    }
}
