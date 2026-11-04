class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] charArray = my_string.split("");
        String[] answer1 = new String[charArray.length];
        
        for(int i = 0; i < charArray.length; i++) {
            answer1[i] = charArray[i];
        }
        
        answer1[num2] = charArray[num1];
        answer1[num1] = charArray[num2];
        
        String answer = String.join("", answer1);
        
        return answer;
    }
}