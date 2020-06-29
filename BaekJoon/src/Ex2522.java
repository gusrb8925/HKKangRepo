import java.util.Scanner;

public class Ex2522 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < a - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < a - 1 - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
