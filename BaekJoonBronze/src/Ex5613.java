import java.util.*;

public class Ex5613 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int result = a;

		while (true) {

			String temp = s.next();
			if (temp.contentEquals("=")) {
				break;
			}
			int b = s.nextInt();

			if (temp.contentEquals("/")) {
				result = result / b;
			}
			if (temp.contentEquals("+")) {
				result = result + b;
			}
			if (temp.contentEquals("-")) {
				result = result - b;
			}
			if (temp.contentEquals("*")) {
				result = result * b;
			}

		}

		System.out.println(result);
	}
}
