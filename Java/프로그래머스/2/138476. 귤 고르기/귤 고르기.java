import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        Integer[] count = new Integer[tangerine.length];
        Arrays.fill(count, 0);
        int num = 0;
        int sum = 0;
        int temp = -1;

        for (int i = 0; i < tangerine.length; i++) {
            if (i == tangerine.length - 1 || tangerine[i] != tangerine[i + 1]) {
                count[num++] = i - temp;
                temp = i;
            }
        }

        Arrays.sort(count, Collections.reverseOrder());

        for (int i = 0; sum < k; i++) {
            sum += count[i];
            answer++;
        }

        return answer;
    }
}