package section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-2장: 메서드 호출과 프로그램의 기능적 분할3
//전화번호부 출력하기
public class Code19 {
	public static void main(String[] args) {

		String[] name = new String[100];
		String[] number = new String[100];
		int n = 0;

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

		for (int i = 0; i < n; i++) {
			System.out.println(name[i] + " : " + number[i]);
		}

	}

}
