class Solution {
    public int solution(int n) {
        int answer = 0;
        int r = 0;

        for (int i = 1; r < n; i++) {
            if ((n - r) % i == 0) {
                answer++;
            } 
            r += i;
        }
        return answer;
    }
}