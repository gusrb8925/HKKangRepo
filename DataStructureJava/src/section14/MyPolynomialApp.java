package section14;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제4-3장: 연결리스트와 Iterator
public class MyPolynomialApp {

	private Polynomial[] polys = new Polynomial[100];
	private int n = 0;
	private Scanner sc = new Scanner(System.in);

	public MyPolynomialApp() {

	}

	public void processCommand() {
		while (true) {
			System.out.println("$ ");
			String command = sc.next();
			if (command.equalsIgnoreCase("create")) {
				handleCreate();
			} else if (command.equalsIgnoreCase("add")) {
				handleAdd();
			} else if (command.equalsIgnoreCase("calc")) {
				handleCalc();
			} else if (command.equalsIgnoreCase("print")) {
				handlePrint();
			} else if (command.equalsIgnoreCase("exit")) {
				break;
			}
		}
		sc.close();
	}

	private void handlePrint() {
		char name = sc.next().charAt(0);
		int index = find(name);
		if (index < 0) {
			System.out.println("No find polys");
			return;
		}
		System.out.println(polys[index].toString());

	}

	private void handleCalc() {
		char name = sc.next().charAt(0);
		int x = sc.nextInt();
		int index = find(name);
		if (index < 0) {
			System.out.println("No find polys");
			return;
		}
		System.out.println(polys[index].calc(x));

	}

	private void handleAdd() {
		char name = sc.next().charAt(0);
		int coef = sc.nextInt();
		int expo = sc.nextInt();
		int index = find(name);
		if (index < 0) {
			System.out.println("No find polys");
			return;
		}
		polys[index].addTerm(coef, expo);
	}

	private int find(char name) {
		for (int i = 0; i < n; i++) {
			if (polys[i].name == name) {
				return i;
			}
		}
		return -1;
	}

	private void handleCreate() {
		char name = sc.next().charAt(0);
		Polynomial p = new Polynomial(name);
		polys[n++] = p;
	}

	public static void main(String[] args) {
		MyPolynomialApp app = new MyPolynomialApp();
		app.processCommand();
	}

}
