import java.util.Scanner;

public class JavaEx07_4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a;
		int b;
		String c;

		while (true) {
			System.out.printf("ù ��° ���� �Է�:\n");
			a = s.nextInt();
			System.out.printf("�� ��° ���� �Է�:\n");
			b = s.nextInt();
			System.out.printf("����� �����ڸ� �Է��ϼ���:\n");
			c = s.next();

			switch (c) {
			case "+":
				System.out.printf("%d + %d = %d\n", a, b, a + b);
				break;
			case "-":
				System.out.printf("%d - %d = %d\n", a, b, a - b);
				break;
			case "*":
				System.out.printf("%d * %d = %d\n", a, b, a * b);
				break;
			case "/":
				System.out.printf("%d / %d = %d\n", a, b, a / b);
				break;
			case "%":
				System.out.printf("%d % %d = %d\n", a, b, a % b);
				break;
			default:
				System.out.println("�����ڸ� �߸� �Է��߽��ϴ�.");
			}
		}
	}

}
