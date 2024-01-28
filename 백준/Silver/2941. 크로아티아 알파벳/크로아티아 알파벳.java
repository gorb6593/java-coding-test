import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        String[] arr = {
                "c="
                , "c-"
                , "dz="
                , "d-"
                , "lj"
                , "nj"
                , "s="
                , "z="
        };

        for (int i = 0; i < arr.length; i++) {
            //System.out.println("arr[i] = " + arr[i]);
            if (s.contains(arr[i])) {
                //System.out.println("arr[i] include!! = " + arr[i]);
                s = s.replaceAll(arr[i],"!");
            }
        }
        System.out.println(s.length());
    }
}
