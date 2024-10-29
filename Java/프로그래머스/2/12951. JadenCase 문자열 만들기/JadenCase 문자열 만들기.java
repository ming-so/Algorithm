class Solution {
    public String solution(String s) {
        StringBuilder strb = new StringBuilder(s.toLowerCase());
        int num = 0;
       
        while (num != -1) {
            if (num == 0 || num == s.length() - 1) { 
                strb.setCharAt(num, Character.toUpperCase(s.charAt(num))); 
            } else {
                strb.setCharAt(num + 1, Character.toUpperCase(s.charAt(num + 1)));
            }

            num = s.indexOf(" ", num + 1);
        }

        return strb.toString();
    }
}