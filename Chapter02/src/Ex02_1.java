
import java.util.Scanner;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int result;

		Scanner s = new Scanner(System.in);
		System.out.print("ù ��° ����� ���� �Է��ϼ��� ==>");
		a = s.nextInt();
		System.out.print("�� ��° ����� ���� �Է��ϼ��� ==>");
		b = s.nextInt();

		result = a + b;
		System.out.println(a + "+" + b + "=" + result);

		result = a - b;
		System.out.println(a + "-" + b + "=" + result);

		result = a * b;
		System.out.println(a + "*" + b + "=" + result);

		result = a / b;
		System.out.println(a + "/" + b + "=" + result);

	}

}
