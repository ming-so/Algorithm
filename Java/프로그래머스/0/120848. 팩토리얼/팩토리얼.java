class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = 0;

        while (answer <= n) {
            answer *= ++num;
        }
        
        return --num;
    }
}