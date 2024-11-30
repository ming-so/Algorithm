class Solution {
    public int[] solution(int n, int[] numlist) {
        int num = 0;
        
        for (int i : numlist) {
            if (i % n == 0) num++;
        }
        
        int[] answer = new int[num];
        num = 0;
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[num] = numlist[i];
                num++;
            }
        }
    
        return answer;
    }
}