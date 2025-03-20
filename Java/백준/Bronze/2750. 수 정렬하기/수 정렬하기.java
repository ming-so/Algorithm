import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 버블정렬 구현하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {   // 루프 횟수
            for (int j = 0; j < n - i - 1; j++) {   // 1루프당 swap 횟수
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) 
            System.out.println(arr[i]);
    }
}