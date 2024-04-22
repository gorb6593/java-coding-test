class Solution {
    public int[] solution(int n) {
        int[] answer;
        int count = 0;
        if(n%2==0) {
            answer = new int[n/2];
        } else {
            answer = new int[n/2+1];
        }
        for (int i=1; i<=n; i++){
            if(i%2==0) continue;
            answer[count] = i;
            count++;
        }
        return answer;
    }
}