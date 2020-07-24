import java.util.Scanner;

public class Ex2577 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		s.close();

		int sum = a * b * c;
		int[] ar = new int[10];
		while (sum > 0) {
			ar[sum % 10]++;
			sum /= 10;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(ar[i]);
		}
	}

}
