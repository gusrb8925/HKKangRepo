import java.util.Scanner;

public class Ex10995 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		s.close();

		for (int i = 1; i <= a; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j <= a * 2 - 1; j++) {
					if (j % 2 == 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			} else {
				for (int j = 1; j <= a * 2; j++) {
					if (j % 2 == 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}

		}
	}

}
