import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; 1 + i*2 <= n; i++) {
            list.add(1 + i*2);
        }

        return list;
    }
}