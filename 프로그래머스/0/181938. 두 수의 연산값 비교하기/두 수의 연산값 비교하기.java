class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num1 = String.valueOf(a);
        String num2 = String.valueOf(b);
        String num = num1 + num2;
        int number = Integer.parseInt(num);
        
        if(number >= 2 * a * b) {
            answer = number;
        } else {
            answer = 2 * a * b;
        }
        
        return answer;
    }
}