import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        
        for (int i = 0; i < num; i++) {
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int temp = (a < b) ? a : b;
            int ans = 0;
            
            for (int j = 1; j <= temp; j++) {
                if (a % j == 0 && b % j == 0) {
                    ans = j;
                }
            }

            System.out.println(a*b/ans);
        }
        br.close();
    }
}