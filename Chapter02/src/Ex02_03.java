
import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		int result;

		Scanner s = new Scanner(System.in);
		System.out.print("ù ��° ����� ���� �Է��ϼ��� ==>");
		a = s.nextInt();
		System.out.print("�� ��° ����� ���� �Է��ϼ��� ==>");
		b = s.nextInt();
		System.out.print("�� ��° ����� ���� �Է��ϼ��� ==>");
		c = s.nextInt();
		System.out.print("�� ��° ����� ���� �Է��ϼ��� ==>");
		d = s.nextInt();

		result = a + b + c + d;
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);

	}

}
