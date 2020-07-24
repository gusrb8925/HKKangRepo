import java.util.Scanner;

public class Ex2523 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		s.close();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < a - 1; i++) {
			for (int j = a - 1 - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
