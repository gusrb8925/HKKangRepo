package section02;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-2장: 메서드 호출과 프로그램의 기능적 분할1
//제곱하기 기능적분할
public class Code16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		int result = power(a, b);

		System.out.println(result);
		s.close();
	}

	public static int power(int n, int m) {
		int result = 1;
		for (int i = 0; i < m; i++) {
			result *= n;
		}
		return result;
	}

}
