import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Deque<Integer> deque = new ArrayDeque<>();

        //0 => 큐, 1 => 스택
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        //큐만 저장.. 스택은 그 전에 넣었던 것을 다시 빼야하는데 의미가 없는 작업임..
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (arr[i] == 0)
                deque.addLast(num);
        }
        //System.out.println("deque first = " + deque);

        int n2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        //기존에 큐에 저장된 것에 추가로 넣고 하나씩 빼고 공백추가
        for (int i = 0; i < n2; i++) {
            deque.addFirst(Integer.parseInt(st.nextToken()));
            //bw.write(deque.pollLast()+" ");
            //System.out.println("deque = " + deque);
            sb.append(deque.pollLast()).append(" ");
        }
        System.out.println(sb);
    }
}