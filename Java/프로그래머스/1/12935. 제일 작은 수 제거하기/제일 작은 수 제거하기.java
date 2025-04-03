import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        } else {
            int[] answer = new int[arr.length - 1];
            int i = 0;

            for (int num : arr) {
                if (num == Arrays.stream(arr).min().getAsInt())
                    continue;
                answer[i++] = num;
            }

            return answer;
        }
    }
}