package section01;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-1장: 변수,배열,반복문 6
// n개의 음이 아닌 한자리 정수를 입력받아 배열에저장
// 연속된자릿수를 구하여 얻는 수중 소수이며 최대값은?
public class Code13 {

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
			int val = 0;
			for (int j = i; j < n; j++) {
				val = val * 10 + data[j];

				// 소수 판별
				boolean isPrime = true;
				for (int k = 2; k * k <= val && isPrime; k++) {
					if (val % k == 0) {
						isPrime = false;
					}
				}

				// 최대값 판별
				if (isPrime && val > 1 && val > max) {
					max = val;
				}
			}
		}
		if (max > 0) {
			System.out.println(max);
		} else {
			System.out.println("no Prime number exists");
		}

	}

}
