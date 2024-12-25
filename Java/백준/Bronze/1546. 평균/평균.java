import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] score = new int[n];
		int sum = 0;
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
			
			if (max < score[i]) max = score[i];
		}
		
		System.out.print(sum * 100.0 / n / max);
	}
}
