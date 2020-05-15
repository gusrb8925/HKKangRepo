import java.util.Scanner;

public class JavaEx07_4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a;
		int b;
		String c;

		while (true) {
			System.out.printf("첫 번째 수를 입력:\n");
			a = s.nextInt();
			System.out.printf("두 번째 수를 입력:\n");
			b = s.nextInt();
			System.out.printf("계산할 연산자를 입력하세요:\n");
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
				System.out.println("연산자를 잘못 입력했습니다.");
			}
		}
	}

}
