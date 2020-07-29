package section04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-1장: 클래스, 객체, 참조변수 2
//
public class Code02 {

	static Person1[] members = new Person1[100];
	static int n = 0;

	public static void main(String[] args) {
		// members = new Person1[100]; 여기서 배열을 생성하거나, 매서드 밖에서 생성
		try {
			Scanner in = new Scanner(new File("input.txt"));
			while (in.hasNext()) {
				String na = in.next();
				String num = in.next();

				members[n] = new Person1();// members[n]은 참조변수이지 이자체로 정보를 저장할수있는 객체가 아니다. 따라서 new로 객체를 생성해준다.
				members[n].name = na;
				members[n].number = num;
				n++;
			}

			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Not find");
		}

		for (int i = 0; i < n; i++) {
			System.out.println(members[i].name + " " + members[i].number);
		}
	}

}
