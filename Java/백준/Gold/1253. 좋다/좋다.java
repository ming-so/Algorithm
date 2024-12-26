import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[n];
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		for (int k = 0; k < n; k++) {
			int target = num[k];
			int i = 0;
			int j = n - 1;
			
			while (i < j) {
				if (num[i] + num[j] > target) {
					j--;
				} else if (num[i] + num[j] < target) {
					i++;
				} else {
					if (i != k && j != k) {
						count++;
						break;
					} else if (i == k) {
						i++;
					} else if (j == k) {
						j--;
					}
				}
			}
		
		}
		
		System.out.print(count);
	}
}
