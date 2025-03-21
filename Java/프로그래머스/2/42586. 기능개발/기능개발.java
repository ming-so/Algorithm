import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] p = {90, 90};
        int[] s = {10, 9};
        System.out.println(solution.solution(p, s));       
    }	

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < progresses.length; i++) {
            int end = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
             
            if (i == progresses.length - 1) {
                if (stack.peek() < end) {
                    answer.add(stack.size());
                    stack.clear();
                }

                stack.push(end);
                answer.add(stack.size());
            } else if (stack.empty()) {
                stack.push(end);
            } else if (stack.peek() >= end) {
                stack.push(stack.peek());
            } else {
                answer.add(stack.size());
                stack.clear();
                stack.push(end);
            } 
        }

        for (int num : answer) {
            System.out.println(num);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}