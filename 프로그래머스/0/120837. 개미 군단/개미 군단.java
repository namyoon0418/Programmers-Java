class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int cap = 5;
        int sold = 3;
        int work = 1;
        
        answer += hp / cap;
        hp = hp % cap;
        if(hp != 0) {
            answer += hp / sold;
            hp = hp % sold;
            if(hp != 0) {
                answer += hp / work;
            }
        }
        
        return answer;
    }
}