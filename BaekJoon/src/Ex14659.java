import java.util.Scanner;

public class Ex14659 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int[] ar = new int[a];

		for (int i = 0; i < a; i++) {
			ar[i] = s.nextInt();
		}

		int result = 0;
		for (int i = 0; i < a; i++) {
			int max = ar[i];
			int count = 0;
			for (int j = i + 1; j < a; j++) {
				if (ar[j] > max) {
					break;
				} else {
					count++;
				}
			}
			result = Math.max(result, count);
		}
		System.out.println(result);

	}

}
