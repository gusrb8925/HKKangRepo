package section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-2장: 메서드 호출과 프로그램의 기능적 분할3
//전화번호부 이름순정렬해서 출력하기
public class Code20 {
	static String[] name = new String[100];
	static String[] number = new String[100];
	static int n = 0;

	public static void main(String[] args) {

		try {
			String fileName = "input.txt";
			Scanner inFile = new Scanner(new File(fileName));

			while (inFile.hasNext()) {
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}

			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			System.exit(1);
		}

		bubbleSort();

		for (int i = 0; i < n; i++) {
			System.out.println(name[i] + " : " + number[i]);
		}

	}

	static void bubbleSort() {
		for (int i = n - 1; i > 0; i--)
			for (int j = 0; j < i; j++) {
				if (name[j].compareTo(name[j + 1]) > 0) {

					String tmp = name[j];
					name[j] = name[j + 1];
					name[j + 1] = tmp;

					tmp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = tmp;
				}
			}

	}
}
