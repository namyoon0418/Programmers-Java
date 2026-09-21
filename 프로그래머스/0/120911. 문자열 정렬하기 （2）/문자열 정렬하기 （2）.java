import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] sortArray = my_string.toLowerCase().toCharArray();
        
        Arrays.sort(sortArray);
        
        answer = new String(sortArray);
        
        return answer;
    }
}