import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 오늘도 서준이는 동적 프로그래밍 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
 *
 * 오늘은 n의 피보나치 수를 재귀호출과 동적 프로그래밍으로 구하는 알고리즘을 배웠다.
 * 재귀호출에 비해 동적 프로그래밍이 얼마나 빠른지 확인해 보자.
 * 아래 의사 코드를 이용하여 n의 피보나치 수를 구할 경우 코드1 코드2 실행 횟수를 출력하자.
 *
 * 피보나치 수 재귀호출 의사 코드는 다음과 같다.
 *
 * fib(n) {
 *     if (n = 1 or n = 2)
 *     then return 1;  # 코드1
 *     else return (fib(n - 1) + fib(n - 2));
 * }
 * 피보나치 수 동적 프로그래밍 의사 코드는 다음과 같다.
 *
 * fibonacci(n) {
 *     f[1] <- f[2] <- 1;
 *     for i <- 3 to n
 *         f[i] <- f[i - 1] + f[i - 2];  # 코드2
 *     return f[n];
 * }
 * 입력
 * 첫째 줄에 n(5 ≤ n ≤ 40)이 주어진다.
 *
 * 출력
 * 코드1 코드2 실행 횟수를 한 줄에 출력한다.
 */

public class Main {

    static int code1Count = 0;

    public static void main(String[] args) throws IOException {

        //입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //재귀
        fib(n);

        //동적
        int code2Count = fibonacci(n);

        System.out.println(code1Count + " " + code2Count);

    }

    // 재귀 방식의 피보나치 함수
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            code1Count++; //코드1
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // 동적 프로그래밍 방식의 피보나치 함수
    public static int fibonacci(int n) {
        int[] arr = new int[n + 1];
        arr[1] = arr[2] = 1;

        int code2Count = 0;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            code2Count++; //코드2
        }

        return code2Count;
    }
}
