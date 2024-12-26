import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    // 백준 #1002
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);

        for (int i = 0; i < num; i++) {
            str = br.readLine();   
            StringTokenizer st = new StringTokenizer(str);
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            double d = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));

            Double [] rank = {(double) r1, (double) r2, d};
            Arrays.sort(rank, Comparator.reverseOrder());
            
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            } else if (rank[0] < rank[1] + rank[2]) {
                System.out.println(2);
            } else if (rank[0] == rank[1] + rank[2]) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        br.close();
    }
}