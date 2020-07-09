import java.util.Scanner;

public class Ex10039 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int a = s.nextInt();
			if (a >= 40) {
				sum += a;
			} else {
				sum += 40;
			}
		}

		System.out.println(sum / 5);
	}

}
