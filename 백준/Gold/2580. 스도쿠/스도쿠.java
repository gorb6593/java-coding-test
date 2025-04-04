import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *스도쿠는 18세기 스위스 수학자가 만든 '라틴 사각형'이랑 퍼즐에서 유래한 것으로 현재 많은 인기를 누리고 있다. 이 게임은 아래 그림과 같이 가로, 세로 각각 9개씩 총 81개의 작은 칸으로 이루어진 정사각형 판 위에서 이뤄지는데, 게임 시작 전 일부 칸에는 1부터 9까지의 숫자 중 하나가 쓰여 있다.
 *
 *
 *
 * 나머지 빈 칸을 채우는 방식은 다음과 같다.
 *
 * 각각의 가로줄과 세로줄에는 1부터 9까지의 숫자가 한 번씩만 나타나야 한다.
 * 굵은 선으로 구분되어 있는 3x3 정사각형 안에도 1부터 9까지의 숫자가 한 번씩만 나타나야 한다.
 * 위의 예의 경우, 첫째 줄에는 1을 제외한 나머지 2부터 9까지의 숫자들이 이미 나타나 있으므로 첫째 줄 빈칸에는 1이 들어가야 한다.
 *
 *
 *
 * 또한 위쪽 가운데 위치한 3x3 정사각형의 경우에는 3을 제외한 나머지 숫자들이 이미 쓰여있으므로 가운데 빈 칸에는 3이 들어가야 한다.
 *
 *
 *
 * 이와 같이 빈 칸을 차례로 채워 가면 다음과 같은 최종 결과를 얻을 수 있다.
 *
 *
 *
 * 게임 시작 전 스도쿠 판에 쓰여 있는 숫자들의 정보가 주어질 때 모든 빈 칸이 채워진 최종 모습을 출력하는 프로그램을 작성하시오.
 *
 * 0 3 5 4 6 9 2 7 8
 * 7 8 2 1 0 5 6 0 9
 * 0 6 0 2 7 8 1 3 5
 * 3 2 1 0 4 6 8 9 7
 * 8 0 4 9 1 3 5 0 6
 * 5 9 6 8 2 0 4 1 3
 * 9 1 7 6 5 2 0 8 0
 * 6 0 3 7 0 1 9 5 2
 * 2 5 8 3 9 4 7 6 0
 */

public class Main {
    
    public static void main(String[] args) throws IOException {

        //9x9보드 생성
        int[][] board = new int[9][9];

        //입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 스도쿠 풀기
        solve(board);

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(board[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);

    }

    // 스도쿠 풀이 함수 (백트래킹)
    public static boolean solve(int[][] board) {
        // 빈 칸 찾기
        int[] emptyCell = findEmptyCell(board);

        int row = emptyCell[0];
        int col = emptyCell[1];

        // 빈 칸이 없으면 완성
        if (row == -1 && col == -1) {
            return true;
        }

        // 1부터 9까지 숫자 시도
        for (int num = 1; num <= 9; num++) {
            // 현재 위치에 num을 놓을 수 있는지 확인
            if (isValid(board, row, col, num)) {
                // 유효하면 숫자 배치
                board[row][col] = num;

                // 재귀적으로 다음 빈 칸 풀기
                if (solve(board)) {
                    return true; // 해결책 찾음
                }

                // 해결책이 없으면 백트래킹 (다시 빈 칸으로)
                board[row][col] = 0;
            }
        }

        // 모든 숫자(1-9)를 시도해도 해결책이 없음
        return false;
    }

    // 빈 칸(0) 찾기
    public static int[] findEmptyCell(int[][] board) {
        int[] position = {-1, -1}; // 기본값: 빈 칸 없음

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    position[0] = i;
                    position[1] = j;
                    return position; // 첫 번째 빈 칸 반환
                }
            }
        }

        return position; // 빈 칸이 없으면 {-1, -1} 반환
    }

    // 숫자 유효성 검사
    public static boolean isValid(int[][] board, int row, int col, int num) {
        // 같은 행에 중복된 숫자가 있는지 확인
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }

        // 같은 열에 중복된 숫자가 있는지 확인
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // 같은 3x3 박스에 중복된 숫자가 있는지 확인
        int boxStartRow = (row / 3) * 3;
        int boxStartCol = (col / 3) * 3;

        for (int i = boxStartRow; i < boxStartRow + 3; i++) {
            for (int j = boxStartCol; j < boxStartCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        // 모든 검사를 통과하면 유효한 숫자
        return true;
    }
}
