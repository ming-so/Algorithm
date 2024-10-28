class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int rest = 0;
        
        while(true) {
            rest += chicken % 10;
            chicken /= 10;
            answer += chicken;
            if (chicken < 10) {
                rest += chicken;
                if (rest >= 10) {
                    chicken = rest;
                    rest = 0;
                    continue;
                }
                else break;
            }
        }

        return answer;
    }
}