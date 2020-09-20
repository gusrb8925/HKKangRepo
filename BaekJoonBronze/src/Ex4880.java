import java.util.Scanner;

public class Ex4880 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			if (b - a == c - b) {
				System.out.println("AP " + (c + (b - a)));
			} else if (b / a == c / b) {
				System.out.println("GP " + (c * (b / a)));
			}
		}
		s.close();

	}

}
