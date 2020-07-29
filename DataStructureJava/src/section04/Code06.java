package section04;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-1장: 클래스, 객체, 참조변수 5
// 다항식 만들기 create,add,calc,print,exit
public class Code06 {

	static Polynomial[] polys = new Polynomial[100]; // 다항식의 배열, 참조변수들의 집합
	static int n = 0; // 다항식의 갯수

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("$ ");
			String command = sc.next();
			if (command.equalsIgnoreCase("create")) {
				char name = sc.next().charAt(0);
				polys[n] = new Polynomial();
				polys[n].name = name;
				polys[n].nTerms = 0;
				n++;

			} else if (command.equalsIgnoreCase("add")) { // ex)add f 2 3
				char name = sc.next().charAt(0);
				int index = find(name); // 다항식을 찾는 함수
				if (index == -1) {
					System.out.println("No such polynomial exists.");
				} else {
					int c = sc.nextInt(); // 추가 하는 계수
					int e = sc.nextInt(); // 추가 하는 지수
					addTerm(polys[index], c, e); // 추가하는 메서드
				}

			} else if (command.equalsIgnoreCase("calc")) {
				char name = sc.next().charAt(0);
				int index = find(name); // 다항식을 찾는 함수
				if (index == -1) {
					System.out.println("No such polynomial exists.");
				} else {
					int x = sc.nextInt();
					int result = calcPolynomial(polys[index], x);
					System.out.println(result);
				}

			} else if (command.equalsIgnoreCase("print")) {
				char name = sc.next().charAt(0);
				int index = find(name); // 다항식을 찾는 함수
				if (index == -1) {
					System.out.println("No such polynomial exists.");
				} else {
					printPolynomial(polys[index]);
				}

			} else if (command.equalsIgnoreCase("exit")) {
				break;
			}

		}
		sc.close();

	}

	private static int calcPolynomial(Polynomial p, int x) {
		int result = 0;
		for (int i = 0; i < p.nTerms; i++) {
			result += calcTerm(p.terms[i], x);
		}
		return result;
	}

	private static int calcTerm(Term term, int x) {
		return (int) (term.coef * Math.pow(x, term.expo));
	}

	private static void printPolynomial(Polynomial p) {
		for (int i = 0; i < p.nTerms; i++) {
			printTerm(p.terms[i]);
			System.out.print("+");
		}
		System.out.println();
	}

	private static void printTerm(Term term) {
		System.out.print(term.coef + "x^" + term.expo);

	}

	private static void addTerm(Polynomial p, int c, int e) {
		int index = findTerm(p, e); // 같은 항을 찾는 메서드
		if (index != -1) {
			p.terms[index].coef += c;
			// 계수가 0이 되면 처리하는 코드 필요.
		} else {
			int i = p.nTerms - 1;
			while (i >= 0 && p.terms[i].expo < e) {
				p.terms[i + 1] = p.terms[i];
				i--;
			}
			p.terms[i + 1] = new Term();
			p.terms[i + 1].coef = c;
			p.terms[i + 1].expo = e;
			p.nTerms++;

		}

	}

	private static int findTerm(Polynomial p, int e) {
		for (int i = 0; i < p.nTerms && p.terms[i].expo >= e; i++) {
			if (p.terms[i].expo == e) {
				return i;
			}
		}
		return -1;
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
