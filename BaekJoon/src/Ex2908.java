import java.util.Scanner;

public class Ex2908 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[2];
		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < 2; i++) {
			int n = s.nextInt();
			a = n / 100;
			b = (n % 100) / 10;
			c = n % 10;
			num[i] = c * 100 + b * 10 + a;
		}
		int max = 1;
		for (int i = 0; i < 2; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);
	}

}
