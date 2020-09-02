import java.util.Scanner;

public class Ex2846 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int prev = 0;
		int sum = 0;
		int current = s.nextInt();
		int result = 0;

		for (int i = 1; i < n; i++) {
			prev = current;
			current = s.nextInt();

			if (current - prev > 0) {
				sum += current - prev;
			} else {
				result = Math.max(result, sum);
				sum = 0;
			}
		}
		result = Math.max(result, sum);
		System.out.println(result);
		s.close();
	}
}
