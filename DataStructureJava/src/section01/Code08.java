package section01;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-1장: 변수,배열,반복문 4
//n개의 정수를 입력받아 합과 최대값구하기
public class Code08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = s.nextInt();
		}
		s.close();

		int sum = 0;
		int max = data[0]; // int max=0; 이면 음수값 입력시 불가능
		for (int i = 0; i < n; i++) {
			sum += data[i];
			if (data[i] > max) {
				max = data[i];
			}
		}
		System.out.println("sum :" + sum);
		System.out.println("max :" + max);
	}

}
