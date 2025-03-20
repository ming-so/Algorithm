import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> answer = new Stack<>();

        for (int num : arr) {
            if (answer.isEmpty() || answer.peek() != num)
                answer.push(num);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}