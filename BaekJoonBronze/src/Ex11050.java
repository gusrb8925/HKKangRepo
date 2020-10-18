import java.util.Scanner;

public class Ex11050 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(fac(a) / (fac(a - b) * fac(b)));
	}

	public static int fac(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fac(n - 1);
		}
	}

}
