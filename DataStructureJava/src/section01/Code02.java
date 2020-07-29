package section01;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-1장: 변수,배열,반복문 1
//

public class Code02 {

	public static void main(String[] args) {
		int number = 123;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter an integer : ");

		int input = s.nextInt();

		if (input == number) {
			System.out.println("Number match!");
		} else {
			System.out.println("Number do not match!");
		}
		s.close();
	}

}