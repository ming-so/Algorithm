import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        try {
            for (char c : s.toCharArray()) {
                if (c == '(') stack.push(c);
                else stack.pop();
            }
        } catch (Exception e) {
            return false;
        }

        return stack.isEmpty() ? true : false;
    }
}