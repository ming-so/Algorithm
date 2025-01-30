class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (true) {
            int cola = n / a * b;
            int remainder = n % a;
            answer += cola;
            
            if (cola + remainder >= a) {
                n = cola + remainder;
                continue;
            } else {
                break;
            }
        }
        
        return answer;
    }
}