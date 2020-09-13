import java.util.Scanner;

public class Ex3052 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] ar = new int[10];
		int[] div = new int[42];
		int count = 0;

		for (int i = 0; i < 10; i++) {
			ar[i] = s.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			div[ar[i] %= 42]++;
		}

		for (int i = 0; i < 42; i++) {
			if (div[i] != 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
