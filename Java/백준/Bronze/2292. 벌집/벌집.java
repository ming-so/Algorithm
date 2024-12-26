import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        int sum = 0;

        for (int i = 0; ; i++) {
            if (i == 0) {
                sum = 1;
                if (num == 1) {
                    System.out.println(i + 1);
                    break;
                }
            }

            if (sum < num && num <= sum + 6*i) {
                System.out.println(i + 1);
                break;
            }

            sum += 6*i;
        }
        br.close();
    }
}
