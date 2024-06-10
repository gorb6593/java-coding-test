class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        int temp_length = is_prefix.length();
        
        if (temp_length > my_string.length()) {
            return answer;
        }
        
        
        if (my_string.substring(0,temp_length).equals(is_prefix)) {
            answer = 1;
        }
        
        return answer;
    }
}