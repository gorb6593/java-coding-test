function solution(n) {
    var answer = [[]];
    
    for (i=0; i<n; i++) {
        for (j=0; j<n; j++) {
            if (i==j) {
                let temp_arr = new Array(n).fill(0);
                temp_arr[i] = 1;
                answer[i] = temp_arr;
            }
        }
    }
    
    return answer;
}