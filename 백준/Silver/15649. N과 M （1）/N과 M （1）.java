import java.io.*;
import java.util.*;

public class Main {

    public static int visit_value;
    public static int size;
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //입력 받은 값 하나씩 받아오기
        visit_value = Integer.parseInt(st.nextToken());
        size = Integer.parseInt(st.nextToken());

        ////모든 곳에서 사용가능 정적변수로 선언
        //한 줄에 받을 값
        arr = new int[size];
        //뎁스
        visit = new boolean[visit_value];

        //백트레킹 시작 -> 모든 경우의 수를 찾지만, 가능성이 있는 경우의 수만 찾는다!
        /*
            브루트포스 -> 모든 경우의 수를 다 찾는다
            백트레킹 -> 브루트포스 + 가능성있는 것만
            dfs(깊이 우선 탐색) -> 트리순회의 형태로 백트래킹에 사용되는 대표적인 탐색 알고리즘
         */

        //백트레킹 시작
        dfs(0);

        //정답 출력
        System.out.println(sb);

    }

    public static void dfs(int depth) {

        // 재귀 깊이가 M(마지막 탐색지점)과 같아지면 한줄씩 출력
        if (depth == size) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < visit_value; i++) {
            //탐색한 지점 찾기
            if (!visit[i]) {
                //처음 방분시 0번째는 들어오고 두번째 방문시 0번째는 올 필요가 없다
                visit[i] = true;
                //System.out.println("depth = " + depth);
                //System.out.println("(i+1) = " + (i+1));
                arr[depth] = i + 1;
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}
