import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int scoreNum = scan.nextInt();
        if(scoreNum <= 1000) {
            int [] score = new int[scoreNum];
            int topScore = 0;
            for(int i = 0; i<scoreNum; i++) {
                score[i] = scan.nextInt();
                if(topScore<score[i]) {
                    topScore = score[i];
                }
            }
            double totalScore = 0;     
            for(int i = 0; i<scoreNum; i++) {  
                totalScore += (double)score[i]/topScore*100;     
            }
            System.out.println((double)totalScore/scoreNum);            
        } 
        scan.close();
    }
}
