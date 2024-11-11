import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int n, m;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        //입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //받아온 값 변수에 저장
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        //1부터 n까지 찾아야 하므로 1부터 출발
        dfs(1, 0);

        //스트링빌러 출력(정답 출력)
        System.out.println(sb);
    }

    private static void dfs(int start, int depth) {

        //깊이가 m이랑 같으면 출력
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        //시작점부터 탐색
        for (int i = start; i <= n; i++) {

            //현재 깊이를 index로 그 값을 넣음
            arr[depth] = i;

            /**
             * 현재 값보다 1 증가시켜 다음 재귀 함수를 호출하게하고
             * 깊이도 1증가시켜 재귀호출한다.
             */
            dfs(i + 1, depth + 1);
        }
    }
}
