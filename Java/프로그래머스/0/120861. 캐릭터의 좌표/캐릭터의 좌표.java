class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};

        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "up":
                    answer[1]++;
                    break;
                case "down":
                    answer[1]--;
                    break;
                case "left":
                    answer[0]--;
                    break;
                case "right":
                    answer[0]++;
                    break;
            }

            for (int j = 0; j < 2; j++) {
                if (answer[j] > board[j] / 2) {
                    answer[j]--;
                } else if (answer[j] < board[j] / 2 * -1) {
                    answer[j]++;
                }
            }
        }

        return answer;
    }
}