import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
     public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int count = 4;
            
        boolean[] sortedRank = new boolean[rank.length];

        for (int i = 0; i < rank.length; i++) { sortedRank[rank[i] - 1] = attendance[i]; }
        for (int i = 0; i < rank.length; i++) {
            if (count < 0) break;
            if (!sortedRank[i]) continue;
           
            answer += (int) Math.pow(10, count) * Arrays.stream(rank).boxed().collect(Collectors.toList()).indexOf(i + 1);
            count -= 2;
        }

        return answer;
    }
}