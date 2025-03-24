class Solution {
    public boolean solution(int x) {
        int ha = 0;
        int num = x;
        
        while (num != 0) {
            ha += num % 10;
            num /= 10;
        }
        
        return x % ha == 0 ? true : false;
    }
}