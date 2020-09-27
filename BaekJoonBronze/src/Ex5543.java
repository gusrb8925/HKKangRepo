import java.util.Scanner;

public class Ex5543 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int bug = 2001;
		int drk = 2001;

		for (int i = 0; i < 3; i++) {
			int a = s.nextInt();
			if (a < bug) {
				bug = a;
			}
		}

		for (int i = 0; i < 2; i++) {
			int b = s.nextInt();
			if (b < drk) {
				drk = b;
			}
		}

		System.out.println(bug + drk - 50);
	}

}
