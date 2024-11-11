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
        dfs(0);

        //스트링빌러 출력(정답 출력)
        System.out.println(sb);
    }

    private static void dfs(int depth) {
        //깊이가 m이랑 같으면 출력
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        //처음부터 끝까지(n까지)
        for (int i = 1; i <= n; i++) {
            arr[depth] = i;
            //depth + 1이였다가 해당 depth가 리턴되면 다시 원래 depth로 돌아옴!!..
            dfs(depth + 1);
        }
    }
}
