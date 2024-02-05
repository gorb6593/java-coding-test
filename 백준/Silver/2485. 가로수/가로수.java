import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int gcd = 0;
        //각 거리와 그 다음거리의 최소공배수를 계속 구함 => 그래야 모든 간격이 같은 점을 알 수 있음
        for (int i = 0; i < a - 1; i++) {
            int distance = arr[i + 1] - arr[i];
            gcd = getGCD(distance, gcd);
        }

        //System.out.println("arr[a-1] = " + arr[a-1]);
        //System.out.println("arr[0] = " + arr[0]);
        //System.out.println("gcd = " + gcd);
        //System.out.println("arr.length = " + arr.length);
        //끝점에서 시작점은 빼면 길이가 나오고 최소 공배수 만큼 쌓여있다.
        //전체길이에서 최소 공배수를 나누고 1을 더한다 시작점과 끝점도 심어야 하므로
        //그리고 이미 심겨져있던 전체길이 만큼 뺸다
        System.out.println((arr[a - 1] - arr[0]) / gcd + 1 - (arr.length));


    }

    public static int getGCD(int num1, int num2) {

        if (num2 == 0) {
            return num1;
        } else {
            return getGCD(num2, num1 % num2);
        }
    }
}