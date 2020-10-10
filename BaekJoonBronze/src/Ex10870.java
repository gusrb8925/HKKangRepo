import java.util.Scanner;

public class Ex10870 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		System.out.println(func(a));
	}

	public static int func(int n) {
		if (n < 2) {
			return n;
		} else {
			return func(n - 1) + func(n - 2);
		}
	}
}
