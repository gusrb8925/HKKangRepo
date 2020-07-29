package section05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-2장: 메서드와 생성자 2
//사각형 정렬하기
//클래스안에 메서드,생성자 추가
public class Code09 {

	static MyRectangle2[] rects = new MyRectangle2[10];
	static int n = 0;

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(new File("data2.txt"));
			while (sc.hasNext()) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int w = sc.nextInt();
				int h = sc.nextInt();
				rects[n] = new MyRectangle2(x, y, w, h);
				n++;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No file");
		}

		bubbleSort();

		for (int i = 0; i < n; i++) {
			System.out.println(rects[i].toString());
		}
	}

	private static void bubbleSort() {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (rects[j].calArea() > rects[j + 1].calArea()) {
					MyRectangle2 tmp = rects[j];
					rects[j] = rects[j + 1];
					rects[j + 1] = tmp;
				}

			}
		}
	}

}
