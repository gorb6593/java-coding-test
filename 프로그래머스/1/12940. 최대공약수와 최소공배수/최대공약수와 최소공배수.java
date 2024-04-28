class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a, b;
        
        a = getGCD(n,m);
        b = (n*m) / getGCD(n,m);
        answer[0] = a;
        answer[1] = b;
        return answer;
    }
    
    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}