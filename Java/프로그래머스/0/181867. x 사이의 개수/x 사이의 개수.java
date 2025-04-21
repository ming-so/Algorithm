import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] myChar = myString.split("x");
        ArrayList<Integer> arr = new ArrayList<>();
      
        for (int i = 0; i < myChar.length; i++) 
            arr.add(myChar[i].length());
        
        if (myString.charAt(myString.length() - 1) == 'x') arr.add(0);

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}