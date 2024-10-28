import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0, maxCount = 0;
        int[] uniqueArray = Arrays.stream(array).distinct().toArray();

        for (int i = 0; i < uniqueArray.length; i++) {
            List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
            int temp = Collections.frequency(list, uniqueArray[i]);

            if (max < temp) {
                max = temp;
                answer = uniqueArray[i];
            }

            uniqueArray[i] = temp;
        }

        for (int i = 0; i < uniqueArray.length; i++) {
            if (uniqueArray[i] == max) maxCount++;
            if (maxCount > 1) return -1;
        }

        return answer;
    }
}