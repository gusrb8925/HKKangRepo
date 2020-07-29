package section02;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-2장: 메서드 호출과 프로그램의 기능적 분할2
//버블정렬 기능적 분할
public class Code18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = s.nextInt();
		}
		s.close();

		bubbleSort(n, data);

		System.out.println("Sorted data: ");
		for (int i = 0; i < n; i++) {
			System.out.print(data[i] + " ");
		}
	}

	public static void bubbleSort(int n, int[] data) {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j] > data[j + 1]) {
					int tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
			}
		}
	}

}
