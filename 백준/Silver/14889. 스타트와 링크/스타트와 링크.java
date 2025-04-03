import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 축구를 하기 위해 모인 사람은 총 N명이고 신기하게도 N은 짝수이다.
 * 이제 N/2명으로 이루어진 스타트 팀과 링크 팀으로 사람들을 나눠야 한다.
 *
 * 사람에게 번호를 1부터 N까지로 배정했고, 아래와 같은 능력치를 조사했다.
 * 능력치 Sij는 i번 사람과 j번 사람이 같은 팀에 속했을 때, 팀에 더해지는 능력치이다.
 * 팀의 능력치는 팀에 속한 모든 쌍의 능력치 Sij의 합이다.
 * Sij는 Sji와 다를 수도 있으며,
 * i번 사람과 j번 사람이 같은 팀에 속했을 때, 팀에 더해지는 능력치는 Sij와 Sji이다.
 *
 * N=4이고, S가 아래와 같은 경우를 살펴보자.
 *
 * i\j	1	2	3	4
 * 1	 	1	2	3
 * 2	4	 	5	6
 * 3	7	1	 	2
 * 4	3	4	5
 * 예를 들어, 1, 2번이 스타트 팀, 3, 4번이 링크 팀에 속한 경우에 두 팀의 능력치는 아래와 같다.
 *
 * 스타트 팀: S12 + S21 = 1 + 4 = 5
 * 링크 팀: S34 + S43 = 2 + 5 = 7
 * 1, 3번이 스타트 팀, 2, 4번이 링크 팀에 속하면, 두 팀의 능력치는 아래와 같다.
 *
 * 스타트 팀: S13 + S31 = 2 + 7 = 9
 * 링크 팀: S24 + S42 = 6 + 4 = 10
 * 스타트 팀의 능력치와 링크 팀의 능력치의 차이를 최소로 하려고 한다.
 * 위의 예제와 같은 경우에는 1, 4번이 스타트 팀, 2, 3번 팀이 링크 팀에 속하면
 * 스타트 팀의 능력치는 6, 링크 팀의 능력치는 6이 되어서 차이가 0이 되고 이 값이 최소이다.
 */

public class Main {
    // 전역 변수 선언 - 모든 메서드에서 접근 가능하도록 static으로 선언
    static int N; // 사람 수 [입력값]
    static int[][] S; // 능력치 배열
    static boolean[] selected; // 팀 선택 여부 true면 스타트 팀, false면 링크 팀
    static int minDifference = Integer.MAX_VALUE; // 최소 능력치 차이[결과값]

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사람 수 입력
        N = Integer.parseInt(br.readLine().trim());

        // 능력치 배열 초기화
        S = new int[N][N];

        // 팀 선택 배열 초기화
        selected = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 백트래킹으로 모든 팀 조합 탐색
        backtrack(0, 0);

        // 결과 출력
        System.out.println(minDifference);
    }

    /**
     * 백트래킹 함수: 모든 가능한 팀 조합을 재귀적으로 탐색
     *
     * @param index 현재 고려 중인 사람 인덱스 (0 ~ N-1)
     * @param count 현재까지 스타트 팀에 선택된 사람 수
     */
    static void backtrack(int index, int count) {
        // 종료 조건: N/2명이 선택된 경우 -> 팀 선택 완료 능력치 계산
        if (count == N/2) {
            calculateDifference();
            return;
        }

        // 남은 사람들에 대해 선택 또는 미선택
        for (int i = index; i < N; i++) {
            if (!selected[i]) {
                selected[i] = true;  // 스타트 팀에 배정
                backtrack(i + 1, count + 1);
                selected[i] = false; // 백트래킹
            }
        }
    }

    /**
     * 두 팀의 능력치 차이 계산
     *
     * - selected[i]가 true인 사람은 스타트 팀
     * - selected[i]가 false인 사람은 링크 팀
     */
    static void calculateDifference() {
        int startTeamAbility = 0;
        int linkTeamAbility = 0;

        // 모든 쌍의 능력치 계산
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue; // 자기 자신은 제외

                if (selected[i] && selected[j]) {
                    // 둘 다 스타트 팀인 경우
                    startTeamAbility += S[i][j];
                } else if (!selected[i] && !selected[j]) {
                    // 둘 다 링크 팀인 경우
                    linkTeamAbility += S[i][j];
                }
                // 서로 다른 팀인 경우는 계산에 포함하지 않음
            }
        }

        // 두 팀의 능력치 차이 (절대값)
        int difference = Math.abs(startTeamAbility - linkTeamAbility);

        // 최소값 갱신
        minDifference = Math.min(minDifference, difference);
    }
}
