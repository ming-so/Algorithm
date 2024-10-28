class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int max = dots[0][0] + dots[0][1], min = dots[0][0] + dots[0][1];
        int maxNum = 0, minNum = 0;

        for (int i = 0; i < dots.length; i++) {
            int sum = dots[i][0] + dots[i][1];
            if (max < sum) { max = sum; maxNum = i; }
            if (min > sum) { min = sum; minNum = i; }
        }

        answer = (dots[maxNum][0] - dots[minNum][0]) * (dots[maxNum][1] - dots[minNum][1]);

        return answer;
    }
}