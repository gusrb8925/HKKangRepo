import java.util.Scanner;

public class Ex1065 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int count = 0;

		if (a < 100) {
			System.out.println(a);
		} else {
			count = 99;
			for (int i = 100; i <= a; i++) {
				int b = i / 100;
				int c = (i % 100) / 10;
				int d = i % 10;

				if (b - c == c - d) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
