package section04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-1장: 클래스, 객체, 참조변수 4
// 사각형 정렬하기
public class Code05 {

	static MyRectangle1[] rects = new MyRectangle1[10];
	static int n = 0;

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(new File("data2.txt"));
			while (sc.hasNext()) {
				rects[n] = new MyRectangle1();
				rects[n].lu = new MyPoint1();
				rects[n].lu.x = sc.nextInt();
				rects[n].lu.y = sc.nextInt();
				rects[n].width = sc.nextInt();
				rects[n].height = sc.nextInt();
				n++;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No file");
		}

		bubbleSort();

		for (int i = 0; i < n; i++) {
			System.out.println(rects[i].lu.x + " " + rects[i].lu.y + " " + rects[i].width + " " + rects[i].height);
		}
	}

	private static void bubbleSort() {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (calArea(rects[j]) > calArea(rects[j + 1])) {
					MyRectangle1 tmp = rects[j];
					rects[j] = rects[j + 1];
					rects[j + 1] = tmp;
				}

			}
		}
	}

	public static int calArea(MyRectangle1 r) {
		return r.width * r.height;
	}

}
