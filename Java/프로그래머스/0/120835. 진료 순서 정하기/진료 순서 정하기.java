import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = emergency.clone();
        Arrays.sort(emergency);

        for (int i = 0; i < emergency.length; i++) {
            answer[i] = emergency.length - Arrays.stream(emergency).boxed().collect(Collectors.toList()).indexOf(answer[i]);
        }
        return answer;
    }
}