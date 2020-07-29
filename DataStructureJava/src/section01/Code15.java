package section01;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-1장: 변수,배열,반복문 7
// n개 정수를 입력받고 하나씩 입력할떄마다 오름차순으로 정렬하라
//정렬된 리스트에 인설트
public class Code15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			int tmp = s.nextInt();
			int j = i - 1;
			while (data[j] > tmp && j >= 0) {
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = tmp;

			for (int k = 0; k <= i; k++) {
				System.out.print(data[k] + " ");
			}
			System.out.println();

		}
		s.close();

	}

}
