class Solution {
    public int solution(int n) {
        StringBuffer sb = new StringBuffer(Integer.toString(n, 3));
        int answer = Integer.parseInt(sb.reverse().toString(), 3);
        return answer;
    }
}