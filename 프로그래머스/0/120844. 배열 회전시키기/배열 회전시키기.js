function solution(numbers, direction) {
    var answer = [];
    var first = numbers[0];
    var last = numbers[numbers.length-1];
    
    if (direction == "right") {
        for (i=1; i<numbers.length; i++){
            answer[i] = numbers[i-1];
        }
        answer[0] = last;
    } else {
        for (i=0; i<numbers.length; i++){
            answer[i] = numbers[i+1];
        }
        answer[numbers.length-1] = first;
    }
    
    return answer;
}