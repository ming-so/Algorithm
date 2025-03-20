import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Point[] arr = new Point[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Point(Integer.parseInt(br.readLine()), i);
        }

        Arrays.sort(arr);
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (max < arr[i].index - i) // 정렬 전 index와 정렬 후 index의 차 중 최댓값 
                max = arr[i].index - i;
        }

        System.out.println(max + 1);
    }
}

class Point implements Comparable<Point> {
    int value;
    int index;

    public Point(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(Point o) { // value 기준 오름차순 정렬렬
        return this.value - o.value;
    }

}