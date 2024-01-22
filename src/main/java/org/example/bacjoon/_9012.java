package org.example.bacjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());

        String tmp = "";
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            tmp = st.nextToken();

            for (int j=0; j<tmp.length(); j++) {

                if (tmp.charAt(j) == '(') {
                    stack.push(tmp.charAt(j));
                } else {
                    if (stack.empty()) {
                        stack.push(tmp.charAt(j));
                        //비었는데 ) 얘가 들어가면 걔 넣고 리턴 => 바로 NO
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(stack.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            stack.clear();

        }
    }
}
