package section01;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-1장: 변수,배열,반복문 7
//n개의 정수를 입력받은 후 오름차순으로 정렬
//버블정렬 알고리즘
public class Code14_bubblesort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = s.nextInt();
		}
		s.close();

		// 버블 정렬
		for (int i = n - 1; i > 0; i--) { // 한번 정렬한값은 제외, 0번째 값은정렬x
			for (int j = 0; j < i; j++) { //
				if (data[j] > data[j + 1]) {
					int tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
			}

		}
		for (int i = 0; i < n; i++) {
			System.out.print(data[i] + " ");
		}

	}

}
