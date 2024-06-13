function solution(start_num, end_num) {
    var answer = [];
    count = 0;
    for (i=start_num; i>=end_num; i--) {
        answer[count] = i;
        count++;
    }
    
    return answer;
}