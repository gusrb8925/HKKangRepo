import java.util.Scanner;

public class Ex4101 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int a = s.nextInt();
			int b = s.nextInt();
			if (a == 0 && b == 0) {
				break;
			}
			if (a > b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		s.close();

	}

}
