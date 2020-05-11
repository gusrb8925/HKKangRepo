import java.util.Scanner;

public class Ex1025 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b10000;
		int b1000;
		int b100;
		int b10;

		b10000 = a / 10000;
		a = a % 10000;

		b1000 = a / 1000;
		a = a % 1000;

		b100 = a / 100;
		a = a % 100;

		b10 = a / 10;
		a = a % 10;

		System.out.printf("[%d0000]\n", b10000);
		System.out.printf("[%d000]\n", b1000);
		System.out.printf("[%d00]\n", b100);
		System.out.printf("[%d0]\n", b10);
		System.out.printf("[%d]\n", a);

	}

}
