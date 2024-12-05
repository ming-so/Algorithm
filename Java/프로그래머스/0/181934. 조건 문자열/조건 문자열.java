class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String str = ineq + eq;
        
        if (str.equals("<=")) {
            return n <= m ? 1 : 0;
        } else if (str.equals(">=")) {
            return n >= m ? 1 : 0;
        } else if (str.equals("<!")) {
            return n < m ? 1 : 0;
        } else {
            return n > m ? 1 : 0;
        }
    }
}