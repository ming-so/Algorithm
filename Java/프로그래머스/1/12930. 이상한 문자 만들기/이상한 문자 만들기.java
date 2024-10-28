class Solution {
    public String solution(String s) {
        String answer = "";
        int num = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { num = 1; answer += ' '; continue; }
            
            if (num % 2 == 0) {
                answer += Character.toLowerCase(s.charAt(i));
            } else {
                answer += Character.toUpperCase(s.charAt(i));
            }
            
            num++;
        }

        return answer;
    }
}