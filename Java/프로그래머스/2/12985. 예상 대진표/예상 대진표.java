class Solution
{
    public int solution(int n, int a, int b) {
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        
        return tournament(n, a, b);
    }

    public int tournament(int n, int a, int b) {
        int half = n / 2;
        if (a <= half && b > half) return (int) (Math.log(n) / Math.log(2));
        else if (a < half && b <= half) return tournament(half, a, b);
        else return tournament(half, a - half, b - half);
    }
}