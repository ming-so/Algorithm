import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        nums = Arrays.stream(nums).distinct().toArray();
        
        return answer < nums.length ? answer : nums.length;
    }
}