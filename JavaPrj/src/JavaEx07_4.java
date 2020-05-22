import java.util.Scanner;

public class JavaEx07_4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a;
		int b;
		String c;

		while (true) {
			System.out.printf("첫 번째 값을 입력하세요:\n");
			a = s.nextInt();
			System.out.printf("두 번째 값을 입력하세요:\n");
			b = s.nextInt();
			System.out.printf("연산자를 입력하세요:\n");
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
