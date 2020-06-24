import java.util.Scanner;

public class Ex1978 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int count = 0;
		int answer = 0;

		for (int i = 0; i < a; i++) {
			int b = s.nextInt();
			count = 0;

			for (int j = 1; j <= b; j++) {
				if (b % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				answer++;
			}

		}
		System.out.println(answer);
	}

}
