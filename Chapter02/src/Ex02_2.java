
import java.util.Scanner;

public class Ex02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int result;
		int k;

		Scanner s = new Scanner(System.in);
		System.out.print("ù ��° ����� ���� �Է��ϼ��� ==>");
		a = s.nextInt();
		System.out.print("<1>���� <2>���� <3>���� <4>������ ==>");
		k = s.nextInt();
		System.out.print("�� ��° ����� ���� �Է��ϼ��� ==>");
		b = s.nextInt();

		if (k == 1) {
			result = a + b;
			System.out.println(a + "+" + b + "=" + result);
		}

		if (k == 2) {
			result = a - b;
			System.out.println(a + "-" + b + "=" + result);
		}
		if (k == 3) {
			result = a * b;
			System.out.println(a + "*" + b + "=" + result);
		}
		if (k == 4) {
			result = a / b;
			System.out.println(a + "/" + b + "=" + result);
		}
	}

}
