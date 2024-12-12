class Solution {
    public String solution(String my_string, int num1, int num2) {
        char char1 = my_string.charAt(num1);
        char char2 = my_string.charAt(num2);
        StringBuilder strb = new StringBuilder(my_string);
        strb.setCharAt(num1, char2);
        strb.setCharAt(num2, char1);
        return strb.toString();
    }
}