package section05;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-2장: 메서드와 생성자 2
// 다항식 만들기 create,add,calc,print,exit
//생성자 만들기
public class Code08 {

	static Polynomial3[] polys = new Polynomial3[100]; // 다항식의 배열, 참조변수들의 집합
	static int n = 0; // 다항식의 갯수

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("$ ");
			String command = sc.next();
			if (command.equalsIgnoreCase("create")) {
				char name = sc.next().charAt(0);
				polys[n] = new Polynomial3(name);
				n++;

			} else if (command.equalsIgnoreCase("add")) { // ex)add f 2 3
				char name = sc.next().charAt(0);
				int index = find(name); // 다항식을 찾는 함수
				if (index == -1) {
					System.out.println("No such polynomial exists.");
				} else {
					int c = sc.nextInt(); // 추가 하는 계수
					int e = sc.nextInt(); // 추가 하는 지수
					polys[index].addTerm(c, e); // 추가하는 메서드
				}

			} else if (command.equalsIgnoreCase("calc")) {
				char name = sc.next().charAt(0);
				int index = find(name); // 다항식을 찾는 함수
				if (index == -1) {
					System.out.println("No such polynomial exists.");
				} else {
					int x = sc.nextInt();
					int result = polys[index].calcPolynomial(x);
					System.out.println(result);
				}

			} else if (command.equalsIgnoreCase("print")) {
				char name = sc.next().charAt(0);
				int index = find(name); // 다항식을 찾는 함수
				if (index == -1) {
					System.out.println("No such polynomial exists.");
				} else {
					polys[index].printPolynomial();
				}

			} else if (command.equalsIgnoreCase("exit")) {
				break;
			}

		}
		sc.close();

	}

	private static int find(char name) {
		for (int i = 0; i < n; i++) {
			if (polys[i].name == name) {
				return i;
			}
		}
		return -1;
	}

}
