package section01;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-1장: 변수,배열,반복문 2
//

public class Code03 {
	public static void main(String[] args) {
		String str = "Hello";
		String input = "";

		Scanner s = new Scanner(System.in);
		System.out.println("Please type a String :");

		input = s.next();

		if (str.equals(input)) {
			System.out.println("String match!");
		} else {
			System.out.println("String do not match!");
		}
		s.close();
	}

}