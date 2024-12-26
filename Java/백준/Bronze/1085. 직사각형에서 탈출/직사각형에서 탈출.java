import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 백준 #1085
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        if (x <= y && x <= w-x && x <= h-y) {
            System.out.println(x);
        } else if (y <= x && y <= w-x && y <= h-y) {
            System.out.println(y);
        } else if (w-x <= x && w-x <= y && w-x <= h-y) {
            System.out.println(w-x);
        } else if (h-y <= x && h-y <= y && h-y <= w-x) {
            System.out.println(h-y);
        }

        br.close();
    }
}
