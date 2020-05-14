import java.util.Scanner;

public class Ex1051 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		if (a <= b) {
			System.out.printf("1");
		} else {
			System.out.printf("0");
		}

	}
}
