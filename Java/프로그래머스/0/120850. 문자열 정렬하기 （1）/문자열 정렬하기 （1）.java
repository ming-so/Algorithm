import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = Arrays.stream(my_string.replaceAll("[^0-9]", "").split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
