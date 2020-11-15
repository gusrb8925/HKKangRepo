import java.util.Scanner;

public class Ex1934 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();

		for (int i = 0; i < n; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(a * b / gcd(a, b));
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}

	}

}
