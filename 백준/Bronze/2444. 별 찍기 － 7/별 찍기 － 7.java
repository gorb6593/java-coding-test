import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        //증가하는 N번까지 반복
        for (int i = 1; i <= N; i++) {

            //ex) N(5) i(2) 일 때, 2열 3행까지는 공백 4행,5행은 별
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }

            //별은 열이 증가할때마다 2배로 증가함 그리고 공백은 따로 찍을 필요가 없음 (공백이나 안찍으니 같음)
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*");
            }

            //각 열을 반복하고 줄바꿈
            System.out.println();
        }

        //아랫 부분 별찍기
        //5면 하나적은 것 부터 내려가면서 별찍기
        for (int i = N - 1; i >= 0; i--) {

            //i가 작아지므로 위에서 부터 많은 공백이 찍힘
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }

            //끝나고 줄바꿈
            System.out.println();
        }

    }
}