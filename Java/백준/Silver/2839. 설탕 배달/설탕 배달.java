import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        int remainder = num % 5;
        int three = 0;
        int five = 0;

        if (remainder == 0) {
            five = num / 5;
        } else if (remainder == 1) {
            three = 2;
            five = num / 5 - 1;
        } else if (remainder == 2) {
            three = 4;
            five = num / 5 - 2;
        } else if (remainder == 3) {
            three = 1;
            five = num / 5;
        } else if (remainder == 4) {
            three = 3;
            five = num / 5 - 1;
        }

        if (three*3 + five*5 != num || five < 0 || num == 0) {
            System.out.println(-1);
        } else {
            System.out.println(three + five);
        }
    }
}
