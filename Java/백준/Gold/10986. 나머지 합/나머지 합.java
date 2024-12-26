import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int data = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		long answer = 0;
		long[] sum = new long[data + 1];	// 누적합
		long[] rest = new long[num];	// 각 누적합을 num으로 나눴을 때 나머지의 개수. index=나머지 / value=개수
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i < data + 1; i++) {
			sum[i] = sum[i - 1] + Long.parseLong(st.nextToken());
			int re = (int) (sum[i] % num);
			
			if (re == 0) answer++;
			rest[re]++;
		}
		
		for (int i = 0; i < num; i++) {
			if (rest[i] > 1) 
				answer += (rest[i] * (rest[i] - 1) / 2);
		}
		
		System.out.print(answer);
	}
}
