import java.util.Scanner;

public class Ex10991 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = a - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 - 1; k++) {
				if (k == 0 || k == i * 2 - 2 || k % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}