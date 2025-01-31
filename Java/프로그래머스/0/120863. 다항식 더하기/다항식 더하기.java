class Solution {
    public String solution(String polynomial) {
    	int x = 0;
        int num = 0;
       
        for (String s : polynomial.split(" ")) {
            if (s.contains("x")) 
                x += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            else if (!s.equals("+"))
                num += Integer.parseInt(s);
        }
        
        String str1 = x > 0 ? x > 1 ? x + "x" : "x" : "";
        String str2 = num > 0 ? str1 == "" ? num + "" : " + " + num : "";
        
        return str1 + str2 != "" ? str1 + str2 : "0";
    }
}