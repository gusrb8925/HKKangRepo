import java.util.Scanner;

public class Ex1091 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();
		long d = s.nextLong();

		for (int i = 1; i < d; i++) {
			a = a * b + c;
		}
		System.out.println(a);
	}

}
