class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0] < sides[1]? sides[1] : sides[0];
        int min = sides[0] < sides[1]? sides[0] : sides[1];

        for (int i = max - 1; max < i + min; i--) {
            answer++;
        }

        for (int i = max; i < min + max; i++) {
            answer++;
        }

        return answer;
    }
}