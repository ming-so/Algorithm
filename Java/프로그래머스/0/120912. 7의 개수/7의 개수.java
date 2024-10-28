class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            String str = Integer.toString(array[i]);
            answer += countChar(str, '7');
        }
        return answer;
    }

    public static long countChar(String str, char ch) {
        return str.chars().filter(c -> c == ch).count();
    }
}