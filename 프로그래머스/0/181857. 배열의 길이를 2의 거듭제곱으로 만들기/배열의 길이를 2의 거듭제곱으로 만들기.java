class Solution {
    public int[] solution(int[] arr) {
        int count = 1;
        
        while(arr.length > count) {
            count = count * 2;
        }
        
        int[] answer = new int[count];
        
        for(int i = 0; i < count; i++) {
            if(i < arr.length) {
                answer[i] = arr[i];
            } else {
                answer[i] = 0;
            }
        }
        
        return answer;
    }
}