class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int factorial = 1;
        int i = 1;
        
        while(factorial <= n) {
            factorial *= i;
            i++;
        }
        
        answer = i - 2;
        
        return answer;
    }
}