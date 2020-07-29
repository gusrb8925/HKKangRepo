package section01;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-1장: 변수,배열,반복문 6
//n개의 정수를 입력받아서 배열에 저장 후
// 0개이상의 연속된 정수들을 더하여 얻을 수 있는 최대값은?
public class Code12 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = s.nextInt();
		}
		s.close();

		int max = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += data[j];
				if (sum > max) {
					max = sum;
				}
			}
		}

		System.out.println(max);

	}

}
