import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		int qnum = sc.nextInt();
		int[] sum = new int[data + 1];
		
		for (int i = 1; i < data + 1; i++) {
			sum[i] = sum[i - 1] + sc.nextInt(); 
		}
		
		for (int i = 0; i < qnum; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(sum[b] - sum[a - 1]);
		}
	}
}
