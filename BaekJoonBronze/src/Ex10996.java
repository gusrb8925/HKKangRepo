import java.util.Scanner;

public class Ex10996 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 1; i <= a * 2; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j <= a; j++) {
					if (j % 2 == 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			} else {
				for (int j = 1; j <= a; j++) {
					if (j % 2 == 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}

	}

}
