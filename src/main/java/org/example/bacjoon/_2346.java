package org.example.bacjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class _2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        ArrayDeque<int[]> list = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<count;i++) {
            int[] arr= {i+1,Integer.parseInt(st.nextToken())};
            //System.out.println("Arrays.toString(arr = " + Arrays.toString(arr));
            list.add(arr);
        }

        while(list.size()>1){
            //처음 풍선 터트리기

            int[] arr= list.pollFirst();
            sb.append(arr[0]).append(" ");
            int n = arr[1];

            //배열 1번째 (2번쨰에 있는 값)을 가져와서 양수 인지 음수인지 판별
            if(n>0) {
                //양수면 오른쪽으로 돈다 => 처음부터 순서대로 간다 => 가장 앞에  있는 것을 빼서 마지막에 넣기 반복
                for(int j=1; j<n;j++) {
                    list.offerLast(Objects.requireNonNull(list.pollFirst()));
                }
            }
            //음수면 반대로
            else if(n<0){
                for(int j=n;j!=0;j++) {
                    list.offerFirst(Objects.requireNonNull(list.pollLast()));
                }
            }
        }
        System.out.println(sb.append(Objects.requireNonNull(list.poll())[0]));

    }
}
