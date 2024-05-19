import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  static String[][] arr;
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    arr = new String[N][N];

    star(0,0,N);
    for(int i=0; i<N; i++) {
      for(int j=0; j<N; j++) {
        if(arr[i][j]!=null)
          sb.append(arr[i][j]);
        else
          sb.append(" ");
      }
      sb.append("\n");
    }
    System.out.print(sb);
  }

  public static void star(int x, int y, int n) {
    if(n==1) {
      arr[x][y] = "*";
      return;
    }

    int size = n/3;
    for(int i=0; i<3; i++) {
      for(int j=0; j<3; j++) {
        if(!(i==1 && j==1)){ 
          star(x+i*size, y+j*size, size);
        }
      }
    }

  }
}
