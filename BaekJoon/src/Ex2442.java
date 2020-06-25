import java.util.Scanner;

public class Ex2442 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 1; i < a + 1; i++) {
			for (int j = 0; j < a - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
