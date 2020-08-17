import java.util.Scanner;

public class Ex1110 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		s.close();

		if (a < 10) {
			a *= 10;
		}
		int one = a / 10;
		int two = a % 10;
		int save;
		int count = 0;
		while (true) {
			count++;
			save = two;
			two = (one + two) % 10;
			one = save;
			if (a == ((one * 10) + two)) {
				break;
			}
		}
		System.out.println(count);
	}

}
