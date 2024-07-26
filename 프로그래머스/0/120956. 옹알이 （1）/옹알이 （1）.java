class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        
        for (int i=0; i<babbling.length; i++) {
            for (int j=0; j<4; j++) {
                if (babbling[i].contains(arr[j])) {
                    babbling[i] = babbling[i].replaceAll(arr[j], " ");
                }
            }
        }
        
        for (int i=0; i<babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll(" ","");
            if (babbling[i].equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}