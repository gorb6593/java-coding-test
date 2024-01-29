import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());

        String temp;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            temp = st.nextToken();

            if(temp.length() < limit) continue;

            //구글링으로 더 낫다고 생각하는 발견 (바로 밑)
//            if(map.containsKey(temp)) {
//                map.put(temp, map.get(temp) + 1);
//            } else {
//                map.put(temp,1);
//            }
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<String>() {
            //이 부분은 구글링으로 좀 더 풀어볼 것!
            @Override
            public int compare(String o1, String o2) {
                // 자주 등장하는 단어 순서대로 정렬
                if ((int) map.get(o1) != map.get(o2)) {
                    return Integer.compare(map.get(o2), map.get(o1));
                }
                // 등장 횟수가 같으면 길이가 긴 단어가 먼저 오도록 정렬
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                // 등장 횟수와 길이가 같으면 사전 순으로 정렬
                return o1.compareTo(o2);
            }
        });
        // 정렬된 단어들을 출력
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str + "\n");
        }
        System.out.println(sb);
    }
}


