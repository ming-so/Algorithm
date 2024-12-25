import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		char[] ch = str.toCharArray();
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += ch[i] - '0';
		}
		System.out.print(sum);
  }
}
