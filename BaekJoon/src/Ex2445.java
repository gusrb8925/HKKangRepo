import java.util.Scanner;

public class Ex2445 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < 2 * (a - i - 1); k++) {
				System.out.print(" ");
			}
			for (int l = 0; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < a - 1; i++) {
			for (int j = a - 1; j > i; j--) {
				System.out.print("*");
			}
			for (int k = 0; k < (i + 1) * 2; k++) {
				System.out.print(" ");
			}
			for (int l = a - 1; l > i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
