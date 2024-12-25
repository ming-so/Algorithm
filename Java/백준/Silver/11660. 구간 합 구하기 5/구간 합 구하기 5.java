import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int data = Integer.parseInt(st.nextToken());
		int qnum = Integer.parseInt(st.nextToken());
		int[][] num = new int[data + 1][data + 1];
		int[][] sum = new int[data + 1][data + 1];
		
		for (int i = 1; i < data + 1; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 1; j < data + 1; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
				sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + num[i][j];
			}
		}
		
		for (int i = 0; i < qnum; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			System.out.println(sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1]);
		}
	}
}
