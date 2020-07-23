import java.util.Scanner;

public class Ex2446 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		s.close();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (a * 2 - 1) - (2 * i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < a - 1; i++) {
			for (int j = 0; j < a - 2 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 3 + (2 * i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}