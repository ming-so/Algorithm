import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int count = 0;
		int[] num = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());	
		}
		
		Arrays.sort(num);
		int i = 0;
		int j = n - 1;
		
		while (i < j) {
			if (num[i] + num[j] == m) {
				count++;
				i++;
				j--;
			} else if (num[i] + num[j] < m) {
				i++;
			} else {
				j--;
			}
		}
		
		System.out.print(count);
	}
}
