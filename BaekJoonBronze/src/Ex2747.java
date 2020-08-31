import java.util.Scanner;

public class Ex2747 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		if (cnt == 1) {
			System.out.println(1);
		} else {
			for (int i = 1; i < cnt; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println(c);
		}
	}

}