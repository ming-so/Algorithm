import java.util.Stack;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Stack<String> stack = new Stack<>();
        stack.push(words[0]);     

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() == 1 || stack.contains(words[i]) || stack.peek().charAt(stack.peek().length() - 1) != words[i].charAt(0)) {
                answer[0] = (i + 1) % n == 0 ? n : (i + 1) % n;
                answer[1] = (i + 1) / n + ((i + 1) % n == 0 ? 0 : 1);
                break;
            } else {
                stack.push(words[i]);
            }
        }

        return answer;
    }
}