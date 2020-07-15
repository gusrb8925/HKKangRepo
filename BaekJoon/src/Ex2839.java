import java.util.Scanner;

public class Ex2839 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int count = 0;

		while (true) {
			if (a % 5 == 0) {
				System.out.println(a / 5 + count);
				break;
			} else if (a <= 0) {
				System.out.println(-1);
				break;
			}
			a = a - 3;
			count++;
		}
	}

}
