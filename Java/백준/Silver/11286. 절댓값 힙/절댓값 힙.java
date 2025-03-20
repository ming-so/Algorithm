import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);

            if (first == second) return o1 > o2 ? 1 : -1;   // 절댓값이 같을 때 음수 우선 정렬 (음수 리턴 시 우선 정렬됨)
            else return first - second;                     // 절댓값이 같지 않을 때 절댓값이 작은 순으로 정렬
        });

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == 0) {
                if (queue.isEmpty()) System.out.println("0");
                else System.out.println(queue.poll());
            } else {
                queue.add(input);
            }
        }
    }
}
