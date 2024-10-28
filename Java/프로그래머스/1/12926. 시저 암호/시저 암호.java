class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                if (s.charAt(i) + n > 90) {
                    answer += (char) (s.charAt(i) + n - 26);
                } else {
                    answer += (char) (s.charAt(i) + n);
                }
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                if (s.charAt(i) + n > 122) {
                    answer += (char) (s.charAt(i) + n - 26);
                } else {
                    answer += (char) (s.charAt(i) + n);
                }
            } else {
                answer += ' ';
            }
        }

        return answer;
    }
}