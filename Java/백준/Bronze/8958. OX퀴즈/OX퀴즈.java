import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        int score = 0;
        String quiz = "";

        for (int i = 0; i < num; i++) {
            quiz = br.readLine();
            for (int j = 0; j < quiz.length(); j++) {
                if(quiz.charAt(j) == 0) {
                    break;                       
                } else {
                    if(quiz.charAt(j) == 'O') {
                        int k = j;
                        while(k > -1 && quiz.charAt(k) == 'O') {
                            score++;
                            k--;
                        }
                    }
                }
            }
            System.out.println(score);
            score = 0;
        }


        br.close();
    }
}
