import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 백준 #1712
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (b >= c) {
            System.out.println(-1);
        } else if (a % (c-b) == 0) {
            System.out.println(a / (c-b) + 1);
        } else {
            System.out.println((int) (a / (c-b) + 1));
        }

        br.close();
    }
}