import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		int count = 1;
		
		
		while (end_index != num) {
			if (sum > num) {
				sum -= start_index;
				start_index++;
			} else if (sum < num) {
				end_index++;
				sum += end_index;
			} else {
				end_index++;
				sum += end_index;
				count++;
			}
		}
		
		System.out.print(count);
	}
}
