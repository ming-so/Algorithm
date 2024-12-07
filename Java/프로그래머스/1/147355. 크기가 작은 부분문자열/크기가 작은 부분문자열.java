class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pnum = Long.parseLong(p);

        for (int i = 0; i + p.length() <= t.length(); i++) {
            long num = Long.parseLong(t.substring(i, i + p.length()));
            if (num  <= pnum) answer++;
        }

        return answer;
    }
}