import java.util.Scanner;

public class Ex2444 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		s.close();

		for (int i = 1; i < a + 1; i++) {
			for (int j = 0; j < a - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < a - 1; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = a * 2 - 3; j > i * 2; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
