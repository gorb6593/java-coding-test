function solution(my_string, is_prefix) {
    var answer = 0;
    var temp_length = is_prefix.length;
    if (my_string.substring(0,temp_length) == is_prefix) {
        answer = 1;
    }
        
    return answer;
}