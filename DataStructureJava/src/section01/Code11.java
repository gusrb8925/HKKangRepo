package section01;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-1장: 변수,배열,반복문 5
//정수 n개를 입력받아서 중복된 정수쌍을 구하라
public class Code11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = s.nextInt();
		}
		s.close();

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (data[i] == data[j]) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

}
