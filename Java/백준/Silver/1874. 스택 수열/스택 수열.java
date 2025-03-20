import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num = 1;
        boolean result = true;

        for (int i = 0; i < array.length; i++) {
            int now = array[i];
            
            if (now >= num) {
                while (now >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }

                stack.pop();
                bf.append("-\n");
            } else {
                int first = stack.pop();
                if (first > now) {
                    System.out.println("NO");
                    result= false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }

        if (result) System.out.println(bf.toString());
  	}	  
}