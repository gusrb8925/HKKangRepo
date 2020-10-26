import java.util.Scanner;

public class Ex11721 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();

		for (int i = 0; i < input.length(); ++i) {
			System.out.print(input.charAt(i));
			if (i % 10 == 9) {
				System.out.println();
			}
		}
		s.close();
	}
}