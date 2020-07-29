package section01;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-1장: 변수,배열,반복문 2
//

public class Code04 {

	public static void main(String[] args) {
		String name = "";
		int age;
		String gender;

		Scanner s = new Scanner(System.in);
		System.out.println("name,age,gender :");
		name = s.next();
		age = s.nextInt();
		gender = s.next();

		if (gender.equals("male")) {
			System.out.println(name + ", you're " + age + "years old man");
		} else if (gender.equals("female")) {
			System.out.println(name + ", you're " + age + "years old woman");
		} else {
			System.out.println("...?");
		}
		s.close();

	}

}