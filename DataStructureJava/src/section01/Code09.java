package section01;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-1장: 변수,배열,반복문 4
//n개의 정수를 입력받아 배열로 저장 후
//오른쪽으로 한칸씩 이동시키기 마지막칸은 처음칸으로(shift)
public class Code09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = s.nextInt();
		}
		s.close();

		int tmp = data[n - 1];// 마지막 칸 정수를 임시저장
		for (int i = n - 2; i >= 0; i--) {
			data[i + 1] = data[i];
		}
		data[0] = tmp;

		for (int i = 0; i < n; i++) {
			System.out.print(data[i] + " ");
		}

	}

}
