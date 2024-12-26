import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 백준 #2477
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int num = Integer.parseInt(str);
        int [][] xy = new int [6][2];

        for (int i = 0; i < 6; i++) {
            str = br.readLine();
            st = new StringTokenizer(str);
            xy[i][0] = Integer.parseInt(st.nextToken());
            xy[i][1] = Integer.parseInt(st.nextToken());
        }

        if (xy[0][0] == xy[2][0]) {
            if (xy[1][0] == xy[3][0]) {
                System.out.println((xy[4][1] * xy[5][1] - xy[1][1] * xy[2][1]) * num);
            } else {
                System.out.println((xy[3][1] * xy[4][1] - xy[0][1] * xy[1][1]) * num);
            }
        } else if (xy[1][0] == xy[3][0]) {
            System.out.println((xy[0][1] * xy[5][1] - xy[2][1] * xy[3][1]) * num);
        } else if (xy[0][1] < xy[2][1]) {
            if (xy[1][1] < xy[3][1]) {
                System.out.println((xy[2][1] * xy[3][1] - xy[5][1] * xy[0][1]) * num);
            } else {
                System.out.println((xy[1][1] * xy[2][1] - xy[4][1] * xy[5][1]) * num);
            }
        } else {
            System.out.println((xy[0][1] * xy[1][1] - xy[3][1] * xy[4][1]) * num);
        }

        br.close();
    }
}
