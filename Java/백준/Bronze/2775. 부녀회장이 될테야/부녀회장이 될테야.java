import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 백준 #2775
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int testCase = Integer.parseInt(str);
        int k, n;

        for (int i = 0; i < testCase; i++) {
            str = br.readLine();
            k = Integer.parseInt(str);

            str = br.readLine();
            n = Integer.parseInt(str);

            int ppl[][] = new int[k+1][n];
            
            for (int j = 0; j < k + 1; j++) {
                ppl[j][0] = 1;
                for (int l = 0; l < n; l++) {
                    ppl[0][l] = l + 1;
                }
            
            }

            for (int j = 1; j < k + 1; j++) {
                for (int l = 1; l < n; l++) {
                    ppl[j][l] = ppl[j-1][l] + ppl[j][l-1];
                }
            }
            System.out.println(ppl[k][n-1]);
        }
        br.close();
    }    
}