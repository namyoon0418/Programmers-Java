class Solution {
    public int[] solution(int n) {
        int count = 0;
        
        int k = n;
        
        while(k != 1) {
            if(k % 2 == 0) {
                k = k / 2;
            } else {
                k = 3 * k + 1;
            }
            count++;
        }
        
        
        int[] answer = new int[count + 1];
        
        answer[0] = n;
        
        for(int i = 1; i < answer.length; i++) {
            if(n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            answer[i] = n;
        }
        
        return answer;
    }
}