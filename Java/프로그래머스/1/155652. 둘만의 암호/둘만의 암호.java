class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = 0; j < index; ) {
                ch++;
                
                if (ch > 122) ch -= 26;
                if (!skip.contains(ch + "")) j++;
            }  

            answer += ch;
        }
        
        return answer;
    }
}