import java.io.*;
import java.util.*;

public class Main {
	static int checkArr[];	// 비밀번호 체크
	static int numArr[];	// 현재 상태
	static int check;
	
  public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int cnt = 0;
		char[] ch = new char[s];
		checkArr = new int[4];
		numArr = new int[4];
		check = 0;
		ch = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) check++;
		}
		
		for (int i = 0; i < p; i++) {	
			// numArr 초기값 세팅
			Add(ch[i]);
		}
		
		if (check == 4) cnt++;	// 초기값이 조건을 만족하는지 체크
		
		for (int i = p; i < s; i++) {
			Add(ch[i]);
			Remove(ch[i - p]);
			if (check == 4) cnt++;
		}
		
		System.out.print(cnt);
		br.close();
	}
	
	public static void Add(char c) {
		switch (c) {
			case 'A':
				numArr[0]++;
				if (numArr[0] == checkArr[0]) check++;
				break;
			case 'C':
				numArr[1]++;
				if (numArr[1] == checkArr[1]) check++;
				break;
			case 'G':
				numArr[2]++;
				if (numArr[2] == checkArr[2]) check++;
				break;
			case 'T':
				numArr[3]++;
				if (numArr[3] == checkArr[3]) check++;
				break;
		}
	}
	
	public static void Remove(char c) {
		switch (c) {
			case 'A':
				if (numArr[0] == checkArr[0]) check--;
				numArr[0]--;
				break;
			case 'C':
				if (numArr[1] == checkArr[1]) check--;
				numArr[1]--;
				break;
			case 'G':
				if (numArr[2] == checkArr[2]) check--;
				numArr[2]--;
				break;
			case 'T':
				if (numArr[3] == checkArr[3]) check--;
				numArr[3]--;
				break;
		}
	}
}
