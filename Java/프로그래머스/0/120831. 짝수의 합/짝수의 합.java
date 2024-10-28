class Solution {
    public int solution(int n) {
        if (n % 2 != 0) n--;

        if (n % 4 == 0) {
            return (n + 2) * (n / 4);
        } else {
            return (n + 2) * (n / 4) + (n / 2 + 1);
        }
    }
}