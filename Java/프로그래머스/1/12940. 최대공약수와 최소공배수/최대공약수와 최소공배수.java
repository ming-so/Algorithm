class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0, n * m};


        if (n < m) {
            int temp = n;
            n = m;
            m = temp;
        }

        while (m != 0) {
            int temp = n % m;
            n = m;
            m = temp;
        }
        
        answer[0] = n;
        answer[1] /= n;
        
        return answer;
    }
}