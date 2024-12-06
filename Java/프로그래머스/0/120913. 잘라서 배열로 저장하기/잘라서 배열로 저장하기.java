import java.util.Arrays;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int)Math.ceil((double)my_str.length() / n)];
        Arrays.fill(answer, "");
        for (int i = 0; i < my_str.length(); i++) {
            answer[i / n] += my_str.charAt(i);
        }
        return answer;
    }
}