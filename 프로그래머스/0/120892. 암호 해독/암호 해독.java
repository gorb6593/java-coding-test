class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(var i=0; i<cipher.length(); i++){
            if(i%code == (code -1)){
                answer = answer + cipher.charAt(i);
            }
        }
    
        return answer;
    }
}