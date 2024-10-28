class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0, 0};

        answer[0] = numer1 * denom2 + numer2 * denom1;
        answer[1] = denom1 * denom2;

        int min = Math.min(answer[0], answer[1]);
        int max = Math.max(answer[0], answer[1]);

        while (min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }

        answer[0] /= max;
        answer[1] /= max;
        
        return answer;
    }
}