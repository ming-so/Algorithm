import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        int start = Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(2);
        int end = Arrays.stream(arr).boxed().collect(Collectors.toList()).lastIndexOf(2);

        if (start == -1) {
            int[] answer = {-1};
            return answer;
        } else {
            int[] answer = new int[end - start + 1];
            System.arraycopy(arr, start, answer, 0, end - start + 1);
            return answer;
        }  
    }
}