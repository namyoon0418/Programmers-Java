class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        char target = letter.charAt(0);

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != target) {
                answer += arr[i];
            }
        }
        return answer;
    }
}