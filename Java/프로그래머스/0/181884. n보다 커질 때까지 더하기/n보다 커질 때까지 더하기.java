class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        
        for (int i : numbers) {
            sum += i;
            if (sum > n) break;
        }
        
        return sum;
    }
}