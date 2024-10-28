class Solution {
    public int solution(int n) {
        int a = n;
        int b = 6;

        if (a < b) {
            int temp = n;
            a = b;
            b = temp;
        }

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return n / a;
    }
}