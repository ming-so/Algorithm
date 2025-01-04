class Solution {
    public int solution(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(A.substring(A.length() - i, A.length()));
            sb.append(A.substring(0, A.length() - i));
            
            if (sb.toString().equals(B)) return i;
        }
        
        return -1;
    }
}