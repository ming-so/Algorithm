class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 0; i < 6; i++) {
            answer += n % 10;
            n /= 10;
        }
        
        return answer;
    }
}