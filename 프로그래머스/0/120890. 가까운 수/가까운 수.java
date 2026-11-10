class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        
        for (int i = 1; i < array.length; i++) {
            int near = Math.abs(array[i] - n);
            int nearAnswer = Math.abs(answer - n);
            
            if (near < nearAnswer || near == nearAnswer && array[i] < answer) {
                answer = array[i];
            }
        }
        
        return answer;
    }
}