import java.util.Scanner;

public class Ex10990 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = a - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 - 1; k++) {
				if (k == 0 || k == i * 2 - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}