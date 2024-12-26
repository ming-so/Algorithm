import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 백준 #10250
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);

        for(int i = 0; i < num; i++) {
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int h = Integer.parseInt(st.nextToken());   // height
            int w = Integer.parseInt(st.nextToken());   // width
            int n = Integer.parseInt(st.nextToken());

            int y =  n % h;
            int x;
            

            if (n % h == 0) {           // num / height의 나머지가 0인 경우
                y = h;                  // YY는 height와 같다.
                x = n / h;              // XX는 num / height와 같다.
            } else {                    
                x = (int) n / h + 1;     
            }

            String yy = Integer.toString(y);
            String xx = Integer.toString(x);
          
                       
            if (x < 10) {
                xx = "0" + xx;
            }

            System.out.println(yy + xx);
        }
        br.close();
    }
}
