import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		Deque<Node> deque = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int now = Integer.parseInt(st.nextToken());
			
			while (!deque.isEmpty() && deque.getLast().value > now)
				deque.removeLast();
			
			deque.addLast(new Node(now, i));
			
			if (deque.getFirst().index < i - l + 1)
				deque.removeFirst();
			
			bw.write(deque.getFirst().value + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
  }
	
	static class Node {
		public int value;
		public int index;
		
		Node(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}
}
